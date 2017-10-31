package snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;

public class Game extends JFrame{

    private JButton buttonRandom;
    private JButton buttonRedactor;
    private JButton buttonOpen;

    public Game() {
        setTitle("Snake");
        /*setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Config config = new Config(25, 25, 25, 250);
        setSize(config.getWindowWidth(),config.getWindowHeight());
        setLocation(100,100);
        //GameField first = new GameField(config);
        //LevelRedactor firstGF = new LevelRedactor(config);
        //JButton LRButton = new JButton("Level redactor");
        Menu firstGF = new Menu();
        add(firstGF); // add on the main window
        //add(first);
        setVisible(true);
        */
    }

    public static void main(String[] args) {
        //Game mw = new Game();
        new Menu().setVisible(true);
    }


    public static void serialize(Level maze, String levelName) throws IOException {
        FileOutputStream fos = new FileOutputStream(levelName + ".out");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(maze);  // serializatin
        oos.flush();
        oos.close();
    }

    public static Level deserialize(String levelName) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(levelName + ".out");
        ObjectInputStream oin = new ObjectInputStream(fis);
        Level maze = (Level) oin.readObject();
        return maze;
    }
}
