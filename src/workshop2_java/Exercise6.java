package workshop2_java;
import javax.swing.JOptionPane;

public class Exercise6 {
    
  public static void unionArrays() { 
      
    JOptionPane.showMessageDialog(null, " Ejercicio # 6 \n \n  Unión de dos vectores en un array intercalados" );
    
    char[] array1 = {'1','2','3','4','5','6','7','8'};
    char[] array2 = {'A','B','C','D','E','F','G','H'};  
    char[][] unionArrays= new char[4][4];
    String listArray = "";    
    
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


