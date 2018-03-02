
package com.jboss.poc.model;

import java.util.List;

public class Task {

    private String inc_name;
    private String name;
    private boolean custom;
    private int inc_id;
    private IncOwnerId inc_owner_id;
    private int due_date;
    private boolean required;
    private OwnerId owner_id;
    private int id;
    private String status;
    private boolean inc_training;
    private boolean frozen;
    private String owner_fname;
    private String owner_lname;
    private String cat_name;
    private String description;
    private int init_date;
    private String src_name;
    private String instr_text;
    private AutoTaskId auto_task_id;
    private AtId at_id;
    private boolean active;
    private List<Object> members = null;
    private Perms perms;
    private Creator creator;
    private List<Note> notes = null;
    private int closed_date;
    private List<Action> actions = null;
    private PhaseId phase_id;
    private CategoryId category_id;
    private int notes_count;
    private int attachments_count;
    private boolean _private;
    private CreatorPrincipal creator_principal;

    public String getInc_name() {
        return inc_name;
    }

    public void setInc_name(String incName) {
        this.inc_name = incName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCustom() {
        return custom;
    }

    public void setCustom(boolean custom) {
        this.custom = custom;
    }

    public int getInc_id() {
        return inc_id;
    }

    public void setInc_id(int incId) {
        this.inc_id = incId;
    }

    public IncOwnerId getInc_owner_id() {
        return inc_owner_id;
    }

    public void setInc_owner_id(IncOwnerId incOwnerId) {
        this.inc_owner_id = incOwnerId;
    }

    public int getDue_date() {
        return due_date;
    }

    public void setDue_date(int dueDate) {
        this.due_date = dueDate;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public OwnerId getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(OwnerId ownerId) {
        this.owner_id = ownerId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isInc_training() {
        return inc_training;
    }

    public void setInc_training(boolean incTraining) {
        this.inc_training = incTraining;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public void setFrozen(boolean frozen) {
        this.frozen = frozen;
    }

    public String getOwner_fname() {
        return owner_fname;
    }

    public void setOwner_fname(String ownerFname) {
        this.owner_fname = ownerFname;
    }

    public String getOwner_lname() {
        return owner_lname;
    }

    public void setOwner_lname(String ownerLname) {
        this.owner_lname = ownerLname;
    }

    public String getCat_name() {
        return cat_name;
    }

    public void setCat_name(String catName) {
        this.cat_name = catName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getInit_date() {
        return init_date;
    }

    public void setInit_date(int initDate) {
        this.init_date = initDate;
    }

    public String getSrc_name() {
        return src_name;
    }

    public void setSrc_name(String srcName) {
        this.src_name = srcName;
    }

    public String getInstr_text() {
        return instr_text;
    }

    public void setInstr_text(String instrText) {
        this.instr_text = instrText;
    }

    public AutoTaskId getAuto_task_id() {
        return auto_task_id;
    }

    public void setAuto_task_id(AutoTaskId autoTaskId) {
        this.auto_task_id = autoTaskId;
    }

    public AtId getAt_id() {
        return at_id;
    }

    public void setAt_id(AtId atId) {
        this.at_id = atId;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<Object> getMembers() {
        return members;
    }

    public void setMembers(List<Object> members) {
        this.members = members;
    }

    public Perms getPerms() {
        return perms;
    }

    public void setPerms(Perms perms) {
        this.perms = perms;
    }

    public Creator getCreator() {
        return creator;
    }

    public void setCreator(Creator creator) {
        this.creator = creator;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public int getClosed_date() {
        return closed_date;
    }

    public void setClosed_date(int closedDate) {
        this.closed_date = closedDate;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    public PhaseId getPhase_id() {
        return phase_id;
    }

    public void setPhase_id(PhaseId phaseId) {
        this.phase_id = phaseId;
    }

    public CategoryId getCategory_id() {
        return category_id;
    }

    public void setCategory_id(CategoryId categoryId) {
        this.category_id = categoryId;
    }

    public int getNotes_count() {
        return notes_count;
    }

    public void setNotes_count(int notesCount) {
        this.notes_count = notesCount;
    }

    public int getAttachments_count() {
        return attachments_count;
    }

    public void setAttachments_count(int attachmentsCount) {
        this.attachments_count = attachmentsCount;
    }

    public boolean isPrivate() {
        return _private;
    }

    public void setPrivate(boolean _private) {
        this._private = _private;
    }

    public CreatorPrincipal getCreator_principal() {
        return creator_principal;
    }

    public void setCreator_principal(CreatorPrincipal creatorPrincipal) {
        this.creator_principal = creatorPrincipal;
    }

}
