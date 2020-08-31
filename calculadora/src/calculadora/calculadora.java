package calculadora;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField txtCalculos;
	private JButton btn1;
	private JButton btn0;
	private JButton btn8;
	private JButton btn9;
	private JButton btn6;
	private JButton btn5;
	private JButton btn2;
	private JButton btnPonto;
	private JButton btn3;
	private JButton btnDivisao;
	private JButton btnSoma;
	private JButton btnSubstracao;
	private JButton btnMultiplicacao;
	private JButton btnIgual;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora frame = new calculadora();
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
	public calculadora() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 261, 273);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtCalculos = new JTextField();
		txtCalculos.setBounds(0, 0, 245, 49);
		contentPane.add(txtCalculos);
		txtCalculos.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(0, 49, 63, 49);
		contentPane.add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(0, 95, 63, 49);
		contentPane.add(btn4);
		
		btn1 = new JButton("1");
		btn1.setBounds(0, 142, 63, 49);
		contentPane.add(btn1);
		
		btn0 = new JButton("0");
		btn0.setBounds(0, 186, 63, 49);
		contentPane.add(btn0);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn8.setBounds(61, 49, 63, 49);
		contentPane.add(btn8);
		
		btn9 = new JButton("9");
		btn9.setBounds(122, 49, 63, 49);
		contentPane.add(btn9);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn6.setBounds(122, 95, 63, 49);
		contentPane.add(btn6);
		
		btn5 = new JButton("5");
		btn5.setBounds(61, 95, 63, 49);
		contentPane.add(btn5);
		
		btn2 = new JButton("2");
		btn2.setBounds(61, 142, 63, 49);
		contentPane.add(btn2);
		
		btnPonto = new JButton(".");
		btnPonto.setBounds(61, 186, 63, 49);
		contentPane.add(btnPonto);
		
		btn3 = new JButton("3");
		btn3.setBounds(122, 142, 63, 49);
		contentPane.add(btn3);
		
		btnDivisao = new JButton("/");
		btnDivisao.setBounds(122, 186, 63, 49);
		contentPane.add(btnDivisao);
		
		btnSoma = new JButton("+");
		btnSoma.setBounds(182, 49, 63, 49);
		contentPane.add(btnSoma);
		
		btnSubstracao = new JButton("-");
		btnSubstracao.setBounds(182, 95, 63, 49);
		contentPane.add(btnSubstracao);
		
		btnMultiplicacao = new JButton("*");
		btnMultiplicacao.setBounds(182, 142, 63, 49);
		contentPane.add(btnMultiplicacao);
		
		btnIgual = new JButton("=");
		btnIgual.setBounds(182, 186, 63, 49);
		contentPane.add(btnIgual);
	}
}