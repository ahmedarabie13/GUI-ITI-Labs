package com.arabie;

import java.util.EventObject;

public class ToolBarEvent extends EventObject {
    private String cntType;
    public ToolBarEvent(Object source) {
        super(source);

    }

    public String getCntType() {
        return cntType;
    }

    public void setCntType(String cntType) {
        this.cntType = cntType;
    }

    public ToolBarEvent(Object source, String cntType) {
        super(source);
        this.cntType=cntType;

    }
}
