package vista_26_04_16;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class VentanaCliente extends JFrame implements ActionListener {
	private JButton btnEditarPerfil, btnComfirmarCompra,btnCerrarSesion;
	private JPanel panelBotones, panelCompleto;
	
	public VentanaCliente() {
		
		setTitle(" AGROLIBRE -- Sesion Inciada (Cliente)");
		setSize(400, 400);//ancho- largo
	    setResizable(false);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLocationRelativeTo(null);
		
	    //TIPOGRAFIA
	    Font letra = new Font( "Comic Sans MS",Font.BOLD,14); 
	   
	    
	  //COLORES
	    Color verde= new Color(20, 60, 18);
	    
	    btnComfirmarCompra=new JButton("Comfirmar Compra");
	    btnComfirmarCompra.addActionListener(this);
	    btnComfirmarCompra.setFont(letra);
	    btnComfirmarCompra.setBackground(verde);
	    btnComfirmarCompra.setForeground(Color.WHITE);
	    
	    btnEditarPerfil=new JButton("Editar Perfil");
	    btnEditarPerfil.addActionListener(this);
	    btnEditarPerfil.setFont(letra);
	    btnEditarPerfil.setBackground(verde);
	    btnEditarPerfil.setForeground(Color.WHITE);
	    
	    btnCerrarSesion=new JButton("Cerrar Sesion");
	    btnCerrarSesion.addActionListener(this);
	    btnCerrarSesion.setFont(letra);
	    btnCerrarSesion.setBackground(verde);
	    btnCerrarSesion.setForeground(Color.WHITE);
	    
	    
	
	    panelBotones= new JPanel();
	    panelBotones.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
	    
		
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0;
		gbc.weighty = 1.0;
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		panelBotones.add(btnComfirmarCompra, gbc);
	    
		gbc.gridx = 1;
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
		panelBotones.add(btnCerrarSesion, gbc);
		
	   
		panelCompleto =new JPanel();
		
		
		panelCompleto.add(panelBotones);
		
		
		panelBotones.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, verde));
		panelBotones.setBackground(Color.WHITE);
		panelCompleto.setBackground(Color.WHITE);
		
		this.add(panelCompleto);
	    
	}
	

	
	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource()==btnEditarPerfil){
			VentanaEditarCliente vec=new VentanaEditarCliente();
			vec.setVisible(true);
			vec.pack();
			vec.setLocationRelativeTo(null);
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


	public JButton getBtnComfirmarCompra() {
		return btnComfirmarCompra;
	}


	public void setBtnComfirmarCompra(JButton btnComfirmarCompra) {
		this.btnComfirmarCompra = btnComfirmarCompra;
	}


	public JButton getBtnCerrarSesion() {
		return btnCerrarSesion;
	}


	public void setBtnCerrarSesion(JButton btnCerrarSesion) {
		this.btnCerrarSesion = btnCerrarSesion;
	}


	public JPanel getPanelBotones() {
		return panelBotones;
	}


	public void setPanelBotones(JPanel panelBotones) {
		this.panelBotones = panelBotones;
	}


	public JPanel getPanelCompleto() {
		return panelCompleto;
	}


	public void setPanelCompleto(JPanel panelCompleto) {
		this.panelCompleto = panelCompleto;
	}
	
	
	

}
