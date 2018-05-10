package classes;
import classes.*;
import Hangman.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;
import java.util.*;

public class HangmanClient {
	static List<String> usedLetter = new ArrayList<String>();
	static List<String> wordArray = new ArrayList<String>();
	static List<String> showWord = new ArrayList<String>();
	static Scanner scn = new Scanner(System.in);
	public static void main(String [] args) {
		String name_service="Hangman_game";
		try{
			ORB orb = ORB.init(args, null); 
			org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
			NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef); 
			NameComponent nc = new NameComponent(name_service, "");
			NameComponent path[] = {nc};
			Hangman_Interface hm= Hangman_InterfaceHelper.narrow(ncRef.resolve(path));
			
			System.out.println("Welcome to the Hangman Game.");
			System.out.print("\nEnter your name: ");
			String name = scn.nextLine().toLowerCase();
			String str = "";
			String letter = "";
			String word = "";
			boolean bl = hm.login(name);
			boolean bool = true;
			do {
				
				while(bl == false) {
					System.out.print("Name already exists. \nEnter another name: ");
					name = scn.nextLine().toLowerCase();
					bl = hm.login(name);
				}
				do {
					clearAll();
					int wrongGuess = 5;
					word = hm.play(name);
					if(word.equals("NoWords")) {
						System.out.println("\nNo more words to be guessed.");
						hm.logout(name);
					}
					hm.usedWord(name, word);
					for(int x = 0; x < word.length(); x++) {
						wordArray.add(Character.toString(word.charAt(x)));
						showWord.add("_");
					}
			
					while(wrongGuess > 0) {
						System.out.println("\nRemaining guess: " + wrongGuess);
						System.out.print("Word: ");
						for(int x = 0; x < showWord.size(); x++) {
							System.out.print(showWord.get(x) + " ");
						}
						letter = inputLetter();
			
						if(displayWord(letter)) {
							System.out.println("You have correctly guess a letter.");
						}
						else {
							System.out.println("You have incorrectly guess a letter.");
							wrongGuess--;
							usedLetter.add(letter);
						}
						System.out.println();
						if(checkIfWin()) {
							System.out.print("The word is ");
							for(int x = 0; x < wordArray.size(); x++) {
								System.out.print(wordArray.get(x));
							}
							System.out.print("\n\nCongratulations! You have guessed the word correctly.\n");
							bool = tryAgain();
							break;
						} else if(wrongGuess == 0){
							System.out.print("The word is ");
							for(int x = 0; x < wordArray.size(); x++) {
								System.out.print(wordArray.get(x));
							}
							System.out.println("\n\nYou have used up all your tries.");
							bool = tryAgain();
						}
					}
				} while (bool);
				str = hm.logout(name);
			} while (!str.equals("Logged out."));
			
			System.out.println("Thank you for playing the Hangman Game");
			Thread.sleep(20);
		}catch(Exception er) {
			er.printStackTrace();
		}
	}
	
	public static void clearAll() {
		usedLetter.clear();
		wordArray.clear();
		showWord.clear();
	}

	public static boolean checkIfWin() {
		if(!showWord.contains("_")) {
			return true;
		}
		else return false;
	}

	public static boolean displayWord(String letter) {
		if(wordArray.contains(letter)) {
			for(int z = 0; z < wordArray.size(); z++) {
				if(wordArray.get(z).equals(letter)) {
					showWord.set(z, letter);
				}
			}
			return true;
		}
		return false;
	}

	public static String inputLetter() {
		System.out.print("\nEnter a letter: ");
		String let = scn.nextLine().toLowerCase().trim();
		if(usedLetter.contains(let)) {
			System.out.println("You have already used the letter " + let+".");
			let = inputLetter();
		}else if (let.equals("")) {
			System.out.println("You didn't enter a leter.");
			let = inputLetter();
		}
		else if(let.length() != 1) {
			System.out.println("You can only enter a single letter.");
			let = inputLetter();
		}else if(let.matches("[^a-z]")) {
			System.out.println("You can only enter a letter.");
			let = inputLetter();
		}
		usedLetter.add(let);
		return let;
	}
	
	public static boolean tryAgain() {
		String ans = "";
		do {
			System.out.print("Want to try again? [y/n]: ");
			ans = scn.nextLine().toLowerCase().trim();
			System.out.println();
		} while(!ans.equals("y") && !ans.equals("n"));
		boolean bool = true;
		switch(ans) {
			case "y": bool = true;
			case "n": bool = false;
		}
		return bool;
	}
}
