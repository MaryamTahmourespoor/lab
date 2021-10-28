Feature: Test Hotel domain

@Test
Scenario:  Login to Hotel
  Given user is on hotel website
   When user click on signIn button
   Then user should see signIn page