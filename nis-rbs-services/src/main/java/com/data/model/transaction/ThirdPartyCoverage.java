package com.data.model.transaction;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ThirdPartyCoverage {
	private ThirdPartyCoverageAmount thirdPartyCoverageAmount;
	private ThirdPartyCoverageTaxAmount thirdPartyCoverageTaxAmount;
	private String thirdPartyId;
}
