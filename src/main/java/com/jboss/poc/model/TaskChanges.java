
package com.jboss.poc.model;

import java.util.List;

public class TaskChanges {

    private List<Added> added = null;
    private List<Removed> removed = null;

    public List<Added> getAdded() {
        return added;
    }

    public void setAdded(List<Added> added) {
        this.added = added;
    }

    public List<Removed> getRemoved() {
        return removed;
    }

    public void setRemoved(List<Removed> removed) {
        this.removed = removed;
    }

}
