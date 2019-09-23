
public class SingletonExample {
	public static void main(String[] args) {
		//Singleton s1 = new Singeton();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		if (s1 == s2)
			System.out.println("같은객체");
		else
			System.out.println("다른");
	}
}
		

}
