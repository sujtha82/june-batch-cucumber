package com.sujtha.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith ( Cucumber.class )
@CucumberOptions(features = {"C:Users/BDAdmin/june-batch-cucumber/src/test/java/resources/feature2/bearcan.featuresrc" }
        ///test/java/resources/feature2/bearcan.feature"}
       , glue = {"stepdefination"}
            , dryRun=false
)

public class WblRunner {
}
