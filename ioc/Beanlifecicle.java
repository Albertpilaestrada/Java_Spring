package ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Beanlifecicle {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext3.xml");
		
		Employes Pedro=context.getBean("myemploye1", Employes.class);
		
		System.out.println(Pedro.gettask());
		
		context.close();

	}

}
