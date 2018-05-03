import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Hangman {
	static Scanner scn = new Scanner(System.in);
	static List<String> list = new ArrayList<String>();
	static List<String> usedWord = new ArrayList<String>();
	static List<String> usedLetter = new ArrayList<String>();
	static List<String> wordArray = new ArrayList<String>();
	static List<String> showWord = new ArrayList<String>();
	static String word, name;

	public static void storeWords() throws FileNotFoundException, IOException{
		BufferedReader br = new BufferedReader(new FileReader("Words.txt"));
		String line = "";
		while(line != null) {
			line = br.readLine();
			if(line == null) {
				break;
			}
			list.add(line);
		}
	}

	public static String getRandomWord() {
		Random random = new Random();
		int ctr = random.nextInt(list.size());
		String randomWord = list.get(ctr);
		if(usedWord.contains(randomWord)) {
			getRandomWord();
		}
		usedWord.add(new Word(randomWord).getWord());
		return randomWord;
	}

	public static void play(){
		clearAll();
		int wrongGuess = 5;
		word = getRandomWord();
		String letter = "";
		for(int x = 0; x < word.length(); x++) {
			wordArray.add(Character.toString(word.charAt(x)));
			showWord.add("_");
		}

		while(wrongGuess > 0) {
			System.out.println("Remaining guess: " + wrongGuess);
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
				usedWord.add(letter);
			}
			System.out.println();
			if(checkIfWin()) {
				System.out.print("The word is ");
				for(int x = 0; x < wordArray.size(); x++) {
					System.out.print(wordArray.get(x));
				}
				System.out.print("\n\nCongratulations! You have guessed the word correctly.\n");
				tryAgain();
				break;
			} else if(wrongGuess == 0){
				System.out.print("The word is ");
				for(int x = 0; x < wordArray.size(); x++) {
					System.out.print(wordArray.get(x));
				}
				System.out.println("\n\nYou have used up all your tries.");
				tryAgain();
			}
		}
	}

	public static void tryAgain() {
		String ans = "";
		do {
			System.out.print("Want to try again? [y/n]: ");
			ans = scn.nextLine().toLowerCase().trim();
			System.out.println();
		} while(!ans.equals("y") && !ans.equals("n"));
		switch(ans) {
			case "y": play();break;
			case "n": break;
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

	public static void main(String [] args) throws FileNotFoundException, IOException {
		System.out.print("Enter your name: ");
		name = scn.nextLine();
		storeWords();
		System.out.println("\nWelcome " + name + " to the Hangman game.\n");
		play();
		System.out.println("\nThank you " + name + " to the Hangman game.");
	}
}