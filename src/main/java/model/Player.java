package model;

public class Player {
    private String name;
    private String god;
    private int playerId;

    public Player( String name, int id, String god){
        this.name = name;
        this.god = god;
        this.playerId = id;
    }

    public String getName (){
        return name;
    }

    public String getGod (){
        return god;
    }

    public int getPlayerId() {
        return playerId;
    }
}
