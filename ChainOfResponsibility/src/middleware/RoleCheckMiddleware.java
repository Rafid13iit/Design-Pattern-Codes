package middleware;

/**
 * ConcreteHandler. Checks a user's role.
 */
public class RoleCheckMiddleware extends Middleware {
    public boolean check(String email, String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("Hello, admin!");
            return true;
        }
        System.out.println("Hello, user!");
        return checkNext(email, password);
    }
}

/*
 * RoleCheckMiddleware: This concrete handler checks the role of the user. If the user is an admin, 
 * it returns true immediately. Otherwise, it continues to the next handler.
 *
 * RoleCheckMiddleware: এই concrete handler টি ব্যবহারকারীর ভূমিকা চেক করে। যদি ব্যবহারকারী 
 * অ্যাডমিন হয়, এটি অবিলম্বে true রিটার্ন করে। অন্যথায়, এটি পরবর্তী হ্যান্ডলারটিতে চালিয়ে যায়।
 */
