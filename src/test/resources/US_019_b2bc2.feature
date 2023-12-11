Feature:New company should be able to be added, deleted and updated
  Background:
    * login to app
    * Click the "Online Mağaza" module button
    * Click the "B2BC" module button

  Scenario:TC0137 Failure Scenario: New Company Addition with Mandatory Information Gaps (no phone information)
    * click yeni firma button
    * add new company with noPhone information
    * verify that the company could not be added

  Scenario:TC0157 Testing to delete company
    * delete company
    * verify that the company has been deleted

  Scenario:TC0158 Testing to update company information
    * update company information
    * verify that the company information has been updated