package A_Factory3;
/**
 * �������ࡿ������Ϊ��̬�ģ�����Ҫ����ʵ����ֱ�ӵ��ü��ɡ�
 * ����һ�������࣬��ʵ����ͬһ�ӿڵ�һЩ�����ʵ���Ĵ�����
 * @author liyb
 *
 */
public class SendFactory {  
	public static Sender produceMail(){  
	    return new MailSender();  
	}  
	public static Sender produceSms(){  
	    return new SmsSender();  
	}  
} 

