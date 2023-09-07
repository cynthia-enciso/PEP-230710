package producerconsumer;

import java.util.ArrayDeque;

public class CookieStore {
    
    private ArrayDeque<Cookie> cookies = new ArrayDeque<>();

    public ArrayDeque<Cookie> getCookies() {
        return this.cookies;
    }
}
