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
		String regex = "a-zA-z";
		Pattern patternStr = Pattern.compile(regex);
		Matcher matcher = patternStr.matcher(strFile);
			
		// заполняем массив из файла
		for (int i = 0; i <= arrayStorage.size() - 1; i++) {
			if ((strFile = bufRead.readLine()) != null) {
				
			}
		}

		System.out.println("Введите команду действия с резюме: "
				+ "1. все (резюме),2. просмотр (конкретного резюме),3. добавить,4. удалить,5. количество (резюме). "
				+ "Команда вводится без содержимого скобок");
		command = sc.nextLine();
		while (!command.equals("выход")) {
			switch (command) {

			case "1":
			case "все": { // вывод всех резюме				
				bufRead.reset();
				String arrStr = null;

				while ((arrStr = bufRead.readLine()) != null) {
//				for (int i = 0; i <= arrayStorage.size() - 1; i++) { // реализация для консоли
//					arrStr = arrayStorage.get(i).toString();
					System.out.println(arrStr);
				}
				break;
			}

			case "2":
			case "просмотр": { // просмотр резюме по фамилии
				bufRead.reset();
				System.out.println("Укажите ФИО");
				String resumeStr = sc.nextLine();
				int s = arrayStorage.size();
				int q = 0;
				String currentResume;

				while ((currentResume = bufRead.readLine()) != null) {
					String[] lastIndex = currentResume.split("\\s");

					if (resumeStr.equals(currentResume)) {
						System.out.println(currentResume);
						q++;
					}
					;
				}
				if (q == 0) {
					System.out.println("ФИО не найдено.");
				}
				break;
			}

			case "3":
			case "добавить": { // добавление резюме
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
			case "удалить": { // удалить резюме по ФИО
				bufRead.reset();
				System.out.println("Enter Name for delete ");
				String delStr = sc.nextLine();
				int i;
				for (i = 0; i <= arrayStorage.size() - 1; i++) {
					String s = arrayStorage.get(i).getName();
					if (delStr.equals(s)) {
						arrayStorage.remove(i);
						System.out.println("удалено ");
					}
				}
				break;
			}
			case "5":
			case "количество": { // сколько всего резюме в базе
				bufRead.reset();
				int q = 0;
				q = arrayStorage.size();
				System.out.println(q);
				break;
			}
			} // switch
			System.out.println("Введите следующую команду ");
			command = sc.nextLine();
		}

		// while

	}
}
