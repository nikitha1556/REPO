Feature: registering in testme

 
  Scenario Outline: testme registration
    Given user enters into registration page
       When user enters "<username>" , "<firstname>","<lastname>","<password>","<confirmpassword>","<E-mail>","<mobilenumber>","<DOB>","<Address>","<securityquestion>","<answer>"
       Then user navigates to login page
       
        Examples:
 | username | firstname | lastname | password | confirmpassword | gender  | E-mail       | mobilenumber | DOB     | Address | securityquestion  | answer |
 | nikitha  | nikki     |  vanga   | niki1    | niki1           | female  | ni@gmail.com | 13243654756  | 23/2/98 | mvcolny | what is yout favourite color | blue |
            