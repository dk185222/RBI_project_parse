package com.data.model.transaction;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReceiptDeliveryInfo {
	private String email;
	private Object isEmail;
	private Object isPrinter;
	private Object isSms;
	private String sms;
}
