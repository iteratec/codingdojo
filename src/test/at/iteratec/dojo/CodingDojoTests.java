package at.iteratec.dojo;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CodingDojoTests {
	
    @Test
    public void messageShouldStartWithHello() {
        assertThat(Hello.getMessage(), startsWith("Hello"));
    }

    @Test
    public void when_NO_name_given_should_greet_World() {
        assertThat(Hello.getMessage(), endsWith("World"));
    }

    @Test
    public void when_name_given_should_greet_name() {
        assertThat(Hello.getMessage("John"), equalTo("Hello John"));
    }

}
