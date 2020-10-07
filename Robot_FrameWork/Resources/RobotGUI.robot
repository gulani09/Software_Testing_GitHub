*** Settings ***
Resource    PO/LandingPage.robot
Resource    PO/SearchProduct.robot
Resource    PO/Product.robot
Resource    PO/Card.robot

*** Keywords ***
Search for the product
    LandingPage.Load
    LandingPage.Maximize window
    SearchProduct.Search Product
    LandingPage.Sleep for load

Select product from search results
    Product.Choose Product
    LandingPage.Sleep for load
    Product.Change Quantity

Select attribute for the selected product
    Product.Select Size Dropdown
    Product.Click Colour
    LandingPage.Sleep for load

Add to the card
    Card.Click Add Card
    LandingPage.Sleep for load

Checkout product
    Card.Checkout


