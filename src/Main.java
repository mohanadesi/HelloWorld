//interface TestLambda {
	//public void sayHello(String message);
//}

public class Main {

	public static void main(String[] args) {
		//TestLambda lambda  = arg1->System.out.println("hello" +arg1);
		//lambda.sayHello(" lambda expression");
		//lambda.sayHello(" World");
		//lambda.sayHello(", its awesome programming with lambda (->)");
		Privateaccessmodifiers privateaccessmodifiers = new Privateaccessmodifiers();
		privateaccessmodifiers.setAge(24);
		privateaccessmodifiers.setName("Smita");
		
		System.out.println("Age:" + privateaccessmodifiers.getAge());
		System.out.println("Name:" + privateaccessmodifiers.getName());

	}

}
