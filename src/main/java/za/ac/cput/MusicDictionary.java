package za.ac.cput;
import java.util.*;
/**
 * MusicDictionary shows examples of the Map Collection interface usage
 * Student nr: 219014868
 * Student name: A Burger
 * Date: Friday - 14 May 2021
 */

public class MusicDictionary  {
    //this Map collection called MusicDictionary shows the english meaning of commonly used
    // italian words in classical guitar sheet music
    private static MusicDictionary musicDictionary = null;//singleton design pattern for MusicDictionary class

    private static HashMap<String,String> musicDictionaryMap = new HashMap<>();

    private MusicDictionary(){ //singleton design pattern for MusicDictionary class

    }

    public static MusicDictionary getInstance() {//singleton design pattern for MusicDictionary class
        if (musicDictionary == null){
            musicDictionary = new MusicDictionary();
        }
        return musicDictionary;
    }

    public HashMap<String,String> addMusicTerm(String italianMusicTerm, String englishMusicTerm){ //add method for MAP
        musicDictionaryMap.put(italianMusicTerm,englishMusicTerm);
        return musicDictionaryMap;
    }

    public HashMap<String,String> removeMusicTerm(String italianMusicTerm,String englishMusicTerm){ //remove method for MAP
        musicDictionaryMap.remove(italianMusicTerm,englishMusicTerm);
        return musicDictionaryMap;
    }

    public boolean findMusicTerm(HashMap<String,String> m1, String italianMusicTerm){ //find method for MAP
        return m1.containsKey(italianMusicTerm);
    }

}