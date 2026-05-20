# ATB15x - API Automation with Rest Assured & TestNG

> **A comprehensive, hands-on course for mastering API Test Automation using Java, Rest Assured, and TestNG**

```
 _____ _            _____         _   _                _                _
|_   _| |__   ___  |_   _|__  ___| |_(_)_ __   __ _   / \   ___ __ _ __| | ___ _ __ ___  _   _
  | | | '_ \ / _ \   | |/ _ \/ __| __| | '_ \ / _` | / _ \ / __/ _` / _` |/ _ \ '_ ` _ \| | | |
  | | | | | |  __/   | |  __/\__ \ |_| | | | | (_| |/ ___ \ (_| (_| \__,_|  __/ | | | | | |_| |
  |_| |_| |_|\___|   |_|\___||___/\__|_|_| |_|\__, /_/   \_\___\__,_|____/\___|_| |_| |_|\__, |
                                               |___/                                      |___/
```

---

## About the Instructor

**Pramod Dutta** | Founder & Lead Instructor, [The Testing Academy](https://thetestingacademy.com)

- 14+ years of experience in Software Testing & Test Automation
- YouTube: [The Testing Academy](https://www.youtube.com/@TheTestingAcademy)
- LinkedIn: [Pramod Dutta](https://www.linkedin.com/in/intelpramod/)
- Created 50+ courses on Test Automation, API Testing, Performance Testing, and DevOps
- Trained 100,000+ students and professionals worldwide
- Expert in Rest Assured, Selenium, Playwright, Appium, and CI/CD pipelines

---

## Table of Contents

- [Course Overview](#course-overview)
- [Technology Stack](#technology-stack)
- [Project Architecture](#project-architecture)
- [Prerequisites](#prerequisites)
- [Setup & Installation](#setup--installation)
- [Chapter 1: Hello World with Rest Assured](#chapter-1-hello-world-with-rest-assured)
- [Chapter 2: Rest Assured Basics & Design Patterns](#chapter-2-rest-assured-basics--design-patterns)
- [Chapter 3: CRUD Operations - Advanced REST Assured with TestNG](#chapter-3-crud-operations---advanced-rest-assured-with-testng)
- [Chapter 4: TestNG Advanced Features](#chapter-4-testng-advanced-features)
- [TestNG XML Configuration Files](#testng-xml-configuration-files)
- [Allure Reporting](#allure-reporting)
- [API Reference - Restful Booker](#api-reference---restful-booker)
- [Quick Reference Cheat Sheet](#quick-reference-cheat-sheet)
- [How to Run Tests](#how-to-run-tests)
- [Troubleshooting](#troubleshooting)

---

## Course Overview

This repository contains all the source code and examples from the **ATB15x API Automation Program** by The Testing Academy. The course takes you from zero to proficient in API test automation using **Rest Assured** (the most popular Java library for REST API testing) combined with **TestNG** (a powerful testing framework).

### What You Will Learn

```
+---------------------+     +------------------------+     +-------------------------+
|   Chapter 1         |     |   Chapter 2            |     |   Chapter 3             |
|   Hello World       |---->|   Basics & Patterns    |---->|   CRUD Operations       |
|   - First API Test  |     |   - Normal vs Builder  |     |   - GET, POST, PUT      |
|   - BDD Syntax      |     |   - Method Chaining    |     |   - PATCH, DELETE       |
|   - given/when/then |     |   - Multiple Tests     |     |   - BDD vs Non-BDD      |
+---------------------+     +------------------------+     +-------------------------+
                                                                      |
                                                                      v
                                                           +-------------------------+
                                                           |   Chapter 4             |
                                                           |   TestNG Advanced       |
                                                           |   - Annotations         |
                                                           |   - Groups, Priority    |
                                                           |   - Parameters, Depends |
                                                           |   - Allure Reporting    |
                                                           +-------------------------+
```

---

## Technology Stack

| Technology       | Version  | Purpose                                    |
|-----------------|----------|--------------------------------------------|
| **Java**        | 11+      | Programming language                       |
| **Maven**       | 3.8+     | Build tool & dependency management         |
| **Rest Assured**| 6.0.0    | REST API testing library                   |
| **TestNG**      | 7.12.0   | Testing framework                          |
| **Allure**      | 2.33.0   | Test reporting framework                   |
| **AssertJ**     | 3.27.7   | Fluent assertion library                   |
| **Apache POI**  | 5.3.0    | Excel file handling (data-driven testing)  |
| **Log4j**       | 2.23.1   | Logging framework                          |
| **dotenv-java** | 3.0.0    | Environment variable management            |
| **SnakeYAML**   | 2.2      | YAML configuration parsing                 |

---

## Project Architecture

```
ATB15xAPIAutomationPrograms/
|
+-- pom.xml                          # Maven configuration & dependencies
+-- testng.xml                       # Default TestNG suite configuration
+-- testng_01.xml                    # Formatted TestNG suite
+-- testng_group_smoke.xml           # Run only "smoke" group tests
+-- testng_group_reg.xml             # Run only "reg" (regression) group tests
+-- testng_group_ssanity.xml         # Run only "sanity" group tests
+-- testng_param_chrome.xml          # Parameterized run - Chrome browser
+-- testng_param_firefox.xml         # Parameterized run - Firefox browser
+-- allure-results/                  # Allure test execution results
|
+-- src/test/java/com/thetestingacademy/
    |
    +-- ex_01_RestAssured_HelloWorld/     # Chapter 1: Getting Started
    |   +-- HelloWorld.java              #   Lab 01 - First Rest Assured test
    |   +-- HelloWordl_RA.java           #   Lab 02 - Compact BDD style
    |
    +-- ex_02_RestAssured_Basics/        # Chapter 2: Core Concepts
    |   +-- APITesting_Lab03_NP.java     #   Lab 03 - Normal calling pattern
    |   +-- APITesting_Lab04_BuilderPattern.java  # Lab 04 - Builder/Fluent pattern
    |   +-- APITesting_Lab05_Multiple_TestCase.java # Lab 05 - Multiple test cases
    |
    +-- ex_03_RestAssured_TestNG_Advance/ # Chapter 3: CRUD with REST APIs
    |   +-- GET/                         #   GET request examples
    |   |   +-- APITesting008_GET_BDDStyle.java
    |   |   +-- APITesting009_GET_NONBDD_STYLE.java
    |   |   +-- APITesting_Lab06_TestCase.java
    |   |   +-- APITesting_Lab_07_TestCase.java
    |   +-- POST/                        #   POST request examples
    |   |   +-- APITesting010_POST_BDDStyle.java
    |   |   +-- APITesting011_POST_NonBDDStyle.java
    |   +-- PUT/                         #   PUT request examples
    |   |   +-- APITesting011_PUT_NONBddStyle.java
    |   +-- PATCH/                       #   PATCH request examples
    |   |   +-- APITesting012_PATCH_NONBddStyle.java
    |   +-- DELETE/                      #   DELETE request examples
    |       +-- APITesting013_DELETE_NONBddStyle.java
    |
    +-- ex_04_TestNGAdvanceExample/      # Chapter 4: TestNG Deep Dive
        +-- APITesting014_TestNG_Basics.java
        +-- APITesting015_BeforeTest.java
        +-- APITesting016_TestNG_Priority.java
        +-- APITesting017_TestNG_Groups.java
        +-- APITesting018_TestNG_DependsOnMethod.java
        +-- APITesting019_TestNG_Parameter.java
        +-- APITesting020_TestNG_Enabled.java
        +-- APITesting021_TestNG_AlwaysRun.java
        +-- APITesting022_TestNG_invocationCount.java
        +-- APITesting023_All_Annotations.java
        +-- APITesting024_All_Annotations.java
```

---

## Prerequisites

Before starting this course, ensure you have:

- **Java JDK 11 or higher** installed ([Download](https://www.oracle.com/java/technologies/downloads/))
- **Apache Maven 3.8+** installed ([Download](https://maven.apache.org/download.cgi))
- **IntelliJ IDEA** (Community or Ultimate) or any Java IDE
- Basic understanding of:
  - Java programming (classes, methods, objects)
  - HTTP methods (GET, POST, PUT, PATCH, DELETE)
  - JSON format
  - What APIs are and how they work

---

## Setup & Installation

```bash
# 1. Clone the repository
git clone https://github.com/PramodDutta/ATB15xAPIAutomationPrograms.git

# 2. Navigate to the project directory
cd ATB15xAPIAutomationPrograms

# 3. Install dependencies
mvn clean install -DskipTests

# 4. Run all tests
mvn test

# 5. Run a specific TestNG XML suite
mvn test -DsuiteXmlFile=testng.xml
```

---

## Chapter 1: Hello World with Rest Assured

> **Package:** `com.thetestingacademy.ex_01_RestAssured_HelloWorld`
>
> **Goal:** Write your very first API test and understand the BDD syntax of Rest Assured.

### What is Rest Assured?

Rest Assured is an open-source Java library that provides a domain-specific language (DSL) for testing RESTful APIs. It simplifies the process of sending HTTP requests and validating responses by offering a fluent, human-readable syntax built on the **Given-When-Then** (BDD) pattern.

### The Given-When-Then Pattern

```
+-------------------------------------------+
|          REST ASSURED BDD FLOW            |
+-------------------------------------------+
|                                           |
|   GIVEN  (Pre-conditions / Setup)         |
|   +-- Base URI                            |
|   +-- Base Path                           |
|   +-- Headers, Auth, Params               |
|                                           |
|   WHEN   (Action / HTTP Request)          |
|   +-- GET / POST / PUT / PATCH / DELETE   |
|                                           |
|   THEN   (Validation / Assertions)        |
|   +-- Status Code                         |
|   +-- Response Body                       |
|   +-- Headers                             |
|                                           |
+-------------------------------------------+
```

### Lab 01 - First Rest Assured Test (`HelloWorld.java`)

This is your very first API test. It hits the `/ping` endpoint of the Restful Booker API to check if the server is alive.

```java
@Test
public void testHelloWorld(){
    RestAssured
        // Step 1 - Request Setup (GIVEN)
        .given()
            .baseUri("https://restful-booker.herokuapp.com")
            .basePath("/ping")
        // Step 2 - Action (WHEN)
        .when()
            .get()
        // Step 3 - Validation (THEN)
        .then()
            .statusCode(200);
}
```

**Explanation:**
| Part | What It Does |
|------|-------------|
| `.given()` | Starts building the request specification |
| `.baseUri(...)` | Sets the base URL of the API |
| `.basePath(...)` | Sets the endpoint path |
| `.when()` | Transition to the action phase |
| `.get()` | Sends an HTTP GET request |
| `.then()` | Transition to the validation phase |
| `.statusCode(200)` | Asserts the response status is 200 OK |

### Lab 02 - Compact BDD Style with Logging (`HelloWordl_RA.java`)

A more compact, single-line style with full request/response logging.

```java
@Test
public void test_RA(){
    RestAssured.given()
        .baseUri("https://google.com")
        .log().all()        // Log the entire request
    .when()
        .get()
    .then()
        .statusCode(200)
        .log().all();       // Log the entire response
}
```

**Key Takeaway:** `.log().all()` is invaluable for debugging. It prints full request and response details to the console, including headers, body, cookies, and more.

### Logging Options in Rest Assured

| Method | What It Logs |
|--------|-------------|
| `.log().all()` | Everything (headers, body, status, etc.) |
| `.log().body()` | Only the body |
| `.log().headers()` | Only the headers |
| `.log().status()` | Only the status line |
| `.log().ifError()` | Only if an error occurs |
| `.log().ifValidationFails()` | Only if validation fails |

---

## Chapter 2: Rest Assured Basics & Design Patterns

> **Package:** `com.thetestingacademy.ex_02_RestAssured_Basics`
>
> **Goal:** Understand the Builder Pattern that powers Rest Assured's fluent API, and write multiple test cases.

### Lab 03 - Normal (Procedural) Calling Pattern (`APITesting_Lab03_NP.java`)

This lab demonstrates the traditional way of calling methods sequentially without chaining.

```java
public class APITesting_Lab03_NP {

    public void step1() {
        System.out.println("Step 1");
    }
    public void step2() {
        System.out.println("Step 2");
    }
    public void step3(String param1) {
        System.out.println("Step 3");
    }

    public static void main(String[] args) {
        APITesting_Lab03_NP np = new APITesting_Lab03_NP();
        np.step1();    // Each call is a separate statement
        np.step2();    // Cannot chain - methods return void
        np.step3("Pramod");
    }
}
```

**Key Point:** Each method returns `void`, so you must call each method on a separate line using the object reference.

### Lab 04 - Builder (Fluent) Pattern (`APITesting_Lab04_BuilderPattern.java`)

This is the **Builder Pattern** - the same design pattern that powers Rest Assured's fluent API.

```java
public class APITesting_Lab04_BuilderPattern {

    public APITesting_Lab04_BuilderPattern step1() {
        System.out.println("Step 1");
        return this;    // Returns the same object!
    }

    public APITesting_Lab04_BuilderPattern step2() {
        System.out.println("Step 2");
        return this;    // Returns the same object!
    }

    public APITesting_Lab04_BuilderPattern step3(String param1) {
        System.out.println("Step 3");
        return this;    // Returns the same object!
    }

    public static void main(String[] args) {
        APITesting_Lab04_BuilderPattern bp = new APITesting_Lab04_BuilderPattern();
        bp.step1().step2().step3("Pramod");  // Method chaining!
    }
}
```

**Why This Matters:**

```
Normal Pattern:                    Builder Pattern:
+-----------------+                +----------------------------------+
| np.step1();     |                | bp.step1()                       |
| np.step2();     |    VS          |   .step2()                       |
| np.step3("P");  |                |   .step3("Pramod");              |
+-----------------+                +----------------------------------+
  3 statements                       1 chained statement (fluent!)

  Each method returns void           Each method returns 'this'
```

Rest Assured uses this exact pattern:
```java
RestAssured.given()    // returns RequestSpecification
    .baseUri(...)      // returns RequestSpecification
    .basePath(...)     // returns RequestSpecification
    .when()            // returns RequestSender
    .get()             // returns Response
    .then()            // returns ValidatableResponse
    .statusCode(200);  // returns ValidatableResponse
```

### Lab 05 - Writing Multiple Test Cases (`APITesting_Lab05_Multiple_TestCase.java`)

This lab shows how to write positive and negative test cases for the same API endpoint.

```java
@Test
public void test_Positive_tc1(){
    String pincode = "110048";         // Valid Indian pincode
    RestAssured.given()
        .baseUri("https://api.zippopotam.us")
        .basePath("/IN/" + pincode)
    .when().get()
    .then().log().all().statusCode(200);
}

@Test
public void test_Negative_tc1(){
    String pincode = "@";              // Invalid special character
    RestAssured.given()
        .baseUri("https://api.zippopotam.us")
        .basePath("/IN/" + pincode)
    .when().get()
    .then().log().all().statusCode(200);
}

@Test
public void test_Negative_tc2(){
    String pincode = " ";              // Empty/space value
    RestAssured.given()
        .baseUri("https://api.zippopotam.us")
        .basePath("/IN/" + pincode)
    .when().get()
    .then().log().all().statusCode(200);
}
```

**Testing Strategy:**

```
+------------------+-------------------+------------------+
|   Positive Test  |   Negative Test 1 |  Negative Test 2 |
+------------------+-------------------+------------------+
|  Valid pincode   |  Special char "@" |  Empty space " " |
|  "110048"        |  Expect: failure  |  Expect: failure |
|  Expect: 200 OK  |                   |                  |
+------------------+-------------------+------------------+

Always test BOTH happy path and edge cases!
```

---

## Chapter 3: CRUD Operations - Advanced REST Assured with TestNG

> **Package:** `com.thetestingacademy.ex_03_RestAssured_TestNG_Advance`
>
> **Goal:** Master all HTTP methods (GET, POST, PUT, PATCH, DELETE) in both BDD and Non-BDD styles using the Restful Booker API.

### Understanding CRUD and HTTP Methods

```
+----------+-------------+------------------------------------------+
|   CRUD   | HTTP Method | Description                              |
+----------+-------------+------------------------------------------+
|  Create  |    POST     | Create a new resource                    |
|  Read    |    GET      | Retrieve/read a resource                 |
|  Update  |    PUT      | Update an entire resource (full replace) |
|  Update  |    PATCH    | Update part of a resource (partial)      |
|  Delete  |    DELETE   | Remove a resource                        |
+----------+-------------+------------------------------------------+
```

### BDD Style vs Non-BDD Style

This course teaches **both** approaches so you can choose the best one for your project:

```
+-------------------------------+     +-------------------------------+
|       BDD STYLE               |     |       NON-BDD STYLE           |
+-------------------------------+     +-------------------------------+
|                               |     |                               |
| RestAssured                   |     | RequestSpecification r;       |
|   .given()                    |     | Response response;            |
|     .baseUri(url)             |     | ValidatableResponse vr;       |
|     .basePath(path)           |     |                               |
|     .contentType(JSON)        |     | r = RestAssured.given();      |
|     .body(payload)            |     | r.baseUri(url);               |
|   .when()                     |     | r.basePath(path);             |
|     .post()                   |     | r.contentType(JSON);          |
|   .then()                     |     | r.body(payload);              |
|     .statusCode(200);         |     |                               |
|                               |     | response = r.when().post();   |
| Single fluent chain           |     |                               |
| Compact & readable            |     | vr = response.then();         |
| Good for simple tests         |     | vr.statusCode(200);           |
|                               |     |                               |
+-------------------------------+     | Step-by-step control          |
                                      | Easy to debug                 |
                                      | Good for complex scenarios    |
                                      +-------------------------------+
```

### 3.1 GET Requests

#### Lab 06 - GET with BDD Style (`APITesting008_GET_BDDStyle.java`)

```java
@Test
public void test_GET_POSITIVE(){
    String pincode = "110048";
    RestAssured
        .given()
            .baseUri("https://api.zippopotam.us")
            .basePath("/IN/" + pincode)
        .when()
            .get()
        .then()
            .log().all()
            .statusCode(200);
}
```

#### Lab 07 - GET with Non-BDD Style (`APITesting009_GET_NONBDD_STYLE.java`)

The Non-BDD style breaks the request into three distinct parts using **separate variables**:

```java
RequestSpecification r;       // Holds request configuration
Response response;            // Holds the raw response
ValidatableResponse vr;       // Allows validation on the response

@Test
public void test_GET_NON_BDD_STYLE(){
    pincode = "560049";

    // PART 1: Build the request
    r = RestAssured.given();
    r.baseUri("https://api.zippopotam.us");
    r.basePath("/IN/" + pincode);

    // PART 2: Execute the request
    response = r.when().log().all().get();
    System.out.println(response.asString());  // Print raw response

    // PART 3: Validate the response
    vr = response.then().log().all();
    vr.statusCode(200);
}
```

**The Three Key Interfaces:**

```
+-------------------------+     +------------------+     +----------------------+
| RequestSpecification    |---->| Response         |---->| ValidatableResponse  |
+-------------------------+     +------------------+     +----------------------+
| .baseUri()              |     | .asString()      |     | .statusCode()        |
| .basePath()             |     | .getStatusCode() |     | .body()              |
| .header()               |     | .getBody()       |     | .header()            |
| .contentType()          |     | .getHeaders()    |     | .contentType()       |
| .body()                 |     | .getCookies()    |     | .log()               |
| .cookie()               |     | .jsonPath()      |     |                      |
| .queryParam()           |     | .getTime()       |     |                      |
+-------------------------+     +------------------+     +----------------------+
     GIVEN phase                   WHEN phase                THEN phase
```

#### Lab 08 & 09 - Positive & Negative GET Tests (`APITesting_Lab06_TestCase.java`)

Demonstrates testing across different countries and invalid inputs:

```java
// Positive: Valid Indian pincode
@Test
public void test_GET_POSITIVE_TC1(){
    RestAssured.given()
        .baseUri("https://api.zippopotam.us")
        .basePath("/IN/110048")
    .when().get()
    .then().log().all().statusCode(200);
}

// Negative: Special character
@Test
public void test_GET_NEGATIVE_TC2(){
    RestAssured.given()
        .baseUri("https://api.zippopotam.us")
        .basePath("/IN/@")
    .when().get()
    .then().log().all().statusCode(200);  // Will fail - good for learning!
}

// Negative: Different country with empty pincode
@Test
public void test_GET_NEGATIVE_TC3(){
    RestAssured.given()
        .baseUri("https://api.zippopotam.us")
        .basePath("/USA/ ")
    .when().get()
    .then().log().all().statusCode(200);
}
```

#### Lab 10 - Enabled/Disabled Tests (`APITesting_Lab_07_TestCase.java`)

```java
@Test
public void test_01(){ }          // Runs normally

@Test(enabled = false)
public void test_02(){ }          // SKIPPED - will not execute

@Test
public void test_03(){ }          // Runs normally
```

### 3.2 POST Requests

#### Lab 11 - POST with BDD Style (`APITesting010_POST_BDDStyle.java`)

Creating an auth token using the Restful Booker API:

```java
@Test
public void test_POST_AUTH_TOKEN(){
    String base_url = "https://restful-booker.herokuapp.com";
    String path_url = "/auth";
    String payload  = "{\n" +
            "    \"username\" : \"admin\",\n" +
            "    \"password\" : \"password123\"\n" +
            "}";

    RestAssured.given()
            .baseUri(base_url)
            .basePath(path_url)
            .contentType(ContentType.JSON)  // Set Content-Type header
            .log().all()
            .body(payload)                  // Attach JSON payload
        .when()
            .post()                         // HTTP POST method
        .then()
            .log().all()
            .statusCode(200);
}
```

**POST Request Flow:**

```
Client                              Server
  |                                   |
  |  POST /auth                       |
  |  Content-Type: application/json   |
  |  Body: { username, password }     |
  |---------------------------------->|
  |                                   |
  |  200 OK                           |
  |  Body: { "token": "abc123" }      |
  |<----------------------------------|
  |                                   |
```

#### Lab 12 - POST with Non-BDD Style (`APITesting011_POST_NonBDDStyle.java`)

```java
RequestSpecification r;
Response response;
ValidatableResponse vr;

@Test
public void test_POST_NonBDDStyle_Create_Token() {
    String payload = "{ \"username\" : \"admin\", \"password\" : \"password123\" }";

    // Part 1: Build the request
    r = RestAssured.given();
    r.baseUri("https://restful-booker.herokuapp.com");
    r.basePath("/auth");
    r.contentType(ContentType.JSON);
    r.body(payload).log().all();

    // Part 2: Execute the request
    response = r.when().log().all().post();

    // Part 3: Validate the response
    vr = response.then().log().all();
    vr.statusCode(200);
}
```

### 3.3 PUT Requests (Full Update)

#### Lab 13 - PUT with Non-BDD Style (`APITesting011_PUT_NONBddStyle.java`)

PUT replaces the **entire** resource. You must send all fields, even those that haven't changed.

```java
@Test
public void test_non_bdd_put(){
    String token = "52b89e9e26f74aa";
    String bookingid = "248";

    String payload = "{\n" +
        "    \"firstname\" : \"James\",\n" +
        "    \"lastname\" : \"Brown\",\n" +
        "    \"totalprice\" : 111,\n" +
        "    \"depositpaid\" : true,\n" +
        "    \"bookingdates\" : {\n" +
        "        \"checkin\" : \"2018-01-01\",\n" +
        "        \"checkout\" : \"2019-01-01\"\n" +
        "    },\n" +
        "    \"additionalneeds\" : \"Breakfast\"\n" +
        "}";

    r = RestAssured.given();
    r.baseUri("https://restful-booker.herokuapp.com");
    r.basePath("/booking/" + bookingid);
    r.contentType(ContentType.JSON);
    r.cookie("token", token);           // Authentication via cookie
    r.body(payload).log().all();

    response = r.when().log().all().put();

    vr = response.then().log().all();
    vr.statusCode(200);
}
```

**Key Concepts for PUT:**
- Requires **authentication** (token via cookie)
- Requires a **booking ID** in the URL path
- Sends the **complete** resource body
- Replaces the entire booking record

### 3.4 PATCH Requests (Partial Update)

#### Lab 14 - PATCH with Non-BDD Style (`APITesting012_PATCH_NONBddStyle.java`)

PATCH only updates the fields you send - other fields remain unchanged.

```java
@Test
public void test_Patch(){
    String token = "52b89e9e26f74aa";
    String bookingid = "248";

    // Only updating firstname and lastname
    String payload = "{\n" +
        "    \"firstname\" : \"Pramod\",\n" +
        "    \"lastname\" : \"Brown\"\n" +
        "}";

    r = RestAssured.given();
    r.baseUri("https://restful-booker.herokuapp.com");
    r.basePath("/booking/" + bookingid);
    r.contentType(ContentType.JSON);
    r.cookie("token", token);
    r.body(payload).log().all();

    response = r.when().log().all().patch();   // PATCH, not PUT

    vr = response.then().log().all();
    vr.statusCode(200);
}
```

**PUT vs PATCH:**

```
PUT (Full Update)                    PATCH (Partial Update)
+------------------------------+     +------------------------------+
| Must send ALL fields:        |     | Only send changed fields:    |
|   firstname: "James"         |     |   firstname: "Pramod"        |
|   lastname: "Brown"          |     |   lastname: "Brown"          |
|   totalprice: 111            |     |                              |
|   depositpaid: true          |     | Other fields are preserved   |
|   bookingdates: {...}        |     | on the server automatically  |
|   additionalneeds: "..."     |     |                              |
+------------------------------+     +------------------------------+
```

### 3.5 DELETE Requests

#### Lab 15 - DELETE with Non-BDD Style (`APITesting013_DELETE_NONBddStyle.java`)

```java
@Test
public void test_put_non_bdd() {
    String token = "52b89e9e26f74aa";
    String bookingid = "248";

    r = RestAssured.given();
    r.baseUri("https://restful-booker.herokuapp.com");
    r.basePath("/booking/" + bookingid);
    r.contentType(ContentType.JSON);
    r.cookie("token", token);               // Auth required

    response = r.when().log().all().delete(); // No body needed

    vr = response.then().log().all();
    vr.statusCode(201);                      // 201 Created (Restful Booker returns this)
}
```

**Key Point:** DELETE requests typically don't have a request body. You only need the resource identifier in the URL and proper authentication.

### Complete CRUD Lifecycle

```
Step 1: POST /auth           --> Get authentication token
         |
Step 2: POST /booking        --> Create a new booking (get booking ID)
         |
Step 3: GET /booking/:id     --> Read/verify the booking
         |
Step 4: PUT /booking/:id     --> Update the entire booking
         |
Step 5: PATCH /booking/:id   --> Partially update the booking
         |
Step 6: DELETE /booking/:id  --> Delete the booking
         |
Step 7: GET /booking/:id     --> Verify deletion (expect 404)
```

---

## Chapter 4: TestNG Advanced Features

> **Package:** `com.thetestingacademy.ex_04_TestNGAdvanceExample`
>
> **Goal:** Master TestNG annotations, execution control, grouping, parameterization, and test lifecycle management.

### 4.1 TestNG Basics (`APITesting014_TestNG_Basics.java`)

Only methods annotated with `@Test` are recognized and executed by TestNG:

```java
public void test_tc1(){          // NOT a test - no @Test annotation
    // This will NOT be executed by TestNG
}

@Test
public void test_tc2(){          // IS a test - has @Test annotation
    // This WILL be executed by TestNG
}
```

### 4.2 @BeforeTest and @AfterTest (`APITesting015_BeforeTest.java`)

Setup and teardown methods that run before and after all test methods in a `<test>` tag:

```java
@BeforeTest
public void getToken(){                  // Runs BEFORE all tests
    System.out.println("Before GET token");
}

@BeforeTest
public void getBookingID(){              // Also runs BEFORE all tests
    System.out.println("Before GET BOOKING");
}

@Test
public void test_PUT(){                  // The actual test
    System.out.println("PUT REQUEST");
}

@AfterTest
public void closeAllThings(){            // Runs AFTER all tests
    System.out.println("Close");
}
```

**Execution Order:**

```
+------------------+
| @BeforeTest      |  getToken()
| @BeforeTest      |  getBookingID()
+------------------+
        |
        v
+------------------+
| @Test            |  test_PUT()
+------------------+
        |
        v
+------------------+
| @AfterTest       |  closeAllThings()
+------------------+
```

**Real-World Use Case:** In API testing, `@BeforeTest` is perfect for getting auth tokens and creating prerequisite data (like booking IDs) that your tests depend on.

### 4.3 Test Priority (`APITesting016_TestNG_Priority.java`)

Control the execution order of test methods using the `priority` attribute:

```java
@Test(priority = 3)
public void test_t1() { System.out.println("1"); }

@Test(priority = -1)    // Lowest number = highest priority
public void test_t4() { System.out.println("Highest!"); }

@Test(priority = 1)
public void test_t2() { System.out.println("2"); }

@Test(priority = 2)
public void test_t3() { System.out.println("3"); }
```

**Execution Order:**

```
Priority:  -1  -->  1  -->  2  -->  3
Method:   t4  --> t2  --> t3  --> t1
Output:   "Highest!" --> "2" --> "3" --> "1"

Rules:
- Default priority = 0
- Lower number = runs first
- Negative numbers are allowed
- Methods with same priority run in alphabetical order
```

### 4.4 Test Groups (`APITesting017_TestNG_Groups.java`)

Organize tests into logical groups like smoke, sanity, and regression:

```java
@Test(groups = {"sanity", "reg"})     // Belongs to BOTH sanity AND regression
public void test_sanityRun() {
    System.out.println("Sanity");
    Assert.assertTrue(true);
}

@Test(groups = {"reg"})               // Belongs to regression only
public void test_regRun() {
    System.out.println("Reg");
    Assert.assertTrue(false);          // Will FAIL intentionally
}

@Test(groups = {"smoke"})             // Belongs to smoke only
public void test_smokeRun() {
    System.out.println("Smoke");
    Assert.assertTrue(false);          // Will FAIL intentionally
}
```

**Running specific groups via TestNG XML:**

```xml
<!-- testng_group_smoke.xml - Run only smoke tests -->
<groups>
    <run>
        <include name="smoke"/>
    </run>
</groups>

<!-- testng_group_ssanity.xml - Run only sanity tests -->
<groups>
    <run>
        <include name="sanity"/>
        <!-- <exclude name="reg"/> -->   <!-- Can also exclude groups -->
    </run>
</groups>
```

**Group Organization:**

```
+-------------------+-------------------+-------------------+
|    SMOKE          |     SANITY        |    REGRESSION     |
|    (Quick check)  |   (Core flows)    |   (Full coverage) |
+-------------------+-------------------+-------------------+
|                   | test_sanityRun    | test_sanityRun    |
|                   |                   | test_regRun       |
| test_smokeRun     |                   |                   |
+-------------------+-------------------+-------------------+
  Run: Every build     Run: Daily          Run: Before release
  Time: < 5 min        Time: 15-30 min     Time: 1-2 hours
```

### 4.5 Depends on Methods (`APITesting018_TestNG_DependsOnMethod.java`)

Create test dependencies where a test only runs if its prerequisite passes:

```java
@Test
public void serverStartedOk() {
    System.out.println("I will run first");
    Assert.assertTrue(true);
}

@Test(dependsOnMethods = "serverStartedOk")
public void test1() {                          // Runs only if serverStartedOk passes
    System.out.println("method1");
}

@Test(dependsOnMethods = "serverStartedOk")
public void test2() {                          // Also depends on serverStartedOk
    System.out.println("method2");
}
```

**Dependency Graph:**

```
        +-------------------+
        | serverStartedOk() |
        +-------------------+
               /       \
              v         v
      +---------+   +---------+
      |  test1  |   |  test2  |
      +---------+   +---------+

If serverStartedOk() FAILS:
  - test1() is SKIPPED (not failed)
  - test2() is SKIPPED (not failed)
```

### 4.6 Parameters from TestNG XML (`APITesting019_TestNG_Parameter.java`)

Pass values from TestNG XML configuration files into your test methods:

```java
@Parameters("browser")
@Test
public void demo1(String value) {
    System.out.println("You are running this param");

    if(value.equalsIgnoreCase("firefox")){
        System.out.println("Start the firefox");
    }
    if(value.equalsIgnoreCase("chrome")){
        System.out.println("Start the chrome!");
    }
}
```

**TestNG XML for Chrome:**
```xml
<!-- testng_param_chrome.xml -->
<parameter name="browser" value="chrome"/>
<classes>
    <class name="...APITesting019_TestNG_Parameter"/>
</classes>
```

**TestNG XML for Firefox:**
```xml
<!-- testng_param_firefox.xml -->
<parameter name="browser" value="firefox"/>
<classes>
    <class name="...APITesting019_TestNG_Parameter"/>
</classes>
```

**Use Case:** Run the same test suite across different browsers or environments without changing the code.

```
testng_param_chrome.xml  --> browser="chrome"  --> Start Chrome!
testng_param_firefox.xml --> browser="firefox" --> Start Firefox!
```

### 4.7 Enabled / Disabled Tests (`APITesting020_TestNG_Enabled.java`)

Skip specific tests without removing or commenting out the code:

```java
@Test
public void test01() {
    Assert.assertTrue(false);       // This runs and FAILS
}

@Test(enabled = false)              // SKIPPED - will not execute at all
public void test02() {
    Assert.assertTrue(true);
}

@Test
public void test03() {
    Assert.assertTrue(true);        // This runs and PASSES
}
```

**When to use `enabled = false`:**
- Test is flaky and needs investigation
- Feature is not yet ready
- Test is for a different environment
- Temporary skip during development

### 4.8 Always Run (`APITesting021_TestNG_AlwaysRun.java`)

Force a test to run even if its dependencies have failed:

```java
@Test
public void test_new_register() {
    Assert.assertTrue(true);
}

@Test(alwaysRun = true)          // Runs regardless of other test outcomes
public void test_loginPage() {
    Assert.assertTrue(true);
}

@Test
public void test_normal() {
    Assert.assertTrue(true);
}
```

**Use Case:** `alwaysRun = true` is critical for cleanup methods that must execute even when tests fail, such as deleting test data or closing connections.

### 4.9 Invocation Count (`APITesting022_TestNG_invocationCount.java`)

Run a test method multiple times automatically:

```java
@Test(invocationCount = 2)       // Executes this test 2 times
public void test01(){
    System.out.println("Hi");    // Prints "Hi" twice
}

@Test(invocationCount = 3)       // Executes this test 3 times
public void test02(){
    System.out.println("Bye");   // Prints "Bye" three times
}
```

**Use Cases:**
- **Load testing:** Simulate multiple requests
- **Flaky test detection:** Run a test many times to check reliability
- **Stress testing:** Verify API can handle repeated calls

### 4.10 All TestNG Annotations - Complete Lifecycle (`APITesting023_All_Annotations.java`)

The full TestNG annotation lifecycle in order:

```java
@BeforeSuite    void demo1(){ System.out.println("BeforeSuite");  }
@BeforeTest     void demo2(){ System.out.println("BeforeTest");   }
@BeforeClass    void demo3(){ System.out.println("BeforeClass");  }
@BeforeMethod   void demo4(){ System.out.println("BeforeMethod"); }
@Test           void demo5(){ System.out.println("Test");         }
@AfterMethod    void demo6(){ System.out.println("AfterMethod");  }
@AfterClass     void demo7(){ System.out.println("AfterClass");   }
@AfterTest      void demo8(){ System.out.println("AfterTest");    }
@AfterSuite     void demo9(){ System.out.println("AfterSuite");   }
```

**Complete Execution Flow:**

```
+-----------------------------------------------------------------------+
|                        TestNG Execution Lifecycle                      |
+-----------------------------------------------------------------------+
|                                                                       |
|  @BeforeSuite   ----+  Runs ONCE before the entire suite              |
|                     |                                                 |
|  @BeforeTest    ----+  Runs before each <test> in XML                 |
|                     |                                                 |
|  @BeforeClass   ----+  Runs before the first method in a class        |
|                     |                                                 |
|  +-- @BeforeMethod -+  Runs before EACH @Test method                  |
|  |                   |                                                |
|  |   @Test       ----+  The actual test method                        |
|  |                   |                                                |
|  +-- @AfterMethod --+  Runs after EACH @Test method                   |
|                     |                                                 |
|  @AfterClass    ----+  Runs after the last method in a class          |
|                     |                                                 |
|  @AfterTest     ----+  Runs after each <test> in XML                  |
|                     |                                                 |
|  @AfterSuite    ----+  Runs ONCE after the entire suite               |
|                                                                       |
+-----------------------------------------------------------------------+
```

**When to Use Each Annotation:**

| Annotation | Scope | Use Case |
|-----------|-------|----------|
| `@BeforeSuite` | Entire suite | Database connection, environment setup |
| `@BeforeTest` | `<test>` block | API token generation, test data setup |
| `@BeforeClass` | Single class | Class-specific initialization |
| `@BeforeMethod` | Each `@Test` | Reset state, fresh data for each test |
| `@Test` | Individual test | The actual test logic |
| `@AfterMethod` | Each `@Test` | Clean up after each test |
| `@AfterClass` | Single class | Class-specific cleanup |
| `@AfterTest` | `<test>` block | Aggregate results, cleanup test data |
| `@AfterSuite` | Entire suite | Close connections, generate reports |

### 4.11 Simplified Annotations Example (`APITesting024_All_Annotations.java`)

A minimal example showing the most commonly used annotations:

```java
@BeforeTest
void demo4(){
    System.out.println("BeforeMethod");   // Setup before tests
}

@Test
void demo5(){
    System.out.println("Test");           // The actual test
}

@AfterTest
void demo6(){
    System.out.println("AfterMethod");    // Cleanup after tests
}
```

---

## TestNG XML Configuration Files

This project includes several TestNG XML files that demonstrate different execution strategies:

| File | Purpose | Command |
|------|---------|---------|
| `testng.xml` | Run HelloWorld test | `mvn test -DsuiteXmlFile=testng.xml` |
| `testng_01.xml` | Formatted version of testng.xml | `mvn test -DsuiteXmlFile=testng_01.xml` |
| `testng_group_smoke.xml` | Run smoke group only | `mvn test -DsuiteXmlFile=testng_group_smoke.xml` |
| `testng_group_reg.xml` | Run regression group only | `mvn test -DsuiteXmlFile=testng_group_reg.xml` |
| `testng_group_ssanity.xml` | Run sanity group only | `mvn test -DsuiteXmlFile=testng_group_ssanity.xml` |
| `testng_param_chrome.xml` | Run with browser=chrome | `mvn test -DsuiteXmlFile=testng_param_chrome.xml` |
| `testng_param_firefox.xml` | Run with browser=firefox | `mvn test -DsuiteXmlFile=testng_param_firefox.xml` |

### TestNG XML Structure Explained

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="All Test Suite">                    <!-- Top level: Suite -->
    <test name="My Tests">                       <!-- Test block -->

        <!-- Optional: Parameters -->
        <parameter name="browser" value="chrome"/>

        <!-- Optional: Groups -->
        <groups>
            <run>
                <include name="smoke"/>
                <!-- <exclude name="reg"/> -->
            </run>
        </groups>

        <!-- Required: Classes to run -->
        <classes>
            <class name="com.thetestingacademy.ex_04...ClassName">
                <methods>
                    <include name="specificMethod"/>  <!-- Optional: specific methods -->
                </methods>
            </class>
        </classes>

    </test>
</suite>
```

---

## Allure Reporting

This project is configured with **Allure TestNG** for beautiful, interactive test reports.

### Setup Allure

```bash
# Install Allure command-line (macOS)
brew install allure

# Install Allure command-line (Windows)
scoop install allure

# Generate and open report after running tests
allure serve allure-results
```

### Allure Report Features

```
+------------------------------------------------------------------+
|                    ALLURE REPORT DASHBOARD                        |
+------------------------------------------------------------------+
|                                                                    |
|  +-- Overview          Summary of test execution                  |
|  +-- Suites            Tests organized by suite/class             |
|  +-- Graphs            Pass/fail charts, duration trends          |
|  +-- Timeline          Execution timeline visualization           |
|  +-- Behaviors         Tests grouped by feature/story             |
|  +-- Categories        Failure categorization                     |
|                                                                    |
+------------------------------------------------------------------+
```

---

## API Reference - Restful Booker

This course uses the [Restful Booker API](https://restful-booker.herokuapp.com/apidoc/index.html) - a free, open-source API designed for learning API testing.

### Endpoints Used

| Method | Endpoint | Description | Auth Required |
|--------|----------|-------------|---------------|
| GET | `/ping` | Health check | No |
| POST | `/auth` | Create auth token | No |
| GET | `/booking/:id` | Get booking by ID | No |
| POST | `/booking` | Create booking | No |
| PUT | `/booking/:id` | Update booking | Yes (token cookie) |
| PATCH | `/booking/:id` | Partial update | Yes (token cookie) |
| DELETE | `/booking/:id` | Delete booking | Yes (token cookie) |

### Authentication

```
POST /auth
Body: { "username": "admin", "password": "password123" }
Response: { "token": "abc123def" }

Use token as cookie: Cookie: token=abc123def
```

### Other API Used

| API | Base URL | Purpose |
|-----|----------|---------|
| Zippopotam.us | `https://api.zippopotam.us` | Zip code lookup API (free, no auth) |

---

## Quick Reference Cheat Sheet

### Rest Assured Methods

```java
// Request Building
RestAssured.given()
    .baseUri("https://api.example.com")     // Base URL
    .basePath("/endpoint")                   // Path
    .header("key", "value")                  // Add header
    .headers(headersMap)                     // Add multiple headers
    .contentType(ContentType.JSON)           // Set content type
    .accept(ContentType.JSON)                // Set accept type
    .cookie("name", "value")                 // Add cookie
    .queryParam("key", "value")              // Add query parameter
    .pathParam("key", "value")               // Add path parameter
    .body(payload)                           // Set request body
    .auth().basic("user", "pass")            // Basic auth
    .auth().oauth2("token")                  // OAuth2 auth
    .log().all()                             // Log request

// HTTP Methods
    .when()
    .get()                                   // GET request
    .post()                                  // POST request
    .put()                                   // PUT request
    .patch()                                 // PATCH request
    .delete()                                // DELETE request

// Response Validation
    .then()
    .statusCode(200)                         // Check status code
    .body("key", equalTo("value"))           // Check body field
    .header("Content-Type", "application/json")
    .log().all();                            // Log response
```

### TestNG Annotations Quick Reference

```java
@BeforeSuite      // Once before all tests in the suite
@BeforeTest       // Before each <test> tag in XML
@BeforeClass      // Before the first test method in the class
@BeforeMethod     // Before each @Test method

@Test             // Marks a test method
@Test(priority = 1)              // Execution order
@Test(groups = {"smoke"})        // Group membership
@Test(enabled = false)           // Skip this test
@Test(dependsOnMethods = "m1")   // Dependency
@Test(alwaysRun = true)          // Always execute
@Test(invocationCount = 5)       // Repeat N times

@AfterMethod      // After each @Test method
@AfterClass       // After the last test method in the class
@AfterTest        // After each <test> tag in XML
@AfterSuite       // Once after all tests in the suite

@Parameters("name")              // Receive XML parameters
```

---

## How to Run Tests

### Run All Tests
```bash
mvn test
```

### Run a Specific TestNG XML Suite
```bash
mvn test -DsuiteXmlFile=testng_group_smoke.xml
```

### Run a Specific Test Class
```bash
mvn test -Dtest=com.thetestingacademy.ex_01_RestAssured_HelloWorld.HelloWorld
```

### Run a Specific Test Method
```bash
mvn test -Dtest=com.thetestingacademy.ex_01_RestAssured_HelloWorld.HelloWorld#testHelloWorld
```

### Generate Allure Report
```bash
mvn test
allure serve allure-results
```

---

## Troubleshooting

| Issue | Solution |
|-------|----------|
| `java.net.ConnectException` | Check internet connection; API might be down |
| `403 Forbidden` on PUT/PATCH/DELETE | Token expired - generate a new one via POST `/auth` |
| `ClassNotFoundException` | Run `mvn clean install -DskipTests` to rebuild |
| Tests not found | Ensure methods have `@Test` annotation |
| Parameter not found | Ensure TestNG XML has matching `<parameter>` tag |
| Allure report empty | Run `allure serve allure-results` after test execution |

---

## Further Learning

This course lays the foundation for advanced topics:

- **POJO Serialization/Deserialization** - Map JSON to Java objects
- **JsonPath Assertions** - Validate complex nested JSON responses
- **Data-Driven Testing** - Use Excel/CSV files with Apache POI
- **Request/Response Specification** - Reusable request templates
- **CI/CD Integration** - Run tests in Jenkins, GitHub Actions
- **API Chaining** - Pass data between sequential API calls
- **Schema Validation** - Validate JSON response structure
- **Authentication Strategies** - OAuth2, Bearer tokens, API Keys

---

<p align="center">
  <b>The Testing Academy</b> | Created by <b>Pramod Dutta</b><br>
  <i>Empowering testers worldwide with practical, industry-ready automation skills</i><br><br>
  <a href="https://thetestingacademy.com">Website</a> |
  <a href="https://www.youtube.com/@TheTestingAcademy">YouTube</a> |
  <a href="https://www.linkedin.com/in/intelpramod/">LinkedIn</a>
</p>

---

**License:** This project is for educational purposes as part of The Testing Academy's ATB15x program.
