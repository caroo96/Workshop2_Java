.package workshop2_java;
import javax.swing.JOptionPane;

public class Exercise5 {
    
    public static void concentrateGame() {        
        
        JOptionPane.showMessageDialog(null, " Ejercicio # 5 \n \n  Simulación de juego de concéntrese \n \n debe escoger dos posiciones y los valores en estas debe ser iguales" );
         
         int[][] array = {
            {2, 5, 9, 3, 7, 3},
            {2, 8, 6, 4, 1, 6},
            {8, 1, 0, 1, 4, 7},
            {9, 6, 4, 3, 0, 5}};
         int numberPosition1 = 0;
         int numberPosition2 = 0;
         int points = 0;
         String equalsNumbers  = "";   
        
         while(points < 10){
            String position1 = JOptionPane.showInputDialog("Ingrese la posición #1 separada por un espacio (fila columna):");
            String position2 = JOptionPane.showInputDialog("Ingrese la posición #2 separada por un espacio (fila columna):");                
            String [] splitPosition1 = position1.split(" ");
            String [] splitPosition2 = position2.split(" ");
                
            if (splitPosition1.length == 2 && splitPosition2.length == 2) {
                int row1 = Integer.parseInt(splitPosition1[0]);
                int column1 = Integer.parseInt(splitPosition1[1]);
                int row2 = Integer.parseInt(splitPosition2[0]);
                int column2 = Integer.parseInt(splitPosition2[1]);
                numberPosition1  = array[row1][column1];
                numberPosition2  = array[row2][column2];    
                JOptionPane.showMessageDialog(null, "El número de la posición #1 es: "+numberPosition1 + "\nEl número de la posición #2 es: " +numberPosition2);                
            }
            
            if (numberPosition1 == numberPosition2) {
                points ++;  
                equalsNumbers += numberPosition1 + " " + numberPosition2 + "\n" ;
            }
            JOptionPane.showMessageDialog(null, "Lista números iguales hasta el momento: \n" + equalsNumbers ); 
        }  
    }             
}     
