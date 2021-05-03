package br.cnec.fcsl.gui;

import java.awt.*;
import javax.swing.JFrame;
import br.cnec.fcsl.componente.Bola;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Janela {

	public static void main(String[] args) {

		JFrame frmBolas = new JFrame();

		frmBolas.setTitle("Bolas");
		Bola bola = new Bola(0, 100, 100, Color.black);
		frmBolas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBolas.getContentPane().add(bola);
		frmBolas.setSize(600, 400);
		frmBolas.setVisible(true);

		float a = 0, b = 0, c = 0;
		int x = bola.getX();
		int y = bola.getY();
		int l = 10;

		while (true) {
			bola.move(l, x, y);
			if (bola.getDirecaoX() == 0) {
				x++;
			}
			if (bola.getDirecaoY() == 0) {
				y++;
			}
			if (bola.getDirecaoX() == 1) {
				x--;
			}
			if (bola.getDirecaoY() == 1) {
				y--;
			}
			if (x == ((((frmBolas.getWidth() - bola.getDiametro()) - 10) / 2) - 2)) {
				bola.setDirecaoX(1);
				bola.setCor(Color.getHSBColor(a, b, c));
			} // 4
			if (y == ((((frmBolas.getHeight() - bola.getDiametro()) - 35) / 2) - 2)) {
				bola.setDirecaoY(1);
				bola.setCor(Color.getHSBColor(a, b, c));
			} // 28
			if (x == 0) {
				bola.setDirecaoX(0);
				bola.setCor(Color.getHSBColor(a, b, c));
			}
			if (y == 0) {
				bola.setDirecaoY(0);
				bola.setCor(Color.getHSBColor(a, b, c));

			}
			frmBolas.repaint();
			a = (float) (Math.random() * 255);
			b = (float) (Math.random() * 255);
			c = (float) (Math.random() * 100);
		}
	}

}
