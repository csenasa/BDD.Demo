package bdd.gherkin.demo;

public class LoanData
{
	private double Principal;
	private float Interest;
	public double getPrincipal() {
		return Principal;
	}
	public void setPrincipal(double principal) {
		Principal = principal;
	}
	public float getInterest() {
		return Interest;
	}
	public void setInterest(float interest) {
		Interest = interest;
	}
	public int getTenureInMonths() {
		return TenureInMonths;
	}
	public void setTenureInMonths(int tenureInMonths) {
		TenureInMonths = tenureInMonths;
	}
	private int TenureInMonths;
	
	private double Emi;
	public double getEmi() {
		return Emi;
	}
	public void setEmi(double emi) {
		Emi = emi;
	} 
}