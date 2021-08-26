package com.data.model.transaction;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OperatorBypassApprovalInfo {
	private String actionType;
	private ApprovalDateTime approvalDateTime;
	private String description;
	private String entryMethod;
	private String entryMethodLabel;
	private String inputData;
	private Object isApproved;
	private Object isDelayedApproval;
	private Operator operator;
	private String policyName;
	private String sequenceNumber;
}
