package com.data.model.transaction;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ListOfWICItem {
	private String categoryCode;
	private int claimPrice;
	private String itemCode;
	private int itemCodeLength;
	private ItemDiscountAmount itemDiscountAmount;
	private int purchasedQuantity;
	private int purchasedUnits;
	private String subCategoryCode;
}
