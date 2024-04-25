@Feature1
Feature: To validate the login fuctionality of amazon  application
@Regression
Scenario: To validate login fuctionality
Given To launch the browser and maximize the window
When To launch url of amazon application
And To click the signin button
And To pass the valid phone number
|9787976543|98645666|abc@gmai.com|
And To click the contiue button
Then To close the all browser