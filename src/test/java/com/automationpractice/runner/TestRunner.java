package com.automationpractice.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/java/com/automationpractice/features"},
        glue = {"com/automationpractice/hook", "com/automationpractice/stepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        tags = "@TestDB"
)
public class TestRunner {
}
