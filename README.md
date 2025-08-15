# Assessment Task – Java Cucumber Maven Project

## Project Overview
This project is a Java-based automation framework using **Maven** and **Cucumber** for behavior-driven testing. The framework includes step definitions, runners, and utility classes to execute and manage automated test scenarios. It is integrated with **GitHub Actions** to allow CI/CD execution, including scheduled runs and manual workflow dispatch.

---

## Project Structure

ASSESSMENT_TASK/
├── .github/
│ └── workflows/
│ └── maven.yml # GitHub Actions workflow
├── src/
│ └── test/
│ └── java/
│ ├── resources/
│ │ └── features/ # Cucumber feature files (e.g., Flight_Search.feature)
│ ├── runners/
│ │ └── TestRunner.java # Cucumber test runner
│ ├── stepdefinitions/
│ │ └── Hooks.java # Before/After hooks
│ └── utils/
│ ├── Base.java
│ ├── FileHelper.java
│ ├── Operations.java
│ └── SoftAssertCollector.java
├── target/ # Compiled files and reports
├── pom.xml # Maven configuration
└── README.md

markdown
Copy
Edit

---

## Features

- **Cucumber Feature Files:** Located in `src/test/java/resources/features/`
- **Step Definitions:** Located in `src/test/java/stepdefinitions/`
- **Runners:** Cucumber runners located in `src/test/java/runners/`
- **Utilities:** Helper classes for reusable operations and assertions
- **CI/CD Integration:** GitHub Actions workflow `maven.yml` supports manual runs

---

## GitHub Actions Workflow (`maven.yml`)

The workflow allows:

1. **Manual Trigger:** Run tests on-demand via **workflow dispatch**
2. **Push/PR Triggers:** Executes when changes are pushed or a PR is opened to the `main` branch

### Steps in Workflow

1. Checkout the repository code
2. Setup JDK 1.8
3. Cache Maven dependencies
4. Build the project using Maven (`mvn package -DskipTests`)
5. Create a downloads directory for test artifacts
6. Execute Cucumber tests with JUnit
7. Upload HTML test reports and any downloaded files as artifacts

---

## Running Tests via GitHub Workflow Dispatch

1. Go to your GitHub repository
2. Navigate to **Actions** → select the workflow **Java CI**
3. Click **Run workflow**
4. Select the branch (`main`) and any optional inputs (if configured)
5. Click **Run workflow**  
   The workflow will build the project, execute tests, and upload reports.

---

## Running Tests Locally

1. Ensure **Java 1.8** and **Maven** are installed
2. Clone the repository:
   git clone <repo-url>
   cd ASSESSMENT_TASK


Build the project:

mvn clean package -DskipTests
Run tests using the TestRunner:

mvn test -Dtest=runners.TestRunner
Test reports will be generated under target/cucumber-html-report.html


Notes
Downloaded files during test execution are saved in $GITHUB_WORKSPACE/downloads
Test execution failures in CI will not fail the workflow (continue-on-error: true)
Artifacts are available for download from the Actions run