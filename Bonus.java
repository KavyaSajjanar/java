public class Bonus{
public static void main(String[] args)
{
	System.out.println("Information");
	arrayOfGrades();
}
public static void arrayOfGrades()
{
System.out.println("invoking method");
char firstStudentGrade='S';
char secondStudentGrade='A';
char thirdStudentGrade='A';
char fourthStudentGrade='B';
char fifthStudentGrade='A';
char sixthStudentGrade='S';
char seventhStudentGrade='C';
char eighthStudentGrade='A';
char ninthStudentGrade='C';
char tenthStudentGrade='A';

char[] grades ={firstStudentGrade,secondStudentGrade,thirdStudentGrade,fourthStudentGrade,fifthStudentGrade,sixthStudentGrade,seventhStudentGrade,eighthStudentGrade,ninthStudentGrade,tenthStudentGrade};
int sizeOfArray=grades.length;
System.out.println("Total elements=" +sizeOfArray);
char elementAtIndex3=grades[3];
System.out.println("elementAtIndex three=" +elementAtIndex3);
}
}