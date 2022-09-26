package testrun;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features/autoInsurance.feature"},
        glue = {"com.examples.cucumber"})


public class runner {
}