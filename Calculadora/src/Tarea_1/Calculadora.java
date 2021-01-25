package Tarea_1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	Calculos calc = new Calculos();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					
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
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 402, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 153, 153));
		panel.setBounds(0, 0, 384, 456);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btn1 = new JButton("1");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textField.setText(calc.union("1"));
			}
		});
		btn1.setBackground(new Color(255, 204, 204));
		btn1.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn1.setBounds(26, 118, 66, 72);
		panel.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(calc.union("2"));
			}
		});
		btn2.setBackground(new Color(255, 204, 204));
		btn2.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn2.setBounds(101, 118, 66, 72);
		panel.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(calc.union("3"));
			}
		});
		btn3.setBackground(new Color(255, 204, 204));
		btn3.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn3.setBounds(177, 118, 66, 72);
		panel.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(calc.union("4"));
			}
		});
		btn4.setBackground(new Color(255, 204, 204));
		btn4.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn4.setBounds(26, 201, 66, 72);
		panel.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(calc.union("5"));
				
			}
		});
		btn5.setBackground(new Color(255, 204, 204));
		btn5.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn5.setBounds(101, 201, 66, 72);
		panel.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(calc.union("6"));
			}
		});
		btn6.setBackground(new Color(255, 204, 204));
		btn6.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn6.setBounds(177, 200, 66, 73);
		panel.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(calc.union("7"));
			}
		});
		btn7.setBackground(new Color(255, 204, 204));
		btn7.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn7.setBounds(26, 280, 66, 72);
		panel.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(calc.union("8"));
			}
		});
		btn8.setBackground(new Color(255, 204, 204));
		btn8.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn8.setBounds(101, 280, 66, 72);
		panel.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(calc.union("9"));
			}
		});
		btn9.setBackground(new Color(255, 204, 204));
		btn9.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn9.setBounds(177, 280, 66, 72);
		panel.add(btn9);
		
		JButton btnSuma = new JButton("+");
		btnSuma.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				calc.suma(textField.getText());
			}
		});
		btnSuma.setBackground(new Color(255, 255, 255));
		btnSuma.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnSuma.setBounds(253, 118, 106, 72);
		panel.add(btnSuma);
		
		JButton btnResta = new JButton("-");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			calc.resta(textField.getText());
			}
			
		});
		btnResta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnResta.setBackground(new Color(255, 255, 255));
		btnResta.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnResta.setBounds(253, 201, 106, 72);
		panel.add(btnResta);
		
		JButton btnMultpl = new JButton("x");
		btnMultpl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				calc.multpl(textField.getText());
			}
		});
		btnMultpl.setBackground(new Color(255, 255, 255));
		btnMultpl.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnMultpl.setBounds(253, 280, 106, 72);
		panel.add(btnMultpl);
		
		JButton btnDivision = new JButton("/");
		btnDivision.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				calc.division(textField.getText());
			}
		});
		btnDivision.setBackground(new Color(255, 255, 255));
		btnDivision.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnDivision.setBounds(253, 363, 106, 72);
		panel.add(btnDivision);
		
		JButton btn0 = new JButton("0");
		btn0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(calc.union("0"));
			}
		});
		btn0.setBackground(new Color(255, 204, 204));
		btn0.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn0.setBounds(26, 363, 66, 72);
		panel.add(btn0);
		
		JButton btnResultado = new JButton("=");
		btnResultado.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(""+calc.resultado(textField.getText()));
			}
		});
		btnResultado.setBackground(new Color(255, 255, 255));
		btnResultado.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnResultado.setBounds(177, 363, 66, 72);
		panel.add(btnResultado);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 50));
		textField.setBounds(26, 35, 333, 72);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnClear = new JButton("C");
		btnClear.setBackground(new Color(153, 204, 255));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(calc.clear(""));
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnClear.setBounds(101, 363, 66, 72);
		panel.add(btnClear);
	}
}
