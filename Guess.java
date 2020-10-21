public class Guess{
public static void main(String[] args)
{
	System.out.println("Decide");
	arrayOfAnimals();
}
public static void arrayOfAnimals()
{
System.out.println("invoking method");
boolean catIsDomesticAnimal =true;
boolean dogIsWildAnimal =false;
boolean tigerIsDomesticAnimal =false;
boolean cowIsDomesticAnimal =true;


boolean[] animals ={catIsDomesticAnimal,dogIsWildAnimal,tigerIsDomesticAnimal,cowIsDomesticAnimal};
int sizeOfArray=animals.length;
System.out.println("Total elements=" +sizeOfArray);
boolean elementAtIndex2=animals[2];
System.out.println("elementAtIndex two=" +elementAtIndex2);
}
}