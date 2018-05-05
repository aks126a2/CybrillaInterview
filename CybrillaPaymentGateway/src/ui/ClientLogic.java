package ui;

import java.util.Calendar;
import java.util.Date;

import bean.PaymentRequest;
import bean.PaymentResponse;
import business.BusinessLogicImpl;

public class ClientLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calender = Calendar.getInstance();
		Date date = calender.getTime();
		PaymentRequest payment = new PaymentRequest("ICIC0000001","1111111111",10000.0d,"txn001",date,"merc001");
		BusinessLogicImpl impl = new BusinessLogicImpl();	
		String payload_with_sha = impl.generateSHADigest(impl.generatePaymentString(payment));
		//String secure = impl.secureTransaction(payload_with_sha);
		PaymentResponse response = impl.postRequest("DemoData");
		//String decodedmsg = impl.decriptTrasaction("");
		String decryptedResponse = impl.generateSHADigest(impl.generateResponseString(response));
		System.out.println(payload_with_sha);
		impl.printResponseParameter(decryptedResponse);
	}

}
