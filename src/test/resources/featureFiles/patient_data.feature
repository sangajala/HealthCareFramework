Feature: Patient Data


  Scenario Outline: Admin can add patient

    Given admin is in dashboard
    When he go to patient module
    And select to add a patient
    And fill the patient details with "<Patient Name>", "<Gender>","<DOB>","<Mobile Number>","<Email>" and "<Symptoms>"
    And Save the patient
    And search for the "<Patient Name>"
    Then he should be available in the search result

    Examples:

      | Use case        | Patient Name | Gender | DOB        | Mobile Number | Email         | Symptoms |
      | Normal Patient  | Rohan        | Male   | 01/01/1980 | 1234567890    | test@test.com |          |
      | Disease Patient | Ram          | Male   | 01/01/1980 | 1234567890    | test@test.com | Fever    |
      | Default DOB     | Krishna      | Male   |            | 1234567890    | test@test.com |          |
#

  Scenario Outline: Search Patient

    Given admin is in dashboard
    When he go to patient module
    And search for the "<Patient Name>"
    Then he should be available in the search result

    Examples:

      | Use case | Patient Name |
      | Search   | Rohan        |
      | Search   | Rohan        |
      | Search   | Rohan        |


  Scenario Outline: Search invalid Patient

    Given admin is in dashboard
    When he go to patient module
    And search for the "<Patient Name>"
    Then he should be not be available in the search result

    Examples:

      | Use case      | Patient Name  |
      | Invalid       | Rohan1212     |
      | Special chars | Rohan1212&%^% |
      | Space         |               |


  Scenario Outline: Admin can edit patient

    Given admin is in dashboard
    When he go to patient module
    And search for the "<Old Patient Name>"
    And select to view a patient
    And select to edit a patient
    And edit the patient details with "<New Patient Name>"
    And Save the patient
    And search for the "<New Patient Name>"
    Then he should be available in the search result

    Examples:

      | Use case  | Old Patient Name | New Patient Name |
      | Edit Name | Rohan            | Misra            |


  Scenario Outline: Admin can delete patient

    Given admin is in dashboard
    When he go to patient module
    And search for the "<Patient Name>"
    And select to view a patient
    And select to delete a patient
    And search for the "<Patient Name>"
    Then he should be not be available in the search result

    Examples:

      | Use case | Patient Name |
      | Delete   | Krishna      |
