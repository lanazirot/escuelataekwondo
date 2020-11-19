package com.database;
/*
 * @author Alan Pena 
 * @see Azure
 * 
 * */

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;


public final class AzureHelperConnection {
	private Connection connection = null;
	private AzureHelperConnection instance = null;
	private String URL = "";
	{
		Logger log = Logger.getGlobal();
		Properties props = new Properties();
		try {
			props.load(AzureHelperConnection.class.getClassLoader().getResourceAsStream("application.properties"));
			URL = props.getProperty("URL");			
			connection = DriverManager.getConnection(URL);
		} catch (IOException e) {
			log.log(Level.SEVERE, e.getLocalizedMessage());
		} catch (SQLException e) {
			log.log(Level.SEVERE, e.getLocalizedMessage());
		}
	}
	
	private AzureHelperConnection() {}
	
	
	
	public AzureHelperConnection GetInstance() {
		if(instance==null) {
			instance  = new AzureHelperConnection();
		}
		return instance;
	}
	
	
	
	
	
	
	public void close() throws SQLException {
		if(connection!=null)
			connection.close();
	}
	
	
	
	
}
