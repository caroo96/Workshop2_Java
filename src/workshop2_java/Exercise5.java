package workshop2_java;
import javax.swing.JOptionPane;

public class Exercise5 {
    
    public static void concentrateGame() {        
        
        JOptionPane.showMessageDialog(null, " Ejercicio # 5 \n \n  Simulación de juego de concéntrese " );
         
        int[] array = new int[2];
        int point = 0;
        String listArray = "";   
        
        while(point < 10){
            
            for (int position = 0; position < array.length; position++) {
                boolean validNumber = false;
                
                while (!validNumber) {
                    int valueArray = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de la posición " + position + " por favor"));
                    
                    if (valueArray >= 0 && valueArray <= 9) {
                        array[position] = valueArray;
                        validNumber = true;                      
                    } else {
                        JOptionPane.showMessageDialog(null, "Debes ingresar un número entre 0 y 9");              
                    }
                }                
            }  
            
            JOptionPane.showMessageDialog(null, "Los números ingresados fueron: \n " +array[0] + " y " + array[1]);
            
            if (array[0] == array[1]) {
                point = ++point;
                listArray += array[0] + " y " + array[1] + "\n";
           }
            
           JOptionPane.showMessageDialog(null, "Lista de números iguales \n"+ listArray);
        }
    }
}
