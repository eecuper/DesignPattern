package B_AbstractFactory;
/**
 *�����󹤳�ģʽ��
 * @author liyb
 * ��չ�ԽϺã�ֱ��ͨ��new����ѡ����󣬶�����̳���ͬһ�ӿڡ�
 * һ�μ̳������ڹ������ƣ�һ�μ̳����ڶ��Ƿ���ʵ������
 */
public class Test {  
    public static void main(String[] args) {  
        Provider provider = new SendMailFactory();  
        Sender sender = provider.produce();  
        sender.Send();  
    }  
}  
