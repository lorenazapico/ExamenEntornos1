package examen;

import java.awt.Dimension;
import java.net.URISyntaxException;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import com.kitfox.svg.app.beans.SVGPanel;

public class SVGDemo {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Entornos de Desarrollo - Examen 1ª Evaluacion - Zapico Freije, Lorena");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		SVGPanel panel = new SVGPanel();
		try {
			panel.setSvgURI(System.class.getResource("/svg/uvas.svg").toURI());	
		} catch (URISyntaxException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		int w = panel.getSVGWidth() * 5;
		int h = panel.getSVGHeight() * 5;
		panel.setPreferredSize(new Dimension(w, h));
		panel.setScaleToFit(true);
		panel.setAntiAlias(true);
		
		frame.add(panel);
		frame.pack();
		frame.setLocationRelativeTo(null);
		
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				frame.setVisible(true);
			}
		});
		
	}


}
