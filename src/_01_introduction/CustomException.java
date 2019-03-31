package _01_introduction;

public class CustomException extends Exception {

	public void terminate() {
		System.exit(0);
	}
}
