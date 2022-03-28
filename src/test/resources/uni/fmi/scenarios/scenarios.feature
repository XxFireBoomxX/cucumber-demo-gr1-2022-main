Feature: Creation and of a project and developer

  Scenario: Create new project
    Given Opens project creation GUI
    When Enters project name
    And Clicks "Create" button
    Then It is greet with success pop up window

  Scenario: Creating project while the name is already in use
    Given Opens project creation GUI
    When Enters project name that is already in use
    And Clicks "Create" button
    Then It pops up window which says the name was already taken

  Scenario: Create new developer
    Given Opens developer creation GUI
    When Enters developer name
    And Choose the developers role
    And Clicks "Done" button
    Then It pops up success massage

  Scenario: Create task without adding a developer
    Given Opens task creation GUI
    When Enters task name
    And Selects project
    And Selects without developer
    And Writes a discription
    And Clicks the create button
    Then It pops up success massage

  Scenario: Add developer to task and change the status
    Given Opens task modification GUI
    When  Selects the task name
    And Selects the developer
    And Clicks "Change" button
    Then  It pops up success massage
