package model.Turn;

import model.islands.Box;


public class MoveStep extends Step{

    private Box from;
    private Box to;

    public Box getFrom() {
        return from;
    }

    public void setFrom(Box from) {
        this.from = from;
    }


    public Box getTo() {
        return to;
    }

    public void setTo(Box to) {
        this.to = to;
    }


    public MoveStep(int stepNumber){
        super(stepNumber);
    }
}
