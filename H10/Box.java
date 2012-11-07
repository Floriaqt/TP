public class Box {
	public static void main(String[] args) {
		BallContainer box = new BallContainer();
		Ball b1 = new Ball();
		b1.setBall("b1");
		box.add(b1);
		
		Ball b2 = new Ball();
		b2.setBall("b2");
		box.add(b2);
		
		Ball b3 = new Ball();
		b3.setBall("b3");
		box.add(b3);
		
		Ball b4 = new Ball();
		b4.setBall("b4");
		box.add(b4);
		
		Ball b5 = new Ball();
		b5.setBall("b5");
		box.add(b5);
		
		Ball b6 = new Ball();
		b6.setBall("b6");
		box.add(b6);
		
		Ball b7 = new Ball();
		b7.setBall("b7");
		box.add(b7);
		
		Ball b8 = new Ball();
		b8.setBall("b8");
		box.add(b8);
		
		Ball b9 = new Ball();
		b9.setBall("b9");
		box.add(b9);
		
		Ball b10 = new Ball();
		b10.setBall("b10");
		box.add(b10);
		System.out.println(box.getCapacity());
		System.out.println(box.size());
		System.out.println(box.contains(b10));
		
		Ball b11 = new Ball();
		b11.setBall("b11");
		box.add(b11);
		System.out.println(box.contains(b11));
		box.print();
		System.out.println("END");
		box.remove(b6);
		box.print();

	}

}