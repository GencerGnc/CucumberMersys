package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest", // bütün senaryolardan smoke test tagine sahip olanları çalıştır
        //Run all scenarios with smoke test tag
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"}
)
public class _05_TestRunnerRegression extends AbstractTestNGCucumberTests {
}

// group da or var ise : herhangi birisi olan çağırılır
//group da and var ise : her iki grup adı olanlar çağırılır