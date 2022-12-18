/*
* File: MainWindow.java
* Author: Serényi Ödön
* Copyright: 2022, Serényi Ödön
* Group: Szoft II N
* Date: 2022-12-18
* Github: https://github.com/OneBoyTwoGirl/
* Licenc: GNU GPL
*/
package views;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MainWindow extends JFrame{

    TitlePanel titlePanel;
    public AvaluePanel avaluePanel;
    public AlphaPanel alphaPanel;
    public VolumePanel volumePanel;
    public AreaPanel areaPanel;
    public ButtonPanel buttonsPanel;
    public JButton aboutButton;

    public MainWindow(){
        this.titlePanel = new TitlePanel(); 
        this.avaluePanel = new AvaluePanel();
        this.alphaPanel = new AlphaPanel();
        this.volumePanel = new VolumePanel();
        this.areaPanel = new AreaPanel();
        this.buttonsPanel = new ButtonPanel();

        this.initWindow();
    }
    public void initWindow(){
    this.setTitle("rombitak"); 
    this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
    this.addComponent();
    this.pack();
    this.setVisible(true);
    

    }
    public void addComponent(){
        this.add(this.titlePanel);
        this.add(this.avaluePanel);
        this.add(this.alphaPanel);
        this.add(this.buttonsPanel);
        this.add(this.volumePanel);
        this.add(this.areaPanel);
    }
}