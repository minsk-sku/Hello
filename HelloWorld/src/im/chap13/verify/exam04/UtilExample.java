package im.chap13.verify.exam04;

public class UtilExample {
	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("ȫ�浿", 35);
		Integer age = Util.getValue(pair, "ȫ�浿");
		System.out.println(age);
		
		ChildPair<String, Integer> childPair = new ChildPair<>("ȫ���", 20);
		Integer childAge = Util.getValue(childPair, "ȫ���");
		System.out.println(childAge);
		
		/*OtherPair<String, Integer> otherPair = new OtherPair<>("ȫ���", 20);
		//OtherPair�� Pair�� ������� �����Ƿ� ���ܰ� �߻��ؾ� �մϴ�.
		int otherAge = Util.getValue(otherPair, "ȫ���");
		System.out.println(otherAge);*/
	}
}
