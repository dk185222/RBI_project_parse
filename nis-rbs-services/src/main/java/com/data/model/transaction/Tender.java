package com.data.model.transaction;

import java.util.List;

import com.data.model.root.CustomProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Tender {
	private String authorizationCode;
	private String authorizationCodeLabel;
	private AuthorizationResponseTime authorizationResponseTime;
	private String cardLastFourDigits;
	private String cashDrawerId;
	private CheckInfo checkInfo;
	private String couponId;
	private Currency currency;
	private CustomProperties customProperties;
	private String customerPaymentId;
	private Employee employee;
	private ExchangeRate exchangeRate;
	private String id;
	private Object isVoided;
	private int lineNumber;
	private String maskedCardNumber;
	private String name;
	private String nameOnCard;
	private List<OperatorBypassApproval> operatorBypassApprovals;
	private OriginalAmount originalAmount;
	private OriginalTenderInfo originalTenderInfo;
	private OverpaymentAmount overpaymentAmount;
	private String promotionId;
	private SmartWIC smartWIC;
	private List<Surcharge> surcharges;
	private TenderAmount tenderAmount;
	private TenderAuthorization tenderAuthorization;
	private TenderEndDateTime tenderEndDateTime;
	private int tenderLink;
	private TipAmount tipAmount;
	private TipReductionAmount tipReductionAmount;
	private String type;
	private String typeLabel;
	private String usage;
	private VoidInfo voidInfo;
}
