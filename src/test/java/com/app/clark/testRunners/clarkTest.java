package com.app.clark.testRunners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features"},
        plugin = {"pretty",
                "json:target/cucumber_json_reports/home-page.json",
                "html:target/home-page-html"},
        glue = {"com.app.clark.hooks",
                "com.app.clark.stepdefinitions"},
        tags = "@Clark"
                    )
public class clarkTest {
}
