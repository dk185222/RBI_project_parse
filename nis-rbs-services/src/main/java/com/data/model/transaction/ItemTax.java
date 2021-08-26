package com.data.model.transaction;

import com.data.model.root.CustomProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ItemTax {
	private Amount amount;
	private CustomProperties customProperties;
	private String id;
	private Object isRefund;
	private Object isVoided;
	private String name;
	private String sequenceNumber;
	private String taxAuthority;
	private TaxExempt taxExempt;
	private double taxPercent;
	private String taxSaleTypeCode;
	private String taxSaleTypeCodeLabel;
	private String taxType;
	private String taxTypeCode;
	private String taxTypeCodeLabel;
	private String taxTypeLabel;
	private TaxableAmount taxableAmount;
}
