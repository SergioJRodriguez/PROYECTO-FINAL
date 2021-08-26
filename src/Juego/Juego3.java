package Juego;

import static java.lang.Integer.parseInt;
import java.util.Random;
import javax.swing.JOptionPane;

public class Juego3 extends javax.swing.JFrame {

	public Juego3() {
		initComponents();
	}

	private void initComponents() {

		jLabel3 = new javax.swing.JLabel();
		JPanel = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		tablero = new javax.swing.JTextArea();
		jButton1 = new javax.swing.JButton();
		jLabel4 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		setResizable(false);
		setLocationRelativeTo(null);
		setBackground(new java.awt.Color(51, 255, 204));

		jLabel3.setText("hay serpiente en 28-6");

		JPanel.setBackground(new java.awt.Color(102, 255, 102));

		jLabel2.setText("hay escalera en 1-10");

		tablero.setBackground(new java.awt.Color(51, 255, 204));
		tablero.setColumns(20);
		tablero.setRows(5);
		tablero.setText(
				"24._   25._   26._   27._   28._   29._   30._ \n\n16._   17._   18._   19._   20._   21._   22._   23._\n\n9._   10._   11._   12._   13._   14._   15._ \n\n1.XO   2._   3._   4._   5._   6._   7._   8.__");
		jScrollPane1.setViewportView(tablero);

		jButton1.setBackground(new java.awt.Color(0, 204, 204));
		jButton1.setText("dados");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jLabel4.setText("hay serpiente en 20-8");

		jLabel6.setText("hay serpiente en 22-11");

		jLabel8.setText("hay serpiente en 29-16");

		jLabel1.setText("hay escalera en 3-23");

		jLabel5.setText("hay escalera en 5-13");

		jLabel7.setText("hay escalera en 12-27");

		jLabel9.setText("hay escalera en 21-30");

		javax.swing.GroupLayout JPanelLayout = new javax.swing.GroupLayout(JPanel);
		JPanel.setLayout(JPanelLayout);
		JPanelLayout.setHorizontalGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(JPanelLayout.createSequentialGroup().addGroup(JPanelLayout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(JPanelLayout.createSequentialGroup().addGap(120, 120, 120).addComponent(jButton1))
						.addGroup(JPanelLayout.createSequentialGroup().addContainerGap().addComponent(jScrollPane1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(46, Short.MAX_VALUE))
				.addGroup(JPanelLayout.createSequentialGroup().addGap(30, 30, 30).addGroup(JPanelLayout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(JPanelLayout.createSequentialGroup().addComponent(jLabel9)
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(JPanelLayout.createSequentialGroup()
								.addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel5).addComponent(jLabel1).addComponent(jLabel7))
								.addGap(52, 52, 52)
								.addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel4).addComponent(jLabel8).addComponent(jLabel2)
										.addComponent(jLabel6))
								.addGap(0, 0, Short.MAX_VALUE)))));
		JPanelLayout.setVerticalGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(JPanelLayout.createSequentialGroup().addContainerGap(35, Short.MAX_VALUE)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2).addComponent(jLabel9))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel6)
								.addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1).addComponent(jLabel4))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel7).addComponent(jLabel8))
						.addGap(26, 26, 26).addComponent(jButton1)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(JPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel3,
								javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(136, 136, 136).addComponent(jLabel3,
						javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addComponent(JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
	}

	private String[] j1 = new String[30];
	private String[] j2 = new String[30];

	private int posj1 = 0;
	private int posj2 = 0;

	private int turno = 0;

	private Random ran = new Random();

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

		if (turno == 0) {
			JOptionPane.showMessageDialog(null, "turno j1");

			int espacios = ran.nextInt(5) + 1;

			posj1 += espacios;

			JOptionPane.showMessageDialog(null, "haz sacado un" + espacios);

			for (int i = 0; i < j1.length; i++) {

				if (posj1 == 2) {

					String showInputDialog = JOptionPane.showInputDialog(null, "8-6");

					int q = Integer.valueOf(showInputDialog);

					if (q == 2) {

						JOptionPane.showMessageDialog(null, "pisas una escalera subes a la posicion 23");
						posj1 = 22;

					} else {
						JOptionPane.showMessageDialog(null, "error bajas 1");
						posj1 = 1;
					}
				}
				if (posj1 == 4) {
					String showInputDialog = JOptionPane.showInputDialog(null, "14-10");
					int a = Integer.valueOf(showInputDialog);

					if (a == 4) {
						JOptionPane.showMessageDialog(null, "pisas una escalera subes a la posicion 13");
						posj1 = 12;

					} else {
						JOptionPane.showMessageDialog(null, "error bajas 1");
						posj1 = 3;

					}
				}
				if (posj1 == 11) {
					String showInputDialog = JOptionPane.showInputDialog(null, "30-15");
					int b = Integer.valueOf(showInputDialog);
					if (b == 15) {
						JOptionPane.showMessageDialog(null, "pisas una escalera subes a la posicion 27");
						posj1 = 26;

					} else {
						JOptionPane.showMessageDialog(null, "error bajas 1");
						posj1 = 10;
					}
				}
				if (posj1 == 20) {
					String showInputDialog = JOptionPane.showInputDialog(null, "45+44");
					int c = Integer.valueOf(showInputDialog);
					if (c == 99) {
						JOptionPane.showMessageDialog(null, "pisas una escalera subes a la posicion 30");
						posj1 = 29;

					} else {
						JOptionPane.showMessageDialog(null, "error bajas 1");
						posj1 = 19;
					}
				}
				if (posj1 == 1) {
					String showInputDialog = JOptionPane.showInputDialog(null, "20-19");
					int d = Integer.valueOf(showInputDialog);
					if (d == 1) {
						JOptionPane.showMessageDialog(null, "pisas una escalera subes a la posicion 10");
						posj1 = 9;

					} else {
						JOptionPane.showMessageDialog(null, "error bajas 1");
						posj1 = 0;
					}
				}
				if (posj1 == 27) {
					String showInputDialog = JOptionPane.showInputDialog(null, "8+8");
					int e = Integer.valueOf(showInputDialog);
					if (e != 16) {
						JOptionPane.showMessageDialog(null, " bajas la mitad");
						posj1 = 11;
					} else {

						JOptionPane.showMessageDialog(null, "pisas una serpiente bajas a la posicion 6");
						posj1 = 5;
					}
				}
				if (posj1 == 21) {
					String showInputDialog = JOptionPane.showInputDialog(null, "10-3");
					int f = Integer.valueOf(showInputDialog);

					if (f != 7) {
						JOptionPane.showMessageDialog(null, "pisas una serpiente bajas a la posicion 11");
						posj1 = 10;
					} else {
						JOptionPane.showMessageDialog(null, " bajas la mitad");
						posj1 = 15;
					}
				}
				if (posj1 == 19) {
					String showInputDialog = JOptionPane.showInputDialog(null, "45-13");
					int g = Integer.valueOf(showInputDialog);
					if (g != 32) {
						JOptionPane.showMessageDialog(null, "pisas una serpiente bajas a la posicion 8");
						posj1 = 7;
					} else {
						JOptionPane.showMessageDialog(null, " bajas la mitad");
						posj1 = 15;
					}
				}
				if (posj1 == 28) {
					String showInputDialog = JOptionPane.showInputDialog(null, "16+44");
					int h = Integer.valueOf(showInputDialog);

					if (60 == h) {
						JOptionPane.showMessageDialog(null, " bajas la mitad");
						posj1 = 21;

					} else {
						JOptionPane.showMessageDialog(null, "pisas una serpiente bajas a la posicion 16");
						posj1 = 15;
					}
				}

				if (i == posj2) {
					j2[i] = "O";
				} else
					j2[i] = "_";

				if (i == posj1) {

					j1[i] = "X";
				} else
					j1[i] = "_";

			}
			tablero.setText("24." + j1[23] + j2[23] + "   " + "25." + j1[24] + j2[24] + "   " + "26." + j1[25] + j2[25]
					+ "   " + "27." + j1[26] + j2[26] + "   " + "28." + j1[27] + j2[27] + "   " + "29." + j1[28]
					+ j2[28] + "   " + "30." + j1[29] + j2[29] + "\n" + "\n" +

					"16." + j1[15] + j2[15] + "   " + "17." + j1[16] + j2[16] + "   " + "18." + j1[17] + j2[17] + "   "
					+ "19." + j1[18] + j2[18] + "   " + "20." + j1[19] + j2[19] + "   " + "21." + j1[20] + j2[20]
					+ "   " + "22." + j1[21] + j2[21] + "   " + "23." + j1[22] + j2[22] + "\n" + "\n" +

					"9." + j1[8] + j2[8] + "   " + "10." + j1[9] + j2[9] + "   " + "11." + j1[10] + j2[10] + "   "
					+ "12." + j1[11] + j2[11] + "   " + "13." + j1[12] + j2[12] + "   " + "14." + j1[13] + j2[13]
					+ "   " + "15." + j1[14] + j2[14] + "\n" + "\n" +

					"1." + j1[0] + j2[0] + "   " + "2." + j1[1] + j2[1] + "   " + "3." + j1[2] + j2[2] + "   " + "4."
					+ j1[3] + j2[3] + "   " + "5." + j1[4] + j2[4] + "   " + "6." + j1[5] + j2[5] + "   " + "7." + j1[6]
					+ j2[6] + "   " + "8." + j1[7] + j2[7]);

			turno = 1;

			if (posj1 >= 29) {
				JOptionPane.showMessageDialog(null, "j1 ha ganado ");
				System.exit(ALLBITS);
			}

		} else {

			if (turno == 1) {
				JOptionPane.showMessageDialog(null, "turno j2");

				int espacios = ran.nextInt(5) + 1;

				posj2 += espacios;

				JOptionPane.showMessageDialog(null, "haz sacado un" + espacios);

				for (int i = 0; i < j2.length; i++) {
					if (posj2 == 2) {

						String showInputDialog = JOptionPane.showInputDialog(null, "8-6");

						int q = Integer.valueOf(showInputDialog);

						if (q == 2) {

							JOptionPane.showMessageDialog(null, "pisas una escalera subes a la posicion 23");
							posj2 = 22;

						} else {
							JOptionPane.showMessageDialog(null, "error bajas 1");
							posj2 = 1;
						}
					}
					if (posj2 == 4) {
						String showInputDialog = JOptionPane.showInputDialog(null, "14-10");
						int a = Integer.valueOf(showInputDialog);

						if (a == 4) {
							JOptionPane.showMessageDialog(null, "pisas una escalera subes a la posicion 13");
							posj2 = 12;

						} else {
							JOptionPane.showMessageDialog(null, "error bajas 1");
							posj2 = 3;

						}
					}
					if (posj2 == 11) {
						String showInputDialog = JOptionPane.showInputDialog(null, "30-15");
						int b = Integer.valueOf(showInputDialog);
						if (b == 15) {
							JOptionPane.showMessageDialog(null, "pisas una escalera subes a la posicion 27");
							posj2 = 26;

						} else {
							JOptionPane.showMessageDialog(null, "error bajas 1");
							posj2 = 10;
						}
					}
					if (posj2 == 20) {
						String showInputDialog = JOptionPane.showInputDialog(null, "45+44");
						int c = Integer.valueOf(showInputDialog);
						if (c == 99) {
							JOptionPane.showMessageDialog(null, "pisas una escalera subes a la posicion 30");
							posj2 = 29;

						} else {
							JOptionPane.showMessageDialog(null, "error bajas 1");
							posj2 = 19;
						}
					}
					if (posj2 == 1) {
						String showInputDialog = JOptionPane.showInputDialog(null, "20-19");
						int d = Integer.valueOf(showInputDialog);
						if (d == 1) {
							JOptionPane.showMessageDialog(null, "pisas una escalera subes a la posicion 10");
							posj2 = 9;

						} else {
							JOptionPane.showMessageDialog(null, "error bajas 1");
							posj2 = 0;
						}
					}
					if (posj2 == 27) {
						String showInputDialog = JOptionPane.showInputDialog(null, "8+8");
						int e = Integer.valueOf(showInputDialog);
						if (e != 16) {
							JOptionPane.showMessageDialog(null, " bajas la mitad");
							posj2 = 11;
						} else {

							JOptionPane.showMessageDialog(null, "pisas una serpiente bajas a la posicion 6");
							posj2 = 5;
						}
					}
					if (posj2 == 21) {
						String showInputDialog = JOptionPane.showInputDialog(null, "10-3");
						int f = Integer.valueOf(showInputDialog);

						if (f != 7) {
							JOptionPane.showMessageDialog(null, "pisas una serpiente bajas a la posicion 11");
							posj2 = 10;
						} else {
							JOptionPane.showMessageDialog(null, " bajas la mitad");
							posj2 = 15;
						}
					}
					if (posj2 == 19) {
						String showInputDialog = JOptionPane.showInputDialog(null, "45-13");
						int g = Integer.valueOf(showInputDialog);
						if (g != 32) {
							JOptionPane.showMessageDialog(null, "pisas una serpiente bajas a la posicion 8");
							posj2 = 7;
						} else {
							JOptionPane.showMessageDialog(null, " bajas la mitad");
							posj2 = 15;
						}
					}
					if (posj2 == 28) {
						String showInputDialog = JOptionPane.showInputDialog(null, "16+44");
						int h = Integer.valueOf(showInputDialog);

						if (60 == h) {
							JOptionPane.showMessageDialog(null, "error bajas la mitad");
							posj2 = 21;

						} else {
							JOptionPane.showMessageDialog(null, "pisas una serpiente bajas a la posicion 16");
							posj2 = 15;
						}
						if (i == posj2) {
							j2[i] = "O";
						} else
							j2[i] = "_";
					}
					tablero.setText("24." + j1[23] + j2[23] + "   " + "25." + j1[24] + j2[24] + "   " + "26." + j1[25]
							+ j2[25] + "   " + "27." + j1[26] + j2[26] + "   " + "28." + j1[27] + j2[27] + "   " + "29."
							+ j1[28] + j2[28] + "   " + "30." + j1[29] + j2[29] + "\n" + "\n" +

							"16." + j1[15] + j2[15] + "   " + "17." + j1[16] + j2[16] + "   " + "18." + j1[17] + j2[17]
							+ "   " + "19." + j1[18] + j2[18] + "   " + "20." + j1[19] + j2[19] + "   " + "21." + j1[20]
							+ j2[20] + "   " + "22." + j1[21] + j2[21] + "   " + "23." + j1[22] + j2[22] + "\n" + "\n" +

							"9." + j1[8] + j2[8] + "   " + "10." + j1[9] + j2[9] + "   " + "11." + j1[10] + j2[10]
							+ "   " + "12." + j1[11] + j2[11] + "   " + "13." + j1[12] + j2[12] + "   " + "14." + j1[13]
							+ j2[13] + "   " + "15." + j1[14] + j2[14] + "\n" + "\n" +

							"1." + j1[0] + j2[0] + "   " + "2." + j1[1] + j2[1] + "   " + "3." + j1[2] + j2[2] + "   "
							+ "4." + j1[3] + j2[3] + "   " + "5." + j1[4] + j2[4] + "   " + "6." + j1[5] + j2[5] + "   "
							+ "7." + j1[6] + j2[6] + "   " + "8." + j1[7] + j2[7]);

					turno = 0;

					if (i == posj2) {
						j2[i] = "O";
					} else
						j2[i] = "_";

					if (posj2 >= 29) {
						JOptionPane.showMessageDialog(null, "j2 ha ganado ");
						System.exit(ALLBITS);

					}
					if (posj2 >= 29 || posj1 >= 29) {
						JOptionPane.showMessageDialog(null, "fin del juego");
						System.exit(ALLBITS);

					}
				}
			}
		}
	}

	public static void main(String args[]) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Juego3().setVisible(true);

			}
		});

	}

	private javax.swing.JPanel JPanel;
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextArea tablero;

}
