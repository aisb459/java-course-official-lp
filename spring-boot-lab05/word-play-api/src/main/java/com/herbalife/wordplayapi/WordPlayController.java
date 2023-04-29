package com.herbalife.wordplayapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Arrays;

@RestController
@RequestMapping("/wordplay")
public class WordPlayController {
    @Value("${hostused}")
    private String host;

    @Value("${portused}")
    private String port;

    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/{str}")
    public String invokePalindromeApi1(@PathVariable("str") String str){
        String url = "http://"+host+":"+port+"/palindrome/"+str;
        System.out.println("url======================================================"+url);
        ResponseEntity<Boolean> booleanResponseEntity = restTemplate.getForEntity(url, Boolean.class);
        boolean result = booleanResponseEntity.getBody();
        if (result) {
            return "%s is a palindrome".formatted(str);
        }
        return "%s is not a palindrome".formatted(str);

//        HttpHeaders headers = new HttpHeaders();
//        HttpEntity <String> entity = new HttpEntity<String>(headers);
//
//        return restTemplate.exchange(
//                "http://"+host+":"+port+"/palindrome/"+str,  HttpMethod.GET, entity, String.class).getBody();

//        HttpClient httpClient = HttpClient.newBuilder()
//                .version(HttpClient.Version.HTTP_2)
//                .connectTimeout(Duration.ofSeconds(10))
//                .build();
//        try {
//            HttpRequest request = HttpRequest.newBuilder()
//                    .GET()
//                    .uri(URI.create("http://"+host+":"+port+"/palindrome/"+str))
//                    .build();
//            HttpResponse<String> response = httpClient.send(request,
//                    HttpResponse.BodyHandlers.ofString());
//
//
//            return response.body();
//        } catch (IOException | InterruptedException e) {
//            e.printStackTrace();
//        }
//        return "error";
    }
}
