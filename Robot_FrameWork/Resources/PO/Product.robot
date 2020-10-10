*** Settings ***
Library    SeleniumLibrary

*** Variables ***
${CLICK_PRODUCT} =      //a[@title='Faded Short Sleeve T-shirts']
${REMOVE_QUANTITY} =        //input[@id='quantity_wanted']
${VALUE_QUANTITY} =     //input[@id='quantity_wanted']
${VIEW_ELEMENT} =       id=group_1
${CLICK_DROPDOWN} =     id=group_1
${SELECT_ELEMENT} =     //*[@title='M']
${SELECT_COLOUR} =      //a[@title='Blue']

*** Keywords ***
Choose Product
    click link  ${CLICK_PRODUCT}

Change Quantity
    Clear Quantity
    Enter Quantity

Clear Quantity
    clear element text    ${REMOVE_QUANTITY}
Enter Quantity
    input text    ${VALUE_QUANTITY}    2

Select Size Dropdown
    Scroll View Element
    Click Dropdown
    Select Element

Scroll View Element
    scroll element into view    ${VIEW_ELEMENT}

Click Dropdown
    click element    ${CLICK_DROPDOWN}

Select Element
    click element    ${SELECT_ELEMENT}

Click Colour
    click link    ${SELECT_COLOUR}
