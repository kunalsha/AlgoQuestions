package com.practice.ds.situation.loganalyze;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DependencyAnalyzer {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("July26.txt");
		Scanner sc = new Scanner(file);

		List<String> depList = new ArrayList<>();
		
		StringBuilder sb = new StringBuilder();

		//String content = new Scanner(System.in).useDelimiter("\\Z").read();

		while (sc.hasNextLine()) {
			//String line = sc.next();
			//System.out.println(line);
			//depList.add(line);
			sb.append(sc.nextLine());
		}
		
		String[] newLines = sb.toString().split("Could not locate");
		
		Map<String, String> resultMap = new LinkedHashMap<>();

		for (String line : newLines) {
			Entry result = findEntry(line);
			if(null != result)
				resultMap.put(result.getFileInWhich(), result.getReference());
		}
		
		Set<java.util.Map.Entry<String, String>> resultSet  = resultMap.entrySet();		
		Collections.sort(new ArrayList<String>(), new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
			
		});
		
		resultMap.forEach((k,v) -> System.out.println(v + "			" + k));
		
	}

	private static Entry findEntry(String line) {
		
		String key1 = null;
		String key2 = null;
		
		Pattern pattern = Pattern.compile("(?<=for: ).*(?=   referred)");
        Matcher matcher = pattern.matcher(line);
        
        if (matcher.find()) {
        	String full = line.substring(matcher.start(), matcher.end());
        	int index = full.indexOf(":");
            key1 = full.substring(index+1);
        }
        
		pattern = Pattern.compile("(?<=by: ).*(?= the)");
		
        matcher = pattern.matcher(line);
        if (matcher.find()) {
            key2 = line.substring(matcher.start(), matcher.end());

        }
        
        if(key1 != null && key2 != null)
        	return new Entry(key2, key1);
        
        else
        	return null;
	}
}

class Entry {
	private String fileInWhich;
	private String reference;

	public Entry(String fileInWhich, String reference) {
		super();
		this.fileInWhich = fileInWhich;
		this.reference = reference;
	}

	public String getFileInWhich() {
		return fileInWhich;
	}

	public void setFileWhereCheck(String fileInWhich) {
		this.fileInWhich = fileInWhich;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	@Override
	public String toString() {
		return "Entry [fileInWhich=" + fileInWhich + ", reference=" + reference + "]";
	}

}