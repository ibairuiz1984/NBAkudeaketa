package classes;

import java.awt.Component;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.DefaultListModel;

public class gordeIrakurri {
	public static void gordeErabiltzaileChosen(Erabiltzailea e, String filename) {
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(filename);
			ObjectOutputStream os = new ObjectOutputStream(fos);

			os.writeObject(e);

			os.close();

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public static Erabiltzailea irakurriErabiltzaileChosen(String filename) {
		try {
			FileInputStream fis = new FileInputStream(filename);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Erabiltzailea T = (Erabiltzailea) ois.readObject();

			ois.close();

			return T;
		} catch (FileNotFoundException e2) {
			e2.printStackTrace();
		} catch (IOException e1) {

		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		return null;

	}

	public static void gordeErabiltzaile(ArrayList<Erabiltzailea> erabiltzaileak, String filename) {
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(filename);
			ObjectOutputStream os = new ObjectOutputStream(fos);

			for (int i = 0; i < erabiltzaileak.size(); i++) {
				os.writeObject(erabiltzaileak.get(i));
			}

			os.close();

		} catch (FileNotFoundException e1) {
			System.out.println(e1);
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public static ArrayList<Erabiltzailea> irakurriErabiltzaile(String filename) {
		ArrayList<Erabiltzailea> erabiltzaileak = new ArrayList<Erabiltzailea>();
		try {
			FileInputStream fis = new FileInputStream(filename);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Erabiltzailea T = (Erabiltzailea) ois.readObject();
			while (T != null) {
				erabiltzaileak.add(T);
				T = (Erabiltzailea) ois.readObject();
			}

			ois.close();
		} catch (FileNotFoundException e2) {
			e2.printStackTrace();
		} catch (IOException e1) {

		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		return erabiltzaileak;
	}

	public static void gordeTaldekide(DefaultListModel<Taldekide> dlmTaldekide, String filename) {
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(filename);
			ObjectOutputStream os = new ObjectOutputStream(fos);

			for (int i = 0; i < dlmTaldekide.size(); i++) {
				os.writeObject(dlmTaldekide.get(i));
			}

			os.close();

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public static ArrayList<Taldekide> irakurriTaldekide(String filename) {
		ArrayList<Taldekide> taldekideak = new ArrayList<Taldekide>();
		try {
			FileInputStream fis = new FileInputStream(filename);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Taldekide T = (Taldekide) ois.readObject();
			while (T != null) {
				taldekideak.add(T);
				T = (Taldekide) ois.readObject();
			}

			ois.close();
		} catch (FileNotFoundException e2) {
			e2.printStackTrace();
		} catch (IOException e1) {

		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		return taldekideak;
	}

	public static void aldatuTaldekide(ArrayList<Taldekide> dlmTaldekide, String sourceFilename, String finalFilename) {
		FileOutputStream fos;
		FileOutputStream fos2;
		try {
			fos = new FileOutputStream(finalFilename);
			ObjectOutputStream os = new ObjectOutputStream(fos);

			for (int i = 0; i < dlmTaldekide.size(); i++) {
				os.writeObject(dlmTaldekide.get(i));
			}

			os.close();

			fos2 = new FileOutputStream(sourceFilename);
			ObjectOutputStream os2 = new ObjectOutputStream(fos2);
			os2.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public static ArrayList<Talde> irakurriTalde(String filename) {
		ArrayList<Talde> taldeak = new ArrayList<Talde>();
		try {
			FileInputStream fis = new FileInputStream(filename);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Talde T = (Talde) ois.readObject();
			while (T != null) {
				taldeak.add((Talde) T);
				T = (Talde) ois.readObject();
			}
			fis.close();
			ois.close();
		} catch (FileNotFoundException e2) {
			e2.printStackTrace();
		} catch (IOException e1) {
			System.out.println(e1.toString());
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		return taldeak;
	}

	public static void gordeEpaile(DefaultListModel<Epaile> dlmEpaile, String filename) {
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(filename);
			ObjectOutputStream os = new ObjectOutputStream(fos);

			for (int i = 0; i < dlmEpaile.size(); i++) {
				os.writeObject(dlmEpaile.get(i));
			}

			os.close();

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public static ArrayList<Epaile> irakurriEpaile(String filename) {
		ArrayList<Epaile> epaileak = new ArrayList<Epaile>();
		try {
			FileInputStream fis = new FileInputStream(filename);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Epaile T = (Epaile) ois.readObject();
			while (T != null) {
				epaileak.add(T);
				T = (Epaile) ois.readObject();
			}

			ois.close();
		} catch (FileNotFoundException e2) {
			e2.printStackTrace();
		} catch (IOException e1) {

		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		return epaileak;
	}

	public static void gordeTalde(ArrayList<Talde> taldeak, String filename) {
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(filename);
			ObjectOutputStream os = new ObjectOutputStream(fos);

			for (int i = 0; i < taldeak.size(); i++) {
				os.writeObject(taldeak.get(i));
			}
			os.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public static void gordeKanporaketa(Kanporaketa kanporaketa, String filename) {
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(filename);
			ObjectOutputStream os = new ObjectOutputStream(fos);

			os.writeObject(kanporaketa);
			os.close();

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public static Kanporaketa irakurriKanporaketak(String filename) {
		try {
			FileInputStream fis = new FileInputStream(filename);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Kanporaketa K = (Kanporaketa) ois.readObject();
			ois.close();
			return K;
		} catch (FileNotFoundException e2) {
			e2.printStackTrace();
		} catch (IOException e1) {
			System.out.println(e1);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		return null;
	}

	public static void gordeKanporaketakOld(ArrayList<Kanporaketa> kanporaketak, String filename) {
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(filename);
			ObjectOutputStream os = new ObjectOutputStream(fos);
			for (int i = 0; i < kanporaketak.size(); i++) {
				os.writeObject(kanporaketak.get(i));
			}

			os.close();

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public static ArrayList<Kanporaketa> irakurriKanporaketakOld(String filename) {
		ArrayList<Kanporaketa> kanporaketak = new ArrayList<Kanporaketa>();
		try {
			FileInputStream fis = new FileInputStream(filename);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Kanporaketa K = (Kanporaketa) ois.readObject();
			while (K != null) {
				kanporaketak.add((Kanporaketa) K);
				K = (Kanporaketa) ois.readObject();
			}

			ois.close();
		} catch (FileNotFoundException e2) {
			e2.printStackTrace();
		} catch (IOException e1) {
			System.out.println(e1);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		return kanporaketak;
	}

	public static String setTalde(int partidaPos, String fasea, String talde, Kanporaketa K) {

		if (fasea.equals("Final Laurdenak")) {
			if (talde.equals("A")) {
				return K.getFinalLaurdenak().get(partidaPos).getTaldeAstring();
			} else {
				return K.getFinalLaurdenak().get(partidaPos).getTaldeBstring();
			}
		} else if (fasea.equals("Semifinalak")) {
			if (talde.equals("A")) {
				return K.getSemifinalak().get(partidaPos).getTaldeAstring();
			} else {
				return K.getSemifinalak().get(partidaPos).getTaldeBstring();
			}
		} else if (fasea.equals("34postuak")) {
			if (talde.equals("A")) {
				return K.getPos34().getTaldeAstring();
			} else {
				return K.getPos34().getTaldeBstring();
			}
		} else {
			if (talde.equals("A")) {
				return K.getFinala().getTaldeAstring();
			} else {
				return K.getFinala().getTaldeBstring();
			}
		}
	}

	public static String setPoints(int partidaPos, String fasea, String talde, Kanporaketa K) {

		if (fasea.equals("Final Laurdenak")) {
			if (talde.equals("A")) {
				return K.getFinalLaurdenak().get(partidaPos).getPuntuakA();
			} else {
				return K.getFinalLaurdenak().get(partidaPos).getPuntuakB();
			}
		} else if (fasea.equals("Semifinalak")) {
			if (talde.equals("A")) {
				return K.getSemifinalak().get(partidaPos).getPuntuakA();
			} else {
				return K.getSemifinalak().get(partidaPos).getPuntuakB();
			}
		} else if (fasea.equals("34postuak")) {
			if (talde.equals("A")) {
				return K.getPos34().getPuntuakA();
			} else {
				return K.getPos34().getPuntuakB();
			}
		} else {
			if (talde.equals("A")) {
				return K.getFinala().getPuntuakA();
			} else {
				return K.getFinala().getPuntuakB();
			}
		}
	}

	public static String setArbitro(int partidaPos, String fasea, Kanporaketa K) {

		if (fasea.equals("Final Laurdenak")) {

			return K.getFinalLaurdenak().get(partidaPos).getEpailea();
		} else if (fasea.equals("Semifinalak")) {
			return K.getSemifinalak().get(partidaPos).getEpailea();

		} else if (fasea.equals("34postuak")) {
			return K.getPos34().getEpailea();

		} else {
			return K.getFinala().getEpailea();

		}
	}

}
