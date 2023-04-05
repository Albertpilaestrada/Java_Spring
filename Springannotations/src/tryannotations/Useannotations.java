package tryannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Useannotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Load XML
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Ask bean to XML
		Employes Antonio=context.getBean("headcommercial",Employes.class);
		
		//Use bean
		System.out.println(Antonio.gettasks());
		System.out.println(Antonio.getreports());
		
		//Close context
		context.close();

	}

}
