Feature: Test radio button and check boxes and verify country in demoqa website

@tag1
Scenario: Verifying status
Given The user is on Demoqa Website
When The user Check the status
Then The user click the button

@tag2
Scenario: The user is on Demoqa Website
Given The user is on Demoqa Website
When The user check hobby
Then The user click check
@tag3
Scenario: The user is on Demoqa Website
Given The user is on Demoqa Website
When user clicks the dropdown menu
Then user verifies whether the dropdown default value is same or not