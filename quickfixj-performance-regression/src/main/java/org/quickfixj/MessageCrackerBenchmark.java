package org.quickfixj;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.quickfixj.cracker.MessageCracker;
import quickfix.Application;
import quickfix.ConfigError;
import quickfix.DataDictionary;
import quickfix.DoNotSend;
import quickfix.FieldNotFound;
import quickfix.IncorrectDataFormat;
import quickfix.IncorrectTagValue;
import quickfix.InvalidMessage;
import quickfix.Message;
import quickfix.RejectLogon;
import quickfix.SessionID;
import quickfix.UnsupportedMessageType;
import quickfix.fix44.ExecutionReport;

@Fork( 1 )
@State( Scope.Benchmark )
@Warmup( iterations = 3, time = 3)
@Measurement( iterations = 5, time = 3)
public class MessageCrackerBenchmark {

    private SampleFixApplication sampleFixApplication = new SampleFixApplication();
    private SampleFixApplication2 sampleFixApplication2 = new SampleFixApplication2();
    private SessionID sessionID = null;
    private quickfix.fix44.ExecutionReport executionReport = null;

    public static void main( String[] args ) throws Exception {
        Options opt = new OptionsBuilder()
                .shouldDoGC( true )
                .include( MessageCrackerBenchmark.class.getSimpleName() )
                .build();
        new Runner(opt).run();
    }

    @Setup
    public void setUp() throws ConfigError, InvalidMessage {
        String data = "8=FIX.4.4\0019=309\00135=8\00149=ASX\00156=CL1_FIX44\00134=4\001" +
                "52=20060324-01:05:58\00117=X-B-WOW-1494E9A0:58BD3F9D-1109\001150=D\001" +
                "39=0\00111=184271\00138=200\001198=1494E9A0:58BD3F9D\001526=4324\001" +
                "37=B-WOW-1494E9A0:58BD3F9D\00155=WOW\00154=1\001151=200\00114=0\00140=2\001" +
                "44=15\00159=1\0016=0\001453=3\001448=AAA35791\001447=D\001452=3\001448=8\001" +
                "447=D\001452=4\001448=FIX11\001447=D\001452=36\00160=20060320-03:34:29\00110=169\001";

        sessionID = new SessionID("FIX4.4", "CL1_FIX44", "ASX");
        executionReport = new quickfix.fix44.ExecutionReport();
        DataDictionary dataDictionary = new DataDictionary(MessageCrackerBenchmark.class.getClassLoader()
                .getResourceAsStream("FIX44.xml"));
        executionReport.fromString(data, dataDictionary, false);
    }

    @Benchmark
    public void benchmarkCrackingGenerated() throws Exception {
        sampleFixApplication.fromApp(executionReport, sessionID);
    }

    @Benchmark
    public void benchmarkCrackingWithHashMap() throws Exception {
        sampleFixApplication2.fromApp(executionReport, sessionID);
    }


    public static class SampleFixApplication extends quickfix.fix44.MessageCracker implements Application {

        @Override
        public void onCreate(SessionID sessionId) {

        }

        @Override
        public void onLogon(SessionID sessionId) {

        }

        @Override
        public void onLogout(SessionID sessionId) {

        }

        @Override
        public void toAdmin(Message message, SessionID sessionId) {

        }

        @Override
        public void fromAdmin(Message message, SessionID sessionId) throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, RejectLogon {

        }

        @Override
        public void toApp(Message message, SessionID sessionId) throws DoNotSend {

        }

        @Override
        public void fromApp(Message message, SessionID sessionId) throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType {
            crack(message, sessionId);
        }

        @Override
        public void onMessage(ExecutionReport message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
            // do nothing
        }
    }

    public static class SampleFixApplication2 extends MessageCracker implements Application {

        @Override
        public void onCreate(SessionID sessionId) {

        }

        @Override
        public void onLogon(SessionID sessionId) {

        }

        @Override
        public void onLogout(SessionID sessionId) {

        }

        @Override
        public void toAdmin(Message message, SessionID sessionId) {

        }

        @Override
        public void fromAdmin(Message message, SessionID sessionId) throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, RejectLogon {

        }

        @Override
        public void toApp(Message message, SessionID sessionId) throws DoNotSend {

        }

        @Override
        public void fromApp(Message message, SessionID sessionId) throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType {
            crack(message, sessionId);
        }

        @Override
        public void onMessage(ExecutionReport message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
            // do nothing
        }
    }

}
