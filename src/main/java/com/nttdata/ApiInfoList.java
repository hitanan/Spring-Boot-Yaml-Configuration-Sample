package com.nttdata;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties(prefix = "input")
public class ApiInfoList {
    private List<ApiInfo> apis = new ArrayList<ApiInfo>();
    

	public void setApis(List<ApiInfo> apis) {
		this.apis = apis;
	}

	public List<ApiInfo> getApis() {
        return this.apis;
    }
	

    public void log() {
    	 for(ApiInfo current : this.getApis()) {
             System.out.println(current.getName());
        }
    }

	
}
