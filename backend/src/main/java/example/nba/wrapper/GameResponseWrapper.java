package com.example.nba.wrapper;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

import com.example.nba.model.GameModel;

public class GameResponseWrapper {

    @JsonProperty("get")
    private String endpoint;

    private Map<String, String> parameters;
    private List<Object> errors;
    private int results;
    private List<GameModel> response;


    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public Map<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }

    public List<Object> getErrors() {
        return errors;
    }

    public void setErrors(List<Object> errors) {
        this.errors = errors;
    }

    public int getResults() {
        return results;
    }

    public void setResults(int results) {
        this.results = results;
    }

    public List<GameModel> getResponse() {
        return response;
    }

    public void setResponse(List<GameModel> response) {
        this.response = response;
    }
}
