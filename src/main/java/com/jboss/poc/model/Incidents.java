
package com.jboss.poc.model;

import java.util.List;

public class Incidents {

    private int id;
    private String name;
    private int discovered_date;
    private int due_date;
    private int create_date;
    private Description description;
    private OwnerId owner_id;
    private PhaseId phase_id;
    private SeverityCode severity_code;
    private String plan_status;
    private boolean inc_training;
    private int vers;
    private String addr;
    private String city;
    private CreatorId creator_id;
    private Creator creator;
    private CrimestatusId crimestatus_id;
    private boolean employee_involved;
    private int end_date;
    private ExposureDeptId exposure_dept_id;
    private String exposure_individual_name;
    private ExposureVendorId exposure_vendor_id;
    private List<Object> incident_type_ids = null;
    private String jurisdiction_name;
    private int jurisdiction_reg_id;
    private String reporter;
    private int start_date;
    private State state;
    private Country country;
    private String zip;
    private int exposure;
    private int org_id;
    private boolean is_scenario;
    private List<Object> members = null;
    private boolean negative_pr_likely;
    private Perms perms;
    private boolean confirmed;
    private TaskChanges task_changes;
    private ExposureTypeId exposure_type_id;
    private String assessment;
    private boolean data_compromised;
    private List<Object> nist_attack_vectors = null;
    private ResolutionId resolution_id;
    private ResolutionSummary resolution_summary;
    private Pii pii;
    private Cm cm;
    private Regulators regulators;
    private Hipaa hipaa;
    private List<Task> tasks = null;
    private List<Artifact> artifacts = null;
    private List<Comment> comments = null;
    private List<Action> actions = null;

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

    public int getDiscovered_date() {
        return discovered_date;
    }

    public void setDiscovered_date(int discoveredDate) {
        this.discovered_date = discoveredDate;
    }

    public int getDue_date() {
        return due_date;
    }

    public void setDue_date(int dueDate) {
        this.due_date = dueDate;
    }

    public int getCreate_date() {
        return create_date;
    }

    public void setCreate_date(int createDate) {
        this.create_date = createDate;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public OwnerId getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(OwnerId ownerId) {
        this.owner_id = ownerId;
    }

    public PhaseId getPhase_id() {
        return phase_id;
    }

    public void setPhase_id(PhaseId phaseId) {
        this.phase_id = phaseId;
    }

    public SeverityCode getSeverity_code() {
        return severity_code;
    }

    public void setSeverity_code(SeverityCode severityCode) {
        this.severity_code = severityCode;
    }

    public String getPlan_status() {
        return plan_status;
    }

    public void setPlan_status(String planStatus) {
        this.plan_status = planStatus;
    }

    public boolean isInc_training() {
        return inc_training;
    }

    public void setInc_training(boolean incTraining) {
        this.inc_training = incTraining;
    }

    public int getVers() {
        return vers;
    }

    public void setVers(int vers) {
        this.vers = vers;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public CreatorId getCreator_id() {
        return creator_id;
    }

    public void setCreator_id(CreatorId creatorId) {
        this.creator_id = creatorId;
    }

    public Creator getCreator() {
        return creator;
    }

    public void setCreator(Creator creator) {
        this.creator = creator;
    }

    public CrimestatusId getCrimestatus_id() {
        return crimestatus_id;
    }

    public void setCrimestatus_id(CrimestatusId crimestatusId) {
        this.crimestatus_id = crimestatusId;
    }

    public boolean isEmployee_involved() {
        return employee_involved;
    }

    public void setEmployee_involved(boolean employeeInvolved) {
        this.employee_involved = employeeInvolved;
    }

    public int getEnd_date() {
        return end_date;
    }

    public void setEnd_date(int endDate) {
        this.end_date = endDate;
    }

    public ExposureDeptId getExposure_dept_id() {
        return exposure_dept_id;
    }

    public void setExposure_dept_id(ExposureDeptId exposureDeptId) {
        this.exposure_dept_id = exposureDeptId;
    }

    public String getExposure_individual_name() {
        return exposure_individual_name;
    }

    public void setExposure_individual_name(String exposureIndividualName) {
        this.exposure_individual_name = exposureIndividualName;
    }

    public ExposureVendorId getExposure_vendor_id() {
        return exposure_vendor_id;
    }

    public void setExposure_vendor_id(ExposureVendorId exposureVendorId) {
        this.exposure_vendor_id = exposureVendorId;
    }

    public List<Object> getIncident_type_ids() {
        return incident_type_ids;
    }

    public void setIncident_type_ids(List<Object> incidentTypeIds) {
        this.incident_type_ids = incidentTypeIds;
    }

    public String getJurisdiction_name() {
        return jurisdiction_name;
    }

    public void setJurisdiction_name(String jurisdictionName) {
        this.jurisdiction_name = jurisdictionName;
    }

    public int getJurisdiction_reg_id() {
        return jurisdiction_reg_id;
    }

    public void setJurisdiction_reg_id(int jurisdictionRegId) {
        this.jurisdiction_reg_id = jurisdictionRegId;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    public int getStart_date() {
        return start_date;
    }

    public void setStart_date(int startDate) {
        this.start_date = startDate;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public int getExposure() {
        return exposure;
    }

    public void setExposure(int exposure) {
        this.exposure = exposure;
    }

    public int getOrg_id() {
        return org_id;
    }

    public void setOrg_id(int orgId) {
        this.org_id = orgId;
    }

    public boolean isIs_scenario() {
        return is_scenario;
    }

    public void setIs_scenario(boolean isScenario) {
        this.is_scenario = isScenario;
    }

    public List<Object> getMembers() {
        return members;
    }

    public void setMembers(List<Object> members) {
        this.members = members;
    }

    public boolean isNegative_pr_likely() {
        return negative_pr_likely;
    }

    public void setNegative_pr_likely(boolean negativePrLikely) {
        this.negative_pr_likely = negativePrLikely;
    }

    public Perms getPerms() {
        return perms;
    }

    public void setPerms(Perms perms) {
        this.perms = perms;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    public TaskChanges getTask_changes() {
        return task_changes;
    }

    public void setTask_changes(TaskChanges taskChanges) {
        this.task_changes = taskChanges;
    }

    public ExposureTypeId getExposure_type_id() {
        return exposure_type_id;
    }

    public void setExposure_type_id(ExposureTypeId exposureTypeId) {
        this.exposure_type_id = exposureTypeId;
    }

    public String getAssessment() {
        return assessment;
    }

    public void setAssessment(String assessment) {
        this.assessment = assessment;
    }

    public boolean isData_compromised() {
        return data_compromised;
    }

    public void setData_compromised(boolean dataCompromised) {
        this.data_compromised = dataCompromised;
    }

    public List<Object> getNist_attack_vectors() {
        return nist_attack_vectors;
    }

    public void setNist_attack_vectors(List<Object> nistAttackVectors) {
        this.nist_attack_vectors = nistAttackVectors;
    }

    public ResolutionId getResolution_id() {
        return resolution_id;
    }

    public void setResolution_id(ResolutionId resolutionId) {
        this.resolution_id = resolutionId;
    }

    public ResolutionSummary getResolution_summary() {
        return resolution_summary;
    }

    public void setResolution_summary(ResolutionSummary resolutionSummary) {
        this.resolution_summary = resolutionSummary;
    }

    public Pii getPii() {
        return pii;
    }

    public void setPii(Pii pii) {
        this.pii = pii;
    }

    public Cm getCm() {
        return cm;
    }

    public void setCm(Cm cm) {
        this.cm = cm;
    }

    public Regulators getRegulators() {
        return regulators;
    }

    public void setRegulators(Regulators regulators) {
        this.regulators = regulators;
    }

    public Hipaa getHipaa() {
        return hipaa;
    }

    public void setHipaa(Hipaa hipaa) {
        this.hipaa = hipaa;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public List<Artifact> getArtifacts() {
        return artifacts;
    }

    public void setArtifacts(List<Artifact> artifacts) {
        this.artifacts = artifacts;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

}
