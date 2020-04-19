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
		String regex = "[a-zA-Z].+[a-zA-Z]";
		//int regexAge =
		//int regexExp =
		Pattern patternStr = Pattern.compile(regex);

		
			
		// enter elements in array
		
			
		

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
//				for (int i = 0; i <= arrayStorage.size() - 1; i++) { 
//					arrStr = arrayStorage.get(i).toString();
					System.out.println(arrStr);
				}
				break;
			}

			case "2":
			case "view": { 
				bufRead.reset();
				System.out.println("Enter name");
				String resumeStr = sc.nextLine();
				int s = arrayStorage.size();
				int q = 0;
				String currentResume;
				while ((currentResume = bufRead.readLine()) != null) {
					Matcher matcher = patternStr.matcher(currentResume);
					while (matcher.find()) {					
						String fullResume = matcher.group();					
						if (resumeStr.equals(fullResume)) {						
							System.out.println(currentResume);
							q++;
						};
					
					}
				}
				

//				while ((currentResume = bufRead.readLine()) != null) {					
//				String[] lastIndex = currentResume.split("\\s");
//
//					if (resumeStr.equals(currentResume)) {
//						System.out.println(currentResume);
//						q++;
//					};
//				}
				if (q == 0) {
					System.out.println("Name not found");
				}
				break;
			}

			case "3":
			case "Add": { 
				bufRead.reset();
				System.out.println("Enter Name ");
				String nameStr = sc.nextLine();
				System.out.println("Enter age ");
				int age = sc.nextInt();
				System.out.println("Enter experience ");
				int exp = sc.nextInt();
				Resume resume = new Resume(nameStr, age, exp);
				int i = arrayStorage.size();
				arrayStorage.add(i, resume);
				i++;
				bufWrite.write(resume.toString() + ";" + "\n");
				bufWrite.flush();
				break;
			}
			case "4":
			case "Delete": { 
				bufRead.reset();
				System.out.println("Enter Name for delete ");
				String delStr = sc.nextLine();
				int i;
				for (i = 0; i <= arrayStorage.size() - 1; i++) {
					String s = arrayStorage.get(i).getName();
					if (delStr.equals(s)) {
						arrayStorage.remove(i);
						System.out.println("deleted ");
					}
				}
				break;
			}
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
