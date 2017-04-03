package at.iteratec.dojo;

public class Hello {
	
    public static void main(String[] args) {
        System.out.println(getMessage());
    }

	protected static String getMessage() {
		return getMessage(null);
	}
    
	protected static String getMessage(String name) {
		if (name != null) {
			return "Hello " + name;
		} else {
			return "Hello World";
		}
	}
    
}
