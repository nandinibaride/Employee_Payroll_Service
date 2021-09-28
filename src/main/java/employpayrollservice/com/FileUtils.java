package employpayrollservice.com;

import java.io.File;
import java.security.DomainCombiner;

public class FileUtils {
	public static boolean deleteFolder(File file) {
		for (File subFile : file.listFiles()) {
			if (subFile.isDirectory()) {
				deleteFolder(subFile);
			} 
			else {
				subFile.delete();
			}
		}
		return file.delete();
	}
	
}
