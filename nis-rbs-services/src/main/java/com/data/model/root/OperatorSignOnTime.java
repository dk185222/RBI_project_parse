/*
 * File Name            :    OperatorSignOnTime.java com.data.model.root
 * Project Title        :    nis-rbs-services
 * Copyright            :    Copyright (c) 2018-2019 NCR Corporation
 * Author               :    dk185222
 * Date					:	 Aug 26, 2021
 *
 */
package com.data.model.root;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * OperatorSignOnTime.java
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OperatorSignOnTime {
	private String originalOffset;
	private String dateTime;
}
