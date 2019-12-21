$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Vettylog.feature");
formatter.feature({
  "line": 1,
  "name": "To verify login the functionality",
  "description": "",
  "id": "to-verify-login-the-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 101071165439,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Enter the BackgroudCheck form information",
  "description": "",
  "id": "to-verify-login-the-functionality;enter-the-backgroudcheck-form-information",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@smoke2"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "User Enter the valid info in BackgroudCheck form",
  "keyword": "When "
});
formatter.match({
  "location": "VettyLoginSteps.user_Enter_the_valid_info_in_BackgroudCheck_form()"
});
formatter.result({
  "duration": 247846827,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#middlename\"}\n  (Session info: chrome\u003d79.0.3945.79)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00274.0.0-alpha-3\u0027, revision: \u00278c567de6dc\u0027\nSystem info: host: \u0027DESKTOP-FQ0K5AQ\u0027, ip: \u0027192.168.43.197\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 79.0.3945.79, chrome: {chromedriverVersion: 78.0.3904.70 (edb9c9f3de024..., userDataDir: C:\\Users\\admin\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:29620}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 2642bdd6d3b6af5470fbcbd6cdd5f588\n*** Element info: {Using\u003did, value\u003dmiddlename}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:191)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:125)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:52)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:161)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:576)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:375)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:196)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:319)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy17.sendKeys(Unknown Source)\r\n\tat com.demo.Action.BackgroundCheckFormActions.Backgrougform(BackgroundCheckFormActions.java:9)\r\n\tat com.demo.steps.VettyLoginSteps.user_Enter_the_valid_info_in_BackgroudCheck_form(VettyLoginSteps.java:22)\r\n\tat ✽.When User Enter the valid info in BackgroudCheck form(src/test/resources/Features/Vettylog.feature:11)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 103239680,
  "status": "passed"
});
});