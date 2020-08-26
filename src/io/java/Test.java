package io.java;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String a[]) {
		/*
		 * final File downloadDirectory = new File("D:\\My_Learning\\Java"); final
		 * File[] files = downloadDirectory.listFiles( (dir,name) ->
		 * name.endsWith(".vtt"));
		 */
	    
	    File folder = new File("D:\\My_Learning\\Java");
        File fList[] = folder.listFiles();
        System.out.print("file count is "+fList);
        
        
        
	   // Arrays.asList(files).stream().forEach(File::delete);
        
        String directory = "D:\\My_Learning\\Java";
        for (File f : listf(directory)) {
            if (f.getName().endsWith(".vtt")) {
            	 
        	    System.out.print("file name is "+f);
                f.delete(); 
            }}
	}

	 public static List<File> listf(String directoryName) {
	        File directory = new File(directoryName);

	        List<File> resultList = new ArrayList<File>();

	        // get all the files from a directory
	        File[] fList = directory.listFiles();
	        resultList.addAll(Arrays.asList(fList));
	        for (File file : fList) {
	            if (file.isFile()) {
	                System.out.println(file.getAbsolutePath());
	            } else if (file.isDirectory()) {
	                resultList.addAll(listf(file.getAbsolutePath()));
	            }
	        }
	        
	        String testString = "This Is Test";
	        char[] stringToCharArray = testString. toCharArray();
	        //System.out.println(fList);
	        return resultList;
	    } 
 }
