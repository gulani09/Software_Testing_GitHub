*** Settings ***
Library    SeleniumLibrary

*** Variables ***
${CARD_BUTTON_VIEW} =       //span[contains(text(), 'Add to cart')]
${CARD_SUBMIT_BUTTON} =     //button[@name= 'Submit']
${CHECKOUT_BUTTON} =        //a[@title='Proceed to checkout']

*** Keywords ***
Click Add Card
    scroll element into view    ${CARD_BUTTON_VIEW}
    click button    ${CARD_SUBMIT_BUTTON}

Checkout
    click link    ${CHECKOUT_BUTTON}