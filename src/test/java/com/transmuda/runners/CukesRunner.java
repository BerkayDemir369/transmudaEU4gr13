package com.transmuda.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun.txt"},
        //monochrome = true, //display the console output in a proper readable format
        strict = true, //it will check if any step is not defined in step definition file
        features = "src/test/resources/features",
        glue = "com/transmuda/stepdefinitions",
        dryRun = false,
        tags = "@smoke"
)
public class CukesRunner {
}