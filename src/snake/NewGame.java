package snake;

import javax.swing.*;

public class NewGame extends JFrame{

    public NewGame(){
        setTitle("Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Config config = new Config(25, 25, 25, 250);
        setSize(config.getWindowWidth(),config.getWindowHeight());
        setLocation(100,100);
        Level level = new Level(config, "1");
        level.setMazeLocations(level.createRandomField());
        GameField field = new GameField(config, level);
        add(field);
        setVisible(true);
    }
}
