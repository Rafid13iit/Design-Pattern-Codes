package middleware;

import server.Server;

/**
 * ConcreteHandler. Checks whether a user with the given credentials exists.
 */
public class UserExistsMiddleware extends Middleware {
    private Server server;

    public UserExistsMiddleware(Server server) {
        this.server = server;
    }

    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println("This email is not registered!");
            return false;
        }
        if (!server.isValidPassword(email, password)) {
            System.out.println("Wrong password!");
            return false;
        }
        return checkNext(email, password);
    }
}

/*
 * UserExistsMiddleware: This concrete handler checks if the user with the given email exists and 
 * if the password is correct.
 *
 * UserExistsMiddleware: এই concrete handler টি চেক করে যে প্রদত্ত ইমেইল সহ ব্যবহারকারী আছে কিনা 
 * এবং পাসওয়ার্ডটি সঠিক কিনা।
 */
