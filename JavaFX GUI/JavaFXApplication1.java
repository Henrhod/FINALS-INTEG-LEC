/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Optional;
import javafx.scene.control.TextInputDialog;

/**
 *
 * @author Henzeel
 */
public class JavaFXApplication1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //CREATE BUTTONS
        Button btnQ = new Button();
        btnQ.setText("Q");
        btnQ.setLayoutX(50+50);
        btnQ.setLayoutY(300);
        btnQ.setFont(Font.font ("Century Gothic", 20));
        btnQ.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //Code here
            }
        });
        
        Button btnW = new Button();
        btnW.setText("W");
        btnW.setLayoutX(50+105);
        btnW.setLayoutY(300);
        btnW.setFont(Font.font ("Century Gothic", 20));
        btnW.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //Code here
            }
        });
        
        Button btnE = new Button();
        btnE.setText("E");
        btnE.setLayoutX(50+160);
        btnE.setLayoutY(300);
        btnE.setFont(Font.font ("Century Gothic", 20));
        btnE.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //Code here
            }
        });
        
        Button btnR = new Button();
        btnR.setText("R");
        btnR.setLayoutX(50+215);
        btnR.setLayoutY(300);
        btnR.setFont(Font.font ("Century Gothic", 20));
        btnR.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //Code here
            }
        });
        
        Button btnT = new Button();
        btnT.setText("T");
        btnT.setLayoutX(50+270);
        btnT.setLayoutY(300);
        btnT.setFont(Font.font ("Century Gothic", 20));
        btnT.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //Code here
            }
        });
        
        Button btnY = new Button();
        btnY.setText("Y");
        btnY.setLayoutX(50+325);
        btnY.setLayoutY(300);
        btnY.setFont(Font.font ("Century Gothic", 20));
        btnY.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //Code here
            }
        });
        
        Button btnU = new Button();
        btnU.setText("U");
        btnU.setLayoutX(50+380);
        btnU.setLayoutY(300);
        btnU.setFont(Font.font ("Century Gothic", 20));
        btnU.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //Code here
            }
        });
        
        Button btnI = new Button();
        btnI.setText("I");
        btnI.setLayoutX(50+435);
        btnI.setLayoutY(300);
        btnI.setFont(Font.font ("Century Gothic", 20));
        btnI.getStyleClass().add("button");
        btnI.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //Code here
            }
        });
        
        Button btnO = new Button();
        btnO.setText("O");
        btnO.setLayoutX(50+490);
        btnO.setLayoutY(300);
        btnO.setFont(Font.font ("Century Gothic", 20));
        btnO.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //Code here
            }
        });
        
        Button btnP = new Button();
        btnP.setText("P");
        btnP.setLayoutX(50+545);
        btnP.setLayoutY(300);
        btnP.setFont(Font.font ("Century Gothic", 20));
        btnP.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //Code here
            }
        });
        
        Button btnA = new Button();
        btnA.setText("A");
        btnA.setLayoutX(50+75);
        btnA.setLayoutY(355);
        btnA.setFont(Font.font ("Century Gothic", 20));
        btnA.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //Code here
            }
        });
        
        Button btnS = new Button();
        btnS.setText("S");
        btnS.setLayoutX(50+130);
        btnS.setLayoutY(355);
        btnS.setFont(Font.font ("Century Gothic", 20));
        btnS.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //Code here
            }
        });
        
        Button btnD = new Button();
        btnD.setText("D");
        btnD.setLayoutX(50+185);
        btnD.setLayoutY(355);
        btnD.setFont(Font.font ("Century Gothic", 20));
        btnD.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //Code here
            }
        });
        
        Button btnF = new Button();
        btnF.setText("F");
        btnF.setLayoutX(50+240);
        btnF.setLayoutY(355);
        btnF.setFont(Font.font ("Century Gothic", 20));
        btnF.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //Code here
            }
        });
        
        Button btnG = new Button();
        btnG.setText("G");
        btnG.setLayoutX(50+295);
        btnG.setLayoutY(355);
        btnG.setFont(Font.font ("Century Gothic", 20));
        btnG.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //Code here
            }
        });
        
        Button btnH = new Button();
        btnH.setText("H");
        btnH.setLayoutX(50+350);
        btnH.setLayoutY(355);
        btnH.setFont(Font.font ("Century Gothic", 20));
        btnH.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //Code here
            }
        });
        
        Button btnJ = new Button();
        btnJ.setText("J");
        btnJ.setLayoutX(50+405);
        btnJ.setLayoutY(355);
        btnJ.setFont(Font.font ("Century Gothic", 20));
        btnJ.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //Code here
            }
        });
        
        Button btnK = new Button();
        btnK.setText("K");
        btnK.setLayoutX(50+460);
        btnK.setLayoutY(355);
        btnK.setFont(Font.font ("Century Gothic", 20));
        btnK.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //Code here
            }
        });
        
        Button btnL = new Button();
        btnL.setText("L");
        btnL.setLayoutX(50+515);
        btnL.setLayoutY(355);
        btnL.setFont(Font.font ("Century Gothic", 20));
        btnL.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //Code here
            }
        });
        
        Button btnZ = new Button();
        btnZ.setText("Z");
        btnZ.setLayoutX(50+125);
        btnZ.setLayoutY(410);
        btnZ.setFont(Font.font ("Century Gothic", 20));
        btnZ.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //Code here
            }
        });
        
        Button btnX = new Button();
        btnX.setText("X");
        btnX.setLayoutX(50+180);
        btnX.setLayoutY(410);
        btnX.setFont(Font.font ("Century Gothic", 20));
        btnX.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //Code here
            }
        });
        
        Button btnC = new Button();
        btnC.setText("C");
        btnC.setLayoutX(50+235);
        btnC.setLayoutY(410);
        btnC.setFont(Font.font ("Century Gothic", 20));
        btnC.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //Code here
            }
        });
        
        Button btnV = new Button();
        btnV.setText("V");
        btnV.setLayoutX(50+290);
        btnV.setLayoutY(410);
        btnV.setFont(Font.font ("Century Gothic", 20));
        btnV.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //Code here
            }
        });
        
        Button btnB = new Button();
        btnB.setText("B");
        btnB.setLayoutX(50+345);
        btnB.setLayoutY(410);
        btnB.setFont(Font.font ("Century Gothic", 20));
        btnB.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //Code here
            }
        });
        Button btnN = new Button();
        btnN.setText("N");
        btnN.setLayoutX(50+400);
        btnN.setLayoutY(410);
        btnN.setFont(Font.font (20));
        btnN.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //Code here
            }
        });
        
        Button btnM = new Button();
        btnM.setText("M");
        btnM.setLayoutX(50+455);
        btnM.setLayoutY(410);
        btnM.setFont(Font.font ("Century Gothic", 20));
        btnM.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //Code here
            }
        });
        
        //MENU
        Button btnPlay = new Button();
        btnPlay.setText("PLAY");
        btnPlay.setLayoutX(150);
        btnPlay.setLayoutY(100);
        btnPlay.setFont(Font.font (20));
        btnPlay.getStyleClass().add("button-menu");
        btnPlay.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                TextInputDialog dialog = new TextInputDialog("");
                dialog.setTitle("Hang-Me-Not");
                dialog.setHeaderText("Hello, new player!");
                dialog.setContentText("Please enter your name: ");
                Optional<String> result = dialog.showAndWait();
                if (result.isPresent()){
                    System.out.println("Your name: " + result.get());
                }
            }
        });
        
        Button btnHelp = new Button();
        btnHelp.setText("HELP");
        btnHelp.setLayoutX(150);
        btnHelp.setLayoutY(150);
        btnHelp.setFont(Font.font (20));
        btnHelp.getStyleClass().add("button-menu");
        btnHelp.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Hang-Me-Not");
                alert.setHeaderText(null);
                alert.setContentText("You will be given a word to guess. Start guessing letters until you guess the whole word. If you guessed  the word, YOU WIN! If you commit a total of five (5) mistakes before guessing the word, you will LOSE the game.");
                alert.show();
            }
        });
        
        Button btnQuit = new Button();
        btnQuit.setText("QUIT");
        btnQuit.setLayoutX(150);
        btnQuit.setLayoutY(200);
        btnQuit.setFont(Font.font (20));
        btnQuit.getStyleClass().add("button-menu");
        btnQuit.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }
        });
        
        Pane menu = new Pane();  
        menu.getChildren().add(btnPlay);
        menu.getChildren().add(btnHelp);
        menu.getChildren().add(btnQuit);

        
        Pane root = new Pane();
//        root.getChildren().add(btn);
        root.getChildren().add(btnQ);
        root.getChildren().add(btnW);
        root.getChildren().add(btnE);
        root.getChildren().add(btnR);
        root.getChildren().add(btnT);
        root.getChildren().add(btnY);
        root.getChildren().add(btnU);
        root.getChildren().add(btnI);
        root.getChildren().add(btnO);
        root.getChildren().add(btnP);
        root.getChildren().add(btnA);
        root.getChildren().add(btnS);
        root.getChildren().add(btnD);
        root.getChildren().add(btnF);
        root.getChildren().add(btnG);
        root.getChildren().add(btnH);
        root.getChildren().add(btnJ);
        root.getChildren().add(btnK);
        root.getChildren().add(btnL);
        root.getChildren().add(btnZ);
        root.getChildren().add(btnX);
        root.getChildren().add(btnC);
        root.getChildren().add(btnV);
        root.getChildren().add(btnB);
        root.getChildren().add(btnN);
        root.getChildren().add(btnM);
        
        Scene scene1 = new Scene(menu, 400, 300);
        menu.getStylesheets().add(JavaFXApplication1.class.getResource("style.css").toExternalForm());
     
        Scene scene2 = new Scene(root, 750, 500);
        scene2.getStylesheets().add(JavaFXApplication1.class.getResource("style.css").toExternalForm());
        
        primaryStage.setTitle("Hang-Me-Not");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        launch(args);
//    }
    
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
            launch(args);
		storeWords();
		System.out.println("\nWelcome " + name + " to the Hangman game.\n");
		play();
//		System.out.println("\nThank you " + name + " to the Hangman game.");
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Hang-Me-Not");
                alert.setHeaderText(null);
                alert.setContentText("Thankyou" +name +" for playing Hangman.");
                alert.show();
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