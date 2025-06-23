# Tic Tac Toe Game (Java - Human vs AI)

This is a simple console-based **Tic Tac Toe** game implemented in **Java**, where a human player competes against an AI player. It demonstrates basic object-oriented programming concepts such as abstraction, inheritance, and polymorphism.

---

## 🎮 Features

- Console-based 3x3 Tic Tac Toe
- **Human vs AI** mode
- Input validation for player moves
- Win detection (row, column, diagonal)
- Draw detection
- Clear board display after every move
- Object-Oriented Design using Java classes

---

## 🧩 Game Classes

- `tictactoe`: Handles board setup, move placement, and win/draw checks.
- `Player`: Abstract class for common player behavior.
- `HumanPlayer`: Extends `Player`, allows manual input.
- `AIPlayer`: Extends `Player`, places random valid moves.
- `game`: The main driver class with game loop and player switching.

---

## 📷 Gameplay Preview

```bash
----------------
|    |    |    |  
----------------
|    |    |    |  
----------------
|    |    |    |  
----------------
Player 1 turn.
Enter the row and column:
1 1
----------------
|    |    |    |  
----------------
|    |  X |    |  
----------------
|    |    |    |  
----------------
...

How to Run
1. Clone the repo or download the .java files.

2. Compile all files:

```bash
    javac *.java

3.Run the game:

```bash
    java game

Concepts Used :
Inheritance and Abstract Classes

Static Methods and Variables

User Input Handling (Scanner)

Random Number Generation (AI)

Control Loops and Conditions

