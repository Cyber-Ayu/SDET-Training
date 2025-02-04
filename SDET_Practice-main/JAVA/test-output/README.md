# TestNG Test Report

## Suite: **Suite**

### Test Results

- **Total Tests**: 2  
- **Passed Tests**: 2  
- **Failed Tests**: 0  
- **Skipped Tests**: 0

---

## Test Suite Details

### Suite Information:

- **Suite Path**: [\src\test\java\com\compAssignment\testng.xml](#)
- **Test Count**: 1
- **Methods Executed**: 2 (all passed)

### Test Methods

| Number | Method Name                | Class Name                                   | Time (ms) |
|--------|----------------------------|----------------------------------------------|-----------|
| 0      | `testOneWayFlightSelection` | `com.compAssignment.TestNG.SelectOneWayTest` | 18654     |
| 1      | `verifyLogoPresence`       | `com.compAssignment.TestNG.VerifyLogoTest`   | 70        |

---

### Test Results Overview

- **Total Running Time**: 18 seconds
- **Methods Passed**: 2

---

## Test Results

### Passed Methods

#### 1. `testOneWayFlightSelection`
- **Class Name**: `com.compAssignment.TestNG.SelectOneWayTest`
- **Status**: Passed  
- **Execution Time**: 18654 ms

#### 2. `verifyLogoPresence`
- **Class Name**: `com.compAssignment.TestNG.VerifyLogoTest`
- **Status**: Passed  
- **Execution Time**: 70 ms

---

## Reporter Output for Suite

### **com.compAssignment.TestNG.VerifyLogoTest**
- **Setup Time**: 0 ms  
- **Test Method (`verifyLogoPresence`)**: 8107 ms  
- **Teardown Time**: 8179 ms

### **com.compAssignment.TestNG.SelectOneWayTest**
- **Setup Time**: 9678 ms  
- **Test Method (`testOneWayFlightSelection`)**: 14613 ms  
- **Teardown Time**: 33268 ms

---

## TestNG XML Configuration

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite" guice-stage="DEVELOPMENT">
  <listeners>
    <listener class-name="org.testng.reporters.XMLReporter"/>
    <listener class-name="org.testng.reporters.EmailableReporter"/>
    <listener class-name="org.testng.reporters.jq.Main"/>
  </listeners>
  <test thread-count="5" name="Test">
    <classes>
      <class name="com.compAssignment.TestNG.VerifyLogoTest"/>
      <class name="com.compAssignment.TestNG.SelectOneWayTest"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->
