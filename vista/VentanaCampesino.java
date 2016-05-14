package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import ProyectTests.Tests.Campesino;

public class VentanaCampesino extends JFrame implements ActionListener{
	
	private JButton btnEditarPerfil, btnVender,btnCerrarSesion,btnnotificaciones;
	private JPanel panelBotones, panelImagen, panelfinal;
	private JLabel lblimg;
	private ImageIcon imagen;
	
	private Campesino usuario;
	
	
	//CONSTRUCTOR
	public VentanaCampesino(Campesino usuario){
		this.usuario = usuario;
		
		setTitle(" AGROLIBRE -- Sesion Inciada (Usuario)");
		setSize(400, 320);//ancho- largo
		
	    setResizable(false);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLocationRelativeTo(null);
		
	    //TIPOGRAFIA
	    Font letra = new Font( "Comic Sans MS",Font.BOLD,14); 
	   
	    
	  //COLORES
	    Color verde= new Color(20, 60, 18);
	    
	    
	    
	    btnEditarPerfil= new JButton("Editar Perfil ");
	    btnEditarPerfil.addActionListener(this);
	    btnEditarPerfil.setFont(letra);
	    btnEditarPerfil.setBackground(verde);
	    btnEditarPerfil.setForeground(Color.WHITE);
	    
	    
	    
	    btnVender= new JButton("Vender ");
	    btnVender.addActionListener(this);
	    btnVender.setFont(letra);
	    btnVender.setBackground(verde);
	    btnVender.setForeground(Color.WHITE);
	    
	    btnnotificaciones= new JButton("Notificaciones ");
	    btnnotificaciones.addActionListener(this);
	    btnnotificaciones.setFont(letra);
	    btnnotificaciones.setBackground(verde);
	    btnnotificaciones.setForeground(Color.WHITE);
	    
	    btnCerrarSesion= new JButton("Cerrrar Sesion ");
	    btnCerrarSesion.addActionListener(this);
	    btnCerrarSesion.setFont(letra);
	    btnCerrarSesion.setBackground(verde);
	    btnCerrarSesion.setForeground(Color.WHITE);
	    
		imagen= new ImageIcon("logo2.jpg");
	    lblimg=new JLabel(imagen);
	    
	    panelImagen=new JPanel();
	    panelImagen.setLayout(new GridBagLayout());
	    
	    
	    panelBotones= new JPanel();
	    panelBotones.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
	
		
		panelImagen= new JPanel();
		panelImagen.setLayout(new GridBagLayout());
		GridBagConstraints gbc2 = new GridBagConstraints();
		


		
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelBotones.add(btnEditarPerfil, gbc);
	    
	
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelBotones.add(btnVender, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelBotones.add(btnCerrarSesion, gbc);
		
//		gbc.gridx = 0;
//		gbc.gridy = 4;
//		gbc.gridwidth = 1;
//		gbc.gridheight = 1;
//		gbc.weightx = 0.0;
//		gbc.weighty = 1.0;
//		gbc.insets = new Insets(3, 3, 3, 3);
//		gbc.fill = GridBagConstraints.BOTH;
//		gbc.anchor = GridBagConstraints.WEST;
//		panelBotones.add(btnnotificaciones, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelImagen.add(lblimg, gbc2);
		
		panelfinal =new JPanel();
		
		panelfinal.add(panelImagen);
		panelfinal.add(panelBotones);
		
		//panelTabla.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, verde));
		//panelTabla.setBackground(Color.WHITE);
		panelBotones.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, verde));
		panelBotones.setBackground(Color.WHITE);
		panelfinal.setBackground(Color.WHITE);
		
		this.add(panelfinal);
		
		
	}
	

	
	public void actionPerformed(ActionEvent evento) {

		if(evento.getSource()==btnEditarPerfil){
			VentanaEditarUsuario vep=new VentanaEditarUsuario(this.usuario);
			vep.setVisible(true);
			vep.pack();
			vep.setLocationRelativeTo(null);
			this.setVisible(false);
		
			
			
		}
			
		if(evento.getSource()==btnCerrarSesion){
			JOptionPane.showMessageDialog(this, "Sesion cerrada conrectamente! ");
			VentanaPrincipal vp=new VentanaPrincipal();
			vp.setVisible(true);
			vp.pack();
			vp.setLocationRelativeTo(null);
			this.setVisible(false);
		}
		
		if(evento.getSource()==btnVender){
			VentanaVenderProducto vvp=new VentanaVenderProducto(this.usuario);
			vvp.setVisible(true);
			vvp.pack();
			vvp.setLocationRelativeTo(null);
			this.setVisible(false);
			
		}
	}


	public JButton getBtnEditarPerfil() {
		return btnEditarPerfil;
	}


	public void setBtnEditarPerfil(JButton btnEditarPerfil) {
		this.btnEditarPerfil = btnEditarPerfil;
	}


	public JButton getBtnVender() {
		return btnVender;
	}


	public void setBtnVender(JButton btnVender) {
		this.btnVender = btnVender;
	}


	public JButton getBtnCerrarSesion() {
		return btnCerrarSesion;
	}


	public void setBtnCerrarSesion(JButton btnCerrarSesion) {
		this.btnCerrarSesion = btnCerrarSesion;
	}


	public JButton getBntnotificaciones() {
		return btnnotificaciones;
	}


	public void setBntnotificaciones(JButton bntnotificaciones) {
		this.btnnotificaciones = bntnotificaciones;
	}


	public JPanel getPanelBotones() {
		return panelBotones;
	}


	public void setPanelBotones(JPanel panelBotones) {
		this.panelBotones = panelBotones;
	}


	public JPanel getPanelTabla() {
		return panelImagen;
	}


	public void setPanelTabla(JPanel panelTabla) {
		this.panelImagen = panelTabla;
	}


	public JPanel getPanel() {
		return panelfinal;
	}


	public void setPanel(JPanel panel) {
		this.panelfinal = panel;
	}
}

