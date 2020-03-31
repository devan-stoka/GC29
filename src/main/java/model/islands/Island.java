package model.islands;

public class Island {
    private Box [5][5] board;


    public Island(){
        for(int i=0; i<5; i++) {
            for (int j = 0; j < 5; j++){
                board[i][j] = new Box;
            }
        }
    }

//public refreshIsland??
}
