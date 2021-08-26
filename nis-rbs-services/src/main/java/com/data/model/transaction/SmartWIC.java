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
public class SmartWIC {
	private String benefitIssuingEntity;
	private String cardAcceptorTerminalID;
	private String cardSignature;
	private double discountAmount;
	private String epsresponseCode;
	private FirstDateToSpend firstDateToSpend;
	private List<ListOfWICItem> listOfWICItems;
	private String systemTraceAuditNumber;
	private String wiccardNumber;
}
