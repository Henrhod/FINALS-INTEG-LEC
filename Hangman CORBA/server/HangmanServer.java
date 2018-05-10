package classes;
import Hangman.*;
import classes.Player;

import org.omg.CosNaming.*; 
import org.omg.CosNaming.NamingContextPackage.*; 
import org.omg.CORBA.*; 
import org.omg.PortableServer.*; 
import org.omg.PortableServer.POA;
import java.util.*;
import java.io.*;

public class HangmanServer {
	public static void main(String [] args) {
		String name_service = "Hangman_game";
		try {
			ORB orb = ORB.init(args, null);
			POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
			rootpoa.the_POAManager().activate();
			
			HangmanImplementation hangImpl = new HangmanImplementation();
			org.omg.CORBA.Object service_ref =  rootpoa.servant_to_reference(hangImpl);
			Hangman_Interface service_href= Hangman_InterfaceHelper.narrow(service_ref);
			org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
		    
			NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
			NameComponent nc = new NameComponent(name_service, "");
			NameComponent path[] = {nc};
			ncRef.rebind(path, service_href);
			System.out.println("Server is running.");
			orb.run();
		} catch (Exception err) {
			err.printStackTrace();
		}
	}
}

class HangmanImplementation extends Hangman_InterfacePOA {
	Map<String, Player> player = new Hashtable<String, Player>();
	List<String> wordList = new ArrayList<String>();
	
	public HangmanImplementation() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("Words.txt"));
		String line = "";
		while(line != null) {
			line = br.readLine();
			if(line == null) {
				break;
			}
			wordList.add(line);
		}
	}
	
	public boolean login(String name) {
		if(player.containsKey(name)) {
			return false;
		} else {
			player.put(name, new Player(name));
			System.out.println("Player logged in: " + name);
			return true;
		}
	}
	
	public void usedWord(String name, String word) {
		player.get(name).usedWord(word);
	}
	
	public String play(String name) {
		Random ran = new Random();
		String wordToGuess = wordList.get(ran.nextInt(wordList.size()));
		while(player.get(name).getWordMap().containsKey(wordToGuess)) {
			wordToGuess = wordList.get(ran.nextInt(wordList.size()));
		}
		player.get(name).usedWord(wordToGuess);
		return wordToGuess;
	}
	
	public String logout(String name) {
		if(!player.containsKey(name)) {
			return name + " is not currently logged in.";
		}
		player.remove(name);
		System.out.println("Player logged out: " + name);
		return "Logged out.";
	}
}