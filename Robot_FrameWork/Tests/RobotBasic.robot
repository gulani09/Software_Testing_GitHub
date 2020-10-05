*** Settings ***
Documentation    This is basic concept about suite
Library    SeleniumLibrary

*** Test Cases ***
User must signIn to check out
    [Documentation]    This is basic concept about suite
    [Tags]    Smoke
    Beginging the web test
    Search for the product
    Select product from search results
    Select attribute for the selected product
    Add to the card
    Checkout product
    Ending the web test

*** Keywords ***
Beginging the web test
    open browser  about:blank    chrome

Search for the product
    Go To    http://automationpractice.com/
    maximize browser window
    sleep    3s
    input text    //input[@id='search_query_top']    t-shirt
    click button    //button[@name='submit_search']
    sleep    3s

Select product from search results
    click link  //a[@title='Faded Short Sleeve T-shirts']
    sleep    3s
    clear element text    //input[@id='quantity_wanted']
    input text    //input[@id='quantity_wanted']    2

Select attribute for the selected product
    scroll element into view    id=group_1
    click element    id=group_1
    click element    //*[@title='M']
    click link    //a[@title='Blue']
    sleep    3s

Add to the card
    scroll element into view    //span[contains(text(), 'Add to cart')]
    click button    //button[@name= 'Submit']
    sleep    3s

Checkout product
    click link    //a[@title='Proceed to checkout']

Ending the web test
    close browser





