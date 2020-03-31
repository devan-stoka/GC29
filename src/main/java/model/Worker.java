package model;


import model.islands.Box;

public class Worker {
    private int workerId;
    private Player player;
    private Box start;

    public Worker (Player player, int workerId, Box start){
        this.player = player;
        this.workerId = workerId;
        this.start = start;
    }

    public Player getPlayer() {
        return player;
    }

    public int getWorkerId() {
        return workerId;
    }

    public Box getStart(){
        return start;
    }

}
