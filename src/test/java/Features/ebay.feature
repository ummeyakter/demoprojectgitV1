Feature: search field functionality

Background:
 Given launch the "<Browser>" browser
@Adhoc
Scenario Outline: validate search field functionality for ebay


Then go to the url "<Url>";
When i landed on homepage
Then i entered following character in the search field "<Name>"
And i click on search field
Then the result according to keyword results for <NOR> displays on the screen


Examples:

|Browser|Url|Name|NOR|
|chrome|https://www.ebay.com|qa testing books|2|
|chrome|https://www.ebay.com|phone|2000|
|chrome|https://www.ebay.com|furniture|1200|


@Regression
Scenario Outline: validate search field functionality for ebay


Then go to the url "<Url>";
When i landed on homepage
Then i entered following character in the search field "<Name>"
And i click on search field
Then the result according to keyword results for <NOR> displays on the screen


Examples:

|Browser|Url|Name|NOR|
|chrome|https://www.ebay.com|pants|2|
|chrome|https://www.ebay.com|shirt|2000|
|chrome|https://www.ebay.com|sofa|1200|


@Adhoc @Regression
Scenario Outline: validate search field functionality for ebay


Then go to the url "<Url>";
When i landed on homepage
Then i entered following character in the search field "<Name>"
And i click on search field
Then the result according to keyword results for <NOR> displays on the screen


Examples:

|Browser|Url|Name|NOR|
|chrome|https://www.ebay.com|clothing|20000|
|chrome|https://www.ebay.com|kidsshirt|200|
|chrome|https://www.ebay.com|livingroomsofa|2200|
