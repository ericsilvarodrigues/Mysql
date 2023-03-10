package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import java.awt.Cursor;

public class Agenda extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtNome;
	private JTextField txtFone;
	private JTextField txtEmail;
	private JLabel lblStatus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Agenda frame = new Agenda();
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
	public Agenda() {
		setResizable(false);
		setTitle("Agenda de contatos ");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Agenda.class.getResource("/img/notepad.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 459, 359);
		contentPane = new JPanel();
		contentPane.setToolTipText("Adicionar contato");
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setBounds(10, 25, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtID = new JTextField();
		txtID.setEditable(false);
		txtID.setBounds(31, 22, 46, 20);
		contentPane.add(txtID);
		txtID.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setBounds(10, 76, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtNome = new JTextField();
		txtNome.setBounds(46, 73, 240, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Fone:");
		lblNewLabel_2.setBounds(10, 127, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		txtFone = new JTextField();
		txtFone.setBounds(46, 124, 119, 20);
		contentPane.add(txtFone);
		txtFone.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("E-mail:");
		lblNewLabel_3.setBounds(10, 169, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(46, 166, 240, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		JButton btnCreate = new JButton("");
		btnCreate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCreate.setToolTipText("Adicionar contato");
		btnCreate.setContentAreaFilled(false);
		btnCreate.setBorder(null);
		btnCreate.setIcon(new ImageIcon(Agenda.class.getResource("/img/Create.png")));
		btnCreate.setBounds(29, 230, 48, 48);
		contentPane.add(btnCreate);
		
		lblStatus = new JLabel("");
		lblStatus.setIcon(new ImageIcon(Agenda.class.getResource("/img/dboff.png")));
		lblStatus.setBounds(385, 261, 48, 48);
		contentPane.add(lblStatus);
		
		JButton btnSobre = new JButton("");
		btnSobre.setContentAreaFilled(false);
		btnSobre.setIcon(new ImageIcon(Agenda.class.getResource("/img/About.png")));
		btnSobre.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSobre.setBorder(null);
		btnSobre.setToolTipText("Sobre");
		btnSobre.setBounds(385, 11, 48, 48);
		contentPane.add(btnSobre);
	}//fim do construtor 
}//fim do código 
