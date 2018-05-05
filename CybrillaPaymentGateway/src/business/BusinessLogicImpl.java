package business;

import java.security.MessageDigest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

import bean.PaymentRequest;
import bean.PaymentResponse;

public class BusinessLogicImpl implements BusinessLogic {

	// Method to generate String from the PaymentRequest object
	@Override
	public String generatePaymentString(PaymentRequest payment) {

		return "bank_ifsc_code=" + payment.getBank_ifsc_code() + "|" + "bank_account_number="
				+ payment.getBank_account_number() + "|" + "amount=" + payment.getAmount() + "|"
				+ "merchant_transaction_ref=" + payment.getMerchant_transaction_ref() + "|" + "transaction_date="
				+ formatDate(payment.getTransaction_date()) + "|" + "payment_gateway_merchant_reference="
				+ payment.getPayment_gateway_merchant_reference();
	}

	// Method to format Date in yyyy/MM/dd format
	@Override
	public String formatDate(Date date) {
		// TODO Auto-generated method stub
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		return dateFormat.format(date);
	}

	// Method to generate SHA1 digest from the PaymentRequest string representation
	@Override
	public String generateSHADigest(String str) {
		String sha1 = "";
		try {
			MessageDigest crypt = MessageDigest.getInstance("SHA-1");
			//sha1 = byteToHex(crypt.digest());
			Formatter formatter = new Formatter();
			for(byte b : crypt.digest()) {
				formatter.format("%02x", b);
			}
			sha1 = formatter.toString();
			formatter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return str + "|hash=" + sha1;
	}

	// Not the real implementation
	// Just a demo represenation
	@Override
	public PaymentResponse postRequest(String str) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		PaymentResponse response = new PaymentResponse("Success", 10000.0d, "txn001", date, "merc001", "pg_merc001");
		return response;
	}

	// Method encrypt the string using AES128 CBC algorithm and then encodes it to
	// BASE64encoding
	@Override
	public String secureTransaction(String str) {
		// TODO Auto-generated method stub
		return null;
	}

	// Method decodes string using Base64Decode and decrypt it using AES128 CBC
	// algorithm
	@Override
	public String decriptTrasaction(String str) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String generateResponseString(PaymentResponse response) {
		// TODO Auto-generated method stub
		return "txn_status=" + response.getTxn_status() + "|" + "merchant_transaction_ref="
				+ response.getMerchant_transaction_ref() + "|" + "transaction_date="
				+ formatDate(response.getTransaction_date()) + "|" + "payment_gateway_merchant_reference="
				+ response.getPayment_gateway_merchant_reference() + "|" + "payment_gateway_transaction_reference="
				+ response.getPayment_gateway_transaction_reference();
	}

	@Override
	public void printResponseParameter(String str) {
		// TODO Auto-generated method stub
		String[] data = str.split("\\|");
		for (int i = 0; i < data.length - 1; i++)
			System.out.println(data[i]);

	}
}
