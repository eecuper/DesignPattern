package A_Factory2;
/**
 * �������ࡿ�ṩ��������������ֱ𴴽�����
 * ����һ�������࣬��ʵ����ͬһ�ӿڵ�һЩ�����ʵ���Ĵ�����
 * @author liyb
 *
 */
public class SendFactory {  
	public Sender produceMail(){  
	    return new MailSender();  
	}  
	public Sender produceSms(){  
	    return new SmsSender();  
	}  
} 

