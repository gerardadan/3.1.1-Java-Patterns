# Readme for Exercise: Singleton Pattern – Undo System

## 📄 Description

This exercise focuses on implementing the **Singleton Design Pattern** in Java through the creation of a simplified "Undo" system, similar to how command histories work in terminal environments. You will build a Singleton class that maintains a list of recently executed commands and interact with it using a console-based interface.

---

## 🚀 Exercise

### Exercise 1: Singleton-Based Undo System

You are tasked with developing an `Undo` system for a console-based Java application. The goal is to replicate the behavior of commands like `history` and `undo` using a Singleton class.

#### 🧩 Functionality:
- The `Undo` class must:
  - Be implemented as a Singleton (only one instance across the application).
  - Store a history of commands entered by the user.
  - Provide methods to:
    - Add a new command.
    - Remove the last command (undo).
    - Display all stored commands (like `history`).

- The `Main` class must:
  - Offer a console menu with options to:
    - Add a command.
    - Undo the most recent command.
    - Display command history.
    - Exit the application.

#### 💡 Example Console Flow:
```text
Choose an option:
1. Add command
2. Undo last command
3. Show history
4. Exit

> 1
Enter command: mkdir new_folder

> 1
Enter command: cd new_folder

> 3
Command history:
1. mkdir new_folder
2. cd new_folder

> 2
Last command undone.

> 3
Command history:
1. mkdir new_folder
```

---

## 💻 Technologies Used
- Java
- Singleton Design Pattern
- Console I/O (`Scanner`)

## 📋 Requirements
- JDK 8 or higher
- A development environment such as IntelliJ IDEA, Eclipse, or VS Code with Java support
```
