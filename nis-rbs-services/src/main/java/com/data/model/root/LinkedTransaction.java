package com.data.model.root;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LinkedTransaction {
	private BusinessDate businessDate;
	private String reasonCode;
	private String reasonCodeLabel;
	private String transactionId;
}
