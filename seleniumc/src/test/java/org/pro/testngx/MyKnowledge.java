package org.pro.testngx;

public class MyKnowledge {

    /**TestNG  Life Cycle
     * Order is
     * @BeforeSuite
     * @BeforeTest
     * @BeforeClass
     * @BeforeMethod
     * @Test
     * @AfterMethod
     * @AfterCLass
     * @AfterTest
     * @AfterSuite
     *
     * @BeforeGroup("Group Name") is run at method level so dependent method run first than calling method
     *
     *
     */

    /** Time-out
     * We can set time out at Suite Level in testng.xml file
     * <suite name="TestNG Timeout" time-out="5000"/>
     *
     * We can set time out at Test Level in testng.xml file
     * test name="Test Parameter" time-out="5000">
     *
     * We can set time out at Method Level
     * @Test(timeOut = 2000)
     *
     * If we set at Suite level , it applicable to all @Test
     * If we set at Suite and Test Level then suite time out override by Test Level
     * If we set Suite, Test and Method level then Suite/Test level time out override by Method level
     *
     */

    /** Priority
     * @Test(priority= num) num can be any number
     *
     * default priority is 0, if we not set any priority, or we can set @Test(priority= 0)
     * As per the priority, it runs as per priority number order ascending
     *
     * If we set same priority then it run as alphabetical order
     * if there is no priority then default order is alphabetical order
     *
     */


    /** Parameter
     * can set at suite level in testng.xml file using under suite tag. it accessible to all test case
     * Parameter can set test level in testng.xml file under test tag. it accessible to specific test case of that test
     * <parameter name="test-parameter" value="Normal Test Level Parameter"/>
     * <parameter name="suite-parameterA" value="suite level parameterA"/>
     * We can set multiple parameter using multiple tag
     *
     * To use these parameters we can set @Parameter() annotation at @Test method
     * We can pass single parameter using "" or we can set multiple {"abc", "def", "prd"}
     * To assess the data from @parameter we pass that many parameter in test case method
     *
     *     @Parameters({"suite-parameterA", "suite-parameterB"})
     *     @Test
     *     public void testCase1(String paramA, String paramB)
     *     {
     *     }
     *
     *     @Parameters({"suite-parameterB"})
     *     @Test
     *     public void testCase2(String param)
     *     {
     *     }
     *
     * If we use same parameter suite and test level then test level override the suite level
     *
     */


    /** Parallel Run
     * We can set at Suite Level , either method or test.
     * On parallel run we need to define the thread count so that on mutilate thread parallel run execute
     * <suite name="TestNG Method Parallel" parallel="methods" thread-count="2">
     * <suite name="TestNG Method Parallel" parallel="tests" thread-count="2">
     *
     * parallel = "method" - then as per the thread count that many method / test case run at a time
     * parallel = "test" - then as per thread count that many test run at a time
     *
     *
     *
     */


    /** Group
     * groups is an attribute for @Test()
     * By this we can create a group of method /test case
     * We can map a test case with single or multiple group
     * @Test(dependsOnGroups = {"smoke","system"})
     * @Test(groups = "smoke")
     *
     * Below 2 test cases
     * @Test(groups = "smoke")
     * public void testCase11()
     * {}
     * @Test(groups = "smoke")
     * public void testCase12()
     * {}
     *
     * To Run these group we need to include under test tag under groups and run tag
     * <test name="TestRun1">
     * 		<groups>
     * 			<run>
     * 				<include name="smoke"/>
     * 				<include name="system"/>
     * 				<exclude name="reg"/>
     * 			</run>
     * 		</groups>
     * 		<classes>
     * 			<class name="org.example.groupsrun.grouptestcases.TestCasesA"/>
     * 		</classes>
     * 	</test> <!-- Test -->
     *
     */

    /** Method Dependency-----------------
     * dependsOnMethods is a parameter to @Test()
     * We can set single or multiple dependent method
     *
     * @Test(dependsOnMethods = "testCase2")
     * public void testCase1()
     * {}
     * @Test(dependsOnMethods = {"testCase3", "testCase4"})
     *
     * By setting this attribute , we can run the dependent testcase first (TestCase2) then the calling testcase (TestCase1)
     *
     * In inheritance (Class A extends Class B), if any Base Class method dependent on Derive CLass Method
     * then control move from Derive to Base , at this stage all the method of Base Class execute as per their setting
     * then control move back to Derive Class and execute from where the control left
     *
     * Group Dependency --------------------------
     * dependentOnGrops is a parameter to @Test()
     * We can set the dependency single or multiple
     * @Test(dependsOnGroups = "system")
     * @Test(dependsOnGroups = {"smoke","system"})
     *
     * As a result dependent all the method map to the group run first then the calling method/test case execute
     *
     *
     */


    /** ignore
     * By using @Ignore annotation we can ignore the Test Case / Method or class
     * If a class ignore then all the method/test case of the class ignore / not run at execution
     *
     * In below case Class A ignore and Test Case 2 of Class B ignore at execution
     * @ignore
     * Class A
     * {
     *     @Test
     *     public void t1(){}
     * }
     *
     * class B
     * {
     *     @Test
     *     public void t1(){}
     *
     *     @ignore
     *     @Test
     *      public void t2(){}
     * }
     *
     * we can add @Test(enable=false) to ignore a method/test case
     *
     *
     */

    /** Data Provider
     * @DataProvider is used to define a data provider which provide multiple set of data to test case
     * SO that Test Case Run that many times to validate
     * Data Provider and Test Case / method define in same class
     *
     * To use the data provider at method we set @Test(dataProvider="name")
     * name can be data provider method name or the name given to data provider
     *
     * Data Provider return Object[][]
     *     @DataProvider(name="UserData")
     *     public Object[][]dataMethod()
     *     {
     *         Object[][] objects = new Object[2][2];
     *
     *         objects[0][0]="Shibaram";
     *         objects[0][1]="Bangalore";
     *
     *         objects[1][0]="Dasarathi";
     *         objects[1][1]="Delhi";
     *
     *         return objects;
     *     }
     *
     * If we define a data provider in a different class then to access at test case/method level
     * @Test(dataProviderClass = className.class, dataProvider="name")
     *
     * We can define multiple data provider
     * We can migrate with excel to get data and provide to method / test case
     */



    /**Factory -----------------------------
     * @Factory annotation is used to provide data to test case for multiple instance of the test class
     * AT @DataProvider is used to provide data to test case for same instance
     *
     * Create a Test Class with Test Case by using @Test()
     * Create a class and define a method which return Object[] and this array return teh class instance with value
     * After this go to the Test Class and their define a constructor and initialization class variable
     * At test case level pass parameter as per the need to access the class level value
     * At testng.xml run the factory method class
     *
     *
     * Factory with Data Provider
     * Do the above operation first then on factory method class define a data provider
     * Pass the data provider as parameter to @Factory (dataProvider="name")
     * Pass same number of parameters to factory method what are pass by data provider
     * use the same parameter value to instance create
     *
     * Example 1
     *     @Factory
     *     public Object[] dataFactory()
     *     {
     *         return new Object[]{new TestCaseForFactory("Shibaram", "BBSR",  40), new TestCasesClass("Dasarathi", "BLR", 35)};
     *     }
     *
     * Example 2
     *     @Factory(dataProvider = "userdata")
     *     public Object[] factoryMethod(String name, int age)
     *     {
     *         Object[] objects = new Object[2];
     *         objects[0] = new TestCaseForFactoryDataProvider(name, age);
     *         objects[1] = new TestCaseForFactoryDataProvider(name, age);
     *         return objects;
     *     }
     *
     *
     *     @DataProvider(name="userdata")
     *     public Object[][] getUserData()
     *     {
     *         Object[][] objects = new Object[2][2];
     *
     *         objects[0][0]="shibaram";
     *         objects[0][1]=40;
     *
     *         objects[1][0]="Dasarathi";
     *         objects[1][1]=35;
     *
     *         return objects;
     *     }
     *
     */



}
