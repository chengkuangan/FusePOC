
package com.jboss.poc.model;


public class Creator {

    private int id;
    private String fname;
    private String lname;
    private String email;
    private String phone;
    private String cell;
    private String title;
    private String notes;
    private int last_login;
    private boolean locked;
    private boolean is_external;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getLast_login() {
        return last_login;
    }

    public void setLast_login(int lastLogin) {
        this.last_login = lastLogin;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public boolean isIs_external() {
        return is_external;
    }

    public void setIs_external(boolean isExternal) {
        this.is_external = isExternal;
    }

}
