
package com.jboss.poc.model;


public class Hit {

    private String id;
    private String value;
    private ThreatSourceId threat_source_id;
    private ArtifactTypeId artifact_type_id;
    private boolean active;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ThreatSourceId getThreat_source_id() {
        return threat_source_id;
    }

    public void setThreat_source_id(ThreatSourceId threatSourceId) {
        this.threat_source_id = threatSourceId;
    }

    public ArtifactTypeId getArtifact_type_id() {
        return artifact_type_id;
    }

    public void setArtifact_type_id(ArtifactTypeId artifactTypeId) {
        this.artifact_type_id = artifactTypeId;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

}
