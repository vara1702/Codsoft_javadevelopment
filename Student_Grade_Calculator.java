import java.util.Scanner;
public class Student_Grade_Calculator
{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Student Grade Calculator");
    System.out.println("Enter the no. of subjects");
    int nS=sc.nextInt();
    int total=0;
    for(int i=0;i<nS;i++){
        System.out.println("Enter marks obtained in "+(i+1)+"(out of 100):");
        int marks=sc.nextInt();
        total+=marks;
     }
     
     double avgP = (double)total/nS;
     char Grade;
     
     if(avgP>=90){
        Grade='O';
     }
     
     else if(avgP>=80){
     Grade='A';
     }
     else if(avgP>=70){
     Grade='B';
    }
    else if(avgP>=60){
        Grade='C';
    }
    else if(avgP>=50){
        Grade='D';
       }
       else if(avgP>=40){
        Grade='E';
       }
       else {
        Grade='F';
}
       
    
       System.out.println("Total marks score is " +total);
       System.out.println("Average percntage gained is" +avgP+"%");
       System.out.println("Grade is " +Grade);

       }
    }