package snake;

import javax.swing.*;

public class NewGame extends JFrame{
    public NewGame(String str){
        setTitle("snake.Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Config config = new Config(25, 25, 25, 250);
        setSize(config.getWindowWidth(),config.getWindowHeight());
        setLocation(100,100);
        if (str == "rnd") {
            Level level = new Level(config, "1");
            GameField field = new GameField(config, level.createRandomField());
            add(field);
            setVisible(true);
        }
        if (str == "redact"){
            LevelRedactor redactor = new LevelRedactor(config);
            add(redactor);
            redactor.setVisible(true);
        }
    }
}
