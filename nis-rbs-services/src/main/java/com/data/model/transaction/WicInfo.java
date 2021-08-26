package com.data.model.transaction;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WicInfo {
	private NotToExceedAmount notToExceedAmount;
	private NotToExceedLostAmount notToExceedLostAmount;
}
