import string
import random
import sys
from omniORB import CORBA
import CosNaming, Hangman

usedLetter = []
wordArray = []
showWord= []

def clearAll():
    usedLetter.clear()
    wordArray.clear()
    showWord.clear()
             
def checkIfWin():
    if "_" not in showWord:
        return True
    return False

def displayWord(letter):
    if letter in wordArray:
        for x in range (0,len(wordArray)):
            if wordArray[x]== letter:
                showWord.pop(x)
                showWord.insert(x,letter)
        return True
    return False

def inputLetter():
    let = input("\nEnter a letter: ").lower().strip()
    if let in usedLetter:
        let = input("You have already used the letter: " + let).lower().strip()
    elif let == "":
        let = input("You didn't enter a letter: ").lower().strip()
    elif len(let) != 1:
        let = input("You can only enter a single letter: ").lower().strip()
    elif not str.isalpha(let):
        let = input("Please enter letters only: ").lower().strip()
    usedLetter.append(let)
    return let

def tryAgain():
    ans = input("Try again? (y/n): ").lower()
    while not ans=="y" and not ans == "n":
        ans = input("Y or N only. Try again? (y/n): ").lower()
    if ans == "y":
        return True
    else:
        return False

def generateLists(word):
    for x in range (0,len(word)):
        wordArray.append(word[x])
        showWord.append("_")

def main():
    name_service = "Hangman_game"
    orb = CORBA.ORB_init(sys.argv, CORBA.ORB_ID)
    objRef = orb.resolve_initial_references("NameService")
    ncRef = objRef._narrow(CosNaming.NamingContext)
    nc = [CosNaming.NameComponent(name_service, "")]
    obj = ncRef.resolve(nc)
    hm = obj._narrow(Hangman.Hangman_Interface)

    print("Welcome to the Hangman Game. ")
    name = input("\nEnter your name: ")
    strr =""
    letter =""
    b1 = hm.login(name)
    booll = True
    while strr != "Logged out.":
        while b1==False:
            name = input("Name already exists. \nEnter another name: ")
            if hm.login(name) == True:
                b1=True
        while booll == True :
            clearAll()
            wrongGuess = 5
            word = hm.play(name)
            print(word)
            if word == "NoWords":
                print("\nNo more words to be guessed. ")
                hm.logout(name)
            hm.usedWord(name, word)
            generateLists(word)
            while wrongGuess > 0 :
                print("\nRemaining guess: ", wrongGuess)
                print("Word: ", end="")
                for z in range (0, len(showWord)):
                    print(showWord[z], " ",end="")
                        
                letter = inputLetter()
                    
                if displayWord(letter) :
                    print("You have correctly guessed a letter. ")
                       
                else :
                    print("You have incorrectly guessed a letter. ")
                    wrongGuess = wrongGuess-1
                    usedLetter.append(letter)
                print("")
                if checkIfWin():
                    print("The word is ",end="")
                    for x in range (0,len(wordArray)):
                        print(wordArray[x],end="")
                            
                    print("\n\nCongratulations! You have guessed the word correctly.\n")
                    if tryAgain() == True:
                        booll = True
                        break
                    else:
                        booll = False
                        break
                elif wrongGuess == 0:
                    print("The word is ",end="")
                    for x in range (0,len(wordArray)):
                        print(wordArray[x],end="")                
                    print("\n\nYou have used up all your tries.")
                    if tryAgain() == False:
                        booll = False
        str=hm.logout(name)
        break
    print("Thank you for playing the Hangman Game")

main()
