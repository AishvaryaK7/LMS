
@tag
Feature: Logout Page
 
 Background: 
 Given Admin/User/Staff is logged into Lms portal

  @tag1
  Scenario: Validating Logout functionality
    Given Admin/User/Staff Logged on to LMS website
    When Admin/User/Staff  Clicks on LogOut button
    Then Admin/User/Staff should be navigated to Login Screen

