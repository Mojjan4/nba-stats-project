package com.example.nba.model;

import java.util.List;

public class LeagueModel {

    private List<String> response;

    public LeagueModel() {}

    public LeagueModel(List<String> response) {
        this.response = response;
    }

    public List<String> getResponse() {
        return response;
    }

    public void setResponse(List<String> response) {
        this.response = response;
    }
}
