package bean;

import java.util.Date;

public class PaymentResponse {
	String txn_status;
	Double amount;
	String merchant_transaction_ref;
	Date transaction_date;
	String payment_gateway_merchant_reference;
	String payment_gateway_transaction_reference;

	public PaymentResponse() {
		// TODO Auto-generated constructor stub
	}

	public PaymentResponse(String str) {
		/*
		 * this.txn_status = txn_status; this.amount = amount;
		 * this.merchant_transaction_ref = merchant_transaction_ref;
		 * this.transaction_date = transaction_date;
		 * this.payment_gateway_merchant_reference = payment_gateway_merchant_reference;
		 * this.payment_gateway_transaction_reference =
		 * payment_gateway_transaction_reference;
		 */
	}

	public PaymentResponse(String txn_status, Double amount, String merchant_transaction_ref, Date transaction_date,
			String payment_gateway_merchant_reference, String payment_gateway_transaction_reference) {
		this.txn_status = txn_status;
		this.amount = amount;
		this.merchant_transaction_ref = merchant_transaction_ref;
		this.transaction_date = transaction_date;
		this.payment_gateway_merchant_reference = payment_gateway_merchant_reference;
		this.payment_gateway_transaction_reference = payment_gateway_transaction_reference;
	}

	public String getTxn_status() {
		return txn_status;
	}

	public void setTxn_status(String txn_status) {
		this.txn_status = txn_status;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getMerchant_transaction_ref() {
		return merchant_transaction_ref;
	}

	public void setMerchant_transaction_ref(String merchant_transaction_ref) {
		this.merchant_transaction_ref = merchant_transaction_ref;
	}

	public Date getTransaction_date() {
		return transaction_date;
	}

	public void setTransaction_date(Date transaction_date) {
		this.transaction_date = transaction_date;
	}

	public String getPayment_gateway_merchant_reference() {
		return payment_gateway_merchant_reference;
	}

	public void setPayment_gateway_merchant_reference(String payment_gateway_merchant_reference) {
		this.payment_gateway_merchant_reference = payment_gateway_merchant_reference;
	}

	public String getPayment_gateway_transaction_reference() {
		return payment_gateway_transaction_reference;
	}

	public void setPayment_gateway_transaction_reference(String payment_gateway_transaction_reference) {
		this.payment_gateway_transaction_reference = payment_gateway_transaction_reference;
	}

}
