package com.example.nba.wrapper;
import com.example.nba.model.TeamModel;

import java.util.List;

public class TeamResponseWrapper {
    private String get;
    private Object parameters;
    private List<String> errors;
    private int results;
    private List<TeamModel> response;

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

    public List<TeamModel> getResponse() {
        return response;
    }

    public void setResponse(List<TeamModel> response) {
        this.response = response;
    }
}
