package com.example.nba.controller;

import com.example.nba.service.NbaApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class NbaController {

    private final NbaApiService nbaApiService;

    public NbaController(NbaApiService nbaApiService) {
        this.nbaApiService = nbaApiService;
    }

    @GetMapping("/leagues")
    public Mono<String> getLeagues() {
        return nbaApiService.fetchLeagues();
    }
}
