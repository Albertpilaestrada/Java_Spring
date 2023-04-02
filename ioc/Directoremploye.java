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

}
