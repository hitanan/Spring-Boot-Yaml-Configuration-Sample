package com.nttdata;

public class ApiInfo {

	String name;
	String swaggerUrl;
    String version;
    String description;
    String apiUrl;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getApiUrl() {
		return apiUrl;
	}
	public void setApiUrl(String apiUrl) {
		this.apiUrl = apiUrl;
	}
	public String getSwaggerUrl() {
		return swaggerUrl;
	}
	public void setSwaggerUrl(String swaggerUrl) {
		this.swaggerUrl = swaggerUrl;
	}
	
	
}
