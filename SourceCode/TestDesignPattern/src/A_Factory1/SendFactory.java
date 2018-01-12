package A_Factory1;
/**
 * �������ࡿ�������ͽ���ѡ��
 * ����һ�������࣬��ʵ����ͬһ�ӿڵ�һЩ�����ʵ���Ĵ�����
 * @author liyb
 *
 */
public class SendFactory {  
    public Sender produce(String type) {  
        if ("mail".equals(type)) {  
            return new MailSender();  
        } else if ("sms".equals(type)) {  
            return new SmsSender();  
        } else {  
            System.out.println("��������ȷ������!");  
            return null;  
        }  
    }  
}  