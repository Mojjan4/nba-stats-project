package com.example.nba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class NbaApiService {

    private final WebClient nbaApiWebClient;

    @Autowired
    public NbaApiService(WebClient nbaApiWebClient) {
        this.nbaApiWebClient = nbaApiWebClient;
    }

    public Mono<String> fetchLeagues() {
        String uri = "/leagues";

        return nbaApiWebClient
                .get()
                .uri(uri)
                .retrieve()
                .bodyToMono(String.class);  // we'll parse the JSON structure later
    }
}
