
package com.jboss.poc.model;

import java.util.List;

public class Pii {

    private boolean data_compromised;
    private HarmstatusId harmstatus_id;
    private boolean data_encrypted;
    private boolean data_contained;
    private boolean impact_likely;
    private List<Object> data_source_ids = null;
    private DataFormat data_format;
    private String assessment;
    private int exposure;
    private GdprHarmRisk gdpr_harm_risk;
    private List<Object> gdpr_lawful_data_processing_categories = null;

    public boolean isData_compromised() {
        return data_compromised;
    }

    public void setData_compromised(boolean dataCompromised) {
        this.data_compromised = dataCompromised;
    }

    public HarmstatusId getHarmstatus_id() {
        return harmstatus_id;
    }

    public void setHarmstatus_id(HarmstatusId harmstatusId) {
        this.harmstatus_id = harmstatusId;
    }

    public boolean isData_encrypted() {
        return data_encrypted;
    }

    public void setData_encrypted(boolean dataEncrypted) {
        this.data_encrypted = dataEncrypted;
    }

    public boolean isData_contained() {
        return data_contained;
    }

    public void setData_contained(boolean dataContained) {
        this.data_contained = dataContained;
    }

    public boolean isImpact_likely() {
        return impact_likely;
    }

    public void setImpact_likely(boolean impactLikely) {
        this.impact_likely = impactLikely;
    }

    public List<Object> getData_source_ids() {
        return data_source_ids;
    }

    public void setData_source_ids(List<Object> dataSourceIds) {
        this.data_source_ids = dataSourceIds;
    }

    public DataFormat getData_format() {
        return data_format;
    }

    public void setData_format(DataFormat dataFormat) {
        this.data_format = dataFormat;
    }

    public String getAssessment() {
        return assessment;
    }

    public void setAssessment(String assessment) {
        this.assessment = assessment;
    }

    public int getExposure() {
        return exposure;
    }

    public void setExposure(int exposure) {
        this.exposure = exposure;
    }

    public GdprHarmRisk getGdpr_harm_risk() {
        return gdpr_harm_risk;
    }

    public void setGdpr_harm_risk(GdprHarmRisk gdprHarmRisk) {
        this.gdpr_harm_risk = gdprHarmRisk;
    }

    public List<Object> getGdpr_lawful_data_processing_categories() {
        return gdpr_lawful_data_processing_categories;
    }

    public void setGdpr_lawful_data_processing_categories(List<Object> gdprLawfulDataProcessingCategories) {
        this.gdpr_lawful_data_processing_categories = gdprLawfulDataProcessingCategories;
    }

}
