package com.corejava.practice.javapractices.basicsofjava.nio.java7.filepackage.watchservice;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class ConfigChangeTest {
	
	private static final String FILE_PATH = "C:/abhishek/workspaces-java-practices/corejava-and-ds-with-spring/"
			+"src/main/resources/TestForAbstractClass/TestForAbstractClass.properties";

	public static void main(String[] args) {
		ConfigurationChangeListner listner = new ConfigurationChangeListner(
				FILE_PATH);
		try {
			new Thread(listner).start();
			while (true) {
				Thread.sleep(2000l);
				System.out.println(ApplicationConfiguration.getInstance()
						.getConfiguration("TEST_KEY"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
