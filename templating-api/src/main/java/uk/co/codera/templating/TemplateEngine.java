package uk.co.codera.templating;

import java.util.Map;

/**
 * Represents a template engine. Will take the contents of a template and a map
 * of parameters merging the two to produce a result.
 */
@FunctionalInterface
public interface TemplateEngine {

    /**
     * Takes the contents of a template and merges the parameters passed as a
     * map to produce a result.
     * 
     * @param template
     *            the contents of the template.
     * @param params
     *            the parameters to merge into the template.
     * @return the result of merging the template with the parameters.
     */
    String merge(String template, Map<String, Object> params);
}