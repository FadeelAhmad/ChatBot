# Simple Java ChatBot

A simple, interactive command-line chatbot built in Java. It can answer basic questions and responds to specific keywords.

## Features
- Responds to greetings ("hello", "hi", "hey")
- Answers questions about its state ("how are you")
- Answers questions about its name ("name")
- Handles unrecognized inputs gracefully
- Can be exited safely using "exit" or "quit"

## How to Run

1. Open your terminal or command prompt.
2. Clone this repository (if you haven't already):
   ```bash
   git clone https://github.com/FadeelAhmad/ChatBot.git
   cd ChatBot
   ```
3. Compile the Java file:
   ```bash
   javac ChatBot.java
   ```
4. Run the program:
   ```bash
   java ChatBot
   ```

## Example Usage
```
Hello! I'm a simple chat bot. Type 'exit' to quit.
You: hello
Bot: Hello there! How can I help you today?
You: how are you?
Bot: I'm just a computer program, so I don't have feelings, but I'm running smoothly! How about you?
You: exit
Bot: Goodbye! Have a great day.
```