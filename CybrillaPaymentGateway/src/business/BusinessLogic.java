package business;
import java.util.Date;

import bean.PaymentRequest;
import bean.PaymentResponse;

public interface BusinessLogic {
	public String generatePaymentString(PaymentRequest payment);
	public String formatDate(Date date);
	public String generateSHADigest(String str);
	public PaymentResponse postRequest(String str);
	public String secureTransaction(String str);
	public String decriptTrasaction(String str);
	public String generateResponseString(PaymentResponse str);
	public void printResponseParameter(String str);
}
