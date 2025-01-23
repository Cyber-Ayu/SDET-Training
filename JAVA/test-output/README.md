# TestNG Report Summary

## Suite Information
- **Suite Name:** Suite  
- **Test Count:** 1  
- **Group Count:** 0  

---

## Results Summary
- **Total Methods:** 2  
- **Passed Methods:** 2  
  - **Method:** `testOneWayFlightSelection`  
    - **Class:** `com.compAssignment.TestNG.SelectOneWayTest`  
  - **Method:** `verifyLogoPresence`  
    - **Class:** `com.compAssignment.TestNG.VerifyLogoTest`  

---

## XML Configuration File Path
`C:\Users\<redacted>\IdeaProjects\ComprehensiveAssignment\src\test\java\com\compAssignment\testng.xml`

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
  </test>
</suite>
