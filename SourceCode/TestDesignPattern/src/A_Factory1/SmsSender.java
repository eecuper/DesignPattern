package A_Factory1;
/**
 * ���ŷ�����
 * @author liyb
 *
 */
public class SmsSender implements Sender {  //�̳��ڹ�ͬ�Ĺ��ܽӿ�
    @Override  
    public void Send() {  
        System.out.println("���Ƕ��ŷ���!");     
    }  
    
}  