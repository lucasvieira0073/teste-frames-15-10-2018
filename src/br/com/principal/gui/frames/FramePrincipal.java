package br.com.principal.gui.frames;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.com.principal.lib.gui.frames.FrameBase;

public class FramePrincipal extends FrameBase {
	
	private static final long serialVersionUID = 4912173110041109435L;
	
	public FramePrincipal() {
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		
//		int x = d.width;
//		int y = d.height;
		
		int x = 600;
		int y = 500;
		
		// x,y, largura, altura
		setBounds(0, 0, x, y);
		
		JPanel painel = new JPanel();
	    painel.setBounds(0, 0, x, y);
	    
	    painel.setLayout(null);
	    
	    JLabel label = new JLabel("Texto");
	    label.setBounds(10, 10, 50, 20);
	    
	    
	    //label.setIcon( new ImageIcon("/imagens/imagem.txt"));
		
		JTextField textField = new JTextField();
		textField.setBounds(70, 10, 200, 20);
		
		JButton botao = new JButton("Submit");
		botao.setBounds(70, 35, 100, 20);
		
		
		botao.addActionListener( new AcaoBotao("Botao"));
		
		
		painel.add(botao);
		painel.add(label);
		painel.add(textField);
		
		add(painel);
		
		setContentPane(painel);
		
		
		setResizable(false);
		
		configura();
	}
	
	private class AcaoBotao implements ActionListener {
		
		private String texto;
		
		public AcaoBotao(String texto) {
			this.texto = texto;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			
			System.out.println(texto);
			
		}
		
	}
	
	@Override
	protected void configura() {
		getContentPane().setBackground(Color.GREEN);
	}

}
