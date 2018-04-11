
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import com.sun.glass.ui.View;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.event.ActionEvent;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.ListSelectionModel;

import java.awt.Font;
import java.awt.Frame;

import javax.swing.SwingConstants;
import javax.swing.SwingWorker;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JProgressBar;
import java.awt.GridLayout;
import java.awt.Dimension;

public class GameFrame extends JFrame
{

	private  Map<String,String> itemDetail = new HashMap<String,String>();


	JTextField txtFieldMapTitle;
	JTextField textFieldDamage;
	JTextField textField_1;
	JPanel contentPane;

	//================== CONTAINERS ===================|

	JPanel mapContainer = new JPanel();
	JPanel commandContainer = new JPanel();
	JPanel navContainer = new JPanel();
	JPanel roomPanel = new JPanel();
	JPanel towerPanel = new JPanel();
	JPanel puzzleContainer = new JPanel();
	JPanel consoleContainer = new JPanel();
	JPanel playerContainer = new JPanel();
	JPanel actionContainer = new JPanel();
	JPanel equipContainer = new JPanel();


	//================== LABELS ========================|
	JLabel mapBox = new JLabel("");
	JLabel lblPlayerHp = new JLabel("Player Health");
	JLabel lblDamage = new JLabel("Damage");
	JLabel lblEquip = new JLabel("Equipped Item =");


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
	JButton btnEnter = new JButton("Enter");
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
	JButton btnExamineItem = new JButton("Item Detail");

	JButton btnEarth = new JButton("Earth Tower");
	JButton btnFire = new JButton("Fire Tower");
	JButton btnWood = new JButton("Wood Tower");
	JButton btnMetal = new JButton("Metal Tower");
	JButton btnWater = new JButton("Water Tower");

	//=======================================================
	JScrollPane scrollPane = new JScrollPane();

	JProgressBar progressBarHealth = new JProgressBar();

	DefaultListModel fillList = new DefaultListModel();
	DefaultListModel equitList = new DefaultListModel();

	public JList inventoryBox = new JList(fillList);
	public JList equipBox = new JList(equitList);

	String itemNAME = "";

	JScrollPane scrollitem = new JScrollPane();

	public GameFrame()
	{

		//======================================================
		fillList.addElement(("Knife"));


		fillList.addElement(("Health Potion"));
		fillList.addElement(("Health Potion"));
		fillList.addElement(("Health Potion"));
		fillList.addElement(("Health Potion"));
		fillList.addElement(("Health Potion"));
		fillList.addElement(("Health Potion"));
		fillList.addElement(("Health Potion"));
		fillList.addElement(("Health Potion"));
		fillList.addElement(("Health Potion"));       //================== TEMP FIX NEED EDIT HERE
		fillList.addElement(("Health Potion"));
		fillList.addElement(("Health Potion"));
		fillList.addElement(("Health Potion"));
		fillList.addElement(("Health Potion"));
		fillList.addElement(("Health Potion"));
		fillList.addElement(("Health Potion"));
		fillList.addElement(("Health Potion"));
		fillList.addElement(("Health Potion"));
		fillList.addElement(("Health Potion"));
		fillList.addElement(("Health Potion"));
		fillList.addElement(("Health Potion"));
		fillList.addElement(("Health Potion"));

		//======================================================


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

		txtGuiConsolePrintout.setText(""
				+ ""
				+ " \n                                     +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"
				+ "\n                                   +++++++++++++++++     WELCOME TO ELEMENTAL DANGER!    +++++++++++++++++ "
				+ "\n                                      +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n\n\n\n\n");
		txtGuiConsolePrintout.setLineWrap(true);
		txtGuiConsolePrintout.setWrapStyleWord(true);
		txtGuiConsolePrintout.setEditable(false);
		txtGuiConsolePrintout.setCaretPosition(txtGuiConsolePrintout.getDocument().getLength());
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
		progressBarHealth.setValue(20);
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


		inventoryBox.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				itemNAME = (String) inventoryBox.getSelectedValue();
				//textAreaItemDetails.setText(detail);
			}

		});
		scrollitem.setBounds(10, 110, 400, 150);

		DefaultListCellRenderer renderer = (DefaultListCellRenderer) inventoryBox.getCellRenderer();
		renderer.setHorizontalAlignment(SwingConstants.CENTER);
		scrollitem.setViewportView(inventoryBox);
	
		
		playerContainer.add(scrollitem);

		textAreaItemDetails.setEditable(false);
		textAreaItemDetails.setText("");
		textAreaItemDetails.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		textAreaItemDetails.setBounds(118, 263, 376, 50);
		textAreaItemDetails.setLineWrap(true);
		playerContainer.add(textAreaItemDetails);

		lblEquip.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEquip.setHorizontalAlignment(SwingConstants.CENTER);
		lblEquip.setBounds(10, 63, 150, 47);
		playerContainer.add(lblEquip);


		DefaultListCellRenderer renderer2 = (DefaultListCellRenderer) equipBox.getCellRenderer();
		renderer2.setHorizontalAlignment(SwingConstants.CENTER);
		equipBox.setVisible(true);
		equipContainer.add(equipBox);

		equipContainer.add(equipBox);
		equipContainer.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		equipContainer.setBounds(158,68,250,30);
		playerContainer.add(equipContainer);

		btnPickup.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPickup.setBounds(414, 67, 79, 35);
		btnPickup.setActionCommand("PickupButton");
		playerContainer.add(btnPickup);


		btnDrop.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDrop.setBounds(414, 105, 79, 35);
		btnDrop.setActionCommand("DropButton");
		playerContainer.add(btnDrop);

		btnExamineItem.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExamineItem.setBounds(10, 269, 105, 30);
		btnExamineItem.setActionCommand("ItemDetails");
		playerContainer.add(btnExamineItem);

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
		btnNorth.setVisible(false);
		navContainer.add(btnNorth);


		btnWest.setIcon(new ImageIcon("Icons/arrow_left.png"));
		btnWest.setBounds(10, 65, 50, 50);
		btnWest.setActionCommand("WestButton");
		btnWest.setVisible(false);
		navContainer.add(btnWest);


		btnEast.setIcon(new ImageIcon("Icons/arrow_right.png"));
		btnEast.setBounds(108, 65, 50, 50);
		btnEast.setActionCommand("EastButton");
		btnEast.setVisible(false);
		navContainer.add(btnEast);


		btnSouth.setIcon(new ImageIcon("Icons/arrow_down.png"));
		btnSouth.setBounds(59, 115, 50, 50);
		btnSouth.setActionCommand("SouthButton");
		btnSouth.setVisible(false);
		navContainer.add(btnSouth);



		btnFloorUp.setIcon(new ImageIcon("Icons/Stairs_up.png"));
		btnFloorUp.setBounds(217, 15, 75, 75);
		btnFloorUp.setActionCommand("FloorUpButton");
		btnFloorUp.setVisible(false);
		navContainer.add(btnFloorUp);


		btnFloorDown.setIcon(new ImageIcon("Icons/Stairs_down.png"));
		btnFloorDown.setBounds(217, 90, 75, 75);
		btnFloorDown.setActionCommand("FloorDownButton");
		btnFloorDown.setVisible(false);
		navContainer.add(btnFloorDown);

		towerPanel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		towerPanel.setBounds(5, 35, 340, 70);
		navContainer.add(towerPanel);



		btnWater.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnWater.setActionCommand("WaterButton");
		towerPanel.add(btnWater);

		btnFire.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnFire.setActionCommand("FireButton");
		towerPanel.add(btnFire);

		btnWood.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnWood.setActionCommand("WoodButton");
		towerPanel.add(btnWood);

		btnMetal.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnMetal.setActionCommand("MetalButton");
		towerPanel.add(btnMetal);

		btnEarth.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEarth.setActionCommand("EarthButton");
		towerPanel.add(btnEarth);

		roomPanel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		roomPanel.setBounds(5, 170, 340, 41);
		navContainer.add(roomPanel);


		btnEnter.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEnter.setActionCommand("EnterButton");
		btnEnter.setVisible(false);
		roomPanel.add(btnEnter);


		btnExamineRoom.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExamineRoom.setActionCommand("ExamineRoomButton");
		btnExamineRoom.setVisible(false);
		roomPanel.add(btnExamineRoom);


		btnSearchRoom.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSearchRoom.setActionCommand("SearchButton");
		btnSearchRoom.setVisible(false);
		roomPanel.add(btnSearchRoom);


		btnExitRoom.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExitRoom.setActionCommand("ExitRoomButton");
		btnExitRoom.setVisible(false);
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
		mapBox.setIcon(new ImageIcon("Maps/000.png"));
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
		btnEnter.addActionListener(controller);
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
		btnFire.addActionListener(controller);
		btnWater.addActionListener(controller);
		btnEarth.addActionListener(controller);
		btnMetal.addActionListener(controller);
		btnWood.addActionListener(controller);
		btnExamineItem.addActionListener(controller);
	}



	public void getItems(DefaultListModel z) {
		for(int i = 0 ; i< z.size();i++) {
			fillList.addElement(z.getElementAt(i));
		}
	}

	public void equipItem(DefaultListModel x) {
		if(equitList.isEmpty()) {
			equitList.addElement(x.getElementAt(0));	
			txtGuiConsolePrintout.append("You have Equipped an item.");
		}else {
			txtGuiConsolePrintout.append("\n Sorry only one item can be equiped at once. \n");
		}
		int index = inventoryBox.getSelectedIndex();
		fillList.removeElementAt(index);
		itemNAME ="";
	}
	public void unequipItem() {
		fillList.addElement(equitList.getElementAt(0));
		equitList.clear();
	}

	public void dropItems() {
		int index = inventoryBox.getSelectedIndex();
		fillList.removeElementAt(index);
	}

	public void useItem(double d) {
		progressBarHealth.setValue((int) Math.round(progressBarHealth.getValue()+d));
		int index = inventoryBox.getSelectedIndex();
		fillList.removeElementAt(index);
	}


	public static class CloseListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			e.getWindow().setVisible(false);
			System.exit(0);
		} 
	}


}
