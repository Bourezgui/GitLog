package log;

import java.lang.reflect.Constructor;


public class Algo_thread {
	public static void main(String[] args) {
		//master modification
		BeanInterface Bean = (BeanInterface) BeanFactory.getBean("log.Bean_2");
		//definition d'une bean
	}


}



class BeanFactory{
	//Defintion d'un bean statique
	//branch_1 detached_head
	private static Object Bean ;
	
	//cette methode permette d'avoir le bean 
	public static Object getBean(String BeanName){		
		if(Bean==null)
			CreateBean(BeanName);
		return Bean;
	}
	
	//cette methode permette la creation d'une bean 
	private static void CreateBean(String BeanName)  {
		Class cls=null;
	    try {		
	    	cls = Class.forName(BeanName);
	    	Constructor constructor=cls.getConstructor();
	    	Bean= cls.newInstance();
	    } catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
}