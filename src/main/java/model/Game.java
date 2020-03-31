package model;

public class Game {
    private int playersNumber;
    private Turn turn;
    private Turn prevTurn;
    private Player[] players;
    private int currPlayer;
    currPlayer = 1;

    public void setPlayersNumber (int number){
        this.playersNumber = number;
    }

    public void setTurn (Turn turn){
        this.turn = turn;
    }

    public void setPrevTurn (Turn turn){
        this.prevTurn = prevTurn;
    }

    public void setPlayers (Player player){
        this.players[currPlayer] = player;
        this.currPlayer += 1;
    }

    public Turn getPrevTurn() {
        return prevTurn;
    }

    public Turn getTurn() {
        return turn;
    }

    public int getPlayersNumber() {
        return playersNumber;
    }

    public Player getPlayers(int p) {
        Player player = players[p];
        return player;
    }
}
