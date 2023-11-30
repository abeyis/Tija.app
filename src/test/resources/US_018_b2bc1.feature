@edaB2BC_1
@wip
@regression
Feature: The information of the added sub-companies should be able to be viewed and searched

    Background:
    * login to app
        * Click the "Online Mağaza" module button
        * Click the "B2BC" module button

    Scenario:TC0126 Testing redirect to B2BC page
    * Verify that it goes to the BtwoBC Page

    Scenario:TC0127 Testing redirect to dashboard page
    * Click on the Dashboard page link
    * Verify that it goes to the Dashboard Page

    Scenario:TC0131 Testing to search company with Ara button
    * Search Company With Ara Button
    * Verify that company information is displayed on the page

    Scenario:TC0132 Testing to search company with Enter key
    * Search Company With Enter Key
    * Verify that company information is displayed on the page

    Scenario:TC0149 Testing the added companies to be displayed on the B2BC page
    * Verify that previously added companies are displayed


