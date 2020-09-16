import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Color;


public class WaterTank {

	private JFrame frmWaterTank;
	private JTextField textField;
	static float level = (float) 0.00;     
	float gallons;
	public void watertank(){  level = 10000;   }
	public void addWater(float gallons) {  level = level + gallons;   }
	public void removeWater(float gallons) { level = level - gallons;  }
	public static float currentLevel() { return level; }
	public static boolean isFull() {  if (level == 10000)   return true;   else return false;   }
	public static boolean isEmpty() {  if (level == 0.00)   return true;   else return false;   }
	public static String tankInfo() {
		return " Water Tank Maximum Capacity :   10,000 gallons of Water \n"
		+ " Water Tank Current Level \t   :    "+ currentLevel()+ " gallons of water\n"
		+ " Water Tank Empty \t   :    "+ isEmpty() +"\n"
		+ " WaterTank Full \t   :    " + isFull(); }
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WaterTank window = new WaterTank();
					window.frmWaterTank.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WaterTank() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frmWaterTank = new JFrame();
		frmWaterTank.getContentPane().setBackground(SystemColor.activeCaption);
		frmWaterTank.setResizable(false);
		frmWaterTank.setBounds(100, 100, 531, 190);
		frmWaterTank.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWaterTank.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setForeground(Color.WHITE);
		textArea.setBackground(SystemColor.activeCaption);
		textArea.setFont(new Font("Calibri", Font.PLAIN, 20));
		textArea.setEditable(false);
		textArea.setBounds(0, 11, 521, 104);
		frmWaterTank.getContentPane().add(textArea);
		textArea.setText(tankInfo());

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.TRAILING);
		textField.setBounds(0, 115, 191, 39);
		frmWaterTank.getContentPane().add(textField);
		textField.setColumns(10);
		textField.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				textArea.setText(tankInfo());
			}
		});

						
		
		JButton btnAddWater = new JButton("Add Water");
		btnAddWater.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float gallons = Float.parseFloat(textField.getText());

				if (gallons+currentLevel()>10000) {
					textArea.setText("Water tank will overflow! You exceed the limit.");
					textField.setText("");

				}
				else {
					addWater(gallons);
					textArea.setText(tankInfo());
					JOptionPane.showMessageDialog(null, "Successfully Added.");
					textField.setText("");

				}
			}
		});
		btnAddWater.setFont(new Font("Calibri", Font.PLAIN, 11));
		btnAddWater.setBounds(190, 115, 119, 39);
		frmWaterTank.getContentPane().add(btnAddWater);
		
		JButton btnRemoveWater = new JButton("Remove Water");
		btnRemoveWater.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float gallons = Float.parseFloat(textField.getText());
				if (currentLevel()-gallons < 0) {
					textArea.setText("No more water in the tank.");
					textField.setText("");
				}
				else {
					removeWater(gallons);
					textArea.setText(tankInfo());
					JOptionPane.showMessageDialog(null, "Successfully Removed.");
					textField.setText("");
				}
			}
		});
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Do you want to quit?", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
				else {
					initialize();
				}
			}
		});
		btnExit.setFont(new Font("Calibri", Font.PLAIN, 11));
		btnExit.setBounds(419, 115, 106, 39);
		frmWaterTank.getContentPane().add(btnExit);
		btnRemoveWater.setFont(new Font("Calibri", Font.PLAIN, 11));
		btnRemoveWater.setBounds(300, 115, 133, 39);
		frmWaterTank.getContentPane().add(btnRemoveWater);
		
		
		
		
	}
}
