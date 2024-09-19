package org.generations.clas;


   public class Student {
       String firstName;
       String lastName;
       int registration;
       int grade;
       int year;
       
       public void printFullName(){
    	      //TODO implement
    	   System.out.println(firstName+" "+lastName);
    	   }//printFullName

       public boolean isApproved(){
    	       //TODO implement: should return true if grade >= 60
    	   return grade >=60;
    	   }//isApproved

       public int changeYearIfApproved(){
    	       //TODO implement: the student should advance to the next year if he/she grade is >= 60
    	       // Make year = year + 1, and print "Congragulations" if the student has been approved
    	   if (isApproved()) {
               //contador de año
    		   year ++;
               System.out.println(firstName+" " +lastName+" Aprobaste, pasas a: " + year);
           } else {
          	 System.out.println(firstName+" "+lastName+" Reprobaste, repetiras: " + year);
           }
           return year;
    	   }//changeYearIfApproved
       
   }//class Student