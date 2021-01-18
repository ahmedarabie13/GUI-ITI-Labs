package com.arabie;

import java.util.EventObject;

public class ButtonEvent extends EventObject {
    private String url;

    public ButtonEvent(Object source) {
        super(source);
    }
    public ButtonEvent(Object source,String url) {
        super(source);
        this.url = url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

}
