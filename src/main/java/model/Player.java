package model;

public class Player {
    private String name;
    private String god;
    private int playerId;



    public void setName (String name){
        this.name = name;
    }

    public void setGod (String god){
        this.god = god;
    }

    public String getName (){
        return name;
    }

    public String getGod (){
        return god;
    }

}
