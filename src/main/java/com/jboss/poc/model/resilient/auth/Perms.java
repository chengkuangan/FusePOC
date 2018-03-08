package com.jboss.poc.model.resilient.auth;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "administrator", "observer", "master_administrator", "create_incs", "create_shared_layout" })
public class Perms {

	@JsonProperty("administrator")
	private boolean administrator;
	@JsonProperty("observer")
	private boolean observer;
	@JsonProperty("master_administrator")
	private boolean masterAdministrator;
	@JsonProperty("create_incs")
	private boolean createIncs;
	@JsonProperty("create_shared_layout")
	private boolean createSharedLayout;

	@JsonProperty("administrator")
	public boolean isAdministrator() {
		return administrator;
	}

	@JsonProperty("administrator")
	public void setAdministrator(boolean administrator) {
		this.administrator = administrator;
	}

	@JsonProperty("observer")
	public boolean isObserver() {
		return observer;
	}

	@JsonProperty("observer")
	public void setObserver(boolean observer) {
		this.observer = observer;
	}

	@JsonProperty("master_administrator")
	public boolean isMasterAdministrator() {
		return masterAdministrator;
	}

	@JsonProperty("master_administrator")
	public void setMasterAdministrator(boolean masterAdministrator) {
		this.masterAdministrator = masterAdministrator;
	}

	@JsonProperty("create_incs")
	public boolean isCreateIncs() {
		return createIncs;
	}

	@JsonProperty("create_incs")
	public void setCreateIncs(boolean createIncs) {
		this.createIncs = createIncs;
	}

	@JsonProperty("create_shared_layout")
	public boolean isCreateSharedLayout() {
		return createSharedLayout;
	}

	@JsonProperty("create_shared_layout")
	public void setCreateSharedLayout(boolean createSharedLayout) {
		this.createSharedLayout = createSharedLayout;
	}

}
