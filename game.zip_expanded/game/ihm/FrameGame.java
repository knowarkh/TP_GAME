package ihm;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrameGame extends JFrame {

    private static final long serialVersionUID = 1L;
    // private static final Dimension TAILLE_ECRAN = java.awt.Toolkit
    // .getDefaultToolkit().getScreenSize();
    // private static final int HAUTEUR = (int) TAILLE_ECRAN.getHeight();
    // private static final int LARGEUR = (int) TAILLE_ECRAN.getWidth();

    public FrameGame() {
        super("Le jeu");
        // this.setSize(HAUTEUR, LARGEUR);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setUndecorated(true);
        miseEnPlaceDecor();
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void miseEnPlaceDecor() {
        this.setLayout(new GridLayout(2, 3));

        JPanel campus = new JPanel();
        // JLabel camp = new JLabel("CAMPUS PUB");
        // campus.add(camp);

        ImageIcon image = new ImageIcon(new ImageIcon("game\\ihm\\test.jpg")
                .getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
        // C:\\Users\\admin\\git3\\Base_jdbc_Aeronautique\\src\\ihm\\swing\\logo-avion.png
        JLabel labImage = new JLabel(image);
        campus.add(labImage);

        JPanel outside = new JPanel();
        JLabel out = new JLabel("OUTSIDE");
        outside.add(out);
        JPanel theatre = new JPanel();
        JLabel thea = new JLabel("THEATRE");
        theatre.add(thea);
        this.add(campus);
        this.add(outside);
        this.add(theatre);

        this.add(ajoutCroixDirect());
        JPanel lab = new JPanel();
        JLabel labo = new JLabel("LABO");
        lab.add(labo);
        JPanel office = new JPanel();
        JLabel off = new JLabel("OFFICE");
        office.add(off);

        this.add(lab);
        this.add(office);
    }

    private JPanel ajoutCroixDirect() {
        JPanel croixDirect = new JPanel();
        this.add(croixDirect);
        croixDirect.setLayout(new GridLayout(3, 3));

        Button haut = new Button("North");
        Button droite = new Button("East");
        Button bas = new Button("South");
        Button gauche = new Button("West");

        JLabel l1 = new JLabel("");
        croixDirect.add(l1);
        croixDirect.add(haut);
        JLabel l2 = new JLabel("");
        croixDirect.add(l2);
        croixDirect.add(gauche);
        JLabel l3 = new JLabel("");
        croixDirect.add(l3);
        croixDirect.add(droite);
        JLabel l4 = new JLabel("");
        croixDirect.add(l4);
        croixDirect.add(bas);
        JLabel l5 = new JLabel("");
        croixDirect.add(l5);

        return croixDirect;

    }
}
