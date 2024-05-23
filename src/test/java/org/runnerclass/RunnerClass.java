package org.runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature File",glue="org.dsbabaseclass",dryRun=false,strict=true,tags={"@createnewmember"})

public class RunnerClass {

}
