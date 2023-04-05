package tryannotations;

import org.springframework.stereotype.Component;

@Component
public class FinancialReport1Trimester implements FinancialReport {

	@Override
	public String getfinancialreport() {
		// TODO Auto-generated method stub
		return "Financial report of 1st trimester";
	}

}
