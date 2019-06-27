@Register-User--UserStory01
Feature: Registration of a new user
  As a application user
  I want to register a new user in the app Selendroid-test-app
  So that a verification user card should appear

  Comment: Depois de criar esse arquivo e instalar o cucumber plugin File->settings->pluggins->cucumber java, clicar com o direito e rodar o cenario, no log vai aparecer a estrutura dos steps para copiar e preencher mais facilmente os steps

  @Create-User-Positive--AcceptanceCriteria01
  Scenario Outline: Register a new user
    Given I am on Selendroid-test-app

    When I select Register button

    And fill the Username as "<username>"
    And fill the E-mail as "<email>"
    And fill the password as "<password>"
    And fill the name as "Leonardo"
    And select the programming language as
      | Ruby   |
      | PHP    |
      | Python |
    And check the checkbox
    And click Register User button

    Then I should see the verify user card
    And the Name should be "Leonardo"

    Examples:
      | username | email           | password |
      | Leo1     | teste@gmail.com | teste1   |
      | Leo2     | teste@gmail.com | teste2   |

