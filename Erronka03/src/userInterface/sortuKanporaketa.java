package userInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import classes.Epaile;
import classes.Kanporaketa;
import classes.Talde;
import classes.Taldekide;
import classes.gordeIrakurri;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
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
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class sortuKanporaketa extends JFrame implements ActionListener, FocusListener {

	private JPanel contentPane;
	private JLabel lblSortuKanporaketa;
	private JLabel lblAukeratuak;
	private JSeparator separatorEntrenatzaile;
	private JList<Talde> listAukeratuak;
	private DefaultListModel<Talde> dlmAukeratuak;
	private JList<Talde> listTaldeak;
	private DefaultListModel<Talde> dlmTaldeak;
	private JLabel lblTaldeak;
	private JSeparator separatorKoordinatzaile;
	private JButton btnSortuKanporaketa;
	private JButton btnAtzera;
	private JButton btnAukeratuTaldea;
	private JButton btnEzabatuTaldea;
	private JTextField textHasieraData;
	private JTextField textAmaieraData;
	private JLabel lblHasieraData;
	private JLabel lblAmaieraData;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sortuKanporaketa frame = new sortuKanporaketa();
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
	public sortuKanporaketa() {
		setUndecorated(true);
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblSortuKanporaketa = new JLabel("Sortu Kanporaketa");
		lblSortuKanporaketa.setFont(new Font("Montserrat", Font.PLAIN, 25));
		lblSortuKanporaketa.setBounds(40, 38, 359, 42);
		contentPane.add(lblSortuKanporaketa);

		lblAukeratuak = new JLabel("Talde Aukeratuak");
		lblAukeratuak.setFont(new Font("Montserrat", Font.PLAIN, 16));
		lblAukeratuak.setBounds(298, 105, 158, 27);
		contentPane.add(lblAukeratuak);

		separatorEntrenatzaile = new JSeparator();
		separatorEntrenatzaile.setBounds(298, 138, 158, 2);
		contentPane.add(separatorEntrenatzaile);

		listAukeratuak = new JList<Talde>();
		listAukeratuak.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listAukeratuak.setFont(new Font("Montserrat", Font.PLAIN, 12));
		listAukeratuak.setBounds(298, 150, 230, 307);
		contentPane.add(listAukeratuak);

		dlmAukeratuak = new DefaultListModel<Talde>();
		listAukeratuak.setModel(dlmAukeratuak);

		// Kargatu gordetako taldeak
		ArrayList<Talde> taldeAukeratuak = gordeIrakurri.irakurriTalde("taldeAukeratuak.txt");
		for (int i = 0; i < taldeAukeratuak.size(); i++) {
			dlmAukeratuak.addElement(taldeAukeratuak.get(i));
		}

		listTaldeak = new JList<Talde>();
		listTaldeak.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listTaldeak.setFont(new Font("Montserrat", Font.PLAIN, 12));
		listTaldeak.setBounds(40, 150, 230, 307);
		contentPane.add(listTaldeak);

		dlmTaldeak = new DefaultListModel<Talde>();
		listTaldeak.setModel(dlmTaldeak);

		// Kargatu gordetako taldeak
		ArrayList<Talde> taldeak = gordeIrakurri.irakurriTalde("taldeak.txt");
		for (int i = 0; i < taldeak.size(); i++) {
			dlmTaldeak.addElement(taldeak.get(i));
		}

		lblTaldeak = new JLabel("Taldeak");
		lblTaldeak.setFont(new Font("Montserrat", Font.PLAIN, 16));
		lblTaldeak.setBounds(40, 105, 158, 27);
		contentPane.add(lblTaldeak);

		separatorKoordinatzaile = new JSeparator();
		separatorKoordinatzaile.setBounds(40, 138, 158, 2);
		contentPane.add(separatorKoordinatzaile);

		btnSortuKanporaketa = new JButton("Sortu Kanporaketa");
		btnSortuKanporaketa.addActionListener(this);
		btnSortuKanporaketa.setForeground(new Color(255, 255, 255));
		btnSortuKanporaketa.setFont(new Font("Montserrat", Font.PLAIN, 16));
		btnSortuKanporaketa.setBorder(null);
		btnSortuKanporaketa.setBackground(new Color(0, 107, 183));
		btnSortuKanporaketa.setBounds(590, 402, 169, 33);
		contentPane.add(btnSortuKanporaketa);

		btnAtzera = new JButton("ATZERA");
		btnAtzera.addActionListener(this);
		btnAtzera.setContentAreaFilled(false);
		btnAtzera.setForeground(new Color(0, 0, 0));
		btnAtzera.setFont(new Font("Montserrat", Font.PLAIN, 16));
		btnAtzera.setBorderPainted(false);
		btnAtzera.setBorder(new EmptyBorder(1, 1, 1, 1));
		btnAtzera.setBackground(new Color(104, 111, 119));
		btnAtzera.setBounds(684, 46, 85, 33);
		contentPane.add(btnAtzera);

		btnAukeratuTaldea = new JButton("Aukeratu Taldea");
		btnAukeratuTaldea.addActionListener(this);
		btnAukeratuTaldea.setForeground(Color.WHITE);
		btnAukeratuTaldea.setFont(new Font("Montserrat", Font.PLAIN, 16));
		btnAukeratuTaldea.setBorder(null);
		btnAukeratuTaldea.setBackground(new Color(104, 111, 119));
		btnAukeratuTaldea.setBounds(590, 138, 169, 33);
		contentPane.add(btnAukeratuTaldea);

		btnEzabatuTaldea = new JButton("Ezabatu Taldea");
		btnEzabatuTaldea.addActionListener(this);
		btnEzabatuTaldea.setForeground(Color.WHITE);
		btnEzabatuTaldea.setFont(new Font("Montserrat", Font.PLAIN, 16));
		btnEzabatuTaldea.setBorder(null);
		btnEzabatuTaldea.setBackground(new Color(104, 111, 119));
		btnEzabatuTaldea.setBounds(590, 190, 169, 33);
		contentPane.add(btnEzabatuTaldea);

		textHasieraData = new JTextField();
		textHasieraData.addFocusListener(this);
		textHasieraData.setFont(new Font("Montserrat", Font.PLAIN, 12));
		textHasieraData.setBounds(686, 306, 73, 20);
		contentPane.add(textHasieraData);
		textHasieraData.setColumns(10);

		lblHasieraData = new JLabel("Hasiera Data");
		lblHasieraData.setFont(new Font("Montserrat", Font.PLAIN, 12));
		lblHasieraData.setBounds(590, 306, 86, 20);
		contentPane.add(lblHasieraData);

		textAmaieraData = new JTextField();
		textAmaieraData.addFocusListener(this);
		textAmaieraData.setFont(new Font("Montserrat", Font.PLAIN, 12));
		textAmaieraData.setColumns(10);
		textAmaieraData.setBounds(686, 337, 73, 20);
		contentPane.add(textAmaieraData);

		lblAmaieraData = new JLabel("Amaiera Data");
		lblAmaieraData.setFont(new Font("Montserrat", Font.PLAIN, 12));
		lblAmaieraData.setBounds(590, 337, 86, 20);
		contentPane.add(lblAmaieraData);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();

		if (o==btnAtzera) {
			adminWindow m = new adminWindow();
			m.setVisible(true);
			m.setBounds(100, 100, 800, 500);

			dispose();
		}
		
		//Aukeratu talde bat
		if (o == btnAukeratuTaldea) {
			int index = listTaldeak.getSelectedIndex();

			if (!listTaldeak.isSelectionEmpty()) {
				dlmAukeratuak.addElement(dlmTaldeak.get(index));
				dlmTaldeak.remove(index);
				ArrayList<Talde> taldeak = dlmToArrayList(dlmTaldeak);
				ArrayList<Talde> aukeratuak = dlmToArrayList(dlmAukeratuak);

				gordeIrakurri.gordeTalde(taldeak, "taldeak.txt");
				gordeIrakurri.gordeTalde(aukeratuak, "taldeAukeratuak.txt");

			} else {
				JOptionPane.showMessageDialog(contentPane, "Errorea Ezabatzean. Ez duzu taldekiderik aukeratu");
			}
		}

		//Ezabatu talde bat aukeratuak zerrendatik
		if (o == btnEzabatuTaldea) {
			int index = listAukeratuak.getSelectedIndex();

			if (!listAukeratuak.isSelectionEmpty()) {
				dlmTaldeak.addElement(dlmAukeratuak.get(index));
				dlmAukeratuak.remove(index);
				ArrayList<Talde> taldeak = dlmToArrayList(dlmTaldeak);
				ArrayList<Talde> aukeratuak = dlmToArrayList(dlmAukeratuak);

				gordeIrakurri.gordeTalde(taldeak, "taldeak.txt");
				gordeIrakurri.gordeTalde(aukeratuak, "taldeAukeratuak.txt");

			} else {
				JOptionPane.showMessageDialog(contentPane, "Errorea Ezabatzean. Ez duzu taldekiderik aukeratu");
			}
		}

		if (o == btnSortuKanporaketa) {
			Kanporaketa K = gordeIrakurri.irakurriKanporaketak("kanporaketak.txt");
			Boolean amaituda = false;
			if (K != null) {
				if (K.isFinalfinished()) {
					amaituda = true;
				}
			} else {
				amaituda = true;
			}
			
			if (amaituda && datuakSartuta()) {

				// Irakurri amaitu diren kanporaketa guztiak eta gehitu amaitu berri den
				// kanporaketa zerrendara
				ArrayList<Kanporaketa> kanporaketak = gordeIrakurri.irakurriKanporaketakOld("kanporaketakOld.txt");

				kanporaketak.add(K);
				gordeIrakurri.gordeKanporaketakOld(kanporaketak, "kanporaketakOld.txt");

				// Sortu kanporaketa berria
				Kanporaketa Kberria = new Kanporaketa(dlmAukeratuak, textHasieraData.getText(),
						textAmaieraData.getText());
				gordeIrakurri.gordeKanporaketa(Kberria, "kanporaketak.txt");

				// Pasatu talde guztiak berriro hasierako zerrendara
				for (int i = 0; i < dlmAukeratuak.size(); i++) {
					dlmTaldeak.addElement(dlmAukeratuak.get(i));
					
				}
				dlmAukeratuak.clear();

				//gorde kanporaketa berria eta kanporaketa zahar guztiak
				ArrayList<Talde> taldeak = dlmToArrayList(dlmTaldeak);
				ArrayList<Talde> aukeratuak = dlmToArrayList(dlmAukeratuak);

				gordeIrakurri.gordeTalde(taldeak, "taldeak.txt");
				gordeIrakurri.gordeTalde(aukeratuak, "taldeAukeratuak.txt");

				adminWindow m = new adminWindow();
				m.setVisible(true);
				m.setBounds(100, 100, 800, 500);

				dispose();
			} else {
				JOptionPane.showMessageDialog(contentPane, "Aurtengo kanporaketa ez da amaitu, ezin duzu kanporaketa berririk sortu");
			}
		}
	}

	//datuak sartuta dauden konptobatzeko metodoa
	public boolean datuakSartuta() {
		ArrayList<Epaile> epaileak = gordeIrakurri.irakurriEpaile("epaile.txt");
		if (!textHasieraData.getText().isEmpty() && !textAmaieraData.getText().isEmpty()) {
			if (dlmAukeratuak.size() == 8) {
				if (epaileak.size() > 1) {
					return true;
				} else {
					JOptionPane.showMessageDialog(contentPane, "Ez daude epaile nahikoa, sartu gutxienez 2 mesedez");
					return false;
				}
				
			} else {
				JOptionPane.showMessageDialog(contentPane, "Aukeratu 8 talde kanporaketa sortzeko mesedez");
				return false;
			}
		} else {
			JOptionPane.showMessageDialog(contentPane, "Sartu kanporaketaren hasiera eta amaiera datak mesedez");
			return false;
		}
	}

	//Dlm-ak ArrayList bihurtzeko
	public ArrayList<Talde> dlmToArrayList(DefaultListModel<Talde> dlm) {
		ArrayList<Talde> arrayListReturn = new ArrayList<Talde>();
		for (int i = 0; i < dlm.size(); i++) {
			arrayListReturn.add(dlm.get(i));
		}

		return arrayListReturn;
	}

	//ArrayList-ak dlm bihurtzeko
	public DefaultListModel<Talde> arrayListToDlm(ArrayList<Talde> al) {
		DefaultListModel<Talde> dlmReturn = new DefaultListModel<Talde>();
		for (int i = 0; i < al.size(); i++) {
			dlmReturn.addElement(al.get(i));
		}

		return dlmReturn;
	}

	@Override
	public void focusGained(FocusEvent e) {
		Object o = e.getSource();

		if (o == textAmaieraData) {
			textAmaieraData.setText("");
		}

		if (o == textHasieraData) {
			textHasieraData.setText("");
		}

	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub

	}
}
