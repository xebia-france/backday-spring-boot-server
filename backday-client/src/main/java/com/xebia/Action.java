package com.xebia;

public class Action {

    private String id;
    private Integer value;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Action{" +
                "id='" + id + '\'' +
                ", value=" + value +
                '}';
    }
}
