package br.cnec.fcsl.componente;

import java.awt.*;
import javax.swing.JPanel;

public class Bola extends JPanel {

	private int x;
	private int y;
	private int diametro;
	private int direcaox = 0;
	private int direcaoy = 0;
	private Color cor;

	public Bola(int x, int y, int diametro, Color cor) {

		this.x = x;
		this.y = y;
		this.diametro = diametro;
		this.direcaox = 0;
		this.direcaoy = 0;
		this.cor = cor;
	}

	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {
		return y;
	}

	public int getDirecaoX() {
		return direcaox;
	}

	public int getDirecaoY() {
		return direcaoy;
	}

	public int getDiametro() {
		return diametro;
	}

	public Color getCor() {
		return cor;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setDirecaoX(int direcaox) {
		this.direcaox = (direcaox);
	}

	public void setDirecaoY(int direcaoy) {
		this.direcaoy = direcaoy;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public void setCor(Color cor) {
		this.cor = cor;
	}

	@Override
	public void paintComponent(Graphics g) {

		g.setColor(getCor());
		g.fillOval(getX(), getY(), getDiametro(), getDiametro());
	}

	public void move(int l, int x, int y) {

		this.setX(x);
		this.setY(y);
		this.esperar(l);
	}

	public void esperar(int l) {

		try {
			Thread.sleep(l);
		} catch (InterruptedException e) {

		}
	}
}