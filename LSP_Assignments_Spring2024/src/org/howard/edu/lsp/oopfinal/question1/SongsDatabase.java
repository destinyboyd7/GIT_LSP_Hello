package org.howard.edu.lsp.oopfinal.question1;

import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;


public class SongsDatabase {
    private Map<String, Set<String>> map = new HashMap<String, Set<String>>();

 /* Add a song title to a genre */
    public void addSong(String genre, String songTitle) {
	    Set<String> songs = map.getOrDefault(genre, new HashSet<>());
	    songs.add(songTitle);
	    map.put(genre, songs);
    }

	/* Return genre, i.e., jazz, given a song title */
    public String getGenreOfSong(String songTitle) {
    	for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
         String genre = entry.getKey();
         Set<String> songs = entry.getValue();
         if (songs.contains(songTitle)) {
             return genre;
         }
    	}
    	return null;
    }
 

  
 /* Return the Set that contains all songs for a genre */
    public Set<String> getSongs(String genre) {
    	return map.getOrDefault(genre, new HashSet<>());
    }	

}

