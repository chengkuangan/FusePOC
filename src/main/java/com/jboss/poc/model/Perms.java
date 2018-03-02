
package com.jboss.poc.model;


public class Perms {

    private boolean read;
    private boolean write;
    private boolean comment;
    private boolean assign;
    private boolean close;
    private boolean change_members;
    private boolean attach_file;
    private boolean read_attachments;
    private boolean delete_attachments;
    private boolean create_milestones;
    private boolean list_milestones;
    private boolean create_artifacts;
    private boolean list_artifacts;
    private boolean delete;

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public boolean isWrite() {
        return write;
    }

    public void setWrite(boolean write) {
        this.write = write;
    }

    public boolean isComment() {
        return comment;
    }

    public void setComment(boolean comment) {
        this.comment = comment;
    }

    public boolean isAssign() {
        return assign;
    }

    public void setAssign(boolean assign) {
        this.assign = assign;
    }

    public boolean isClose() {
        return close;
    }

    public void setClose(boolean close) {
        this.close = close;
    }

    public boolean isChange_members() {
        return change_members;
    }

    public void setChange_members(boolean changeMembers) {
        this.change_members = changeMembers;
    }

    public boolean isAttach_file() {
        return attach_file;
    }

    public void setAttach_file(boolean attachFile) {
        this.attach_file = attachFile;
    }

    public boolean isRead_attachments() {
        return read_attachments;
    }

    public void setRead_attachments(boolean readAttachments) {
        this.read_attachments = readAttachments;
    }

    public boolean isDelete_attachments() {
        return delete_attachments;
    }

    public void setDelete_attachments(boolean deleteAttachments) {
        this.delete_attachments = deleteAttachments;
    }

    public boolean isCreate_milestones() {
        return create_milestones;
    }

    public void setCreate_milestones(boolean createMilestones) {
        this.create_milestones = createMilestones;
    }

    public boolean isList_milestones() {
        return list_milestones;
    }

    public void setList_milestones(boolean listMilestones) {
        this.list_milestones = listMilestones;
    }

    public boolean isCreate_artifacts() {
        return create_artifacts;
    }

    public void setCreate_artifacts(boolean createArtifacts) {
        this.create_artifacts = createArtifacts;
    }

    public boolean isList_artifacts() {
        return list_artifacts;
    }

    public void setList_artifacts(boolean listArtifacts) {
        this.list_artifacts = listArtifacts;
    }

    public boolean isDelete() {
        return delete;
    }

    public void setDelete(boolean delete) {
        this.delete = delete;
    }

}
