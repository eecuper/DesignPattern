package A_Factory2;
/**
 * ���������ģʽ��
 * @author liyb
 *
 */
public class Test {  
    public static void main(String[] args) {  
        SendFactory factory = new SendFactory();  
        Sender sender = factory.produceSms();   //ͨ�����ò�ͬ�ķ���������ͬ����
        sender.Send();    //ִ�д�����ķ���
    }  
}  
