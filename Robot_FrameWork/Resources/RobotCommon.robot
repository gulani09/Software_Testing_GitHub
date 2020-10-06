*** Settings ***
Library    SeleniumLibrary

*** Keywords ***
Beginging the web test
    open browser  about:blank    chrome

Ending the web test
    close browser

Insert testing data
    log    I am setting up the testing data

Cleanup testing data
    log    I am cleaning up the testing data


