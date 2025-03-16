package zad26;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListRemake {
	static Scanner inp = new Scanner(System.in);

	public static void main(String[] args) {
		List<String> words = new ArrayList<String>();
		String[] wordsArray = inp.nextLine().split(" ");

		while (!wordsArray[0].equals("END")) {
			switch (wordsArray[0]) {
			case "Add":
				for (int i = 1; i < wordsArray.length; i++) {
					words.add(wordsArray[i]);
				}
				break;
			case "Remove":
				int position = Integer.parseInt(wordsArray[1]);
				words.remove(position);
				break;
			case "Search":
				if (words.contains(wordsArray[1]))
					System.out.println(wordsArray[1]);
				else
					System.out.println("Not Contained");
				break;
			case "Update":
				for (int i = 0; i < words.size(); i++) {
					char[] charArray = words.get(i).toCharArray();
					if (Character.isAlphabetic(charArray[0])) {
						charArray[0] = Character.toUpperCase(charArray[0]);
					}
					String word = new String(charArray);
					words.set(i, word);
				}
				break;
			case "Length":
				String returnString = "";
				for (int i = 0; i < words.size(); i++) {
					if (words.get(i).length() == Integer.parseInt(wordsArray[1])) {
						returnString += words.get(i) + " ";
					}
				}
				if (returnString.isEmpty()) {
					System.out.println("Not Contained");
					break;
				}
				returnString = returnString.trim();
				returnString = returnString.replace(' ', '-');
				System.out.println(returnString);
				break;
			case "Insert":
				try {
					words.add(Integer.parseInt(wordsArray[1]), wordsArray[2]);
				} catch (Exception e) {
					System.out.println("There are not enough items in the list.");
				}
				break;
			case "Print":
				StringBuilder sb = new StringBuilder();
				for(String s:words) {
					sb.append(s+"; ");
				}
				System.out.println(sb.toString());
				break;
			}
			wordsArray = inp.nextLine().split(" ");
		}

	}

}
