package uk.co.codera.templating.velocity;

import java.io.StringWriter;
import java.util.Map;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import uk.co.codera.templating.TemplateEngine;

public class VelocityTemplateEngine implements TemplateEngine {

    private static final String LOGGING_TAG_VELOCITY = "velocity";
    
    private final VelocityEngine engine;
    
    public VelocityTemplateEngine() {
        this.engine = new VelocityEngine();
    }
    
    @Override
    public String merge(String template, Map<String, Object> params) {
        StringWriter sw = new StringWriter();
        this.engine.evaluate(new VelocityContext(params), sw, LOGGING_TAG_VELOCITY, template);
        return sw.toString();
    }
}