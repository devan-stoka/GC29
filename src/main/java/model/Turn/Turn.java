package model.Turn;

public class Turn {

    private int turnId;
    private boolean hasMoved;
    private boolean hasBuilt;
    private Step step;

    public int getTurnId() {
        return turnId;
    }

    public void setTurnId(int turnId) {
        this.turnId = turnId;
    }

    public Turn(int turnId){
        this.turnId = turnId;
    }




}
