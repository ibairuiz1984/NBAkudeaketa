package userInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import classes.Erabiltzailea;
import classes.Kanporaketa;
import classes.Partida;
import classes.Taldekide;
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
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class userWindow extends JFrame implements ActionListener, FocusListener {

	private JPanel contentPane;
	private JLabel lblSaikapena;
	private JLabel lblKaixo;
	private JSeparator separatorJSailkapena;
	private JButton btnIrten;
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
	private JLabel lblHurrengoPartidak;
	private JSeparator separatorPartidak;
	private JList<Partida> listPartidak;
	private DefaultListModel<Partida> dlmPartidak;
	private JRadioButton rdbtnNewRadioButton;
	private DefaultListModel<Partida> temp = new DefaultListModel<Partida>();
	private JLabel lblArbitroLaurden1;
	private JLabel lblArbitroLaurden2;
	private JLabel lblArbitroLaurden3;
	private JLabel lblArbitroLaurden4;
	private JLabel lblArbitroSemi1;
	private JLabel lblArbitroSemi2;
	private JLabel lblArbitroFinal;
	private JLabel lblArbitro34;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					userWindow frame = new userWindow();
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
	public userWindow() {
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
		lblSaikapena.setBounds(27, 74, 158, 27);
		contentPane.add(lblSaikapena);

		lblKaixo = new JLabel("Kaixo");
		lblKaixo.setFont(new Font("Montserrat", Font.PLAIN, 25));
		lblKaixo.setBounds(27, 22, 359, 42);
		contentPane.add(lblKaixo);

		separatorJSailkapena = new JSeparator();
		separatorJSailkapena.setBounds(27, 99, 158, 2);
		contentPane.add(separatorJSailkapena);

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
		
		lblHurrengoPartidak = new JLabel("Hurrengo partidak");
		lblHurrengoPartidak.setFont(new Font("Montserrat", Font.PLAIN, 16));
		lblHurrengoPartidak.setBounds(579, 74, 182, 27);
		contentPane.add(lblHurrengoPartidak);
		
		separatorPartidak = new JSeparator();
		separatorPartidak.setBounds(579, 99, 211, 2);
		contentPane.add(separatorPartidak);
		
		listPartidak = new JList<Partida>();
		listPartidak.setFont(new Font("Montserrat", Font.PLAIN, 9));
		listPartidak.setBounds(579, 135, 211, 284);
		contentPane.add(listPartidak);
		
		dlmPartidak = new DefaultListModel<Partida>();
		listPartidak.setModel(dlmPartidak);
		
		rdbtnNewRadioButton = new JRadioButton("Nire partidak");
		rdbtnNewRadioButton.addActionListener(this);
		rdbtnNewRadioButton.setOpaque(false);
		rdbtnNewRadioButton.setFont(new Font("Montserrat", Font.PLAIN, 12));
		rdbtnNewRadioButton.setBounds(603, 442, 158, 21);
		contentPane.add(rdbtnNewRadioButton);
		
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
				lblNewLabel.setIcon(new ImageIcon(userWindow.class.getResource("/images/Sailkapena.png")));
				lblNewLabel.setBounds(26, 100, 604, 365);
				contentPane.add(lblNewLabel);

		Kanporaketa K = gordeIrakurri.irakurriKanporaketak("kanporaketak.txt");

		if (K != null) {
			if (K.getFinalLaurdenak().size() > 0) {
				dlmPartidak.addElement(K.getFinalLaurdenak().get(0));
				dlmPartidak.addElement(K.getFinalLaurdenak().get(1));
				dlmPartidak.addElement(K.getFinalLaurdenak().get(2));
				dlmPartidak.addElement(K.getFinalLaurdenak().get(3));
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

			if (K.isLaurdenfinished()) {
				dlmPartidak.clear();
				dlmPartidak.addElement(K.getSemifinalak().get(0));
				dlmPartidak.addElement(K.getSemifinalak().get(1));
				lblLaurdenPointsA.setText(gordeIrakurri.setPoints(0, "Final Laurdenak", "A", K));
				lblLaurdenPointsB.setText(gordeIrakurri.setPoints(0, "Final Laurdenak", "B", K));
				lblLaurdenPointsC.setText(gordeIrakurri.setPoints(1, "Final Laurdenak", "A", K));
				lblLaurdenPointsD.setText(gordeIrakurri.setPoints(1, "Final Laurdenak", "B", K));
				lblLaurdenPointsE.setText(gordeIrakurri.setPoints(2, "Final Laurdenak", "A", K));
				lblLaurdenPointsF.setText(gordeIrakurri.setPoints(2, "Final Laurdenak", "B", K));
				lblLaurdenPointsG.setText(gordeIrakurri.setPoints(3, "Final Laurdenak", "A", K));
				lblLaurdenPointsH.setText(gordeIrakurri.setPoints(3, "Final Laurdenak", "B", K));

				lblSemiTaldeA.setText(gordeIrakurri.setTalde(0, "Semifinalak", "A", K));
				lblSemiTaldeB.setText(gordeIrakurri.setTalde(0, "Semifinalak", "B", K));
				lblSemiTaldeC.setText(gordeIrakurri.setTalde(1, "Semifinalak", "A", K));
				lblSemiTaldeD.setText(gordeIrakurri.setTalde(1, "Semifinalak", "B", K));
				
				lblArbitroSemi1.setText(gordeIrakurri.setArbitro(0, "Semifinalak", K));
				lblArbitroSemi2.setText(gordeIrakurri.setArbitro(1, "Semifinalak", K));
			}

			if (K.isSemifinished()) {
				dlmPartidak.clear();
				dlmPartidak.addElement(K.getPos34());
				dlmPartidak.addElement(K.getFinala());
				lblSemiPointsA.setText(gordeIrakurri.setPoints(0, "Semifinalak", "A", K));
				lblSemiPointsB.setText(gordeIrakurri.setPoints(0, "Semifinalak", "B", K));
				lblSemiPointsC.setText(gordeIrakurri.setPoints(1, "Semifinalak", "A", K));
				lblSemiPointsD.setText(gordeIrakurri.setPoints(1, "Semifinalak", "B", K));

				lbl34TaldeA.setText(gordeIrakurri.setTalde(0, "34postuak", "A", K));
				lbl34TaldeB.setText(gordeIrakurri.setTalde(0, "34postuak", "B", K));

				lblFinalTaldeA.setText(gordeIrakurri.setTalde(0, "Final", "A", K));
				lblFinalTaldeB.setText(gordeIrakurri.setTalde(0, "Final", "B", K));
				
				lblArbitro34.setText(gordeIrakurri.setArbitro(0, "34postuak", K));
				lblArbitroFinal.setText(gordeIrakurri.setArbitro(0, "Final", K));
			}

			if (K.is34finished()) {
				dlmPartidak.remove(0);
				lbl34PointsA.setText(gordeIrakurri.setPoints(0, "34postuak", "A", K));
				lbl34PointsB.setText(gordeIrakurri.setPoints(0, "34postuak", "B", K));

				if (Integer.parseInt(K.getPos34().getPuntuakA()) > (Integer.parseInt(K.getPos34().getPuntuakB()))) {
					lblPos3.setText("3");
					lblPos4.setText("4");
				} else {
					lblPos3.setText("3");
					lblPos4.setText("3");
				}
			}

			if (K.isFinalfinished()) {
				dlmPartidak.remove(0);
				lblFinalPointsA.setText(gordeIrakurri.setPoints(0, "Final", "A", K));
				lblFinalPointsB.setText(gordeIrakurri.setPoints(0, "Final", "B", K));

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

		if (o == btnIrten) {
			hasiera m = new hasiera();
			m.setVisible(true);
			m.setBounds(100, 100, 800, 500);

			dispose();
		}
		if (o == rdbtnNewRadioButton) {
			if (rdbtnNewRadioButton.isSelected()) {
				Erabiltzailea erabil = gordeIrakurri.irakurriErabiltzaileChosen("erabilChosen.txt");
				for (int i = 0; i < dlmPartidak.size(); i++) {
					temp.addElement(dlmPartidak.get(i));
				}
				for(int i = 0; i < dlmPartidak.size(); i++) {
					if (!dlmPartidak.get(i).getTaldeA().getIzena().equals(erabil.getTaldea()) && !dlmPartidak.get(i).getTaldeB().getIzena().equals(erabil.getTaldea())) {
						dlmPartidak.remove(i);
					}
				}
			}
			
			if(!rdbtnNewRadioButton.isSelected()) {
				dlmPartidak.clear();
				for(int i = 0; i < temp.size(); i++) {
					dlmPartidak.addElement(temp.get(i));
				}
				temp.clear();
			}
		}

	}

	@Override
	public void focusGained(FocusEvent e) {
		
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		
	}
		
}
