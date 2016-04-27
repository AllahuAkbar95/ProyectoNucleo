package vista_26_04_16;

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
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VentanaCampesino extends JFrame implements ActionListener{
	
	private JButton btnEditarPerfil, btnVender, 
			btnConsultarPrecio,btnCerrarSesion,btnnotificaciones;
	private JPanel panelBotones, panelTabla, panelfinal;
	private JTable table;
	
	
	
	//CONSTRUCTOR
	public VentanaCampesino(){
		
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
	    
	    btnConsultarPrecio= new JButton("Consultar Precio ");
	    btnConsultarPrecio.addActionListener(this);
	    btnConsultarPrecio.setFont(letra);
	    btnConsultarPrecio.setBackground(verde);
	    btnConsultarPrecio.setForeground(Color.WHITE);
	    
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
	    
	    
	    panelBotones= new JPanel();
	    panelBotones.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		panelTabla= new JPanel();
		panelTabla.setLayout(new GridBagLayout());
		//GridBagConstraints gbc2 = new GridBagConstraints();
		
		
		//TABLA
	    //*******************************************************
		
		  String[] nombresColumnas = {"Producto","Cantidad","Precio","Vender"};
	        Object[][] productos = {
	            {"Papa",  new Integer(100), new Integer(80000),false,},
	            {"Naranja",  new Integer(200), new Integer(6000),true,},
	            {"Manzana",  new Integer(30), new Integer(7000),true,},
	            {"Armas",  new Integer(4000), new Integer(200000), false,}
	        };
	        DefaultTableModel model = new DefaultTableModel(productos, nombresColumnas);
	        table = new JTable(model) {

	          //activa los checkbox
	            @Override
	            public Class getColumnClass(int column) {
	                switch (column) {
	                    case 0:
	                        return String.class;
	                    case 1:
	                        return Integer.class;
	                    case 2:
	                        return Integer.class;
	               
	                    default:
	                        return Boolean.class;
	                }
	            }
	        };
	        table.setPreferredScrollableViewportSize(table.getPreferredSize());
	        JScrollPane scrollPane = new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	        getContentPane().add(scrollPane);
	        
			getContentPane().add(scrollPane, BorderLayout.CENTER);
		
	//=========================================================================
		
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelTabla.add(scrollPane, gbc);
		
		
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
	    
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelBotones.add(btnConsultarPrecio, gbc);
		
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
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelBotones.add(btnCerrarSesion, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelBotones.add(btnnotificaciones, gbc);
		
		panelfinal =new JPanel();
		
		panelfinal.add(panelTabla);
		panelfinal.add(panelBotones);
		
		panelTabla.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, verde));
		panelTabla.setBackground(Color.WHITE);
		panelBotones.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, verde));
		panelBotones.setBackground(Color.WHITE);
		panelfinal.setBackground(Color.WHITE);
		
		this.add(panelfinal);
		
		
	}
	

	
	public void actionPerformed(ActionEvent evento) {

		if(evento.getSource()==btnEditarPerfil){
			VentanaEditarUsuario vep=new VentanaEditarUsuario();
			vep.setVisible(true);
			vep.pack();
			vep.setLocationRelativeTo(null);
			this.setVisible(false);
		
			
			
		}
		
		if(evento.getSource()==btnConsultarPrecio){
			VentanaPrecio vp=new VentanaPrecio();
			vp.setVisible(true);
			vp.setLocationRelativeTo(null);
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


	public JButton getBtnConsultarPrecio() {
		return btnConsultarPrecio;
	}


	public void setBtnConsultarPrecio(JButton btnConsultarPrecio) {
		this.btnConsultarPrecio = btnConsultarPrecio;
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
		return panelTabla;
	}


	public void setPanelTabla(JPanel panelTabla) {
		this.panelTabla = panelTabla;
	}


	public JPanel getPanel() {
		return panelfinal;
	}


	public void setPanel(JPanel panel) {
		this.panelfinal = panel;
	}
	
	
	
	
	

}
