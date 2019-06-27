$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("RegisterUser.feature");
formatter.feature({
  "line": 2,
  "name": "Registration of a new user",
  "description": "As a application user\r\nI want to register a new user in the app Selendroid-test-app\r\nSo that a verification user card should appear\r\n\r\nComment: Depois de criar esse arquivo e instalar o cucumber plugin File-\u003esettings-\u003epluggins-\u003ecucumber java, clicar com o direito e rodar o cenario, no log vai aparecer a estrutura dos steps para copiar e preencher mais facilmente os steps",
  "id": "registration-of-a-new-user",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Register-User--UserStory01"
    }
  ]
});
formatter.scenarioOutline({
  "line": 10,
  "name": "Register a new user",
  "description": "",
  "id": "registration-of-a-new-user;register-a-new-user",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@Create-User-Positive--AcceptanceCriteria01"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I am on Selendroid-test-app",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I select Register button",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "fill the Username as \"\u003cusername\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "fill the E-mail as \"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "fill the password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "fill the name as \"Leonardo\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "select the programming language as",
  "rows": [
    {
      "cells": [
        "Ruby"
      ],
      "line": 20
    },
    {
      "cells": [
        "PHP"
      ],
      "line": 21
    },
    {
      "cells": [
        "Python"
      ],
      "line": 22
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "check the checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "click Register User button",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I should see the verify user card",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "the Name should be \"Leonardo\"",
  "keyword": "And "
});
formatter.examples({
  "line": 29,
  "name": "",
  "description": "",
  "id": "registration-of-a-new-user;register-a-new-user;",
  "rows": [
    {
      "cells": [
        "username",
        "email",
        "password"
      ],
      "line": 30,
      "id": "registration-of-a-new-user;register-a-new-user;;1"
    },
    {
      "cells": [
        "Leo1",
        "teste@gmail.com",
        "teste1"
      ],
      "line": 31,
      "id": "registration-of-a-new-user;register-a-new-user;;2"
    },
    {
      "cells": [
        "Leo2",
        "teste@gmail.com",
        "teste2"
      ],
      "line": 32,
      "id": "registration-of-a-new-user;register-a-new-user;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 38262613974,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Register a new user",
  "description": "",
  "id": "registration-of-a-new-user;register-a-new-user;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@Create-User-Positive--AcceptanceCriteria01"
    },
    {
      "line": 1,
      "name": "@Register-User--UserStory01"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I am on Selendroid-test-app",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I select Register button",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "fill the Username as \"Leo1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "fill the E-mail as \"teste@gmail.com\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "fill the password as \"teste1\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "fill the name as \"Leonardo\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "select the programming language as",
  "rows": [
    {
      "cells": [
        "Ruby"
      ],
      "line": 20
    },
    {
      "cells": [
        "PHP"
      ],
      "line": 21
    },
    {
      "cells": [
        "Python"
      ],
      "line": 22
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "check the checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "click Register User button",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I should see the verify user card",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "the Name should be \"Leonardo\"",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterUserSteps.i_am_on()"
});
formatter.result({
  "duration": 140837507,
  "status": "passed"
});
formatter.match({
  "location": "RegisterUserSteps.i_select()"
});
formatter.result({
  "duration": 555408750,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Leo1",
      "offset": 22
    }
  ],
  "location": "RegisterUserSteps.fill_the_Username_as(String)"
});
formatter.result({
  "duration": 7163479719,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "teste@gmail.com",
      "offset": 20
    }
  ],
  "location": "RegisterUserSteps.fill_the_E_mail(String)"
});
formatter.result({
  "duration": 7588113932,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "teste1",
      "offset": 22
    }
  ],
  "location": "RegisterUserSteps.fill_the_password(String)"
});
formatter.result({
  "duration": 7260713019,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Leonardo",
      "offset": 18
    }
  ],
  "location": "RegisterUserSteps.fill_the_name(String)"
});
formatter.result({
  "duration": 10123128400,
  "status": "passed"
});
formatter.match({
  "location": "RegisterUserSteps.select_the_programming_language_as_from_dropdown(String\u003e)"
});
formatter.result({
  "duration": 2016144548,
  "status": "passed"
});
formatter.match({
  "location": "RegisterUserSteps.check_the_checkbox()"
});
formatter.result({
  "duration": 1017344502,
  "status": "passed"
});
formatter.match({
  "location": "RegisterUserSteps.click_Register_User_button()"
});
formatter.result({
  "duration": 1283621104,
  "status": "passed"
});
formatter.match({
  "location": "RegisterUserSteps.i_should_see_the_verify_user_card()"
});
formatter.result({
  "duration": 29973,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Leonardo",
      "offset": 20
    }
  ],
  "location": "RegisterUserSteps.the_Name_should_be(String)"
});
formatter.result({
  "duration": 820755855,
  "status": "passed"
});
formatter.before({
  "duration": 40680359471,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Register a new user",
  "description": "",
  "id": "registration-of-a-new-user;register-a-new-user;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@Create-User-Positive--AcceptanceCriteria01"
    },
    {
      "line": 1,
      "name": "@Register-User--UserStory01"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I am on Selendroid-test-app",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I select Register button",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "fill the Username as \"Leo2\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "fill the E-mail as \"teste@gmail.com\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "fill the password as \"teste2\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "fill the name as \"Leonardo\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "select the programming language as",
  "rows": [
    {
      "cells": [
        "Ruby"
      ],
      "line": 20
    },
    {
      "cells": [
        "PHP"
      ],
      "line": 21
    },
    {
      "cells": [
        "Python"
      ],
      "line": 22
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "check the checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "click Register User button",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I should see the verify user card",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "the Name should be \"Leonardo\"",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterUserSteps.i_am_on()"
});
formatter.result({
  "duration": 25388,
  "status": "passed"
});
formatter.match({
  "location": "RegisterUserSteps.i_select()"
});
formatter.result({
  "duration": 556894676,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Leo2",
      "offset": 22
    }
  ],
  "location": "RegisterUserSteps.fill_the_Username_as(String)"
});
formatter.result({
  "duration": 6978284817,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "teste@gmail.com",
      "offset": 20
    }
  ],
  "location": "RegisterUserSteps.fill_the_E_mail(String)"
});
formatter.result({
  "duration": 7760731355,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "teste2",
      "offset": 22
    }
  ],
  "location": "RegisterUserSteps.fill_the_password(String)"
});
formatter.result({
  "duration": 6813890058,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Leonardo",
      "offset": 18
    }
  ],
  "location": "RegisterUserSteps.fill_the_name(String)"
});
formatter.result({
  "duration": 9639964076,
  "status": "passed"
});
formatter.match({
  "location": "RegisterUserSteps.select_the_programming_language_as_from_dropdown(String\u003e)"
});
formatter.result({
  "duration": 2389359162,
  "status": "passed"
});
formatter.match({
  "location": "RegisterUserSteps.check_the_checkbox()"
});
formatter.result({
  "duration": 883944383,
  "status": "passed"
});
formatter.match({
  "location": "RegisterUserSteps.click_Register_User_button()"
});
formatter.result({
  "duration": 1064066895,
  "status": "passed"
});
formatter.match({
  "location": "RegisterUserSteps.i_should_see_the_verify_user_card()"
});
formatter.result({
  "duration": 69465,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Leonardo",
      "offset": 20
    }
  ],
  "location": "RegisterUserSteps.the_Name_should_be(String)"
});
formatter.result({
  "duration": 768413105,
  "status": "passed"
});
});