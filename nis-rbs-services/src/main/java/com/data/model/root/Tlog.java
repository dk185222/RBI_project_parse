package com.data.model.root;

import java.util.List;

import com.data.model.transaction.Coupon;
import com.data.model.transaction.CustomProperties;
import com.data.model.transaction.Customer;
import com.data.model.transaction.Employee;
import com.data.model.transaction.Item;
import com.data.model.transaction.LocalCurrency;
import com.data.model.transaction.Location;
import com.data.model.transaction.LoyaltyAccount;
import com.data.model.transaction.OperatorBypassApproval;
import com.data.model.transaction.Order;
import com.data.model.transaction.PharmacyDetails;
import com.data.model.transaction.ReceiptDeliveryInfo;
import com.data.model.transaction.ReceiptInfo;
import com.data.model.transaction.RevenueCenter;
import com.data.model.transaction.Surcharge;
import com.data.model.transaction.Tender;
import com.data.model.transaction.TotalTax;
import com.data.model.transaction.Totals;
import com.data.model.transaction.TransactionDiscount;
import com.data.model.transaction.TransactionPromotion;
import com.data.model.transaction.VoidInfo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Tlog {
	private String checkOutType;
	private String checkOutTypeLabel;
	private List<Coupon> coupons;
	private CustomProperties customProperties;
	private Customer customer;
	private int customerCount;
	private List<Employee> employees;
	private String groupId;
	private Object isDeleted;
	private Object isOpen;
	private Object isRecalled;
	private Object isResumed;
	private Object isSuspended;
	private Object isVoided;
	private List<Item> items;
	private LocalCurrency localCurrency;
	private Location location;
	private List<LoyaltyAccount> loyaltyAccount;
	private List<OperatorBypassApproval> operatorBypassApprovals;
	private List<Order> orders;
	private PharmacyDetails pharmacyDetails;
	private ReceiptDeliveryInfo receiptDeliveryInfo;
	private String receiptId;
	private ReceiptInfo receiptInfo;
	private RevenueCenter revenueCenter;
	private List<Surcharge> surcharges;
	private String suspendedReason;
	private String suspendedReasonLabel;
	private List<Tender> tenders;
	private List<TotalTax> totalTaxes;
	private Totals totals;
	private List<TransactionDiscount> transactionDiscounts;
	private List<TransactionPromotion> transactionPromotions;
	private String transactionType;
	private VoidInfo voidInfo;
}
