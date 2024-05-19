package client;

import middleware.Middleware;
import middleware.RoleCheckMiddleware;
import middleware.ThrottlingMiddleware;
import middleware.UserExistsMiddleware;
import server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        Middleware middleware = Middleware.link(
            new ThrottlingMiddleware(2),
            new UserExistsMiddleware(server),
            new RoleCheckMiddleware()
        );

        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do {
            System.out.print("Enter email: ");
            String email = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }
}

/*
 * Demo: This class contains the main method where the application is initialized and run. It 
 * demonstrates how to build a chain of middleware objects and use them to process login requests.
 *
 * Demo: এই ক্লাসটিতে প্রধান মেথড অন্তর্ভুক্ত রয়েছে যেখানে অ্যাপ্লিকেশনটি প্রারম্ভিক এবং 
 * চালিত হয়। এটি কীভাবে মাইডলওয়্যার অবজেক্টগুলির একটি চেইন তৈরি করা যায় এবং লগইন অনুরোধ 
 * প্রক্রিয়া করতে ব্যবহার করা যায় তা প্রদর্শন করে।
 */
