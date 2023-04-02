package ioc;

public class Secretaryemploye implements Employes {
	
	public void setNewreport(Reports newreport) {
		this.newreport = newreport;
	}

	public String gettask() {
		
		return "Manage manager's agenda";
	}

	public String getinforme() {
		
		return "Final report created by the secretary. "+newreport.getinforme();
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	
	private Reports newreport;
	private String email;
	private String company_name;

}
