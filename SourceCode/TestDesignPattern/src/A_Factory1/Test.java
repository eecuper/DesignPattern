package A_Factory1;
/**
 * ����ͨ����ģʽ��
 * @author liyb
 *
 */
public class Test {  
    public static void main(String[] args) {  
        SendFactory factory = new SendFactory();  
        Sender sender = factory.produce("msss");    //ָ��ʵ��������
        sender.Send();    //����ʵ������������ķ���
    }  
}  
