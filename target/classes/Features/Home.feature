#Author: your.email@your.domain.com


Feature: Check Home page fuctionality
  

  
#Scenario: Title of the page
 #Then Home page is displayed
    
Scenario Template: User is able to search a products
Given User should be login sucessfully
When User search any products "<products>"
And user is click on search icon
Then user should get the result

Scenarios:

|products| 
|saree   |
|jhumka  |
|mobile  |
  