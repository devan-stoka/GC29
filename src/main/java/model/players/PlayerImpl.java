package model.players;

public class  PlayerImpl implements Player {
    private String name;

    public PlayerImpl(String name){
        System.out.println("Enter your name, player1: ");
        //Scanner input = new Scanner(System.in);
        //this.name = input.nextLine();
    }

    public String getName(){
        return name;
    }

//TODO public checkVictory(){} oppure notifyVictory
//TODO public checkLoss(){} oppure notifyLoss
//TODO exitGame(Game)
//TODO moveWorker
//TODO buildTower

@Override
    public String decorate() {
    return "Player";
    }
}
