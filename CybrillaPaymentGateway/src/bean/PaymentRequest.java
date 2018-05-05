package bean;

import java.util.Calendar;
import java.util.Date;

public class PaymentRequest {
	String bank_ifsc_code;
	String bank_account_number;
	double amount;
	String merchant_transaction_ref;
	Date transaction_date;
	String payment_gateway_merchant_reference;

	public PaymentRequest() {
		// TODO Auto-generated constructor stub
	}

	public PaymentRequest(String bank_ifsc_code, String bank_account_number, double amount, String merchant_transaction_ref,
			Date transaction_date, String payment_gateway_merchant_reference) {
		this.bank_ifsc_code = bank_ifsc_code;
		this.bank_account_number = bank_account_number;
		this.amount = amount;
		this.merchant_transaction_ref = merchant_transaction_ref;
		this.transaction_date = transaction_date;
		this.payment_gateway_merchant_reference = payment_gateway_merchant_reference;
	}

	public String getBank_ifsc_code() {
		return bank_ifsc_code;
	}

	public void setBank_ifsc_code(String bank_ifsc_code) {
		this.bank_ifsc_code = bank_ifsc_code;
	}

	public String getBank_account_number() {
		return bank_account_number;
	}

	public void setBank_account_number(String bank_account_number) {
		this.bank_account_number = bank_account_number;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
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
}
