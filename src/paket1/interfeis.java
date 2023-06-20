package paket1;
import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.*;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import paket1.game.ChoiceHandler;

public class interfeis {
	JFrame window;
	JPanel titleNamePanel, startButtonPanel,mainTextPanel,choiceButtonPanel,playerPanel;
	JLabel titleNameLabel,hplabel,hpNumberLabel,weaponLabel,weaponNameLabel;
	JButton starButton,choice1,choice2,choice3,choice4;
	JTextArea mainTextArea;
	Font titleFont = new Font("Times New Roman",Font.PLAIN,90);
	Font normalFont = new Font("Times New Roman",Font.PLAIN,26);
/**
 * @wbp.parser.entryPoint
 */
public void createUI(ChoiceHandler cHandler) {
	//towa e prozoreca
	window = new JFrame();
	window.setSize(800,600);
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.getContentPane().setBackground(Color.black);
	window.getContentPane().setLayout(null);
	window.setVisible(true);
	//zaglawna stranica
	titleNamePanel = new JPanel();
	titleNamePanel.setBounds(100,100,600,500);
	titleNamePanel.setBackground(Color.black);
	titleNameLabel = new JLabel("Походът на Делтора");
	titleNameLabel.setForeground(Color.white);
	titleNameLabel.setFont(new Font("Times New Roman", Font.PLAIN, 65));
	titleNamePanel.add(titleNameLabel);
	 
	startButtonPanel = new JPanel();
	startButtonPanel.setBounds(500,400,200,100);
	startButtonPanel.setBackground(Color.black);
	starButton = new JButton("Започни");
	starButton.setBackground(Color.black);
	starButton.setForeground(Color.white);
	starButton.setFont(normalFont);
	starButton.setFocusPainted(false);
	starButton.addActionListener(cHandler);
	starButton.setActionCommand("Започни");
	startButtonPanel.add(starButton);
	
	
	 window.getContentPane().add(titleNamePanel);
	 window.getContentPane().add(startButtonPanel);
	 
	 //ekran za igrata
	 mainTextPanel = new JPanel();
	 mainTextPanel.setBounds(100,100,600,250);
	 mainTextPanel.setBackground(Color.black);
	 window.getContentPane().add(mainTextPanel);
	 
	 mainTextArea = new JTextArea("BLABLABLA");
	 mainTextArea.setBounds(100,100,600,250);
	 mainTextArea.setBackground(Color.black);
	 mainTextArea.setForeground(Color.white);
	 mainTextArea.setFont(normalFont);
	 mainTextArea.setLineWrap(true);
	 mainTextArea.setWrapStyleWord(true);
	 mainTextArea.setEditable(false);
	 mainTextPanel.add(mainTextArea);

	 choiceButtonPanel = new JPanel();
	 choiceButtonPanel.setBounds(250,350,300,150);
	 choiceButtonPanel.setBackground(Color.black);
	 choiceButtonPanel.setLayout(new GridLayout(4,1));
	 window.getContentPane().add(choiceButtonPanel);
	 
	 choice1=new JButton("choice1");
	 choice1.setBackground(Color.black);
	 choice1.setForeground(Color.white);
	 choice1.setFont(normalFont);
	 choice1.setFocusPainted(false);
	 choice1.addActionListener(cHandler);
	 choice1.setActionCommand("c1");
	 choiceButtonPanel.add(choice1);
	 choice2=new JButton("choice2");
	 choice2.setBackground(Color.black);
	 choice2.setForeground(Color.white);
	 choice2.setFont(normalFont);
	 choice2.setFocusPainted(false);
	 choice2.addActionListener(cHandler);
	 choice2.setActionCommand("c2");
	 choiceButtonPanel.add(choice2);
	 choice3=new JButton("choice3");
	 choice3.setBackground(Color.black);
	 choice3.setForeground(Color.white);
	 choice3.setFont(normalFont);
	 choice3.setFocusPainted(false);
	 choice3.addActionListener(cHandler);
	 choice3.setActionCommand("c3");
	 choiceButtonPanel.add(choice3);
	 choice4=new JButton("choice4");
	 choice4.setBackground(Color.black);
	 choice4.setForeground(Color.white);
	 choice4.setFont(normalFont);
	 choice4.setFocusPainted(false);
	 choice4.addActionListener(cHandler);
	 choice4.setActionCommand("c4");
	 choiceButtonPanel.add(choice4);
	 
	  playerPanel = new JPanel();
	  playerPanel.setBounds(100,15,600,50);
	  playerPanel.setBackground(Color.black);
	  playerPanel.setLayout(new GridLayout(1,4));
	  window.getContentPane().add(playerPanel);
	  
	  hplabel=new JLabel("Живот:");
	  hplabel.setFont(normalFont);
	  hplabel.setForeground(Color.white);
	  playerPanel.add(hplabel);
	  hpNumberLabel=new JLabel();
	  hpNumberLabel.setHorizontalAlignment(SwingConstants.CENTER);
	  hpNumberLabel.setForeground(Color.white);
	  hpNumberLabel.setFont(normalFont);
	  playerPanel.add(hpNumberLabel);
	  weaponLabel = new JLabel("Оръжие:");
	  weaponLabel.setForeground(Color.white);
	  weaponLabel.setFont(normalFont);
	  playerPanel.add(weaponLabel);
	  weaponNameLabel=new JLabel();
	  weaponNameLabel.setForeground(Color.white);
	  weaponNameLabel.setFont(normalFont);
	  playerPanel.add(weaponNameLabel);
	  
	  
	  
	  
	 
window.setVisible(true);
	 
	
}

}
