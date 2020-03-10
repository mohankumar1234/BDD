@followus
Feature: Validate Functionalities of HomePage
@TC1
Scenario: Home page validation


When I enter URL
When Home page displayed
Then Register button should be visible

@TC2
Scenario: validation buttons under FOLLOW US 

When I enter URL
Then Home page displayed

When I click youtube button
Then Youtube website should be opened in new tab
When I click Facebook button
Then Facebook website should be opened in new tab

@TC3
Scenario Outline: validation buttons under FOLLOW US with ex

When I enter URL
Then Home page displayed
When I click "<action>" button
Then I Verify "<expectedurl>" is opened in new Tab

Examples: 
|action|expectedurl|
|YouTube|https://www.youtube.com/user/nopCommerce|
|Facebook|https://www.facebook.com/nopCommerce|

@TC4
Scenario: validate top menu in home page  
When I enter URL
When Home page displayed
When I click register in home page top menu
Then register page should be displayed and validate title

@TC5
Scenario: validate top menu in home page  
When I enter URL
When Home page displayed
When I click login in home page top menu
Then login page should be displayed and validate title

@TC6
Scenario Outline: validate top menu in home page
When I enter URL
Then Home page displayed
When I click "<button>" in home page top menu
Then "<button>" page should be displayed and validate title
And I quit browser
Examples: 
|button|
|Register|

@TC7
Scenario Outline: validate top menu in home page
When I enter URL
Then Home page displayed
When I click "<button>" in home page top menu
Then "<button>" page should be displayed and validate title
And I quit browser
Examples: 
|button|
|Log in|

@TC8
Scenario Outline: validate top menu in home page
When I enter URL
Then Home page displayed
When I click "<button>" in home page top menu
Then "<button>" page should be displayed and validate title
And I quit browser
Examples: 
|button|
|Shopping cart|

@TC9
Scenario Outline: validate top menu in home page
When I enter URL
Then Home page displayed
When I click "<button>" in home page top menu
Then "<button>" page should be displayed and validate title
And I quit browser
Examples: 
|button|
|Wishlist|

@TC10
Scenario Outline: validate login function
When I enter URL
Then Home page displayed
When I click "<button>" in home page top menu
Then I enter "<Email>" and "<Password>" and click login
Then I validate "<Email>" visible at top menu
And I quit browser
Examples: 
|button|Email|Password|
|Log in|aaaaaa@bbbbbb.com|cccccc|


