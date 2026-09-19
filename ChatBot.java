import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! I'm a simple chat bot. Type 'exit' to quit.");

        while (true) {
            System.out.print("You: ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("exit") || input.equals("quit")) {
                System.out.println("Bot: Goodbye! Have a great day.");
                break;
            } else if (input.contains("hello") || input.contains("hi") || input.contains("hey")) {
                System.out.println("Bot: Hello there! How can I help you today?");
            } else if (input.contains("how are you")) {
                System.out.println("Bot: I'm just a computer program, so I don't have feelings, but I'm running smoothly! How about you?");
            } else if (input.contains("name")) {
                System.out.println("Bot: I am a simple Java chatbot created by Antigravity.");
            } else if (input.contains("time")) {
                System.out.println("Bot: I don't have a built-in watch, but you can look at the clock on your device!");
            } else if (input.contains("weather")) {
                System.out.println("Bot: I'm not connected to the internet to check the weather right now, maybe look out a window?");
            } else {
                System.out.println("Bot: I'm not quite sure how to respond to that. Try asking me my name or saying hello!");
            }
        }
        scanner.close();
    }
}
