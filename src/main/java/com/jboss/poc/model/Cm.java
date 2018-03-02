
package com.jboss.poc.model;

import java.util.List;

public class Cm {

    private List<Unassigned> unassigneds = null;
    private int total;

    public List<Unassigned> getUnassigneds() {
        return unassigneds;
    }

    public void setUnassigneds(List<Unassigned> unassigneds) {
        this.unassigneds = unassigneds;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}
