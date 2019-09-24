package hello;

import java.util.Scanner;

public class MemberExample2 {
	private static Member[] memberArray = new Member[10];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		boolean run = true;
		while (run) {
			System.out.println("----------------");
			System.out.println("1.멤버 생성 2.멤버목록 3.멤버 조회 (id)4.종료");
			System.out.println("---------------");
			int menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				creatMember();
			} else if (menu == 2) {
				getMemberList();
			} else if (menu == 3) {
				getMember();
			} else if (menu == 4) {
				run = false;
			}
			System.out.println("종료");

		}
	}

	public static void creatMember() {
		System.out.println("creatMember()");
		System.out.println("이름 입력:  ");
		String memberName = sc.nextLine();
		System.out.println("계정명 입력:  ");
		String memberId = sc.nextLine();
		System.out.println("비밀번호 입력:  ");
		String memberPasw = sc.nextLine();
		System.out.println("나이 입력:  ");
		int memberAge = sc.nextInt();

		Member mem = new Member(memberName, memberId, memberPasw, memberAge);
		for (int i = 0; i < memberArray.length; i++) {
			if (memberArray[i] == null) {
				memberArray[i] = mem;
				break;

			}
		}
	}

	public static void getMemberList() {
		System.out.println("getMemberList()");
		for (Member m : memberArray) {
			if (m != null) {
				System.out.println("이름 :  " + m.getName() + ", ID:  " + m.getId()+m.getAge());
			}
		}
	}

	public static void getMember() {
		System.out.println("getMember()");
		System.out.println("계정명 입력:  ");
		String memberId = sc.nextLine();
		System.out.println("비밀번호 입력:  ");
		String memberPasw = sc.nextLine();

		boolean isMemberId = false, isMemberPasw = false;
		String memberName = null;
		int memberAge = 0;
		for (Member mem : memberArray) {
			if (mem != null && mem.getId().equals(memberId)) {
				if (mem.getPassword().equals(memberPasw)) {
					isMemberId = true;
					isMemberPasw = true;
					memberName = mem.getName();
					memberAge = mem.getAge();
					break;
					// System.out.println("이름 : " + mem.getName() + "나이 : " + mem.getAge());
					// break;
				} else {
					// System.out.println("패스워드가 틀렸습니다");
					isMemberId = true;
					isMemberPasw = false;
					break;
				}

			} else {
				isMemberId = false;
				isMemberPasw = false;

				// System.out.println("존재하지 않는 계정입니다.");
				// break;

			}

		}
		if (isMemberId == true && isMemberPasw == true) {
			System.out.println("이름 :  " + memberName + " 나이 :  " + memberAge);
		} else if (isMemberId == true & isMemberPasw == false) {
			System.out.println("패스워드가 틀렸습니다");
		} else if (isMemberId == false & isMemberPasw == false) {
			System.out.println("존재하지 않는 계정입니다.");
		}

	}

}