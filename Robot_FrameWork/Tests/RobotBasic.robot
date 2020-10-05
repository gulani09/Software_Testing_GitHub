*** Settings ***
Documentation    This is basic concept about suite
Resource    ../Resources/RobotGUI.robot
Resource    ../Resources/RobotCommon.robot

*** Test Cases ***
User must signIn to check out
    [Documentation]    This is basic concept about suite
    [Tags]    Smoke
    RobotCommon.Beginging the web test
    RobotGUI.Search for the product
    RobotGUI.Select product from search results
    RobotGUI.Select attribute for the selected product
    RobotGUI.Add to the card
    RobotGUI.Checkout product
    RobotCommon.Ending the web test







