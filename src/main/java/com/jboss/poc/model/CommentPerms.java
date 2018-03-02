
package com.jboss.poc.model;


public class CommentPerms {

    private boolean update;
    private boolean delete;

    public boolean isUpdate() {
        return update;
    }

    public void setUpdate(boolean update) {
        this.update = update;
    }

    public boolean isDelete() {
        return delete;
    }

    public void setDelete(boolean delete) {
        this.delete = delete;
    }

}
