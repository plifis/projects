package nalog;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;

import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class GeneralFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField_Plan;
	private JTextField textField_Rent;
	private JTextField textField_otherCosts;
	private JTextField textField_Total;
	private JTextField textField_Square;
	private JTextField textField_Base;
	private JTextField textField_K1;
	private JTextField textField_K2;
	private JTextField textField_sizeTax;
	public String idButton = new String ();
	private final ButtonGroup radio = new ButtonGroup();
	private JTextField textField_Insurance;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GeneralFrame frame = new GeneralFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GeneralFrame() {
		 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 357);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel rightPanel = new JPanel();
		contentPane.add(rightPanel, BorderLayout.EAST);
		
		JRadioButton rdbtnENVD = new JRadioButton("\u0415\u041D\u0412\u0414");
		radio.add(rdbtnENVD);
		rdbtnENVD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				idButton= "ENVD";
			}
		});
						
		JRadioButton rdbtnUSN_D_R = new JRadioButton("\u0423\u0421\u041D (\u0414-\u0440 15%)");
		radio.add(rdbtnUSN_D_R);
		rdbtnUSN_D_R.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				idButton="USN_D_R";
				textField_sizeTax.setText(Integer.toString(15));
			}
		});
		
		JRadioButton rdbtnUSN_D = new JRadioButton("\u0423\u0421\u041D (\u0414 6%)");
		radio.add(rdbtnUSN_D);
		rdbtnUSN_D.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				idButton = "USN_D";
				textField_sizeTax.setText(Integer.toString(6));
			}
		});

		GroupLayout gl_rightPanel = new GroupLayout(rightPanel);
		gl_rightPanel.setHorizontalGroup(
			gl_rightPanel.createParallelGroup(Alignment.LEADING)
				.addComponent(rdbtnENVD, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
				.addComponent(rdbtnUSN_D_R)
				.addComponent(rdbtnUSN_D, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
		);
		gl_rightPanel.setVerticalGroup(
			gl_rightPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_rightPanel.createSequentialGroup()
					.addComponent(rdbtnENVD, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
					.addComponent(rdbtnUSN_D_R, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
					.addComponent(rdbtnUSN_D, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
		);
		rightPanel.setLayout(gl_rightPanel);
		
		JPanel downPanel = new JPanel();
		contentPane.add(downPanel, BorderLayout.SOUTH);
		downPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton button_Calculate = new JButton("\u0420\u0430\u0441\u0447\u0435\u0442");
		
		button_Calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float s, bD, kf1, kf2, sT, p, r, oC, ins;
				switch (idButton) {
				
				
				case "ENVD": 
				s = Float.parseFloat(textField_Square.getText());
				bD = Float.parseFloat(textField_Base.getText());
				kf1 = Float.parseFloat(textField_K1.getText());
				kf2 = Float.parseFloat(textField_K2.getText());
				sT = Float.parseFloat(textField_sizeTax.getText());	
				ins = Float.parseFloat(textField_Insurance.getText());
				calculateTax calcTaxENVD = new calculateTax(s, bD, kf1, kf2, sT, ins);
				textField_Total.setText(calcTaxENVD.getENVD(s, bD, kf1, kf2, sT, ins));
				break;
				
				case "USN_D_R":
				p = Float.parseFloat(textField_Plan.getText());
				r = Float.parseFloat(textField_Rent.getText());
				oC = Float.parseFloat(textField_otherCosts.getText());
				sT = Float.parseFloat(textField_sizeTax.getText());
				ins = Float.parseFloat(textField_Insurance.getText());
				calculateTax calcTaxUSN_D_R = new calculateTax(p,r,oC,sT, ins);
				textField_Total.setText(calcTaxUSN_D_R.getUSN_D_R(p, r, oC, sT, ins));
				break;
				
				case "USN_D":
				p = Float.parseFloat(textField_Plan.getText());
				sT = Float.parseFloat(textField_sizeTax.getText());
				ins = Float.parseFloat(textField_Insurance.getText());
				calculateTax calcTaxUSN_D = new calculateTax(p,sT, ins);
				textField_Total.setText(calcTaxUSN_D.getUSN_D(p, sT, ins));
				break;
				
				default:
					break;
				}
			}	
			
		});
		downPanel.add(button_Calculate);
		
		JLabel label_Total = new JLabel("\u0418\u0442\u043E\u0433");
		downPanel.add(label_Total);
		
		textField_Total = new JTextField();
		textField_Total.setEditable(false);
		downPanel.add(textField_Total);
		textField_Total.setColumns(10);
		
		JPanel centerPanel = new JPanel();
		contentPane.add(centerPanel, BorderLayout.CENTER);
		
		JLabel label_Plan = new JLabel("\u041F\u043E\u043A\u0430\u0437\u0430\u0442\u0435\u043B\u044C \u0422\u041E");
		
		textField_Plan = new JTextField();
		textField_Plan.setText("0");
		textField_Plan.setColumns(10);
		centerPanel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel label_Square = new JLabel("\u041F\u043B\u043E\u0449\u0430\u0434\u044C");
		centerPanel.add(label_Square);
		
		textField_Square = new JTextField();
		textField_Square.setText("0");
		centerPanel.add(textField_Square);
		textField_Square.setColumns(10);
		centerPanel.add(label_Plan);
		centerPanel.add(textField_Plan);
		
		JLabel label_Rent = new JLabel("\u0421\u0442\u043E\u0438\u043C\u043E\u0441\u0442\u044C \u0430\u0440\u0435\u043D\u0434\u044B");
		centerPanel.add(label_Rent);
		
		textField_Rent = new JTextField();
		textField_Rent.setText("0");
		centerPanel.add(textField_Rent);
		textField_Rent.setColumns(10);
		
		JLabel label_Insurance = new JLabel("\u0421\u0442\u0430\u0440\u0445\u043E\u0432\u044B\u0435 \u0432\u0437\u043D\u043E\u0441\u044B (\u0441\u0443\u043C\u043C\u0430 \u0437\u0430 \u0432\u0441\u0435\u0445)");
		centerPanel.add(label_Insurance);
		
		textField_Insurance = new JTextField();
		textField_Insurance.setText("0");
		centerPanel.add(textField_Insurance);
		textField_Insurance.setColumns(10);
		
		JLabel label_otherCosts = new JLabel("\u0418\u043D\u044B\u0435 \u043F\u043E\u0434\u0442\u0432\u0435\u0440\u0436\u0434\u0435\u043D\u043D\u044B\u0435 \u0440\u0430\u0441\u0445\u043E\u0434\u044B");
		centerPanel.add(label_otherCosts);
		
		textField_otherCosts = new JTextField();
		textField_otherCosts.setText("0");
		centerPanel.add(textField_otherCosts);
		textField_otherCosts.setColumns(10);
		
		JLabel label_base = new JLabel("\u0411\u0430\u0437\u043E\u0432\u0430\u044F \u0434\u043E\u0445\u043E\u0434\u043D\u043E\u0441\u0442\u044C");
		centerPanel.add(label_base);
		
		textField_Base = new JTextField();
		textField_Base.setText("1800");
		centerPanel.add(textField_Base);
		textField_Base.setColumns(10);
		
		JLabel label_k1 = new JLabel("\u041A\u043E\u044D\u0444\u0444\u0438\u0446\u0438\u0435\u043D\u0442 \u041A1");
		centerPanel.add(label_k1);
		
		textField_K1 = new JTextField();
		textField_K1.setText("1.915");
		centerPanel.add(textField_K1);
		textField_K1.setColumns(10);
		
		JLabel label_k2 = new JLabel("\u041A\u043E\u044D\u0444\u0444\u0438\u0438\u0435\u043D\u0442 \u041A2");
		centerPanel.add(label_k2);
		
		textField_K2 = new JTextField();
		textField_K2.setText("0.75");
		centerPanel.add(textField_K2);
		textField_K2.setColumns(10);
		
		JLabel lblNewLabel_sizeTax = new JLabel("\u0420\u0430\u0437\u043C\u0435\u0440 \u043D\u0430\u043B\u043E\u0433\u0430 \u0432 %");
		centerPanel.add(lblNewLabel_sizeTax);
		
		textField_sizeTax = new JTextField();
		textField_sizeTax.setText("15");
		centerPanel.add(textField_sizeTax);
		textField_sizeTax.setColumns(10);
	}
}
