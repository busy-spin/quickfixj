/* Generated Java Source File */
/*******************************************************************************
 * Copyright (c) quickfixengine.org  All rights reserved.
 *
 * This file is part of the QuickFIX FIX Engine
 *
 * This file may be distributed under the terms of the quickfixengine.org
 * license as defined by quickfixengine.org and appearing in the file
 * LICENSE included in the packaging of this file.
 *
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING
 * THE WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE.
 *
 * See http://www.quickfixengine.org/LICENSE for licensing information.
 *
 * Contact ask@quickfixengine.org if any conditions of this licensing
 * are not clear to you.
 ******************************************************************************/

package org.quickfixj.cracker;

import quickfix.FieldNotFound;
import quickfix.IncorrectTagValue;
import quickfix.Message;
import quickfix.SessionID;
import quickfix.UnsupportedMessageType;
import quickfix.field.MsgType;
import quickfix.fix44.Advertisement;
import quickfix.fix44.AllocationInstruction;
import quickfix.fix44.AllocationInstructionAck;
import quickfix.fix44.AllocationReport;
import quickfix.fix44.AllocationReportAck;
import quickfix.fix44.AssignmentReport;
import quickfix.fix44.BidRequest;
import quickfix.fix44.BidResponse;
import quickfix.fix44.BusinessMessageReject;
import quickfix.fix44.CollateralAssignment;
import quickfix.fix44.CollateralInquiry;
import quickfix.fix44.CollateralInquiryAck;
import quickfix.fix44.CollateralReport;
import quickfix.fix44.CollateralRequest;
import quickfix.fix44.CollateralResponse;
import quickfix.fix44.Confirmation;
import quickfix.fix44.ConfirmationAck;
import quickfix.fix44.ConfirmationRequest;
import quickfix.fix44.CrossOrderCancelReplaceRequest;
import quickfix.fix44.CrossOrderCancelRequest;
import quickfix.fix44.DerivativeSecurityList;
import quickfix.fix44.DerivativeSecurityListRequest;
import quickfix.fix44.DontKnowTrade;
import quickfix.fix44.Email;
import quickfix.fix44.ExecutionReport;
import quickfix.fix44.Heartbeat;
import quickfix.fix44.IndicationOfInterest;
import quickfix.fix44.ListCancelRequest;
import quickfix.fix44.ListExecute;
import quickfix.fix44.ListStatus;
import quickfix.fix44.ListStatusRequest;
import quickfix.fix44.ListStrikePrice;
import quickfix.fix44.Logon;
import quickfix.fix44.Logout;
import quickfix.fix44.MarketDataIncrementalRefresh;
import quickfix.fix44.MarketDataRequest;
import quickfix.fix44.MarketDataRequestReject;
import quickfix.fix44.MarketDataSnapshotFullRefresh;
import quickfix.fix44.MassQuote;
import quickfix.fix44.MassQuoteAcknowledgement;
import quickfix.fix44.MultilegOrderCancelReplaceRequest;
import quickfix.fix44.NetworkStatusRequest;
import quickfix.fix44.NetworkStatusResponse;
import quickfix.fix44.NewOrderCross;
import quickfix.fix44.NewOrderList;
import quickfix.fix44.NewOrderMultileg;
import quickfix.fix44.NewOrderSingle;
import quickfix.fix44.News;
import quickfix.fix44.OrderCancelReject;
import quickfix.fix44.OrderCancelReplaceRequest;
import quickfix.fix44.OrderCancelRequest;
import quickfix.fix44.OrderMassCancelReport;
import quickfix.fix44.OrderMassCancelRequest;
import quickfix.fix44.OrderMassStatusRequest;
import quickfix.fix44.OrderStatusRequest;
import quickfix.fix44.PositionMaintenanceReport;
import quickfix.fix44.PositionMaintenanceRequest;
import quickfix.fix44.PositionReport;
import quickfix.fix44.Quote;
import quickfix.fix44.QuoteCancel;
import quickfix.fix44.QuoteRequest;
import quickfix.fix44.QuoteRequestReject;
import quickfix.fix44.QuoteResponse;
import quickfix.fix44.QuoteStatusReport;
import quickfix.fix44.QuoteStatusRequest;
import quickfix.fix44.RFQRequest;
import quickfix.fix44.RegistrationInstructions;
import quickfix.fix44.RegistrationInstructionsResponse;
import quickfix.fix44.Reject;
import quickfix.fix44.RequestForPositions;
import quickfix.fix44.RequestForPositionsAck;
import quickfix.fix44.ResendRequest;
import quickfix.fix44.SecurityDefinition;
import quickfix.fix44.SecurityDefinitionRequest;
import quickfix.fix44.SecurityList;
import quickfix.fix44.SecurityListRequest;
import quickfix.fix44.SecurityStatusRequest;
import quickfix.fix44.SecurityTypeRequest;
import quickfix.fix44.SecurityTypes;
import quickfix.fix44.SequenceReset;
import quickfix.fix44.SettlementInstructionRequest;
import quickfix.fix44.SettlementInstructions;
import quickfix.fix44.TestRequest;
import quickfix.fix44.TradeCaptureReport;
import quickfix.fix44.TradeCaptureReportAck;
import quickfix.fix44.TradeCaptureReportRequest;
import quickfix.fix44.TradeCaptureReportRequestAck;
import quickfix.fix44.TradingSessionStatus;
import quickfix.fix44.TradingSessionStatusRequest;
import quickfix.fix44.UserRequest;
import quickfix.fix44.UserResponse;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class MessageCracker {

	private final HashMap<String, BiConsumer<quickfix.fix44.Message, SessionID>> methodRegistry;

	public MessageCracker() {
		methodRegistry = new HashMap<>();
		methodRegistry.put(MsgType.EXECUTION_REPORT, this::handleExecutionReport);
	}

	/**
	 * Callback for quickfix.Message message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(Message message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}

	/**
	 * Callback for FIXHeartbeat message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(Heartbeat message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
	}
	
	/**
	 * Callback for FIXLogon message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(Logon message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
	}
	
	/**
	 * Callback for FIXTestRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(TestRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
	}
	
	/**
	 * Callback for FIXResendRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(ResendRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
	}
	
	/**
	 * Callback for FIXReject message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(Reject message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
	}
	
	/**
	 * Callback for FIXSequenceReset message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(SequenceReset message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
	}
	
	/**
	 * Callback for FIXLogout message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(Logout message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
	}
	
	/**
	 * Callback for FIXBusinessMessageReject message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(BusinessMessageReject message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
	}
	
	/**
	 * Callback for FIXUserRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(UserRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXUserResponse message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(UserResponse message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXAdvertisement message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(Advertisement message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXIndicationOfInterest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(IndicationOfInterest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXNews message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(News message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXEmail message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(Email message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXQuoteRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(QuoteRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXQuoteResponse message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(QuoteResponse message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXQuoteRequestReject message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(QuoteRequestReject message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXRFQRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(RFQRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXQuote message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(Quote message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXQuoteCancel message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(QuoteCancel message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXQuoteStatusRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(QuoteStatusRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXQuoteStatusReport message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(QuoteStatusReport message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXMassQuote message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(MassQuote message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXMassQuoteAcknowledgement message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(MassQuoteAcknowledgement message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXMarketDataRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(MarketDataRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXMarketDataSnapshotFullRefresh message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(MarketDataSnapshotFullRefresh message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXMarketDataIncrementalRefresh message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(MarketDataIncrementalRefresh message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXMarketDataRequestReject message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(MarketDataRequestReject message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXSecurityDefinitionRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(SecurityDefinitionRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXSecurityDefinition message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(SecurityDefinition message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXSecurityTypeRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(SecurityTypeRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXSecurityTypes message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(SecurityTypes message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXSecurityListRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(SecurityListRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXSecurityList message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(SecurityList message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXDerivativeSecurityListRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(DerivativeSecurityListRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXDerivativeSecurityList message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(DerivativeSecurityList message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXSecurityStatusRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(SecurityStatusRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXSecurityStatus message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(quickfix.fix44.SecurityStatus message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXTradingSessionStatusRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(TradingSessionStatusRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXTradingSessionStatus message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(TradingSessionStatus message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXNewOrderSingle message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(NewOrderSingle message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXExecutionReport message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(ExecutionReport message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXDontKnowTrade message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(DontKnowTrade message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXOrderCancelReplaceRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(OrderCancelReplaceRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXOrderCancelRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(OrderCancelRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXOrderCancelReject message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(OrderCancelReject message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXOrderStatusRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(OrderStatusRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXOrderMassCancelRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(OrderMassCancelRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXOrderMassCancelReport message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(OrderMassCancelReport message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXOrderMassStatusRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(OrderMassStatusRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXNewOrderCross message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(NewOrderCross message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXCrossOrderCancelReplaceRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(CrossOrderCancelReplaceRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXCrossOrderCancelRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(CrossOrderCancelRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXNewOrderMultileg message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(NewOrderMultileg message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXMultilegOrderCancelReplaceRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(MultilegOrderCancelReplaceRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXBidRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(BidRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXBidResponse message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(BidResponse message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXNewOrderList message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(NewOrderList message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXListStrikePrice message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(ListStrikePrice message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXListStatus message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(ListStatus message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXListExecute message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(ListExecute message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXListCancelRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(ListCancelRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXListStatusRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(ListStatusRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXAllocationInstruction message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(AllocationInstruction message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXAllocationInstructionAck message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(AllocationInstructionAck message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXAllocationReport message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(AllocationReport message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXAllocationReportAck message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(AllocationReportAck message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXConfirmation message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(Confirmation message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXConfirmationAck message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(ConfirmationAck message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXConfirmationRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(ConfirmationRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXSettlementInstructions message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(SettlementInstructions message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXSettlementInstructionRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(SettlementInstructionRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXTradeCaptureReportRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(TradeCaptureReportRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXTradeCaptureReportRequestAck message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(TradeCaptureReportRequestAck message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXTradeCaptureReport message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(TradeCaptureReport message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXTradeCaptureReportAck message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(TradeCaptureReportAck message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXRegistrationInstructions message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(RegistrationInstructions message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXRegistrationInstructionsResponse message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(RegistrationInstructionsResponse message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXPositionMaintenanceRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(PositionMaintenanceRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXPositionMaintenanceReport message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(PositionMaintenanceReport message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXRequestForPositions message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(RequestForPositions message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXRequestForPositionsAck message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(RequestForPositionsAck message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXPositionReport message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(PositionReport message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXAssignmentReport message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(AssignmentReport message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXCollateralRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(CollateralRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXCollateralAssignment message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(CollateralAssignment message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXCollateralResponse message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(CollateralResponse message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXCollateralReport message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(CollateralReport message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXCollateralInquiry message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(CollateralInquiry message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXNetworkStatusRequest message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(NetworkStatusRequest message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXNetworkStatusResponse message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(NetworkStatusResponse message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	/**
	 * Callback for FIXCollateralInquiryAck message.
	 *
	 * @param message
	 * @param sessionID
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void onMessage(CollateralInquiryAck message, SessionID sessionID) throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		throw new UnsupportedMessageType();
	}
	
	public void crack(Message message, SessionID sessionID)
			throws UnsupportedMessageType, FieldNotFound, IncorrectTagValue {
		crack44((quickfix.fix44.Message) message, sessionID);
	}

	/**
	 * Cracker method for 44 messages.
	 *
	 * @throws FieldNotFound
	 * @throws UnsupportedMessageType
	 * @throws IncorrectTagValue
	 */
	public void crack44(quickfix.fix44.Message message, SessionID sessionID)
			throws UnsupportedMessageType, FieldNotFound, IncorrectTagValue {

		String type = message.getHeader().getString(MsgType.FIELD);
		methodRegistry.get(type).accept(message, sessionID);
	}

	private void handleExecutionReport(quickfix.fix44.Message msg, SessionID session) {
		try {
			this.onMessage((ExecutionReport) msg, session);
		} catch (FieldNotFound | UnsupportedMessageType | IncorrectTagValue e) {
			throw new RuntimeException(e);
		}
	}
}
