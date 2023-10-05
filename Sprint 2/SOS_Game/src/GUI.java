import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class GUI extends JFrame implements ActionListener {
	private Board board;
	
	//Declarations
	JFrame frame = new JFrame();
	JPanel buttonPanel = new JPanel();
	
	//Title Declarations
	JPanel titlePanel = new JPanel();
	JLabel textfield = new JLabel();
	JLabel modeText = new JLabel();
	JRadioButton general = new JRadioButton("General");
	JRadioButton simple = new JRadioButton("Simple");
	
	//Blue Player Declarations
	JPanel p1Panel = new JPanel();
	JLabel playerNameB = new JLabel("Blue Player");
	JRadioButton p1S = new JRadioButton("S");
	JRadioButton p1O = new JRadioButton("O");
	
	//Red PLayer Declarations
	JPanel p2Panel = new JPanel();
	JLabel playerNameR = new JLabel("Red Player");
	JRadioButton p2S = new JRadioButton("S");
	JRadioButton p2O = new JRadioButton("O");
	
	//Footer Declarations
	JPanel footerPanel = new JPanel();
	JLabel sizeLabel = new JLabel("Choose Size: ");
	JSpinner sizeSet = new JSpinner(new SpinnerNumberModel(3, 3, 10, 1)); 
	JLabel turnDisplay = new JLabel("Current Turn: ");
	JButton newGameBTN = new JButton("New Game");
	
	//Grid Declarations
	int gridSize = (int) sizeSet.getValue();
	int numOfCells = gridSize * gridSize;
	JButton[] buttons = new JButton[numOfCells];
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==newGameBTN) { //Resizes Grid
			destroyGrid();
			gridSize = (int) sizeSet.getValue();
			numOfCells = gridSize * gridSize;
			makeGrid();
		}
	}
	
	//Grid Creator
	public void makeGrid() {
		buttonPanel.setLayout(new GridLayout(gridSize, gridSize));
		//buttonPanel.setBackground(Color.BLACK);
		for (int i = 0; i < numOfCells; i++) {
			buttons[i] = new JButton();
			buttonPanel.add(buttons[i]);
			buttons[i].setFont(new Font("Monospaced", Font.PLAIN, 120));
			buttons[i].setFocusable(false);
			buttons[i].addActionListener(this);
		}
		buttonPanel.setOpaque(true);
	}
	//Grid Destroyer
	public void destroyGrid() {
		buttonPanel.removeAll();
		buttonPanel.revalidate();
		buttonPanel.repaint();
	}
	
	public GUI(Board board) {
		this.board = board;
		
		//Frame Settings
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setLayout(new BorderLayout());
		frame.setTitle("SOS");
		frame.setVisible(true); 
		
		//Text Label for Title
		textfield.setBackground(Color.BLACK);
		textfield.setForeground(Color.WHITE);
		textfield.setFont(new Font("Monospaced", Font.BOLD, 75));
		textfield.setHorizontalAlignment(JLabel.CENTER);
		textfield.setText("SOS");
		textfield.setOpaque(true);
		
		//Mode Selection for Title
		modeText.setBackground(Color.LIGHT_GRAY);
		modeText.setForeground(Color.WHITE);
		modeText.setHorizontalAlignment(JLabel.CENTER);
		modeText.setFont(new Font("Monospaced", Font.BOLD, 25));
		modeText.setText("Choose Mode");
		modeText.setOpaque(true);
		
		
		//Title
		titlePanel.setLayout(new GridLayout(1, 4));
		titlePanel.setBounds(0, 0, 600, 100);
		titlePanel.add(textfield);
		titlePanel.add(modeText);
		titlePanel.add(simple);
		titlePanel.add(general);
		
		makeGrid();
		
		//P1 Panel
		p1Panel.setLayout(new GridLayout(3,1));
		playerNameB.setFont(new Font("Monospaced", Font.BOLD, 20));
		p1Panel.add(playerNameB);
		p1Panel.add(p1S);
		p1Panel.add(p1O);
		p1Panel.setOpaque(true);
		
		//P2 Panel
		p2Panel.setLayout(new GridLayout(3,1));
		playerNameR.setFont(new Font("Monospaced", Font.BOLD, 20));
		p2Panel.add(playerNameR);
		p2Panel.add(p2S);
		p2Panel.add(p2O);
		p2Panel.setOpaque(true);
		
		//Footer Panel.
		footerPanel.setLayout(new GridLayout(1, 4));
		sizeLabel.setFont(new Font("Monospaced", Font.BOLD, 22));
		footerPanel.add(sizeLabel);
		//sizeSet.setPreferredSize(new Dimension(20, 24));
		footerPanel.add(sizeSet);
		turnDisplay.setFont(new Font("Monospaced", Font.PLAIN, 15));
		footerPanel.add(turnDisplay);
		footerPanel.add(newGameBTN);
		newGameBTN.addActionListener(this);
		
		//Items on Frame.
		frame.add(titlePanel, BorderLayout.PAGE_START);
		frame.add(p1Panel, BorderLayout.LINE_START);
		frame.add(p2Panel, BorderLayout.LINE_END);
		frame.add(buttonPanel);
		frame.add(footerPanel, BorderLayout.PAGE_END);
	}
	
	public Board getBoard() {
		return board;
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new GUI(new Board()); 
			}
		});
	}
}
