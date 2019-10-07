import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

/** 
* JukeBox Tester. 
* 
* @author <Zeliang Zhuo>
* @since <pre>Oct 7, 2019</pre> 
* @version 1.0 
*/ 
public class JukeBoxTest {

    @BeforeClass
    public static void oneTimeSetup() {

    }

    @AfterClass
    public static void oneTimeTearDown() {

    }

    @Before
    public void before(){

    }

    @After
    public void after(){
    }

    /**
    *
    * Method: getInstance()
    *
    */
    @Test
    public void testGetInstance() {
        JukeBox jukeBox = JukeBox.getInstance();
        assertNotNull(jukeBox);
    }

    /**
    *
    * Method: playNextSong()
    *
    */
    @Test
    public void testPlayNextSongNoSong() {
        JukeBox jukeBox = JukeBox.getInstance();
        System.out.println("expected: You need to add songs to the list\nActual: ");
        jukeBox.playNextSong();

    }

    @Test
    public void testPlayNextSongHasSong() {
        JukeBox jukeBox = JukeBox.getInstance();
        jukeBox.requestSong("abc");
        System.out.println("Let's jam to abc\nActual: ");
        jukeBox.playNextSong();
    }

    @Test
    public void testRequestSongAndRemove(){
        JukeBox jukeBox = JukeBox.getInstance();
        jukeBox.requestSong("123");
        jukeBox.playNextSong();
        assertFalse(jukeBox.hasMoreSongs());
    }

    /**
    *
    * Method: requestSong(String name)
    *
    */
    @Test
    public void testRequestOneSong(){
        JukeBox jukeBox = JukeBox.getInstance();
        jukeBox.requestSong("123");
        System.out.println("123 is now number 1 on the list\nActual: ");
        jukeBox.playNextSong();
    }


    @Test
    public void testRequestTowSong(){
        JukeBox jukeBox = JukeBox.getInstance();
        jukeBox.requestSong("abc");
        jukeBox.requestSong("123");
        System.out.println("123 is now number 2 on the list\nActual: ");
        jukeBox.playNextSong();
    }

    /**
    *
    * Method: hasMoreSongs()
    *
    */
    @Test
    public void testHasNoSongs(){
        JukeBox jukeBox = JukeBox.getInstance();
        assertFalse(jukeBox.hasMoreSongs());
    }

    @Test
    public void testHasSongs(){
        JukeBox jukeBox = JukeBox.getInstance();
        jukeBox.requestSong("abc");
        assertTrue(jukeBox.hasMoreSongs());
    }


} 
