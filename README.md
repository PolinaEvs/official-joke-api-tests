
Official Joke API – API Test Automation (Java + Cucumber)

This project contains a small REST API automation framework built to test the Official Joke API.  





**Tech Stack**

\- Java 17  
\- Maven  
\- RestAssured  
\- Cucumber  
\- JUnit 5  



**Project Structure**

pom.xml
README.md
DEVLOG.md
src
├── main/java/api/JokeClient.java
└── test
├── java/runners
├── java/steps
└── resources/features


**\*\*JokeClient.java\*\*** – contains basic methods for calling the API  

**\*\*runners\*\*** – Cucumber test runner  

**\*\*steps\*\*** – step definitions  

**\*\*features\*\*** – Gherkin feature files  





**Requirements**

Make sure the following are installed:

\- Java 17  
\- Maven  



You can verify your setup with:
java -version
mvn -version



**How to Run**

Run all tests:

If needed, you can run a specific runner class:
mvn -Dtest=RunnerClassName test
Replace `RunnerClassName` with the name of the runner.
After execution, test results are available in the `target` directory.


**Sample Test Run Output**

Example console result:

\[INFO] Running tests...
Scenario: Random joke validation PASSED

Scenario: Get joke by ID PASSED

Scenario: Validate joke structure PASSED

BUILD SUCCESS



**Implemented Scenarios**



The project includes three different Cucumber approaches:

1\. \*\*Random joke\*\* – simple Scenario validating status code and response fields  

2\. \*\*Get joke by ID\*\* – implemented using Scenario Outline with Examples  

3\. \*\*Joke structure validation\*\* – uses Background and Data Table  






**AI Usage Disclosure**

AI tools were mainly used for guidance on project structure and file organization, help with resolving configuration and compilation errors, and assistance with dependency setup.

