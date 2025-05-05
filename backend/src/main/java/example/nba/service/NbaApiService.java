package com.example.nba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Map;

import com.example.nba.model.LeagueModel;
import com.example.nba.model.TeamModel;
import com.example.nba.model.PlayerModel;
import com.example.nba.model.GameModel;

import com.example.nba.wrapper.TeamResponseWrapper;
import com.example.nba.wrapper.PlayerResponseWrapper;
import com.example.nba.wrapper.GameResponseWrapper;
import com.example.nba.wrapper.LeagueResponseWrapper;

@Service
public class NbaApiService {

    private final WebClient nbaApiWebClient;

    @Autowired
    public NbaApiService(WebClient nbaApiWebClient) {
        this.nbaApiWebClient = nbaApiWebClient;
    }

    public Flux<String> fetchLeagues() {
        String uriLeagues = "/leagues";

        return nbaApiWebClient
                .get()
                .uri(uriLeagues)
                .retrieve()
                .bodyToMono(LeagueResponseWrapper.class)
                .flatMapMany(wrapper -> Flux.fromIterable(wrapper.getResponse()));
    }

    public Flux<TeamModel> fetchTeams() {
        String uriTeams = "/teams";

        return nbaApiWebClient
                .get()
                .uri(uriTeams)
                .retrieve()
                .bodyToMono(TeamResponseWrapper.class)
                .flatMapMany(wrapper -> Flux.fromIterable(wrapper.getResponse()));
    }

    public Flux<PlayerModel> fetchPlayers(
        Integer season, Integer teamId, String name, String country, String search) {

        if (season == null && teamId == null && name == null && country == null && search == null) {
        return Flux.error(new IllegalArgumentException("At least one query parameter must be provided."));
        }

        return nbaApiWebClient
            .get()
            .uri(uriBuilder -> {
            var builder = uriBuilder.path("/players");
            if (season != null) builder.queryParam("season", season);
            if (teamId != null) builder.queryParam("team", teamId);
            if (name != null) builder.queryParam("name", name);
            if (country != null) builder.queryParam("country", country);
            if (search != null) builder.queryParam("search", search);
            return builder.build();
            })
            .retrieve()
            .bodyToMono(PlayerResponseWrapper.class)
            .flatMapMany(wrapper -> Flux.fromIterable(wrapper.getResponse()));
    }

    public Flux<GameModel> fetchGames2024() {
        return nbaApiWebClient
                .get()
                .uri(uriBuilder -> uriBuilder
                        .path("/games")
                        .queryParam("season", 2024)
                        .build())
                .retrieve()
                .bodyToMono(GameResponseWrapper.class)
                .flatMapMany(wrapper -> Flux.fromIterable(wrapper.getResponse()));
    }
}
