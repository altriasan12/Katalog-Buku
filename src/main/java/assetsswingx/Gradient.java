/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assetsswingx;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class Gradient extends JPanel {
	public void paintComponent(Graphics g) {
		int width = getWidth();
		int height = getHeight();
		
		Color gradientStart = new Color(96, 96, 96);//220, 255, 149);
		Color gradientEnd = new Color(128, 128, 128);//183, 234, 98);
		
		Graphics2D g2 = (Graphics2D) g;
		GradientPaint painter = new GradientPaint(0, 0, gradientStart,
				0, height, gradientEnd);
		Paint oldPainter = g2.getPaint();
		g2.setPaint(painter);
		g2.fill(g2.getClip());

		gradientStart = new Color(96, 96, 96);
		gradientEnd = new Color(128, 128, 128);

		painter = new GradientPaint(0, 0, gradientEnd,
				0, height / 2, gradientStart);
		g2.setPaint(painter);
		g2.fill(g2.getClip());

		painter = new GradientPaint(0, height / 2, gradientStart,
				0, height, gradientEnd);
		g2.setPaint(painter);
		g2.fill(g2.getClip());

		g2.setPaint(oldPainter);
	}
}