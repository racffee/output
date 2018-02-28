class iotest {
	public static void main(String[] args) throws java.io.IOException {
		java.io.BufferedReader reader = new java.io.BufferedReader(
			new java.io.InputStreamReader(System.in)
		);
	System.out.println("please input sentence");
	String text = reader.readLine();

	System.out.println("input sentence is "+text);
	}
}
