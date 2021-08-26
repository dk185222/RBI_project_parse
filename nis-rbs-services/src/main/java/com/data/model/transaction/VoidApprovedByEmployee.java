package com.data.model.transaction;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VoidApprovedByEmployee {
	private String action;
	private String actionLabel;
	private String authenticationMethod;
	private CustomProperties customProperties;
	private String id;
	private Object isTippableEmployee;
	private String name;
	private String roleId;
	private String roleName;
	private String shiftId;
}
