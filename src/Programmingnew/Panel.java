package Programmingnew;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

/*
Панель игры
 */
public class Panel extends JPanel implements ActionListener{
    //размер панели
    public static int WIDTH = Toolkit.getDefaultToolkit().getScreenSize().width;
    public static int HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().height;
    //координаты мышки
    public static int mouseX;
    public static int mouseY;

    public static enum STATES{MENUE, PLAY} //объявляем перечисления
    public static STATES state = STATES.PLAY; //переменная игры по изначально - меню

    private BufferedImage image; //ссылка на объект класса
    private Graphics2D g; //ссылка на объект класса

    Timer mainTimer = new Timer(30, this); //Таймер задает интервал обновления всех событий

    Back back = new Back();
    Player player = new Player();



    public Panel(){ //конструктор
        super(); //активируем конструктор родителя
        setFocusable(true); //передает фокус
        requestFocus(); //активируем
//        mainTimer.start(); //запуск Таймера

        image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB); //создаем объект буфера для хранения картинок
        g = (Graphics2D) image.getGraphics(); //граф объекту присвоем элемент из буфера - картинка Graphics2D применив метод getGraphics()

        addMouseListener(new Listeners());
        addKeyListener(new Listeners());
        addMouseMotionListener(new Listeners());
    }

    public void actionPerformed(ActionEvent e){ //все события игры
        if (state.equals(STATES.MENUE)){ //если переменная state == MENUE

        }
        if (state.equals(STATES.PLAY)){ //игра
            gameUpdate();
            gameRender();
            gameDraw();
        }
    }

    //рисуем в виртуальном окне
    private void gameRender() {
        back.draw(g);
        player.draw(g);
    }


    private void gameUpdate() { //обновление
        player.update();
    }
    //перенос изображения на панель
    private void gameDraw() {
        Graphics g2 = this.getGraphics(); //переопределяем Graphics2D на Graphics
        g2.drawImage(image, 0, 0, null); //рисуем
        g2.dispose(); //команда для уборщика мусора

    }



}
