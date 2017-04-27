TestNG cover a wider range of test categories: unit, functional, end-to-end, integration, etc.,
Annotation support
Support for parameterized and data-driven testing
Concurrent testing (ThreadPool)

@BeforeSuite - For suite test, run before all tests in this suite have run.
@AfterSuite -  For suite test, run after all tests in this suite have run.

@BeforeTest - For suite test, run before any test method belonging to the classes inside the <test> tag is run.
@AfterTest - For suite test, run after all the test methods belonging to the classes inside the <test> tag have run.

@BeforeGroups: Run before the first test method that belongs to the group is invoked.
@AfterGroups: Run after the last test method that belongs to the groups is invoked.

@BeforeClass - Run before the first test method in the current class is invoked.
@AfterClass - Run after all the test methods in the current class have been run.

@BeforeMethod - Run before each test method.
@AfterMethod - Run after each test method.

TestNG documentation
http://testng.org/doc/documentation-main.html#testng-xml
----------------------------------------------------------------------------------------------------------
Selenium provides a record/playback tool for writing tests

With the release of Selenium 2, Selenium Remote Control has been officially deprecated in favor of Selenium WebDriver.
Selenium WebDriver accepts commands (sent in Selenese, or via a Client API) and sends them to a browser. 

Selenium IDE

#Skip tests and build
mvn clean install -DskipTests