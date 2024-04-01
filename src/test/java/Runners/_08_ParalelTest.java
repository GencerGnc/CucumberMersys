package Runners;

import Utilities.GWD;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
        tags = "@Regression", // bütün senaryolardan smoke test tagine sahip olanları çalıştır
        //Run all scenarios with smoke test tag
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class _08_ParalelTest extends AbstractTestNGCucumberTests {

    @BeforeClass
    @Parameters("browserType")
    public void  beforeclass(String browserType){

        GWD.threadBrowserName.set(browserType);
        //bu thread e browser adını set ettim.

    }

}
