package model.Turn;

import model.islands.Box;


public class BuildStep extends Step {

    public Box getPos() {
        return pos;
    }

    public void setPos(Box pos) {
        this.pos = pos;
    }

    private Box pos;

    public BuildStep(int stepNumber){
        super(stepNumber);
    }
}
