package snake;

import javax.swing.*;
import java.util.HashSet;

public class NewCreatorGame extends JFrame{

    public NewCreatorGame(Config config, Level level){
        setTitle("Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setSize(config.getWindowWidth(),config.getWindowHeight());
        setLocation(100,100);
        GameField field = new GameField(config, level);
        add(field);
        setVisible(true);
    }
}