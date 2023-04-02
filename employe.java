package IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class employe {

	public static void main(String[] args) {
		
		/*employes employe1=new bossemploye();
		employes employe2=new secretaryemploye();
		employes employe3=new directoremploye();
		
		System.out.println(employe1.gettask());
		System.out.println(employe2.gettask());
		System.out.println(employe3.gettask());*/
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("aplicationContext.xml");
		employes Juan=context.getBean("myemploye",employes.class);
		System.out.println(Juan.gettask());
		context.close();
		
		
	}

}
