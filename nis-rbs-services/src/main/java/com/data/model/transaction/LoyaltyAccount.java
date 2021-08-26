package com.data.model.transaction;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoyaltyAccount {
	private String accountId;
	private String accountName;
	private String id;
	private double pointsAwarded;
	private double pointsRedeemed;
	private String programId;
	private String programType;
	private String providerId;
}
