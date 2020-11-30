package com.escuelataekwondo.view.principal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		setResizable(false);
		setTitle("Sistema de escuelas de taekwondo NLD 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 815, 531);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabPrincipal = new JTabbedPane(JTabbedPane.LEFT);
		tabPrincipal.setBounds(10, 63, 779, 416);
		contentPane.add(tabPrincipal);
		
		JPanel tabEscuelas = new JPanel();
		tabPrincipal.addTab("Escuelas", null, tabEscuelas, null);
		
		JPanel tabAlumnos = new JPanel();
		tabPrincipal.addTab("Alumnos", null, tabAlumnos, null);
		
		JPanel tabProfesores = new JPanel();
		tabPrincipal.addTab("Profesores", null, tabProfesores, null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 809, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Inicio");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Ayuda");
		mnNewMenu.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Salir");
		mnNewMenu.add(mntmNewMenuItem_7);
		
		JMenu mnNewMenu_1 = new JMenu("Ver");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_3 = new JMenu("Profesor");
		mnNewMenu_1.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Por escuela");
		mnNewMenu_3.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Por grado");
		mnNewMenu_3.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_4 = new JMenu("Alumno");
		mnNewMenu_1.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Por escuela");
		mnNewMenu_4.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Por grado");
		mnNewMenu_4.add(mntmNewMenuItem_5);
		
		JMenu mnNewMenu_2 = new JMenu("Clases");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Hoy");
		mnNewMenu_2.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Registro ");
		mnNewMenu_2.add(mntmNewMenuItem_3);
	}
}
