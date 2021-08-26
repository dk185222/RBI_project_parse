package com.data.model.transaction;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransactionPromotion {
	private Amount amount;
	private String couponId;
	private String id;
	private String internalId;
	private String message;
	private String name;
	private int percentage;
	private int points;
	private String rewardType;
}
