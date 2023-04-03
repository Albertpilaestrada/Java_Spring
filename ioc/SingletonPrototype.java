package ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonPrototype {

	public static void main(String[] args) {
		
		//Load configuration XML
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		//Bean petition to Spring container
		Secretaryemploye Lola=context.getBean("myemploye2",Secretaryemploye.class);
		Secretaryemploye Pedro=context.getBean("myemploye2",Secretaryemploye.class);
		System.out.println(Lola);
		System.out.println(Pedro);
		
		if(Lola==Pedro)System.out.println("Point the same object");
		else System.out.println("There is not the same object");
		
		context.close(); 

	}

}
