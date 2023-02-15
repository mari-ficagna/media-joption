/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author Mari (48) 99618-5728
 */
public class Aula2Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nota1 = Integer.parseInt(JOptionPane.showInputDialog("Nota 1: "));
        int nota2 = Integer.parseInt(JOptionPane.showInputDialog("Nota 2: "));
        int nota3 = Integer.parseInt(JOptionPane.showInputDialog("Nota 3: "));
        int media = (nota1 + nota2 + nota3)/3;
        String boa = " :-)";
        String ruim = " :-(";
        if (media>=60) {
            JOptionPane.showMessageDialog(null, media +" "+ boa);
        } else {
            JOptionPane.showMessageDialog(null, media + " " + ruim);
        }
        

    }
    
}
