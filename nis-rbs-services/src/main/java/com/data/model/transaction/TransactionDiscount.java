package com.data.model.transaction;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDiscount {
	private Amount amount;
	private AppliedDateTimeUtc appliedDateTimeUtc;
	private ApprovedByEmployee approvedByEmployee;
	private List<Chargeback> chargebacks;
	private String couponId;
	private CustomProperties customProperties;
	private DiscountApprovalInfo discountApprovalInfo;
	private String discountReason;
	private String discountType;
	private String discountTypeLabel;
	private String id;
	private String internalId;
	private Object isTaxable;
	private Object isVoided;
	private String loyaltyAccountInfoId;
	private String name;
	private int pointsRedeemed;
	private VoidInfo voidInfo;
}
