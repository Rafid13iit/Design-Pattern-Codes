package middleware;

/**
 * ConcreteHandler. Checks whether there are too many failed login requests.
 */
public class ThrottlingMiddleware extends Middleware {
    private int requestPerMinute;
    private int request;
    private long currentTime;

    public ThrottlingMiddleware(int requestPerMinute) {
        this.requestPerMinute = requestPerMinute;
        this.currentTime = System.currentTimeMillis();
    }

    public boolean check(String email, String password) {
        if (System.currentTimeMillis() > currentTime + 60_000) {
            request = 0;
            currentTime = System.currentTimeMillis();
        }

        request++;
        
        if (request > requestPerMinute) {
            System.out.println("Request limit exceeded!");
            Thread.currentThread().stop();
        }
        return checkNext(email, password);
    }
}

/*
 * ThrottlingMiddleware: This concrete handler checks if the number of requests has exceeded the 
 * predefined limit per minute. If exceeded, it stops further processing.
 *
 * ThrottlingMiddleware: এই concrete handler টি চেক করে যে নির্ধারিত প্রতি মিনিটে অনুরোধের সংখ্যা 
 * ছাড়িয়ে গেছে কিনা। যদি ছাড়িয়ে যায়, তাহলে এটি আরও প্রসেসিং বন্ধ করে দেয়।
 */
