DEVLOG



This file describes how the project was implemented and structured.







1\. Initial Setup



The project was created as a Maven project using Java 17.  

After generating the basic structure, I cleaned up the default template files and adjusted the folder layout to match the assignment requirements.



A Git repository was initialized at the beginning so the work could be committed incrementally.





2\. Dependency Configuration



The `pom.xml` file was updated to include:



\- RestAssured  

\- Cucumber  

\- JUnit 5  



After configuring dependencies, I verified that the project builds successfully using:



mvn clean test





At this stage, the focus was on making sure the environment and build process were stable before adding test logic.




3\. API Client Implementation



A `JokeClient` class was created in:



src/main/java/api/





This class contains methods responsible for sending requests to the Official Joke API.



The intention was to keep API communication separate from Cucumber step definitions to maintain a clean structure.





4\. Cucumber Configuration



Cucumber was configured with:



\- A runner class in `src/test/java/runners`

\- Step definitions in `src/test/java/steps`

\- Feature files in `src/test/resources/features`



Three different Cucumber approaches were implemented:



\- A basic Scenario  

\- A Scenario Outline with Examples  

\- A Scenario using Background and a Data Table  





5\. Finalization



Before finishing the task:



\- All tests were executed to confirm they pass consistently  

\- The project structure was reviewed and cleaned  

\- README and DEVLOG were added  



The solution intentionally remains minimal, focusing on clarity and correct structure rather than adding unnecessary framework complexity.







Commit Strategy



The work was committed step by step to reflect natural progress:



1\. Repository initialization  

2\. Maven setup and dependencies  

3\. API client implementation  

4\. Cucumber configuration  

5\. Feature scenarios  

6\. Documentation  





AI Usage



AI was primarily used for guidance on organizing the project structure, troubleshooting build or config

