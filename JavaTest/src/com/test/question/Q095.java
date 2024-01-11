package com.test.question;

public class Q095 {
	public static void main(String[] args) {
		Employee e1 = new Employee();

		e1.setName("홍길동");
		e1.setDepartment("홍보부");
		e1.setPosition("부장");
		e1.setTel("010-1234-5678");
		e1.setBoss(null); //직속 상사 없음

		e1.info();


		Employee e2 = new Employee();

		e2.setName("아무개");
		e2.setDepartment("홍보부");
		e2.setPosition("사원");
		e2.setTel("010-2541-8569");
		e2.setBoss(e1); //직속 상사 e1(홍길동)

		e2.info();
	}
}
class Employee {
	private String name;
	private String department;
	private String position;
	private String tel;

	//getter, setter 구현
	//이름 : 읽기/쓰기, 한글 2~5자 이내
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name.length()<2 || name.length()>5) 
		{
			return; // 오류: 길이 안맞음 
		}
		else 
		{
			for(int i=0; i<name.length(); i++) {
				if(name.charAt(i) <'가' || name.charAt(i)>'힣') {
					return; // 오류: 한글 아님 
				}
			}
			this.name = name;
		}
	}
	
	//부서 : 읽기/쓰기, 영업부, 기획부, 총무부, 개발부, 홍보부
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		String[] departments = {"영업부", "기획부", "총무부", "개발부", "홍보부"};
		for(int i=0; i<5; i++) {
			if(departments[i] == department)
				this.department = department;
		}
	}
	
	//직잭 : 읽기/쓰기, 부장, 과장, 대리, 사원
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		String[] positions = {"부장", "과장", "대리", "사원"};
		for(int i=0; i<positions.length; i++) {
			if(positions[i] == position)
				this.position = position;
		}
	}

	//연락처 : 읽기/쓰기, 010-XXXX-XXXX 형식 확인
	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		if(tel.charAt(3)!='-' || tel.charAt(8)!='-' || tel.length()!=13)
			return;
		this.tel = tel;
	}
	
	//직속상사 : 읽기/쓰기, 다른 직원 중 한명, 같은 부서가 아니면 될 수 없음(유효성 검사)
	public Employee getBoss() {
		return boss;
	}

	public void setBoss(Employee boss) {
		if(boss == null)
			return;
		if(boss.name == this.name)
			return; // 나 자신 불가능
		if(boss.getDepartment().equals(this.department))
			this.boss = boss;
	}

	private Employee boss;
	
	public void info() {
		System.out.println("["+name+"]");
		System.out.printf("- 부서: %s\n", department);
		System.out.printf("- 직위: %s\n", position);
		System.out.printf("- 연락처: %s\n", tel);
		System.out.printf("- 직속상사: %s\n", boss==null ? "없음":boss.name +"("+boss.department+" "+boss.position+")");
		System.out.println();
	}
}