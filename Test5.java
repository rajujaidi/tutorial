class Test5 {
	Test5() {

		System.out.println("0-arg cons");
	}

	Test5(int a) {
		System.out.println(" 1-arg cons");

	}

	Test5(int a, int b) {
		System.out.println("2-arg cons");

	}

	public static void main(String[] args) {
		// names approach
		Test5 t1 = new Test5();
		Test5 t2 = new Test5(10);

		Test5 t3 = new Test5(10, 20);
	
	// name less approach
	
		new Test5();
	new Test5(10);
	new Test5(10,20);
	
	}

}
