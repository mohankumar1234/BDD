$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TC1.feature");
formatter.feature({
  "line": 2,
  "name": "Validate Functionalities of HomePage",
  "description": "",
  "id": "validate-functionalities-of-homepage",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@followus"
    }
  ]
});
formatter.scenarioOutline({
  "line": 94,
  "name": "validate login function",
  "description": "",
  "id": "validate-functionalities-of-homepage;validate-login-function",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 93,
      "name": "@TC10"
    }
  ]
});
formatter.step({
  "line": 95,
  "name": "I enter URL",
  "keyword": "When "
});
formatter.step({
  "line": 96,
  "name": "Home page displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 97,
  "name": "I click \"\u003cbutton\u003e\" in home page top menu",
  "keyword": "When "
});
formatter.step({
  "line": 98,
  "name": "I enter \"\u003cEmail\u003e\" and \"\u003cPassword\u003e\" and click login",
  "keyword": "Then "
});
formatter.step({
  "line": 99,
  "name": "I validate \"\u003cEmail\u003e\" visible at top menu",
  "keyword": "Then "
});
formatter.step({
  "line": 100,
  "name": "I quit browser",
  "keyword": "And "
});
formatter.examples({
  "line": 101,
  "name": "",
  "description": "",
  "id": "validate-functionalities-of-homepage;validate-login-function;",
  "rows": [
    {
      "cells": [
        "button",
        "Email",
        "Password"
      ],
      "line": 102,
      "id": "validate-functionalities-of-homepage;validate-login-function;;1"
    },
    {
      "cells": [
        "Log in",
        "aaaaaa@bbbbbb.com",
        "cccccc"
      ],
      "line": 103,
      "id": "validate-functionalities-of-homepage;validate-login-function;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 103,
  "name": "validate login function",
  "description": "",
  "id": "validate-functionalities-of-homepage;validate-login-function;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 93,
      "name": "@TC10"
    },
    {
      "line": 1,
      "name": "@followus"
    }
  ]
});
formatter.step({
  "line": 95,
  "name": "I enter URL",
  "keyword": "When "
});
formatter.step({
  "line": 96,
  "name": "Home page displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 97,
  "name": "I click \"Log in\" in home page top menu",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 98,
  "name": "I enter \"aaaaaa@bbbbbb.com\" and \"cccccc\" and click login",
  "matchedColumns": [
    1,
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 99,
  "name": "I validate \"aaaaaa@bbbbbb.com\" visible at top menu",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 100,
  "name": "I quit browser",
  "keyword": "And "
});
formatter.match({
  "location": "TestCase.launchurl()"
});
formatter.result({
  "duration": 15813883900,
  "status": "passed"
});
formatter.match({
  "location": "TestCase.validatehomepage()"
});
formatter.result({
  "duration": 27774400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Log in",
      "offset": 9
    }
  ],
  "location": "TestCase.clickhomepagetopmenu(String)"
});
formatter.result({
  "duration": 761975800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "aaaaaa@bbbbbb.com",
      "offset": 9
    },
    {
      "val": "cccccc",
      "offset": 33
    }
  ],
  "location": "TestCase.entercredentials(String,String)"
});
formatter.result({
  "duration": 2451061200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "aaaaaa@bbbbbb.com",
      "offset": 12
    }
  ],
  "location": "TestCase.validatelogin(String)"
});
formatter.result({
  "duration": 62213200,
  "status": "passed"
});
formatter.match({
  "location": "TestCase.quitbrowser()"
});
formatter.result({
  "duration": 749799600,
  "status": "passed"
});
});