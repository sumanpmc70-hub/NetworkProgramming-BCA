package unit3;

import java.net.*;
import java.util.*;
import java.io.IOException;

public class Q16_RememberingProxySelector extends ProxySelector {

    private final Set<String> reachable = new HashSet<>();

    @Override
    public List<Proxy> select(URI uri) {
        if (reachable.contains(uri.getHost())) {
            System.out.println("Direct (remembered): " + uri.getHost());
            return Collections.singletonList(Proxy.NO_PROXY);
        }

        System.out.println("Using proxy for: " + uri.getHost());
        SocketAddress sa = new InetSocketAddress("proxy.example.com", 8080);
        return Collections.singletonList(new Proxy(Proxy.Type.HTTP, sa));
    }

    @Override
    public void connectFailed(URI uri, SocketAddress sa, IOException ioe) {
        System.out.println("Connection failed: " + uri.getHost()
                + " via " + sa + " (" + ioe.getMessage() + ")");
        reachable.add(uri.getHost());
    }

    public static void main(String[] args) {
        Q16_RememberingProxySelector selector = new Q16_RememberingProxySelector();

        try {
            selector.select(new URI("http://www.example.com"));

            selector.connectFailed(
                new URI("http://www.example.com"),
                new InetSocketAddress("proxy.example.com", 8080),
                new IOException("Proxy unreachable")
            );

            selector.select(new URI("http://www.example.com"));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}