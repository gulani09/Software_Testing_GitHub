*** Settings ***
Library    SeleniumLibrary

*** Variables ***


*** Keywords ***
Load
    Go To    http://automationpractice.com/

Maximize window
    maximize browser window
    sleep    3s

Sleep for load
    sleep    3s