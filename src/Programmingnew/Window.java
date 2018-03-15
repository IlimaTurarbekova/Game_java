package Programmingnew;

/*
 * Консруктор для игр
 */
import javax.swing.*;
import java.awt.*;

public class Window {
    public static void main(String[] args) {

        JFrame startFrame = new JFrame("game");//создаем окно с названием
        startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//закрытие окна при клике крестика
        startFrame.setLocation(0, 0);//изменяем месторасположение фруйма
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); //получим размер экрана
        startFrame.setSize(screenSize);//установим его
//        startFrame.setSize(1024, 680);//размер окна
        startFrame.add(new Panel());

        //окно видимо
        startFrame.setVisible(true);
    }
}
