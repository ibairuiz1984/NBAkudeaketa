package userInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import classes.Taldekide;
import classes.gordeIrakurri;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ListSelectionModel;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class sortuTaldekideak extends JFrame
		implements ActionListener, FocusListener {

	private static final long serialVersionUID = -769897967527414239L;
	private JPanel contentPane;
	private JLabel lblSartuTaldekideak;
	private JTextField textIzena;
	private JTextField textAbizena;
	private JTextField textJaiotzeData;
	private JTextField textJatorrizkoHerria;
	private JTextField textKolegiatuZenbakia;
	private JLabel lblIzena;
	private JLabel lblNanZnb;
	private JLabel lblAbizena;
	private JLabel lblJaiotzeData;
	private JLabel lblJatorrizkoHerria;
	private JLabel lblSexua;
	private JLabel lblPostu;
	private JRadioButton rdbtnEmakume;
	private JRadioButton rdbtnGizkon;
	private JRadioButton rdbtnKoordinatzaile;
	private JRadioButton rdbtnEntrenatzaile;
	private JRadioButton rdbtnFisioterapeuta;

	private JButton btnSortu;
	private JButton btnSortuTaldea;
	private JButton btnAtzera;
	private JButton btnEzabatu;

	private JList<Taldekide> listEntrenatzaileak;
	private DefaultListModel<Taldekide> dlmEntrenatzaileak;
	private JList<Taldekide> listJokalariak;
	private DefaultListModel<Taldekide> dlmJokalariak;
	private JList<Taldekide> listFisio;
	private DefaultListModel<Taldekide> dlmFisio;
	private JList<Taldekide> listKoordinatzaileak;
	private DefaultListModel<Taldekide> dlmKoordinatzaile;

	private JLabel lblFisioak;
	private JLabel lblJokalariak;
	private JLabel lblEntrenatzaileak;
	private JLabel lblKoordinatzailea;

	private JSeparator separatorFisio;
	private JSeparator separatorJokalari;
	private JSeparator separatorEntrenatzaile;
	private JSeparator separatorKoordinatzaile;
	private JTextField textNan;

	private String sexua;
	private String rola = "Jokalaria";
	private boolean fisio = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sortuTaldekideak frame = new sortuTaldekideak();
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
	public sortuTaldekideak() {
		setUndecorated(true);
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblJokalariak = new JLabel("Jokalariak");
		lblJokalariak.setFont(new Font("Montserrat", Font.PLAIN, 16));
		lblJokalariak.setBounds(27, 180, 158, 27);
		contentPane.add(lblJokalariak);

		lblSartuTaldekideak = new JLabel("Sartu Taldekideak");
		lblSartuTaldekideak.setFont(new Font("Montserrat", Font.PLAIN, 25));
		lblSartuTaldekideak.setBounds(27, 22, 359, 42);
		contentPane.add(lblSartuTaldekideak);

		separatorJokalari = new JSeparator();
		separatorJokalari.setBounds(27, 213, 158, 2);
		contentPane.add(separatorJokalari);

		lblEntrenatzaileak = new JLabel("Entrenatzaileak");
		lblEntrenatzaileak.setFont(new Font("Montserrat", Font.PLAIN, 16));
		lblEntrenatzaileak.setBounds(232, 89, 158, 27);
		contentPane.add(lblEntrenatzaileak);

		separatorEntrenatzaile = new JSeparator();
		separatorEntrenatzaile.setBounds(232, 122, 158, 2);
		contentPane.add(separatorEntrenatzaile);

		listJokalariak = new JList<Taldekide>();
		listJokalariak.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listJokalariak.setFont(new Font("Montserrat", Font.PLAIN, 12));
		listJokalariak.setBounds(27, 225, 181, 240);
		contentPane.add(listJokalariak);

		dlmJokalariak = new DefaultListModel<Taldekide>();
		listJokalariak.setModel(dlmJokalariak);
		
		//Kargatu zerrendako izenak
		for (int i = 0; i < gordeIrakurri.irakurriTaldekide("jokalariak.txt").size(); i++) {
			dlmJokalariak.addElement(gordeIrakurri.irakurriTaldekide("jokalariak.txt").get(i));
		}
				
		listEntrenatzaileak = new JList<Taldekide>();
		listEntrenatzaileak.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listEntrenatzaileak.setFont(new Font("Montserrat", Font.PLAIN, 12));
		listEntrenatzaileak.setBounds(233, 134, 181, 127);
		contentPane.add(listEntrenatzaileak);

		dlmEntrenatzaileak = new DefaultListModel<Taldekide>();
		listEntrenatzaileak.setModel(dlmEntrenatzaileak);
		
		//Kargatu zerrendako izenak
		for (int i = 0; i < gordeIrakurri.irakurriTaldekide("entrenatzaileak.txt").size(); i++) {
			dlmEntrenatzaileak.addElement(gordeIrakurri.irakurriTaldekide("entrenatzaileak.txt").get(i));
		}

		listFisio = new JList<Taldekide>();
		listFisio.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listFisio.setFont(new Font("Montserrat", Font.PLAIN, 12));
		listFisio.setBounds(232, 338, 181, 127);
		contentPane.add(listFisio);

		dlmFisio = new DefaultListModel<Taldekide>();
		listFisio.setModel(dlmFisio);
		
		//Kargatu zerrendako izenak
		for (int i = 0; i < gordeIrakurri.irakurriTaldekide("fisioak.txt").size(); i++) {
			dlmFisio.addElement(gordeIrakurri.irakurriTaldekide("fisioak.txt").get(i));
		}

		listKoordinatzaileak = new JList<Taldekide>();
		listKoordinatzaileak.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listKoordinatzaileak.setFont(new Font("Montserrat", Font.PLAIN, 12));
		listKoordinatzaileak.setBounds(27, 134, 181, 38);
		contentPane.add(listKoordinatzaileak);

		dlmKoordinatzaile = new DefaultListModel<Taldekide>();
		listKoordinatzaileak.setModel(dlmKoordinatzaile);
		
		//Kargatu zerrendako izenak
		for (int i = 0; i < gordeIrakurri.irakurriTaldekide("koordinatzaile.txt").size(); i++) {
			dlmKoordinatzaile.addElement(gordeIrakurri.irakurriTaldekide("koordinatzaile.txt").get(i));
		}

		lblFisioak = new JLabel("Fisioterapeutak");
		lblFisioak.setFont(new Font("Montserrat", Font.PLAIN, 16));
		lblFisioak.setBounds(232, 293, 158, 27);
		contentPane.add(lblFisioak);

		separatorFisio = new JSeparator();
		separatorFisio.setBounds(232, 326, 158, 2);
		contentPane.add(separatorFisio);

		lblKoordinatzailea = new JLabel("Koordinatzailea");
		lblKoordinatzailea.setFont(new Font("Montserrat", Font.PLAIN, 16));
		lblKoordinatzailea.setBounds(27, 89, 158, 27);
		contentPane.add(lblKoordinatzailea);

		separatorKoordinatzaile = new JSeparator();
		separatorKoordinatzaile.setBounds(27, 122, 158, 2);
		contentPane.add(separatorKoordinatzaile);

		textIzena = new JTextField();
		textIzena.addFocusListener(this);
		textIzena.setFont(new Font("Montserrat", Font.PLAIN, 12));
		textIzena.setBounds(605, 89, 151, 19);
		contentPane.add(textIzena);
		textIzena.setColumns(10);

		lblIzena = new JLabel("Izena");
		lblIzena.setFont(new Font("Montserrat", Font.PLAIN, 12));
		lblIzena.setBounds(455, 93, 122, 13);
		contentPane.add(lblIzena);

		textAbizena = new JTextField();
		textAbizena.addFocusListener(this);
		textAbizena.setFont(new Font("Montserrat", Font.PLAIN, 12));
		textAbizena.setColumns(10);
		textAbizena.setBounds(605, 122, 151, 19);
		contentPane.add(textAbizena);

		lblAbizena = new JLabel("Abizena");
		lblAbizena.setFont(new Font("Montserrat", Font.PLAIN, 12));
		lblAbizena.setBounds(455, 126, 122, 13);
		contentPane.add(lblAbizena);

		textJaiotzeData = new JTextField();
		textJaiotzeData.addFocusListener(this);
		textJaiotzeData.setFont(new Font("Montserrat", Font.PLAIN, 12));
		textJaiotzeData.setColumns(10);
		textJaiotzeData.setBounds(605, 184, 151, 19);
		contentPane.add(textJaiotzeData);

		lblJaiotzeData = new JLabel("Jaiotze Data");
		lblJaiotzeData.setFont(new Font("Montserrat", Font.PLAIN, 12));
		lblJaiotzeData.setBounds(455, 188, 122, 13);
		contentPane.add(lblJaiotzeData);

		textJatorrizkoHerria = new JTextField();
		textJatorrizkoHerria.addFocusListener(this);
		textJatorrizkoHerria.setFont(new Font("Montserrat", Font.PLAIN, 12));
		textJatorrizkoHerria.setColumns(10);
		textJatorrizkoHerria.setBounds(605, 217, 151, 19);
		contentPane.add(textJatorrizkoHerria);

		lblJatorrizkoHerria = new JLabel("Jatorrizko Herria");
		lblJatorrizkoHerria.setFont(new Font("Montserrat", Font.PLAIN, 12));
		lblJatorrizkoHerria.setBounds(455, 221, 122, 13);
		contentPane.add(lblJatorrizkoHerria);

		lblSexua = new JLabel("Sexua");
		lblSexua.setFont(new Font("Montserrat", Font.PLAIN, 12));
		lblSexua.setBounds(455, 259, 122, 13);
		contentPane.add(lblSexua);

		rdbtnEmakume = new JRadioButton("Emakumezkoa");
		rdbtnEmakume.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnGizkon.setSelected(false);
				sexua = "F";
			}
		});
		rdbtnEmakume.setFont(new Font("Montserrat", Font.PLAIN, 12));
		rdbtnEmakume.setBackground(new Color(255, 255, 255));
		rdbtnEmakume.setBounds(481, 278, 122, 21);
		contentPane.add(rdbtnEmakume);

		rdbtnGizkon = new JRadioButton("Gizkonezkoa");
		rdbtnGizkon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnEmakume.setSelected(false);
				sexua = "M";
			}
		});
		rdbtnGizkon.setFont(new Font("Montserrat", Font.PLAIN, 12));
		rdbtnGizkon.setBackground(Color.WHITE);
		rdbtnGizkon.setBounds(634, 278, 122, 21);
		contentPane.add(rdbtnGizkon);

		lblPostu = new JLabel("Lanpostua");
		lblPostu.setFont(new Font("Montserrat", Font.PLAIN, 12));
		lblPostu.setBounds(455, 319, 122, 13);
		contentPane.add(lblPostu);

		rdbtnKoordinatzaile = new JRadioButton("Koordinatzaile");
		rdbtnKoordinatzaile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				rdbtnEntrenatzaile.setSelected(false);
				rdbtnFisioterapeuta.setSelected(false);
				textKolegiatuZenbakia.setEnabled(false);
			}
		});
		rdbtnKoordinatzaile.setFont(new Font("Montserrat", Font.PLAIN, 12));
		rdbtnKoordinatzaile.setBackground(Color.WHITE);
		rdbtnKoordinatzaile.setBounds(481, 343, 122, 21);
		contentPane.add(rdbtnKoordinatzaile);

		rdbtnEntrenatzaile = new JRadioButton("Entrenatzaile");
		rdbtnEntrenatzaile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnKoordinatzaile.setSelected(false);
				rdbtnFisioterapeuta.setSelected(false);
				textKolegiatuZenbakia.setEnabled(false);
			}
		});
		rdbtnEntrenatzaile.setFont(new Font("Montserrat", Font.PLAIN, 12));
		rdbtnEntrenatzaile.setBackground(Color.WHITE);
		rdbtnEntrenatzaile.setBounds(634, 343, 122, 21);
		contentPane.add(rdbtnEntrenatzaile);

		rdbtnFisioterapeuta = new JRadioButton("Fisioterapeuta");
		rdbtnFisioterapeuta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnKoordinatzaile.setSelected(false);
				rdbtnEntrenatzaile.setSelected(false);
				textKolegiatuZenbakia.setEnabled(true);
			}
		});
		rdbtnFisioterapeuta.setFont(new Font("Montserrat", Font.PLAIN, 12));
		rdbtnFisioterapeuta.setBackground(Color.WHITE);
		rdbtnFisioterapeuta.setBounds(481, 376, 122, 21);
		contentPane.add(rdbtnFisioterapeuta);

		textKolegiatuZenbakia = new JTextField();
		textKolegiatuZenbakia.addFocusListener(this);
		textKolegiatuZenbakia.setEnabled(false);
		textKolegiatuZenbakia.setForeground(new Color(192, 192, 192));
		textKolegiatuZenbakia.setText("Kolegiatu Znb");
		textKolegiatuZenbakia.setFont(new Font("Montserrat", Font.PLAIN, 12));
		textKolegiatuZenbakia.setColumns(10);
		textKolegiatuZenbakia.setBounds(634, 370, 122, 27);
		contentPane.add(textKolegiatuZenbakia);

		btnSortu = new JButton("Sortu");
		btnSortu.addActionListener(this);
		btnSortu.setBorderPainted(false);
		btnSortu.setBorder(new EmptyBorder(1, 1, 1, 1));
		btnSortu.setForeground(new Color(255, 255, 255));
		btnSortu.setBackground(new Color(104, 111, 119));
		btnSortu.setFont(new Font("Montserrat", Font.PLAIN, 16));
		btnSortu.setBounds(531, 432, 85, 33);
		contentPane.add(btnSortu);

		btnSortuTaldea = new JButton("Sortu Taldea");
		btnSortuTaldea.addActionListener(this);
		btnSortuTaldea.setForeground(new Color(255, 255, 255));
		btnSortuTaldea.setFont(new Font("Montserrat", Font.PLAIN, 16));
		btnSortuTaldea.setBorder(null);
		btnSortuTaldea.setBackground(new Color(0, 107, 183));
		btnSortuTaldea.setBounds(626, 432, 139, 33);
		contentPane.add(btnSortuTaldea);

		btnAtzera = new JButton("ATZERA");
		btnAtzera.addActionListener(this);
		btnAtzera.setContentAreaFilled(false);
		btnAtzera.setForeground(new Color(0, 0, 0));
		btnAtzera.setFont(new Font("Montserrat", Font.PLAIN, 16));
		btnAtzera.setBorderPainted(false);
		btnAtzera.setBorder(new EmptyBorder(1, 1, 1, 1));
		btnAtzera.setBackground(new Color(104, 111, 119));
		btnAtzera.setBounds(671, 30, 85, 33);
		contentPane.add(btnAtzera);

		btnEzabatu = new JButton("Ezabatu");
		btnEzabatu.addActionListener(this);
		btnEzabatu.setForeground(Color.WHITE);
		btnEzabatu.setFont(new Font("Montserrat", Font.PLAIN, 16));
		btnEzabatu.setBorderPainted(false);
		btnEzabatu.setBorder(new EmptyBorder(1, 1, 1, 1));
		btnEzabatu.setBackground(new Color(104, 111, 119));
		btnEzabatu.setBounds(436, 432, 85, 33);
		contentPane.add(btnEzabatu);

		textNan = new JTextField();
		textNan.addFocusListener(this);
		textNan.setFont(new Font("Montserrat", Font.PLAIN, 12));
		textNan.setColumns(10);
		textNan.setBounds(605, 153, 151, 19);
		contentPane.add(textNan);

		lblNanZnb = new JLabel("Nan Zenbakia");
		lblNanZnb.setFont(new Font("Montserrat", Font.PLAIN, 12));
		lblNanZnb.setBounds(455, 157, 122, 13);
		contentPane.add(lblNanZnb);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();

		if (o == btnSortu) {

			if (datuakBeteta()) {
				
				if(rdbtnEntrenatzaile.isSelected()) {
					rola = "Entrenatzailea";
				} else if (rdbtnFisioterapeuta.isSelected()) {
					rola = "Fisioterapeuta";
					fisio = true;
				} else if (rdbtnKoordinatzaile.isSelected()) {
					rola = "Koordinatzailea";
				}
				
				boolean badago = false;

				switch (rola) {
				case "Jokalaria":
					//Objektua sortu
					Taldekide Jokalari = new Taldekide(textNan.getText(), textIzena.getText(), textAbizena.getText(),
							textJaiotzeData.getText(), textJatorrizkoHerria.getText(), sexua, rola);
					//Zerrenda hutsik ez badago begiratu ea objektua jada dagoen
					if (!dlmJokalariak.isEmpty()) {
						for (int i = 0; i < dlmJokalariak.size(); i++) {
							if (Jokalari.equals(dlmJokalariak.get(i))) {
								badago = true;
							}
						}
						//Objektua ez badago zerrendan, alfabetikoki sartu
						if (!badago) {
							int pos = dlmJokalariak.size();

							for (int i = 0; i < dlmJokalariak.size(); i++) {
								if (Jokalari.compareTo(dlmJokalariak.get(i)) < 0) {
									pos = i;
									break;
								}
							}

							dlmJokalariak.add(pos, Jokalari);
							gordeIrakurri.gordeTaldekide(dlmJokalariak, "jokalariak.txt");

						} else {
							JOptionPane.showMessageDialog(contentPane, "Jokalari hau taldean dago jada.");
						}

					//Zerrenda hutsik badago objektua sartu
					} else {
						dlmJokalariak.addElement(Jokalari);
						gordeIrakurri.gordeTaldekide(dlmJokalariak, "jokalariak.txt");
					}

					break;
				case "Entrenatzailea":
					//Objektua sortu
					Taldekide Entrenatzaile = new Taldekide(textNan.getText(), textIzena.getText(),
							textAbizena.getText(), textJaiotzeData.getText(), textJatorrizkoHerria.getText(), sexua,
							rola);
					//Zerrenda hutsik ez badago begiratu ea objektua jada dagoen
					if (!dlmEntrenatzaileak.isEmpty()) {
						for (int i = 0; i < dlmEntrenatzaileak.size(); i++) {
							if (Entrenatzaile.equals(dlmEntrenatzaileak.get(i))) {
								badago = true;
							}
						}
						//Objektua ez badago zerrendan, alfabetikoki sartu
						if (!badago) {
							int pos = dlmEntrenatzaileak.size();

							for (int i = 0; i < dlmEntrenatzaileak.size(); i++) {
								if (Entrenatzaile.compareTo(dlmEntrenatzaileak.get(i)) < 0) {
									pos = i;
									break;
								}
							}

							dlmEntrenatzaileak.add(pos, Entrenatzaile);
							gordeIrakurri.gordeTaldekide(dlmEntrenatzaileak, "entrenatzaileak.txt");

						} else {
							JOptionPane.showMessageDialog(contentPane, "Entrenatzaile hau taldean dago jada.");
						}
					//Zerrenda hutsik badago objektua sartu
					} else {
						dlmEntrenatzaileak.addElement(Entrenatzaile);
						gordeIrakurri.gordeTaldekide(dlmEntrenatzaileak, "entrenatzaileak.txt");
					}

					break;
				case "Koordinatzailea":
					//Objektua sortu
					Taldekide Koordinatzaile = new Taldekide(textNan.getText(), textIzena.getText(),
							textAbizena.getText(), textJaiotzeData.getText(), textJatorrizkoHerria.getText(), sexua,
							rola);
					//Zerrenda hutsik ez badago begiratu ea objektua jada dagoen
					if (!dlmKoordinatzaile.isEmpty()) {
						for (int i = 0; i < dlmKoordinatzaile.size(); i++) {
							if (Koordinatzaile.equals(dlmKoordinatzaile.get(i))) {
								badago = true;
							}
						}
						//Objektua ez badago zerrendan, alfabetikoki sartu
						if (!badago) {
							int pos = dlmKoordinatzaile.size();

							for (int i = 0; i < dlmKoordinatzaile.size(); i++) {
								if (Koordinatzaile.compareTo(dlmKoordinatzaile.get(i)) < 0) {
									pos = i;
									break;
								}
							}

							dlmKoordinatzaile.add(pos, Koordinatzaile);
							gordeIrakurri.gordeTaldekide(dlmKoordinatzaile, "koordinatzaile.txt");

						} else {
							JOptionPane.showMessageDialog(contentPane, "Koordinatzaile hau taldean dago jada.");
						}
					//Zerrenda hutsik badago objektua sartu
					} else {
						dlmKoordinatzaile.addElement(Koordinatzaile);
						gordeIrakurri.gordeTaldekide(dlmKoordinatzaile, "koordinatzaile.txt");
					}
					break;
				case "Fisioterapeuta":
					//Objektua sortu
					Taldekide Fisio = new Taldekide(textNan.getText(), textIzena.getText(), textAbizena.getText(),
							textJaiotzeData.getText(), textJatorrizkoHerria.getText(), sexua, rola);
					//Zerrenda hutsik ez badago begiratu ea objektua jada dagoen
					if (!dlmFisio.isEmpty()) {
						for (int i = 0; i < dlmFisio.size(); i++) {
							if (Fisio.equals(dlmFisio.get(i))) {
								badago = true;
							}
						}
						//Objektua ez badago zerrendan, alfabetikoki sartu
						if (!badago) {
							int pos = dlmFisio.size();

							for (int i = 0; i < dlmFisio.size(); i++) {
								if (Fisio.compareTo(dlmFisio.get(i)) < 0) {
									pos = i;
									break;
								}
							}

							dlmFisio.add(pos, Fisio);
							gordeIrakurri.gordeTaldekide(dlmFisio, "fisioak.txt");

						} else {
							JOptionPane.showMessageDialog(contentPane, "Koordinatzaile hau taldean dago jada.");
						}
						//Zerrenda hutsik badago objektua sartu
					} else {
						dlmFisio.addElement(Fisio);
						gordeIrakurri.gordeTaldekide(dlmFisio, "fisioak.txt");
					}
					break;
				}
			}
		}

		if (o == btnEzabatu) {
			//Lau zerrendetatik ezabatzeko
			int indexJ = listJokalariak.getSelectedIndex();
			int indexK = listKoordinatzaileak.getSelectedIndex();
			int indexE = listEntrenatzaileak.getSelectedIndex();
			int indexF = listFisio.getSelectedIndex();

			if (!listJokalariak.isSelectionEmpty()) {
				dlmJokalariak.remove(indexJ);
				gordeIrakurri.gordeTaldekide(dlmJokalariak, "jokalariak.txt");

			} else if (!listEntrenatzaileak.isSelectionEmpty()) {
				dlmEntrenatzaileak.remove(indexE);
				gordeIrakurri.gordeTaldekide(dlmEntrenatzaileak, "entrenatzaileak.txt");

			} else if (!listKoordinatzaileak.isSelectionEmpty()) {
				dlmKoordinatzaile.remove(indexK);
				gordeIrakurri.gordeTaldekide(dlmKoordinatzaile, "koordinatzaile.txt");

			} else if (!listFisio.isSelectionEmpty()) {
				dlmFisio.remove(indexF);
				gordeIrakurri.gordeTaldekide(dlmFisio, "fisioak.txt");

			} else {
				JOptionPane.showMessageDialog(contentPane, "Errorea Ezabatzean. Ez duzu taldekiderik aukeratu");
			}

		}

		if (o == btnAtzera) {

			adminWindow m = new adminWindow();
			m.setVisible(true);
			m.setBounds(100, 100, 800, 500);

			dispose();

		}

		if (o == btnSortuTaldea) {
			if (taldekideNahikoa() && taldekideGehiegi()) {
				sortuTaldea m = new sortuTaldea();
				m.setVisible(true);
				m.setBounds(100, 100, 800, 500);

				dispose();
			}
		}
	}

	// Datuak ondo dauden kontrolatzeko metodoa
	private boolean datuakBeteta() {
		//izena, abizena, nan, jaiote urtea eta jatorrizko herria idatzi dituela kontrolatzeko
		if (!textIzena.getText().isEmpty() && !textAbizena.getText().isEmpty() && !textNan.getText().isEmpty()
				&& !textJatorrizkoHerria.getText().isEmpty() && !textJaiotzeData.getText().isEmpty()) {
			//sexua aukeratu duela kontrolatzeko
			if (rdbtnEmakume.isSelected() || rdbtnGizkon.isSelected()) {
				if (fisio) {
					//fisioa bada kolegiatu zenbakia beharrezkoa da
					if (!textKolegiatuZenbakia.getText().isEmpty()) {
						return true;
					} else {
						JOptionPane.showMessageDialog(contentPane,
								"Sartu fisioterapeutaren kolegiatu zenbakia mesedez");
						return false;
					}
				} else {
					return true;
				}
			} else {
				JOptionPane.showMessageDialog(contentPane, "Aukeratu taldekidearen sexua mesedez");
				return false;
			}
		} else {
			JOptionPane.showMessageDialog(contentPane, "Sartu taldekidearen datuak");
			return false;
		}
	}
	
	//talde bakoitzean 5 jokalari, 1 koordinatzaile, 1 entrenatzaile eta 1 fisio minimo daudela begiratzeko
	private boolean taldekideNahikoa() {
		if(dlmEntrenatzaileak.size()>=1 && dlmFisio.size()==1 && dlmJokalariak.size()>=5 && dlmKoordinatzaile.size()==1) {
			return true;
		} else {
			JOptionPane.showMessageDialog(contentPane, "Talde bakoitzean bost jokalari eta entrenatzaile bat egon behar dute gutxienez.");
			return false;
		}
	}
	
	private boolean taldekideGehiegi() {
		if(dlmEntrenatzaileak.size()<3 && dlmFisio.size()==1 && dlmJokalariak.size()<13 && dlmKoordinatzaile.size()==1) {
			return true;
		}else {
			JOptionPane.showMessageDialog(contentPane, "Talde bakoitzean hamabi jokalari, bi entrenatzaile, koordinatzaile bat eta fisio bat egon behar dute gehienez.");
			return false;
		}
	}

	@Override
	public void focusGained(FocusEvent e) {
		Object o = e.getSource();
		
		if (o == textIzena) {
			textIzena.setText("");
		}
		if (o == textAbizena) {
			textAbizena.setText("");
		}
		if (o == textJaiotzeData) {
			textJaiotzeData.setText("");
		}
		if (o == textJatorrizkoHerria) {
			textJatorrizkoHerria.setText("");
		}
		if (o == textKolegiatuZenbakia) {
			textKolegiatuZenbakia.setText("");
		}
		if (o == textNan) {
			textNan.setText("");
		}
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}



}
