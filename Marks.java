public class Marks{
public static void main(String[] args)
{
	System.out.println("Details Of Student");
	arrayOfPercentages();
}
public static void arrayOfPercentages()
{
System.out.println("invoking method");
float primaryPercentage=98.1f;
float highSchoolPercentage=85.5f;
float pucPercentage=75.3f;
float degreePercentage=60.2f;
float[] percentages ={primaryPercentage,highSchoolPercentage,pucPercentage,degreePercentage};
int sizeOfArray=percentages.length;
System.out.println("Total elements=" +sizeOfArray);
float elementAtIndex1=percentages[1];
System.out.println("elementAtIndex two=" +elementAtIndex1);
}
}