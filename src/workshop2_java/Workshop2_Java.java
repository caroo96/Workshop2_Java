package workshop2_java;

import javax.swing.JOptionPane;

public class Workshop2_Java {    

    public static void main(String[] args) {    
        
        JOptionPane.showMessageDialog(null, " CAROLINA AGUDELO \n\n TALLER 2 JAVA \n\n  Los puntos realizados fueron el 5,6,8,17 y 20  \n\n " );
        
        int exerciseNumber = Integer.parseInt(JOptionPane.showInputDialog("Hola, Ingresa el número del ejercicio que deseas ver: \n\n Recuerda que debe ser 5,6,8,17 o 20 "));
        
        if (exerciseNumber!=5 && exerciseNumber!=6 && exerciseNumber!=8 && exerciseNumber!=17 && exerciseNumber!=20 ){            
            JOptionPane.showInputDialog("Deber ingresar el número 5, 6, 8, 17, o 20 ");            
            
        }else{
            
            switch(exerciseNumber) {
            case 5:
                Exercise5.concentrateGame();
                break;
            case 6:
                Exercise6.unionArrays();
                break;
            case 8:
                Exercise8.compareArrays();
                break;
            case 17:
                Exercise17.sortingPairs();
                break;
            case 20:
                Exercise20.studentGrades();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Número Incorrecto, ingrese uno de los siguientes números 5, 6, 8, 17, o 20 .");
           }
        }
    }
}
