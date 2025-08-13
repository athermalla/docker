package com.docker.demo;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
public class NetworkContainer {


    @Bean
    public WebClient webClient(){
        return WebClient.builder().build();
    }


    @GetMapping("/getUsers")
    @PostConstruct
    public String fetchData() {
        Mono<String> data =  webClient().get()
                .uri("https://dummyjson.com/users/"+1)
                .retrieve()
                .bodyToMono(String.class);
        String s = data.block();
        System.out.println(s);
        return s;

    }

    @GetMapping("/")
    public String greet() {

        return "hello this is running from Docker";


    }

}
