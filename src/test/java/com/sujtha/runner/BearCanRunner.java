package com.sujtha.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith (Cucumber.class)
@CucumberOptions(features = {"classpath:features/bearcan.feature"},
                 glue = {"classpath:com/sujtha/stepdefinition"},
                 plugin = {"pretty"})
public class BearCanRunner {

}
