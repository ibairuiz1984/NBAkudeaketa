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
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class aldatuTaldea extends JFrame {

	private JPanel contentPane;
	private JTextField textIzena;
	private JTextField textAbizena;
	private JTextField textJaiotzeData;
	private JTextField textJatorrizkoHerria;
	private JTextField textNan;
	private static aldatuTaldea frame;
	private static DefaultListModel<Taldekide> Jokalaridlm = new DefaultListModel <Taldekide>();
	private JRadioButton rdbtnEmakume = new JRadioButton("Emakumezkoa");
	private JRadioButton rdbtnGizkon = new JRadioButton("Gizkonezkoa");
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
	private JButton btnSartu;
	private JButton btnAtzera;

	JComboBox<Talde> comboBoxTalde = new JComboBox<Talde>();
	ArrayList<Talde> taldeak = gordeIrakurri.irakurriTalde("taldeak.txt");
	ArrayList<Taldekide> jokalari = gordeIrakurri.irakurriTaldekide("jokalariak.txt");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new aldatuTaldea();
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
		lblAldatuTaldekideak.setBounds(29, 34, 359, 42);
		contentPane.add(lblAldatuTaldekideak);
		
		lblTaldeakideak = new JLabel("Taldekideak");
		lblTaldeakideak.setFont(new Font("Montserrat", Font.PLAIN, 16));
		lblTaldeakideak.setBounds(29, 101, 176, 27);
		contentPane.add(lblTaldeakideak);
		
		separatorTaldekide = new JSeparator();
		separatorTaldekide.setBounds(29, 134, 176, 2);
		contentPane.add(separatorTaldekide);
		
		// JList abiaraztea datu-eredutzat jokalarien zerrenda duten jokalarientzat.
		JList<Taldekide> listtaldekide = new JList<Taldekide>(Jokalaridlm);
		// JList-ari SAGU ENTZULE BAT GEHITUZ
		listtaldekide.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				// Lortu JLISTeko jokalari hautatua.
				Taldekide jokalari = (Taldekide) listtaldekide.getSelectedValue();
				
				// Itzul zaitez jokalaririk aukeratzen ez baduzu.

				if (jokalari == null) {
					return;
				}
				
				// Testu-eremuetako balioak eguneratzea hautatutako jokalariaren xehetasunekin
				textIzena.setText(jokalari.getIzena());
				textAbizena.setText(jokalari.getAbizena());
				textNan.setText(jokalari.getNan());
				textJaiotzeData.setText(jokalari.getJaiotzeData());
				textJatorrizkoHerria.setText(jokalari.getJatorrizkoHerria());
				
				// Hautatutako jokalariaren generoa ikusi eta irrati-botoiak jarri.
				if (jokalari.getSexua().equals("Emakumezkoa")) {
					rdbtnEmakume.setSelected(true);
					rdbtnGizkon.setSelected(false);
				} else {
					rdbtnGizkon.setSelected(true);
					rdbtnEmakume.setSelected(false);
				}
				
			}
		});
		listtaldekide.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listtaldekide.setFont(new Font("Montserrat", Font.PLAIN, 12));
		listtaldekide.setBounds(29, 146, 387, 272);
		contentPane.add(listtaldekide);
		//listtaldekide.setModel(Jokalaridlm);
		
		textIzena = new JTextField();
		textIzena.setFont(new Font("Montserrat", Font.PLAIN, 12));
		textIzena.setBounds(607, 101, 151, 19);
		contentPane.add(textIzena);
		textIzena.setColumns(10);
		
		lblIzena = new JLabel("Izena");
		lblIzena.setFont(new Font("Montserrat", Font.PLAIN, 12));
		lblIzena.setBounds(457, 105, 122, 13);
		contentPane.add(lblIzena);
		
		textAbizena = new JTextField();
		textAbizena.setFont(new Font("Montserrat", Font.PLAIN, 12));
		textAbizena.setColumns(10);
		textAbizena.setBounds(607, 134, 151, 19);
		contentPane.add(textAbizena);
		
		lblAbizena = new JLabel("Abizena");
		lblAbizena.setFont(new Font("Montserrat", Font.PLAIN, 12));
		lblAbizena.setBounds(457, 138, 122, 13);
		contentPane.add(lblAbizena);
		
		textJaiotzeData = new JTextField();
		textJaiotzeData.setFont(new Font("Montserrat", Font.PLAIN, 12));
		textJaiotzeData.setColumns(10);
		textJaiotzeData.setBounds(607, 194, 151, 19);
		contentPane.add(textJaiotzeData);
		
		lblJaiotzeData = new JLabel("Jaiotze Data");
		lblJaiotzeData.setFont(new Font("Montserrat", Font.PLAIN, 12));
		lblJaiotzeData.setBounds(457, 198, 122, 13);
		contentPane.add(lblJaiotzeData);
		
		textJatorrizkoHerria = new JTextField();
		textJatorrizkoHerria.setFont(new Font("Montserrat", Font.PLAIN, 12));
		textJatorrizkoHerria.setColumns(10);
		textJatorrizkoHerria.setBounds(607, 227, 151, 19);
		contentPane.add(textJatorrizkoHerria);
		
		lblJatorrizkoHerria = new JLabel("Jatorrizko Herria");
		lblJatorrizkoHerria.setFont(new Font("Montserrat", Font.PLAIN, 12));
		lblJatorrizkoHerria.setBounds(457, 231, 122, 13);
		contentPane.add(lblJatorrizkoHerria);
		
		lblSexua = new JLabel("Sexua");
		lblSexua.setFont(new Font("Montserrat", Font.PLAIN, 12));
		lblSexua.setBounds(457, 275, 122, 13);
		contentPane.add(lblSexua);
		
		rdbtnEmakume = new JRadioButton("Emakumezkoa");
		rdbtnEmakume.setFont(new Font("Montserrat", Font.PLAIN, 12));
		rdbtnEmakume.setBackground(new Color(255, 255, 255));
		rdbtnEmakume.setBounds(483, 294, 122, 21);
		contentPane.add(rdbtnEmakume);
		
		rdbtnGizkon = new JRadioButton("Gizkonezkoa");
		rdbtnGizkon.setFont(new Font("Montserrat", Font.PLAIN, 12));
		rdbtnGizkon.setBackground(Color.WHITE);
		rdbtnGizkon.setBounds(636, 294, 122, 21);
		contentPane.add(rdbtnGizkon);
		
		btnKendu = new JButton("Kendu");
		//Gehitu ekintza-entzule bat botoian.
		btnKendu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Lortu hautatutako aurkibidea jokalarien zerrendan.
				int selection = listtaldekide.getSelectedIndex();
				//Get the selected player in the list
				Taldekide taldekide_selected = listtaldekide.getSelectedValue();
				//Lortu combo kutxako talde hautatua.
				Talde talde_selected = (Talde) comboBoxTalde.getSelectedItem();
				
	
				//Egiaztatu jokalari bat hautatu duten.
				if (!listtaldekide.isSelectionEmpty()) {
				  //Kendu hautatutako jokalaria jokalarien zerrendatik.
				  Jokalaridlm.remove(selection);
				  //Kendu hautatutako jokalaria hautatutako taldetik
				  talde_selected.rmvJokalariak(taldekide_selected);
				} else {
				  //Erakuts ezazu mezu-elkarrizketa bat jokalaririk hautatu ez bada.
				  JOptionPane.showMessageDialog(contentPane, "Ezin da ezabatu, hautatu jokalari bat!");
				}
			}
		});
		btnKendu.setBorderPainted(false);
		btnKendu.setBorder(new EmptyBorder(1, 1, 1, 1));
		btnKendu.setForeground(new Color(255, 255, 255));
		btnKendu.setBackground(new Color(104, 111, 119));
		btnKendu.setFont(new Font("Montserrat", Font.PLAIN, 16));
		btnKendu.setBounds(177, 431, 85, 33);
		contentPane.add(btnKendu);
		
		btnSartu = new JButton("Aldatu");
		btnSartu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Get the values of the text fields
				String izena = textIzena.getText();
				String abizen = textAbizena.getText();
				String date = textJaiotzeData.getText();
				String herri = textJatorrizkoHerria.getText();
				String sexo = "non";
				String rol = "Jokalaria";
				String nan = textNan.getText();

				if (rdbtnEmakume.isSelected()) {
					sexo = "Emakumezkoa";
				} else if (rdbtnGizkon.isSelected()) {
				    sexo = "Gizkonezkoa";
				}
				
				Taldekide Jokalari = new Taldekide(nan, izena, abizen, date, herri, sexo, rol);
				
				
				Talde selected = (Talde) comboBoxTalde.getSelectedItem();
				
				if (selected == null) {
					return;
				}
				
				// Zerrendan jokalaririk aukeratzen ez bada, mezu bat erakutsi.
				if (listtaldekide.isSelectionEmpty()) {
					JOptionPane.showMessageDialog(contentPane, "Hautatu jokalari bat aldatzeko!");
					
				} else {
					
					// Eremuren bat hutsik badago edo "izena" eremuaren luzera 15 karakteretik gorakoa bada, erakutsi mezu bat.
					if (izena.isEmpty() || abizen.isEmpty() || nan.isEmpty() || date.isEmpty() || herri.isEmpty() || sexo == null) {
						JOptionPane.showMessageDialog(contentPane, "Mesedez, bete elementu guztiak!");
						
					} else if (izena.length() >15) {
						JOptionPane.showMessageDialog(contentPane, "Izena 15 karaktere gehienez eduki behar du!");
						
					} else if (abizen.length() > 40) {
						JOptionPane.showMessageDialog(contentPane, "Abizena 40 karaktere gehienez eduki behar du!");
						
					} else if (nan.length() != 9 || !nan.substring(0,7).matches("[0-9]+") || !nan.substring(8,9).matches("[A-Za-z]")) {
						JOptionPane.showMessageDialog(contentPane, "Sartu Nan kode erabilgarri bat: 8 zenbaki karaktere 1!");
						/* NAN kodearen eremuak formatu zuzena ez badu (9 karaktere,
						 *  lehen 7 karaktereak digituak dira eta azken karakterea letra bat da),
						 *  erakutsi formatu zuzena adierazten duen mezu-elkarrizketa bat.*/
						
					}else if (date.length() >10) {
						JOptionPane.showMessageDialog(contentPane, "Data baligarri bat sartu behar duzu! xx/xx/xxxx");
						
					} else if (herri.length() >25) {
						JOptionPane.showMessageDialog(contentPane, "Herri baliagarri bat sartu, 25 karaktere baino gutxiago eduki behar du!");
						
					} else {
						// Eremu guztiak baliozkoak badira, kendu aurreko jokalaria zerrendatik eta gehitu jokalari berria.
						selected.rmvJokalariak(listtaldekide.getSelectedValue());
						
						selected.addJokalariak(Jokalari);
						
						// Argitu eta eguneratu jokalarien zerrenda.
						Jokalaridlm.clear();
						
						for (int i = 0; i < selected.getJokalariak().size(); i++) {
							Jokalaridlm.addElement(selected.getJokalariak().get(i));
						}
						
						// Taldeentzako aldi baterako zerrenda-eredu bat sortu eta dagoen fitxategia gainidatzi eguneratutako informazioarekin.
						ArrayList<Talde> temp = new ArrayList<Talde>();
						
						for (int i = 0; i < comboBoxTalde.getItemCount(); i++) {
							temp.add(comboBoxTalde.getItemAt(i));
							
						}
						gordeIrakurri.gordeTalde(temp, "taldeak.txt");
					}
				} 
				
			}
		});
		btnSartu.setForeground(new Color(255, 255, 255));
		btnSartu.setFont(new Font("Montserrat", Font.PLAIN, 16));
		btnSartu.setBorder(null);
		btnSartu.setBackground(new Color(0, 107, 183));
		btnSartu.setBounds(530, 358, 139, 33);
		contentPane.add(btnSartu);
		
		btnAtzera = new JButton("ATZERA");
		btnAtzera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// "SortuTaldea" deitu ikasgelako metodo nagusiari.
				adminWindow m = new adminWindow();
				m.setVisible(true);
				m.setBounds(100, 100, 800, 500);

				dispose();

			}
		});
		btnAtzera.setContentAreaFilled(false);
		btnAtzera.setForeground(new Color(0, 0, 0));
		btnAtzera.setFont(new Font("Montserrat", Font.PLAIN, 16));
		btnAtzera.setBorderPainted(false);
		btnAtzera.setBorder(new EmptyBorder(1, 1, 1, 1));
		btnAtzera.setBackground(new Color(104, 111, 119));
		btnAtzera.setBounds(673, 42, 85, 33);
		contentPane.add(btnAtzera);
		
		// Konbo kutxa berri bat sortu, taldeak erakusteko.
		comboBoxTalde = new JComboBox<Talde>();

		// Gehitu ekintza-entzule bat talde bat aukeratzean erabili beharreko konbo-kaxara.
		comboBoxTalde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Lortu combo kutxako talde hautatua.
				Talde selected = (Talde) comboBoxTalde.getSelectedItem();
				
				// Egiaztatu ea ez den talderik hautatu.
				if (selected == null) {
					// If no team was selected, return without doing anything
					return ;
				}
				
				//Argitu jokalarien zerrenda eredua.
				Jokalaridlm.clear();
				
				// Gehitu hautatutako taldeko jokalari guztiak jokalarien zerrendan.
				for (int i = 0; i < selected.getJokalariak().size(); i++) {
					Jokalaridlm.addElement(selected.getJokalariak().get(i));
				}
				
			}
		});
		comboBoxTalde.setFont(new Font("Montserrat", Font.PLAIN, 12));
		comboBoxTalde.setEditable(true);
		comboBoxTalde.setBounds(229, 106, 187, 30);
		contentPane.add(comboBoxTalde);
		
		lblnan = new JLabel("Nan");
		lblnan.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblnan.setBounds(457, 167, 122, 13);
		contentPane.add(lblnan);
		
		textNan = new JTextField();
		textNan.setFont(new Font("Dialog", Font.PLAIN, 12));
		textNan.setColumns(10);
		textNan.setBounds(607, 163, 151, 19);
		contentPane.add(textNan);
		
		// Begiratu ea taldeen zerrenda hutsik dagoen.
		if (taldeak.size() == 0) {
			// Zerrenda hutsik badago, exekutatu SortuTaldea klasearen metodo nagusia eta prestatu egungo markoa.
			sortuTaldea.main(null);
			frame.dispose();
			
		} else {
		// Zerrenda hutsik ez badago, begiztatu zerrenda eta gehitu elementu bakoitza comboBoxTalde combo kutxara.
			for (int i = 0; i < taldeak.size(); i++) {
				comboBoxTalde.addItem(taldeak.get(i));
			}
		}	
	}
}