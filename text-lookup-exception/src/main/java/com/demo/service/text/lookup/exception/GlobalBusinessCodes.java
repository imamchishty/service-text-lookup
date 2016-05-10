package com.demo.service.text.lookup.exception;

import com.shedhack.exception.core.BusinessCode;

/**
 * <pre>
 *     Business Codes which are shared with clients.
 * </pre>
 */
public enum GlobalBusinessCodes implements BusinessCode {

    TLS001("Key provided is not valid."),
    TLS002("Unable to persist record, key already exists."),
    TLS003("Unable to update the record.");

    private final String description;

    GlobalBusinessCodes(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public String getCode() {
        return this.name();
    }
}
