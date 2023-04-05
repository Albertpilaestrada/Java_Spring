package tryannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Headcommercial implements Employes {

	@Autowired
	public Headcommercial(FinancialReport financialreport1) {
		this.financialreport1 = financialreport1;
	}

	@Override
	public String gettasks() {
		// TODO Auto-generated method stub
		return "Sell, sell and more sell";
	}

	@Override
	public String getreports() {
		// TODO Auto-generated method stub
		//return "Report made by Head Commercial";
		return financialreport1.getfinancialreport();
	}
	
	private FinancialReport financialreport1;

}
