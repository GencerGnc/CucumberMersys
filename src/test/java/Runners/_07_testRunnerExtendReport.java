package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest or @Regression", // bütün senaryolardan smoke test tagine sahip olanları çalıştır
        //Run all scenarios with smoke test tag
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class _07_testRunnerExtendReport extends AbstractTestNGCucumberTests {
}
