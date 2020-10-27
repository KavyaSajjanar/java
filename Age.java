public class Age{
public static byte ageDefnition(double age){
System.out.println("invoked age:" +age);
if(age>=1&& age<=5){
	System.out.println("Given input is Kid");
	return 1;
}
if(age>=6&& age<=12){
	System.out.println("Given input is child");
	return 2;
}
if(age>=13&& age<=18){
	System.out.println("Given input is Teen");
	return 3;
}
if(age>=19&& age<=32){
	System.out.println("Given input is Adult");
	return 4;
}
if(age>=33&& age<=80){
	System.out.println("Given input is Old");
	return 5;
}
return -1;
}
}
