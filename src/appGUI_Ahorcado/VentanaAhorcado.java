package appGUI_Ahorcado;

/**
 * Clase VentanaAhorcado
 * 1� DAW, grupoA
 * 31/01/2021
 * @author Adrian L�pez Soto
 *
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.io.File;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Component;

@SuppressWarnings("serial")
public class VentanaAhorcado extends JFrame {

	// VARIABLES:
	private Calculo c;
	private char letraSeleccionada;
	private JPanel panelTeclado;
	private JButton btnA;
	private JButton btnB;
	private JButton btnC;
	private JButton btnD;
	private JButton btnE;
	private JButton btnF;
	private JButton btnG;
	private JButton btnH;
	private JButton btnI;
	private JButton btnJ;
	private JButton btnK;
	private JButton btnL;
	private JButton btnM;
	private JButton btnN;
	private JButton btnEnie;
	private JButton btnO;
	private JButton btnP;
	private JButton btnQ;
	private JButton btnR;
	private JButton btnS;
	private JButton btnT;
	private JButton btnU;
	private JButton btnV;
	private JButton btnW;
	private JButton btnX;
	private JButton btnY;
	private JButton btnZ;
	private JLabel lblTeclado;
	private JPanel panelJuego;
	private JButton btnIniciarJuego;
	private JTextArea taCajaTexto;
	private JPanel panelAhorcado;
	private JLabel lblCajaAhorcado;
	private JButton btnSalirJuego;
	private JButton btnReiniciar;
	private ImageIcon imagen0;
	private ImageIcon imagen1;
	private ImageIcon imagen2;
	private ImageIcon imagen3;
	private ImageIcon imagen4;
	private ImageIcon imagen5;
	private ImageIcon imagen6;
	private ImageIcon imagen7;

	
	// INICIALIZACION VARIABLES:
	{
		c = new Calculo();
		imagen0 = new ImageIcon("imagenes"+File.separator+"ahorcado_0.jpg");
		imagen1 = new ImageIcon("imagenes"+File.separator+"ahorcado_1.jpg");
		imagen2 = new ImageIcon("imagenes"+File.separator+"ahorcado_2.jpg");
		imagen3 = new ImageIcon("imagenes"+File.separator+"ahorcado_3.jpg");
		imagen4 = new ImageIcon("imagenes"+File.separator+"ahorcado_4.jpg");
		imagen5 = new ImageIcon("imagenes"+File.separator+"ahorcado_5.jpg");
		imagen6 = new ImageIcon("imagenes"+File.separator+"ahorcado_6.jpg");
		imagen7 = new ImageIcon("imagenes"+File.separator+"victoria.jpg");
	}
	
	
	// CONSTRUCTORES:
	public VentanaAhorcado() {

		// Marco o frame
		setTitle("Ahorcado");
		setResizable(false);
		setSize(612, 389);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		// Panel del teclado:
		panelJuego = new JPanel();
		panelJuego.setBackground(new Color(220, 220, 220));
		panelJuego.setBounds(3, 3, 340, 123);
		getContentPane().add(panelJuego);
		panelJuego.setLayout(null);
		{
			// Bot�n Iniciar Juego:
			{
				btnIniciarJuego = new JButton("Iniciar juego");
				btnIniciarJuego.setBounds(30, 20, 140, 25);
				btnIniciarJuego.setFont(new Font("Dialog", Font.BOLD, 12));
				btnIniciarJuego.setBackground(new Color(144, 238, 144));
				panelJuego.add(btnIniciarJuego);
				// Listener:
				{
					btnIniciarJuego.addMouseListener(new BtnIniciarJuegoMouseListener());
				}
			}
			
			// Bot�n Reiniciar Juego:
			{
				btnReiniciar = new JButton("Reiniciar");
				btnReiniciar.setFont(new Font("Dialog", Font.BOLD, 12));
				btnReiniciar.setBackground(new Color(238, 232, 170));
				btnReiniciar.setBounds(180, 20, 140, 25);
				panelJuego.add(btnReiniciar);
				// Listeners:
				{
					btnReiniciar.addMouseListener(new BtnReiniciarMouseListener());
				}
			}
			
			// Caja de texto TextArea, donde aparece la palabra cifrada:
			{
				taCajaTexto = new JTextArea();
				taCajaTexto.setBounds(120, 70, 124, 26);
				taCajaTexto.setFont(new Font("Monospaced", Font.PLAIN, 18));
				taCajaTexto.setBackground(new Color(220, 220, 220));
				panelJuego.add(taCajaTexto);
				// JTextArea NO editable:
				taCajaTexto.setEditable(false);
			}
		}
		

		// Panel del teclado:
		panelTeclado = new JPanel();
		panelTeclado.setBackground(new Color(245, 245, 220));
		panelTeclado.setBounds(3, 127, 340, 225);
		getContentPane().add(panelTeclado);
		panelTeclado.setLayout(null);
		{
			// Etiqueta del teclado:
			{
				lblTeclado = new JLabel("Teclado");
				lblTeclado.setBounds(20, 11, 56, 13);
				lblTeclado.setHorizontalAlignment(SwingConstants.CENTER);
				panelTeclado.add(lblTeclado);
			}

			// Botones del teclado:
			{
				// Bot�n A:
				{
					btnA = new JButton("A");
					btnA.setBounds(20, 39, 45, 21);
					panelTeclado.add(btnA);
					// Listeners:
					{
						btnA.addMouseListener(new BtnAMouseListener());
					}
				}
				// Bot�n B:
				{
					btnB = new JButton("B");
					btnB.setBounds(70, 39, 45, 21);
					panelTeclado.add(btnB);
					// Listeners:
					{
						btnB.addMouseListener(new BtnBMouseListener());
					}
				}

				// Bot�n C:
				{
					btnC = new JButton("C");
					btnC.setBounds(120, 39, 45, 21);
					panelTeclado.add(btnC);
					// Listeners:
					{
						btnC.addMouseListener(new BtnCMouseListener());
					}
				}

				// Bot�n D:
				{
					btnD = new JButton("D");
					btnD.setBounds(170, 39, 45, 21);
					panelTeclado.add(btnD);
					// Listeners:
					{
						btnD.addMouseListener(new BtnDMouseListener());
					}
				}

				// Bot�n E:
				{
					btnE = new JButton("E");
					btnE.setBounds(220, 39, 45, 21);
					panelTeclado.add(btnE);
					// Listeners:
					{
						btnE.addMouseListener(new BtnEMouseListener());
					}
				}

				// Bot�n F:
				{
					btnF = new JButton("F");
					btnF.setBounds(270, 39, 45, 21);
					panelTeclado.add(btnF);
					// Listeners:
					{
						btnF.addMouseListener(new BtnFMouseListener());
					}
				}

				// Bot�n G:
				{
					btnG = new JButton("G");
					btnG.setBounds(20, 69, 45, 21);
					panelTeclado.add(btnG);
					// Listeners:
					{
						btnG.addMouseListener(new BtnGMouseListener());
					}
				}

				// Bot�n H:
				{
					btnH = new JButton("H");
					btnH.setBounds(70, 69, 45, 21);
					panelTeclado.add(btnH);
					// Listeners:
					{
						btnH.addMouseListener(new BtnHMouseListener());
					}
				}

				// Bot�n I:
				{
					btnI = new JButton("I");
					btnI.setBounds(120, 69, 45, 21);
					panelTeclado.add(btnI);
					// Listeners:
					{
						btnI.addMouseListener(new BtnIMouseListener());
					}
				}

				// Bot�n J:
				{
					btnJ = new JButton("J");
					btnJ.setBounds(170, 69, 45, 21);
					panelTeclado.add(btnJ);
					// Listeners:
					{
						btnJ.addMouseListener(new BtnJMouseListener());
					}
				}

				// Bot�n K:
				{
					btnK = new JButton("K");
					btnK.setBounds(220, 69, 45, 21);
					panelTeclado.add(btnK);
					// Listeners:
					{
						btnK.addMouseListener(new BtnKMouseListener());
					}
				}

				// Bot�n L:
				{
					btnL = new JButton("L");
					btnL.setBounds(270, 69, 45, 21);
					panelTeclado.add(btnL);
					// Listeners:
					{
						btnL.addMouseListener(new BtnLMouseListener());
					}
				}

				// Bot�n M:
				{
					btnM = new JButton("M");
					btnM.setBounds(20, 99, 46, 21);
					panelTeclado.add(btnM);
					// Listeners:
					{
						btnM.addMouseListener(new BtnMMouseListener());
					}
				}

				// Bot�n N:
				{
					btnN = new JButton("N");
					btnN.setBounds(70, 99, 45, 21);
					panelTeclado.add(btnN);
					// Listeners:
					{
						btnN.addMouseListener(new BtnNMouseListener());
					}
				}

				// Bot�n �:
				{
					btnEnie = new JButton("\u00D1");
					btnEnie.setBounds(120, 99, 45, 21);
					panelTeclado.add(btnEnie);
					// Listeners:
					{
						btnEnie.addMouseListener(new BtnEnieMouseListener());
					}
				}

				// Bot�n O:
				{
					btnO = new JButton("O");
					btnO.setBounds(170, 99, 45, 21);
					panelTeclado.add(btnO);
					// Listeners:
					{
						btnO.addMouseListener(new BtnOMouseListener());
					}
				}

				// Bot�n P:
				{
					btnP = new JButton("P");
					btnP.setBounds(220, 99, 45, 21);
					panelTeclado.add(btnP);
					// Listeners:
					{
						btnP.addMouseListener(new BtnPMouseListener());
					}
				}

				// Bot�n Q:
				{
					btnQ = new JButton("Q");
					btnQ.setBounds(270, 99, 45, 21);
					panelTeclado.add(btnQ);
					// Listeners:
					{
						btnQ.addMouseListener(new BtnQMouseListener());
					}
				}

				// Bot�n R:
				{
					btnR = new JButton("R");
					btnR.setBounds(20, 129, 45, 21);
					panelTeclado.add(btnR);
					// Listeners:
					{
						btnR.addMouseListener(new BtnRMouseListener());
					}
				}

				// Bot�n S:
				{
					btnS = new JButton("S");
					btnS.setBounds(70, 129, 45, 21);
					panelTeclado.add(btnS);
					// Listeners:
					{
						btnS.addMouseListener(new BtnSMouseListener());
					}
				}

				// Bot�n T:
				{
					btnT = new JButton("T");
					btnT.setBounds(120, 129, 45, 21);
					panelTeclado.add(btnT);
					// Listeners:
					{
						btnT.addMouseListener(new BtnTMouseListener());
					}
				}

				// Bot�n U:
				{
					btnU = new JButton("U");
					btnU.setBounds(170, 129, 45, 21);
					panelTeclado.add(btnU);
					// Listeners:
					{
						btnU.addMouseListener(new BtnUMouseListener());
					}
				}

				// Bot�n V:
				{
					btnV = new JButton("V");
					btnV.setBounds(220, 129, 45, 21);
					panelTeclado.add(btnV);
					// Listeners:
					{
						btnV.addMouseListener(new BtnVMouseListener());
					}
				}

				// Bot�n W:
				{
					btnW = new JButton("W");
					btnW.setBounds(269, 129, 48, 21);
					panelTeclado.add(btnW);
					// Listeners:
					{
						btnW.addMouseListener(new BtnWMouseListener());
					}
				}

				// Bot�n X:
				{
					btnX = new JButton("X");
					btnX.setBounds(20, 159, 45, 21);
					panelTeclado.add(btnX);
					// Listeners:
					{
						btnX.addMouseListener(new BtnXMouseListener());
					}
				}

				// Bot�n Y:
				{
					btnY = new JButton("Y");
					btnY.setBounds(70, 159, 45, 21);
					panelTeclado.add(btnY);
					// Listeners:
					{
						btnY.addMouseListener(new BtnYMouseListener());
					}
				}

				// Bot�n Z:
				{
					btnZ = new JButton("Z");
					btnZ.setBounds(120, 159, 45, 21);
					panelTeclado.add(btnZ);
					// Listeners:
					{
						btnZ.addMouseListener(new BtnZMouseListener());
					}
				}
			}
		}

		// Panel resultado Ahorcado:
		panelAhorcado = new JPanel();
		panelAhorcado.setBackground(new Color(47, 79, 79));
		panelAhorcado.setBounds(344, 3, 250, 349);
		getContentPane().add(panelAhorcado);
		panelAhorcado.setLayout(null);
		{
			// Caja del ahorcado:
			lblCajaAhorcado = new JLabel("");
			lblCajaAhorcado.setBounds(25, 10, 200, 294);
			lblCajaAhorcado.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
			lblCajaAhorcado.setBackground(new Color(255, 255, 255));
			lblCajaAhorcado.setOpaque(true);
			lblCajaAhorcado.setIcon(imagen0);
			panelAhorcado.add(lblCajaAhorcado);

			// Bot�n Salir del Juego:
			btnSalirJuego = new JButton("Salir");
			btnSalirJuego.addMouseListener(new BtnSalirJuegoMouseListener());
			btnSalirJuego.setBounds(143, 314, 82, 23);
			btnSalirJuego.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnSalirJuego.setBackground(new Color(255, 182, 193));
			panelAhorcado.add(btnSalirJuego);
		}
	}

	// M�TODOS:

	// LISTENERS:
		// Listener Bot�n de iniciar el juego:
		private class BtnIniciarJuegoMouseListener extends MouseAdapter {
			@Override
			public void mouseReleased(MouseEvent e) {
				// LLamo a m�todo IniciarJuego
				taCajaTexto.setText(iniciarJuego());
			}
		}
		
		// Listener Bot�n de reinicio:
		private class BtnReiniciarMouseListener extends MouseAdapter {
			@Override
			public void mouseReleased(MouseEvent e) {
				// M�todo que reinicia JTextArea
				reiniciar();
			}
		}
	
		// Listener Bot�n de salir del juego:
		private class BtnSalirJuegoMouseListener extends MouseAdapter {
			@Override
			public void mouseReleased(MouseEvent e) {
				System.exit(0);
			}
		}

		// Listener Bot�n letra A
		private class BtnAMouseListener extends MouseAdapter {
			@Override
			public void mouseReleased(MouseEvent e) {
				if(btnA.isEnabled() == true  && btnIniciarJuego.isEnabled() == false) {
					letraSeleccionada = 'a';
					btnA.setEnabled(false);
					taCajaTexto.setText(c.getJuego(letraSeleccionada));
					imagenes();
					victoria();
				}
			}
		}
	
		// Listener Bot�n letra B
		private class BtnBMouseListener extends MouseAdapter {
			@Override
			public void mouseReleased(MouseEvent e) {
				if(btnB.isEnabled() == true  && btnIniciarJuego.isEnabled() == false) {
					letraSeleccionada = 'b';
					btnB.setEnabled(false);
					taCajaTexto.setText(c.getJuego(letraSeleccionada));
					imagenes();
					victoria();
				}
			}
		}
	
		// Listener Bot�n letra C
		private class BtnCMouseListener extends MouseAdapter {
			@Override
			public void mouseReleased(MouseEvent e) {
				if(btnC.isEnabled() == true  && btnIniciarJuego.isEnabled() == false) {
					letraSeleccionada = 'c';
					btnC.setEnabled(false);
					taCajaTexto.setText(c.getJuego(letraSeleccionada));
					imagenes();
					victoria();
				}
			}
		}
	
		// Listener Bot�n letra D
		private class BtnDMouseListener extends MouseAdapter {
			@Override
			public void mouseReleased(MouseEvent e) {
				if(btnD.isEnabled() == true  && btnIniciarJuego.isEnabled() == false) {
					letraSeleccionada = 'd';
					btnD.setEnabled(false);
					taCajaTexto.setText(c.getJuego(letraSeleccionada));
					imagenes();
					victoria();
				}
			}
		}
	
		// Listener Bot�n letra E
		private class BtnEMouseListener extends MouseAdapter {
			@Override
			public void mouseReleased(MouseEvent e) {
				if(btnE.isEnabled() == true  && btnIniciarJuego.isEnabled() == false) {
					letraSeleccionada = 'e';
					btnE.setEnabled(false);
					taCajaTexto.setText(c.getJuego(letraSeleccionada));
					imagenes();
					victoria();
				}
			}
		}
	
		// Listener Bot�n letra F
		private class BtnFMouseListener extends MouseAdapter {
			@Override
			public void mouseReleased(MouseEvent e) {
				if(btnF.isEnabled() == true  && btnIniciarJuego.isEnabled() == false) {
					letraSeleccionada = 'f';
					btnF.setEnabled(false);
					taCajaTexto.setText(c.getJuego(letraSeleccionada));
					imagenes();
					victoria();
				}
			}
		}
	
		// Listener Bot�n letra G
		private class BtnGMouseListener extends MouseAdapter {
			@Override
			public void mouseReleased(MouseEvent e) {
				if(btnG.isEnabled() == true  && btnIniciarJuego.isEnabled() == false) {
					letraSeleccionada = 'g';
					btnG.setEnabled(false);
					taCajaTexto.setText(c.getJuego(letraSeleccionada));
					imagenes();
					victoria();
				};
			}
		}
	
		// Listener Bot�n letra H
		private class BtnHMouseListener extends MouseAdapter {
			@Override
			public void mouseReleased(MouseEvent e) {
				if(btnH.isEnabled() == true  && btnIniciarJuego.isEnabled() == false) {
					letraSeleccionada = 'h';
					btnH.setEnabled(false);
					taCajaTexto.setText(c.getJuego(letraSeleccionada));
					imagenes();
					victoria();
				}
			}
		}
	
		// Listener Bot�n letra I
		private class BtnIMouseListener extends MouseAdapter {
			@Override
			public void mouseReleased(MouseEvent e) {
				if(btnI.isEnabled() == true  && btnIniciarJuego.isEnabled() == false) {
					letraSeleccionada = 'i';
					btnI.setEnabled(false);
					taCajaTexto.setText(c.getJuego(letraSeleccionada));
					imagenes();
					victoria();
				}
			}
		}
	
		// Listener Bot�n letra J
		private class BtnJMouseListener extends MouseAdapter {
			@Override
			public void mouseReleased(MouseEvent e) {
				if(btnJ.isEnabled() == true  && btnIniciarJuego.isEnabled() == false) {
					letraSeleccionada = 'j';
					btnJ.setEnabled(false);
					taCajaTexto.setText(c.getJuego(letraSeleccionada));
					imagenes();
					victoria();
				}
			}
		}
	
		// Listener Bot�n letra K
		private class BtnKMouseListener extends MouseAdapter {
			@Override
			public void mouseReleased(MouseEvent e) {
				if(btnK.isEnabled() == true  && btnIniciarJuego.isEnabled() == false) {
					letraSeleccionada = 'k';
					btnK.setEnabled(false);
					taCajaTexto.setText(c.getJuego(letraSeleccionada));
					imagenes();
					victoria();
				}
			}
		}
	
		// Listener Bot�n letra L
		private class BtnLMouseListener extends MouseAdapter {
			@Override
			public void mouseReleased(MouseEvent e) {
				if(btnL.isEnabled() == true  && btnIniciarJuego.isEnabled() == false) {
					letraSeleccionada = 'l';
					btnL.setEnabled(false);
					taCajaTexto.setText(c.getJuego(letraSeleccionada));
					imagenes();
					victoria();
				}
			}
		}
	
		// Listener Bot�n letra M
		private class BtnMMouseListener extends MouseAdapter {
			@Override
			public void mouseReleased(MouseEvent e) {
				if(btnM.isEnabled() == true  && btnIniciarJuego.isEnabled() == false) {
					letraSeleccionada = 'm';
					btnM.setEnabled(false);
					taCajaTexto.setText(c.getJuego(letraSeleccionada));
					imagenes();
					victoria();
				}
			}
		}
	
		// Listener Bot�n letra N
		private class BtnNMouseListener extends MouseAdapter {
			@Override
			public void mouseReleased(MouseEvent e) {
				if(btnN.isEnabled() == true  && btnIniciarJuego.isEnabled() == false) {
					letraSeleccionada = 'n';
					btnN.setEnabled(false);
					taCajaTexto.setText(c.getJuego(letraSeleccionada));
					imagenes();
					victoria();
				}
			}
		}
	
		// Listener Bot�n letra �
		private class BtnEnieMouseListener extends MouseAdapter {
			@Override
			public void mouseReleased(MouseEvent e) {
				if(btnEnie.isEnabled() == true  && btnIniciarJuego.isEnabled() == false) {
					letraSeleccionada = '�';
					btnEnie.setEnabled(false);
					taCajaTexto.setText(c.getJuego(letraSeleccionada));
					imagenes();
					victoria();
				}
			}
		}
	
		// Listener Bot�n letra O
		private class BtnOMouseListener extends MouseAdapter {
			@Override
			public void mouseReleased(MouseEvent e) {
				if(btnO.isEnabled() == true  && btnIniciarJuego.isEnabled() == false) {
					letraSeleccionada = 'o';
					btnO.setEnabled(false);
					taCajaTexto.setText(c.getJuego(letraSeleccionada));
					imagenes();
					victoria();
				}
			}
		}
	
		// Listener Bot�n letra P
		private class BtnPMouseListener extends MouseAdapter {
			@Override
			public void mouseReleased(MouseEvent e) {
				if(btnP.isEnabled() == true  && btnIniciarJuego.isEnabled() == false) {
					letraSeleccionada = 'p';
					btnP.setEnabled(false);
					taCajaTexto.setText(c.getJuego(letraSeleccionada));
					imagenes();
					victoria();
				}
			}
		}
	
		// Listener Bot�n letra Q
		private class BtnQMouseListener extends MouseAdapter {
			@Override
			public void mouseReleased(MouseEvent e) {
				if(btnQ.isEnabled() == true  && btnIniciarJuego.isEnabled() == false) {
					letraSeleccionada = 'q';
					btnQ.setEnabled(false);
					taCajaTexto.setText(c.getJuego(letraSeleccionada));
					imagenes();
					victoria();
				}
			}
		}
	
		// Listener Bot�n letra R
		private class BtnRMouseListener extends MouseAdapter {
			@Override
			public void mouseReleased(MouseEvent e) {
				if(btnR.isEnabled() == true  && btnIniciarJuego.isEnabled() == false) {
					letraSeleccionada = 'r';
					btnR.setEnabled(false);
					taCajaTexto.setText(c.getJuego(letraSeleccionada));
					imagenes();
					victoria();
				}
			}
		}
	
		// Listener Bot�n letra S
		private class BtnSMouseListener extends MouseAdapter {
			@Override
			public void mouseReleased(MouseEvent e) {
				if(btnS.isEnabled() == true  && btnIniciarJuego.isEnabled() == false) {
					letraSeleccionada = 's';
					btnS.setEnabled(false);
					taCajaTexto.setText(c.getJuego(letraSeleccionada));
					imagenes();
					victoria();
				}
			}
		}
	
		// Listener Bot�n letra T
		private class BtnTMouseListener extends MouseAdapter {
			@Override
			public void mouseReleased(MouseEvent e) {
				if(btnT.isEnabled() == true  && btnIniciarJuego.isEnabled() == false) {
					letraSeleccionada = 't';
					btnT.setEnabled(false);
					taCajaTexto.setText(c.getJuego(letraSeleccionada));
					imagenes();
					victoria();
				}
			}
		}
	
		// Listener Bot�n letra U
		private class BtnUMouseListener extends MouseAdapter {
			@Override
			public void mouseReleased(MouseEvent e) {
				if(btnU.isEnabled() == true  && btnIniciarJuego.isEnabled() == false) {
					letraSeleccionada = 'u';
					btnU.setEnabled(false);
					taCajaTexto.setText(c.getJuego(letraSeleccionada));
					imagenes();
					victoria();
				}
			}
		}
	
		// Listener Bot�n letra V
		private class BtnVMouseListener extends MouseAdapter {
			@Override
			public void mouseReleased(MouseEvent e) {
				if(btnV.isEnabled() == true  && btnIniciarJuego.isEnabled() == false) {
					letraSeleccionada = 'v';
					btnV.setEnabled(false);
					taCajaTexto.setText(c.getJuego(letraSeleccionada));
					imagenes();
					victoria();
				}
			}
		}
	
		// Listener Bot�n letra W
		private class BtnWMouseListener extends MouseAdapter {
			@Override
			public void mouseReleased(MouseEvent e) {
				if(btnW.isEnabled() == true  && btnIniciarJuego.isEnabled() == false) {
					letraSeleccionada = 'w';
					btnW.setEnabled(false);
					taCajaTexto.setText(c.getJuego(letraSeleccionada));
					imagenes();
					victoria();
				}
			}
		}
	
		// Listener Bot�n letra X
		private class BtnXMouseListener extends MouseAdapter {
			@Override
			public void mouseReleased(MouseEvent e) {
				if(btnX.isEnabled() == true  && btnIniciarJuego.isEnabled() == false) {
					letraSeleccionada = 'x';
					btnX.setEnabled(false);
					taCajaTexto.setText(c.getJuego(letraSeleccionada));
					imagenes();
					victoria();
				}
			}
		}
	
		// Listener Bot�n letra Y
		private class BtnYMouseListener extends MouseAdapter {
			@Override
			public void mouseReleased(MouseEvent e) {
				if(btnY.isEnabled() == true  && btnIniciarJuego.isEnabled() == false) {
					letraSeleccionada = 'y';
					btnY.setEnabled(false);
					taCajaTexto.setText(c.getJuego(letraSeleccionada));
					imagenes();
					victoria();
				}
			}
		}
	
		// Listener Bot�n letra Z
		private class BtnZMouseListener extends MouseAdapter {
			@Override
			public void mouseReleased(MouseEvent e) {
				if(btnZ.isEnabled() == true  && btnIniciarJuego.isEnabled() == false) {
					letraSeleccionada = 'z';
					btnZ.setEnabled(false);
					taCajaTexto.setText(c.getJuego(letraSeleccionada));
					imagenes();
					victoria();
				}
			}
		}
		
	
		
	// EVENTOS:
	public String iniciarJuego() {
		// Una vez iniciado el juego deshabilitamos bot�n de Iniciar Juego:
		btnIniciarJuego.setEnabled(false);
		
		// Devolvemos la palabra a adivinar encriptada:
		return c.getEncriptacion().toString();
	}
	
	public void reiniciar() {
		// Vaciamos text Area
		taCajaTexto.setText("");
		
		// Bucle para reactivar todos los botones de letras cada vez que inicio un juego:
		for (Component component : panelTeclado.getComponents()) {
		   component.setEnabled(true); 
		}
		
		// Reiniciamos Jlabel de im�genes a estado inicial:
		lblCajaAhorcado.setIcon(imagen0);
				
		// Volvemos a habilitar bot�n de Iniciar Juego:
		btnIniciarJuego.setEnabled(true);
		
		// Generamos nueva palabra aleatoria y su encriptaci�n para pr�ximo juego:
		String palabra = c.getGeneraPalabraAleatoria();
		c.getGeneraEncriptacion(palabra).toString();
		
		// Reiniciamos el valor de la variable vidas a 6:
		c.setVidas(6);
	}
	
	public void imagenes() {
		// M�todo que muestra en JLabel la imagen del ahorcado seg�n vidas restantes:
		switch(c.getVidas()) {
			case 6:
				lblCajaAhorcado.setIcon(imagen0);
				break;
			case 5:
				lblCajaAhorcado.setIcon(imagen1);
				break;
			case 4:
				lblCajaAhorcado.setIcon(imagen2);
				break;
			case 3:
				lblCajaAhorcado.setIcon(imagen3);
				break;
			case 2:
				lblCajaAhorcado.setIcon(imagen4);
				break;
			case 1:
				lblCajaAhorcado.setIcon(imagen5);
				break;
			case 0:
				lblCajaAhorcado.setIcon(imagen6);
				// Al perder la partida anunlamos todos los botones de letras:
				for (Component component : panelTeclado.getComponents()) {
					   component.setEnabled(false); 
				}
				break;
		}
	}
	
	public void victoria() {
		if(c.esVictoria()) {
			// Si se gana la partida se desactivan todos los botones:
			for (Component component : panelTeclado.getComponents()) {
				   component.setEnabled(false); 
			}
			
			// Si se gana la partida se activa imagen de victoria:
			lblCajaAhorcado.setIcon(imagen7);
		}
	}
	
}