package workshop2_java;
import javax.swing.JOptionPane;

public class Exercise8 {
    
     public static void compareArrays() { 
         
        JOptionPane.showMessageDialog(null, " Ejercicio # 8 \n \n  Comparación de vectores " );
        
        int sizeArray1 = Integer.parseInt(JOptionPane.showInputDialog("Indique el tamaño del vector 1 "));
        int sizeArray2 = Integer.parseInt(JOptionPane.showInputDialog("Indique el tamaño del vector 2 "));     
      
        int[] array1 = new int[sizeArray1];      
        int[] array2 = new int[sizeArray2];
        String listArray1 = ""; 
        String listArray2 = "";
        String listNumbersEquals = "";
        
        
         JOptionPane.showMessageDialog(null, " VECTOR 1 " );
         for (int positionArray1 = 0; positionArray1 < sizeArray1; positionArray1++) {
             int valueArray1 = Integer.parseInt(JOptionPane.showInputDialog("Indique el valor de la posición "+positionArray1+ "  del VECTOR 1" ));
             array1[positionArray1] = valueArray1;          
         }
         
         JOptionPane.showMessageDialog(null, " VECTOR 2 " );
         for (int positionArray2 = 0; positionArray2 < sizeArray2; positionArray2++) {
             int valueArray2 = Integer.parseInt(JOptionPane.showInputDialog("Indique el valor de la posición "+positionArray2+ "  del VECTOR 2" ));
             array2[positionArray2] = valueArray2;
         }
                 
        for (int i = 0; i < array1.length - 1; i++) {
            for (int j = 0; j < array1.length - i - 1; j++) {
                if (array1[j] > array1[j + 1]) {                    
                    int temporaryOrder = array1[j];
                    array1[j] = array1[j + 1];
                    array1[j + 1] = temporaryOrder;
                }
            }
        }
        
        for (int i = 0; i < array2.length - 1; i++) {
            for (int j = 0; j < array2.length - i - 1; j++) {
                if (array1[j] > array1[j + 1]) {                    
                    int temporaryOrder = array2[j];
                    array2[j] = array1[j + 1];
                    array2[j + 1] = temporaryOrder;
                }
            }
        }
        
        for (int num : array1) {
            listArray1 += num + ", ";
        }
        
         for (int num : array2) {
            listArray2 += num + ", ";
        }
         
        int i = 0, j = 0;
        while (i < sizeArray1 && j < sizeArray2) {
            if (array1[i] == array2[j]) {
                listNumbersEquals += array1[i] + ", ";
                i++;
                j++;
            } else if (array1[i] < array2[j]) {
                i++;
            } else {
                j++;
            }
        }
        JOptionPane.showMessageDialog(null, "Vector1: " + listArray1 + "\n Vector2: " + listArray2 + "\n Respuesta: " + listNumbersEquals);        
     }
 }
