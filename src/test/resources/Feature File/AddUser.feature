@addnewuser

Feature:
To add new user

Scenario:
Adding new user

Given User should be in DSBA login page
When User have to enter valid id, password and tap on login button
And User have to tap settings icon
And USer have to tap add new user button
And User have to enter first name,last name ,email address and tap on submit button.
Then User is added successfully