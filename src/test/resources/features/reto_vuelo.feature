#Autor: Pablo Andres Hernandez Morales
#language: en
  @stories
  Feature: Verify that the reservation code is six digits
    As user
    I want to verify if the help contain a text with a reservation code of six digits
  @scenario1
  Scenario: Verify that the reservation code is six digits successful
    Given the user is in the home page of latamairlines
    When he complete all the steps to see the code
    Then he confirm that the code is of six digits
