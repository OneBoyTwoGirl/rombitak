/*
* File: TitlePanel.java
* Author: Serényi Ödön
* Copyright: 2022, Serényi Ödön
* Group: Szoft II N
* Date: 2022-12-18
* Github: https://github.com/OneBoyTwoGirl/
* Licenc: GNU GPL
*/

package views;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;



public class TitlePanel extends JPanel {
    JLabel mainLabel;

    public TitlePanel() {
        this.mainLabel = new JLabel("Rombusz kerülete és területe");        
        this.mainLabel.setFont(new Font("Sans serif", Font.BOLD, 25));
        this.mainLabel.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(this.mainLabel);
    }
    
}