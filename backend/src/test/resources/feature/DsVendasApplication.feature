@UnitTest
Feature: DS Vendas Application BDD test

  Scenario: Sellers test
    Then should return size of sellers 5
    Then should return seller names "Logan", "Anakin", "BarryAllen", "Kal-El", "Padme"

  Scenario: Sales test
    Then should return size of sales 170