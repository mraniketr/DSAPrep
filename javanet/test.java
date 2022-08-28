package javanet;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient.Version;
import java.net.http.HttpResponse.BodyHandlers;

public class test {
    public static void main(String[] args) {
        HttpRequest req;
        try {
            req = HttpRequest.newBuilder().uri(new URI("https://postman-echo.com/get")).GET().build();

            HttpResponse<String> res = HttpClient.newBuilder().build().send(req, BodyHandlers.ofString());
            System.out.println(res.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
