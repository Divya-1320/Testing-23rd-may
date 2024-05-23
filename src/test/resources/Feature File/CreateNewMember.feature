@createnewmember
Feature:
To create a new member in DSBA


Scenario:
To create a new member

Given User should be in DSBA login page
When User have to enter valid id, password and tap on login button
And User have to tap on new member button
And User have to select member type,member code,member id,title,first name,last name,Esquire,gender,dob,admit date and tap on next button
And User have to enter firm name,address 1,address 2,country,states,zip code, phone number,fax number, email id and tap on next button
And User have to enter firm name,address 1, address 2,country,states,zip code,phone number,fax number,email id,firm admin name,admin phone number,admin email id and tap on next button
And User have to select options in sections and tap on next button
And User have to select options in member tags and tap on next button
And User have to select states,admit date,other statebar id and tap on save button
Then New member is created successfully