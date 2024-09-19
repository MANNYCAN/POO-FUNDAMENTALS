package org.generations.clas;

import java.util.ArrayList;
import java.util.List;

public class Courses {
	 String courseName;
     String professorName;
     String year;
     //Lista para inscribir alumnos
     List<Student> enrolledStudents;
     
     public void enroll(Student student){
         //TODO add the student to the collection
    	 this.courseName = courseName;
         this.professorName = professorName;
         this.year = year;
         //Metodo array list
         this.enrolledStudents = new ArrayList<>();
     }//constructores de incrpcion 
     
      public void unEnroll(Student student){
          //TODO remove this student from the collection
          // Hint: check if that really is this student
    	  if (enrolledStudents.remove(student)) {
              //imprimir la matertia de baja
    		  System.out.println(student.firstName+student.lastName+" Se dio de baja: "+courseName);
          }//Condicional para remover
      }//constructores de desinsccribir

      public int countStudents(){
          //TODO implement
    	  //siz de enrolledS para saber los elementos del arreglo
          return enrolledStudents.size();
      }//constructor contador de estuduantes
      
      public int bestGrade(){
          //TODO implement
          return 0;
      }//contador bestGrade
}//Courses
