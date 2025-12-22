Feature: To login the Facebook Application




Scenario Outline: To check the Login with valid username an valid password


 Given User launch the browser
 When User enters vaild Url
 And User enter the valid "<username>" and  "<password>"
 Then User wish to close the browser
 
 
 
 Examples:
 |username|password|
 |Ramesh|1234567|
 |Suresh|7654321|
 |Pavan|029029029|
 
 
 
 