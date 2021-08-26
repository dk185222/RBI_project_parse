package com.data.model.transaction;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaxExempt {
	private ExemptAmount exemptAmount;
	private String exemptHolderId;
	private String exemptHolderName;
	private String reasonCode;
}
