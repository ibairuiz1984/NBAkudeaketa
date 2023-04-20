package userInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import classes.Epaile;
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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;

public class sortuEpaileak extends JFrame implements ActionListener, FocusListener {

	private static final long serialVersionUID = -769897967527414239L;
	private JPanel contentPane;
	private JLabel lblSortuEpaileak;
	private JLabel lblEpaileZenbakia;
	private JTextField textIzena;
	private JTextField textAbizena;
	private JTextField textJaiotzeData;
	private JTextField textJatorrizkoHerria;
	private JLabel lblIzena;
	private JLabel lblNanZnb;
	private JLabel lblAbizena;
	private JLabel lblJaiotzeData;
	private JLabel lblJatorrizkoHerria;
	private JLabel lblSexua;
	private JRadioButton rdbtnEmakume;
	private JRadioButton rdbtnGizkon;

	private JButton btnSortu;
	private JButton btnAtzera;
	private JButton btnEzabatu;
	private JButton btnAldatu;

	private JList<Epaile> listEpaile;
	private DefaultListModel<Epaile> dlmEpaile;

	private JLabel lblEpaileak;
	private JSeparator separatorEntrenatzaile;
	private JTextField textNan;

	private String sexua;
	private String rola = "Jokalaria";
	private boolean fisio = false;

	private String selectedNan;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sortuEpaileak frame = new sortuEpaileak();
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
	public sortuEpaileak() {
		setUndecorated(true);
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblSortuEpaileak = new JLabel("Sartu Epaileak");
		lblSortuEpaileak.setFont(new Font("Montserrat", Font.PLAIN, 25));
		lblSortuEpaileak.setBounds(27, 22, 359, 42);
		contentPane.add(lblSortuEpaileak);

		lblEpaileak = new JLabel("Epaileak");
		lblEpaileak.setFont(new Font("Montserrat", Font.PLAIN, 16));
		lblEpaileak.setBounds(27, 89, 158, 27);
		contentPane.add(lblEpaileak);

		separatorEntrenatzaile = new JSeparator();
		separatorEntrenatzaile.setBounds(27, 122, 158, 2);
		contentPane.add(separatorEntrenatzaile);

		listEpaile = new JList<Epaile>();
		listEpaile.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtKargatu();

			}

		});
		listEpaile.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listEpaile.setFont(new Font("Montserrat", Font.PLAIN, 12));
		listEpaile.setBounds(28, 134, 228, 230);
		contentPane.add(listEpaile);

		dlmEpaile = new DefaultListModel<Epaile>();
		listEpaile.setModel(dlmEpaile);

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
		lblSexua.setBounds(455, 324, 122, 13);
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
		rdbtnEmakume.setBounds(481, 343, 122, 21);
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
		rdbtnGizkon.setBounds(634, 343, 122, 21);
		contentPane.add(rdbtnGizkon);

		btnSortu = new JButton("Sortu");
		btnSortu.addActionListener(this);
		btnSortu.setBorderPainted(false);
		btnSortu.setBorder(new EmptyBorder(1, 1, 1, 1));
		btnSortu.setForeground(new Color(255, 255, 255));
		btnSortu.setBackground(new Color(104, 111, 119));
		btnSortu.setFont(new Font("Montserrat", Font.PLAIN, 16));
		btnSortu.setBounds(671, 431, 85, 33);
		contentPane.add(btnSortu);

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
		btnEzabatu.setBounds(576, 431, 85, 33);
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

		btnAldatu = new JButton("Aldatu");
		btnAldatu.addActionListener(this);
		btnAldatu.setForeground(Color.WHITE);
		btnAldatu.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnAldatu.setBorderPainted(false);
		btnAldatu.setBorder(new EmptyBorder(1, 1, 1, 1));
		btnAldatu.setBackground(new Color(104, 111, 119));
		btnAldatu.setBounds(481, 431, 85, 33);
		contentPane.add(btnAldatu);

		/** Datuak datu basetik kargatzeko metodoaren deia **/
		datuakKargatu();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();

		if (o == btnSortu) {

			if (datuakBeteta()) {
				boolean badago = false;
				String sexua = null;
				if (rdbtnGizkon.isSelected() == true) {
					sexua = "Gizona";
				}
				if (rdbtnEmakume.isSelected() == true) {
					sexua = "Emakumea";
				}

				Epaile Epaile = new Epaile(textNan.getText(), textIzena.getText(), textAbizena.getText(),
						textJaiotzeData.getText(), textJatorrizkoHerria.getText(), sexua);
				// Zerrenda hutsik ez badago begiratu ea objektua jada dagoen
				if (!dlmEpaile.isEmpty()) {
					for (int i = 0; i < dlmEpaile.size(); i++) {
						if (Epaile.equals(dlmEpaile.get(i))) {
							badago = true;
						}
					}
					// Objektua ez badago zerrendan, alfabetikoki sartu
					if (!badago) {

						int pos = dlmEpaile.size();

						for (int i = 0; i < dlmEpaile.size(); i++) {
							if (Epaile.compareTo(dlmEpaile.get(i)) < 0) {
								pos = i;
								break;
							}
						}

						dlmEpaile.add(pos, Epaile);

						try {

							Class.forName("com.mysql.jdbc.Driver");
							Connection konexioa = DriverManager.getConnection("jdbc:mysql://localhost/erronka_t4",
									"root", "");
							Statement st = konexioa.createStatement();
							int urtea = Integer.parseInt(textJaiotzeData.getText());

							String sql = "INSERT INTO epailea VALUES ('" + textNan.getText() + "', '"
									+ textIzena.getText() + "', '" + textAbizena.getText() + "', '"
									+ textJatorrizkoHerria.getText() + "', '" + sexua + "', '" + urtea + "');";
							System.out.println(sql);
							st.executeUpdate(sql);

							konexioa.close();

						} catch (SQLException | ClassNotFoundException sqle) {
							// ez baldin bada konexioa era egokian egin
							sqle.printStackTrace();
							System.out.println("Konexio errorea");
						}

					} else {
						JOptionPane.showMessageDialog(contentPane, "Epaile hau sartuta dago jada.");
					}

					// Zerrenda hutsik badago objektua sartu
				} else {
					dlmEpaile.addElement(Epaile);

				}

			}
		}

		if (o == btnEzabatu) {
			/** Datuak ezabatzeko metodoaren deia **/
			datuakEzabatu();
			// Lau zerrendetatik ezabatzeko

			int index = listEpaile.getSelectedIndex();

			if (!listEpaile.isSelectionEmpty()) {
				dlmEpaile.remove(index);

			} else {
				JOptionPane.showMessageDialog(contentPane, "Errorea Ezabatzean. Ez duzu taldekiderik aukeratu");
			}

		}

		if (o == btnAtzera) {
			//
			adminWindow m = new adminWindow();
			m.setVisible(true);
			m.setBounds(100, 100, 800, 500);

			dispose();

		}

		if (o == btnAldatu) {		

			if (datuakBeteta()) {
				int index = listEpaile.getSelectedIndex();
				dlmEpaile.remove(index);
				String sexua = null;
				if (rdbtnGizkon.isSelected() == true) {
					sexua = "Gizona";
				}
				if (rdbtnEmakume.isSelected() == true) {
					sexua = "Emakumea";
				}

				Epaile Epaile = new Epaile(textNan.getText(), textIzena.getText(), textAbizena.getText(),
						textJaiotzeData.getText(), textJatorrizkoHerria.getText(), sexua);
				// Zerrenda hutsik ez badago begiratu ea objektua jada dagoen

				int pos = dlmEpaile.size();

				for (int i = 0; i < dlmEpaile.size(); i++) {
					if (Epaile.compareTo(dlmEpaile.get(i)) < 0) {
						pos = i;
						break;
					}
				}

				dlmEpaile.add(pos, Epaile);

				try {

					Class.forName("com.mysql.jdbc.Driver");
					Connection konexioa = DriverManager.getConnection("jdbc:mysql://localhost/erronka_t4", "root", "");
					Statement st = konexioa.createStatement();
					int urtea = Integer.parseInt(textJaiotzeData.getText());

					String sql = "UPDATE epailea SET EpaileaNan ='" + textNan.getText() + "', EPIzen = '"
							+ textIzena.getText() + "', EPAbizen = '" + textAbizena.getText()
							+ "', EPJatorrizkoHerria = '" + textJatorrizkoHerria.getText() + "', EPSexua = '" + sexua
							+ "', EPJaioteUrtea = '" + urtea + "' WHERE EpaileaNan = '" + selectedNan + "';";
					System.out.println(sql);
					st.executeUpdate(sql);

					konexioa.close();

				} catch (SQLException | ClassNotFoundException sqle) {
					// ez baldin bada konexioa era egokian egin
					sqle.printStackTrace();
					System.out.println("Konexio errorea");
				}

			} else {
				JOptionPane.showMessageDialog(contentPane, "Epaile hau sartuta dago jada.");
			}

			// Zerrenda hutsik badago objektua sartu
		} else {
			int index = listEpaile.getSelectedIndex();

		}

	}

	/** Datuak ondo dauden kontrolatzeko metodoa **/
	private boolean datuakBeteta() {
		// izena, abizena, nan, jaiote urtea eta jatorrizko herria idatzi dituela
		// kontrolatzeko
		if (!textIzena.getText().isEmpty() && !textAbizena.getText().isEmpty() && !textNan.getText().isEmpty()
				&& !textJatorrizkoHerria.getText().isEmpty() && !textJaiotzeData.getText().isEmpty()) {
			// sexua aukeratu duela kontrolatzeko
			if (rdbtnEmakume.isSelected() || rdbtnGizkon.isSelected()) {
				return true;
			} else {
				JOptionPane.showMessageDialog(contentPane, "Aukeratu taldekidearen sexua mesedez");
				return false;
			}
		} else {
			JOptionPane.showMessageDialog(contentPane, "Sartu taldekidearen datuak");
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

		if (o == textNan) {
			textNan.setText("");
		}

	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub

	}

	/** Datuak kargatzeko metodoa **/
	public void datuakKargatu() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection konexioa = DriverManager.getConnection("jdbc:mysql://localhost/erronka_t4", "root", "");
			Statement st = konexioa.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM epailea");

			while (rs.next()) {

				String urtea = (String) rs.getObject("EPJaioteUrtea");
				Epaile E = new Epaile((String) rs.getObject("EpaileaNAN"), (String) rs.getObject("EPIzen"),
						(String) rs.getObject("EPAbizen"), urtea, (String) rs.getObject("EPJatorrizkoHerria"),
						(String) rs.getObject("EPSexua"));
				dlmEpaile.addElement(E);

			}
			konexioa.close();

		} catch (SQLException | ClassNotFoundException sqle) {
			// ez baldin bada konexioa era egokian egin
			sqle.printStackTrace();
			System.out.println("Konexio errorea");
		}
	}

	/** Aukeratutako datua ezabatzeko metodoa **/
	public void datuakEzabatu() {
		int index = listEpaile.getSelectedIndex();
		System.out.println(index);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection konexioa = DriverManager.getConnection("jdbc:mysql://localhost/erronka_t4", "root", "");
			Statement st = konexioa.createStatement();

			String nan = dlmEpaile.get(index).getNan();
			String izena = textIzena.getText();
			String abizenak = textAbizena.getText();
			String herria = textJatorrizkoHerria.getText();

			String sql = "DELETE FROM epailea WHERE EpaileaNAN=" + "'" + nan + "';";

			System.out.println(sql);
			st.executeUpdate(sql);

			konexioa.close();

		} catch (SQLException | ClassNotFoundException sqle) {
			// ez baldin bada konexioa era egokian egin
			sqle.printStackTrace();
			System.out.println("Konexio errorea");
		}
	}

	public void txtKargatu() {
		int index = listEpaile.getSelectedIndex();
		textNan.setText(dlmEpaile.get(index).getNan());
		textIzena.setText(dlmEpaile.get(index).getIzena());
		textAbizena.setText(dlmEpaile.get(index).getAbizena());
		textJaiotzeData.setText(dlmEpaile.get(index).getJaiotzeData());
		textJatorrizkoHerria.setText(dlmEpaile.get(index).getJatorrizkoHerria());
		selectedNan = dlmEpaile.get(index).getNan();
		
		if (dlmEpaile.get(index).getSexua().equals("Gizona")) {			
			rdbtnGizkon.setSelected(true);
			rdbtnEmakume.setSelected(false);
		} else {
			rdbtnEmakume.setSelected(true);
			rdbtnGizkon.setSelected(false);
		}

	}
}
