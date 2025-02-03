package com.rohit.utils;

import java.io.InputStream;
import java.util.Properties;


public class PropertyReader {
	private static Properties envProperty = new Properties();
	private static Properties configProperty = new Properties();

	static {

		try {

			InputStream envfile = PropertyReader.class.getClassLoader().getResourceAsStream("env.properties");
			envProperty.load(envfile);
			String env = envProperty.getProperty("env");
			InputStream configfile = PropertyReader.class.getClassLoader()
					.getResourceAsStream(env + "-config.properties");
			configProperty.load(configfile);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static String getDataProperty(String key) {
		return configProperty.getProperty(key).trim();

	}
}
