package bdd.gherkin.demo;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoanEMISteps
{
	LoanEmiCalcService loanService = new LoanEmiCalcService();
	LoanData loanData = new LoanData();
	

	@Given("^principal amount is (\\d+) Rs$")
	public void principal_amount_is_Rs(int arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		loanData.setPrincipal(arg1);
	}
	
	@Given("^Interest rate is (\\d+)% per annum$")
	public void Interest_rate_is_per_annum(int arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		loanData.setInterest(arg1);
	}
	
	@Given("^tenure is (\\d+) months$")
	public void tenure_is_months(int arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    loanData.setTenureInMonths(arg1);
	}
	
	@When("^i calculate EMI$")
	public void i_calculate_EMI() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		
		loanData.setEmi(loanService.calculteEmi(loanData));
	    
	}
	
	@Then("^resulting EMI shall be ([+-]?\\d*\\.?\\d+)$")
	public void resulting_EMI_shall_be_(double arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    assertThat(arg1 , equalTo(loanData.getEmi()));
	}
	
	@Given("^principal amount is <prinicpal> Rs$")
	public void principal_amount_is_prinicpal_Rs() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}
	
	@Given("^Interest per annum is <interest>%$")
	public void Interest_per_annum_is_interest_() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}
	
	@Given("^tenure is <tenure> months$")
	public void tenure_is_tenure_months() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}
	
	@When("^i Calculate EMI$")
	public void i_Calculate_EMI() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}
	
	@Given("^loan details$")
	public void loan_details(DataTable arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    // For automatic conversion, change DataTable to List<YourType>
	    throw new PendingException();
	}
	
	@Then("^my EMI result should be$")
	public void my_EMI_result_should_be(DataTable arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    // For automatic conversion, change DataTable to List<YourType>
	    
	    
	}
	

	
}