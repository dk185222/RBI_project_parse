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
public class Surcharge {
	private Amount amount;
	private AmountUncollected amountUncollected;
	private String id;
	private Object isAutoApplied;
	private Object isRefund;
	private Object isVoided;
	private String name;
	private String surchargePriceType;
	private List<SurchargeTax> surchargeTaxes;
	private String surchargeType;
	private String surchargeTypeLabel;
	private VoidInfo voidInfo;
}
