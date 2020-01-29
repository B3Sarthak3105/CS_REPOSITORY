Feature: Register

Scenario: Register on TestMe app
Given user open Testme App
When clicked on Signup
And enter User name as "trichipalli"
And enter First name as "trichipalli"
And enter Last name as "tembhurne"
And enter Password as "B3twerkEr"
And enter Confirm Password as "B3twerkEr"
And select Gender
And enter email as "trichipallilevel@gmail.com"
And enter phone number as "1123456789"
And enter dob as "05/31/1996"
And enter address as "Pune HInjewadi"
And select Security Question 
And enter answer as "Ranjit"
And click on Register
Then Registration should be succesfull

Scenario: Login on Testme app
Given user open Testme App
When click on signin
And enter valid username 
And enter valid Password

