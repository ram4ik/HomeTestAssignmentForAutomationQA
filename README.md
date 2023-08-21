# Home Test Assignment for Automation QA

## Getting Started

1. Clone this repository to your local machine.
2. Install the required dependencies.
3. Run the smoke test suite using the command:

Feel free to run the
[smoke_api.xml](api_tests/src/main/resources/testng/smoke/smoke_api.xml)
and
[smoke_ui.xml](ui_tests/src/main/resources/tests/smoke_ui.xml)
directly. 
***

## Run tests(API tests only):

```mvn clean test```

## Show report(API tests only):

```mvn allure:serve```

## Generate report(API tests only):

```mvn allure:report```
***

### It is possible to generate Allure report separately for each module.


#### Running the UI and API tests separately using Maven commands:

```mvn -pl ui_tests clean test```
<br>

```mvn -pl api_tests clean test```
***

#### Allure Reports:
```mvn -pl ui_tests allure:report```
<br>

```mvn -pl api_tests allure:report```
***

#### Allure Show Reports:
```mvn -pl ui_tests allure:serve```
<br>

```mvn -pl api_tests allure:serve```
***

#### Merge Allure Reports:
```allure generate <path-to-ui-tests-module>/target/allure-results <path-to-api-tests-module>/target/allure-results -o merged-report```

```allure serve merged-report```

***

### Mobile tests:

#### For iOS tests located in : [iOS tests](mobile_tests/src/test/java/com/automation/ios/tests)

Feel free to run the
[ClipboardTest](mobile_tests/src/test/java/com/automation/ios/tests/ClipboardTest.java)
and
[IOSAlertTest](mobile_tests/src/test/java/com/automation/ios/tests/IOSAlertTest.java)
directly.
***

#### For Android tests located in : [Android tests](mobile_tests/src/test/java/com/automation/android/tests)

Feel free to run the
[AndroidTest](mobile_tests/src/test/java/com/automation/android/tests/AndroidTest.java)
directly.
***
