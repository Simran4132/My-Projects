$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/amazon.feature");
formatter.feature({
  "name": "To validate the login fuctionality of amazon  application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Feature1"
    }
  ]
});
formatter.scenario({
  "name": "To validate login fuctionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Feature1"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "To launch the browser and maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "RegisterFb.to_launch_the_browser_and_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch url of amazon application",
  "keyword": "When "
});
formatter.match({
  "location": "amazonLogin.to_launch_url_of_amazon_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the signin button",
  "keyword": "And "
});
formatter.match({
  "location": "amazonLogin.to_click_the_signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the valid phone number",
  "rows": [
    {
      "cells": [
        "9787976543",
        "98645666",
        "abc@gmai.com"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "amazonLogin.to_pass_the_valid_phone_number(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the contiue button",
  "keyword": "And "
});
formatter.match({
  "location": "amazonLogin.to_click_the_contiue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close the all browser",
  "keyword": "Then "
});
formatter.match({
  "location": "amazonLogin.to_close_the_all_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/myntra.feature");
formatter.feature({
  "name": "To validate the searchbox in myntra  application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Feature2"
    }
  ]
});
formatter.scenario({
  "name": "To validate  serachbox fuctionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Feature2"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "To launch the browser and maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "RegisterFb.to_launch_the_browser_and_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch url of myndra application",
  "keyword": "When "
});
formatter.match({
  "location": "myndra.to_launch_url_of_myndra_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the text in searchbox",
  "keyword": "And "
});
formatter.match({
  "location": "myndra.to_pass_the_text_in_searchbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close the all browser",
  "keyword": "Then "
});
formatter.match({
  "location": "amazonLogin.to_close_the_all_browser()"
});
formatter.result({
  "status": "passed"
});
});