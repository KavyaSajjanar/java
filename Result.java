public class Result{
public static byte resultDefnition(double result){
System.out.println("invoked result:" +result);
if(result>=0&& result<=34){
	System.out.println("student fails");
	return 1;
}
if(result>=35&& result<=50){
	System.out.println("student progress is third class");
	return 2;
}
if(result>=51&& result<=65){
	System.out.println("student progress is second class");
	return 3;
}
if(result>=66&& result<=80){
	System.out.println("student progress is first class");
	return 4;
}
if(result>=81&& result<=100){
	System.out.println("student progrees is distinction");
	return 5;
}
return -1;
}
}
