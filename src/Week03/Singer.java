package Week03;

public class Singer {
    private String name;
    private String gender;
    private String nationality;
    private week03.Date debutYear;

    public Singer(String name, String gender, String nationality, week03.Date debutYear) {
        this.name = name;
        this.gender = gender;
        this.nationality = nationality;
        this.debutYear = debutYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public week03.Date getDebutYear() {
        return debutYear;
    }

    public void setDebutYear(week03.Date debutYear) {
        this.debutYear = debutYear;
    }

    public String toString() {
        return String.format(" name :%s\n gender :%s\n nationailty :%s\n debutyear: %s", name, gender, nationality, debutYear);
    }
}
