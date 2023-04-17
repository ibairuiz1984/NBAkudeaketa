package userInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;

import classes.Erabiltzailea;
import classes.Kanporaketa;
import classes.Talde;
import classes.gordeIrakurri;

import javax.swing.event.ChangeEvent;

public class erregistratu extends JFrame implements ActionListener, FocusListener {

	private JPanel contentPane;
	private JTextField textIzenaTalde;
	private JPasswordField Password1;
	private JPasswordField Password2;
	private JLabel lblSortuErabiltzaile;
	private JLabel lblErabiltzailea;
	private JSeparator separatorKoordinatzaile;
	private JSeparator separatorKoordinatzaile_1;
	private JLabel lblPasahitza;
	private JRadioButton rdbtnAdmin;
	private JRadioButton rdbtnErabitzailea;
	private JButton btnSortu;
	private JSeparator separatorKoordinatzaile_1_1;
	private JComboBox<String> comboBoxTalde;
	private JLabel lblPasahitza2;
	private JLabel lblProfila;
	private JLabel lblTaldea;
	private JButton btnAtzera;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					erregistratu frame = new erregistratu();
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
	public erregistratu() {
		setUndecorated(true);

		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblSortuErabiltzaile = new JLabel("Sortu Erabiltzailea");
		lblSortuErabiltzaile.setFont(new Font("Montserrat", Font.PLAIN, 25));
		lblSortuErabiltzaile.setBounds(24, 34, 359, 42);
		contentPane.add(lblSortuErabiltzaile);

		lblErabiltzailea = new JLabel("ERABILTZAILE IZENA");
		lblErabiltzailea.setFont(new Font("Montserrat", Font.PLAIN, 16));
		lblErabiltzailea.setBounds(24, 129, 214, 27);
		contentPane.add(lblErabiltzailea);

		separatorKoordinatzaile = new JSeparator();
		separatorKoordinatzaile.setBounds(24, 203, 284, 2);
		contentPane.add(separatorKoordinatzaile);

		textIzenaTalde = new JTextField();
		textIzenaTalde.setToolTipText("");
		textIzenaTalde.setForeground(new Color(0, 0, 0));
		textIzenaTalde.setBorder(null);
		textIzenaTalde.setFont(new Font("Montserrat", Font.PLAIN, 12));
		textIzenaTalde.setBounds(24, 166, 284, 27);
		contentPane.add(textIzenaTalde);
		textIzenaTalde.setColumns(10);

		separatorKoordinatzaile_1 = new JSeparator();
		separatorKoordinatzaile_1.setBounds(476, 203, 284, 2);
		contentPane.add(separatorKoordinatzaile_1);

		lblPasahitza = new JLabel("PASAHITZA");
		lblPasahitza.setFont(new Font("Montserrat", Font.PLAIN, 16));
		lblPasahitza.setBounds(476, 129, 158, 27);
		contentPane.add(lblPasahitza);

		Password1 = new JPasswordField();
		Password1.setToolTipText("");
		Password1.setForeground(new Color(0, 0, 0));
		Password1.setCaretColor(new Color(192, 192, 192));
		Password1.setBorder(null);
		Password1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Password1.setBounds(476, 166, 284, 27);
		contentPane.add(Password1);

		rdbtnAdmin = new JRadioButton("Administratzailea");
		rdbtnAdmin.addActionListener(this);
		rdbtnErabitzailea = new JRadioButton("Erabitzailea");
		rdbtnErabitzailea.addActionListener(this);

		comboBoxTalde = new JComboBox<String>();
		comboBoxTalde.setEnabled(false);
		comboBoxTalde.setEditable(true);
		comboBoxTalde.setBorder(null);
		comboBoxTalde.setFont(new Font("Montserrat", Font.PLAIN, 12));
		comboBoxTalde.setBounds(24, 376, 284, 27);
		contentPane.add(comboBoxTalde);

		ArrayList<Talde> taldeak = gordeIrakurri.irakurriTalde("taldeakStable.txt");
		if (taldeak.size() > 0) {
			for (int i = 0; i < taldeak.size(); i++) {
				comboBoxTalde.addItem(taldeak.get(i).getIzena());
			}

		} else {
			comboBoxTalde.addItem("Oraindik ez dago talderik sortuta");
		}

		btnSortu = new JButton("Sortu");
		btnSortu.addActionListener(this);
		btnSortu.setForeground(Color.WHITE);
		btnSortu.setFont(new Font("Montserrat", Font.PLAIN, 16));
		btnSortu.setBorderPainted(false);
		btnSortu.setBorder(new EmptyBorder(1, 1, 1, 1));
		btnSortu.setBackground(new Color(104, 111, 119));
		btnSortu.setBounds(558, 404, 116, 33);
		contentPane.add(btnSortu);

		separatorKoordinatzaile_1_1 = new JSeparator();
		separatorKoordinatzaile_1_1.setBounds(476, 326, 284, 2);
		contentPane.add(separatorKoordinatzaile_1_1);

		Password2 = new JPasswordField();
		Password2.setToolTipText("");
		Password2.setForeground(new Color(0, 0, 0));
		Password2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Password2.setCaretColor(Color.LIGHT_GRAY);
		Password2.setBorder(null);
		Password2.setBounds(476, 289, 284, 27);
		contentPane.add(Password2);

		lblPasahitza2 = new JLabel("ERREPIKATU PASAHITZA");
		lblPasahitza2.setFont(new Font("Montserrat", Font.PLAIN, 16));
		lblPasahitza2.setBounds(476, 252, 239, 27);
		contentPane.add(lblPasahitza2);

		lblProfila = new JLabel("PROFILA");
		lblProfila.setFont(new Font("Montserrat", Font.PLAIN, 16));
		lblProfila.setBounds(24, 252, 214, 27);
		contentPane.add(lblProfila);

		rdbtnErabitzailea.addActionListener(this);
		rdbtnErabitzailea.setFont(new Font("Montserrat", Font.PLAIN, 12));
		rdbtnErabitzailea.setBorder(null);
		rdbtnErabitzailea.setBackground(Color.WHITE);
		rdbtnErabitzailea.setBounds(208, 295, 175, 21);
		contentPane.add(rdbtnErabitzailea);

		rdbtnAdmin.addActionListener(this);
		rdbtnAdmin.setBackground(new Color(255, 255, 255));
		rdbtnAdmin.setBorder(null);
		rdbtnAdmin.setFont(new Font("Montserrat", Font.PLAIN, 12));
		rdbtnAdmin.setBounds(24, 295, 175, 21);
		contentPane.add(rdbtnAdmin);

		lblTaldea = new JLabel("TALDEA");
		lblTaldea.setFont(new Font("Montserrat", Font.PLAIN, 16));
		lblTaldea.setBounds(24, 339, 214, 27);
		contentPane.add(lblTaldea);

		btnAtzera = new JButton("ATZERA");
		btnAtzera.addActionListener(this);
		btnAtzera.setForeground(Color.BLACK);
		btnAtzera.setFont(new Font("Montserrat", Font.PLAIN, 16));
		btnAtzera.setContentAreaFilled(false);
		btnAtzera.setBorderPainted(false);
		btnAtzera.setBorder(new EmptyBorder(1, 1, 1, 1));
		btnAtzera.setBackground(new Color(104, 111, 119));
		btnAtzera.setBounds(688, 34, 85, 33);
		contentPane.add(btnAtzera);
	}

	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();

		if (o == btnSortu) {
			DatuakSartu();
			ArrayList<Erabiltzailea> E = gordeIrakurri.irakurriErabiltzaile("erabiltzaileak.txt");
			Boolean exists = false;
			String izena = textIzenaTalde.getText().trim();
			String pasahitza = new String(Password1.getPassword());
			String pasahitza2 = new String(Password2.getPassword());
			String taldea = comboBoxTalde.getName();
			boolean isAdmin = rdbtnAdmin.isSelected();
			if (datuakSartuta()) {
				if (pasahitza.equals(pasahitza2)) {
					for (int i = 0; i < E.size(); i++) {
						if (E.get(i).getErabiltzaile().equals(izena)) {
							exists = true;
						}
					}

					if (!exists) {
						if (rdbtnAdmin.isSelected()) {
							Erabiltzailea E1 = new Erabiltzailea(izena, pasahitza);
							E.add(E1);
						} else {
							Erabiltzailea E1 = new Erabiltzailea(izena, pasahitza, taldea);
							E.add(E1);
						}

						gordeIrakurri.gordeErabiltzaile(E, "erabiltzaileak.txt");
						hasiera m = new hasiera();
						m.setVisible(true);
						m.setBounds(100, 100, 800, 500);

						dispose();
					} else {
						JOptionPane.showMessageDialog(null,
								"Erabiltzaile izena existitzen da jada, aukeratu beste izen bat mesedez");
					}

				} else {
					JOptionPane.showMessageDialog(null, "Pasahitzak berdinak izan behar dira");
				}
			}

		}
		if (o == btnAtzera) {
			hasiera m = new hasiera();
			m.setVisible(true);
			m.setBounds(100, 100, 800, 500);

			dispose();
		}

		if (o == rdbtnAdmin) {
			if (rdbtnAdmin.isSelected()) {
				rdbtnErabitzailea.setSelected(false);
				comboBoxTalde.setEnabled(false);
			} else if (!rdbtnErabitzailea.isSelected() && !rdbtnAdmin.isSelected()) {
				rdbtnAdmin.setSelected(true);
			}

		}

		if (o == rdbtnErabitzailea) {
			if (rdbtnErabitzailea.isSelected()) {
				comboBoxTalde.setEnabled(true);
				rdbtnAdmin.setSelected(false);
			} else if (!rdbtnErabitzailea.isSelected() && !rdbtnAdmin.isSelected()) {
				rdbtnAdmin.setSelected(true);
			}

		}

	}

	public boolean datuakSartuta() {
		if (!textIzenaTalde.getText().isEmpty() && !Password1.getPassword().toString().isEmpty()
				&& !Password2.getPassword().toString().isEmpty()) {
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "Beharrezkoa da datu guztiak sartzea");
			return false;
		}
	}

	public void DatuakSartu() {
		// Data-basearekin konektatu
		// Data-basea eratu baldin eta ez badago
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("$objectdb/db/Erabiltzaileak.odb");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		String izena = textIzenaTalde.getText().trim();
		String pasahitza = new String(Password1.getPassword());
		String pasahitza2 = new String(Password2.getPassword());
		String taldea = comboBoxTalde.getName();
		boolean isAdmin = rdbtnAdmin.isSelected();
		Erabiltzailea E1 = new Erabiltzailea(izena, pasahitza, taldea);
		em.persist(E1);
		em.getTransaction().commit();

	}
}
