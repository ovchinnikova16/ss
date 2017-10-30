package snake;

import javax.swing.*;
import java.io.*;

public class Game extends JFrame{

    public Game(){ }

    public static void main(String[] args) {
        Menu mw = new Menu();
    }

    public static void serialize(GameField gf, String levelName) throws IOException {
        FileOutputStream fos = new FileOutputStream(levelName +".out");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(gf);  // serializatin
        oos.flush();
        oos.close();
    }

    public static GameField deserialize() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("temp.out");
        ObjectInputStream oin = new ObjectInputStream(fis);
        GameField gf = (GameField) oin.readObject();
        return gf;
    }
}
