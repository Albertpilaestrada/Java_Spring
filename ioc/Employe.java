package ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Employe {

	public static void main(String[] args) {
		
		/*employes employe1=new bossemploye();
		employes employe2=new secretaryemploye();
		employes employe3=new directoremploye();
		
		System.out.println(employe1.gettask());
		System.out.println(employe2.gettask());
		System.out.println(employe3.gettask());*/
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Employes Juan=context.getBean("myemploye1",Employes.class);
		System.out.println(Juan.gettask());
		System.out.println(Juan.getinforme());
		
		Secretaryemploye Maria=context.getBean("myemploye2",Secretaryemploye.class);
		System.out.println(Maria.gettask());
		System.out.println(Maria.getinforme());
		System.out.println(Maria.getEmail());
		System.out.println(Maria.getCompany_name());
		
		context.close();
		
		
	}

}
