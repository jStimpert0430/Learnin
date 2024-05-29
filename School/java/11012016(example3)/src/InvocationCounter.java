
public class InvocationCounter {
	private static int numberOfInvocation = 0;//class variable - one per class
	
	public static void main(String[] args) {
		int i;
		InvocationCounter object1 = new InvocationCounter();
		for(i=1;i<6;i++){
			object1.demoMethod();
		}
		object1.outPutCount();
		InvocationCounter object2 = new InvocationCounter();
		for(i=1;i<6;i++){
			object2.demoMethod();
			object2.outPutCount();
		}
		System.out.println("Total number of invocations = " + numberSoFar());

	}//endofmain
	
	public void demoMethod(){
		numberOfInvocation++;
	}
	
	public void outPutCount(){
		numberOfInvocation++;
		System.out.println("Number of invocations so far = " + numberOfInvocation);
	}
	
	public static int numberSoFar(){
		numberOfInvocation++;
		return numberOfInvocation;
	}

}
