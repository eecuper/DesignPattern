package A_Factory3;
/**
 * ����̬����ģʽ��
 * @author liyb
 *
 */
public class Test {  
    public static void main(String[] args) {  
        Sender sender = SendFactory.produceSms();   //ͨ�����ò�ͬ�ķ���������ͬ����
        sender.Send();    //ִ�д�����ķ���
    }  
}  
