package org.pro.seleniumgridx;

public class RemoteRunKnowledge {
    /**
     * Why SeleniumGrid
     * When we want to run same test suite (100o Test Case) on different browser
     * then in normal process it will take long time (To execute 1000 TC on single Browser 2 Hours)
     * then for 3 browser it becomes 3*2 = 6 Hours
     * If we do same on Remote Web Driver then in 2 Hours we can run all TC in all Browser
     *
     * Selenium Grid Run Mode - Standalone (In Local Machine)
     * Step 1: From Local Machine Create a folder and keep All desired browser JAR & Selenium Grid JAR
     * Step 2: ON Same Folder run the CMD & run the command
     *         java - jar selenium-server-12.0.jar standalone
     *         go to http://192.168.0.24:4444 (It is the default host)
     *         It display 8 session for each browser driver / to reduce session use
     *         java -jar selenium-server-10.0.jar standalone --max--sessions 2
     * Step 3: run the test case by setting driver as remove driver
     *         capabilities = new ChromeOptions(); or capabilities = new FirefoxOptions(); other
     *         Webdriver driver  = new RemoteWebDriver(new URL("http://192.168.0.24:4444"),capabilities);
     *
     *
     * Selenium Grid Run Mode - Hub & Node (In Local Machine)
     * Step 1: From Local Machine Create a folder and keep All desired browser JAR & Selenium Grid JAR
     * Step 2: N Same Folder run the CMD & run the command
     *         java -jar selenium-server-10.0.jar hub
     *         It starts a HUB without session/node
     * Step 3: To Add Session / Node run below command on same folder but in a new command window
     *         java -jar selenium-server-10.0.jar node -p 5556   (Create a new session on command by open a new command line)
     *         java -jar selenium-server-10.0.jar node -p 5556   (Create a new session on command by open a new command line)
     *
     *         When we use multiple node, it is not in our control which node going to use , It is internal thread machinist
     * Step 4: If we want to run both node then we need to define the single browser session on each node
     *         java -jar selenium-server-10.0.jar node -p 5556  -I "Firefox"    (Create a new session on command by open a new command line)
     *         java -jar selenium-server-10.0.jar node -p 5556  -I "Chrome"     (Create a new session on command by open a new command line)
     *
     *
     */


}


