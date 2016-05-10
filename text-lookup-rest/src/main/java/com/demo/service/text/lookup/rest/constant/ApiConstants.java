package com.demo.service.text.lookup.rest.constant;

/**
 * <pre>
 *     Static string representation of the API's endpoints.
 * </pre>
 */
public class ApiConstants {

    public static final String API_ROOT = "/api";

    public static final String API_HELP = API_ROOT + "/help";

    public static final String API_PING = API_ROOT + "/ping";

    public static final String API_DOCS_ROOT = "/docs";

    public static final String API_TEXT_ROOT = "/api/lookup";

    public static final String API_TEXT_LOOKUP = API_TEXT_ROOT + "/{key}";

    // Management root URI
    public static final String API_MAN_ROOT ="/admin";

    public static final String API_MAN_BUILD= API_MAN_ROOT + "/build";
}
