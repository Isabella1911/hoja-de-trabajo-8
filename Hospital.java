//Isabella Obando 23074
//Universidad del Valle de Guatemala
//Hoja de trabajo 8
import java.io.File;
import java.io.FileNotFoundException;
import java.util.PriorityQueue; // Add missing import statement
import java.util.Scanner;
 
 public class Hospital{
     
     /** 
      * @param args
      */
     public static void main(String[] args) {
         //Java Collection Framework
         PriorityQueue<Patient> emergencyRow = new PriorityQueue<>();
 
         //Patients uno por uno
         while (!emergencyRow.isEmpty()) {
             Patient patient = emergencyRow.poll();
             System.out.println("Atendiendo a: " + patient);
         }
     }
 
     private static void patientLine(Priority<Patient> emergencyRow) {
         try {
             File archivo = new File("Patients.txt");
             Scanner scanner = new Scanner(archivo);
             while (scanner.hasNextLine()) {
                 String linea = scanner.nextLine();
                 String[] partes = linea.split(",");
                 if (partes.length == 3) {
                     String name = partes[0].trim();
                     String syntom = partes[1].trim();
                     char emergencyCode = partes[2].trim().charAt(0);
                     emergencyRow.add(new Patient(name, syntom, emergencyCode));
                 }
             }
             scanner.close();
         } catch (FileNotFoundException e) {
             System.err.println("error al cargar el");
             e.printStackTrace();
         }
     }
 }
