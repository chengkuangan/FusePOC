package com.jboss.poc.model.resilient.auth;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "orgs", "user_id", "user_fname", "user_lname", "user_email", "saml_alias", "csrf_token",
		"session_ip", "is_saml", "is_ldap" })
public class Credential {

	@JsonProperty("orgs")
	private List<Organization> organizations = null;
	@JsonProperty("user_id")
	private int userId;
	@JsonProperty("user_fname")
	private String userFname;
	@JsonProperty("user_lname")
	private String userLname;
	@JsonProperty("user_email")
	private String userEmail;
	@JsonProperty("saml_alias")
	private Object samlAlias;
	@JsonProperty("csrf_token")
	private String csrfToken;
	@JsonProperty("session_ip")
	private String sessionIp;
	@JsonProperty("is_saml")
	private boolean isSaml;
	@JsonProperty("is_ldap")
	private boolean isLdap;

	@JsonProperty("orgs")
	public List<Organization> getOrgs() {
		return organizations;
	}

	@JsonProperty("orgs")
	public void setOrgs(List<Organization> organizations) {
		this.organizations = organizations;
	}

	@JsonProperty("user_id")
	public int getUserId() {
		return userId;
	}

	@JsonProperty("user_id")
	public void setUserId(int userId) {
		this.userId = userId;
	}

	@JsonProperty("user_fname")
	public String getUserFname() {
		return userFname;
	}

	@JsonProperty("user_fname")
	public void setUserFname(String userFname) {
		this.userFname = userFname;
	}

	@JsonProperty("user_lname")
	public String getUserLname() {
		return userLname;
	}

	@JsonProperty("user_lname")
	public void setUserLname(String userLname) {
		this.userLname = userLname;
	}

	@JsonProperty("user_email")
	public String getUserEmail() {
		return userEmail;
	}

	@JsonProperty("user_email")
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	@JsonProperty("saml_alias")
	public Object getSamlAlias() {
		return samlAlias;
	}

	@JsonProperty("saml_alias")
	public void setSamlAlias(Object samlAlias) {
		this.samlAlias = samlAlias;
	}

	@JsonProperty("csrf_token")
	public String getCsrfToken() {
		return csrfToken;
	}

	@JsonProperty("csrf_token")
	public void setCsrfToken(String csrfToken) {
		this.csrfToken = csrfToken;
	}

	@JsonProperty("session_ip")
	public String getSessionIp() {
		return sessionIp;
	}

	@JsonProperty("session_ip")
	public void setSessionIp(String sessionIp) {
		this.sessionIp = sessionIp;
	}

	@JsonProperty("is_saml")
	public boolean isIsSaml() {
		return isSaml;
	}

	@JsonProperty("is_saml")
	public void setIsSaml(boolean isSaml) {
		this.isSaml = isSaml;
	}

	@JsonProperty("is_ldap")
	public boolean isIsLdap() {
		return isLdap;
	}

	@JsonProperty("is_ldap")
	public void setIsLdap(boolean isLdap) {
		this.isLdap = isLdap;
	}

}