package userInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import classes.Erabiltzailea;
import classes.gordeIrakurri;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;

public class hasiera extends JFrame implements ActionListener, FocusListener {

	private JPanel contentPane;
	private JTextField textIzenaTalde;
	private JPasswordField pwdPassword;
	private JLabel lblSortuTaldea_1;
	private JLabel lblErabiltzailea;
	private JSeparator separatorKoordinatzaile;
	private JButton btnSartu;
	private JSeparator separatorKoordinatzaile_1;
	private JLabel lblPasahitza;
	private JButton btnSortu;
	private JLabel lblEzDuzuKonturik;
	private JLabel lblLogo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hasiera frame = new hasiera();
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
	public hasiera() {

		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblSortuTaldea_1 = new JLabel("Ongi Etorri");
		lblSortuTaldea_1.setFont(new Font("Montserrat", Font.PLAIN, 25));
		lblSortuTaldea_1.setBounds(27, 10, 359, 42);
		contentPane.add(lblSortuTaldea_1);

		lblErabiltzailea = new JLabel("ERABILTZAILEA");
		lblErabiltzailea.setFont(new Font("Montserrat", Font.PLAIN, 16));
		lblErabiltzailea.setBounds(27, 83, 158, 27);
		contentPane.add(lblErabiltzailea);

		separatorKoordinatzaile = new JSeparator();
		separatorKoordinatzaile.setBounds(27, 165, 284, 2);
		contentPane.add(separatorKoordinatzaile);

		btnSartu = new JButton("Sartu");
		btnSartu.addActionListener(this);
		btnSartu.setForeground(new Color(255, 255, 255));
		btnSartu.setFont(new Font("Montserrat", Font.PLAIN, 16));
		btnSartu.setBorder(null);
		btnSartu.setBackground(new Color(0, 107, 183));
		btnSartu.setBounds(27, 300, 119, 33);
		contentPane.add(btnSartu);

		separatorKoordinatzaile_1 = new JSeparator();
		separatorKoordinatzaile_1.setBounds(27, 279, 284, 2);
		contentPane.add(separatorKoordinatzaile_1);

		lblPasahitza = new JLabel("PASAHITZA");
		lblPasahitza.setFont(new Font("Montserrat", Font.PLAIN, 16));
		lblPasahitza.setBounds(27, 197, 158, 27);
		contentPane.add(lblPasahitza);

		btnSortu = new JButton("Sortu");
		btnSortu.addActionListener(this);
		btnSortu.setForeground(Color.WHITE);
		btnSortu.setFont(new Font("Montserrat", Font.PLAIN, 16));
		btnSortu.setBorderPainted(false);
		btnSortu.setBorder(new EmptyBorder(1, 1, 1, 1));
		btnSortu.setBackground(new Color(104, 111, 119));
		btnSortu.setBounds(27, 407, 116, 33);
		contentPane.add(btnSortu);

		lblEzDuzuKonturik = new JLabel("Ez duzu konturik?");
		lblEzDuzuKonturik.setFont(new Font("Montserrat", Font.PLAIN, 16));
		lblEzDuzuKonturik.setBounds(27, 370, 158, 27);
		contentPane.add(lblEzDuzuKonturik);

		lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(hasiera.class.getResource("/images/NBA logo.png")));
		lblLogo.setBounds(333, 10, 531, 453);
		contentPane.add(lblLogo);

		textIzenaTalde = new JTextField();
		textIzenaTalde.addFocusListener(this);
		textIzenaTalde.setForeground(new Color(0, 0, 0));
		textIzenaTalde.setBorder(null);
		textIzenaTalde.setFont(new Font("Montserrat", Font.PLAIN, 12));
		textIzenaTalde.setBounds(27, 128, 284, 27);
		contentPane.add(textIzenaTalde);
		textIzenaTalde.setColumns(10);

		pwdPassword = new JPasswordField();
		pwdPassword.addFocusListener(this);
		pwdPassword.setForeground(new Color(0, 0, 0));
		pwdPassword.setCaretColor(new Color(192, 192, 192));
		pwdPassword.setBorder(null);
		pwdPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pwdPassword.setBounds(27, 242, 284, 27);
		contentPane.add(pwdPassword);
	}

	@Override
	public void focusGained(FocusEvent e) {
		Object o = e.getSource();
		
		if (o == textIzenaTalde) {
			textIzenaTalde.setText("");
		}
		
		if (o == pwdPassword) {
			pwdPassword.setText("");
		}

	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();

		if (o == btnSartu) {
			ArrayList<Erabiltzailea> E = gordeIrakurri.irakurriErabiltzaile("erabiltzaileak.txt");
			Erabiltzailea EA = null;
			Boolean exists = false;
			String izena = textIzenaTalde.getText().trim();
			String pasahitza = pwdPassword.getText().toString().trim();

			for (int i = 0; i < E.size(); i++) {
				if (E.get(i).getErabiltzaile().equals(izena)) {
					EA = E.get(i);
					exists = true;
				}

			}

			if (exists) {
				if (pasahitza.equals(EA.getPasahitza())) {
					boolean profil = EA.getProfila();
					gordeIrakurri.gordeErabiltzaileChosen(EA, "erabilChosen.txt");

					if (profil == true) {
						adminWindow adminWindow = new adminWindow();
						adminWindow.setVisible(true);
					} else {
						userWindow userWindow = new userWindow();
						userWindow.setVisible(true);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Sartutako pasahitza ez da zuzena");
				}
			} else {
				JOptionPane.showMessageDialog(null, "Sartu duzun erabiltzailea ez da existitzen");
			}

		}

		if (o == btnSortu) {
			erregistratu erregistratu = new erregistratu();
			erregistratu.setVisible(true);
			erregistratu.setBounds(100, 100, 800, 500);

			dispose();
		}

	}
}
