
package com.jboss.poc.model;

import java.util.List;

public class Artifact {

    private int id;
    private Type type;
    private String value;
    private Description_ description;
    private Creator creator;
    private List<Hit> hits = null;
    private Attachment attachment;
    private int parent_id;
    private int inc_id;
    private String inc_name;
    private IncOwner inc_owner;
    private int created;
    private List<Object> pending_sources = null;
    private Perms perms;
    private List<Property> properties = null;
    private Location location;
    private Whois whois;
    private List<Action> actions = null;
    private boolean relating;
    private CreatorPrincipal creator_principal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Description_ getDescription() {
        return description;
    }

    public void setDescription(Description_ description) {
        this.description = description;
    }

    public Creator getCreator() {
        return creator;
    }

    public void setCreator(Creator creator) {
        this.creator = creator;
    }

    public List<Hit> getHits() {
        return hits;
    }

    public void setHits(List<Hit> hits) {
        this.hits = hits;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parentId) {
        this.parent_id = parentId;
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

    public int getCreated() {
        return created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public List<Object> getPending_sources() {
        return pending_sources;
    }

    public void setPending_sources(List<Object> pendingSources) {
        this.pending_sources = pendingSources;
    }

    public Perms getPerms() {
        return perms;
    }

    public void setPerms(Perms perms) {
        this.perms = perms;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Whois getWhois() {
        return whois;
    }

    public void setWhois(Whois whois) {
        this.whois = whois;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    public boolean isRelating() {
        return relating;
    }

    public void setRelating(boolean relating) {
        this.relating = relating;
    }

    public CreatorPrincipal getCreator_principal() {
        return creator_principal;
    }

    public void setCreator_principal(CreatorPrincipal creatorPrincipal) {
        this.creator_principal = creatorPrincipal;
    }

}
