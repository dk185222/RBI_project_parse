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
public class Coupon {
	private Amount amount;
	private String description;
	private String entryMethod;
	private String entryMethodLabel;
	private String id;
	private Object isVoided;
	private String issueMethod;
	private String issueMethodLabel;
	private List<String> participatingItems;
	private int quantity;
	private String type;
	private String typeLabel;
	private VoidInfo voidInfo;
}
