package com.data.model.transaction;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	private Birthdate birthdate;
	private String customerType;
	private String customerTypeLabel;
	private String email;
	private String entryMethod;
	private String entryMethodLabel;
	private String id;
	private String identifierData;
	private String infoValidationMeans;
	private String infoValidationMeansLabel;
	private String name;
	private String phoneNumber;
	private PostalAddress postalAddress;
	private Vehicle vehicle;
}
