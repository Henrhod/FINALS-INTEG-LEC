@echo off
cd..
idlj -fclient Hangman.idl
move Hangman client
cd client
cd Hangman
javac *.java