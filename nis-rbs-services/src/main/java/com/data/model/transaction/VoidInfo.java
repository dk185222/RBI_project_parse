package com.data.model.transaction;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VoidInfo {
	private Object isAuto;
	private Object isCostImpacted;
	private ItemVoidTime itemVoidTime;
	private VoidApprovedByEmployee voidApprovedByEmployee;
	private String voidReason;
	private VoidedByEmployee voidedByEmployee;
}
