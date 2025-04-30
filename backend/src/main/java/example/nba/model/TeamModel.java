package com.example.nba.model;
import com.example.nba.model.LeagueModel;

public class TeamModel {
    private int id;
    private String name;
    private String nickname;
    private String code;
    private String city;
    private String logo;
    private boolean allStar;
    private boolean nbaFranchise;
    private LeagueModel leagues;
    private String conference;
    private String division;

    public TeamModel() {}

    public TeamModel(int id, String name, String nickname, String code, String city,
                     String logo, boolean allStar, boolean nbaFranchise, LeagueModel leagues,
                     String conference, String division) {
        this.id = id;
        this.name = name;
        this.nickname = nickname;
        this.code = code;
        this.city = city;
        this.logo = logo;
        this.allStar = allStar;
        this.nbaFranchise = nbaFranchise;
        this.leagues = leagues;
        this.conference = conference;
        this.division = division;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public boolean isAllStar() {
        return allStar;
    }

    public void setAllStar(boolean allStar) {
        this.allStar = allStar;
    }

    public boolean isNbaFranchise() {
        return nbaFranchise;
    }

    public void setNbaFranchise(boolean nbaFranchise) {
        this.nbaFranchise = nbaFranchise;
    }

    public LeagueModel getLeagues() {
        return leagues;
    }

    public void setLeagues(LeagueModel leagues) {
        this.leagues = leagues;
    }

    public String getConference() {
        return conference;
    }

    public void setConference(String conference) {
        this.conference = conference;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }
}
