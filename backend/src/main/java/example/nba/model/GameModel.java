package com.example.nba.model;
 import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class GameModel {

    private int id;
    private String league;
    private int season;
    private Date date;
    private int stage;
    private GameStatus status;
    private GamePeriods periods;
    private Arena arena;
    private Teams teams;
    private Scores scores;
    private List<String> officials;
    private Integer timesTied;
    private Integer leadChanges;
    private Object nugget;

    public GameModel() {}

    public GameModel(int id, String league, int season, Date date, int stage, GameStatus status,
                     GamePeriods periods, Arena arena, Teams teams, Scores scores, List<String> officials,
                     Integer timesTied, Integer leadChanges, Object nugget) {
        this.id = id;
        this.league = league;
        this.season = season;
        this.date = date;
        this.stage = stage;
        this.status = status;
        this.periods = periods;
        this.arena = arena;
        this.teams = teams;
        this.scores = scores;
        this.officials = officials;
        this.timesTied = timesTied;
        this.leadChanges = leadChanges;
        this.nugget = nugget;
    }

    // --- Getters for GameModel ---

    public int getId() { return id; }
    public String getLeague() { return league; }
    public int getSeason() { return season; }
    public Date getDate() { return date; }
    public int getStage() { return stage; }
    public GameStatus getStatus() { return status; }
    public GamePeriods getPeriods() { return periods; }
    public Arena getArena() { return arena; }
    public Teams getTeams() { return teams; }
    public Scores getScores() { return scores; }
    public List<String> getOfficials() { return officials; }
    public Integer getTimesTied() { return timesTied; }
    public Integer getLeadChanges() { return leadChanges; }
    public Object getNugget() { return nugget; }

    // --- Setters for GameModel (Optional but good practice for deserialization) ---

    public void setId(int id) { this.id = id; }
    public void setLeague(String league) { this.league = league; }
    public void setSeason(int season) { this.season = season; }
    public void setDate(Date date) { this.date = date; }
    public void setStage(int stage) { this.stage = stage; }
    public void setStatus(GameStatus status) { this.status = status; }
    public void setPeriods(GamePeriods periods) { this.periods = periods; }
    public void setArena(Arena arena) { this.arena = arena; }
    public void setTeams(Teams teams) { this.teams = teams; }
    public void setScores(Scores scores) { this.scores = scores; }
    public void setOfficials(List<String> officials) { this.officials = officials; }
    public void setTimesTied(Integer timesTied) { this.timesTied = timesTied; }
    public void setLeadChanges(Integer leadChanges) { this.leadChanges = leadChanges; }
    public void setNugget(Object nugget) { this.nugget = nugget; }


    public static class Date {
        private String start;
        private String end;
        private String duration;

        // Getters and Setters for Date
        public String getStart() { return start; }
        public void setStart(String start) { this.start = start; }
        public String getEnd() { return end; }
        public void setEnd(String end) { this.end = end; }
        public String getDuration() { return duration; }
        public void setDuration(String duration) { this.duration = duration; }
    }

    public static class GameStatus {
        private String clock;
        private boolean halftime;
        @JsonProperty("short")
        private int shortCode;
        @JsonProperty("long")
        private String longStatus;

        // Getters and Setters for GameStatus
        public String getClock() { return clock; }
        public void setClock(String clock) { this.clock = clock; }
        public boolean isHalftime() { return halftime; } // Use "is" prefix for boolean getters
        public void setHalftime(boolean halftime) { this.halftime = halftime; }
        public int getShortCode() { return shortCode; }
        public void setShortCode(int shortCode) { this.shortCode = shortCode; }
        public String getLongStatus() { return longStatus; }
        public void setLongStatus(String longStatus) { this.longStatus = longStatus; }
    }

    public static class GamePeriods {
        private int current;
        private int total;
        private boolean endOfPeriod;

        // Getters and Setters for GamePeriods
        public int getCurrent() { return current; }
        public void setCurrent(int current) { this.current = current; }
        public int getTotal() { return total; }
        public void setTotal(int total) { this.total = total; }
        public boolean isEndOfPeriod() { return endOfPeriod; } // Use "is" prefix for boolean getters
        public void setEndOfPeriod(boolean endOfPeriod) { this.endOfPeriod = endOfPeriod; }
    }

    public static class Arena {
        private String name;
        private String city;
        private String state;
        private String country;

        // Getters and Setters for Arena
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public String getCity() { return city; }
        public void setCity(String city) { this.city = city; }
        public String getState() { return state; }
        public void setState(String state) { this.state = state; }
        public String getCountry() { return country; }
        public void setCountry(String country) { this.country = country; }
    }

    public static class Teams {
        private TeamInfo visitors;
        private TeamInfo home;

        public static class TeamInfo {
            private int id;
            private String name;
            private String nickname;
            private String code;
            private String logo;
// Getters and Setters for TeamInfo
            public int getId() { return id; }
            public void setId(int id) { this.id = id; }
            public String getName() { return name; }
            public void setName(String name) { this.name = name; }
            public String getNickname() { return nickname; }
            public void setNickname(String nickname) { this.nickname = nickname; }
            public String getCode() { return code; }
            public void setCode(String code) { this.code = code; }
            public String getLogo() { return logo; }
            public void setLogo(String logo) { this.logo = logo; }
        }
        // Getters and Setters for Teams
        public TeamInfo getVisitors() { return visitors; }
        public void setVisitors(TeamInfo visitors) { this.visitors = visitors; }
        public TeamInfo getHome() { return home; }
        public void setHome(TeamInfo home) { this.home = home; }
    }

    public static class Scores {
        private ScoreDetail visitors;
        private ScoreDetail home;

        public static class ScoreDetail {
            private Integer win;
            private Integer loss;
            private Series series;
            private List<String> linescore;
            private Integer points;

            public static class Series {
                private Integer win;
                private Integer loss;

                // Getters and Setters for Series
                public Integer getWin() { return win; }
                public void setWin(Integer win) { this.win = win; }
                public Integer getLoss() { return loss; }
                public void setLoss(Integer loss) { this.loss = loss; }
            }

            // Getters and Setters for ScoreDetail
            public Integer getWin() { return win; }
            public void setWin(Integer win) { this.win = win; }
            public Integer getLoss() { return loss; }
            public void setLoss(Integer loss) { this.loss = loss; }
            public Series getSeries() { return series; }
            public void setSeries(Series series) { this.series = series; }
            public List<String> getLinescore() { return linescore; }
            public void setLinescore(List<String> linescore) { this.linescore = linescore; }
            public Integer getPoints() { return points; }
            public void setPoints(Integer points) { this.points = points; }
        }

        // Getters and Setters for Scores
        public ScoreDetail getVisitors() { return visitors; }
        public void setVisitors(ScoreDetail visitors) { this.visitors = visitors; }
        public ScoreDetail getHome() { return home; }
        public void setHome(ScoreDetail home) { this.home = home; }
    }
}
