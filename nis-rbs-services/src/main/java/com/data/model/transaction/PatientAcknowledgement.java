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
public class PatientAcknowledgement {
	private List<Acknowledgement> acknowledgements;
	private String patientId;
	private String signature;
	private String signatureContentType;
}
