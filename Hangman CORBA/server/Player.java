package classes;
import classes.Word;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.ArrayList;
import java.util.Hashtable;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Serializable;
import java.io.FileReader;

public class Player implements  Serializable {
	private Map<String, Word> wordUsed = new Hashtable<String, Word>();
	private String name;
	private int tries;
	
	public Player(String name) {
		this.name = name;
	}
		
	public String getName(){
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void usedWord(String word) {
		wordUsed.put(word, new Word(word));
	}
	public Map<String, Word> getWordMap() {
		return wordUsed;
	}
}