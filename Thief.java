public class Thief{
public static void steal()
{
double pocket=Reliance.budget;
System.out.println("steal budget" +pocket);
Reliance.budget=0;
System.out.println("Reliance budget" +Reliance.budget);
System.out.println("Exit: steal");
}
}