
package com.jboss.poc.model;


public class Hipaa {

    private boolean hipaa_adverse;
    private boolean hipaa_misused;
    private boolean hipaa_acquired;
    private boolean hipaa_additional_misuse;
    private boolean hipaa_breach;
    private String hipaa_adverse_comment;
    private String hipaa_misused_comment;
    private String hipaa_acquired_comment;
    private String hipaa_additional_misuse_comment;
    private String hipaa_breach_comment;

    public boolean isHipaa_adverse() {
        return hipaa_adverse;
    }

    public void setHipaa_adverse(boolean hipaaAdverse) {
        this.hipaa_adverse = hipaaAdverse;
    }

    public boolean isHipaa_misused() {
        return hipaa_misused;
    }

    public void setHipaa_misused(boolean hipaaMisused) {
        this.hipaa_misused = hipaaMisused;
    }

    public boolean isHipaa_acquired() {
        return hipaa_acquired;
    }

    public void setHipaa_acquired(boolean hipaaAcquired) {
        this.hipaa_acquired = hipaaAcquired;
    }

    public boolean isHipaa_additional_misuse() {
        return hipaa_additional_misuse;
    }

    public void setHipaa_additional_misuse(boolean hipaaAdditionalMisuse) {
        this.hipaa_additional_misuse = hipaaAdditionalMisuse;
    }

    public boolean isHipaa_breach() {
        return hipaa_breach;
    }

    public void setHipaa_breach(boolean hipaaBreach) {
        this.hipaa_breach = hipaaBreach;
    }

    public String getHipaa_adverse_comment() {
        return hipaa_adverse_comment;
    }

    public void setHipaa_adverse_comment(String hipaaAdverseComment) {
        this.hipaa_adverse_comment = hipaaAdverseComment;
    }

    public String getHipaa_misused_comment() {
        return hipaa_misused_comment;
    }

    public void setHipaa_misused_comment(String hipaaMisusedComment) {
        this.hipaa_misused_comment = hipaaMisusedComment;
    }

    public String getHipaa_acquired_comment() {
        return hipaa_acquired_comment;
    }

    public void setHipaa_acquired_comment(String hipaaAcquiredComment) {
        this.hipaa_acquired_comment = hipaaAcquiredComment;
    }

    public String getHipaa_additional_misuse_comment() {
        return hipaa_additional_misuse_comment;
    }

    public void setHipaa_additional_misuse_comment(String hipaaAdditionalMisuseComment) {
        this.hipaa_additional_misuse_comment = hipaaAdditionalMisuseComment;
    }

    public String getHipaa_breach_comment() {
        return hipaa_breach_comment;
    }

    public void setHipaa_breach_comment(String hipaaBreachComment) {
        this.hipaa_breach_comment = hipaaBreachComment;
    }

}
