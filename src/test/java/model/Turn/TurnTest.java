package model.Turn;

import org.junit.Test;

import static org.junit.Assert.*;

public class TurnTest {

    @Test
    public void getTurnId() {
        Turn turn = new Turn(1);
        assertEquals(1, turn.getTurnId());

    }


}