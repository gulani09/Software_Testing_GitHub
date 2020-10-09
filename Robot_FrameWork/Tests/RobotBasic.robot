*** Settings ***
Documentation    This is basic concept about suite
Resource    ../Resources/RobotGUI.robot
Resource    ../Resources/RobotCommon.robot

Suite Setup    Insert testing data
Test Setup    Beginging the web test
Test Teardown    Ending the web test
Suite Teardown    Cleanup testing data

*** Variables ***
${BROWSER} =    chrome
${URL} =    http://automationpractice.com/
${SEARCH_ITEM} =    t-shirt

*** Test Cases ***
User Search for product
    RobotGUI.Search for the product

User must signIn to check out
    [Documentation]    This is basic concept about suite
    [Tags]    Smoke
    RobotGUI.Search for the product
    RobotGUI.Select product from search results
    RobotGUI.Select attribute for the selected product
    RobotGUI.Add to the card
    RobotGUI.Checkout product







