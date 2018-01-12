package D_Builder;

import java.util.ArrayList;
import java.util.List;

public class Builder {      
	private List<Sender> list = new ArrayList<Sender>();  
      
	public void produceMailSender(int count){  
		for(int i=0; i<count; i++){  //����ģʽ��ע���Ǵ���������Ʒ����������ģʽ���ע�������϶��󣬶�����֡�
			list.add(new MailSender());  
		}
		for (Sender s : list) {
			s.Send();
		}
	}  
      
	public void produceSmsSender(int count){  
		for(int i=0; i<count; i++){  
			list.add(new SmsSender());  
		}
		for (Sender s : list) {
			s.Send();
		}
	}  
}  
