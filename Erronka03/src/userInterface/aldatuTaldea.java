package userInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import classes.Taldekide;

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
import javax.swing.JComboBox;
import javax.swing.ListSelectionModel;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.FocusAdapter;

public class aldatuTaldea extends JFrame implements ActionListener, FocusListener, MouseListener {

	private JPanel contentPane;
	private JTextField textIzena;
	private JTextField textAbizena;
	private JTextField textJaiotzeData;
	private JTextField textJatorrizkoHerria;
	private JTextField textNan;
	private aldatuTaldea frame;
	private JRadioButton rdbtnEmakume = new JRadioButton("Emakumezkoa");
	private JRadioButton rdbtnGizkon = new JRadioButton("Gizkonezkoa");
	private JRadioButton rdbtnGizon;
	private JLabel lblAldatuTaldekideak;
	private JLabel lblTaldeakideak;
	private JSeparator separatorTaldekide;
	private JLabel lblIzena;
	private JLabel lblAbizena;
	private JLabel lblJaiotzeData;
	private JLabel lblJatorrizkoHerria;
	private JLabel lblSexua;
	private JButton btnKendu;
	private JLabel lblnan;
	private JButton btnAldatu;
	private JButton btnAtzera;
	private JLabel lblPostu;
	private JRadioButton rdbtnKoordinatzaile;
	private JRadioButton rdbtnEntrenatzaile;
	private JRadioButton rdbtnFisioterapeuta;
	private JTextField textKolegiatuZnb;
	private JComboBox<String> comboTaldeak;
	private JList<Taldekide> listTaldekide;
	private DefaultListModel<Taldekide> dlmTaldekide;
	private JButton btnAñadir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aldatuTaldea frame = new aldatuTaldea();
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
	public aldatuTaldea() {
		setUndecorated(true);
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblAldatuTaldekideak = new JLabel("Aldatu Taldekideak");
		lblAldatuTaldekideak.setFont(new Font("Montserrat", Font.PLAIN, 25));
		lblAldatuTaldekideak.setBounds(29, 23, 359, 42);
		contentPane.add(lblAldatuTaldekideak);

		lblTaldeakideak = new JLabel("Taldekideak");
		lblTaldeakideak.setFont(new Font("Montserrat", Font.PLAIN, 16));
		lblTaldeakideak.setBounds(29, 90, 176, 27);
		contentPane.add(lblTaldeakideak);

		separatorTaldekide = new JSeparator();
		separatorTaldekide.setBounds(29, 123, 176, 2);
		contentPane.add(separatorTaldekide);

		textIzena = new JTextField();
		textIzena.setFont(new Font("Montserrat", Font.PLAIN, 12));
		textIzena.setBounds(607, 90, 151, 19);
		contentPane.add(textIzena);
		textIzena.setColumns(10);

		lblIzena = new JLabel("Izena");
		lblIzena.setFont(new Font("Montserrat", Font.PLAIN, 12));
		lblIzena.setBounds(457, 94, 122, 13);
		contentPane.add(lblIzena);

		textAbizena = new JTextField();
		textAbizena.setFont(new Font("Montserrat", Font.PLAIN, 12));
		textAbizena.setColumns(10);
		textAbizena.setBounds(607, 123, 151, 19);
		contentPane.add(textAbizena);

		lblAbizena = new JLabel("Abizena");
		lblAbizena.setFont(new Font("Montserrat", Font.PLAIN, 12));
		lblAbizena.setBounds(457, 127, 122, 13);
		contentPane.add(lblAbizena);

		textJaiotzeData = new JTextField();
		textJaiotzeData.setFont(new Font("Montserrat", Font.PLAIN, 12));
		textJaiotzeData.setColumns(10);
		textJaiotzeData.setBounds(607, 183, 151, 19);
		contentPane.add(textJaiotzeData);

		lblJaiotzeData = new JLabel("Jaiotze Data");
		lblJaiotzeData.setFont(new Font("Montserrat", Font.PLAIN, 12));
		lblJaiotzeData.setBounds(457, 187, 122, 13);
		contentPane.add(lblJaiotzeData);

		textJatorrizkoHerria = new JTextField();
		textJatorrizkoHerria.setFont(new Font("Montserrat", Font.PLAIN, 12));
		textJatorrizkoHerria.setColumns(10);
		textJatorrizkoHerria.setBounds(607, 216, 151, 19);
		contentPane.add(textJatorrizkoHerria);

		lblJatorrizkoHerria = new JLabel("Jatorrizko Herria");
		lblJatorrizkoHerria.setFont(new Font("Montserrat", Font.PLAIN, 12));
		lblJatorrizkoHerria.setBounds(457, 220, 122, 13);
		contentPane.add(lblJatorrizkoHerria);

		lblSexua = new JLabel("Sexua");
		lblSexua.setFont(new Font("Montserrat", Font.PLAIN, 12));
		lblSexua.setBounds(457, 264, 122, 13);
		contentPane.add(lblSexua);

		rdbtnEmakume = new JRadioButton("Emakumezkoa");
		rdbtnEmakume.setFont(new Font("Montserrat", Font.PLAIN, 12));
		rdbtnEmakume.setBackground(new Color(255, 255, 255));
		rdbtnEmakume.setBounds(483, 283, 122, 21);
		contentPane.add(rdbtnEmakume);

		rdbtnGizon = new JRadioButton("Gizonezkoa");
		rdbtnGizon.setFont(new Font("Montserrat", Font.PLAIN, 12));
		rdbtnGizon.setBackground(Color.WHITE);
		rdbtnGizon.setBounds(636, 283, 122, 21);
		contentPane.add(rdbtnGizon);

		btnKendu = new JButton("Kendu");
		btnKendu.addActionListener(this);
		btnKendu.setBorderPainted(false);
		btnKendu.setBorder(new EmptyBorder(1, 1, 1, 1));
		btnKendu.setForeground(new Color(255, 255, 255));
		btnKendu.setBackground(new Color(104, 111, 119));
		btnKendu.setFont(new Font("Montserrat", Font.PLAIN, 16));
		btnKendu.setBounds(177, 420, 85, 33);
		contentPane.add(btnKendu);

		btnAldatu = new JButton("Aldatu");
		btnAldatu.addActionListener(this);
		btnAldatu.setForeground(new Color(255, 255, 255));
		btnAldatu.setFont(new Font("Montserrat", Font.PLAIN, 16));
		btnAldatu.setBorder(null);
		btnAldatu.setBackground(new Color(0, 107, 183));
		btnAldatu.setBounds(606, 420, 139, 33);
		contentPane.add(btnAldatu);

		btnAtzera = new JButton("ATZERA");
		btnAtzera.addActionListener(this);
		btnAtzera.setContentAreaFilled(false);
		btnAtzera.setForeground(new Color(0, 0, 0));
		btnAtzera.setFont(new Font("Montserrat", Font.PLAIN, 16));
		btnAtzera.setBorderPainted(false);
		btnAtzera.setBorder(new EmptyBorder(1, 1, 1, 1));
		btnAtzera.setBackground(new Color(104, 111, 119));
		btnAtzera.setBounds(673, 31, 85, 33);
		contentPane.add(btnAtzera);

		lblnan = new JLabel("Nan");
		lblnan.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblnan.setBounds(457, 156, 122, 13);
		contentPane.add(lblnan);

		textNan = new JTextField();
		textNan.setFont(new Font("Dialog", Font.PLAIN, 12));
		textNan.setColumns(10);
		textNan.setBounds(607, 152, 151, 19);
		contentPane.add(textNan);

		lblPostu = new JLabel("Lanpostua");
		lblPostu.setFont(new Font("Montserrat", Font.PLAIN, 12));
		lblPostu.setBounds(457, 317, 122, 13);
		contentPane.add(lblPostu);

		rdbtnKoordinatzaile = new JRadioButton("Koordinatzaile");
		rdbtnKoordinatzaile.setFont(new Font("Montserrat", Font.PLAIN, 12));
		rdbtnKoordinatzaile.setBackground(Color.WHITE);
		rdbtnKoordinatzaile.setBounds(483, 341, 122, 21);
		contentPane.add(rdbtnKoordinatzaile);

		rdbtnEntrenatzaile = new JRadioButton("Entrenatzaile");
		rdbtnEntrenatzaile.setFont(new Font("Montserrat", Font.PLAIN, 12));
		rdbtnEntrenatzaile.setBackground(Color.WHITE);
		rdbtnEntrenatzaile.setBounds(636, 341, 122, 21);
		contentPane.add(rdbtnEntrenatzaile);

		rdbtnFisioterapeuta = new JRadioButton("Fisioterapeuta");
		rdbtnFisioterapeuta.setFont(new Font("Montserrat", Font.PLAIN, 12));
		rdbtnFisioterapeuta.setBackground(Color.WHITE);
		rdbtnFisioterapeuta.setBounds(483, 374, 122, 21);
		contentPane.add(rdbtnFisioterapeuta);

		textKolegiatuZnb = new JTextField();
		textKolegiatuZnb.setText("Kolegiatu Znb");
		textKolegiatuZnb.setForeground(Color.LIGHT_GRAY);
		textKolegiatuZnb.setFont(new Font("Montserrat", Font.PLAIN, 12));
		textKolegiatuZnb.setEnabled(false);
		textKolegiatuZnb.setColumns(10);
		textKolegiatuZnb.setBounds(636, 368, 122, 27);
		contentPane.add(textKolegiatuZnb);

		comboTaldeak = new JComboBox<String>();
		comboTaldeak.setFont(new Font("Montserrat", Font.PLAIN, 10));
		comboTaldeak.addActionListener(this);
		comboTaldeak.setBounds(251, 90, 176, 27);
		contentPane.add(comboTaldeak);

		listTaldekide = new JList<Taldekide>();
		listTaldekide.addMouseListener(this);
		listTaldekide.setFont(new Font("Montserrat", Font.PLAIN, 12));
		listTaldekide.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listTaldekide.setBounds(29, 135, 176, 260);
		contentPane.add(listTaldekide);

		dlmTaldekide = new DefaultListModel<Taldekide>();
		listTaldekide.setModel(dlmTaldekide);
		
		btnAñadir = new JButton("Gehitu");
		btnAñadir.addActionListener(this);
		btnAñadir.setForeground(Color.WHITE);
		btnAñadir.setFont(new Font("Montserrat", Font.PLAIN, 16));
		btnAñadir.setBorder(null);
		btnAñadir.setBackground(new Color(0, 107, 183));
		btnAñadir.setBounds(478, 420, 101, 33);
		contentPane.add(btnAñadir);

		// Kargatu taldeak
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection konexioa = DriverManager.getConnection("jdbc:mysql://localhost/erronka_t4", "root", "");
			Statement st = konexioa.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM talde");
			while (rs.next()) {
				comboTaldeak.addItem((String) rs.getObject("TaldeIzena"));
			}
			rs.close();
			st.close();
			konexioa.close();
		} catch (SQLException | ClassNotFoundException sqle) {
			sqle.printStackTrace();
		}
	}

	@Override
	public void focusGained(FocusEvent e) {


	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();

		if (o == comboTaldeak) {
			dlmTaldekide.clear();
			String taldea = (String) comboTaldeak.getSelectedItem();
			String statement = "SELECT * FROM jokalariak WHERE TaldeID = (SELECT TaldeID FROM talde WHERE TaldeIzena = '"
					+ taldea + "');";
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection konexioa = DriverManager.getConnection("jdbc:mysql://localhost/erronka_t4", "root", "");
				Statement st = konexioa.createStatement();
				ResultSet rs = st.executeQuery(statement);
				while (rs.next()) {

					String jaiotze = Integer.toString((Integer) rs.getObject("JJaioteUrtea"));

					Taldekide T = new Taldekide((String) rs.getObject("JokalariNAN"), (String) rs.getObject("JIzen"),
							(String) rs.getObject("JAbizena"), jaiotze, (String) rs.getObject("JJatorrizkoHerria"),
							(String) rs.getObject("JSexua"), "jokalari");
					dlmTaldekide.addElement(T);
				}
				rs.close();
				st.close();
				konexioa.close();
			} catch (SQLException | ClassNotFoundException sqle) {
				sqle.printStackTrace();
			}
		}
		
		if (o == btnKendu) {
			Taldekide aukeratua = listTaldekide.getSelectedValue();
			int index = listTaldekide.getSelectedIndex();
			String statement = "DELETE FROM jokalariak WHERE JokalariNAN = '" + aukeratua.getNan() + "';";
			System.out.println(statement);
			
			try {				
				Class.forName("com.mysql.jdbc.Driver");
				Connection konexioa = DriverManager.getConnection("jdbc:mysql://localhost/erronka_t4", "root", "");
				Statement st = konexioa.createStatement();
				st.executeUpdate(statement);
				
				st.close();
				konexioa.close();
			} catch (SQLException | ClassNotFoundException e1) {

				e1.printStackTrace();
			}
			
			dlmTaldekide.remove(index);
			listTaldekide.setSelectedIndex(0);
		}
		
		if (o == btnAldatu) {
			Taldekide aukeratua = listTaldekide.getSelectedValue();
			String newNAN = textNan.getText();
			String newIzen = textIzena.getText();
			String newAbizen = textAbizena.getText();
			String newHerri = textJatorrizkoHerria.getText();
			int newUrte = Integer.parseInt(textJaiotzeData.getText());
			String newSexua = "";
			if (rdbtnEmakume.isSelected()){
				newSexua = "Emakumea";
			}else {
				newSexua = "Gizona";
			}
			String statement = "UPDATE jokalariak "
					+ "SET JokalariNAN = '" + newNAN + "', JIzen = '" + newIzen + "', JAbizena = '"+ newAbizen + "', JJatorrizkoherria = '" + newHerri + "', JSexua = '" + newSexua + "', JJaioteUrtea = '" + newUrte + "'."
					+ "WHERE JokalariNAN = '" + aukeratua.getNan() + "';";
			
			try {				
				Class.forName("com.mysql.jdbc.Driver");
				Connection konexioa = DriverManager.getConnection("jdbc:mysql://localhost/erronka_t4", "root", "");
				Statement st = konexioa.createStatement();
				st.executeUpdate(statement);
				
				st.close();
				konexioa.close();
			} catch (SQLException | ClassNotFoundException e1) {

				e1.printStackTrace();
			}
		}
		
		if (o == btnAñadir) {
			String newNAN = textNan.getText();
			String newIzen = textIzena.getText();
			String newAbizen = textAbizena.getText();
			String newHerri = textJatorrizkoHerria.getText();
			int newUrte = Integer.parseInt(textJaiotzeData.getText());
			String newSexua = "";
			String talde = (String) comboTaldeak.getSelectedItem();
			String taldeKode = "";
			if (rdbtnEmakume.isSelected()){
				newSexua = "Emakumea";
			}else {
				newSexua = "Gizona";
			}
			switch (talde) {
			case "Boston Celtics":
				taldeKode = "BOCE";
				break;
			case "Brooklyn Nets":
				taldeKode = "BRKN";
				break;
			case "Chicago Bulls":
				taldeKode = "CHBU";
				break;
			case "Dallas Mavericks":
				taldeKode = "DAMV";
				break;
			case "Golden State Warriors":
				taldeKode = "GSWR";
				break;
			case "Los Angeles Lakers":
				taldeKode = "LALK";
				break;
			case "Milwaukee Bucks":
				taldeKode = "MWBK";
				break;
			case "Toronto Raptors":
				taldeKode = "TORP";
				break;
			}
			
			Taldekide T = new Taldekide(textNan.getText(), textIzena.getText(), textAbizena.getText(), textJaiotzeData.getText(), textJatorrizkoHerria.getText(), newSexua, "jokalari");
			 dlmTaldekide.addElement(T);
			
			
			String statement = "INSERT INTO jokalariak "
					+ "VALUES '" + newNAN + "', '" + newIzen + "', '"+ newAbizen + "', '" + newHerri + "', '" + newSexua + "', '" + newUrte + "', " + taldeKode +"' ;";
			
			try {				
				Class.forName("com.mysql.jdbc.Driver");
				Connection konexioa = DriverManager.getConnection("jdbc:mysql://localhost/erronka_t4", "root", "");
				Statement st = konexioa.createStatement();
				st.executeUpdate(statement);
				
				st.close();
				konexioa.close();
			} catch (SQLException | ClassNotFoundException e1) {
				e1.printStackTrace();
			}
		}
		if (o == btnAtzera) {
			hasiera m = new hasiera();
			m.setVisible(true);
			m.setBounds(100, 100, 800, 500);

			dispose();
			
		}

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		Object o = e.getSource();
		if (o == listTaldekide) {
			Taldekide aukeratua = listTaldekide.getSelectedValue();

			textAbizena.setText(aukeratua.getAbizena());
			textIzena.setText(aukeratua.getIzena());
			textJaiotzeData.setText(aukeratua.getJaiotzeData());
			textJatorrizkoHerria.setText(aukeratua.getJatorrizkoHerria());
			textNan.setText(aukeratua.getNan());
			if (aukeratua.getSexua().equals("Gizona")) {
				rdbtnGizon.setSelected(true);
				rdbtnEmakume.setSelected(false);
			} else {
				rdbtnGizon.setSelected(false);
				rdbtnEmakume.setSelected(true);
			}
		}

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}