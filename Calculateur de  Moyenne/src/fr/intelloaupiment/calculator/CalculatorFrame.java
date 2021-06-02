package fr.intelloaupiment.calculator;

import static fr.theshark34.swinger.Swinger.*;

import javax.swing.JFrame;

import fr.theshark34.swinger.util.WindowMover;



@SuppressWarnings("serial")
public class CalculatorFrame extends JFrame {
	
	private static CalculatorFrame instance;
	private CalculatorPanel calculatorPanel;
	
	public CalculatorFrame() {
		this.setTitle("Calculateur de Moyenne / 4 /");
		this.setSize(975, 720);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setUndecorated(true);
		this.setIconImage(getResource("icon.png"));
		this.setContentPane(calculatorPanel = new CalculatorPanel());
		
		
		
		WindowMover mover = new WindowMover(this);
        this.addMouseListener(mover);
        this.addMouseMotionListener(mover);

		
		
		
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		setSystemLookNFeel();
		setResourcePath("/fr/intelloaupiment/calculator/resources");
		
		instance = new CalculatorFrame();

	}

    public static CalculatorFrame getInstance() {
    	return instance;
    }	
	
    public CalculatorPanel getCalculatorPanel() {
    	return this.calculatorPanel;
    }
}
