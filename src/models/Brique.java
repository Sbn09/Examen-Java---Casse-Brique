package models;

import application.Fenetre;

import java.awt.Color;
import java.awt.Graphics2D;

public class Brique extends Sprite {
    protected int largeur;
    protected int hauteur;

    public Brique(int x, int y, int largeur, int hauteur, Color couleur) {
        super(x, y, couleur);
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public Brique() {
        super(Fenetre.LARGEUR / 2 - 90, Fenetre.HAUTEUR - 500, Color.RED);
        this.largeur = 80;
        this.hauteur = 30;
    }

    public void dessiner(Graphics2D dessin) {
        dessin.setColor(couleur);
        dessin.fillRect(x, y, largeur, hauteur);
    }
}
