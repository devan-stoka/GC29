package model.players;

public abstract class PlayerDecorator implements Player{
private Player p;

//costruttore
    @Override
    public String decorate(){
        return p.decorate();
    }
}
