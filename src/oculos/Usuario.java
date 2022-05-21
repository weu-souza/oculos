package oculos;

import javax.swing.*;

public class Usuario {

    public void Menu() {
        int grau;
        double grauEsfericoE = 0;
        double grauEsfericoD = 0;
        double grauCilindricoE = 0;
        double grauCilindricoD = 0;


        grau = Integer.parseInt(JOptionPane.showInputDialog("qual o seu grau?\n1-Esferico \n2-Cilindrico"));

        switch (grau) {
            case 1:
                grauEsfericoE = Double.parseDouble(JOptionPane.showInputDialog("digite o seu grau esquerdo: "));
                grauEsfericoD = Double.parseDouble(JOptionPane.showInputDialog("digite o seu grau direito: "));
                break;
            case 2:
                grauCilindricoE = Double.parseDouble(JOptionPane.showInputDialog("digite o seu grau esquerdo: "));
                grauCilindricoD = Double.parseDouble(JOptionPane.showInputDialog("digite o seu grau direito: "));

                break;
        }

        GrauEsferico gE = new GrauEsferico(grauEsfericoE, grauEsfericoD);
        GrauCilindrico gC = new GrauCilindrico(grauCilindricoE, grauCilindricoD);
        if (grau == 1) {
            JOptionPane.showMessageDialog(null, gE.lenteDisponivel());
        }

        if (grau == 2) {
            JOptionPane.showMessageDialog(null, gC.lenteDisponivel());


        }


    }
}
