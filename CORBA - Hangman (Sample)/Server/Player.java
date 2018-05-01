import java.util.ArrayList;
import java.io.Serializable;

public class Player implements Serializable {
  public String name;
  public ArrayList<String> words;
  public String playingWord;
  public int tries;

  public Player(String name) {
    this.name = name;
    words = new ArrayList<>();
    tries = 5;
  }

  public void SetPlayingWord(String word) {
    playingWord = word;
  }

  public String getPlayingWord() {
    return playingWord;
  }

  public void reset() {
    tries = 5;
  }

  public void reduceLife() {
    tries--;
  }

  public int getLife() {
    return tries;
  }

  @Override
  public boolean equals(Object o) {
    boolean bool = false;
    if(o instanceof Player) {
      Player player = (Player) o;
      bool = player.name.equals(this.name);
    }
    return bool;
  }


}
