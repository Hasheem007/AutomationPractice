package com.selenium.helper;

public class FileDataManger {
	
	public static FileDataManger fdm = new FileDataManger();
	public ConfigReader cr;
	
	public ConfigReader getConfigReader() throws Throwable {
    
		if (cr==null) {
			cr = new ConfigReader();
			
		}
		return cr;

}
	private FileDataManger( ) {
		
	}
}