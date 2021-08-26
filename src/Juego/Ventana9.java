package Juego;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana9 extends JFrame implements MouseListener  {
	JButton opcion2 = new JButton(new ImageIcon("AMILOPLASTOS.png"));
	JButton opcionCorrecta = new JButton(new ImageIcon("PCEpng.png"));
	JButton anterior = new JButton(new ImageIcon("ANTE.png"));
	JButton siguiente = new JButton(new ImageIcon("SIGUI.png"));

	public JPanel panel;
	public Ventana9() {
		setSize(1000, 700);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Pregunta 10");
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		componentesventana();
	}
	
	private void componentesventana() {
		panel();
		enunciado();
		logo();
		
		opcion2.setBounds(100, 150, 300, 214 );
		opcion2.addMouseListener(this);
		panel.add(opcion2);
		
		opcionCorrecta.setBounds(500, 150, 300, 214 );
		opcionCorrecta.addMouseListener(this);
		panel.add(opcionCorrecta);
	} 
	
	private void panel() {
		panel = new JPanel();
		panel.setBackground(Color.cyan);
		this.getContentPane().add(panel);
	}
	
	private void enunciado() {
		
		JLabel enunciadoparte1 = new JLabel();
		panel.setLayout(null);
		enunciadoparte1.setText("La pared celular es una estructura rígida en la parte exterior de la membrana celular de los");
		enunciadoparte1.setBounds(50,70, 900, 20);
		enunciadoparte1.setHorizontalAlignment(SwingConstants.CENTER);
		enunciadoparte1.setFont(new Font("arial", Font.PLAIN, 20));
		panel.add(enunciadoparte1);
		
		JLabel enunciadoparte2 = new JLabel();
		panel.setLayout(null);
		enunciadoparte2.setText("vegetales, hongos, algas y bacterias que le da la rigidez, para el soporte a la célula.");
		enunciadoparte2.setBounds(50,90, 900, 20);
		enunciadoparte2.setHorizontalAlignment(SwingConstants.CENTER);
		enunciadoparte2.setFont(new Font("arial", Font.PLAIN, 20));
		panel.add(enunciadoparte2);
	}
	
	private void logo() {
	
		JButton logo = new JButton(new ImageIcon("ECGAMES.png"));
		logo.setBounds(800, 500, 100, 65);
		panel.add(logo);
		
		siguiente.setBounds(400, 500, 200, 80);
		siguiente.addMouseListener(this);
		panel.add(siguiente);
		
		anterior.setBounds(150, 500, 200, 80);
		anterior.addMouseListener(this);
		panel.add(anterior);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
if (e.getSource() == opcionCorrecta) {
			
		    ImageIcon GJ1 = new ImageIcon("C:\\\\Users\\\\lcmor\\\\OneDrive\\\\Escritorio\\\\PROGRAMACIÓN DE COMPUTADORES\\\\Juego Final\\\\GJ1png.png");
			JOptionPane.showMessageDialog(null, "¡Excelente trabajo! Sigue así", "¡Correcto!", JOptionPane.DEFAULT_OPTION, GJ1);
		
		}else if (e.getSource() == opcion2) {
			ImageIcon BJ = new ImageIcon("C:\\Users\\lcmor\\OneDrive\\Escritorio\\PROGRAMACIÓN DE COMPUTADORES\\Juego Final\\bin\\imagenes\\BJ.png");
			JOptionPane.showMessageDialog(null, "¡Intentalo nuevamente! Solo es cuestion de practica", "¡Incorrecto!", JOptionPane.DEFAULT_OPTION, BJ);
		}else if (e.getSource() == siguiente) {
			Ventana9 miventana9 = new Ventana9();
			miventana9.setVisible(false);
			
			Ventana10 miventana10 = new Ventana10();
			miventana10.setVisible(true);
		}else if (e.getSource() == anterior) {
			Ventana9 miventana9 = new Ventana9();
			miventana9.setVisible(false);
			
			Ventana8 miventana8 = new Ventana8();
			miventana8.setVisible(true);
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