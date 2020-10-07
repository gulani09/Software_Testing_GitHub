*** Settings ***
Library    SeleniumLibrary

*** Keywords ***
Click Add Card
    scroll element into view    //span[contains(text(), 'Add to cart')]
    click button    //button[@name= 'Submit']

Checkout
    click link    //a[@title='Proceed to checkout']