package com.data.model.transaction;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ItemPharmacyInfo {
	private String fillNumber;
	private Object isRejected;
	private String partialFillNumber;
	private String patientId;
	private String priceSource;
	private List<PromptAcknowledgment> promptAcknowledgments;
	private RejectedInfo rejectedInfo;
	private String rxNumber;
	private String sellMode;
	private List<ThirdPartyCoverage> thirdPartyCoverages;
}
