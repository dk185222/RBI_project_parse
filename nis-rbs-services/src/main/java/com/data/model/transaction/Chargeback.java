package com.data.model.transaction;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Chargeback {
	private ChargebackAmount chargebackAmount;
	private String chargebackId;
	private String type;
	private String typeLabel;
}
