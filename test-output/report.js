$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Nayeem/workspace/ABD/WebDriverTest/features/Guru99.feature");
formatter.feature({
  "line": 1,
  "name": "Test Guru99 Demo Site",
  "description": "",
  "id": "test-guru99-demo-site",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Test Guru99 Demo Site Login page",
  "description": "",
  "id": "test-guru99-demo-site;test-guru99-demo-site-login-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Open Browser and Start Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter username and password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "Guru99.Open_Browser_and_Start_Application()"
});
formatter.result({
  "duration": 85137326204,
  "error_message": "org.openqa.selenium.SessionNotCreatedException: session not created exception\nfrom disconnected: Unable to receive message from renderer\n  (Session info: chrome\u003d78.0.3904.97)\n  (Driver info: chromedriver\u003d2.38.552522 (437e6fbedfa8762dec75e2c5b3ddb86763dc9dcb),platform\u003dWindows NT 6.3.9600 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 66.30 seconds\nBuild info: version: \u00272.45.0\u0027, revision: \u00275017cb8e7ca8e37638dc3091b2440b90a1d8686f\u0027, time: \u00272015-02-27 09:10:26\u0027\nSystem info: host: \u0027AbdulRaheem\u0027, ip: \u0027192.168.43.242\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_111\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:204)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:156)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:599)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:240)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:126)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:139)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:171)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:160)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:117)\r\n\tat stepDefinitions.Guru99.Open_Browser_and_Start_Application(Guru99.java:24)\r\n\tat ✽.Given Open Browser and Start Application(C:/Users/Nayeem/workspace/ABD/WebDriverTest/features/Guru99.feature:4)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Guru99.Ente_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Guru99.Click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 10,
  "name": "Capture the error message when user enters invalid credentials",
  "description": "",
  "id": "test-guru99-demo-site;capture-the-error-message-when-user-enters-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "Open Browser and Start Application",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "Enter Username",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Enter Password",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Verify Error message",
  "keyword": "Then "
});
formatter.match({
  "location": "Guru99.Open_Browser_and_Start_Application()"
});
formatter.result({
  "duration": 380657142609002,
  "error_message": "org.openqa.selenium.SessionNotCreatedException: session not created exception\nfrom disconnected: Unable to receive message from renderer\n  (Session info: chrome\u003d78.0.3904.97)\n  (Driver info: chromedriver\u003d2.38.552522 (437e6fbedfa8762dec75e2c5b3ddb86763dc9dcb),platform\u003dWindows NT 6.3.9600 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 380655.54 seconds\nBuild info: version: \u00272.45.0\u0027, revision: \u00275017cb8e7ca8e37638dc3091b2440b90a1d8686f\u0027, time: \u00272015-02-27 09:10:26\u0027\nSystem info: host: \u0027AbdulRaheem\u0027, ip: \u0027127.0.0.1\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_111\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:204)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:156)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:599)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:240)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:126)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:139)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:171)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:160)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:117)\r\n\tat stepDefinitions.Guru99.Open_Browser_and_Start_Application(Guru99.java:24)\r\n\tat ✽.Given Open Browser and Start Application(C:/Users/Nayeem/workspace/ABD/WebDriverTest/features/Guru99.feature:12)\r\n",
  "status": "failed"
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