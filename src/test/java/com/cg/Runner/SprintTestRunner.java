
	package com.cg.Runner;

	import org.junit.runner.RunWith;

	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(features="Features",glue="com.cg.StepDef",dryRun=false,tags="@positive1",
	plugin={"pretty","json:target/cucumber.json","html:target/login.html","rerun:target/failtest.txt"})
	public class SprintTestRunner {

	}



