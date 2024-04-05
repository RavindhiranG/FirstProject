package SingleTry_multipleCatch;

public class Task {
	public static void main(String[] args) {
		String [] name = {null, "ravi", "raja"};
		
		try {
		
		System.out.println(name[0].toCharArray());
		System.out.println(name[4]);
		System.out.println(name[2].charAt(4));
		}
		
		catch(ArithmeticException x) {
			System.out.println("cannot invoke");
			
		}
		catch(NullPointerException x) {
			System.out.println(x);
			
			
		}
		catch(StringIndexOutOfBoundsException x) {
			x.printStackTrace();
			
		}
		catch(ArrayIndexOutOfBoundsException x) {
			System.out.println(x);
			
		}
		catch(IndexOutOfBoundsException x) {
			System.out.println(x);
			
		}
		catch(RuntimeException x) {
			System.out.println(x);	
		}
		catch(Exception x) {
			x.printStackTrace();
			
		}
		finally {
			System.out.println("code executed successfully");
		}
		
		
	}

}
