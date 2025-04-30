package com.example.nba.controller;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

import java.util.Map;

import com.example.nba.service.NbaApiService;

import com.example.nba.model.LeagueModel;
import com.example.nba.model.TeamModel;
import com.example.nba.model.PlayerModel;
import com.example.nba.model.GameModel;

@RestController
public class NbaController {

    private final NbaApiService nbaApiService;

    public NbaController(NbaApiService nbaApiService) {
        this.nbaApiService = nbaApiService;
    }

    @GetMapping("/leagues")
    public Flux<String> getLeagues() {
        return nbaApiService.fetchLeagues();
    }

    @GetMapping("/teams")
    public Flux<TeamModel> getTeams() {
        return nbaApiService.fetchTeams();
    }

    @GetMapping("/players")
    public Flux<PlayerModel> getPlayers(
        @RequestParam(required = false) Integer season,
        @RequestParam(required = false, name = "team") Integer teamId,
        @RequestParam(required = false) String name,
        @RequestParam(required = false) String country,
        @RequestParam(required = false) String search) {
        return nbaApiService.fetchPlayers(season, teamId, name, country, search);
    }

    @GetMapping("/games")
    public Flux<GameModel> getGames() {
        return nbaApiService.fetchGames2024();
    }
}
