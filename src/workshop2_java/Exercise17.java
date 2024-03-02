package workshop2_java;
import javax.swing.JOptionPane;

public class Exercise17 {
    
    public static void sortingPairs() { 
        
        JOptionPane.showMessageDialog(null, " Ejercicio # 17 \n \n  Ordenamiento de pares" );
        
        String pairNumbers = "";
        String oddNumbers = "";

        int sizeArray = Integer.parseInt(JOptionPane.showInputDialog("Indique el tamaño del vector"));
        int[] array = new int[sizeArray];  
        
        for (int positionArray = 0; positionArray < sizeArray; positionArray++) {             
            int valueArray = Integer.parseInt(JOptionPane.showInputDialog("Indique el valor de la posición " + positionArray + " del VECTOR"));
            array[positionArray] = valueArray;          
        }
        
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {                    
                    int temporaryOrder = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temporaryOrder;
                }
            }
        }         
        
        for (int num : array) {
            if (num % 2 == 0) {
                pairNumbers += num + "\n";        
            }
        }
        
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] % 2 != 0) {
                oddNumbers += array[i] + "\n";
            }
        }
        
        JOptionPane.showMessageDialog(null, "Los números pares del vector son: \n" + pairNumbers);
        JOptionPane.showMessageDialog(null, "Los números Impares del vector son: \n" + oddNumbers);
    }
}
