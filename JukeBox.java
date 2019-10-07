import java.util.LinkedList;
import java.util.Queue;

public class JukeBox {
    private Queue<String> songQueue = new LinkedList<String>(); //create a queue
    private static JukeBox jukeBox;

    private JukeBox() {}

    /**
     * create a JukeBox and return it
     * @return JukeBox
     */
    public static JukeBox getInstance()
    {
        if(jukeBox == null)
        {
            System.out.println("Initializing the JukeBox!!! Let's get Dancing");
            jukeBox = new JukeBox();
        }
        return jukeBox;
    }

    /**
     * display song in the list
     */
    public void playNextSong()
    {
        if(hasMoreSongs()) {
            System.out.printf("Let's jam to %s\n",songQueue.peek());
            songQueue.remove();//remove the song
        } else {
            System.out.println("You need to add songs to the list");
        }
    }

    /**
     * add sone to the list and display info
     * @param name is the song
     */
    public void requestSong(String name)
    {
        songQueue.add(name);
        System.out.printf("%s is now number %d on the list\n",name,songQueue.size());
    }

    /**
     * check if the list is empty
     * @return true when list is not empty return false when the list is empty
     */
    public boolean hasMoreSongs()
    {
        if(songQueue.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}
