package fr.intelloaupiment.calculator;

import static fr.theshark34.swinger.Swinger.*;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


import fr.theshark34.swinger.event.SwingerEvent;
import fr.theshark34.swinger.event.SwingerEventListener;
import fr.theshark34.swinger.textured.STexturedButton;

@SuppressWarnings("serial")
public class CalculatorPanel extends JPanel implements SwingerEventListener {
	
	private STexturedButton calculateButton = new STexturedButton(getResource("calculate.png"));
	
	private Image background =  getResource("background.png");
	
	private JTextField passmark1 = new JTextField();
	private JTextField passmark2 = new JTextField();
	private JTextField passmark3 = new JTextField();
	private JTextField passmark4 = new JTextField();
	
	
	
	private JLabel passmark = new JLabel("Moyenne : 00");
	
	private STexturedButton hideButton = new STexturedButton(getResource("hide.png"));
	
	private STexturedButton quitButton = new STexturedButton(getResource("quit.png"));
	
    public CalculatorPanel() {
    	
    	
    	
    	this.setLayout(null);
    	
    	
    	passmark1.setOpaque(false);
    	passmark1.setCaretColor(Color.GREEN);
    	passmark1.setBorder(null);
    	passmark1.setForeground(Color.GREEN);
    	passmark1.setFont(getFont().deriveFont(20F));
    	passmark1.setBounds(661, 181, 173, 43);
    	this.add(passmark1);
    	
    	passmark2.setOpaque(false);
    	passmark2.setCaretColor(Color.GREEN);
    	passmark2.setBorder(null);
    	passmark2.setForeground(Color.GREEN);
    	passmark2.setFont(getFont().deriveFont(20F));
    	passmark2.setBounds(661, 233, 173, 43);
    	this.add(passmark2);
    	
    	passmark3.setOpaque(false);
    	passmark3.setCaretColor(Color.GREEN);
    	passmark3.setBorder(null);
    	passmark3.setForeground(Color.GREEN);
    	passmark3.setFont(getFont().deriveFont(20F));
    	passmark3.setBounds(661, 283, 173, 43);
    	this.add(passmark3);
    	
    	passmark4.setOpaque(false);
    	passmark4.setCaretColor(Color.GREEN);
    	passmark4.setBorder(null);
    	passmark4.setForeground(Color.GREEN);
    	passmark4.setFont(getFont().deriveFont(20F));
    	passmark4.setBounds(661, 333, 173, 43);
    	this.add(passmark4);
    	
    	passmark1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                     e.consume();  // ignorer l'événement
                }
            }
         });
    	
    	passmark2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                     e.consume();  // ignorer l'événement
                }
            }
         });
    	
    	passmark3.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                     e.consume();  // ignorer l'événement
                }
            }
         });
    	
    	passmark4.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                     e.consume();  // ignorer l'événement
                }
            }
         });
    	
    	passmark.setFont(getFont().deriveFont(30F));
    	passmark.setBounds(400, 550, 902,53);
    	this.add(passmark);
    	
    	calculateButton.setBounds(340, 598);
    	calculateButton.addEventListener(this);
    	this.add(calculateButton);
    	
    	hideButton.setBounds(65, 0);
    	hideButton.addEventListener(this);
    	
    	this.add(hideButton);
    	
    	quitButton.setBounds(0, 0);
    	quitButton.addEventListener(this);
    	this.add(quitButton);
    	
    	
    	
    	
    	
    }
    
    
  
	
   
    public void onEvent(SwingerEvent e) {
    	if(e.getSource() == calculateButton) {
    		;
			
    	String passmarktotal1 = passmark1.getText();
    	String passmarktotal2 = passmark2.getText();
    	String passmarktotal3 = passmark3.getText();
    	String passmarktotal4 = passmark4.getText();
    	
    	int passmarktotali1 =Integer.parseInt(passmarktotal1);  
    	int passmarktotali2 =Integer.parseInt(passmarktotal2);  
    	int passmarktotali3 =Integer.parseInt(passmarktotal3);  
    	int passmarktotali4 =Integer.parseInt(passmarktotal4);  
    	
    	int passmarkultimate= (passmarktotali1 + passmarktotali2 + passmarktotali3 + passmarktotali4) / 4;
    	
      	passmark.setText("Moyenne : "  +passmarkultimate);
    		
			
    		
    	} 
    	
    	
    	
    
    	
    
    
    
 if(e.getSource() == quitButton) {
	CalculatorFrame.getInstance().setState(JFrame.ICONIFIED);
	System.exit(0); }
	
 if(e.getSource() == hideButton) {
	CalculatorFrame.getInstance().setState(JFrame.ICONIFIED);}
}
    
	
    
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawImage(background, 0, 0, this.getWidth(), this.getHeight(), this);
	}

	
	
	
}
