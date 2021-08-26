package Juego;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Interfaz extends javax.swing.JFrame implements MouseListener {
	
	JButton juego1 = new JButton();
	JButton juego2 = new JButton();
	JButton juego3 = new JButton();

	
	public Interfaz() {
		setSize(500, 500);
		initcomponents();
		setLocationRelativeTo(null);
		setResizable(false);
	}
	

	private void initcomponents() {
		 
		JLabel Titulo = new JLabel();
		Titulo.setText("EC GAMES");
		Titulo.setFont(new java.awt.Font("Tahoma", 0, 36));
		
		JLabel ecgames = new JLabel();
		ecgames.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ecgames.jpg")));
		ecgames.setBounds(150, 0, 200, 200);
		
		juego1.setText("Juego 1");
		juego1.setFont(new java.awt.Font("Tahoma", 0, 36));
		juego1.setLayout(null);
		juego1.addMouseListener(this);
		juego1.setBounds(125,180,250,60);
		
		juego2.setText("Juego 2");
		juego2.setFont(new java.awt.Font("Tahoma", 0, 36));
		juego2.setLayout(null);
		juego2.addMouseListener(this);
		juego2.setBounds(125,250,250,60);
		
		
		juego3.setText("Juego 3");
		juego3.setFont(new java.awt.Font("Tahoma", 0, 36));
		juego3.setLayout(null);
		juego3.addMouseListener(this);
		juego3.setBounds(125,320,250,60);
		
		
		JPanel imagen = new JPanel();
		imagen.setLayout(null);
		imagen.setBounds(320, 0, 325, 480);
		imagen.add(ecgames);
		

		JPanel arriba = new JPanel();
		arriba.setBackground(new java.awt.Color(121, 158, 200));
		arriba.add(Titulo);
		
		JPanel medio = new JPanel();
		medio.setLayout(null);
		medio.setBackground(new java.awt.Color(121, 158, 200));
		medio.add(ecgames);
		medio.add(juego1);
		medio.add(juego2);
		medio.add(juego3);		
		
		
		add(arriba, java.awt.BorderLayout.PAGE_START);
		add(medio, java.awt.BorderLayout.CENTER);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		if (e.getSource() == juego1) {
			Juego1 ventanajuego1 = new Juego1();
			ventanajuego1.setVisible(true);
			
		}
		
	else if (e.getSource() == juego2) {
		Ventanai ventanajuego2 = new Ventanai();
		ventanajuego2.setVisible(true);
	}else if (e.getSource() == juego3) {
		Juego3 ventanajuego3 = new Juego3();
		ventanajuego3.setVisible(true);
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
