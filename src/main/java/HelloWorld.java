
public class HelloWorld {
	
	private String message = "Hello, World!";
	

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		if (message == null) {
			throw new NullPointerException();
		}
		this.message = message;
	}

	public static void main(String[] args) {
		System.out.println(new HelloWorld().getMessage());
	}

}
