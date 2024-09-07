package com.cg.Verify;


	import org.junit.runner.RunWith;

	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(features="Features",glue="com.cg.Verify",dryRun=false,tags="@loginsep")
	public class TestRunner1 {

	}


