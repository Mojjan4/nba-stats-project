package com.example.nba.wrapper;
import com.example.nba.model.PlayerModel;

import java.util.List;
import java.util.Map;

public class PlayerResponseWrapper {
    private String get;
    private Object parameters;
    private List<String> errors;
    private int results;
    private List<PlayerModel> response;

    public String getGet() {
        return get;
    }

    public void setGet(String get) {
        this.get = get;
    }

    public Object getParameters() {
        return parameters;
    }

    public void setParameters(Object parameters) {
        this.parameters = parameters;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

    public int getResults() {
        return results;
    }

    public void setResults(int results) {
        this.results = results;
    }

    public List<PlayerModel> getResponse() {
        return response;
    }

    public void setResponse(List<PlayerModel> response) {
        this.response = response;
    }
}
