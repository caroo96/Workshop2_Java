package workshop2_java;
import javax.swing.JOptionPane;

public class Exercise6 {
    
  public static void unionArrays() { 
      
    JOptionPane.showMessageDialog(null, " Ejercicio # 6 \n \n  Unión de vectores intercalados \n \n Recuerda que son dos vectores y el tamaño de cada uno es de 8 posiciones" );

    char[] array1 = new char[8];
    char[] array2 = new char[8];
    char[][] unionArrays= new char[4][4];
    String listArray = "";    
    
    for (int positionArray1 = 0; positionArray1 < array1.length; positionArray1++) {
        char valueArray1 = JOptionPane.showInputDialog("Ingresa el valor de la posición " + positionArray1 + " del vector 1").charAt(0);
        array1[positionArray1] = valueArray1;
    }
    
    for (int positionArray2 = 0; positionArray2 < array2.length; positionArray2++) {
        char valueArray2 = JOptionPane.showInputDialog("Ingresa el valor de la posición " + positionArray2 + " del vector 2").charAt(0);
        array2[positionArray2] = valueArray2;
    }      
   
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            if (j % 2 == 0) {
               unionArrays[i][j] = array2[i * 2 + j / 2];
            } else {
               unionArrays[i][j] = array1[i * 2 + j / 2];
            }
        }
    }        
       
    for (int i = 0; i < unionArrays.length; i++) {
        for (int j = 0; j < unionArrays[i].length; j++) {     
            listArray +=  unionArrays[i][j]+" " ;  
                if ((j + 1) % 4 == 0) {
                    listArray += "\n";
                }            
        }     
    }     
    JOptionPane.showMessageDialog(null,  listArray );
  }
}

            
  
    
    
