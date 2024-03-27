package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest", // bütün senaryolardan smoke test tagine sahip olanları çalıştır
        //Run all scenarios with smoke test tag
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        dryRun = false,// true olduğunda testleri çalıştırmaz sadece STEP leri varmı kontrol eder
        plugin = {"html:target/site/cucumber-pretty.html"} // basic report // pretty de yazılır
)
public class _06_TestRunnerSmokeWithPlugin extends AbstractTestNGCucumberTests {
}
