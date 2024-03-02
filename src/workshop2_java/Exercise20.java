
package workshop2_java;
import java.util.Random;
import javax.swing.JOptionPane;

public class Exercise20 {
    
    public static void studentGrades(){
        
        JOptionPane.showMessageDialog(null, " Ejercicio # 20 \n \n  Calificaciones estudiantes" );
        
        Random fillArray = new Random();
        int [][] array = new int[24][6]; 
        String outputRows = "";
        String outputColumns = "";
        int approvedStudents = 0;
        int failedStudents = 0;
      
        for (int i = 0; i < array.length; i++) {
             int sumRow = 0;              
             String rowString = "";
             for (int j = 0; j < array[i].length; j++) {
                array[i][j] = fillArray.nextInt(5) + 1;                
                sumRow += array[i][j] ;                   
                rowString += array[i][j] + " ";
            }             
            double averageRow = (double) sumRow / array[i].length;        
            outputRows += "Calificaciones: " + rowString + "   Promedio: "  + averageRow + "\n";
            
            if (averageRow >= 3.0) {
                approvedStudents ++;                
            }else{                
                failedStudents ++;
            }
        }
        JOptionPane.showMessageDialog(null, outputRows);
        JOptionPane.showMessageDialog(null, "Los estudiantes aprobados fueron: " + approvedStudents +"\n Los estudiantes reprobados fueron: " + failedStudents );
  
        for (int j = 0; j < array[0].length; j++) {
            int sumColumn = 0;
            String columnString = "";
            for (int i = 0; i < array.length; i++) {
                sumColumn += array[i][j];
                columnString += array[i][j] + " "; 
            }
            double averageColumn = (double) sumColumn / array.length;   
            outputColumns += "Promedio de la materia "+ j + "  es : " + averageColumn + "\n";
        }
        JOptionPane.showMessageDialog(null, outputColumns );
    }
}
        
