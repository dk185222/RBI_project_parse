package com.data.model.transaction;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order {
	private String orderChannel;
	private String orderChannelLabel;
	private OrderMode orderMode;
	private String orderNumber;
	private String orderSource;
}
