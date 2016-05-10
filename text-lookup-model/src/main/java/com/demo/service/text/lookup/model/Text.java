package com.demo.service.text.lookup.model;

/**
 *
 */
public class Text {

    private String key;
    private String value;

    public Text(){};

    public Text(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{\"Text\":{"
                + "\"key\":\"" + key + "\""
                + ", \"value\":\"" + value + "\""
                + "}}";
    }
}
