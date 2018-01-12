package C_Singleton;
/**
 * ���򵥵����ࡿ
 * @author liyb
 * ����ģʽȱ�ݰ棺
 * instance = new Singleton();����Ƿ�����ִ�еġ�����JVM������֤�������������Ⱥ�˳���³���
 */
public class Singleton {  
    /* ����˽�о�̬ʵ������ֹ�����ã��˴���ֵΪnull��Ŀ����ʵ���ӳټ��� */  
    private static Singleton instance = null;  
    
    /* ˽�й��췽������ֹ��ʵ���� */  
    private Singleton() {  
    }  
  
    /* ��̬���̷���������ʵ�� */  
    public static Singleton getInstance() {    
        if (instance == null) {         //����ж�����Ϊֻ�е�һ����Ҫ�߳������Ż�����
        	synchronized (instance) {      //synchronized��ֹ���̳߳���  
        		if (instance == null) {  
        			instance = new Singleton();  
        		}
        	}
        }  
        return instance;  
    }  
  
    /* ����ö����������л������Ա�֤���������л�ǰ�󱣳�һ�� */  
    public Object readResolve() {  
        return instance;  
    }  
}  