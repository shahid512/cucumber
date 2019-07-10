package sce;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","html:src/cucumber-reports,json:src/cucumber-reports/report.json"},features= "src/test/resources/sce/third.feature")

public class run3cu {

}
