package server;

import middleware.Middleware;

import java.util.HashMap;
import java.util.Map;

/**
 * Server class.
 */
public class Server {
    private Map<String, String> users = new HashMap<>();
    private Middleware middleware;

    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    public boolean logIn(String email, String password) {
        if (middleware.check(email, password)) {
            System.out.println("Authorization have been successful!");
            return true;
        }
        return false;
    }

    public void register(String email, String password) {
        users.put(email, password);
    }

    public boolean hasEmail(String email) {
        return users.containsKey(email);
    }

    public boolean isValidPassword(String email, String password) {
        return users.get(email).equals(password);
    }
}

/*
 * Server: This class represents the server which handles user registrations and login attempts. It 
 * uses middleware to process authorization requests.
 *
 * Server: এই ক্লাসটি সার্ভার প্রতিনিধিত্ব করে যা ব্যবহারকারী রেজিস্ট্রেশন এবং লগইন প্রচেষ্টা 
 * পরিচালনা করে। এটি মাইডলওয়্যার ব্যবহার করে অনুমোদন অনুরোধ প্রক্রিয়া করে।
 */
