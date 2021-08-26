package Juego;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Iterator;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Juego1 extends javax.swing.JFrame implements MouseListener {
	JLabel im1 = new JLabel();
	JLabel im2 = new JLabel();
	JLabel im3 = new JLabel();
	JLabel im4 = new JLabel();
	JLabel im5 = new JLabel();
	JLabel im6 = new JLabel();
	JLabel im7 = new JLabel();
	JLabel im8 = new JLabel();
	JLabel im9 = new JLabel();
	JLabel im10 = new JLabel();
	JLabel im11 = new JLabel();
	JLabel im12 = new JLabel();
	JLabel im1check = new JLabel();
	JLabel im2check = new JLabel();
	JLabel im3check = new JLabel();
	JLabel im4check = new JLabel();
	JLabel im5check = new JLabel();
	JLabel im6check = new JLabel();
	JLabel im7check = new JLabel();
	JLabel im8check = new JLabel();
	JLabel im9check = new JLabel();
	JLabel im10check = new JLabel();
	JLabel im11check = new JLabel();
	JLabel im12check = new JLabel();

	JLabel puntos = new JLabel();
	JButton iniciar = new JButton();

	JLabel[] arrayimcheck = new JLabel[12];
	JLabel[] arrayim = new JLabel[12];
	int arraynumeroim[] = new int[12];
	int arrayrepeticiones[] = new int[6];
	int click = 0;
	int vista1 = 0;
	int vista2 = 0;
	int puntaje = 0;
	int arraycontrolparejas[] = new int[12];
	int arraycantidadclick[] = new int[12];

	public Juego1() {
		initComponents();
		initArreglo();
		setResizable(false);
		setSize(1000, 580);
		setLocationRelativeTo(null);
	}
	

	private void initComponents() {

		JLabel etiquetaT = new JLabel();
		etiquetaT.setFont(new java.awt.Font("Arial", 0, 22));
		etiquetaT.setText("DUPLICA LA HISTORIA");

		iniciar.setFont(new java.awt.Font("Tahoma", 0, 36));
		iniciar.setText("Inicia");
		iniciar.setBounds(10, 310, 230, 80);
		iniciar.addMouseListener(this);

		im1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Interrogacion.jpg")));
		im1.setBounds(5, 0, 100, 100);
		im1.addMouseListener(this);
		im2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Interrogacion.jpg")));
		im2.setBounds(113, 0, 100, 100);
		im2.addMouseListener(this);
		im3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Interrogacion.jpg")));
		im3.setBounds(220, 0, 100, 100);
		im3.addMouseListener(this);
		im4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Interrogacion.jpg")));
		im4.setBounds(5, 110, 120, 100);
		im3.addMouseListener(this);
		im5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Interrogacion.jpg")));
		im5.setBounds(113, 110, 100, 100);
		im5.addMouseListener(this);
		im6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Interrogacion.jpg")));
		im6.setBounds(220, 110, 100, 100);
		im6.addMouseListener(this);
		im7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Interrogacion.jpg")));
		im7.setBounds(5, 220, 100, 100);
		im7.addMouseListener(this);
		im8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Interrogacion.jpg")));
		im8.setBounds(113,220, 100, 100);
		im8.addMouseListener(this);
		im9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Interrogacion.jpg")));
		im9.setBounds(220, 220, 100, 100);
		im9.addMouseListener(this);
		im10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Interrogacion.jpg")));
		im10.setBounds(5, 330, 100, 100);
		im10.addMouseListener(this);
		im11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Interrogacion.jpg")));
		im11.setBounds(113, 330, 100, 100);
		im11.addMouseListener(this);
		im12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Interrogacion.jpg")));
		im12.setBounds(220, 330, 100, 100);
		im12.addMouseListener(this);
		im1check.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1check.jpg")));
		im1check.setBounds(700, 10,100,100);
		im2check.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2check.jpg")));
		im2check.setBounds(820, 10,100,100);
		im3check.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/3check.jpg")));
		im3check.setBounds(700, 150,100,100);
		im4check.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/4check.jpg")));
		im4check.setBounds(820, 150,100,100);
		im5check.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/5check.jpg")));
		im5check.setBounds(700, 280,100,100);
		im6check.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/6check.jpg")));
		im6check.setBounds(820, 280,100,100);



		JLabel puntostext = new JLabel();
		puntostext.setFont(new java.awt.Font("Tahoma", 0, 36));
		puntostext.setBounds(90, -100, 200, 530);
		puntostext.setText("PUNTOS:");

		puntos.setFont(new java.awt.Font("Tahoma", 0, 36));
		puntos.setBounds(140, 0, 100, 530);
		puntos.setText("0");

		JPanel panelcartas = new JPanel();
		panelcartas.setBackground(new java.awt.Color(121, 158, 200));
		panelcartas.setLayout(null);
		panelcartas.setBounds(320, 0, 325, 480);
		panelcartas.add(im1);
		panelcartas.add(im2);
		panelcartas.add(im3);
		panelcartas.add(im4);
		panelcartas.add(im5);
		panelcartas.add(im6);
		panelcartas.add(im7);
		panelcartas.add(im8);
		panelcartas.add(im9);
		panelcartas.add(im10);
		panelcartas.add(im11);
		panelcartas.add(im12);

		JPanel titulo = new JPanel();
		titulo.setBackground(new java.awt.Color(255, 255, 255));
		titulo.add(etiquetaT);

		JPanel info = new JPanel();
		info.setBackground(new java.awt.Color(83, 73, 122));
		info.setBounds(320, 0, 260, 420);
		info.add(iniciar);

		JPanel centro = new JPanel();
		centro.setBackground(new java.awt.Color(57, 147, 142));
		centro.setLayout(null);
		centro.add(panelcartas);
		centro.add(puntos);
		centro.add(puntostext);
		centro.add(im1check);
		centro.add(im2check);
		centro.add(im3check);
		centro.add(im4check);
		centro.add(im5check);
		centro.add(im6check);

		add(centro, java.awt.BorderLayout.CENTER);
		add(titulo, java.awt.BorderLayout.PAGE_START);
		add(info, java.awt.BorderLayout.PAGE_END);

		pack();
	}		
	

	private void initArreglo() {

		initarregloim();
		initarregloimcheck();
		rellenararreglos(arraynumeroim);
		rellenararreglos(arrayrepeticiones);
		rellenararreglos(arraycontrolparejas);
		rellenararreglos(arraycantidadclick);

		int posicionim;
		Random aleatorio = new Random();

		for (int a = 0; a < 12; a++)

		{
			posicionim = aleatorio.nextInt(6);

			if (arrayrepeticiones[posicionim] < 2) {
				arraynumeroim[a] = posicionim + 1;
				arrayrepeticiones[posicionim]++;
				System.out.print(arraynumeroim[a] + " ");
			} else {
				a--;
			}
		}

	}

	private void initarregloimcheck() {
		arrayimcheck[0] = im1check;
		arrayimcheck[1] = im2check;
		arrayimcheck[2] = im3check;
		arrayimcheck[3] = im4check;
		arrayimcheck[4] = im5check;
		arrayimcheck[5] = im6check;
		arrayimcheck[6] = im1check;
		arrayimcheck[7] = im2check;
		arrayimcheck[8] = im3check;
		arrayimcheck[9] = im4check;
		arrayimcheck[10] = im5check;
		arrayimcheck[11] = im6check;

		for (int i = 0; i < 12; i++) {
			arrayimcheck[i].setIcon(new ImageIcon(getClass().getResource("/imagenes/" + (i + 1) + ".jpg")));
			arrayimcheck[i].addMouseListener(this);

		}
	}

	private void rellenararreglos(int[] arreglo) {

		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = 0;
		}

	}

	private void initarregloim() {
		arrayim[0] = im1;
		arrayim[1] = im2;
		arrayim[2] = im3;
		arrayim[3] = im4;
		arrayim[4] = im5;
		arrayim[5] = im6;
		arrayim[6] = im7;
		arrayim[7] = im8;
		arrayim[8] = im9;
		arrayim[9] = im10;
		arrayim[10] = im11;
		arrayim[11] = im12;

		for (int i = 0; i < arrayim.length; i++) {
			arrayim[i].setIcon(new ImageIcon(getClass().getResource("/imagenes/Interrogacion.jpg")));
			arrayim[i].addMouseListener(this);
		}
	}
	private void validarparejas(int vista1, int vista2) {
		if (arraynumeroim[vista1] == arraynumeroim[vista2]) {
			int checkvista1 = arraynumeroim[vista1];
			int checkvista2 = arraynumeroim[vista2];

			puntaje = puntaje + 100;
			puntos.setText(puntaje + "");
			arraycontrolparejas[vista1] = 1;
			arraycontrolparejas[vista2] = 1;
			checkim(vista1, vista2, checkvista1, checkvista2);

		} else {
			arrayim[vista1].setIcon(new ImageIcon(getClass().getResource("/imagenes/Interrogacion.jpg")));
			arrayim[vista2].setIcon(new ImageIcon(getClass().getResource("/imagenes/Interrogacion.jpg")));
			arraycantidadclick[vista1] = 0;
			arraycantidadclick[vista2] = 0;
		}
	}

	private void checkim(int vista1, int vista2, int checkvista1, int checkvista2) {

		if (arraycontrolparejas[vista1] == 1 && arraycontrolparejas[vista2] == 1) {
			arrayimcheck[checkvista1 - 1]
					.setIcon(new ImageIcon(getClass().getResource("/imagenes/" + checkvista1 + "check.jpg")));
		}

	}

	private boolean verificarparejas(int i) {
		if (arraycontrolparejas[i] != 1) {
			return true;
		} else
			return false;
	}

	@Override
	public void mouseClicked(MouseEvent e) {

		if (e.getSource() == iniciar) {
			initArreglo();
			puntaje = 0;
			click = 0;
			vista1 = 0;
			vista2 = 0;
			puntos.setText("0");
		}

		for (int i = 0; i < arrayim.length; i++) {
			if (e.getSource() == arrayim[i] && verificarparejas(i)) {

				arraycantidadclick[i]++;
				if (arraycantidadclick[i] < 2) {
					click++;

					arrayim[i].setIcon(new ImageIcon(getClass().getResource("/Imagenes/" + arraynumeroim[i] + ".jpg")));

					if (click == 1) {
						vista1 = i;
						System.out.println(vista1);
					} else {
						vista2 = i;
						System.out.println(vista2);
					}
				}
			}
		}

			if (e.getSource() == arrayimcheck[0] ) {
				JOptionPane.showMessageDialog(null, "Soy Albert Einstein, nací en Alemania, soy un muy brillante físico, tanto asi que muchos me consideran el científico mas importante\n de los ultimos años mi obra mas importante es la reconocida Teoria de la Relatividad, si quieres conocer más sobre ella visita este link:\n https://www.youtube.com/watch?v=Thh6fOHz-lA");
			}
			else if (e.getSource() == arrayimcheck[1]) {
				JOptionPane.showMessageDialog(null,"Hola!, mi nombre es Marie Curie soy una cientifica polaca muy curiosa, me gustaba navegar por todas las ciencias, física, matemática y química,\n tanto asi que junto a mi esposo nos converitimos en los padres de los rayos X, pese a todos las dificultades de la época,\n logré convertirme en una de las científicas mas importantes de la historia, si te interesa leer sobre mi puedes visitar la siguiente página web: https://www.youtube.com/watch?v=3tuWzjaQuA4" );
			} else if (e.getSource() == arrayimcheck[2]) {
				JOptionPane.showMessageDialog(null, "Guau! Me presento, soy la perrita Laika, pero seguro me conoces como \"el primer ser vivo en orbitar la atmosfera terrestre e incluso un poco más alla\" \nposiblemente para los humanos no sea tan importante como ese tal Einstein, pero en el mundo animal soy una heroína\n y embajadora de la paz entre humanos y animales, si deseas saber mas sobre mi, puedes ver este video: !Guau¡  https://www.youtube.com/watch?v=IKs4wO3E6wk");
			} else if (e.getSource() == arrayimcheck[3]) {
				JOptionPane.showMessageDialog(null, "Me presento, mi llamo Nikola Tesla, aunque las personas me suelen llamar loco por la calle, lo cierto es que soy considerado el rey del electromagnetismo, \nesto gracias a mis multiples invenciones en el campo de la electricidad e incluso hay un experimento con mi nombre \"las bobinas de Tesla\",\n Si quieres conocer mas de mi mira este video: https://youtu.be/2nOW8NtM858");
			} else if (e.getSource() == arrayimcheck[4]) {
				JOptionPane.showMessageDialog(null, "Saludos, Soy Rosalind Franklin, soy experta en estudiar el ADN, tanto asi que descubrí una forma eficaz de analizarlo de muchas maneras, si quieres saber mas\n sobre mi puedes ver este video:\n https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwiK-q-3sM3yAhWwaDABHW3uAXsQwqsBegQIBxAB&url=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3D4Ap2I3UpFMk&usg=AOvVaw2zgZ0_ZCRxFiLcXoEzevFm");
			} else if (e.getSource() == arrayimcheck[5]) {
				JOptionPane.showMessageDialog(null, "Hola! Soy Isaac Newton, para muchos la persona que más ha aportado a los inicions de la ciencia, esto gracias a que fuí físico, teólogo, astrónomo, inventor, alquimista y matemático,\n además aporté mucho para dar explicaciones de todo tipo, entre ellas y la mas famosa fue \" La ley de la gravedad\" \nque en un futuro sería modificada por Einstein si quieres saber mas de mi puedes ver el siguiente video: https://www.youtube.com/watch?v=9yH_LiONXEo");
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
		for (int i = 0; i < arrayim.length; i++) {
			if (e.getSource() == arrayim[i]) {
				if (click == 2) {
					validarparejas(vista1, vista2);
					click = 0;
				}
			}
		}
	}
}
