 TestNG reports   google.load('visualization', '1', {packages:\['table'\]}); google.setOnLoadCallback(drawTable); var suiteTableInitFunctions = new Array(); var suiteTableData = new Array();

Test results Switch Retro Theme  
1 suite

All suites [![](collapseall.gif) ](# "Collapse/expand all the suites")

[Suite](#)

Info

*   [C:\\Users\\ayush\\IdeaProjects\\ComprehensiveAssignment\\src\\test\\java\\com\\compAssignment\\testng.xml](#)
*   [1 test](#)
*   [0 groups](#)
*   [Times](#)
*   [Reporter output](#)
*   [Ignored methods](#)
*   [Chronological view](#)

Results

*   2 methods, 2 passed
*   Passed methods [(hide)](#) [(show)](#)
    
     ![](passed.png) [testOneWayFlightSelection](# "com.compAssignment.TestNG.SelectOneWayTest")  
     ![](passed.png) [verifyLogoPresence](# "com.compAssignment.TestNG.VerifyLogoTest")  
    

![](passed.png) com.compAssignment.TestNG.SelectOneWayTest

testOneWayFlightSelection

![](passed.png) com.compAssignment.TestNG.VerifyLogoTest

verifyLogoPresence

C:\\Users\\ayush\\IdeaProjects\\ComprehensiveAssignment\\src\\test\\java\\com\\compAssignment\\testng.xml

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
            

Tests for Suite

*   Test (2 classes)

Groups for Suite

Times for Suite

suiteTableInitFunctions.push('tableData\_Suite'); function tableData\_Suite() { var data = new google.visualization.DataTable(); data.addColumn('number', 'Number'); data.addColumn('string', 'Method'); data.addColumn('string', 'Class'); data.addColumn('number', 'Time (ms)'); data.addRows(2); data.setCell(0, 0, 0) data.setCell(0, 1, 'testOneWayFlightSelection') data.setCell(0, 2, 'com.compAssignment.TestNG.SelectOneWayTest') data.setCell(0, 3, 18654); data.setCell(1, 0, 1) data.setCell(1, 1, 'verifyLogoPresence') data.setCell(1, 2, 'com.compAssignment.TestNG.VerifyLogoTest') data.setCell(1, 3, 70); window.suiteTableData\['Suite'\]= { tableData: data, tableDiv: 'times-div-Suite'} return data; } Total running time: 18 seconds

Reporter output for Suite

0 ignored methods

Methods in chronological order

com.compAssignment.TestNG.VerifyLogoTest

setup 0 ms

verifyLogoPresence 8107 ms

teardown 8179 ms

com.compAssignment.TestNG.SelectOneWayTest

setup 9678 ms

testOneWayFlightSelection 14613 ms

tearDown 33268 ms
