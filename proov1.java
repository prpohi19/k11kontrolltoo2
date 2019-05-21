public class proov1{
	public static void main(String[] arg) throws Exception{
		joonis1 jogi = new joonis1();
		/* jogi.joonista("Pirita", 50, 50, 120, 140); */
		jogi.joonista(2);
		
		System.out.println(jogi.leiaKaugus("Pirita", 50, 50, 120, 140));
	}
}