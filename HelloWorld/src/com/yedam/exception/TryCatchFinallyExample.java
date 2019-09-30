package com.yedam.exception;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;

		try {
			data1 = args[0];
			data2 = args[1];
			System.out.println("data1= " + data1);
			System.out.println("data2= " + data2);
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			System.out.println("sum :  " + (value1 + value2));
		} /*
			 * catch (ArrayIndexOutOfBoundsException e) {
			 * System.out.println("실행 매개변수값이 부족합니다"); System.out.println("매개변수가 두 개 필요합니다");
			 * } catch (NumberFormatException e) { System.out.println("숫자로 변환할 수 없습니다");
			 * System.out.println("다시 실행하세요");
			 */

		catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("매개값의 개수와 타입을 다시 확인하세요");
		} catch (Exception e) {
			System.out.println("알 수 없는 예외 발생");

		} finally {
			System.out.println("다시 실행하세요");

		}
		System.out.println("프로그램 종료");
	}

}
