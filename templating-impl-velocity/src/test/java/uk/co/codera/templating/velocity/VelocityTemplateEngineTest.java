package uk.co.codera.templating.velocity;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import uk.co.codera.templating.TemplateEngine;

public class VelocityTemplateEngineTest {

    private TemplateEngine templateEngine;

    @Before
    public void before() {
        this.templateEngine = new VelocityTemplateEngine();
    }

    @Test
    public void shouldMergeTemplateWithParameters() {
        assertThat(this.templateEngine.merge("Hello $name", parametersWithName("Jeff")), is("Hello Jeff"));
    }

    private Map<String, Object> parametersWithName(String name) {
        Map<String, Object> params = new HashMap<>();
        params.put("name", name);
        return params;
    }
}