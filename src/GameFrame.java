
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import java.awt.GridLayout;
import java.awt.Dimension;

public class GameFrame extends JFrame
{
	
	
	private JTextField txtFieldMapTitle;
	private JTextField textFieldDamage;
	private JTextField textField_1;
	private JPanel contentPane;
	
	//================== CONTAINERS ===================|
	
	JPanel mapContainer = new JPanel();
	JPanel commandContainer = new JPanel();
	JPanel navContainer = new JPanel();
	JPanel roomPanel = new JPanel();
	JPanel puzzleContainer = new JPanel();
	JPanel inventory = new JPanel();
	JPanel consoleContainer = new JPanel();
	JPanel playerContainer = new JPanel();
	JPanel actionContainer = new JPanel();
	
	
	//================== LABELS ========================|
	JLabel mapBox = new JLabel("");
	JLabel lblPlayerHp = new JLabel("Player Health");
	JLabel lblDamage = new JLabel("Damage");

	
	//================== TEXT AREA =====================|
	
	JTextArea textAreaItemDetails = new JTextArea();
	JTextArea txtGuiConsolePrintout = new JTextArea();
	
	//================== BUTTONS ======================|
	JButton btnSaveGame = new JButton("Save Game");
	JButton btnLoadGame = new JButton("Load Game");
	JButton btnHelp = new JButton("Help");
	JButton btnExit = new JButton("Exit Game");
	JButton btnNorth = new JButton("");
	JButton btnWest = new JButton("");
	JButton btnEast = new JButton("");
	JButton btnSouth = new JButton("");
	JButton btnFloorUp = new JButton("");
	JButton btnFloorDown = new JButton("");
	JButton btnEnterRoom = new JButton("Enter");
	JButton btnExamineRoom = new JButton("Examine");
	JButton btnSearchRoom = new JButton("Search");
	JButton btnExitRoom = new JButton("Exit Room");
	JButton btnPickup = new JButton("Pickup");
	JButton btnDrop = new JButton("Drop");
	JButton btnEquip = new JButton("Equip");
	JButton btnUnequip = new JButton("UnEquip");
	JButton btnUseItem = new JButton("Use");
	JButton btnAttack = new JButton("Attack");
	JButton btnFlee = new JButton("Flee");
	JButton btnExaminePuzzle = new JButton("Examine Puzzle");
	JButton btnHint = new JButton("Hint");
	JButton btnSolvePuzzle = new JButton("Solve Puzzle");
	JButton btnQuitPuzzle = new JButton("Quit Puzzle");
	JButton btnExamineMonster = new JButton("Examine \r\nMonster");
	
	//=======================================================
	JScrollPane scrollPane = new JScrollPane();

	JProgressBar progressBarHealth = new JProgressBar();

	
	
	
	public GameFrame()
	{
		Frame frame = new Frame();
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		/*
		 * ===================================================================================================|
		 *                                                                            GUI CONSOLE CONTAINER
		 * ===================================================================================================|
		 */
		
		consoleContainer.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		consoleContainer.setBounds(10, 11, 807, 450);
		consoleContainer.setLayout(null);
		
		
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 11, 787, 428);
		consoleContainer.add(scrollPane);
		
		
		txtGuiConsolePrintout.setText("");
		txtGuiConsolePrintout.setLineWrap(true);
		txtGuiConsolePrintout.setWrapStyleWord(true);
		scrollPane.setViewportView(txtGuiConsolePrintout);
		
		
		/*
		 * ===================================================================================================|
		 *                                                                                      PLAYER CONTAINER 
		 * ===================================================================================================|
		 */
		
		playerContainer.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		playerContainer.setBounds(10, 472, 503, 321);
		playerContainer.setLayout(null);
		
		
		lblPlayerHp.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPlayerHp.setBounds(30, 21, 115, 48);
		playerContainer.add(lblPlayerHp);
		
	
		progressBarHealth.setBackground(new Color(139, 0, 0));
		progressBarHealth.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		progressBarHealth.setValue(85);
		progressBarHealth.setStringPainted(true);
		progressBarHealth.setForeground(new Color(0, 100, 0));
		progressBarHealth.setBounds(155, 34, 232, 20);
		playerContainer.add(progressBarHealth);
		
		
		lblDamage.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDamage.setHorizontalAlignment(SwingConstants.CENTER);
		lblDamage.setBounds(408, 11, 79, 20);
		playerContainer.add(lblDamage);
		
		textFieldDamage = new JTextField();
		textFieldDamage.setForeground(new Color(0, 0, 255));
		textFieldDamage.setText("65");
		textFieldDamage.setEditable(false);
		textFieldDamage.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		textFieldDamage.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldDamage.setFont(new Font("Tahoma", Font.BOLD, 15));
		textFieldDamage.setBounds(407, 34, 80, 29);
		playerContainer.add(textFieldDamage);
		textFieldDamage.setColumns(10);
		
		
		inventory.setPreferredSize(new Dimension(15, 15));
		inventory.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		inventory.setBounds(10, 68, 399, 189);
		playerContainer.add(inventory);
		inventory.setLayout(new GridLayout(0, 6, 1, 1));
		
		textAreaItemDetails.setEditable(false);
		textAreaItemDetails.setText("Here goes Item Details");
		textAreaItemDetails.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		textAreaItemDetails.setBounds(10, 263, 483, 47);
		playerContainer.add(textAreaItemDetails);
		
		
		btnPickup.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPickup.setBounds(414, 67, 79, 35);
		btnPickup.setActionCommand("PickupButton");
		playerContainer.add(btnPickup);
		
		
		btnDrop.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDrop.setBounds(414, 105, 79, 35);
		btnDrop.setActionCommand("DropButton");
		playerContainer.add(btnDrop);
		
		
		btnEquip.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEquip.setBounds(414, 143, 79, 35);
		btnEquip.setActionCommand("EquipButton");
		playerContainer.add(btnEquip);
		
		
		btnUnequip.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnUnequip.setBounds(414, 180, 79, 35);
		btnUnequip.setActionCommand("UnequipButton");
		playerContainer.add(btnUnequip);
		
		
		btnUseItem.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnUseItem.setBounds(414, 219, 79, 35);
		btnUseItem.setActionCommand("UseItemButton");
		playerContainer.add(btnUseItem);
		
		/*
		 * ===================================================================================================|
		 *                                                                                      NAV CONTAINER
		 * ===================================================================================================|
		 */
		
		
		navContainer.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		navContainer.setBounds(820, 571, 353, 222);

		navContainer.setLayout(null);
		
	
		btnNorth.setIcon(new ImageIcon("Icons/arrow_up.png"));
		btnNorth.setBounds(59, 15, 50, 50);
		btnNorth.setActionCommand("NorthButton");
		navContainer.add(btnNorth);
		
		
		btnWest.setIcon(new ImageIcon("Icons/arrow_left.png"));
		btnWest.setBounds(10, 65, 50, 50);
		btnWest.setActionCommand("WestButton");
		navContainer.add(btnWest);
		
		
		btnEast.setIcon(new ImageIcon("Icons/arrow_right.png"));
		btnEast.setBounds(108, 65, 50, 50);
		btnEast.setActionCommand("EastButton");
		navContainer.add(btnEast);
		
		
		btnSouth.setIcon(new ImageIcon("Icons/arrow_down.png"));
		btnSouth.setBounds(59, 115, 50, 50);
		btnSouth.setActionCommand("SouthButton");
		navContainer.add(btnSouth);
		
		
		
		btnFloorUp.setIcon(new ImageIcon("Icons/Stairs_up.png"));
		btnFloorUp.setBounds(217, 15, 75, 75);
		btnFloorUp.setActionCommand("FloorUpButton");
		navContainer.add(btnFloorUp);
		
		
		btnFloorDown.setIcon(new ImageIcon("Icons/Stairs_down.png"));
		btnFloorDown.setBounds(217, 90, 75, 75);
		btnFloorDown.setActionCommand("FloorDownButton");
		navContainer.add(btnFloorDown);
		
		
		roomPanel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		roomPanel.setBounds(5, 170, 340, 41);
		navContainer.add(roomPanel);
		

		btnEnterRoom.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEnterRoom.setActionCommand("EnterRoomButton");
		roomPanel.add(btnEnterRoom);
		
		
		btnExamineRoom.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExamineRoom.setActionCommand("ExamineRoomButton");
		roomPanel.add(btnExamineRoom);
		
		
		btnSearchRoom.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSearchRoom.setActionCommand("SearchButton");
		roomPanel.add(btnSearchRoom);
		
		
		btnExitRoom.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExitRoom.setActionCommand("ExitRoomButton");
		roomPanel.add(btnExitRoom);
		
		actionContainer.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		actionContainer.setBounds(523, 472, 294, 321);

		actionContainer.setLayout(null);
		
		
		btnAttack.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAttack.setBounds(10, 52, 129, 37);
		btnAttack.setActionCommand("AttackButton");
		actionContainer.add(btnAttack);
		
		
		btnFlee.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnFlee.setBounds(155, 52, 129, 37);
		btnFlee.setActionCommand("FleeButton");
		actionContainer.add(btnFlee);
		
		
		puzzleContainer.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		puzzleContainer.setBounds(10, 100, 274, 210);
		actionContainer.add(puzzleContainer);
		puzzleContainer.setLayout(null);
		
		
		btnExaminePuzzle.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExaminePuzzle.setBounds(10, 11, 128, 36);
		btnExaminePuzzle.setActionCommand("ExaminePuzzle");
		puzzleContainer.add(btnExaminePuzzle);
		
		
		btnHint.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnHint.setBounds(148, 11, 116, 36);
		btnHint.setActionCommand("HintButton");
		puzzleContainer.add(btnHint);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setBounds(62, 58, 155, 53);
		puzzleContainer.add(textField_1);
		textField_1.setColumns(10);
		
		
		btnSolvePuzzle.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSolvePuzzle.setBounds(50, 115, 179, 23);
		btnSolvePuzzle.setActionCommand("SolvePuzzleButton");
		puzzleContainer.add(btnSolvePuzzle);
		
		
		btnQuitPuzzle.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnQuitPuzzle.setBounds(80, 149, 116, 36);
		btnQuitPuzzle.setActionCommand("QuitPuzzleButton");
		puzzleContainer.add(btnQuitPuzzle);
		
		
		btnExamineMonster.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExamineMonster.setBounds(48, 11, 200, 37);
		btnExamineMonster.setActionCommand("ExamineMonsterButton");
		actionContainer.add(btnExamineMonster);
		
		
		/*
		 * ===================================================================================================|
		 *                                                                                      COMMAND CONTAINER
		 * ===================================================================================================|
		 */
		commandContainer.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		commandContainer.setBounds(1183, 571, 144, 222);
		commandContainer.setLayout(null);
		
		
		btnSaveGame.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSaveGame.setBounds(10, 11, 126, 40);
		btnSaveGame.setActionCommand("SaveGameButton");
		commandContainer.add(btnSaveGame);
		
		
		btnLoadGame.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLoadGame.setBounds(10, 62, 126, 40);
		btnLoadGame.setActionCommand("LoadGameButton");
		commandContainer.add(btnLoadGame);
		
		
		btnHelp.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnHelp.setBounds(10, 113, 126, 40);
		btnHelp.setActionCommand("HelpButton");
		commandContainer.add(btnHelp);
		
		
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExit.setBounds(10, 164, 126, 40);
		btnExit.setActionCommand("ExitButton");
		commandContainer.add(btnExit);
		
				
		/*
		 * ===================================================================================================|
		 *                                                                                      MAP CONTAINER
		 * ===================================================================================================|
		 */
		
		mapContainer.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		mapContainer.setBounds(827, 60, 500, 500);
		mapContainer.setLayout(null);
		mapBox.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		mapBox.setIcon(new ImageIcon("C:\\Users\\Natanael Nistor\\Desktop\\GameMap001 500500.png"));
		mapBox.setHorizontalAlignment(SwingConstants.CENTER);
		mapBox.setBounds(0, 0, 500, 500);
		mapContainer.add(mapBox);
		
		txtFieldMapTitle = new JTextField();
		txtFieldMapTitle.setEditable(false);
		txtFieldMapTitle.setBorder(new LineBorder(Color.BLACK, 3, true));
		txtFieldMapTitle.setHorizontalAlignment(SwingConstants.CENTER);
		txtFieldMapTitle.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 26));
		txtFieldMapTitle.setText("Map Title");
		txtFieldMapTitle.setBounds(827, 11, 500, 50);
		
		txtFieldMapTitle.setColumns(10);
		
		
		/*
		 * ===================================================================================================|
		 *                                                                                      GUI CONTAINER
		 * ===================================================================================================|
		 */
	
		contentPane.add(mapContainer);
		contentPane.add(txtFieldMapTitle);
		contentPane.add(commandContainer);
		contentPane.add(navContainer);
		contentPane.add(actionContainer);
		contentPane.add(playerContainer);
		contentPane.add(consoleContainer);
		
		
		frame.addWindowListener(new CloseListener()); 
		frame.setSize(1344,835);
		frame.setLocation(100,100);
		frame.add(contentPane);
		frame.setTitle("Game");
		frame.setResizable(false);
		
		frame.setVisible(true);	
	}
	
	public void addController(ActionListener controller){
		System.out.println("View      : adding controller");
		btnSaveGame.addActionListener(controller);
		btnLoadGame.addActionListener(controller);
		btnHelp.addActionListener(controller);
		btnExit.addActionListener(controller);
		btnNorth.addActionListener(controller);
		btnWest.addActionListener(controller);
		btnEast.addActionListener(controller);
		btnSouth.addActionListener(controller);
		btnFloorUp.addActionListener(controller);
		btnFloorDown.addActionListener(controller);
		btnEnterRoom.addActionListener(controller);
		btnExamineRoom.addActionListener(controller);
		btnSearchRoom.addActionListener(controller);
		btnExitRoom.addActionListener(controller);
		btnPickup.addActionListener(controller);
		btnDrop.addActionListener(controller);
		btnEquip.addActionListener(controller);
		btnUnequip.addActionListener(controller);
		btnUseItem.addActionListener(controller);
		btnAttack.addActionListener(controller);
		btnFlee.addActionListener(controller);
		btnExaminePuzzle.addActionListener(controller);
		btnHint.addActionListener(controller);
		btnSolvePuzzle.addActionListener(controller);
		btnQuitPuzzle.addActionListener(controller);
		btnExamineMonster.addActionListener(controller);
	}
	
	public static class CloseListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			e.getWindow().setVisible(false);
			System.exit(0);
		} 
	} 
	
}
