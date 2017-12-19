package pft32.addressbook.bdd;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Created by User on 21/04/2017.
 */

@CucumberOptions(features = "classpath:bdd", plugin = {"pretty", "html:build/cucumber-report"})

public class GroupSteps extends AbstractTestNGCucumberTests {

}
