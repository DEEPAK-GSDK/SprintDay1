@loginsep

Feature: Login of Page
Scenario Outline: Positive Scenario
Given the user is on home loan page
When user enter details "<sheetname>" and <rownumber>
Then user login sucessfully
Examples:
|sheetname|rownumber|
|ExcelRead|0|
|ExcelRead|1|
