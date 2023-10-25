Feature: File feature for uploading, downloading reading or writing

  As customer i want the ability to
  download a file so that further options can be explored
  @TestDB
  Scenario: Customer can successfully download an invoice

    Given I paid for my shopping on payment-done page
    When I click on download invoice button
    Then Invoice of customer's shopping downloaded


@ignor
  Scenario: Customer can  click on popup close button and before download an invoice

    Given Customer paid for my shopping on payment-done page
    When Customer click on download invoice button
    Then Invoice of customer's shopping downloaded