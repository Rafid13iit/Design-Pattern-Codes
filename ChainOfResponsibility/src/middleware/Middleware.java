package middleware;

public abstract class Middleware {
    private Middleware next;

    // Builds chains of middleware objects.
    public static Middleware link(Middleware first, Middleware... chain) {
        Middleware head = first;
        for (Middleware nextInChain : chain) {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    /**
     * Subclasses will implement this method with concrete checks.
     */
    public abstract boolean check(String email, String password);

    /**
     * Runs check on the next object in chain or ends traversing if we're in
     * last object in chain.
     */
    protected boolean checkNext(String email, String password) {
        if (next == null) {
            return true;
        }
        return next.check(email, password);
    }
}

/*
 * Middleware: This abstract class defines the common interface for all middleware objects and 
 * includes the method for linking multiple middleware objects into a chain.
 *
 * Middleware: এই abstract ক্লাসটি সকল middleware অবজেক্টের জন্য সাধারণ ইন্টারফেস নির্ধারণ করে 
 * এবং একাধিক middleware অবজেক্টকে একটি চেইনে সংযুক্ত করার জন্য মেথড অন্তর্ভুক্ত করে।
 */
