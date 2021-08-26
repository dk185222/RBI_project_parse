package com.data.model.transaction;

import java.util.List;

import com.data.model.root.CustomProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Item {
	private ActualAmount actualAmount;
	private ActualUnitPrice actualUnitPrice;
	private BeginDateTimeUtc beginDateTimeUtc;
	private String catalogItemCode;
	private Category category;
	private String conceptId;
	private CustomProperties customProperties;
	private String departmentId;
	private Employee employee;
	private EndDateTimeUtc endDateTimeUtc;
	private String entryMethod;
	private String entryMethodLabel;
	private ExtendedAmount extendedAmount;
	private ExtendedUnitPrice extendedUnitPrice;
	private FuelSaleInfo fuelSaleInfo;
	private String id;
	private String inputIdentifierData;
	private InventoryQuantity inventoryQuantity;
	private Object isInventoryAffectedByReturn;
	private Object isItemNotOnFile;
	private Object isNonSaleItem;
	private Object isOverridden;
	private Object isPriceLookUp;
	private Object isRefused;
	private Object isReturn;
	private Object isVoided;
	private Object isWeighted;
	private List<ItemDiscount> itemDiscounts;
	private String itemLinkType;
	private String itemLinkTypeLabel;
	private ItemPharmacyInfo itemPharmacyInfo;
	private List<ItemPromotion> itemPromotions;
	private String itemSellType;
	private String itemSellTypeLabel;
	private List<ItemTax> itemTaxes;
	private OperatorBypassApprovalInfo operatorBypassApprovalInfo;
	private List<OperatorBypassApproval> operatorBypassApprovals;
	private String orderNumber;
	private OverrideInfo overrideInfo;
	private String parentItemId;
	private String productId;
	private String productName;
	private Quantity quantity;
	private RefusalInfo refusalInfo;
	private RegularUnitPrice regularUnitPrice;
	private ReturnInfo returnInfo;
	private RevenueCenter revenueCenter;
	private List<Surcharge> surcharges;
	private TareWeight tareWeight;
	private List<Variation> variations;
	private VoidInfo voidInfo;
	private WicInfo wicInfo;
}
