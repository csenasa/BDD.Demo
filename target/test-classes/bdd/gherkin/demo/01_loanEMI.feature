Feature: Demonstrating cuke tests with loan EMI calculation example

Scenario: calulate EMI 
Given principal amount is 100000 Rs 
And Interest rate is 9% per annum
And tenure is 36 months
When i calculate EMI
Then resulting EMI shall be 3179.97

@Ignore
Scenario Outline: calculate EMI for different interest rates 
Given principal amount is <prinicpal> Rs 
And Interest per annum is <interest>%
And tenure is <tenure> months
When i Calculate EMI
Then resulting EMI shall be <EMI>
Examples:
|Principal|Interest|Tenure In Months|EMI|
|100000|9|24|848.664327836109|
|100000|10.5|36|1791.56619196818|

@Ignore
Scenario: Loan details in tabular format
Given loan details 
|LoanId|Principal|Interest|Tenure In Months|
|1|100000|9|24|
|2|200000|10.5|36|
When i calculate EMI
Then my EMI result should be
|LoanId|EMI|
|1|848.664327836109|
|2|1791.56619196818|


