*** Settings ***
Library    SeleniumLibrary

*** Keywords ***
Choose Product
    click link  //a[@title='Faded Short Sleeve T-shirts']

Change Quantity
    Clear Quantity
    Enter Quantity

Clear Quantity
    clear element text    //input[@id='quantity_wanted']
Enter Quantity
    input text    //input[@id='quantity_wanted']    2

Select Size Dropdown
    Scroll View Element
    Click Dropdown
    Select Element

Scroll View Element
    scroll element into view    id=group_1

Click Dropdown
    click element    id=group_1

Select Element
    click element    //*[@title='M']

Click Colour
    click link    //a[@title='Blue']
