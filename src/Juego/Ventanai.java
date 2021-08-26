package Juego;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Ventanai extends JFrame implements MouseListener{
	
	JButton  siguiente = new JButton(new ImageIcon("SIGUI.png"));
	JButton  anterior = new JButton(new ImageIcon("ANTE.png"));
		
	public JPanel panel;
	public Ventanai() {
		setSize(1000, 500);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Instrucciones");
		componentesventana();
		
	}
	
	private void componentesventana() {
		panel();
		enunciado();
		logo();
		
	} 
	
	private void panel() {
		panel = new JPanel();
		panel.setBackground(Color.cyan);
		this.getContentPane().add(panel);
		
	}
	
	private void enunciado() {

		JLabel enunciadoparte1 = new JLabel();
		panel.setLayout(null);
		enunciadoparte1.setText("A continuación, encontraras un enunciado con características y funciones propias de");
		enunciadoparte1.setBounds(50,70, 900, 20);
		enunciadoparte1.setHorizontalAlignment(SwingConstants.CENTER);
		enunciadoparte1.setFont(new Font("arial", Font.PLAIN, 20));
		panel.add(enunciadoparte1);
		
		JLabel enunciadoparte2 = new JLabel();
		panel.setLayout(null);
		enunciadoparte2.setText("determinado organelo. Un poco más abajo tendrás la oportunidad de elegir cual imagen ");
		enunciadoparte2.setBounds(50,90, 900, 20);
		enunciadoparte2.setHorizontalAlignment(SwingConstants.CENTER);
		enunciadoparte2.setFont(new Font("arial", Font.PLAIN, 20));
		panel.add(enunciadoparte2);
		
		JLabel enunciadoparte3 = new JLabel();
		panel.setLayout(null);
		enunciadoparte3.setText("se parece más al organelo descrito anteriormente. Deberás pulsar la imagen que consideres correcta y ");
		enunciadoparte3.setBounds(50,110, 900, 20);
		enunciadoparte3.setHorizontalAlignment(SwingConstants.CENTER);
		enunciadoparte3.setFont(new Font("arial", Font.PLAIN, 20));
		panel.add(enunciadoparte3);
		
		JLabel enunciadoparte4 = new JLabel();
		panel.setLayout(null);
		enunciadoparte4.setText("continuar con las demás preguntas. Utiliza este espacio para aprender a conciencia");
		enunciadoparte4.setBounds(50,140, 900, 20);
		enunciadoparte4.setHorizontalAlignment(SwingConstants.CENTER);
		enunciadoparte4.setFont(new Font("arial", Font.PLAIN, 20));
		panel.add(enunciadoparte4);
		
		JLabel enunciadoparte5 = new JLabel();
		panel.setLayout(null);
		enunciadoparte5.setText("¡Empieza cuando estés list@! ");
		enunciadoparte5.setBounds(50,170, 900, 20);
		enunciadoparte5.setHorizontalAlignment(SwingConstants.CENTER);
		enunciadoparte5.setFont(new Font("arial", Font.PLAIN, 20));
		panel.add(enunciadoparte5);
	}
	
	
	private void logo() {
		JButton logo = new JButton(new ImageIcon("ECGAMES.png"));
		logo.setBounds(800, 300, 100, 65);
		panel.add(logo);
	
		siguiente.setBounds(400, 300, 200, 80);
		siguiente.addMouseListener(this);
		panel.add(siguiente);
		
		anterior.setBounds(150, 300, 200, 80);
		anterior.setEnabled(false);
		panel.add(anterior);
		
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {

		 if (e.getSource() == siguiente) {
			 Ventanai miventanai = new Ventanai();
				miventanai.setVisible(false);
			
			Ventana0 miventana0 = new Ventana0();
			miventana0.setVisible(true);
		}else if (e.getSource() == anterior) {
			
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