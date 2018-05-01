import java.io.*;
import java.util.*;

public class Test {
	static Scanner scn = new Scanner(System.in);
	static List<String> list = new ArrayList<String>();
	static List<String> usedWord = new ArrayList<String>();
	static List<String> usedLetter = new ArrayList<String>();
	
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
		usedWord.add(new Word(randomWord).getWord());
		return randomWord;
	}
	
	public static void play(){
		int tries = 0;
		String word = getRandomWord();
		for(int x = 0; x < word.length(); x++) {
			System.out.print("_ ");
		}
		
		System.out.print("Enter a letter: ");
		
	}
	
	public static void main(String [] args) throws FileNotFoundException, IOException {
	//	System.out.print("Enter your name: ");
	//	String name = scn.nextLine();
		storeWords();
	//	System.out.println(getRandomWord());
		play();
	}
}

class Word {
	private String word;
	public Word(String word) {
		this.word = word;
	}
	
	public String getWord(){
		return word;
	}
}