
package com.jboss.poc.model;

import java.util.List;

public class Attachment {

    private int id;
    private String name;
    private String content_type;
    private int created;
    private CreatorId creator_id;
    private int size;
    private int vers;
    private List<Action> actions = null;
    private int inc_id;
    private String inc_name;
    private IncOwner inc_owner;
    private int task_id;
    private String task_name;
    private boolean task_custom;
    private TaskAtId task_at_id;
    private List<Object> task_members = null;
    private String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent_type() {
        return content_type;
    }

    public void setContent_type(String contentType) {
        this.content_type = contentType;
    }

    public int getCreated() {
        return created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public CreatorId getCreator_id() {
        return creator_id;
    }

    public void setCreator_id(CreatorId creatorId) {
        this.creator_id = creatorId;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getVers() {
        return vers;
    }

    public void setVers(int vers) {
        this.vers = vers;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    public int getInc_id() {
        return inc_id;
    }

    public void setInc_id(int incId) {
        this.inc_id = incId;
    }

    public String getInc_name() {
        return inc_name;
    }

    public void setInc_name(String incName) {
        this.inc_name = incName;
    }

    public IncOwner getInc_owner() {
        return inc_owner;
    }

    public void setInc_owner(IncOwner incOwner) {
        this.inc_owner = incOwner;
    }

    public int getTask_id() {
        return task_id;
    }

    public void setTask_id(int taskId) {
        this.task_id = taskId;
    }

    public String getTask_name() {
        return task_name;
    }

    public void setTask_name(String taskName) {
        this.task_name = taskName;
    }

    public boolean isTask_custom() {
        return task_custom;
    }

    public void setTask_custom(boolean taskCustom) {
        this.task_custom = taskCustom;
    }

    public TaskAtId getTask_at_id() {
        return task_at_id;
    }

    public void setTask_at_id(TaskAtId taskAtId) {
        this.task_at_id = taskAtId;
    }

    public List<Object> getTask_members() {
        return task_members;
    }

    public void setTask_members(List<Object> taskMembers) {
        this.task_members = taskMembers;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
