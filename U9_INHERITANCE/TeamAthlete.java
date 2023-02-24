package U9_INHERITANCE;

public class TeamAthlete extends Athlete {

    private String teamName;

    private String sport;

    public TeamAthlete(String name, int age, String teamName, String sport){
        super(name, age);
        this.teamName = teamName;
        this.sport = sport;
    }

    public void setTeamName(String teamName){
        this.teamName = teamName;
    }

    public void setSport(String sport){
        this.sport = sport;
    }

    public String getTeamName(){
        return teamName;
    }

    public String getSport(){
        return sport;
    }
}
