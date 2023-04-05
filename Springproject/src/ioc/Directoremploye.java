package ioc;

public class Directoremploye implements Employes {
	
	private Reports newreport;
	
	public Directoremploye (Reports newreport) {
		this.newreport=newreport;
	}

	public String gettask() {
		
		return "Manage company staff";
	}

	public String getinforme() {
		
		return "Report created by director. "+newreport.getinforme();
	}
	
	//init method. Run tasks before the bean is available
	
	public void initial_method() {
		System.out.println("Here will be the tasks to execute before the bean is ready");
	}
	
	//destroy method. Run tasks after the bean has been executed
	
	public void final_method() {
		System.out.println("Here will be the tasks to execute after the bean is used");
	}

}
