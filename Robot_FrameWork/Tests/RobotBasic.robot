*** Settings ***
Documentation    This is basic concept about suite
Library    SeleniumLibrary

*** Test Cases ***
User must signIn to check out
    [Documentation]    This is basic concept about suite
    [Tags]    Smoke
    #
    open browser  http://automationpractice.com/    chrome
    maximize browser window
    sleep    3s
    input text    //input[@id='search_query_top']    t-shirt
    click button    //button[@name='submit_search']
    sleep    3s

    click link  //a[@title='Faded Short Sleeve T-shirts']
    sleep    3s
    clear element text    //input[@id='quantity_wanted']
    input text    //input[@id='quantity_wanted']    2

    scroll element into view    id=group_1
    click element    id=group_1
    click element    //*[@title='M']
    click link    //a[@title='Blue']
    sleep    3s

    # Add to the card
    scroll element into view    //span[contains(text(), 'Add to cart')]
    click button    //button[@name= 'Submit']
    click link    //a[@title='Proceed to checkout']

    close browser

