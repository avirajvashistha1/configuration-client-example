package com.example.demo.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("db")
public class DatabaseConnectionSettings {

	private String connectionvalues;
	private String host;
	private String port;
	
	
	
	/**
	 * @return the connectionvalues
	 */
	public String getConnectionvalues() {
		return connectionvalues;
	}
	/**
	 * @param connectionvalues the connectionvalues to set
	 */
	public void setConnectionvalues(String connectionvalues) {
		this.connectionvalues = connectionvalues;
	}
	/**
	 * @return the host
	 */
	public String getHost() {
		return host;
	}
	/**
	 * @param host the host to set
	 */
	public void setHost(String host) {
		this.host = host;
	}
	/**
	 * @return the port
	 */
	public String getPort() {
		return port;
	}
	/**
	 * @param port the port to set
	 */
	public void setPort(String port) {
		this.port = port;
	}
	
	@Override
	public String toString() {
		return "CONNECTION STRING :"+this.connectionvalues.toString() +", HOST :"+this.getHost()+", PORT : "+this.getPort();
	}
	
}
