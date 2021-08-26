package com.data.model.root;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TlogData {
	private BusinessDay businessDay;
	private CloseDateTimeUtc closeDateTimeUtc;
	private ConfigurationDateTimeUtc configurationDateTimeUtc;
	private CustomProperties customProperties;
	private String dataProviderName;
	private String dataProviderVersion;
	private DocumentExpirationDate documentExpirationDate;
	private String id;
	private Object isTrainingMode;
	private List<LinkedTransaction> linkedTransactions;
	private int modelVersion;
	private OpenDateTimeUtc openDateTimeUtc;
	private SiteInfo siteInfo;
	private Tlog tlog;
	private String touchPointGroup;
	private String touchPointId;
	private String touchPointType;
	private String transactionCategory;
	private String transactionNumber;
	private String transactionReason;
	private Boolean isUpdated;
	private int transactionVersion;
}
