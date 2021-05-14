package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;
/**
 * MusicDictionaryTest
 * Student nr: 219014868
 * Student name: A Burger
 * Date: Friday - 14 May 2021
 */
class MusicDictionaryTest {
private MusicDictionary musicDictionary;
private String italianWord = "apoyando";
private String englishWord = "rest stroke";
private String italianWordFind = "glissando";
private String englishWordFind ="glide from one pitch to another";

@BeforeEach
    void setUp(){
    this.musicDictionary = MusicDictionary.getInstance();

}

@Test
public void testAddMusicTerm(){
    HashMap<String,String> result = musicDictionary.addMusicTerm(italianWord,englishWord);
    assertEquals(englishWord,result.get(italianWord));
}

@Test
public void testRemoveMusicTerm(){
    HashMap<String,String>  result = musicDictionary.removeMusicTerm(italianWord, englishWord);
    assertEquals(null, result.get(italianWord));
}

@Test
public void testFindMusicTerm(){
    HashMap<String,String>  resultMap = musicDictionary.addMusicTerm(italianWordFind,englishWordFind);
    boolean resultFind = (musicDictionary.findMusicTerm(resultMap, italianWordFind))? true : false;
    assertTrue(resultFind);
}
}