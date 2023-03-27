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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

public class sartuEmaitzak extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblLaurdenTaldeA;
	private JLabel lblLaurdenTaldeB;
	private JLabel lblLaurdenTaldeC;
	private JLabel lblLaurdenTaldeD;
	private JLabel lblLaurdenTaldeE;
	private JLabel lblLaurdenTaldeF;
	private JLabel lblLaurdenTaldeG;
	private JLabel lblLaurdenTaldeH;
	private JLabel lblSemiTaldeA;
	private JLabel lblSemiTaldeB;
	private JLabel lblSemiTaldeC;
	private JLabel lblSemiTaldeD;
	private JLabel lbl34TaldeA;
	private JLabel lbl34TaldeB;
	private JLabel lblFinalTaldeA;
	private JLabel lblFinalTaldeB;
	private JTextField textLaurdenTaldeA;
	private JTextField textLaurdenTaldeB;
	private JTextField textLaurdenTaldeC;
	private JTextField textLaurdenTaldeD;
	private JTextField textLaurdenTaldeE;
	private JTextField textLaurdenTaldeF;
	private JTextField textLaurdenTaldeG;
	private JTextField textLaurdenTaldeH;
	private JTextField textSemiTaldeA;
	private JTextField textSemiTaldeB;
	private JTextField textSemiTaldeC;
	private JTextField textSemiTaldeD;
	private JTextField textFinalTaldeA;
	private JTextField textFinalTaldeB;
	private JTextField text34TaldeA;
	private JTextField text34TaldeB;
	private JLabel lblSartuEmaitzak;
	private JButton btnAtzera;
	private JButton btnSartuEmaitzak;
	private JLabel lblimage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sartuEmaitzak frame = new sartuEmaitzak();
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
	public sartuEmaitzak() {
		setUndecorated(true);
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblSartuEmaitzak = new JLabel("Sartu Emaitzak");
		lblSartuEmaitzak.setFont(new Font("Montserrat", Font.PLAIN, 25));
		lblSartuEmaitzak.setBounds(27, 23, 359, 42);
		contentPane.add(lblSartuEmaitzak);

		btnAtzera = new JButton("ATZERA");
		btnAtzera.addActionListener(this);
		btnAtzera.setContentAreaFilled(false);
		btnAtzera.setForeground(new Color(0, 0, 0));
		btnAtzera.setFont(new Font("Montserrat", Font.PLAIN, 16));
		btnAtzera.setBorderPainted(false);
		btnAtzera.setBorder(new EmptyBorder(1, 1, 1, 1));
		btnAtzera.setBackground(new Color(104, 111, 119));
		btnAtzera.setBounds(644, 33, 117, 33);
		contentPane.add(btnAtzera);
		System.setProperty("sun.java2d.uiScale", "1.0");

		btnSartuEmaitzak = new JButton("Emaitzak Sartu");
		btnSartuEmaitzak.addActionListener(this);
		btnSartuEmaitzak.setForeground(Color.WHITE);
		btnSartuEmaitzak.setFont(new Font("Montserrat", Font.PLAIN, 16));
		btnSartuEmaitzak.setBorder(null);
		btnSartuEmaitzak.setBackground(new Color(0, 107, 183));
		btnSartuEmaitzak.setBounds(613, 76, 148, 33);
		contentPane.add(btnSartuEmaitzak);

		lblLaurdenTaldeA = new JLabel("Undefined");
		lblLaurdenTaldeA.setFont(new Font("Montserrat", Font.PLAIN, 12));
		lblLaurdenTaldeA.setBounds(126, 80, 75, 21);
		contentPane.add(lblLaurdenTaldeA);

		lblLaurdenTaldeB = new JLabel("Undefined");
		lblLaurdenTaldeB.setFont(new Font("Montserrat", Font.PLAIN, 12));
		lblLaurdenTaldeB.setBounds(126, 106, 75, 21);
		contentPane.add(lblLaurdenTaldeB);

		textLaurdenTaldeA = new JTextField();
		textLaurdenTaldeA.setEnabled(false);
		textLaurdenTaldeA.setFont(new Font("Montserrat", Font.PLAIN, 12));
		textLaurdenTaldeA.setHorizontalAlignment(SwingConstants.CENTER);
		textLaurdenTaldeA.setBounds(72, 80, 36, 21);
		contentPane.add(textLaurdenTaldeA);
		textLaurdenTaldeA.setColumns(10);

		textLaurdenTaldeB = new JTextField();
		textLaurdenTaldeB.setEnabled(false);
		textLaurdenTaldeB.setHorizontalAlignment(SwingConstants.CENTER);
		textLaurdenTaldeB.setFont(new Font("Montserrat", Font.PLAIN, 12));
		textLaurdenTaldeB.setColumns(10);
		textLaurdenTaldeB.setBounds(72, 106, 36, 21);
		contentPane.add(textLaurdenTaldeB);

		lblLaurdenTaldeC = new JLabel("Undefined");
		lblLaurdenTaldeC.setFont(new Font("Montserrat", Font.PLAIN, 12));
		lblLaurdenTaldeC.setBounds(126, 189, 75, 21);
		contentPane.add(lblLaurdenTaldeC);

		lblLaurdenTaldeD = new JLabel("Undefined");
		lblLaurdenTaldeD.setFont(new Font("Montserrat", Font.PLAIN, 12));
		lblLaurdenTaldeD.setBounds(126, 215, 75, 21);
		contentPane.add(lblLaurdenTaldeD);

		textLaurdenTaldeC = new JTextField();
		textLaurdenTaldeC.setEnabled(false);
		textLaurdenTaldeC.setHorizontalAlignment(SwingConstants.CENTER);
		textLaurdenTaldeC.setFont(new Font("Montserrat", Font.PLAIN, 12));
		textLaurdenTaldeC.setColumns(10);
		textLaurdenTaldeC.setBounds(72, 189, 36, 21);
		contentPane.add(textLaurdenTaldeC);

		textLaurdenTaldeD = new JTextField();
		textLaurdenTaldeD.setEnabled(false);
		textLaurdenTaldeD.setHorizontalAlignment(SwingConstants.CENTER);
		textLaurdenTaldeD.setFont(new Font("Montserrat", Font.PLAIN, 12));
		textLaurdenTaldeD.setColumns(10);
		textLaurdenTaldeD.setBounds(72, 215, 36, 21);
		contentPane.add(textLaurdenTaldeD);

		lblLaurdenTaldeE = new JLabel("Undefined");
		lblLaurdenTaldeE.setFont(new Font("Montserrat", Font.PLAIN, 12));
		lblLaurdenTaldeE.setBounds(126, 299, 75, 21);
		contentPane.add(lblLaurdenTaldeE);

		lblLaurdenTaldeF = new JLabel("Undefined");
		lblLaurdenTaldeF.setFont(new Font("Montserrat", Font.PLAIN, 12));
		lblLaurdenTaldeF.setBounds(126, 325, 75, 21);
		contentPane.add(lblLaurdenTaldeF);

		textLaurdenTaldeE = new JTextField();
		textLaurdenTaldeE.setEnabled(false);
		textLaurdenTaldeE.setHorizontalAlignment(SwingConstants.CENTER);
		textLaurdenTaldeE.setFont(new Font("Montserrat", Font.PLAIN, 12));
		textLaurdenTaldeE.setColumns(10);
		textLaurdenTaldeE.setBounds(72, 299, 36, 21);
		contentPane.add(textLaurdenTaldeE);

		textLaurdenTaldeF = new JTextField();
		textLaurdenTaldeF.setEnabled(false);
		textLaurdenTaldeF.setHorizontalAlignment(SwingConstants.CENTER);
		textLaurdenTaldeF.setFont(new Font("Montserrat", Font.PLAIN, 12));
		textLaurdenTaldeF.setColumns(10);
		textLaurdenTaldeF.setBounds(72, 325, 36, 21);
		contentPane.add(textLaurdenTaldeF);

		lblLaurdenTaldeG = new JLabel("Undefined");
		lblLaurdenTaldeG.setFont(new Font("Montserrat", Font.PLAIN, 12));
		lblLaurdenTaldeG.setBounds(126, 409, 75, 21);
		contentPane.add(lblLaurdenTaldeG);

		lblLaurdenTaldeH = new JLabel("Undefined");
		lblLaurdenTaldeH.setFont(new Font("Montserrat", Font.PLAIN, 12));
		lblLaurdenTaldeH.setBounds(126, 435, 75, 21);
		contentPane.add(lblLaurdenTaldeH);

		textLaurdenTaldeG = new JTextField();
		textLaurdenTaldeG.setEnabled(false);
		textLaurdenTaldeG.setHorizontalAlignment(SwingConstants.CENTER);
		textLaurdenTaldeG.setFont(new Font("Montserrat", Font.PLAIN, 12));
		textLaurdenTaldeG.setColumns(10);
		textLaurdenTaldeG.setBounds(72, 409, 36, 21);
		contentPane.add(textLaurdenTaldeG);

		textLaurdenTaldeH = new JTextField();
		textLaurdenTaldeH.setEnabled(false);
		textLaurdenTaldeH.setHorizontalAlignment(SwingConstants.CENTER);
		textLaurdenTaldeH.setFont(new Font("Montserrat", Font.PLAIN, 12));
		textLaurdenTaldeH.setColumns(10);
		textLaurdenTaldeH.setBounds(72, 435, 36, 21);
		contentPane.add(textLaurdenTaldeH);

		lblSemiTaldeA = new JLabel("Undefined");
		lblSemiTaldeA.setFont(new Font("Montserrat", Font.PLAIN, 12));
		lblSemiTaldeA.setBounds(367, 135, 75, 21);
		contentPane.add(lblSemiTaldeA);

		lblSemiTaldeB = new JLabel("Undefined");
		lblSemiTaldeB.setFont(new Font("Montserrat", Font.PLAIN, 12));
		lblSemiTaldeB.setBounds(367, 161, 75, 21);
		contentPane.add(lblSemiTaldeB);

		textSemiTaldeA = new JTextField();
		textSemiTaldeA.setEnabled(false);
		textSemiTaldeA.setHorizontalAlignment(SwingConstants.CENTER);
		textSemiTaldeA.setFont(new Font("Montserrat", Font.PLAIN, 12));
		textSemiTaldeA.setColumns(10);
		textSemiTaldeA.setBounds(313, 135, 36, 21);
		contentPane.add(textSemiTaldeA);

		textSemiTaldeB = new JTextField();
		textSemiTaldeB.setEnabled(false);
		textSemiTaldeB.setHorizontalAlignment(SwingConstants.CENTER);
		textSemiTaldeB.setFont(new Font("Montserrat", Font.PLAIN, 12));
		textSemiTaldeB.setColumns(10);
		textSemiTaldeB.setBounds(313, 161, 36, 21);
		contentPane.add(textSemiTaldeB);

		lblSemiTaldeC = new JLabel("Undefined");
		lblSemiTaldeC.setFont(new Font("Montserrat", Font.PLAIN, 12));
		lblSemiTaldeC.setBounds(367, 357, 75, 21);
		contentPane.add(lblSemiTaldeC);

		lblSemiTaldeD = new JLabel("Undefined");
		lblSemiTaldeD.setFont(new Font("Montserrat", Font.PLAIN, 12));
		lblSemiTaldeD.setBounds(367, 383, 75, 21);
		contentPane.add(lblSemiTaldeD);

		textSemiTaldeC = new JTextField();
		textSemiTaldeC.setEnabled(false);
		textSemiTaldeC.setHorizontalAlignment(SwingConstants.CENTER);
		textSemiTaldeC.setFont(new Font("Montserrat", Font.PLAIN, 12));
		textSemiTaldeC.setColumns(10);
		textSemiTaldeC.setBounds(313, 357, 36, 21);
		contentPane.add(textSemiTaldeC);

		textSemiTaldeD = new JTextField();
		textSemiTaldeD.setEnabled(false);
		textSemiTaldeD.setHorizontalAlignment(SwingConstants.CENTER);
		textSemiTaldeD.setFont(new Font("Montserrat", Font.PLAIN, 12));
		textSemiTaldeD.setColumns(10);
		textSemiTaldeD.setBounds(313, 383, 36, 21);
		contentPane.add(textSemiTaldeD);

		lblFinalTaldeA = new JLabel("Undefined");
		lblFinalTaldeA.setFont(new Font("Montserrat", Font.PLAIN, 12));
		lblFinalTaldeA.setBounds(615, 246, 75, 21);
		contentPane.add(lblFinalTaldeA);

		lblFinalTaldeB = new JLabel("Undefined");
		lblFinalTaldeB.setFont(new Font("Montserrat", Font.PLAIN, 12));
		lblFinalTaldeB.setBounds(615, 272, 75, 21);
		contentPane.add(lblFinalTaldeB);

		textFinalTaldeA = new JTextField();
		textFinalTaldeA.setEnabled(false);
		textFinalTaldeA.setHorizontalAlignment(SwingConstants.CENTER);
		textFinalTaldeA.setFont(new Font("Montserrat", Font.PLAIN, 12));
		textFinalTaldeA.setColumns(10);
		textFinalTaldeA.setBounds(561, 246, 36, 21);
		contentPane.add(textFinalTaldeA);

		textFinalTaldeB = new JTextField();
		textFinalTaldeB.setEnabled(false);
		textFinalTaldeB.setHorizontalAlignment(SwingConstants.CENTER);
		textFinalTaldeB.setFont(new Font("Montserrat", Font.PLAIN, 12));
		textFinalTaldeB.setColumns(10);
		textFinalTaldeB.setBounds(561, 272, 36, 21);
		contentPane.add(textFinalTaldeB);

		lbl34TaldeA = new JLabel("Undefined");
		lbl34TaldeA.setFont(new Font("Montserrat", Font.PLAIN, 12));
		lbl34TaldeA.setBounds(615, 367, 75, 21);
		contentPane.add(lbl34TaldeA);

		lbl34TaldeB = new JLabel("Undefined");
		lbl34TaldeB.setFont(new Font("Montserrat", Font.PLAIN, 12));
		lbl34TaldeB.setBounds(615, 393, 75, 21);
		contentPane.add(lbl34TaldeB);

		text34TaldeA = new JTextField();
		text34TaldeA.setEnabled(false);
		text34TaldeA.setHorizontalAlignment(SwingConstants.CENTER);
		text34TaldeA.setFont(new Font("Montserrat", Font.PLAIN, 12));
		text34TaldeA.setColumns(10);
		text34TaldeA.setBounds(561, 367, 36, 21);
		contentPane.add(text34TaldeA);

		text34TaldeB = new JTextField();
		text34TaldeB.setEnabled(false);
		text34TaldeB.setHorizontalAlignment(SwingConstants.CENTER);
		text34TaldeB.setFont(new Font("Montserrat", Font.PLAIN, 12));
		text34TaldeB.setColumns(10);
		text34TaldeB.setBounds(561, 393, 36, 21);
		contentPane.add(text34TaldeB);

		lblimage = new JLabel("");
		lblimage.setLabelFor(lblimage);
		lblimage.setIconTextGap(0);
		lblimage.setIcon(new ImageIcon(sartuEmaitzak.class.getResource("/images/SailkapenaEmaitzak.png")));
		lblimage.setBounds(87, 71, 623, 395);
		contentPane.add(lblimage);
		
		
		
		//Datuak kargatzeko, lehenengo horiango kanporaketa kargatu
		Kanporaketa K = gordeIrakurri.irakurriKanporaketak("kanporaketak.txt");
		
		//Laurdenak amaituta EZ badade
		if (!K.isLaurdenfinished()) {
			//Kargatu laurdeneko taldeak
			lblLaurdenTaldeA.setText(gordeIrakurri.setTalde(0, "Final Laurdenak", "A", K));
			lblLaurdenTaldeB.setText(gordeIrakurri.setTalde(0, "Final Laurdenak", "B", K));
			lblLaurdenTaldeC.setText(gordeIrakurri.setTalde(1, "Final Laurdenak", "A", K));
			lblLaurdenTaldeD.setText(gordeIrakurri.setTalde(1, "Final Laurdenak", "B", K));
			lblLaurdenTaldeE.setText(gordeIrakurri.setTalde(2, "Final Laurdenak", "A", K));
			lblLaurdenTaldeF.setText(gordeIrakurri.setTalde(2, "Final Laurdenak", "B", K));
			lblLaurdenTaldeG.setText(gordeIrakurri.setTalde(3, "Final Laurdenak", "A", K));
			lblLaurdenTaldeH.setText(gordeIrakurri.setTalde(3, "Final Laurdenak", "B", K));
			
			//desblokeatu laurdeneko emaitzak sartu ahal izateko
			textLaurdenTaldeA.setEnabled(true);
			textLaurdenTaldeB.setEnabled(true);
			textLaurdenTaldeC.setEnabled(true);
			textLaurdenTaldeD.setEnabled(true);
			textLaurdenTaldeE.setEnabled(true);
			textLaurdenTaldeF.setEnabled(true);
			textLaurdenTaldeG.setEnabled(true);
			textLaurdenTaldeH.setEnabled(true);

		}

		//Laurdenak amiatuta badaude
		if (K.isLaurdenfinished()) {
			//kargatu laurdeneko taldeak
			lblLaurdenTaldeA.setText(gordeIrakurri.setTalde(0, "Final Laurdenak", "A", K));
			lblLaurdenTaldeB.setText(gordeIrakurri.setTalde(0, "Final Laurdenak", "B", K));
			lblLaurdenTaldeC.setText(gordeIrakurri.setTalde(1, "Final Laurdenak", "A", K));
			lblLaurdenTaldeD.setText(gordeIrakurri.setTalde(1, "Final Laurdenak", "B", K));
			lblLaurdenTaldeE.setText(gordeIrakurri.setTalde(2, "Final Laurdenak", "A", K));
			lblLaurdenTaldeF.setText(gordeIrakurri.setTalde(2, "Final Laurdenak", "B", K));
			lblLaurdenTaldeG.setText(gordeIrakurri.setTalde(3, "Final Laurdenak", "A", K));
			lblLaurdenTaldeH.setText(gordeIrakurri.setTalde(3, "Final Laurdenak", "B", K));

			//Kargatu laurdeneko emaitzak
			textLaurdenTaldeA.setText(gordeIrakurri.setPoints(0, "Final Laurdenak", "A", K));
			textLaurdenTaldeB.setText(gordeIrakurri.setPoints(0, "Final Laurdenak", "B", K));
			textLaurdenTaldeC.setText(gordeIrakurri.setPoints(1, "Final Laurdenak", "A", K));
			textLaurdenTaldeD.setText(gordeIrakurri.setPoints(1, "Final Laurdenak", "B", K));
			textLaurdenTaldeE.setText(gordeIrakurri.setPoints(2, "Final Laurdenak", "A", K));
			textLaurdenTaldeF.setText(gordeIrakurri.setPoints(2, "Final Laurdenak", "B", K));
			textLaurdenTaldeG.setText(gordeIrakurri.setPoints(3, "Final Laurdenak", "A", K));
			textLaurdenTaldeH.setText(gordeIrakurri.setPoints(3, "Final Laurdenak", "B", K));

			//Kargatu semiifinletako taldeak
			lblSemiTaldeA.setText(gordeIrakurri.setTalde(0, "Semifinalak", "A", K));
			lblSemiTaldeB.setText(gordeIrakurri.setTalde(0, "Semifinalak", "B", K));
			lblSemiTaldeC.setText(gordeIrakurri.setTalde(1, "Semifinalak", "A", K));
			lblSemiTaldeD.setText(gordeIrakurri.setTalde(1, "Semifinalak", "B", K));
			
			//Blokeatu laurdenetako emaitzak
			textLaurdenTaldeA.setEnabled(false);
			textLaurdenTaldeB.setEnabled(false);
			textLaurdenTaldeC.setEnabled(false);
			textLaurdenTaldeD.setEnabled(false);
			textLaurdenTaldeE.setEnabled(false);
			textLaurdenTaldeF.setEnabled(false);
			textLaurdenTaldeG.setEnabled(false);
			textLaurdenTaldeH.setEnabled(false);

			//Desblokeatu semifinaletako emaitzak sartu ahak izateko
			textSemiTaldeA.setEnabled(true);
			textSemiTaldeB.setEnabled(true);
			textSemiTaldeC.setEnabled(true);
			textSemiTaldeD.setEnabled(true);
		}

		//Semifinalak amaitu badira
		if (K.isSemifinished()) {
			//Kargatu semifinaleko emiatzak
			textSemiTaldeA.setText(gordeIrakurri.setPoints(0, "Semifinalak", "A", K));
			textSemiTaldeB.setText(gordeIrakurri.setPoints(0, "Semifinalak", "B", K));
			textSemiTaldeC.setText(gordeIrakurri.setPoints(1, "Semifinalak", "A", K));
			textSemiTaldeD.setText(gordeIrakurri.setPoints(1, "Semifinalak", "B", K));

			//Kargatu hirugarren ta laugarren postuko taldeak
			lbl34TaldeA.setText(gordeIrakurri.setTalde(0, "34postuak", "A", K));
			lbl34TaldeB.setText(gordeIrakurri.setTalde(0, "34postuak", "B", K));

			//Kargatu finaleko taldeak
			lblFinalTaldeA.setText(gordeIrakurri.setTalde(0, "Final", "A", K));
			lblFinalTaldeB.setText(gordeIrakurri.setTalde(0, "Final", "B", K));
				
			//Blokeatu semifinaleko emaitzak
			textSemiTaldeA.setEnabled(false);
			textSemiTaldeB.setEnabled(false);
			textSemiTaldeC.setEnabled(false);
			textSemiTaldeD.setEnabled(false);

			//Desblokeatu 3 eta 4 postuetako emaitzak
			text34TaldeA.setEnabled(true);
			text34TaldeB.setEnabled(true);
		}

		//3 eta 4 postuetako partida amaitu bada
		if (K.is34finished()) {
			
			//kargatu 3 eta 4 postuetako puntuak
			text34TaldeA.setText(gordeIrakurri.setPoints(0, "34postuak", "A", K));
			text34TaldeB.setText(gordeIrakurri.setPoints(0, "34postuak", "B", K));
			
			//blokeatu 3 eta 4 postuen puntuak
			text34TaldeA.setEnabled(false);
			text34TaldeB.setEnabled(false);

			//desbloakeatu finaleko puntuak
			textFinalTaldeA.setEnabled(true);
			textFinalTaldeB.setEnabled(true);
		}

		//finala amaitu bada
		if (K.isFinalfinished()) {
			
			//kargatu finaleko puntuak
			textFinalTaldeA.setText(gordeIrakurri.setPoints(0, "Final", "A", K));
			textFinalTaldeB.setText(gordeIrakurri.setPoints(0, "Final", "B", K));
			
			//blokeatu finaleko emaitzak
			textFinalTaldeA.setEnabled(false);
			textFinalTaldeB.setEnabled(false);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		
		if (o == btnAtzera) {
			adminWindow m = new adminWindow();
			m.setVisible(true);
			m.setBounds(100, 100, 800, 500);

			dispose();
		}

		if (o == btnSartuEmaitzak) {
			//kargatu kanporaketa
			Kanporaketa K = gordeIrakurri.irakurriKanporaketak("kanporaketak.txt");
			
			//Ze fasetan gauden jakiteko
			String fase = "Final Laurdenak";
			if (K.isLaurdenfinished()) {
				fase = "Semifinalak";
			}
			if (K.isSemifinished()) {
				fase = "34postuak";
			}
			if (K.is34finished()) {
				fase = "Finala";
			}
			
			if (K.isFinalfinished()) {
				fase = "amaituta";
			}

			switch (fase) {
			//Final laurdenetan bagaude
			case "Final Laurdenak":
				if (datuakSartuta(fase)) {
					//sartu final laurdenetako emaitzak
					K.sartuLaurdenak(textLaurdenTaldeA.getText(), textLaurdenTaldeB.getText(),
							textLaurdenTaldeC.getText(), textLaurdenTaldeD.getText(), textLaurdenTaldeE.getText(),
							textLaurdenTaldeF.getText(), textLaurdenTaldeG.getText(), textLaurdenTaldeH.getText());

					//blokeatu final laurdenetako emaitzak
					textLaurdenTaldeA.setEnabled(false);
					textLaurdenTaldeB.setEnabled(false);
					textLaurdenTaldeC.setEnabled(false);
					textLaurdenTaldeD.setEnabled(false);
					textLaurdenTaldeE.setEnabled(false);
					textLaurdenTaldeF.setEnabled(false);
					textLaurdenTaldeG.setEnabled(false);
					textLaurdenTaldeH.setEnabled(false);

					//idatzi semifinaleko taldeak
					lblSemiTaldeA.setText(gordeIrakurri.setTalde(0, "Semifinalak", "A", K));
					lblSemiTaldeB.setText(gordeIrakurri.setTalde(0, "Semifinalak", "B", K));
					lblSemiTaldeC.setText(gordeIrakurri.setTalde(1, "Semifinalak", "A", K));
					lblSemiTaldeD.setText(gordeIrakurri.setTalde(1, "Semifinalak", "B", K));

					//desblokeatu semifinaleko emaitzak idazteko
					textSemiTaldeA.setEnabled(true);
					textSemiTaldeB.setEnabled(true);
					textSemiTaldeC.setEnabled(true);
					textSemiTaldeD.setEnabled(true);
					
					gordeIrakurri.gordeKanporaketa(K, "kanporaketak.txt");
				}
				break;
				
			//semifinaletan bagade
			case "Semifinalak":
				if(datuakSartuta(fase)) {
					//sartu semifinaletako emiatzak
					K.sartuSemi(textLaurdenTaldeA.getText(), textLaurdenTaldeB.getText(),
							textLaurdenTaldeC.getText(), textLaurdenTaldeD.getText());
					//blokeatu semifinaleko emaitzak
					textSemiTaldeA.setEnabled(false);
					textSemiTaldeB.setEnabled(false);
					textSemiTaldeC.setEnabled(false);
					textSemiTaldeD.setEnabled(false);

					//idatzi 3 eta 4 postuetako taldeak
					lbl34TaldeA.setText(gordeIrakurri.setTalde(0, "34postuak", "A", K));
					lbl34TaldeB.setText(gordeIrakurri.setTalde(0, "34postuak", "B", K));

					//idatzi finaleko taldeak
					lblFinalTaldeA.setText(gordeIrakurri.setTalde(0, "Final", "A", K));
					lblFinalTaldeB.setText(gordeIrakurri.setTalde(0, "Final", "B", K));
					
					//deblokeatu 3 eta 4 postuetako emaitzak idazteko
					text34TaldeA.setEnabled(true);
					text34TaldeB.setEnabled(true);
					
					gordeIrakurri.gordeKanporaketa(K, "kanporaketak.txt");
				}
				
				break;
			
			//3 eta 4 postuetako partidan bagaude
			case "34postuak":
				if(datuakSartuta(fase)) {
					//sartu emaitzak
					K.sartu34(text34TaldeA.getText(), text34TaldeB.getText());
					//blokeatu emaitzak
					text34TaldeA.setEnabled(false);
					text34TaldeB.setEnabled(false);

					//desblokeatu finaleko emaitzak idazteko
					textFinalTaldeA.setEnabled(true);
					textFinalTaldeB.setEnabled(true);
					
					gordeIrakurri.gordeKanporaketa(K, "kanporaketak.txt");
				}
				break;
				
			//finalean bagaude
			case "Finala":
				if(datuakSartuta(fase)) {
					//sartu emaitzak
					K.sartuFinal(textFinalTaldeA.getText(), textFinalTaldeB.getText());
					//blokeatu emaitzak
					textFinalTaldeA.setEnabled(false);
					textFinalTaldeB.setEnabled(false);
					
					gordeIrakurri.gordeKanporaketa(K, "kanporaketak.txt");
				}
				break;
			}

		}

	}

	//datuak sartuta dauden konprobatzeko metodoa
	public boolean datuakSartuta(String fasea) {
		switch (fasea) {
		case "Final Laurdenak":
			if (!textLaurdenTaldeA.getText().equals("") && !textLaurdenTaldeB.getText().equals("")
					&& !textLaurdenTaldeC.getText().equals("")
					&& !textLaurdenTaldeD.getText().equals("")
					&& !textLaurdenTaldeE.getText().equals("")
					&& !textLaurdenTaldeF.getText().equals("")
					&& !textLaurdenTaldeG.getText().equals("")
					&& !textLaurdenTaldeH.getText().equals("")) {
				return true;
			} else {
				JOptionPane.showMessageDialog(contentPane, "Sartu final laurdenetako emaitza guztiak mesedez");
				return false;
			}
		case "Semifinalak":
			if (!textSemiTaldeA.getText().equals("") && !textSemiTaldeB.getText().equals("")
					&& !textSemiTaldeC.getText().equals("")
					&& !textSemiTaldeD.getText().equals("")) {
				return true;
			} else {
				JOptionPane.showMessageDialog(contentPane, "Sartu semifinaletako emaitza guztiak mesedez");
				return false;
			}
		case "34postuak":
			if (!text34TaldeA.getText().equals("") && !text34TaldeB.getText().equals("")) {
				return true;
			} else {
				JOptionPane.showMessageDialog(contentPane, "Sartu 3 eta 4 postuetako emaitzak mesedez");
				return false;
			}
		case "Finala":
			if (!textFinalTaldeA.getText().equals("") && !textFinalTaldeB.getText().equals("")) {
				return true;
			} else {
				JOptionPane.showMessageDialog(contentPane, "Sartu finaleko emaitzak mesedez");
				return false;
			}			
		default:
			return false;
		}
	}
}
