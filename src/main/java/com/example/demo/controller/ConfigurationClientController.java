package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.DatabaseConnectionSettings;

@RestController
public class ConfigurationClientController {
	
	@Autowired
	private DatabaseConnectionSettings dbConfigSetting;
	
	@Value("${config.value}")
	private String value1;
	
	@Value("${geeting.value:default greeting}")
	private String greeting;
	
	@Value("${config.list.values}")
	private List<String> listValues;
	
	@Value("#{${db.connectionvalues}}")
	private Map<String, String> dbConfigValues;
	
	@RequestMapping("/dbconfigsetting")
	public String getDBConfigSetting() {
		return dbConfigSetting.toString();
	}
	
	@RequestMapping("/databaseconnproperties")
	public Map<String, String> getDatabaseProperties(){
		return dbConfigValues;
	}

	@RequestMapping("/listvalues")
	public List<String> getListValues() {
		return listValues;
	}
	
	@RequestMapping("/values")
	public String getConfigurationValues() {
		return value1; 
	}
	
	@RequestMapping("/greeting")
	public String getGreetings() {
		return greeting;
	}
	
	// Avoid using the environment object as this would affect the testing capability of the application on different environments.
	@Autowired
	private Environment env;
	
	@RequestMapping("/env")
	public String getEnv() {
		return env.toString();
	}
	
}
