/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciocolegiado2;

import javax.swing.JOptionPane;

/**
 *
 * @author ander
 */
public class EjercicioColegiado2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Spotify2 song[] = new Spotify2[10];

        String Titulo2;
        String Autor2;
        int ID2;
        int duracion2;
        int Year2;
        int tempI;
        int tempII;
        String tempS;
        int Cancion = 2;
        
        int dur[] = new int[10];

        for (int i = 0; i < Cancion; i++) {
            Titulo2 = JOptionPane.showInputDialog("Coloque el nombre de la cancion ° " + (i + 1));
            Autor2 = JOptionPane.showInputDialog("Coloque el autor de la canción " + Titulo2);
            ID2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el id de la canción (posición en top) " + Titulo2));
            duracion2 = Integer.parseInt(JOptionPane.showInputDialog("Coloque lo que dura la canción " + Titulo2 + " (en segundos)"));
            Year2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el año de la canción " + Titulo2));
            song[i] = new Spotify2(ID2, Titulo2, Autor2, duracion2, Year2);
        }

        tempS = "Canciones anterior al año actual:";
        tempI = 0;

        for (int i = 0; i < song; i++) {
            Year2 = song[i].getsYear();
            if (Year2 < 2023) {
                tempI = tempI + 1;
                tempS = tempS + tempI + ". " + song[i].getTitle() + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, tempS);
        tempS = "Canciones del año actual: \n";
        tempI = 0;
        for (int i = 0; i < Cancion; i++) {
            Year2 = song[i].getsYear();
            if (Year2 == 2023) {
                tempI = tempI + 1;
                tempS = tempS + tempI + ". " + song[i].getTitle() + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, tempS);

        tempS = "Canciones posteriores al año actual: \n";
        tempI = 0;
        for (int i = 0; i < Cancion; i++) {
            Year2 = song[i].getsYear();
            if (Year2 > 2023) {
                tempI = tempI + 1;
                tempS = tempS + tempI + ". " + song[i].getsTitle() + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, tempS);

        tempI = 0;
        tempII = 0;

        for (int i = 0; i < Cancion; i++) {
            if (song[i].getsLenght() > tempI) {
                tempII = 0;
                dur[tempII] = i;
                tempII = tempII + 1;
            } else if (song[i].gets() == tempI) {
                dur[tempII] = i;
                tempII = tempII + 1;
            }
        }

        tempS = "Cancion(es) que dura mas: \n";
        tempI = 0;
        for (int i = 0; i < tempII; i++) {
            tempI = tempI + 1;
            tempS = tempS + tempI + ". " + song[dur[i]].getsTitle() + " " + song[dur[i]].getsLenght() + "\n";
        }
        JOptionPane.showMessageDialog(null, tempS);

        for (int i = 0; i < Cancion; i++) {
            if (song[i].getsID() == 1) {
                tempS = "El autor de la canción top 1 es " + song[i].getsAuthor();
            }
        }
        JOptionPane.showMessageDialog(null, tempS);

        tempS = "Top 10: \n";
        tempI = 1;
        while (tempI < 11) {
            for (int i = 0; i < Cancion; i++) {
                if (song[i].getsID() == tempI) {
                    tempS = tempS + tempI + ". " + song[i].getsTitle() + "\n";
                }
            }
            tempI = tempI + 1;
        }
        JOptionPane.showMessageDialog(null, tempS);

    }

}
