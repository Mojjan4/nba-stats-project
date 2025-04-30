package com.example.nba.model;
import com.example.nba.model.LeagueModel;

public class PlayerModel {
    private int id;
    private String firstname;
    private String lastname;
    private Birth birth;
    private String country;
    private Nba nba;
    private Height height;
    private Weight weight;
    private String college;
    private String affiliation;
    private LeagueModel leagues;
    private int jersey;
    private boolean active;
    private String pos;

    public PlayerModel() {}

    public PlayerModel(int id, String firstname, String lastname, Birth birth, String country,
                       Nba nba, Height height, Weight weight, String college, String affiliation,
                       LeagueModel leagues, int jersey, boolean active, String pos) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birth = birth;
        this.country = country;
        this.nba = nba;
        this.height = height;
        this.weight = weight;
        this.college = college;
        this.affiliation = affiliation;
        this.leagues = leagues;
        this.jersey = jersey;
        this.active = active;
        this.pos = pos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Birth getBirth() {
        return birth;
    }

    public void setBirth(Birth birth) {
        this.birth = birth;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Nba getNba() {
        return nba;
    }

    public void setNba(Nba nba) {
        this.nba = nba;
    }

    public Height getHeight() {
        return height;
    }

    public void setHeight(Height height) {
        this.height = height;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public LeagueModel getLeagues() {
        return leagues;
    }

    public void setLeagues(LeagueModel leagues) {
        this.leagues = leagues;
    }

    public int getJersey() {
        return jersey;
    }

    public void setJersey(int jersey) {
        this.jersey = jersey;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public static class Birth {
        private String date;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }
    }

    public static class Nba {
        private int start;
        private int pro;

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public int getPro() {
            return pro;
        }

        public void setPro(int pro) {
            this.pro = pro;
        }
    }

    public static class Height {
        private String feets;
        private String inches;
        private String meters;

        public String getFeets() {
            return feets;
        }

        public void setFeets(String feets) {
            this.feets = feets;
        }

        public String getInches() {
            return inches;
        }

        public void setInches(String inches) {
            this.inches = inches;
        }

        public String getMeters() {
            return meters;
        }

        public void setMeters(String meters) {
            this.meters = meters;
        }
    }

    public static class Weight {
        private String pounds;
        private String kilograms;

        public String getPounds() {
            return pounds;
        }

        public void setPounds(String pounds) {
            this.pounds = pounds;
        }

        public String getKilograms() {
            return kilograms;
        }

        public void setKilograms(String kilograms) {
            this.kilograms = kilograms;
        }
    }
}
