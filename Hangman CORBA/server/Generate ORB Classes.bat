@echo off
cd..
idlj -fall Hangman.idl
move Hangman server
cd server
cd Hangman
javac *.java