package org.howard.edu.lsp.oopfinal.question1;

import org.howard.edu.lsp.oopfinal.question1.SongsDatabase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class SongsDatabaseTest {
	SongsDatabase db;

	@BeforeEach
    public void setUp() {
		SongsDatabase db = new SongsDatabase();
    }

	@Test
	public void testAddSong() {
		db.addSong("Rap", "Savage");
		db.addSong("Country", "Sweet Alabama");
		db.addSong("Jazz", "Always There");
		db.addSong("Rock", "Stairway to Heaven");
        //assertTrue(db.getSongs("Rock").contains("Stairway to Heaven"));
		
	}
	
	@Test
    public void testGetGenreOfSong() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        assertEquals("Rap", db.getGenreOfSong("Savage"));
    }
	
	@Test
    public void testGetSongs() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Rap", "Gin and Juice");
        Set<String> rapSongs = db.getSongs("Rap");
        assertTrue(rapSongs.contains("Savage"));
        assertTrue(rapSongs.contains("Gin and Juice"));
    }

}