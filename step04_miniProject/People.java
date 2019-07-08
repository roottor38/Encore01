/* 사람의 정보만 보유하게 되는 구조
 * 정보를 제공, 수정하는 기능
 * 단, age는 1살 이상인 데이터만 허용 : 유효성 검증
 * age에 대한 개발 관점
 *  1. 외부에서 32bit int (+ -)의 데이터 중 1살 이상인 데이터만 대입되게 구현
 *  2. age 라는 변수를 직접 호출하면 32bit의 모든 데이터를 대입 받기 때문에 변수 호출을 차단해야함
 *  	- private 으로 은닉
 *  3. public 메소드로 유효성 검증 로직 반영해서 1이상인 데이터만 저장
 *  	- public 메소드 추가 개발
 */
package model.domain;

public class People {
	//멤버변수
	private String name;
	private int age;
	
	//공개 생성자
	public People() {}
	public People(String name, int age) {
	this.name = name;
	this.age = age;
}

	//name 변수값 수정, 제공
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//age 변수값 수정[1살 이상인 경우의 데이터만 허용, 조건식(if)], 제공
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age > 0) {
			this.age = age;
		}else {//if 조건식이 false인 경우 실행되는 블록
			System.out.println("사람이 아니므니다");
		}
	}
	
	
//	//생성자
//	public People() {}  //생성자 호출 new People();
//	
//	//객체 생성 시점에 사용자가 원하는 데이터로 객체의 멤버들값 대입(초기화)
//	public People(String n, int a) {//new People("",2);
//		name = n;
//		age = a;
//	}   
	
	

}
