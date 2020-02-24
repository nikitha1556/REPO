Feature: testme
   Scenario: testme registration
             Given user navigates to registration page
             And user enters username 
             And user enters firstname  
             And user enters lastname  
             And user enters password  
             And user enters confirm password
             And user enters gender 
             And user enters email  
             And user enters mobile number 
             And user enters DOB  
             And user enters address  
             And user enters security question 
             And user enters answer 
             When user clicks on register
             Then displays homepage
             