$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Task1.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#noinspection GherkinBrokenTableInspection"
    }
  ],
  "line": 2,
  "name": "New Address",
  "description": "",
  "id": "new-address",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Adding new address",
  "description": "",
  "id": "new-address;adding-new-address",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user opens page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks on button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user enters email \u003cemail\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user enters password \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click \"Sign in\" button.",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user clicks \"add first address\" button",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "user adds new alias \u003calias\u003e, firstname \u003cfirstname\u003e, surname \u003clastname\u003e, address \u003caddress\u003e, zip code \u003ccode\u003e, city \u003ccity\u003e, country \u003ccountry\u003e and phone \u003cphone\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user sees confirmation message",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "browser is closed",
  "keyword": "And "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "new-address;adding-new-address;",
  "rows": [
    {
      "cells": [
        "email",
        "firstname",
        "lastname",
        "password",
        "alias",
        "address",
        "code",
        "city",
        "country",
        "phone"
      ],
      "line": 16,
      "id": "new-address;adding-new-address;;1"
    },
    {
      "cells": [
        "fkfstiucsgasugjlrq@sdvgeft.com",
        "Tester",
        "Tester",
        "tester123",
        "Adress1",
        "Baker Street",
        "12345",
        "London",
        "United Kingdom",
        "1122334455"
      ],
      "line": 17,
      "id": "new-address;adding-new-address;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 17,
  "name": "Adding new address",
  "description": "",
  "id": "new-address;adding-new-address;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user opens page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks on button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user enters email fkfstiucsgasugjlrq@sdvgeft.com",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user enters password tester123",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click \"Sign in\" button.",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user clicks \"add first address\" button",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "user adds new alias Adress1, firstname Tester, surname Tester, address Baker Street, zip code 12345, city London, country United Kingdom and phone 1122334455",
  "matchedColumns": [
    1,
    2,
    4,
    5,
    6,
    7,
    8,
    9
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user sees confirmation message",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "browser is closed",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});