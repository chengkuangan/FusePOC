
package com.jboss.poc.model;


public class ModifyUser {

    private Id id;
    private String first_name;
    private String last_name;

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String firstName) {
        this.first_name = firstName;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String lastName) {
        this.last_name = lastName;
    }

}
