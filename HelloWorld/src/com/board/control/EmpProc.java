package com.board.control;

import java.util.List;
import java.util.Scanner;

import com.board.impl.EmployeeServiceImpl;
import com.board.model.Employee;
import com.board.model.EmployeeService;

public class EmpProc {

	Scanner sc = new Scanner(System.in);

	EmployeeService service = new EmployeeServiceImpl();

	public void execute() {
		
		
		

		while (true) {
			System.out.println("메뉴선택하세요.");
			System.out.println("1.작성 2.단건조회 3.전체조회 4.삭제 5.갱신 6.종료 ");
			int menu = 0;
			try {
				menu = sc.nextInt();
				sc.nextLine();

			} catch (Exception e) {
				System.out.println("정상적인 메뉴를 선택해주세요");
				System.out.println("1.작성 2.단건조회 3.전체조회 4.삭제 5.갱신 6.종료 ");

				sc.nextLine();
				e.printStackTrace();
			}

			if (menu == 1) {
				writeBoard();
			} else if (menu == 2) {
				getBoard();
			} else if (menu == 3) {
				getBoardList();
			} else if (menu == 4) {
				deleteBoard();
			} else if (menu == 5) {
				// updateBoard();
			} else if (menu == 6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		System.out.println("프로그램 종료.");
	}

	public void writeBoard() {
		System.out.println("직원등록.");
		// System.out.println("직원번호입력:");
		// int empId = sc.nextInt();
		// sc.nextLine();
		System.out.println("이름을 입력하세요.");
		String firstName = sc.nextLine();
		System.out.println("성을 입력하세요.");
		String lastName = sc.nextLine();
		System.out.println("작업번호를 입력하세요.");
		String jobId = sc.nextLine();
		System.out.println("입사일을 입력하세요.");
		String hireDate = sc.nextLine();
		System.out.println("이메일을 입력하세요.");
		String email = sc.nextLine();

		System.out.println("급여를 입력하세요.");
		int salary = sc.nextInt();
		Employee emp = new Employee();
		emp.setFirstName(firstName);
		emp.setLastName(lastName);
		emp.setHireDate(hireDate);
		emp.setEmail(email);
		emp.setSalary(salary);
		emp.setJobId(jobId);
		service.insertEmployee(emp);

	}

	public void getBoard() {
		System.out.println("한건조회.");
		System.out.println("조회할 번호를 입력:");
		int empNo = sc.nextInt();
		Employee emp = service.getEmployee(empNo);// 다른 부분
		System.out.println(emp);
		/*
		 * List<Employee> employees = service.getEmpList(); for (Employee employee :
		 * employees) { if (employee != null && employee.getEmployeeId() == empNo) {
		 * System.out.println(employee); break; } }
		 */

	}

	public void getBoardList() {
		System.out.println("전체글조회.");
		List<Employee> employees = service.getEmpList();
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

	public void deleteBoard() {
		System.out.println("한건삭제");
		System.out.println("조회할 번호를 입력:");
		int empId = sc.nextInt();
		service.deleteEmployee(empId);
	}
}

/*
 * public void updateBoard() { System.out.println("No."); int boardNo =
 * sc.nextInt(); sc.nextLine(); System.out.println("content"); String title =
 * sc.nextLine(); String contents = sc.nextLine(); String writer =
 * sc.nextLine(); Board board = new Board(boardNo, title, contents, writer);
 * service.writeBoard(board, boardAry);
 * 
 * } }
 */
