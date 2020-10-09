*** Settings ***
Library    SeleniumLibrary

*** Keywords ***
Search Product
    Enter Search Item
    Click Search

Enter Search Item
    input text    //input[@id='search_query_top']    ${SEARCH_ITEM}

Click Search
    click button    //button[@name='submit_search']
