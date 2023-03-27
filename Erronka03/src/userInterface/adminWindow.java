package userInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import classes.Kanporaketa;
import classes.gordeIrakurri;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class adminWindow extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblSaikapena;
	private JLabel lblKaixo;
	private JSeparator separatorJokalari;
	private JButton btnSortuTaldea;
	private JButton btnIrten;
	private JButton btnAldatuTaldea;
	private JButton btnSortuKanporaketa;
	private JButton btnSartuEmaitzak;
	private JButton btnEpaileak;
	private JComboBox<String> comboBoxDenboraldi;
	private JLabel lblNewLabel;
	private JLabel lblLaurdenTaldeA;
	private JLabel lblLaurdenTaldeB;
	private JLabel lblLaurdenTaldeD;
	private JLabel lblLaurdenTaldeC;
	private JLabel lblLaurdenTaldeE;
	private JLabel lblLaurdenTaldeF;
	private JLabel lblLaurdenTaldeG;
	private JLabel lblLaurdenTaldeH;
	private JLabel lblSemiTaldeA;
	private JLabel lblSemiTaldeB;
	private JLabel lblSemiTaldeC;
	private JLabel lblSemiTaldeD;
	private JLabel lblFinalTaldeA;
	private JLabel lblFinalTaldeB;
	private JLabel lbl34TaldeA;
	private JLabel lbl34TaldeB;
	private JLabel lblLaurdenPointsA;
	private JLabel lblLaurdenPointsB;
	private JLabel lblLaurdenPointsC;
	private JLabel lblLaurdenPointsD;
	private JLabel lblLaurdenPointsE;
	private JLabel lblLaurdenPointsF;
	private JLabel lblLaurdenPointsG;
	private JLabel lblLaurdenPointsH;
	private JLabel lblSemiPointsA;
	private JLabel lblSemiPointsB;
	private JLabel lblSemiPointsC;
	private JLabel lblSemiPointsD;
	private JLabel lblFinalPointsA;
	private JLabel lblFinalPointsB;
	private JLabel lbl34PointsA;
	private JLabel lbl34PointsB;
	private JLabel lblPos1;
	private JLabel lblPos2;
	private JLabel lblPos3;
	private JLabel lblPos4;
	private JLabel lblArbitroFinal;
	private JLabel lblArbitro34;
	private JLabel lblArbitroLaurden1;
	private JLabel lblArbitroLaurden2;
	private JLabel lblArbitroLaurden3;
	private JLabel lblArbitroLaurden4;
	private JLabel lblArbitroSemi1;
	private JLabel lblArbitroSemi2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminWindow frame = new adminWindow();
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
	public adminWindow() {
		setUndecorated(true);
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblSaikapena = new JLabel("Sailkapena");
		lblSaikapena.setFont(new Font("Montserrat", Font.PLAIN, 16));
		lblSaikapena.setBounds(27, 63, 158, 27);
		contentPane.add(lblSaikapena);

		lblKaixo = new JLabel("Kaixo");
		lblKaixo.setFont(new Font("Montserrat", Font.PLAIN, 25));
		lblKaixo.setBounds(27, 22, 359, 42);
		contentPane.add(lblKaixo);

		separatorJokalari = new JSeparator();
		separatorJokalari.setBounds(27, 88, 158, 2);
		contentPane.add(separatorJokalari);

		btnSortuTaldea = new JButton("Taldeak Sortu");
		btnSortuTaldea.addActionListener(this);
		btnSortuTaldea.setForeground(new Color(255, 255, 255));
		btnSortuTaldea.setFont(new Font("Montserrat", Font.PLAIN, 16));
		btnSortuTaldea.setBorder(null);
		btnSortuTaldea.setBackground(new Color(0, 107, 183));
		btnSortuTaldea.setBounds(598, 153, 164, 33);
		contentPane.add(btnSortuTaldea);

		btnIrten = new JButton("SAIOA ITXI");
		btnIrten.addActionListener(this);
		btnIrten.setContentAreaFilled(false);
		btnIrten.setForeground(new Color(0, 0, 0));
		btnIrten.setFont(new Font("Montserrat", Font.PLAIN, 16));
		btnIrten.setBorderPainted(false);
		btnIrten.setBorder(new EmptyBorder(1, 1, 1, 1));
		btnIrten.setBackground(new Color(104, 111, 119));
		btnIrten.setBounds(644, 32, 117, 33);
		contentPane.add(btnIrten);
		System.setProperty("sun.java2d.uiScale", "1.0");

		btnAldatuTaldea = new JButton("Taldeak Aldatu");
		btnAldatuTaldea.addActionListener(this);
		btnAldatuTaldea.setForeground(Color.WHITE);
		btnAldatuTaldea.setFont(new Font("Montserrat", Font.PLAIN, 16));
		btnAldatuTaldea.setBorder(null);
		btnAldatuTaldea.setBackground(new Color(0, 107, 183));
		btnAldatuTaldea.setBounds(599, 321, 163, 33);
		contentPane.add(btnAldatuTaldea);

		btnSortuKanporaketa = new JButton("Sortu Kanporaketa");
		btnSortuKanporaketa.addActionListener(this);
		btnSortuKanporaketa.setForeground(Color.WHITE);
		btnSortuKanporaketa.setFont(new Font("Montserrat", Font.PLAIN, 16));
		btnSortuKanporaketa.setBorder(null);
		btnSortuKanporaketa.setBackground(new Color(0, 107, 183));
		btnSortuKanporaketa.setBounds(598, 261, 164, 33);
		contentPane.add(btnSortuKanporaketa);

		btnSartuEmaitzak = new JButton("Emaitzak Sartu");
		btnSartuEmaitzak.addActionListener(this);
		btnSartuEmaitzak.setForeground(Color.WHITE);
		btnSartuEmaitzak.setFont(new Font("Montserrat", Font.PLAIN, 16));
		btnSartuEmaitzak.setBorder(null);
		btnSartuEmaitzak.setBackground(new Color(0, 107, 183));
		btnSartuEmaitzak.setBounds(598, 383, 163, 33);
		contentPane.add(btnSartuEmaitzak);
		comboBoxDenboraldi = new JComboBox<String>();
		
		//kargatu horaingo kanporaketa
		comboBoxDenboraldi.addItem("Oraingo kanporaketa");

		//kargatu kanporaketa zaharrak
		ArrayList<Kanporaketa> kanporaketakOld = gordeIrakurri.irakurriKanporaketakOld("kanporaketakOld.txt");
		if (kanporaketakOld.size() > 0) {
			for (int i = 0; i < kanporaketakOld.size(); i++) {
				comboBoxDenboraldi.addItem(kanporaketakOld.get(i).getIzena());
			}

		}

		comboBoxDenboraldi.addActionListener(this);
		comboBoxDenboraldi.setEditable(true);
		comboBoxDenboraldi.setFont(new Font("Montserrat", Font.PLAIN, 12));
		comboBoxDenboraldi.setBounds(579, 79, 183, 27);
		contentPane.add(comboBoxDenboraldi);

		lblLaurdenTaldeA = new JLabel("Undefined");
		lblLaurdenTaldeA.setFont(new Font("Montserrat", Font.PLAIN, 10));
		lblLaurdenTaldeA.setBounds(27, 112, 80, 21);
		contentPane.add(lblLaurdenTaldeA);

		lblLaurdenTaldeB = new JLabel("Undefined");
		lblLaurdenTaldeB.setFont(new Font("Montserrat", Font.PLAIN, 10));
		lblLaurdenTaldeB.setBounds(27, 135, 80, 21);
		contentPane.add(lblLaurdenTaldeB);

		lblLaurdenTaldeD = new JLabel("Undefined");
		lblLaurdenTaldeD.setFont(new Font("Montserrat", Font.PLAIN, 10));
		lblLaurdenTaldeD.setBounds(27, 235, 80, 21);
		contentPane.add(lblLaurdenTaldeD);

		lblLaurdenTaldeC = new JLabel("Undefined");
		lblLaurdenTaldeC.setFont(new Font("Montserrat", Font.PLAIN, 10));
		lblLaurdenTaldeC.setBounds(27, 212, 80, 21);
		contentPane.add(lblLaurdenTaldeC);

		lblLaurdenTaldeE = new JLabel("Undefined");
		lblLaurdenTaldeE.setFont(new Font("Montserrat", Font.PLAIN, 10));
		lblLaurdenTaldeE.setBounds(27, 310, 80, 21);
		contentPane.add(lblLaurdenTaldeE);

		lblLaurdenTaldeF = new JLabel("Undefined");
		lblLaurdenTaldeF.setFont(new Font("Montserrat", Font.PLAIN, 10));
		lblLaurdenTaldeF.setBounds(27, 333, 80, 21);
		contentPane.add(lblLaurdenTaldeF);

		lblLaurdenTaldeG = new JLabel("Undefined");
		lblLaurdenTaldeG.setFont(new Font("Montserrat", Font.PLAIN, 10));
		lblLaurdenTaldeG.setBounds(27, 409, 80, 21);
		contentPane.add(lblLaurdenTaldeG);

		lblLaurdenTaldeH = new JLabel("Undefined");
		lblLaurdenTaldeH.setFont(new Font("Montserrat", Font.PLAIN, 10));
		lblLaurdenTaldeH.setBounds(27, 432, 80, 21);
		contentPane.add(lblLaurdenTaldeH);

		lblSemiTaldeA = new JLabel("Undefined");
		lblSemiTaldeA.setFont(new Font("Montserrat", Font.PLAIN, 10));
		lblSemiTaldeA.setBounds(219, 161, 80, 21);
		contentPane.add(lblSemiTaldeA);

		lblSemiTaldeB = new JLabel("Undefined");
		lblSemiTaldeB.setFont(new Font("Montserrat", Font.PLAIN, 10));
		lblSemiTaldeB.setBounds(219, 184, 80, 21);
		contentPane.add(lblSemiTaldeB);

		lblSemiTaldeC = new JLabel("Undefined");
		lblSemiTaldeC.setFont(new Font("Montserrat", Font.PLAIN, 10));
		lblSemiTaldeC.setBounds(219, 362, 80, 21);
		contentPane.add(lblSemiTaldeC);

		lblSemiTaldeD = new JLabel("Undefined");
		lblSemiTaldeD.setFont(new Font("Montserrat", Font.PLAIN, 10));
		lblSemiTaldeD.setBounds(219, 385, 80, 21);
		contentPane.add(lblSemiTaldeD);

		lblFinalTaldeA = new JLabel("Undefined");
		lblFinalTaldeA.setFont(new Font("Montserrat", Font.PLAIN, 10));
		lblFinalTaldeA.setBounds(411, 262, 80, 21);
		contentPane.add(lblFinalTaldeA);

		lblFinalTaldeB = new JLabel("Undefined");
		lblFinalTaldeB.setFont(new Font("Montserrat", Font.PLAIN, 10));
		lblFinalTaldeB.setBounds(411, 285, 80, 21);
		contentPane.add(lblFinalTaldeB);

		lbl34TaldeA = new JLabel("Undefined");
		lbl34TaldeA.setFont(new Font("Montserrat", Font.PLAIN, 10));
		lbl34TaldeA.setBounds(411, 372, 80, 21);
		contentPane.add(lbl34TaldeA);

		lbl34TaldeB = new JLabel("Undefined");
		lbl34TaldeB.setFont(new Font("Montserrat", Font.PLAIN, 10));
		lbl34TaldeB.setBounds(411, 395, 80, 21);
		contentPane.add(lbl34TaldeB);

		lblLaurdenPointsA = new JLabel("");
		lblLaurdenPointsA.setHorizontalAlignment(SwingConstants.CENTER);
		lblLaurdenPointsA.setFont(new Font("Montserrat", Font.PLAIN, 10));
		lblLaurdenPointsA.setBounds(117, 112, 26, 21);
		contentPane.add(lblLaurdenPointsA);

		lblLaurdenPointsB = new JLabel("");
		lblLaurdenPointsB.setHorizontalAlignment(SwingConstants.CENTER);
		lblLaurdenPointsB.setFont(new Font("Montserrat", Font.PLAIN, 10));
		lblLaurdenPointsB.setBounds(117, 135, 26, 21);
		contentPane.add(lblLaurdenPointsB);

		lblLaurdenPointsC = new JLabel("");
		lblLaurdenPointsC.setHorizontalAlignment(SwingConstants.CENTER);
		lblLaurdenPointsC.setFont(new Font("Montserrat", Font.PLAIN, 10));
		lblLaurdenPointsC.setBounds(117, 212, 26, 21);
		contentPane.add(lblLaurdenPointsC);

		lblLaurdenPointsD = new JLabel("");
		lblLaurdenPointsD.setHorizontalAlignment(SwingConstants.CENTER);
		lblLaurdenPointsD.setFont(new Font("Montserrat", Font.PLAIN, 10));
		lblLaurdenPointsD.setBounds(117, 235, 26, 21);
		contentPane.add(lblLaurdenPointsD);

		lblLaurdenPointsE = new JLabel("");
		lblLaurdenPointsE.setHorizontalAlignment(SwingConstants.CENTER);
		lblLaurdenPointsE.setFont(new Font("Montserrat", Font.PLAIN, 10));
		lblLaurdenPointsE.setBounds(117, 310, 26, 21);
		contentPane.add(lblLaurdenPointsE);

		lblLaurdenPointsF = new JLabel("");
		lblLaurdenPointsF.setHorizontalAlignment(SwingConstants.CENTER);
		lblLaurdenPointsF.setFont(new Font("Montserrat", Font.PLAIN, 10));
		lblLaurdenPointsF.setBounds(117, 333, 26, 21);
		contentPane.add(lblLaurdenPointsF);

		lblLaurdenPointsG = new JLabel("");
		lblLaurdenPointsG.setHorizontalAlignment(SwingConstants.CENTER);
		lblLaurdenPointsG.setFont(new Font("Montserrat", Font.PLAIN, 10));
		lblLaurdenPointsG.setBounds(117, 409, 26, 21);
		contentPane.add(lblLaurdenPointsG);

		lblLaurdenPointsH = new JLabel("");
		lblLaurdenPointsH.setHorizontalAlignment(SwingConstants.CENTER);
		lblLaurdenPointsH.setFont(new Font("Montserrat", Font.PLAIN, 10));
		lblLaurdenPointsH.setBounds(117, 432, 26, 21);
		contentPane.add(lblLaurdenPointsH);

		lblSemiPointsC = new JLabel("");
		lblSemiPointsC.setHorizontalAlignment(SwingConstants.CENTER);
		lblSemiPointsC.setFont(new Font("Montserrat", Font.PLAIN, 10));
		lblSemiPointsC.setBounds(309, 362, 26, 21);
		contentPane.add(lblSemiPointsC);

		lblSemiPointsD = new JLabel("");
		lblSemiPointsD.setHorizontalAlignment(SwingConstants.CENTER);
		lblSemiPointsD.setFont(new Font("Montserrat", Font.PLAIN, 10));
		lblSemiPointsD.setBounds(309, 385, 26, 21);
		contentPane.add(lblSemiPointsD);

		lblFinalPointsA = new JLabel("");
		lblFinalPointsA.setHorizontalAlignment(SwingConstants.CENTER);
		lblFinalPointsA.setFont(new Font("Montserrat", Font.PLAIN, 10));
		lblFinalPointsA.setBounds(504, 262, 26, 21);
		contentPane.add(lblFinalPointsA);

		lblFinalPointsB = new JLabel("");
		lblFinalPointsB.setHorizontalAlignment(SwingConstants.CENTER);
		lblFinalPointsB.setFont(new Font("Montserrat", Font.PLAIN, 10));
		lblFinalPointsB.setBounds(504, 285, 26, 21);
		contentPane.add(lblFinalPointsB);

		lbl34PointsA = new JLabel("");
		lbl34PointsA.setHorizontalAlignment(SwingConstants.CENTER);
		lbl34PointsA.setFont(new Font("Montserrat", Font.PLAIN, 10));
		lbl34PointsA.setBounds(504, 372, 26, 21);
		contentPane.add(lbl34PointsA);

		lbl34PointsB = new JLabel("");
		lbl34PointsB.setHorizontalAlignment(SwingConstants.CENTER);
		lbl34PointsB.setFont(new Font("Montserrat", Font.PLAIN, 10));
		lbl34PointsB.setBounds(504, 395, 26, 21);
		contentPane.add(lbl34PointsB);

		lblPos1 = new JLabel("");
		lblPos1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPos1.setFont(new Font("Montserrat", Font.BOLD, 12));
		lblPos1.setBounds(543, 260, 26, 21);
		contentPane.add(lblPos1);

		lblPos2 = new JLabel("");
		lblPos2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPos2.setFont(new Font("Montserrat", Font.BOLD, 12));
		lblPos2.setBounds(543, 286, 26, 21);
		contentPane.add(lblPos2);

		lblPos3 = new JLabel("");
		lblPos3.setHorizontalAlignment(SwingConstants.CENTER);
		lblPos3.setFont(new Font("Montserrat", Font.BOLD, 12));
		lblPos3.setBounds(543, 369, 26, 21);
		contentPane.add(lblPos3);

		lblPos4 = new JLabel("");
		lblPos4.setHorizontalAlignment(SwingConstants.CENTER);
		lblPos4.setFont(new Font("Montserrat", Font.BOLD, 12));
		lblPos4.setBounds(543, 395, 26, 21);
		contentPane.add(lblPos4);

		lblSemiPointsA = new JLabel("");
		lblSemiPointsA.setHorizontalAlignment(SwingConstants.CENTER);
		lblSemiPointsA.setFont(new Font("Montserrat", Font.PLAIN, 10));
		lblSemiPointsA.setBounds(309, 161, 26, 21);
		contentPane.add(lblSemiPointsA);

		lblSemiPointsB = new JLabel("");
		lblSemiPointsB.setHorizontalAlignment(SwingConstants.CENTER);
		lblSemiPointsB.setFont(new Font("Montserrat", Font.PLAIN, 10));
		lblSemiPointsB.setBounds(309, 184, 26, 21);
		contentPane.add(lblSemiPointsB);

		btnEpaileak = new JButton("Epaileak");
		btnEpaileak.addActionListener(this);
		btnEpaileak.setForeground(Color.WHITE);
		btnEpaileak.setFont(new Font("Montserrat", Font.PLAIN, 16));
		btnEpaileak.setBorder(null);
		btnEpaileak.setBackground(new Color(0, 107, 183));
		btnEpaileak.setBounds(598, 207, 164, 33);
		contentPane.add(btnEpaileak);

		lblArbitroLaurden1 = new JLabel("");
		lblArbitroLaurden1.setFont(new Font("Montserrat", Font.PLAIN, 10));
		lblArbitroLaurden1.setBounds(27, 164, 116, 14);
		contentPane.add(lblArbitroLaurden1);

		lblArbitroLaurden2 = new JLabel("");
		lblArbitroLaurden2.setFont(new Font("Montserrat", Font.PLAIN, 10));
		lblArbitroLaurden2.setBounds(27, 261, 116, 14);
		contentPane.add(lblArbitroLaurden2);

		lblArbitroLaurden3 = new JLabel("");
		lblArbitroLaurden3.setFont(new Font("Montserrat", Font.PLAIN, 10));
		lblArbitroLaurden3.setBounds(27, 362, 116, 14);
		contentPane.add(lblArbitroLaurden3);

		lblArbitroLaurden4 = new JLabel("");
		lblArbitroLaurden4.setFont(new Font("Montserrat", Font.PLAIN, 10));
		lblArbitroLaurden4.setBounds(27, 463, 116, 14);
		contentPane.add(lblArbitroLaurden4);

		lblArbitroSemi1 = new JLabel("");
		lblArbitroSemi1.setFont(new Font("Montserrat", Font.PLAIN, 10));
		lblArbitroSemi1.setBounds(219, 216, 116, 14);
		contentPane.add(lblArbitroSemi1);

		lblArbitroSemi2 = new JLabel("");
		lblArbitroSemi2.setFont(new Font("Montserrat", Font.PLAIN, 10));
		lblArbitroSemi2.setBounds(219, 416, 116, 14);
		contentPane.add(lblArbitroSemi2);

		lblArbitroFinal = new JLabel("");
		lblArbitroFinal.setFont(new Font("Montserrat", Font.PLAIN, 10));
		lblArbitroFinal.setBounds(411, 314, 116, 14);
		contentPane.add(lblArbitroFinal);

		lblArbitro34 = new JLabel("");
		lblArbitro34.setFont(new Font("Montserrat", Font.PLAIN, 10));
		lblArbitro34.setBounds(411, 426, 116, 14);
		contentPane.add(lblArbitro34);

		lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setLabelFor(lblNewLabel);
		lblNewLabel.setIconTextGap(0);
		lblNewLabel.setIcon(new ImageIcon(adminWindow.class.getResource("/images/Sailkapena.png")));
		lblNewLabel.setBounds(26, 100, 604, 365);
		contentPane.add(lblNewLabel);
		
		
		//Datuak kargatzeko, lehenengo horiango kanporaketa kargatu
		Kanporaketa K = gordeIrakurri.irakurriKanporaketak("kanporaketak.txt");

		//Kanporaketarik badago martxan
		if (K != null) {
			if (K.getFinalLaurdenak().size()>0) {
				
				//Kargatu laurdeneko taldeak eta arbitroak
				lblLaurdenTaldeA.setText(gordeIrakurri.setTalde(0, "Final Laurdenak", "A", K));
				lblLaurdenTaldeB.setText(gordeIrakurri.setTalde(0, "Final Laurdenak", "B", K));
				lblLaurdenTaldeC.setText(gordeIrakurri.setTalde(1, "Final Laurdenak", "A", K));
				lblLaurdenTaldeD.setText(gordeIrakurri.setTalde(1, "Final Laurdenak", "B", K));
				lblLaurdenTaldeE.setText(gordeIrakurri.setTalde(2, "Final Laurdenak", "A", K));
				lblLaurdenTaldeF.setText(gordeIrakurri.setTalde(2, "Final Laurdenak", "B", K));
				lblLaurdenTaldeG.setText(gordeIrakurri.setTalde(3, "Final Laurdenak", "A", K));
				lblLaurdenTaldeH.setText(gordeIrakurri.setTalde(3, "Final Laurdenak", "B", K));
				lblArbitroLaurden1.setText(gordeIrakurri.setArbitro(0, "Final Laurdenak", K));
				lblArbitroLaurden2.setText(gordeIrakurri.setArbitro(1, "Final Laurdenak", K));
				lblArbitroLaurden3.setText(gordeIrakurri.setArbitro(2, "Final Laurdenak", K));
				lblArbitroLaurden4.setText(gordeIrakurri.setArbitro(3, "Final Laurdenak", K));
			}

			//Laurdenak amiatuta badaude
			if (K.isLaurdenfinished()) {
				
				//kargatu laurdeneko puntuak
				lblLaurdenPointsA.setText(gordeIrakurri.setPoints(0, "Final Laurdenak", "A", K));
				lblLaurdenPointsB.setText(gordeIrakurri.setPoints(0, "Final Laurdenak", "B", K));
				lblLaurdenPointsC.setText(gordeIrakurri.setPoints(1, "Final Laurdenak", "A", K));
				lblLaurdenPointsD.setText(gordeIrakurri.setPoints(1, "Final Laurdenak", "B", K));
				lblLaurdenPointsE.setText(gordeIrakurri.setPoints(2, "Final Laurdenak", "A", K));
				lblLaurdenPointsF.setText(gordeIrakurri.setPoints(2, "Final Laurdenak", "B", K));
				lblLaurdenPointsG.setText(gordeIrakurri.setPoints(3, "Final Laurdenak", "A", K));
				lblLaurdenPointsH.setText(gordeIrakurri.setPoints(3, "Final Laurdenak", "B", K));

				//Kargatu semiifinletako taldeak hemen
				lblSemiTaldeA.setText(gordeIrakurri.setTalde(0, "Semifinalak", "A", K));
				lblSemiTaldeB.setText(gordeIrakurri.setTalde(0, "Semifinalak", "B", K));
				lblSemiTaldeC.setText(gordeIrakurri.setTalde(1, "Semifinalak", "A", K));
				lblSemiTaldeD.setText(gordeIrakurri.setTalde(1, "Semifinalak", "B", K));
		
				//Kargatu semiifinletako arbitroak
				lblArbitroSemi1.setText(gordeIrakurri.setArbitro(0, "Semifinalak", K));
				lblArbitroSemi2.setText(gordeIrakurri.setArbitro(1, "Semifinalak", K));
			}

			//Semifinalak amaitu badira
			if (K.isSemifinished()) {
				//Kargatu semifinaleko emiatzak
				lblSemiPointsA.setText(gordeIrakurri.setPoints(0, "Semifinalak", "A", K));
				lblSemiPointsB.setText(gordeIrakurri.setPoints(0, "Semifinalak", "B", K));
				lblSemiPointsC.setText(gordeIrakurri.setPoints(1, "Semifinalak", "A", K));
				lblSemiPointsD.setText(gordeIrakurri.setPoints(1, "Semifinalak", "B", K));

				//Kargatu hirugarren ta laugarren postuko taldeak
				lbl34TaldeA.setText(gordeIrakurri.setTalde(0, "34postuak", "A", K));
				lbl34TaldeB.setText(gordeIrakurri.setTalde(0, "34postuak", "B", K));

				//Kargatu finaleko taldeak
				lblFinalTaldeA.setText(gordeIrakurri.setTalde(0, "Final", "A", K));
				lblFinalTaldeB.setText(gordeIrakurri.setTalde(0, "Final", "B", K));
				
				//Kargatu arbitroak
				lblArbitro34.setText(gordeIrakurri.setArbitro(0, "34postuak", K));
				lblArbitroFinal.setText(gordeIrakurri.setArbitro(0, "Final", K));
			}

			//3 eta 4 postuetako partida amaitu bada
			if (K.is34finished()) {
				
				//kargatu 3 eta 4 postuetako puntuak
				lbl34PointsA.setText(gordeIrakurri.setPoints(0, "34postuak", "A", K));
				lbl34PointsB.setText(gordeIrakurri.setPoints(0, "34postuak", "B", K));

				//3 eta 4 postuak idatzi
				if (Integer.parseInt(K.getPos34().getPuntuakA()) > (Integer.parseInt(K.getPos34().getPuntuakB()))) {
					lblPos3.setText("3");
					lblPos4.setText("4");
				} else {
					lblPos3.setText("3");
					lblPos4.setText("3");
				}
			}

			//finala amaitu bada
			if (K.isFinalfinished()) {
				
				//kargatu finaleko puntuak
				lblFinalPointsA.setText(gordeIrakurri.setPoints(0, "Final", "A", K));
				lblFinalPointsB.setText(gordeIrakurri.setPoints(0, "Final", "B", K));

				//1 eta 2 postuak idatzi
				if (Integer.parseInt(K.getFinala().getPuntuakA()) > (Integer.parseInt(K.getFinala().getPuntuakB()))) {
					lblPos1.setText("1");
					lblPos2.setText("2");
				} else {
					lblPos1.setText("2");
					lblPos2.setText("1");
				}
			}
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();

		if (o == comboBoxDenboraldi) {
			Kanporaketa K = null;
			
			//gorde aukeratu den index
			int index = comboBoxDenboraldi.getSelectedIndex();
			
			//Kargatu kanporaketa zaharrak
			ArrayList<Kanporaketa> kanporaketakOld = gordeIrakurri.irakurriKanporaketakOld("kanporaketakOld.txt");

			//indizea 0 bada, kargatu horaingo kanporaketa
			if (index == 0) {
				K = gordeIrakurri.irakurriKanporaketak("kanporaketak.txt");
				
			//Bestela, arakatu kanporaketa zaharrak berdina aurkitu arte
			} else {
				for (int i = 0; i < kanporaketakOld.size(); i++) {
					if (kanporaketakOld.get(i).getIzena().equals(comboBoxDenboraldi.getItemAt(index))) {
						K = kanporaketakOld.get(i);
					}
				}
			}

			//Kargatu laurdeneko taldeak
			lblLaurdenTaldeA.setText(gordeIrakurri.setTalde(0, "Final Laurdenak", "A", K));
			lblLaurdenTaldeB.setText(gordeIrakurri.setTalde(0, "Final Laurdenak", "B", K));
			lblLaurdenTaldeC.setText(gordeIrakurri.setTalde(1, "Final Laurdenak", "A", K));
			lblLaurdenTaldeD.setText(gordeIrakurri.setTalde(1, "Final Laurdenak", "B", K));
			lblLaurdenTaldeE.setText(gordeIrakurri.setTalde(2, "Final Laurdenak", "A", K));
			lblLaurdenTaldeF.setText(gordeIrakurri.setTalde(2, "Final Laurdenak", "B", K));
			lblLaurdenTaldeG.setText(gordeIrakurri.setTalde(3, "Final Laurdenak", "A", K));
			lblLaurdenTaldeH.setText(gordeIrakurri.setTalde(3, "Final Laurdenak", "B", K));
			
			//Kargatu laurdeneko arbitroak
			lblArbitroLaurden1.setText(gordeIrakurri.setArbitro(0, "Final Laurdenak", K));
			lblArbitroLaurden2.setText(gordeIrakurri.setArbitro(1, "Final Laurdenak", K));
			lblArbitroLaurden3.setText(gordeIrakurri.setArbitro(2, "Final Laurdenak", K));
			lblArbitroLaurden4.setText(gordeIrakurri.setArbitro(3, "Final Laurdenak", K));

			//Laurdenak amiatuta badaude
			if (K.isLaurdenfinished()) {

				//Kargatu laurdeneko emaitzak
				lblLaurdenPointsA.setText(gordeIrakurri.setPoints(0, "Final Laurdenak", "A", K));
				lblLaurdenPointsB.setText(gordeIrakurri.setPoints(0, "Final Laurdenak", "B", K));
				lblLaurdenPointsC.setText(gordeIrakurri.setPoints(1, "Final Laurdenak", "A", K));
				lblLaurdenPointsD.setText(gordeIrakurri.setPoints(1, "Final Laurdenak", "B", K));
				lblLaurdenPointsE.setText(gordeIrakurri.setPoints(2, "Final Laurdenak", "A", K));
				lblLaurdenPointsF.setText(gordeIrakurri.setPoints(2, "Final Laurdenak", "B", K));
				lblLaurdenPointsG.setText(gordeIrakurri.setPoints(3, "Final Laurdenak", "A", K));
				lblLaurdenPointsH.setText(gordeIrakurri.setPoints(3, "Final Laurdenak", "B", K));

				//Kargatu semiifinletako taldeak
				lblSemiTaldeA.setText(gordeIrakurri.setTalde(0, "Semifinalak", "A", K));
				lblSemiTaldeB.setText(gordeIrakurri.setTalde(0, "Semifinalak", "B", K));
				lblSemiTaldeC.setText(gordeIrakurri.setTalde(1, "Semifinalak", "A", K));
				lblSemiTaldeD.setText(gordeIrakurri.setTalde(1, "Semifinalak", "B", K));
				
				//Kargatu semiifinletako emaitzak
				lblArbitroSemi1.setText(gordeIrakurri.setArbitro(0, "Semifinalak", K));
				lblArbitroSemi2.setText(gordeIrakurri.setArbitro(1, "Semifinalak", K));

			//Laurdenak amaitu ez badira, guztia zuriz idatzi
			} else {
				lblLaurdenPointsA.setText("");
				lblLaurdenPointsB.setText("");
				lblLaurdenPointsC.setText("");
				lblLaurdenPointsD.setText("");
				lblLaurdenPointsE.setText("");
				lblLaurdenPointsF.setText("");
				lblLaurdenPointsG.setText("");
				lblLaurdenPointsH.setText("");

				lblSemiTaldeA.setText("Undefined");
				lblSemiTaldeB.setText("Undefined");
				lblSemiTaldeC.setText("Undefined");
				lblSemiTaldeD.setText("Undefined");
				
				lblArbitroSemi1.setText("");
				lblArbitroSemi2.setText("");
			}

			//Kargatu semiifinletako taldeak
			if (K.isSemifinished()) {
				//Kargatu semifinaleko emiatzak
				lblSemiPointsA.setText(gordeIrakurri.setPoints(0, "Semifinalak", "A", K));
				lblSemiPointsB.setText(gordeIrakurri.setPoints(0, "Semifinalak", "B", K));
				lblSemiPointsC.setText(gordeIrakurri.setPoints(1, "Semifinalak", "A", K));
				lblSemiPointsD.setText(gordeIrakurri.setPoints(1, "Semifinalak", "B", K));

				//Kargatu hirugarren ta laugarren postuko taldeak
				lbl34TaldeA.setText(gordeIrakurri.setTalde(0, "34postuak", "A", K));
				lbl34TaldeB.setText(gordeIrakurri.setTalde(0, "34postuak", "B", K));

				//Kargatu finaleko taldeak
				lblFinalTaldeA.setText(gordeIrakurri.setTalde(0, "Final", "A", K));
				lblFinalTaldeB.setText(gordeIrakurri.setTalde(0, "Final", "B", K));
				
				//kargatu arbitroak
				lblArbitro34.setText(gordeIrakurri.setArbitro(0, "34postuak", K));
				lblArbitroFinal.setText(gordeIrakurri.setArbitro(0, "Final", K));
				
			//Semifinalak amaitu ez badira, idatzi guztia zuriz
			} else {
				lblSemiPointsA.setText("");
				lblSemiPointsB.setText("");
				lblSemiPointsC.setText("");
				lblSemiPointsD.setText("");

				lbl34TaldeA.setText("Undefined");
				lbl34TaldeB.setText("Undefined");

				lblFinalTaldeA.setText("Undefined");
				lblFinalTaldeB.setText("Undefined");
				
				lblArbitro34.setText("");
				lblArbitroFinal.setText("");
			}

			//3 eta 4 postuetako partida amaitu bada
			if (K.is34finished()) {
				
				//kargatu 3 eta 4 postuetako puntuak
				lbl34PointsA.setText(gordeIrakurri.setPoints(0, "34postuak", "A", K));
				lbl34PointsB.setText(gordeIrakurri.setPoints(0, "34postuak", "B", K));
				
				//idatzi 3 eta 4 postuak
				if (Integer.parseInt(K.getPos34().getPuntuakA()) > Integer.parseInt(K.getPos34().getPuntuakB())) {
					lblPos3.setText("3");
					lblPos4.setText("4");
				} else {
					lblPos3.setText("4");
					lblPos4.setText("3");
				}

			//Bestela dena zuriz idatzi
			} else {
				lbl34PointsA.setText("");
				lbl34PointsB.setText("");
				lblPos3.setText("");
				lblPos4.setText("");
			}

			//finala amaitu bada
			if (K.isFinalfinished()) {
				
				//kargatu finaleko puntuak
				lblFinalPointsA.setText(gordeIrakurri.setPoints(0, "Final", "A", K));
				lblFinalPointsB.setText(gordeIrakurri.setPoints(0, "Final", "B", K));

				//idatzi 1 eta 2 postuak
				if (Integer.parseInt(K.getFinala().getPuntuakA()) > Integer.parseInt(K.getFinala().getPuntuakB())) {
					lblPos1.setText("1");
					lblPos2.setText("2");
				} else {
					lblPos1.setText("2");
					lblPos2.setText("1");
				}
			} else {
				lblFinalPointsA.setText("");
				lblFinalPointsB.setText("");
				lblPos1.setText("");
				lblPos2.setText("");
			}

		}

		if (o == btnSortuTaldea) {
			sortuTaldekideak m = new sortuTaldekideak();
			m.setVisible(true);
			m.setBounds(100, 100, 800, 500);

			dispose();

		}

		if (o == btnAldatuTaldea) {

			Kanporaketa K = gordeIrakurri.irakurriKanporaketak("kanporaketak.txt");

			if (K.isFinalfinished() || K == null) {
				aldatuTaldea m = new aldatuTaldea();
				m.setVisible(true);
				m.setBounds(100, 100, 800, 500);

				dispose();
			} else {
				JOptionPane.showMessageDialog(contentPane,
						"Kanporaketa gauzatzen den bitartean ezin duzu aldaketarik egin taldeetan");
			}
		}

		if (o == btnSortuKanporaketa) {
			sortuKanporaketa m = new sortuKanporaketa();
			m.setVisible(true);
			m.setBounds(100, 100, 800, 500);

			dispose();
		}

		if (o == btnSartuEmaitzak) {

			Kanporaketa K = gordeIrakurri.irakurriKanporaketak("kanporaketak.txt");

			if (K != null) {
				sartuEmaitzak m = new sartuEmaitzak();
				m.setVisible(true);
				m.setBounds(100, 100, 800, 500);

				dispose();
			} else {
				JOptionPane.showMessageDialog(contentPane, "Ez dago kanporaketarik hasita, ezin dituzu emaitzak sartu");
			}
		}

		if (o == btnIrten) {
			hasiera m = new hasiera();
			m.setVisible(true);
			m.setBounds(100, 100, 800, 500);

			dispose();
		}
		if (o == btnEpaileak) {
			sortuEpaileak m = new sortuEpaileak();
			m.setVisible(true);
			m.setBounds(100, 100, 800, 500);

			dispose();
		}

	}
}
