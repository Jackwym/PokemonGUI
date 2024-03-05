import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.*;

public class MyFrame extends JFrame implements KeyListener, MouseListener, ActionListener, WindowListener {
    public int curScreen;
    public boolean isPlayersTurn;
    public String name;
    public String rivalName;
    public ArrayList<Pokemon> playerPokemon;
    public Pokemon[] playerPokemonList;
    public Pokemon[] CPUPokemon;
    public ArrayList<Pokemon> allPokemon;
    Pokemon bulbasaur;
    Pokemon charmander;
    Pokemon squirtle;
    Pokemon bellsprout;
    Pokemon ninetails;
    Pokemon psyduck;
    Pokemon oddish;
    Pokemon ponyta;
    Pokemon poliwag;
    int x1 = 0;
    int x2 = 40;
    int x3 = 80;
    int x4 = 120;
    int x5 = 160;
    int x6 = 200;
    int x7 = 240;
    int x8 = 280;
    int x9 = 320;
    int fadeOut = 254;

    BufferedImage startScreenBuffer = null;
    BufferedImage trainerBuffer = null;
    BufferedImage rivalBuffer = null;
    BufferedImage bulbasaurBackBuffer = null;
    BufferedImage bulbasaurFrontBuffer = null;
    BufferedImage charmanderBackBuffer = null;
    BufferedImage charmanderFrontBuffer = null;
    BufferedImage squirtleBackBuffer = null;
    BufferedImage squirtleFrontBuffer = null;
    BufferedImage bellsproutBackBuffer = null;
    BufferedImage bellsproutFrontBuffer = null;
    BufferedImage ninetailsBackBuffer = null;
    BufferedImage ninetailsFrontBuffer = null;
    BufferedImage psyduckBackBuffer = null;
    BufferedImage psyduckFrontBuffer = null;
    BufferedImage oddishBackBuffer = null;
    BufferedImage oddishFrontBuffer = null;
    BufferedImage ponytaBackBuffer = null;
    BufferedImage ponytaFrontBuffer = null;
    BufferedImage poliwagBackBuffer = null;
    BufferedImage poliwagFrontBuffer = null;

    TextField nameEnter;
    TextField rivalEnter;

    JLabel startScreenLabel;
    JLabel trainerLabel;
    JLabel trainerPokemonLabel;
    JLabel rivalLabel;
    JLabel rivalPokemonLabel;
    JLabel bulbasaurBackLabel;
    JLabel bulbasaurFrontLabel;
    JLabel charmanderBackLabel;
    JLabel charmanderFrontLabel;
    JLabel squirtleBackLabel;
    JLabel squirtleFrontLabel;
    JLabel bellsproutBackLabel;
    JLabel bellsproutFrontLabel;
    JLabel ninetailsBackLabel;
    JLabel ninetailsFrontLabel;
    JLabel psyduckBackLabel;
    JLabel psyduckFrontLabel;
    JLabel oddishBackLabel;
    JLabel oddishFrontLabel;
    JLabel ponytaBackLabel;
    JLabel ponytaFrontLabel;
    JLabel poliwagBackLabel;
    JLabel poliwagFrontLabel;
    JLabel pokemon1;
    JLabel pokemon2;
    JLabel pokemon3;
    JLabel pokemon1Stats;
    JLabel pokemon2Stats;
    JLabel pokemon3Stats;

    JLabel bulbasaurFrontLabelSmall;
    JLabel charmanderFrontLabelSmall;
    JLabel squirtleFrontLabelSmall;
    JLabel bellsproutFrontLabelSmall;
    JLabel ninetailsFrontLabelSmall;
    JLabel psyduckFrontLabelSmall;
    JLabel oddishFrontLabelSmall;
    JLabel ponytaFrontLabelSmall;
    JLabel poliwagFrontLabelSmall;

    JLabel namePrompt;
    JLabel rivalPrompt;
    JLabel coverScreen;
    JLabel statsTop;
    JLabel statsMiddle;
    JLabel statsBottom;
    JLabel welcome;

    JButton bulbasaurButton;
    JButton charmanderButton;
    JButton squirtleButton;
    JButton bellsproutButton;
    JButton ninetailsButton;
    JButton psyduckButton;
    JButton oddishButton;
    JButton ponytaButton;
    JButton poliwagButton;
    JButton attackTopButton;
    JButton attackMiddleButton;
    JButton attackBottomButton;
    JButton switchButton;
    JButton healButton;
    JButton menuButton;
    JButton exitMenuButton;
    JButton switchOption1Button;
    JButton switchOption2Button;
    JButton switchOption3Button;

    ImageIcon bulbasaurFrontSmall;
    ImageIcon charmanderFrontSmall;
    ImageIcon squirtleFrontSmall;
    ImageIcon bellsproutFrontSmall;
    ImageIcon ninetailsFrontSmall;
    ImageIcon psyduckFrontSmall;
    ImageIcon oddishFrontSmall;
    ImageIcon ponytaFrontSmall;
    ImageIcon poliwagFrontSmall;

    ImageIcon bulbasaurBack;
    ImageIcon charmanderBack;
    ImageIcon squirtleBack;
    ImageIcon bellsproutBack;
    ImageIcon ninetailsBack;
    ImageIcon psyduckBack;
    ImageIcon oddishBack;
    ImageIcon ponytaBack;
    ImageIcon poliwagBack;

    public MyFrame() {
        allPokemon = new ArrayList<>();
        bulbasaur = new Pokemon("bulbasaur");
        charmander = new Pokemon("charmander");
        squirtle = new Pokemon("squirtle");
        bellsprout = new Pokemon("bellsprout");
        ninetails = new Pokemon("ninetails");
        psyduck = new Pokemon("psyduck");
        oddish = new Pokemon("oddish");
        ponyta = new Pokemon("ponyta");
        poliwag = new Pokemon("poliwag");
        allPokemon.add(bulbasaur);
        allPokemon.add(charmander);
        allPokemon.add(squirtle);
        allPokemon.add(bellsprout);
        allPokemon.add(ninetails);
        allPokemon.add(psyduck);
        allPokemon.add(oddish);
        allPokemon.add(ponyta);
        allPokemon.add(poliwag);

        startScreenLabel = new JLabel();
        trainerLabel = new JLabel();
        trainerPokemonLabel = new JLabel();
        rivalLabel = new JLabel();
        rivalPokemonLabel = new JLabel();
        bulbasaurBackLabel = new JLabel();
        bulbasaurFrontLabel = new JLabel();
        charmanderBackLabel = new JLabel();
        charmanderFrontLabel = new JLabel();
        squirtleBackLabel = new JLabel();
        squirtleFrontLabel = new JLabel();
        bellsproutBackLabel = new JLabel();
        bellsproutFrontLabel = new JLabel();
        ninetailsBackLabel = new JLabel();
        ninetailsFrontLabel = new JLabel();
        psyduckBackLabel = new JLabel();
        psyduckFrontLabel = new JLabel();
        oddishBackLabel = new JLabel();
        oddishFrontLabel = new JLabel();
        ponytaBackLabel = new JLabel();
        ponytaFrontLabel = new JLabel();
        poliwagBackLabel = new JLabel();
        poliwagFrontLabel = new JLabel();

        bulbasaurFrontLabelSmall = new JLabel();
        charmanderFrontLabelSmall = new JLabel();
        squirtleFrontLabelSmall = new JLabel();
        bellsproutFrontLabelSmall = new JLabel();
        ninetailsFrontLabelSmall = new JLabel();
        psyduckFrontLabelSmall = new JLabel();
        oddishFrontLabelSmall = new JLabel();
        ponytaFrontLabelSmall = new JLabel();
        poliwagFrontLabelSmall = new JLabel();

        namePrompt = new JLabel("Enter Your Name: ");
        rivalPrompt = new JLabel("Enter Your Rival's Name: ");
        coverScreen = new JLabel();
        statsTop = new JLabel();
        statsMiddle = new JLabel();
        statsBottom = new JLabel();
        welcome = new JLabel("PRESS ANYTHING TO START");
        pokemon1 = new JLabel();
        pokemon2 = new JLabel();
        pokemon3 = new JLabel();
        pokemon1Stats = new JLabel();
        pokemon2Stats = new JLabel();
        pokemon3Stats = new JLabel();

        bulbasaurButton = new JButton();
        charmanderButton = new JButton();
        squirtleButton = new JButton();
        bellsproutButton = new JButton();
        ninetailsButton = new JButton();
        psyduckButton = new JButton();
        oddishButton = new JButton();
        ponytaButton = new JButton();
        poliwagButton = new JButton();
        attackTopButton = new JButton();
        attackMiddleButton = new JButton();
        attackBottomButton = new JButton();
        switchButton = new JButton();
        healButton = new JButton();
        menuButton = new JButton();
        exitMenuButton = new JButton();
        switchOption1Button = new JButton();
        switchOption2Button = new JButton();
        switchOption3Button= new JButton();

        try {
            startScreenBuffer = ImageIO.read(new File("pkmStartScreen.jpeg"));
            trainerBuffer = ImageIO.read(new File("trainerSprite.png"));
            rivalBuffer = ImageIO.read(new File("rivalSprite.png"));

            bulbasaurBackBuffer = ImageIO.read(new File("bulbasaurBackSprite.png"));
            bulbasaurFrontBuffer = ImageIO.read(new File("bulbasaurFrontSprite.png"));
            charmanderBackBuffer = ImageIO.read(new File("charmanderBackSprite.png"));
            charmanderFrontBuffer = ImageIO.read(new File("charmanderFrontSprite.png"));
            squirtleBackBuffer = ImageIO.read(new File("squirtleBackSprite.png"));
            squirtleFrontBuffer = ImageIO.read(new File("squirtleFrontSprite.png"));
            bellsproutBackBuffer = ImageIO.read(new File("bellsproutBackSprite.png"));
            bellsproutFrontBuffer = ImageIO.read(new File("bellsproutFrontSprite.png"));
            ninetailsBackBuffer = ImageIO.read(new File("ninetailsBackSprite.png"));
            ninetailsFrontBuffer = ImageIO.read(new File("ninetailsFrontSprite.png"));
            psyduckBackBuffer = ImageIO.read(new File("psyduckBackSprite.png"));
            psyduckFrontBuffer = ImageIO.read(new File("psyduckFrontSprite.png"));
            oddishBackBuffer = ImageIO.read(new File("oddishBackSprite.png"));
            oddishFrontBuffer = ImageIO.read(new File("oddishFrontSprite.png"));
            ponytaBackBuffer = ImageIO.read(new File("ponytaBackSprite.png"));
            ponytaFrontBuffer = ImageIO.read(new File("ponytaFrontSprite.png"));
            poliwagBackBuffer = ImageIO.read(new File("poliwagBackSprite.png"));
            poliwagFrontBuffer = ImageIO.read(new File("poliwagFrontSprite.png"));

//            bulbasaurBackBuffer = ImageIO.read(new File("bulbasaurBackSprite-removebg-preview.png"));
//            bulbasaurFrontBuffer = ImageIO.read(new File("bulbasaurFrontSprite-removebg-preview.png"));
//            charmanderBackBuffer = ImageIO.read(new File("charmanderBackSprite-removebg-preview.png"));
//            charmanderFrontBuffer = ImageIO.read(new File("charmanderFrontSprite-removebg-preview.png"));
//            squirtleBackBuffer = ImageIO.read(new File("squirtleBackSprite-removebg-preview.png"));
//            squirtleFrontBuffer = ImageIO.read(new File("squirtleFrontSprite-removebg-preview.png"));
//            bellsproutBackBuffer = ImageIO.read(new File("bellsproutBackSprite-removebg-preview.png"));
//            bellsproutFrontBuffer = ImageIO.read(new File("bellsproutFrontSprite-removebg-preview.png"));
//            ninetailsBackBuffer = ImageIO.read(new File("ninetailsBackSprite-removebg-preview.png"));
//            ninetailsFrontBuffer = ImageIO.read(new File("ninetailsFrontSprite-removebg-preview.png"));
//            psyduckBackBuffer = ImageIO.read(new File("psyduckBackSprite-removebg-preview.png"));
//            psyduckFrontBuffer = ImageIO.read(new File("psyduckFrontSprite-removebg-preview.png"));
//            oddishBackBuffer = ImageIO.read(new File("oddishBackSprite-removebg-preview.png"));
//            oddishFrontBuffer = ImageIO.read(new File("oddishFrontSprite-removebg-preview.png"));
//            ponytaBackBuffer = ImageIO.read(new File("ponytaBackSprite-removebg-preview.png"));
//            ponytaFrontBuffer = ImageIO.read(new File("ponytaFrontSprite-removebg-preview.png"));
//            poliwagBackBuffer = ImageIO.read(new File("poliwagBackSprite-removebg-preview.png"));
//            poliwagFrontBuffer = ImageIO.read(new File("poliwagFrontSprite-removebg-preview.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Image startScreenScaled = startScreenBuffer.getScaledInstance(1400, 1050, Image.SCALE_SMOOTH);
        Image trainerScaled = trainerBuffer.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        Image rivalScaled = rivalBuffer.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        Image bulbasaurBackScaled = bulbasaurBackBuffer.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        Image bulbasaurFrontScaled = bulbasaurFrontBuffer.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        Image charmanderBackScaled = charmanderBackBuffer.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        Image charmanderFrontScaled = charmanderFrontBuffer.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        Image squirtleBackScaled = squirtleBackBuffer.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        Image squirtleFrontScaled = squirtleFrontBuffer.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        Image bellsproutBackScaled = bellsproutBackBuffer.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        Image bellsproutFrontScaled = bellsproutFrontBuffer.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        Image ninetailsBackScaled = ninetailsBackBuffer.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        Image ninetailsFrontScaled = ninetailsFrontBuffer.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        Image psyduckBackScaled = psyduckBackBuffer.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        Image psyduckFrontScaled = psyduckFrontBuffer.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        Image oddishBackScaled = oddishBackBuffer.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        Image oddishFrontScaled = oddishFrontBuffer.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        Image ponytaBackScaled = ponytaBackBuffer.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        Image ponytaFrontScaled = ponytaFrontBuffer.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        Image poliwagBackScaled = poliwagBackBuffer.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        Image poliwagFrontScaled = poliwagFrontBuffer.getScaledInstance(400, 400, Image.SCALE_SMOOTH);

        Image bulbasaurFrontScaledSmall = bulbasaurFrontBuffer.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        Image charmanderFrontScaledSmall = charmanderFrontBuffer.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        Image squirtleFrontScaledSmall = squirtleFrontBuffer.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        Image bellsproutFrontScaledSmall = bellsproutFrontBuffer.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        Image ninetailsFrontScaledSmall = ninetailsFrontBuffer.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        Image psyduckFrontScaledSmall = psyduckFrontBuffer.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        Image oddishFrontScaledSmall = oddishFrontBuffer.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        Image ponytaFrontScaledSmall = ponytaFrontBuffer.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        Image poliwagFrontScaledSmall = poliwagFrontBuffer.getScaledInstance(200, 200, Image.SCALE_SMOOTH);

        bulbasaurFrontSmall = new ImageIcon(bulbasaurFrontScaledSmall);
        charmanderFrontSmall = new ImageIcon(charmanderFrontScaledSmall);
        squirtleFrontSmall = new ImageIcon(squirtleFrontScaledSmall);
        bellsproutFrontSmall = new ImageIcon(bellsproutFrontScaledSmall);
        ninetailsFrontSmall = new ImageIcon(ninetailsFrontScaledSmall);
        psyduckFrontSmall = new ImageIcon(psyduckFrontScaledSmall);
        oddishFrontSmall = new ImageIcon(oddishFrontScaledSmall);
        ponytaFrontSmall = new ImageIcon(ponytaFrontScaledSmall);
        poliwagFrontSmall = new ImageIcon(poliwagFrontScaledSmall);

        bulbasaurBack = new ImageIcon(bulbasaurBackScaled);
        charmanderBack = new ImageIcon(charmanderBackScaled);
        squirtleBack = new ImageIcon(squirtleBackScaled);
        bellsproutBack = new ImageIcon(bellsproutBackScaled);
        ninetailsBack = new ImageIcon(ninetailsBackScaled);
        psyduckBack = new ImageIcon(psyduckBackScaled);
        oddishBack = new ImageIcon(oddishBackScaled);
        ponytaBack = new ImageIcon(ponytaBackScaled);
        poliwagBack = new ImageIcon(poliwagBackScaled);

        startScreenLabel.setIcon(new ImageIcon(startScreenScaled));
        trainerLabel.setIcon(new ImageIcon(trainerScaled));
        rivalLabel.setIcon(new ImageIcon(rivalScaled));
        bulbasaurBackLabel.setIcon(new ImageIcon(bulbasaurBackScaled));
        charmanderBackLabel.setIcon(new ImageIcon(charmanderBackScaled));
        squirtleBackLabel.setIcon(new ImageIcon(squirtleBackScaled));
        bellsproutBackLabel.setIcon(new ImageIcon(bellsproutBackScaled));
        ninetailsBackLabel.setIcon(new ImageIcon(ninetailsBackScaled));
        psyduckBackLabel.setIcon(new ImageIcon(psyduckBackScaled));
        oddishBackLabel.setIcon(new ImageIcon(oddishBackScaled));
        ponytaBackLabel.setIcon(new ImageIcon(ponytaBackScaled));
        poliwagBackLabel.setIcon(new ImageIcon(poliwagBackScaled));

        bulbasaurFrontLabelSmall.setBounds(700, 400, 200, 200);
        bulbasaurFrontLabelSmall.setVisible(false);
        charmanderFrontLabelSmall.setBounds(700, 400, 200, 200);
        charmanderFrontLabelSmall.setVisible(false);
        squirtleFrontLabelSmall.setBounds(700, 400, 200, 200);
        squirtleFrontLabelSmall.setVisible(false);
        bellsproutFrontLabelSmall.setBounds(700, 400, 200, 200);
        bellsproutFrontLabelSmall.setVisible(false);
        ninetailsFrontLabelSmall.setBounds(700, 400, 200, 200);
        ninetailsFrontLabelSmall.setVisible(false);
        psyduckFrontLabelSmall.setBounds(700, 400, 200, 200);
        psyduckFrontLabelSmall.setVisible(false);
        oddishFrontLabelSmall.setBounds(700, 400, 200, 200);
        oddishFrontLabelSmall.setVisible(false);
        ponytaFrontLabelSmall.setBounds(700, 400, 200, 200);
        ponytaFrontLabelSmall.setVisible(false);
        poliwagFrontLabelSmall.setBounds(700, 400, 200, 200);
        poliwagFrontLabelSmall.setVisible(false);

        pokemon1.setBounds(50, 50, 250, 250);
        pokemon1.setVisible(false);
        pokemon2 .setBounds(50, 350, 250, 250);
        pokemon2.setVisible(false);
        pokemon3 .setBounds(50, 650, 250, 250);
        pokemon3.setVisible(false);
        pokemon1Stats.setBounds(350, 50, 1050, 250);
        pokemon1Stats.setFont(new Font("DialogInput", Font.PLAIN, 70));
        pokemon1Stats.setVisible(false);
        pokemon2Stats.setBounds(350, 350, 1050, 250);
        pokemon2Stats.setFont(new Font("DialogInput", Font.PLAIN, 70));
        pokemon2Stats.setVisible(false);
        pokemon3Stats.setBounds(350, 650, 1050, 250);
        pokemon3Stats.setFont(new Font("DialogInput", Font.PLAIN, 70));
        pokemon3Stats.setVisible(false);

        // Button set up
        bulbasaurButton.setIcon(new ImageIcon(bulbasaurFrontScaledSmall));
        bulbasaurButton.setBounds(350, 175, 200, 200);
        bulbasaurButton.addActionListener(this);
        bulbasaurButton.setVisible(false);

        charmanderButton.setIcon(new ImageIcon(charmanderFrontScaledSmall));
        charmanderButton.setBounds(600, 175, 200, 200);
        charmanderButton.addActionListener(this);
        charmanderButton.setVisible(false);

        squirtleButton.setIcon(new ImageIcon(squirtleFrontScaledSmall));
        squirtleButton.setBounds(850, 175, 200, 200);
        squirtleButton.addActionListener(this);
        squirtleButton.setVisible(false);

        bellsproutButton.setIcon(new ImageIcon(bellsproutFrontScaledSmall));
        bellsproutButton.setBounds(350, 425, 200, 200);
        bellsproutButton.addActionListener(this);
        bellsproutButton.setVisible(false);

        ninetailsButton.setIcon(new ImageIcon(ninetailsFrontScaledSmall));
        ninetailsButton.setBounds(600, 425, 200, 200);
        ninetailsButton.addActionListener(this);
        ninetailsButton.setVisible(false);

        psyduckButton.setIcon(new ImageIcon(psyduckFrontScaledSmall));
        psyduckButton.setBounds(850, 425, 200, 200);
        psyduckButton.addActionListener(this);
        psyduckButton.setVisible(false);

        oddishButton.setIcon(new ImageIcon(oddishFrontScaledSmall));
        oddishButton.setBounds(350, 675, 200, 200);
        oddishButton.addActionListener(this);
        oddishButton.setVisible(false);

        ponytaButton.setIcon(new ImageIcon(ponytaFrontScaledSmall));
        ponytaButton.setBounds(600, 675, 200, 200);
        ponytaButton.addActionListener(this);
        ponytaButton.setVisible(false);

        poliwagButton.setIcon(new ImageIcon(poliwagFrontScaledSmall));
        poliwagButton.setBounds(850, 675, 200, 200);
        poliwagButton.addActionListener(this);
        poliwagButton.setVisible(false);

        attackTopButton.setBounds(50, 50, 500, 150);
        attackTopButton.setBackground(new Color(200, 200, 200));
        attackTopButton.setFont(new Font("DialogInput", Font.PLAIN, 70));
        attackTopButton.addActionListener(this);
        attackTopButton.setVisible(false);

        attackMiddleButton.setBounds(50, 225, 500, 150);
        attackMiddleButton.setBackground(new Color(200, 200, 200));
        attackMiddleButton.setFont(new Font("DialogInput", Font.PLAIN, 70));
        attackMiddleButton.addActionListener(this);
        attackMiddleButton.setVisible(false);

        attackBottomButton.setBounds(50, 400, 500, 150);
        attackBottomButton.setBackground(new Color(200, 200, 200));
        attackBottomButton.setFont(new Font("DialogInput", Font.PLAIN, 70));
        attackBottomButton.addActionListener(this);
        attackBottomButton.setVisible(false);

        switchButton.setBounds(1050, 700, 200, 70);
        switchButton.setBackground(new Color(200, 200, 200));
        switchButton.setFont(new Font("DialogInput", Font.PLAIN, 30));
        switchButton.setText("SWITCH");
        switchButton.addActionListener(this);
        switchButton.setVisible(false);

        healButton.setBounds(1050, 800, 200, 70);
        healButton.setBackground(new Color(200, 200, 200));
        healButton.setFont(new Font("DialogInput", Font.PLAIN, 30));
        healButton.setText("HEAL");
        healButton.addActionListener(this);
        healButton.setVisible(false);

        menuButton.setBounds(1050, 900, 200, 70);
        menuButton.setBackground(new Color(200, 200, 200));
        menuButton.setFont(new Font("DialogInput", Font.PLAIN, 30));
        menuButton.setText("MENU");
        menuButton.addActionListener(this);
        menuButton.setVisible(false);

        exitMenuButton.setBounds(1050, 900, 200, 70);
        exitMenuButton.setBackground(new Color(200, 200, 200));
        exitMenuButton.setFont(new Font("DialogInput", Font.PLAIN, 30));
        exitMenuButton.setText("EXIT");
        exitMenuButton.addActionListener(this);
        exitMenuButton.setVisible(false);

        switchOption1Button.setBounds(50, 50, 200, 200);
        switchOption1Button.addActionListener(this);
        switchOption1Button.setText("OUT");
        switchOption1Button.setFont(new Font("DialogInput", Font.PLAIN, 40));
        switchOption1Button.setIconTextGap(-135);

        switchOption1Button.setVisible(false);

        switchOption2Button.setBounds(275, 50, 200, 200);
        switchOption2Button.addActionListener(this);
        switchOption2Button.setVisible(false);

        switchOption3Button.setBounds(500, 50, 200, 200);
        switchOption3Button.addActionListener(this);
        switchOption3Button.setVisible(false);

        // frame set up
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(squirtleFrontScaled);
        this.setSize(1400, 1050);
        this.getContentPane().setBackground(new Color(255, 255, 255));
        this.setLayout(null);
        this.setResizable(false);
        this.addWindowListener(this);
        this.addMouseListener(this);

        // global set up
        curScreen = 0;
        playerPokemon = new ArrayList<>();
        playerPokemonList = new Pokemon[3];
        CPUPokemon = new Pokemon[3];
        isPlayersTurn = true;

        // extra misc labels set up
        startScreenLabel.setBounds(0, -50, 1400, 1100);
        startScreenLabel.addMouseListener(this);
        startScreenLabel.addKeyListener(this);
        startScreenLabel.setVisible(true);

        nameEnter = new TextField();
        nameEnter.setBounds(350, 300, 700, 150);
        nameEnter.setFont(new Font("DialogInput", Font.PLAIN, 150));
        nameEnter.addActionListener(this);
        nameEnter.setVisible(false);

        rivalEnter = new TextField();
        rivalEnter.setBounds(350, 600, 700, 150);
        rivalEnter.setFont(new Font("DialogInput", Font.PLAIN, 150));
        rivalEnter.addActionListener(this);
        rivalEnter.setVisible(false);

        namePrompt.setBounds(350, 250, 600, 50);
        namePrompt.setFont(new Font("DialogInput", Font.PLAIN, 50));
        namePrompt.setVisible(false);

        rivalPrompt.setBounds(350, 550, 800, 50);
        rivalPrompt.setFont(new Font("DialogInput", Font.PLAIN, 50));
        rivalPrompt.setVisible(false);

        welcome.setBounds(550, 370, 400, 50);
        welcome.setFont(new Font("DialogInput", Font.PLAIN, 20));
        welcome.setVisible(false);

        coverScreen.setBounds(0, 0, 1400, 1050);
        coverScreen.setBackground(new Color(255, 255, 255));
        coverScreen.setOpaque(true);
        coverScreen.setVisible(false);

        statsTop.setText("HP-60 AP-40                                                            HP-25 AP-70                                                            HP-80 AP-20");
        statsMiddle.setText("HP-40 AP-60                                                            HP-30 AP-50                                                            HP-70 AP-40");
        statsBottom.setText("HP-50 AP-50                                                            HP-40 AP-60                                                            HP-50 AP-50");
        statsTop.setBounds(350, 155, 700, 20);
        statsMiddle.setBounds(350, 405, 700, 20);
        statsBottom.setBounds(350, 655, 700, 20);
        statsTop.setVisible(false);
        statsMiddle.setVisible(false);
        statsBottom.setVisible(false);

        // battle set up
        trainerLabel.setBounds(120, 675, 400, 400);
        trainerLabel.setVisible(false);
        rivalLabel.setBounds(1000, 300, 200, 200);
        rivalLabel.setVisible(false);
        trainerPokemonLabel.setBounds(550, 675, 400, 400);
        trainerPokemonLabel.setVisible(false);
        rivalPokemonLabel.setBounds(800, 400, 200, 200);
        rivalPokemonLabel.setVisible(false);

        // frame start up / adding components
        this.add(switchOption1Button);
        this.add(switchOption2Button);
        this.add(switchOption3Button);
        this.add(pokemon1);
        this.add(pokemon2);
        this.add(pokemon3);
        this.add(pokemon1Stats);
        this.add(pokemon2Stats);
        this.add(pokemon3Stats);

        this.add(attackTopButton);
        this.add(attackMiddleButton);
        this.add(attackBottomButton);
        this.add(switchButton);
        this.add(healButton);
        this.add(menuButton);
        this.add(exitMenuButton);

        this.add(trainerPokemonLabel);
        this.add(rivalPokemonLabel);
        this.add(trainerLabel);
        this.add(rivalLabel);
        this.add(bulbasaurBackLabel);
        this.add(charmanderBackLabel);
        this.add(squirtleBackLabel);
        this.add(bellsproutBackLabel);
        this.add(ninetailsBackLabel);
        this.add(psyduckBackLabel);
        this.add(oddishBackLabel);
        this.add(ponytaBackLabel);
        this.add(poliwagBackLabel);

        this.add(bulbasaurFrontLabelSmall);
        this.add(charmanderFrontLabelSmall);
        this.add(squirtleFrontLabelSmall);
        this.add(bellsproutFrontLabelSmall);
        this.add(ninetailsFrontLabelSmall);
        this.add(psyduckFrontLabelSmall);
        this.add(oddishFrontLabelSmall);
        this.add(ponytaFrontLabelSmall);
        this.add(poliwagFrontLabelSmall);

        this.add(coverScreen);
        this.add(statsTop);
        this.add(statsMiddle);
        this.add(statsBottom);
        this.add(bulbasaurButton);
        this.add(charmanderButton);
        this.add(squirtleButton);
        this.add(bellsproutButton);
        this.add(ninetailsButton);
        this.add(psyduckButton);
        this.add(oddishButton);
        this.add(ponytaButton);
        this.add(poliwagButton);

        this.add(rivalPrompt);
        this.add(rivalEnter);
        this.add(namePrompt);
        this.add(nameEnter);
        this.add(welcome);
        this.add(startScreenLabel);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    // Key events ==============================================================================>
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    // Mouse events ============================================================================>
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
//        Point pos = MouseInfo.getPointerInfo().getLocation();
//        int x = e.getX();
//        int y = e.getY();
//        System.out.println(x + ", " + y);
        if (curScreen == 0) {
            nameEnter.addKeyListener(this);
            startScreenLabel.setVisible(false);
            welcome.setVisible(false);
            nameEnter.setVisible(true);
            namePrompt.setVisible(true);
            rivalEnter.setVisible(true);
            rivalPrompt.setVisible(true);
            curScreen++;
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    // Button events ===========================================================================>
    @Override
    public void actionPerformed(ActionEvent e) {
        if (curScreen == 1) {
            if (nameEnter.getText().isEmpty() || rivalEnter.getText().isEmpty()) return;
            name = nameEnter.getText();
            rivalName = rivalEnter.getText();
            namePrompt.setVisible(false);
            nameEnter.setVisible(false);
            rivalPrompt.setVisible(false);
            rivalEnter.setVisible(false);
            // put all pkm buttons on screen
            bulbasaurButton.setVisible(true);
            charmanderButton.setVisible(true);
            squirtleButton.setVisible(true);
            bellsproutButton.setVisible(true);
            ninetailsButton.setVisible(true);
            psyduckButton.setVisible(true);
            oddishButton.setVisible(true);
            ponytaButton.setVisible(true);
            poliwagButton.setVisible(true);
            statsTop.setVisible(true);
            statsMiddle.setVisible(true);
            statsBottom.setVisible(true);
            curScreen++;
        }
        else if (curScreen == 2) {
            if (e.getSource() == bulbasaurButton) {
                playerPokemon.add(bulbasaur);
                allPokemon.remove(bulbasaur);
                bulbasaurButton.setEnabled(false);
            }
            else if (e.getSource() == charmanderButton) {
                playerPokemon.add(charmander);
                allPokemon.remove(charmander);
                charmanderButton.setEnabled(false);
            }
            else if (e.getSource() == squirtleButton) {
                playerPokemon.add(squirtle);
                allPokemon.remove(squirtle);
                squirtleButton.setEnabled(false);
            }
            else if (e.getSource() == bellsproutButton) {
                playerPokemon.add(bellsprout);
                allPokemon.remove(bellsprout);
                bellsproutButton.setEnabled(false);
            }
            else if (e.getSource() == ninetailsButton) {
                playerPokemon.add(ninetails);
                allPokemon.remove(ninetails);
                ninetailsButton.setEnabled(false);
            }
            else if (e.getSource() == psyduckButton) {
                playerPokemon.add(psyduck);
                allPokemon.remove(psyduck);
                psyduckButton.setEnabled(false);
            }
            else if (e.getSource() == oddishButton) {
                playerPokemon.add(oddish);
                allPokemon.remove(oddish);
                oddishButton.setEnabled(false);
            }
            else if (e.getSource() == ponytaButton) {
                playerPokemon.add(ponyta);
                allPokemon.remove(ponyta);
                ponytaButton.setEnabled(false);
            }
            else if (e.getSource() == poliwagButton) {
                playerPokemon.add(poliwag);
                allPokemon.remove(poliwag);
                poliwagButton.setEnabled(false);
            }
            if (playerPokemon.size() == 3) {
                curScreen++;
            }
        }
        else if (curScreen == 5) {
            if (e.getSource() == attackTopButton) {

            }
            else if (e.getSource() == attackMiddleButton) {

            }
            else if (e.getSource() == attackBottomButton) {

            }
            else if (e.getSource() == switchButton) {
                attackTopButton.setVisible(false);
                attackMiddleButton.setVisible(false);
                attackBottomButton.setVisible(false);

                switchOption1Button.setIcon(getIcon(playerPokemonList[0].name, "front"));
                switchOption1Button.setEnabled(false);
                switchOption1Button.setVisible(true);

                switchOption2Button.setIcon(getIcon(playerPokemonList[1].name, "front"));
                if (playerPokemonList[1].hasFainted) {
                    switchOption2Button.setEnabled(false);
                    switchOption2Button.setText("FAINTED");
                    switchOption2Button.setFont(new Font("DialogInput", Font.PLAIN, 30));
                    switchOption2Button.setIconTextGap(-170);
                }
                switchOption2Button.setVisible(true);

                switchOption3Button.setIcon(getIcon(playerPokemonList[2].name, "front"));
                if (playerPokemonList[2].hasFainted) {
                    switchOption3Button.setEnabled(false);
                    switchOption3Button.setText("FAINTED");
                    switchOption3Button.setFont(new Font("DialogInput", Font.PLAIN, 30));
                    switchOption3Button.setIconTextGap(-170);
                }
                switchOption3Button.setVisible(true);
                curScreen += 2;
            }
            else if (e.getSource() == healButton) {

            }
            else if (e.getSource() == menuButton) {
                trainerPokemonLabel.setVisible(false);
                trainerLabel.setVisible(false);
                rivalPokemonLabel.setVisible(false);
                rivalLabel.setVisible(false);
                attackTopButton.setVisible(false);
                attackMiddleButton.setVisible(false);
                attackBottomButton.setVisible(false);
                switchButton.setVisible(false);
                healButton.setVisible(false);
                menuButton.setVisible(false);

                exitMenuButton.setVisible(true);
                coverScreen.setBackground(new Color(200, 90, 90));
                coverScreen.setOpaque(true);
                coverScreen.setVisible(true);

                pokemon1.setIcon(getIcon(playerPokemonList[0].name, "front"));
                pokemon1.setVisible(true);
                pokemon2.setIcon(getIcon(playerPokemonList[1].name, "front"));
                pokemon2.setVisible(true);
                pokemon3.setIcon(getIcon(playerPokemonList[2].name, "front"));
                pokemon3.setVisible(true);
                if (playerPokemonList[0].hasFainted) {
                    pokemon1Stats.setText("STATUS: FAINTED");
                }
                else {
                    pokemon1Stats.setText("STATUS: HP-" + (playerPokemonList[0].HP) + " AP-" + (playerPokemonList[0].AP));
                }
                pokemon1Stats.setVisible(true);


                if (playerPokemonList[1].hasFainted) {
                    pokemon2Stats.setText("STATUS: FAINTED");
                }
                else {
                    pokemon2Stats.setText("STATUS: HP-" + (playerPokemonList[1].HP) + " AP-" + (playerPokemonList[1].AP));
                }
                pokemon2Stats.setVisible(true);


                if (playerPokemonList[2].hasFainted) {
                    pokemon3Stats.setText("STATUS: FAINTED");
                }
                else {
                    pokemon3Stats.setText("STATUS: HP-" + (playerPokemonList[2].HP) + " AP-" + (playerPokemonList[2].AP));
                }
                pokemon3Stats.setVisible(true);


                curScreen++;
            }
        }
        else if (curScreen == 6){ // menu screen
            coverScreen.setVisible(false);
            exitMenuButton.setVisible(false);
            pokemon1.setVisible(false);
            pokemon2.setVisible(false);
            pokemon3.setVisible(false);
            pokemon1Stats.setVisible(false);
            pokemon2Stats.setVisible(false);
            pokemon3Stats.setVisible(false);

            trainerPokemonLabel.setVisible(true);
            trainerLabel.setVisible(true);
            rivalPokemonLabel.setVisible(true);
            rivalLabel.setVisible(true);
            attackTopButton.setVisible(true);
            attackTopButton.setText(playerPokemonList[0].attacks[0].toUpperCase());
            attackMiddleButton.setVisible(true);
            attackMiddleButton.setText(playerPokemonList[0].attacks[1].toUpperCase());
            attackBottomButton.setVisible(true);
            attackBottomButton.setText(playerPokemonList[0].attacks[2].toUpperCase());
            switchButton.setVisible(true);
            healButton.setVisible(true);
            menuButton.setVisible(true);

            curScreen--; // going to 5
        }
        else if (curScreen == 7) { // switching pokemon
            if (e.getSource() == switchOption2Button) {
                playerPokemonList[0].switchPokemon(playerPokemonList, 1);
            }
            else if (e.getSource() == switchOption3Button){
                playerPokemonList[0].switchPokemon(playerPokemonList, 2);
            }
            System.out.print("After switching: ");
            System.out.print(playerPokemonList[0].name + ", ");
            System.out.print(playerPokemonList[1].name + ", ");
            System.out.println(playerPokemonList[2].name + ", ");

            attackTopButton.setText(playerPokemonList[0].attacks[0].toUpperCase());
            attackMiddleButton.setText(playerPokemonList[0].attacks[1].toUpperCase());
            attackBottomButton.setText(playerPokemonList[0].attacks[2].toUpperCase());

            switchOption1Button.setVisible(false);
            switchOption2Button.setVisible(false);
            switchOption3Button.setVisible(false);

            attackTopButton.setVisible(true);
            attackMiddleButton.setVisible(true);
            attackBottomButton.setVisible(true);

            trainerPokemonLabel.setIcon(getIcon(playerPokemonList[0].name, "back"));
            rivalPokemonLabel.setIcon(getIcon(CPUPokemon[0].name, "front"));

            curScreen -= 2; // going to 5
        }
    }

    public void updateScreenFive() {
        trainerPokemonLabel.setIcon(getIcon(playerPokemonList[0].name, "back"));
        trainerPokemonLabel.setVisible(true);
        trainerLabel.setVisible(true);
        rivalPokemonLabel.setIcon(getIcon(CPUPokemon[0].name, "front"));
        rivalPokemonLabel.setVisible(true);
        rivalLabel.setVisible(true);
        coverScreen.setVisible(false);

        attackTopButton.setVisible(true);
        attackTopButton.setText(playerPokemonList[0].attacks[0].toUpperCase());
        attackMiddleButton.setVisible(true);
        attackMiddleButton.setText(playerPokemonList[0].attacks[1].toUpperCase());
        attackBottomButton.setVisible(true);
        attackBottomButton.setText(playerPokemonList[0].attacks[2].toUpperCase());
        switchButton.setVisible(true);
        healButton.setVisible(true);
        menuButton.setVisible(true);
    }

    public ImageIcon getIcon(String name, String pkmDirection) {
        if (pkmDirection.equals("front")) {
            switch(name) {
                case "bulbasaur":
                    return bulbasaurFrontSmall;
                case "charmander":
                    return charmanderFrontSmall;
                case "squirtle":
                    return squirtleFrontSmall;
                case "bellsprout":
                    return bellsproutFrontSmall;
                case "ninetails":
                    return ninetailsFrontSmall;
                case "psyduck":
                    return psyduckFrontSmall;
                case "oddish":
                    return oddishFrontSmall;
                case "ponyta":
                    return ponytaFrontSmall;
                case "poliwag":
                    return poliwagFrontSmall;
            }
        }
        else {
            switch(name) {
                case "blubasaur":
                    return bulbasaurBack;
                case "charmander":
                    return charmanderBack;
                case "squirtle":
                    return squirtleBack;
                case "bellsprout":
                    return bellsproutBack;
                case "ninetails":
                    return ninetailsBack;
                case "psyduck":
                    return psyduckBack;
                case "oddish":
                    return oddishBack;
                case "ponyta":
                    return ponytaBack;
                case "poliwag":
                    return poliwagBack;
            }
        }
        return bulbasaurBack;
    }

    // animation ==============================================================================>
    @Override
    public void windowOpened(WindowEvent e) {
        Thread animation = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    if (curScreen == 0) {
                        if (x1 <= 180) {
                            welcome.setVisible(true);
                        }
                        else {
                            welcome.setVisible(false);
                        }
                    }
                    else if (curScreen == 1) {
                        if (welcome.isVisible()) welcome.setVisible(false);

                    }
                    if (curScreen == 2) {
                        bulbasaurButton.setLocation(350, (int) (175 + (Math.sin(x1 * (Math.PI / 180)) * 3)));
                        charmanderButton.setLocation(600, (int) (175 + (Math.sin(x2 * (Math.PI / 180)) * 3)));
                        squirtleButton.setLocation(850, (int) (175 + (Math.sin(x3 * (Math.PI / 180)) * 3)));
                        bellsproutButton.setLocation(350, (int) (425 + (Math.sin(x4 * (Math.PI / 180)) * 3)));
                        ninetailsButton.setLocation(600, (int) (425 + (Math.sin(x5 * (Math.PI / 180)) * 3)));
                        psyduckButton.setLocation(850, (int) (425 + (Math.sin(x6 * (Math.PI / 180)) * 3)));
                        oddishButton.setLocation(350, (int) (675 + (Math.sin(x7 * (Math.PI / 180)) * 3)));
                        ponytaButton.setLocation(600, (int) (675 + (Math.sin(x8 * (Math.PI / 180)) * 3)));
                        poliwagButton.setLocation(850, (int) (675 + (Math.sin(x9 * (Math.PI / 180)) * 3)));
                    }
                    if (curScreen == 3) {
                        bulbasaurButton.setEnabled(false);
                        charmanderButton.setEnabled(false);
                        squirtleButton.setEnabled(false);
                        bellsproutButton.setEnabled(false);
                        ninetailsButton.setEnabled(false);
                        psyduckButton.setEnabled(false);
                        oddishButton.setEnabled(false);
                        ponytaButton.setEnabled(false);
                        poliwagButton.setEnabled(false);
                        coverScreen.setVisible(true);
                        coverScreen.setBackground(new Color(fadeOut, fadeOut, fadeOut));
                        fadeOut--;
                        if (fadeOut == 0) {
                            bulbasaurButton.setVisible(false);
                            charmanderButton.setVisible(false);
                            squirtleButton.setVisible(false);
                            bellsproutButton.setVisible(false);
                            ninetailsButton.setVisible(false);
                            psyduckButton.setVisible(false);
                            oddishButton.setVisible(false);
                            ponytaButton.setVisible(false);
                            poliwagButton.setVisible(false);
                            statsTop.setVisible(false);
                            statsMiddle.setVisible(false);
                            statsBottom.setVisible(false);
                            curScreen++;
                        }
                    }
                    if (curScreen == 4) {
                        fadeOut++;
                        coverScreen.setBackground(new Color(fadeOut, fadeOut, fadeOut));
                        if (fadeOut == 255) {
                            for (int i = 0; i < 3; i++) {
                                playerPokemonList[i] = playerPokemon.get(i);
                            }
                            int rand;
                            for (int i = 0; i < 3; i++) {
                                rand = (int) (Math.random() * (allPokemon.size()));
//                                System.out.println(rand);
//                                System.out.println(allPokemon.get(rand).name);
                                CPUPokemon[i] = allPokemon.get(rand);
                                allPokemon.remove(rand);
                            }
                            updateScreenFive();
                            curScreen++; // going to 5
                        }
                    }
                    if (curScreen == 5) {
                        trainerLabel.setLocation(120, (int) (675 + (Math.sin(x1 * (Math.PI / 180)) * 3)));
                        trainerPokemonLabel.setLocation(550, (int) (675 + (Math.sin(x2 * (Math.PI / 180)) * 3)));

                        rivalLabel.setLocation(1000, (int) (300 + (Math.sin(x5 * (Math.PI / 180)) * 3)));
                        rivalPokemonLabel.setLocation(800, (int) (400 + (Math.sin(x6 * (Math.PI / 180)) * 3)));

                        attackTopButton.setLocation(50, (int) (50 + (Math.sin(x7 * (Math.PI / 180)) * 3)));
                        attackMiddleButton.setLocation(50, (int) (225 + (Math.sin(x8 * (Math.PI / 180)) * 3)));
                        attackBottomButton.setLocation(50, (int) (400 + (Math.sin(x9 * (Math.PI / 180)) * 3)));

                        switchButton.setLocation(1050, (int) (700 + (Math.sin(x7 * (Math.PI / 180)) * 3)));
                        healButton.setLocation(1050, (int) (800 + (Math.sin(x8 * (Math.PI / 180)) * 3)));
                        menuButton.setLocation(1050, (int) (900 + (Math.sin(x9 * (Math.PI / 180)) * 3)));
                    }
                    if (curScreen == 7) {
                        trainerLabel.setLocation(120, (int) (675 + (Math.sin(x1 * (Math.PI / 180)) * 3)));
                        trainerPokemonLabel.setLocation(550, (int) (675 + (Math.sin(x2 * (Math.PI / 180)) * 3)));

                        rivalLabel.setLocation(1000, (int) (300 + (Math.sin(x5 * (Math.PI / 180)) * 3)));
                        rivalPokemonLabel.setLocation(800, (int) (400 + (Math.sin(x6 * (Math.PI / 180)) * 3)));

                        switchOption1Button.setLocation(50, (int) (50 + (Math.sin(x7 * (Math.PI / 180)) * 3)));
                        switchOption2Button.setLocation(275, (int) (50 + (Math.sin(x8 * (Math.PI / 180)) * 3)));
                        switchOption3Button.setLocation(500, (int) (50 + (Math.sin(x9 * (Math.PI / 180)) * 3)));

                        switchButton.setLocation(1050, (int) (700 + (Math.sin(x7 * (Math.PI / 180)) * 3)));
                        healButton.setLocation(1050, (int) (800 + (Math.sin(x8 * (Math.PI / 180)) * 3)));
                        menuButton.setLocation(1050, (int) (900 + (Math.sin(x9 * (Math.PI / 180)) * 3)));
                    }
                    if (x1 == 360) x1 = 0;
                    if (x2 == 360) x2 = 0;
                    if (x3 == 360) x3 = 0;
                    if (x4 == 360) x4 = 0;
                    if (x5 == 360) x5 = 0;
                    if (x6 == 360) x6 = 0;
                    if (x7 == 360) x7 = 0;
                    if (x8 == 360) x8 = 0;
                    if (x9 == 360) x9 = 0;
                    x1++;
                    x2++;
                    x3++;
                    x4++;
                    x5++;
                    x6++;
                    x7++;
                    x8++;
                    x9++;
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        animation.start();
    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        
    }
}
