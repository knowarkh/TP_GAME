import javax.swing.JOptionPane;

import ihm.FrameGame;

public class Jeu {

    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null,
                "Voulez-vous accéder à l'interface graphique ?", "IHM",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (option == JOptionPane.YES_OPTION) {
            new FrameGame();
        } else if (option == JOptionPane.NO_OPTION) {
            Game jeu = new Game();
            jeu.play();
        } else if (option == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "Vous avez annulé l'opération.",
                    "Annulation", JOptionPane.PLAIN_MESSAGE);
        } else if (option == JOptionPane.CLOSED_OPTION) {
            System.out.println("fermer");
        } else {
            System.out.println("option impossible");
        }
    }

}
