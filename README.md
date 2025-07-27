# Selenium Cucumber Maven Project Documentation

## Overview

This project is a **Selenium automation framework** using **Cucumber** with **Java** and **Maven**. It follows the **Page Object Model (POM)** for maintainability and scalability, making it easy to add new tests and extend functionality.

---

## 📁 Project Structure

```
src/test/java
│── objectRepository/       # Stores Object Repository classes for UI elements
│   ├── PG005_TopUpPayment.java
│   ├── PG006_CardBillPayment.java
│   ├── PG007_BillPayment.java
│   ├── PG004_FundTransfer.java
│   ├── PG012_Donation.java
│   ├── ...
│
│── resources/features/     # Stores feature files for Cucumber scenarios (Gherkin)
│   ├── TC001_Navigation.feature
│   ├── TC002_Login.feature
│   ├── TC003_Dashboard_AccountAndCardSt.feature
│   ├── TC004_MetlifeBillPayment.feature
│   ├── ...
│
│── runners/                # Contains Test Runner class for Cucumber execution
│   ├── TestRunner.java
│
│── stepdefinitions/        # Holds step definition files for Cucumber scenarios
│   ├── Hooks.java
│   ├── PM001_SplashAndLogin.java
│   ├── PM002_Dashboard.java
│   ├── PM003_OwnFundTransfer.java
│   ├── ...
│
│── utils/                  # Utility classes for common functions
│   ├── Base.java
│   ├── Operations.java
```

---

## 🔹 Technologies Used

- **Selenium WebDriver** – UI automation
- **Cucumber** – BDD framework
- **Java** – Programming language
- **Maven** – Dependency management
- **JUnit/TestNG** – Test execution

---

## 🚀 How to Run the Tests

1. **Clone the Repository**
   ```sh
   git clone https://github.com/EftiarHossain/Cucumber_maven.git
   ```

2. **Install Dependencies**
   ```sh
   mvn clean install
   ```

3. **Run Tests Using Maven**
   ```sh
   mvn test
   ```

4. **Run Specific Feature File**
   ```sh
   mvn test -Dcucumber.options="src/test/resources/features/TC002_Login.feature"
   ```

---

## 🛠 Key Components

- **Object Repository (`objectRepository/`)**
  - Java classes storing locators for UI elements, e.g. `PG004_FundTransfer.java`, `PG012_Donation.java`.
- **Feature Files (`resources/features/`)**
  - Contains scenarios written in Gherkin syntax (`Given-When-Then`).
- **Step Definitions (`stepdefinitions/`)**
  - Java classes implementing the steps described in feature files.
- **Runner (`runners/`)**
  - Configures and executes Cucumber tests.
- **Utilities (`utils/`)**
  - Helper classes for setup, teardown, and common actions (e.g. `Base.java`).

---

## 📊 Reports and Logs

- After test execution, reports are generated under:
  ```
  target/cucumber-reports/
  ```

---

## ✨ Best Practices & Tips

- **Page Object Model**: Each page/screen has a dedicated class under `objectRepository`.
- **Scenario Organization**: Feature files should be concise, well-named, and grouped by module or functionality.
- **Reusable Steps**: Step definitions should be built for reuse across scenarios.
- **Utility Classes**: Place all reusable logic (like browser setup or common actions) in the `utils` folder.

---

## 💡 Example: Adding a New Test

1. **Create a Feature File** in `resources/features/` describing the scenario.
2. **Add Page Objects** for new UI elements in `objectRepository/`.
3. **Implement Step Definitions** in `stepdefinitions/` for each step in your feature file.
4. **Run Tests** with Maven to verify.

---

## 🎯 Contributing

Feel free to fork the repository, open issues, or submit pull requests to enhance automation coverage or improve framework capabilities.

---

Happy Testing! 🚀
