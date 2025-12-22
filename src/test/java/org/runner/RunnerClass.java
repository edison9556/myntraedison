package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\resources\\feature\\login.feature",glue="org.def"
,snippets = SnippetType.CAMELCASE,dryRun = false)




public class RunnerClass {
	
	


}
	
	
	
	
	
	

