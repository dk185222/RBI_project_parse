package com.data.model.transaction;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UnitPriceQuantity {
	private String entryMethod;
	private String entryMethodLabel;
	private double quantity;
	private String unitOfMeasurement;
	private String unitOfMeasurementLabel;
}
