*** Settings ***
Library    SeleniumLibrary

*** Variables ***
${SERARCH_BOX} =        //input[@id='search_query_top']
${SEARCH_BUTTON} =      //button[@name='submit_search']

*** Keywords ***
Search Product
    Enter Search Item
    Click Search

Enter Search Item
    input text    ${SERARCH_BOX}    ${SEARCH_ITEM}

Click Search
    click button    ${SEARCH_BUTTON}
