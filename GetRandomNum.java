import java.util.Random;

public class GetRandomNum {
	private static Random random;

	public static void main(String[] args) {
		//System.out.println((char)97);
		random = new Random();
		for(int i=0;i<10;i++){
			int nextInt = random.nextInt(30);
			System.out.println(nextInt);
		}
		getStringId();
	}

	private static void getStringId() {
		// TODO Auto-generated method stub
		StringBuffer buffer = new StringBuffer();
		buffer.append("ws");
		int i = 0;
		while (i < 13) {
			int nextInt = random.nextInt(30);
			switch (nextInt/10) {
			case 0:
			int num = random.nextInt(10);
			buffer.append(num);
				break;
			case 1:
			int uppercase = random.nextInt(26)+65;
			buffer.append((char)uppercase);
				break;
			case 2:
				int lowercase = random.nextInt(26)+97;
				buffer.append((char)lowercase);
				break;
			default:
				break;
			}
			i++;
		}
		System.out.println(buffer.toString());
	}
}
