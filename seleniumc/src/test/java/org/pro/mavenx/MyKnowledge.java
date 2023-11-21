package org.pro.mavenx;

public class MyKnowledge {

    /** What is Maven?
     * Maven is a build management and dependencies management tool
     *
     * What is build?
     * Example to understand is: in a project 3 developers works on 3 functionalities
     * To validate these 3 functionality QA needs on QA environment
     * Developer combine 3 class files and convert into a JAR/WAR files and deploy on QA environment
     * these jar / war consider as a single build. each build we can consider as new version of application
     *
     * What is dependencies?
     * Example to understand is: some organization developed reusable code and make it open source in jar / war file
     * While we develop a project , if we need similar operation then we use those jar /war files instated of develop from scratch
     * those jar / war files are called dependencies
     * To work on web element Selenium Jar present , we use these jar as a dependencies in our UI automation
     *
     * Maven provides a pom.xml file , where we can add the dependency details from "MVN Repository" web
     * any time we need  latest or oldest version of dependency , simply we need to add in POM.xml, it downloads automatically
     * On change of version of dependency, automatically deleted teh previous jar and download new
     *
     */


    /** Why not Java Project - why Maven Project
     * We can go with Java Project for automation testing but subject to dependencies management, we do manually
     * and set the build path for these dependencies. manual management is a tedious work
     *
     * We use Maven Project for automation testing because it provides a POM.xml to manage dependencies
     * (downloads and store in M2 folder in local) manage the build path
     *
     * Maven provides a project structure which help to manage business logic and test case separate
     *
     */


    /** Maven Life Cycle
     *
     * Maven Life Cycle -- Associate with multiple Phases -- Each Phase has its own plugin to execute phase
     *                                                    -- Each Phase has its own goal to do
     *
     * Maven have 3 Life Cycle
     *            1 Build / Default Life Cycle
     *                    # It has multiple phases and each phase are running sequence manner
     *                    # Phase 1 Validate  Phase 2 Initialization phase 3 Compile - Phase 4 Test Phase 5 Packaging 6 Install Phase 7 Run
     *                    # Each phase has its own plugin to run the phase
     *                    # Example - run test we use "SureFire" plugin on POM.xml
     *                    # Run Testng.xml is our goal of Test Phase. we can map single or multiple goals
     *            2 Clean Life Cycle
     *                    # It has 3 phases and each phase are running sequence manner
     *                    # Phase 1 Pre-Clean Phase 2 Clean Phase 3 Post-Clean
     *                    #
     *            3 Site Life Cycle
     *                    # It has 3 phases and each phase are running sequence manner
     *                    # Phase 1 Pre-Site Phase 2 Site Phase 3 Post-Site
     *
     *
     * Command to execute
     * mvn phase_name (Single phase) Note: if we set the phase then all the previous and current phase are execute
     * mvn test (All phase of previous and test phase will run )
     * mvn phase_name phase_name phase_name (multiple phase)
     * or
     * mvn plugin: goal
     *
     *
     *
     */


}
