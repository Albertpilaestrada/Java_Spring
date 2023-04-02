package ioc;

public class Bossemploye implements Employes {
	
	private Reports newreport;
	
	public Bossemploye(Reports newreport) {
		this.newreport = newreport;
	}

	public String gettask() {
		
		return "I manage issues related to my employees";
	}

	public String getinforme() {
		
		return "Report created by boss with modifications. "+newreport.getinforme();
	}

}
