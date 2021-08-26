package com.data.model.transaction;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TenderAuthorization {
	private String authorizationCodeNumber;
	private AuthorizationDateTime authorizationDateTime;
	private String authorizationType;
	private String cardTypeId;
	private Object isElectronicSignature;
	private Object isSignatureRequired;
	private Object isVerifiedByPIN;
	private String originalCardTypeId;
	private PaymentProvider paymentProvider;
	private String referenceNumber;
	private RequestedAmount requestedAmount;
	private String signature;
	private String signatureContentType;
}
