package com.data.model.transaction;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FuelSaleInfo {
	private String controllerSequenceNumber;
	private EndFuelingDateTimeUtc endFuelingDateTimeUtc;
	private String fuelShiftId;
	private String fuelingPointId;
	private String gradeId;
	private String nozzleId;
	private String priceType;
	private String priceTypeLabel;
	private String serviceType;
	private String serviceTypeLabel;
	private StartFuelingDateTimeUtc startFuelingDateTimeUtc;
	private String tankId;
	private String type;
}
