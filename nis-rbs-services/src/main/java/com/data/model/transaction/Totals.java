package com.data.model.transaction;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Totals {
	private CustomProperties customProperties;
	private DiscountAmount discountAmount;
	private GrandAmount grandAmount;
	private GrossAmount grossAmount;
	private GrossReturnsAmount grossReturnsAmount;
	private NetAmount netAmount;
	private ReturnItemsTaxExclusive returnItemsTaxExclusive;
	private ReturnItemsTaxInclusive returnItemsTaxInclusive;
	private TaxExclusive taxExclusive;
	private TaxExemptAmount taxExemptAmount;
	private TaxInclusive taxInclusive;
	private VoidsAmount voidsAmount;
	private WicInfo wicInfo;
}
