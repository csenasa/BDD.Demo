package bdd.gherkin.demo;

import java.text.DecimalFormat;

public class LoanEmiCalcService {
	
	private double getMonthlyInterest(double interestPerAnnum)
	{
		return interestPerAnnum/12/100;
	}

	private Double calcEmi(double p, double r, double n) {
        double monthlyInterestRate = getMonthlyInterest(r);
        double e = (p * monthlyInterestRate * (Math.pow((1 + monthlyInterestRate), n)) / ((Math.pow((1 + monthlyInterestRate), n)) - 1));

        DecimalFormat df = new DecimalFormat("#.##");      
        return Double.valueOf(df.format(e));
        
}
	public double calculteEmi(LoanData loanData) {		
		return calcEmi(loanData.getPrincipal() , loanData.getInterest() , loanData.getTenureInMonths());

	}

}
