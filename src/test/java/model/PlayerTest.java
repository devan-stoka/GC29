package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void getName() {
        Player player = new Player("Test", 1, "APOLLO");
        assertEquals("Test", player.getName());
    }

    @Test
    void getGod() {
        Player player = new Player("Test", 1, "APOLLO");
        assertEquals("APOLLO", player.getGod());
    }

    @Test
    void getPlayerId() {
        Player player = new Player("Test", 1, "APOLLO");
        assertEquals(1, player.getPlayerId());
    }
}