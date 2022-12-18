/*
* File: ButtonPanel.java
* Author: Serényi Ödön
* Copyright: 2022, Serényi Ödön
* Group: Szoft II N
* Date: 2022-12-18
* Github: https://github.com/OneBoyTwoGirl/
* Licenc: GNU GPL
*/
package views;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel{
    public JButton calcButton;
    public JButton aboutButton;

    public ButtonPanel() {
        calcButton = new JButton("Számítás");
        aboutButton = new JButton("Készítő és adatok");
        addComponents();
    }
    public void addComponents() {
        add(this.calcButton);
        add(this.aboutButton);
}

    

    
}
