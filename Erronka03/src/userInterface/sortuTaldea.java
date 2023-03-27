package userInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import classes.Talde;
import classes.Taldekide;
import classes.gordeIrakurri;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class sortuTaldea extends JFrame implements ActionListener,  FocusListener {

	private static final long serialVersionUID = -6630264031970224483L;

	private JPanel contentPane;

	private JLabel lblSortuTaldea;

	private JTextField textIzenaTalde;
	private JTextField textKodea;
	private JTextField textSedea;

	private JLabel lblJokalariak;
	private JLabel lblFisioak;
	private JLabel lblEntrenatzaileak;
	private JLabel lblKoordinatzailea;

	private JLabel lblIzenaTalde;
	private JLabel lblKodea;
	private JLabel lblSedea;

	private JSeparator separatorJokalari;
	private JSeparator separatorFisio;
	private JSeparator separatorKoordinatzaile;
	private JSeparator separatorEntrenatzaile;

	private JList<Taldekide> listEntrenatzaileak;
	private DefaultListModel<Taldekide> dlmEntrenatzaileak;
	private JList<Taldekide> listJokalariak;
	private DefaultListModel<Taldekide> dlmJokalariak;
	private JList<Taldekide> listFisio;
	private DefaultListModel<Taldekide> dlmFisio;
	private JList<Taldekide> listKoordinatzaileak;
	private DefaultListModel<Taldekide> dlmKoordinatzaileak;

	private JButton btnSortuTaldea;
	private JButton btnAtzera;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sortuTaldea frame = new sortuTaldea();
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
	public sortuTaldea() {
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
		lblJokalariak.setBounds(33, 183, 158, 27);
		contentPane.add(lblJokalariak);

		lblSortuTaldea = new JLabel("Sortu Taldea");
		lblSortuTaldea.setFont(new Font("Montserrat", Font.PLAIN, 25));
		lblSortuTaldea.setBounds(33, 25, 359, 42);
		contentPane.add(lblSortuTaldea);

		separatorJokalari = new JSeparator();
		separatorJokalari.setBounds(33, 216, 158, 2);
		contentPane.add(separatorJokalari);

		lblEntrenatzaileak = new JLabel("Entrenatzaileak");
		lblEntrenatzaileak.setFont(new Font("Montserrat", Font.PLAIN, 16));
		lblEntrenatzaileak.setBounds(238, 92, 158, 27);
		contentPane.add(lblEntrenatzaileak);

		separatorEntrenatzaile = new JSeparator();
		separatorEntrenatzaile.setBounds(238, 125, 158, 2);
		contentPane.add(separatorEntrenatzaile);

		listJokalariak = new JList<Taldekide>();
		listJokalariak.setFont(new Font("Montserrat", Font.PLAIN, 12));
		listJokalariak.setBounds(33, 228, 181, 240);
		contentPane.add(listJokalariak);

		dlmJokalariak = new DefaultListModel<Taldekide>();
		listJokalariak.setModel(dlmJokalariak);

		// Kargatu zerrendako izenak
		for (int i = 0; i < gordeIrakurri.irakurriTaldekide("jokalariak.txt").size(); i++) {
			dlmJokalariak.addElement(gordeIrakurri.irakurriTaldekide("jokalariak.txt").get(i));
		}

		listEntrenatzaileak = new JList<Taldekide>();
		listEntrenatzaileak.setFont(new Font("Montserrat", Font.PLAIN, 12));
		listEntrenatzaileak.setBounds(239, 137, 181, 127);
		contentPane.add(listEntrenatzaileak);

		dlmEntrenatzaileak = new DefaultListModel<Taldekide>();
		listEntrenatzaileak.setModel(dlmEntrenatzaileak);

		// Kargatu zerrendako izenak
		for (int i = 0; i < gordeIrakurri.irakurriTaldekide("entrenatzaileak.txt").size(); i++) {
			dlmEntrenatzaileak.addElement(gordeIrakurri.irakurriTaldekide("entrenatzaileak.txt").get(i));
		}

		listFisio = new JList<Taldekide>();
		listFisio.setFont(new Font("Montserrat", Font.PLAIN, 12));
		listFisio.setBounds(238, 341, 181, 127);
		contentPane.add(listFisio);

		dlmFisio = new DefaultListModel<Taldekide>();
		listFisio.setModel(dlmFisio);

		// Kargatu zerrendako izenak
		for (int i = 0; i < gordeIrakurri.irakurriTaldekide("fisioak.txt").size(); i++) {
			dlmFisio.addElement(gordeIrakurri.irakurriTaldekide("fisioak.txt").get(i));
		}

		listKoordinatzaileak = new JList<Taldekide>();
		listKoordinatzaileak.setFont(new Font("Montserrat", Font.PLAIN, 12));
		listKoordinatzaileak.setBounds(33, 137, 181, 38);
		contentPane.add(listKoordinatzaileak);

		dlmKoordinatzaileak = new DefaultListModel<Taldekide>();
		listKoordinatzaileak.setModel(dlmKoordinatzaileak);

		// Kargatu zerrendako izenak
		for (int i = 0; i < gordeIrakurri.irakurriTaldekide("koordinatzaile.txt").size(); i++) {
			dlmKoordinatzaileak.addElement(gordeIrakurri.irakurriTaldekide("koordinatzaile.txt").get(i));
		}

		lblFisioak = new JLabel("Fisioterapeutak");
		lblFisioak.setFont(new Font("Montserrat", Font.PLAIN, 16));
		lblFisioak.setBounds(238, 296, 158, 27);
		contentPane.add(lblFisioak);

		separatorFisio = new JSeparator();
		separatorFisio.setBounds(238, 329, 158, 2);
		contentPane.add(separatorFisio);

		lblKoordinatzailea = new JLabel("Koordinatzailea");
		lblKoordinatzailea.setFont(new Font("Montserrat", Font.PLAIN, 16));
		lblKoordinatzailea.setBounds(33, 92, 158, 27);
		contentPane.add(lblKoordinatzailea);

		separatorKoordinatzaile = new JSeparator();
		separatorKoordinatzaile.setBounds(33, 125, 158, 2);
		contentPane.add(separatorKoordinatzaile);

		textIzenaTalde = new JTextField();
		textIzenaTalde.addFocusListener(this);
		textIzenaTalde.setFont(new Font("Montserrat", Font.PLAIN, 12));
		textIzenaTalde.setBounds(619, 200, 151, 19);
		contentPane.add(textIzenaTalde);
		textIzenaTalde.setColumns(10);

		lblIzenaTalde = new JLabel("Izena");
		lblIzenaTalde.setFont(new Font("Montserrat", Font.PLAIN, 12));
		lblIzenaTalde.setBounds(469, 204, 122, 13);
		contentPane.add(lblIzenaTalde);

		textKodea = new JTextField();
		textKodea.addFocusListener(this);
		textKodea.setFont(new Font("Montserrat", Font.PLAIN, 12));
		textKodea.setColumns(10);
		textKodea.setBounds(619, 233, 151, 19);
		contentPane.add(textKodea);

		lblKodea = new JLabel("Kodea");
		lblKodea.setFont(new Font("Montserrat", Font.PLAIN, 12));
		lblKodea.setBounds(469, 237, 122, 13);
		contentPane.add(lblKodea);

		textSedea = new JTextField();
		textSedea.addFocusListener(this);
		textSedea.setFont(new Font("Montserrat", Font.PLAIN, 12));
		textSedea.setColumns(10);
		textSedea.setBounds(619, 265, 151, 19);
		contentPane.add(textSedea);

		lblSedea = new JLabel("Taldearen Sedea");
		lblSedea.setFont(new Font("Montserrat", Font.PLAIN, 12));
		lblSedea.setBounds(469, 269, 122, 13);
		contentPane.add(lblSedea);

		btnSortuTaldea = new JButton("Sortu Taldea");
		btnSortuTaldea.addActionListener(this);
		btnSortuTaldea.setForeground(new Color(255, 255, 255));
		btnSortuTaldea.setFont(new Font("Montserrat", Font.PLAIN, 16));
		btnSortuTaldea.setBorder(null);
		btnSortuTaldea.setBackground(new Color(0, 107, 183));
		btnSortuTaldea.setBounds(546, 329, 139, 33);
		contentPane.add(btnSortuTaldea);

		btnAtzera = new JButton("ATZERA");
		btnAtzera.addActionListener(this);
		btnAtzera.setContentAreaFilled(false);
		btnAtzera.setForeground(new Color(0, 0, 0));
		btnAtzera.setFont(new Font("Montserrat", Font.PLAIN, 16));
		btnAtzera.setBorderPainted(false);
		btnAtzera.setBorder(new EmptyBorder(1, 1, 1, 1));
		btnAtzera.setBackground(new Color(104, 111, 119));
		btnAtzera.setBounds(677, 33, 85, 33);
		contentPane.add(btnAtzera);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();

		if (o == btnSortuTaldea) {

			if (datuakSartuta()) {
				// Sortu taldea
				ArrayList<Talde> taldeak = gordeIrakurri.irakurriTalde("taldeak.txt"); 
				
				Talde T = new Talde(textIzenaTalde.getText(), textKodea.getText(), textSedea.getText(), dlmJokalariak,
						dlmKoordinatzaileak, dlmEntrenatzaileak, dlmFisio);
				
				taldeak.add(T);
				// taldea fitxategian gorde
				gordeIrakurri.gordeTalde(taldeak, "taldeak.txt");
				gordeIrakurri.gordeTalde(taldeak, "taldeakStable.txt");
				
				// Taldean dauden taldekideak beste fitxategi batera pasatu
				ArrayList<Taldekide> jokalariak = gordeIrakurri.irakurriTaldekide("jokalariakOld.txt");
				for (int i = 0; i < dlmJokalariak.size(); i++) {
					jokalariak.add(dlmJokalariak.get(i));
				}
				ArrayList<Taldekide> entrenatzaileak = gordeIrakurri.irakurriTaldekide("entrenatzaileakOld.txt");
				for (int i = 0; i < dlmEntrenatzaileak.size(); i++) {
					jokalariak.add(dlmEntrenatzaileak.get(i));
				}
				ArrayList<Taldekide> koordinatzaileak = gordeIrakurri.irakurriTaldekide("koordinatzaileakOld.txt");
				for (int i = 0; i < dlmKoordinatzaileak.size(); i++) {
					jokalariak.add(dlmKoordinatzaileak.get(i));
				}
				ArrayList<Taldekide> fisioak = gordeIrakurri.irakurriTaldekide("fisioakOld.txt");
				for (int i = 0; i < dlmFisio.size(); i++) {
					jokalariak.add(dlmFisio.get(i));
				}
				
				
				gordeIrakurri.aldatuTaldekide(jokalariak,"jokalariak.txt", "jokalariakOld.txt");
				gordeIrakurri.aldatuTaldekide(entrenatzaileak,"entrenatzaileak.txt", "entrenatzaileakOld.txt");
				gordeIrakurri.aldatuTaldekide(koordinatzaileak,"koordinatzaile.txt", "koordinatzaileakOld.txt");
				gordeIrakurri.aldatuTaldekide(fisioak,"fisioak.txt", "fisioakOld.txt");
				
				if (taldeak.size()==8) {
					adminWindow m = new adminWindow();
					m.setVisible(true);
					m.setBounds(100, 100, 800, 500);

					dispose();
				} else {
					sortuTaldekideak m = new sortuTaldekideak();
					m.setVisible(true);
					m.setBounds(100, 100, 800, 500);

					dispose();
				}
				
			}
		}
		
		if (o == btnAtzera) {
			sortuTaldekideak m = new sortuTaldekideak();
			m.setVisible(true);
			m.setBounds(100, 100, 800, 500);

			dispose();
		}
	}

	@Override
	public void focusGained(FocusEvent e) {
		Object o = e.getSource();

		if (o == textIzenaTalde) {
			textIzenaTalde.setText("");
		}
		
		if (o == textKodea) {
			textKodea.setText("");
		}
		
		if (o == textSedea) {
			textSedea.setText("");
		}
	}
	
	// Datuak ondo sartuta dauden kontrolatzeko
	public boolean datuakSartuta() {
		if (!textIzenaTalde.getText().isEmpty()) {
			if (!textKodea.getText().isEmpty()) {
				if (!textSedea.getText().isEmpty()) {
					return true;
				} else {
					JOptionPane.showMessageDialog(contentPane, "Sartu taldearen sedea");
					return false;
				}
			} else {
				JOptionPane.showMessageDialog(contentPane, "Sartu taldearen kodea");
				return false;
			}
		} else {
			JOptionPane.showMessageDialog(contentPane, "Sartu taldearen izena");
			return false;
		}
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}
}
