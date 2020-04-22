package arrayStorage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class arrayStorage {

	public static void main(String[] args) throws Exception {
		ArrayList<Resume> arrayStorage = new ArrayList<Resume>();
		Scanner sc = new Scanner(System.in);
		File file = new File("d:/resume1.txt");
		String command = null;
		FileWriter fileWrite = new FileWriter(file, true);
		BufferedWriter bufWrite = new BufferedWriter(fileWrite);
		FileReader fileRead = new FileReader(file);
		Scanner scanFile = new Scanner(fileRead);
		BufferedReader bufRead = new BufferedReader(fileRead, 256);
		bufRead.markSupported();
		bufRead.mark(256);
		Character charStr;
		String strFile;
		String regexW = "[a-zA-Z].+[a-zA-Z]";
		String regexN = "[0-9]";
		String name;
		int age=0;
		int exp=0;
		Pattern patternWord = Pattern.compile(regexW);
		Pattern patternNumber = Pattern.compile(regexN);
		
			
		// enter elements in array
		while ((strFile = bufRead.readLine()) != null) {
			
			Matcher matcherWord = patternWord.matcher(strFile);
			Matcher matcherNumber = patternNumber.matcher(strFile);
			while (matcherWord.find()) {					
				name = matcherWord.group();
				int s = matcherWord.end();
				for (int n=1; n<=2; n++) 
				{
					if(n==1) {
					age = Integer.parseInt(matcherNumber.group());
					n++;}
					else {
					exp = Integer.parseInt(matcherNumber.group());
					}
				}
				Resume resume = new Resume(name, age, exp);
				int i = arrayStorage.size();
				arrayStorage.add(i, resume);
				i++;
				System.out.println(resume.toString());
			}
			
		
		}
		

		System.out.println("Enter command for action with resume "
				+ "1. all (resume),2. view (current resume), 3. Add (resume), 4. Delete, 5.Quantity (resume). "
				+ "Please enter command without");
		command = sc.nextLine();
		while (!command.equals("exit")) {
			switch (command) {

			case "1":
			case "all": { 				
				bufRead.reset();
				String arrStr = null;

				while ((arrStr = bufRead.readLine()) != null) {
					System.out.println(arrStr);
				}
				break;
			}

//			case "2":
//			case "view": { 
//				bufRead.reset();
//				System.out.println("Enter name");
//				String resumeStr = sc.nextLine();
//				int q = 0;
//				String currentResume;
//				while ((currentResume = bufRead.readLine()) != null) {
//					matcher = patternStr.matcher(currentResume);
//					while (matcher.find()) {					
//						String fullResume = matcher.group();					
//						if (resumeStr.equals(fullResume)) {						
//							System.out.println(currentResume);
//							q++;
//						};					
//					}
//				}
//				if (q == 0) {
//					System.out.println("Name not found");
//				}
//				break;
//			}

//			case "3":
//			case "Add": { 
//				bufRead.reset();
//				System.out.println("Enter Name ");
//				String nameStr = sc.nextLine();
//				System.out.println("Enter age ");
//				int age = sc.nextInt();
//				System.out.println("Enter experience ");
//				int exp = sc.nextInt();
//				Resume resume = new Resume(nameStr, age, exp);
//				int i = arrayStorage.size();
//				arrayStorage.add(i, resume);
//				i++;
//				bufWrite.write(resume.toString() + ";" + "\n");
//				bufWrite.flush();
//				break;
//			}
//			case "4":
//			case "Delete": { 
//				bufRead.reset();
//				System.out.println("Enter Name for delete ");
//				String delResume = sc.nextLine();
//				String currentResume;
//				int q=0;
//				while ((currentResume = bufRead.readLine()) != null) {
//					Matcher matcher = patternStr.matcher(currentResume);
//					while (matcher.find()) {					
//						String fullResume = matcher.group();					
//						if (delResume.equals(fullResume)) {						
//							System.out.println(currentResume);
//							q++;
//						};					
//					}
//				}
//				if (q == 0) {
//					System.out.println("Name not found");
//				}
//				break;
//			}
			case "5":
			case "Quantity": { 
				bufRead.reset();
				int q = 0;
				while (bufRead.readLine()!=null) {
					q++;
				}
				System.out.println(q);
				break;
			}
			} // switch
			System.out.println("Input next command");
			command = sc.nextLine();
		}

		// while

	}
}
