#Author: prakash@AutomationTalks.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)

Feature: Calculate Vehicle Insurance
  Background: 
    When user opens required browser

  Scenario Outline: verify that vehicle insurance get calculated correctly for various scenarios.
    Given user is on vehicle insurance calculator homePage
    When user enters vehicle Data
    And use enters Insurant data
    And user enters Product data
    And user selects required insurance plan
    Then verify the insurance premium for all given plans
    And verify that user is able to send email notification with plan details.

    Examples: 
      | Vehicle_Make | Vehicle_Model | Vehicle_CylinderCapacity | Vehicle_Enging Performance | Vehicle_Date of Manufacture | Vehicle_No of Seats | Vehicle_RightHandDrive | Vehicle_No of Seats_motorcycle | Vehicle_Fuel Type | Vehicle_PayLoad | Vehicle_Total Weight | Vehicle_List Price | Vehicle_Annual Mileage | Insurant_FirstName | Insurant_LastName | Insurant_birthdate | Insurant_gender | Insurant_country | Insurant_zipcode | Insurant_occupation | Insurant_Hobby | Insurant_ImageFilePath | Product_startdate | Product_insurancesum | Product_meritrating | Product_damageinsurance | Product_courtesycar | Product_OptionalProducts | PriceValidation_Gold | PriceValidation_Silver | PriceValidation_Platinum | PriceValidation_Ultimate | SelectOption |
      | Honda        | Motorcycle    |                      333 |                        666 | 09/04/2019                  |                   7 | Yes                    |                              2 | Gas               |             888 |                  888 |                888 |                    100 | Prakash            | Narkhede          | 12/12/1989         | Male            | India            |           444061 | Farmer              | speeding,Other | ??                     | 12/12/2020        |              3000000 | Bonus 1             | Partial Coverage        | Yes                 | Euro Protection          |               238.00 |                 701.00 |                 1,376.00 |                 2,621.00 | Silver       |
      | Volvo        | Scooter       |                      900 |                        900 | 09/04/2001                  |                   7 | No                     |                              2 | Other             |             888 |                  888 |                888 |                    100 | Prakash            | Narkhede          | 12/12/1956         | Female          | Sweden           |           444061 | Farmer              | speeding,Other | ??                     | 12/12/2025        |              3000000 | Bonus 1             | Partial Coverage        | No                  | Euro Protection          |               238.00 |                 702.00 |                 1,379.00 |                 2,626.00 | Gold         |
      | Ford         | Moped         |                      100 |                        100 | 09/04/1989                  |                   4 | No                     |                              2 | Petrol            |             100 |                  100 |               1000 |                    100 | Prakash            | Narkhede          | 12/12/1956         | Female          | Sweden           |           444061 | Farmer              | speeding,Other | ??                     | 12/12/2025        |              3000000 | Bonus 1             | Partial Coverage        | No                  | Euro Protection          |                87.00 |                 258.00 |                   507.00 |                   967.00 | Gold         |