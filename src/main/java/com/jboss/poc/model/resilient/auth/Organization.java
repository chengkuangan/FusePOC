package com.jboss.poc.model.resilient.auth;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "name", "addr", "addr2", "city", "state", "zip", "perms", "enabled", "attachments_enabled",
		"tasks_private", "has_saml", "require_saml", "twofactor_auth_domain", "has_available_twofactor",
		"authorized_ldap_group", "supports_ldap", "incident_deletion_allowed", "session_timeout",
		"effective_permissions", "role_handles", "twofactor_cookie_lifetime_secs" })
public class Organization {

	@JsonProperty("id")
	private int id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("addr")
	private Object addr;
	@JsonProperty("addr2")
	private Object addr2;
	@JsonProperty("city")
	private Object city;
	@JsonProperty("state")
	private Object state;
	@JsonProperty("zip")
	private Object zip;
	@JsonProperty("perms")
	private Permissions permissions;
	@JsonProperty("enabled")
	private boolean enabled;
	@JsonProperty("attachments_enabled")
	private boolean attachmentsEnabled;
	@JsonProperty("tasks_private")
	private boolean tasksPrivate;
	@JsonProperty("has_saml")
	private boolean hasSaml;
	@JsonProperty("require_saml")
	private boolean requireSaml;
	@JsonProperty("twofactor_auth_domain")
	private Object twofactorAuthDomain;
	@JsonProperty("has_available_twofactor")
	private boolean hasAvailableTwofactor;
	@JsonProperty("authorized_ldap_group")
	private Object authorizedLdapGroup;
	@JsonProperty("supports_ldap")
	private boolean supportsLdap;
	@JsonProperty("incident_deletion_allowed")
	private boolean incidentDeletionAllowed;
	@JsonProperty("session_timeout")
	private int sessionTimeout;
	@JsonProperty("effective_permissions")
	private List<Integer> effectivePermissions = null;
	@JsonProperty("role_handles")
	private List<Integer> roleHandles = null;
	@JsonProperty("twofactor_cookie_lifetime_secs")
	private int twofactorCookieLifetimeSecs;

	@JsonProperty("id")
	public int getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(int id) {
		this.id = id;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("addr")
	public Object getAddr() {
		return addr;
	}

	@JsonProperty("addr")
	public void setAddr(Object addr) {
		this.addr = addr;
	}

	@JsonProperty("addr2")
	public Object getAddr2() {
		return addr2;
	}

	@JsonProperty("addr2")
	public void setAddr2(Object addr2) {
		this.addr2 = addr2;
	}

	@JsonProperty("city")
	public Object getCity() {
		return city;
	}

	@JsonProperty("city")
	public void setCity(Object city) {
		this.city = city;
	}

	@JsonProperty("state")
	public Object getState() {
		return state;
	}

	@JsonProperty("state")
	public void setState(Object state) {
		this.state = state;
	}

	@JsonProperty("zip")
	public Object getZip() {
		return zip;
	}

	@JsonProperty("zip")
	public void setZip(Object zip) {
		this.zip = zip;
	}

	@JsonProperty("perms")
	public Permissions getPerms() {
		return permissions;
	}

	@JsonProperty("perms")
	public void setPerms(Permissions permissions) {
		this.permissions = permissions;
	}

	@JsonProperty("enabled")
	public boolean isEnabled() {
		return enabled;
	}

	@JsonProperty("enabled")
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@JsonProperty("attachments_enabled")
	public boolean isAttachmentsEnabled() {
		return attachmentsEnabled;
	}

	@JsonProperty("attachments_enabled")
	public void setAttachmentsEnabled(boolean attachmentsEnabled) {
		this.attachmentsEnabled = attachmentsEnabled;
	}

	@JsonProperty("tasks_private")
	public boolean isTasksPrivate() {
		return tasksPrivate;
	}

	@JsonProperty("tasks_private")
	public void setTasksPrivate(boolean tasksPrivate) {
		this.tasksPrivate = tasksPrivate;
	}

	@JsonProperty("has_saml")
	public boolean isHasSaml() {
		return hasSaml;
	}

	@JsonProperty("has_saml")
	public void setHasSaml(boolean hasSaml) {
		this.hasSaml = hasSaml;
	}

	@JsonProperty("require_saml")
	public boolean isRequireSaml() {
		return requireSaml;
	}

	@JsonProperty("require_saml")
	public void setRequireSaml(boolean requireSaml) {
		this.requireSaml = requireSaml;
	}

	@JsonProperty("twofactor_auth_domain")
	public Object getTwofactorAuthDomain() {
		return twofactorAuthDomain;
	}

	@JsonProperty("twofactor_auth_domain")
	public void setTwofactorAuthDomain(Object twofactorAuthDomain) {
		this.twofactorAuthDomain = twofactorAuthDomain;
	}

	@JsonProperty("has_available_twofactor")
	public boolean isHasAvailableTwofactor() {
		return hasAvailableTwofactor;
	}

	@JsonProperty("has_available_twofactor")
	public void setHasAvailableTwofactor(boolean hasAvailableTwofactor) {
		this.hasAvailableTwofactor = hasAvailableTwofactor;
	}

	@JsonProperty("authorized_ldap_group")
	public Object getAuthorizedLdapGroup() {
		return authorizedLdapGroup;
	}

	@JsonProperty("authorized_ldap_group")
	public void setAuthorizedLdapGroup(Object authorizedLdapGroup) {
		this.authorizedLdapGroup = authorizedLdapGroup;
	}

	@JsonProperty("supports_ldap")
	public boolean isSupportsLdap() {
		return supportsLdap;
	}

	@JsonProperty("supports_ldap")
	public void setSupportsLdap(boolean supportsLdap) {
		this.supportsLdap = supportsLdap;
	}

	@JsonProperty("incident_deletion_allowed")
	public boolean isIncidentDeletionAllowed() {
		return incidentDeletionAllowed;
	}

	@JsonProperty("incident_deletion_allowed")
	public void setIncidentDeletionAllowed(boolean incidentDeletionAllowed) {
		this.incidentDeletionAllowed = incidentDeletionAllowed;
	}

	@JsonProperty("session_timeout")
	public int getSessionTimeout() {
		return sessionTimeout;
	}

	@JsonProperty("session_timeout")
	public void setSessionTimeout(int sessionTimeout) {
		this.sessionTimeout = sessionTimeout;
	}

	@JsonProperty("effective_permissions")
	public List<Integer> getEffectivePermissions() {
		return effectivePermissions;
	}

	@JsonProperty("effective_permissions")
	public void setEffectivePermissions(List<Integer> effectivePermissions) {
		this.effectivePermissions = effectivePermissions;
	}

	@JsonProperty("role_handles")
	public List<Integer> getRoleHandles() {
		return roleHandles;
	}

	@JsonProperty("role_handles")
	public void setRoleHandles(List<Integer> roleHandles) {
		this.roleHandles = roleHandles;
	}

	@JsonProperty("twofactor_cookie_lifetime_secs")
	public int getTwofactorCookieLifetimeSecs() {
		return twofactorCookieLifetimeSecs;
	}

	@JsonProperty("twofactor_cookie_lifetime_secs")
	public void setTwofactorCookieLifetimeSecs(int twofactorCookieLifetimeSecs) {
		this.twofactorCookieLifetimeSecs = twofactorCookieLifetimeSecs;
	}

}
