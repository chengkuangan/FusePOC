
package com.jboss.poc.model;

import java.util.List;

public class Note {

    private int id;
    private int parent_id;
    private UserId user_id;
    private String user_fname;
    private String user_lname;
    private int create_date;
    private int modify_date;
    private ModifyUser modify_user;
    private Text text;
    private List<Child> children = null;
    private List<Object> mentioned_users = null;
    private CommentPerms comment_perms;
    private boolean is_deleted;
    private List<Action> actions = null;
    private int inc_id;
    private String inc_name;
    private int task_id;
    private String task_name;
    private boolean task_custom;
    private TaskAtId task_at_id;
    private List<Object> task_members = null;
    private String type;
    private IncOwner inc_owner;
    private String user_name;
    private ModifyPrincipal modify_principal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parentId) {
        this.parent_id = parentId;
    }

    public UserId getUser_id() {
        return user_id;
    }

    public void setUser_id(UserId userId) {
        this.user_id = userId;
    }

    public String getUser_fname() {
        return user_fname;
    }

    public void setUser_fname(String userFname) {
        this.user_fname = userFname;
    }

    public String getUser_lname() {
        return user_lname;
    }

    public void setUser_lname(String userLname) {
        this.user_lname = userLname;
    }

    public int getCreate_date() {
        return create_date;
    }

    public void setCreate_date(int createDate) {
        this.create_date = createDate;
    }

    public int getModify_date() {
        return modify_date;
    }

    public void setModify_date(int modifyDate) {
        this.modify_date = modifyDate;
    }

    public ModifyUser getModify_user() {
        return modify_user;
    }

    public void setModify_user(ModifyUser modifyUser) {
        this.modify_user = modifyUser;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }

    public List<Object> getMentioned_users() {
        return mentioned_users;
    }

    public void setMentioned_users(List<Object> mentionedUsers) {
        this.mentioned_users = mentionedUsers;
    }

    public CommentPerms getComment_perms() {
        return comment_perms;
    }

    public void setComment_perms(CommentPerms commentPerms) {
        this.comment_perms = commentPerms;
    }

    public boolean isIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(boolean isDeleted) {
        this.is_deleted = isDeleted;
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

    public IncOwner getInc_owner() {
        return inc_owner;
    }

    public void setInc_owner(IncOwner incOwner) {
        this.inc_owner = incOwner;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String userName) {
        this.user_name = userName;
    }

    public ModifyPrincipal getModify_principal() {
        return modify_principal;
    }

    public void setModify_principal(ModifyPrincipal modifyPrincipal) {
        this.modify_principal = modifyPrincipal;
    }

}
