/* ����� ������ �����ϰ� �Ǵ� ����
 * ������ ����, �����ϴ� ���
 * ��, age�� 1�� �̻��� �����͸� ��� : ��ȿ�� ����
 * age�� ���� ���� ����
 *  1. �ܺο��� 32bit int (+ -)�� ������ �� 1�� �̻��� �����͸� ���Եǰ� ����
 *  2. age ��� ������ ���� ȣ���ϸ� 32bit�� ��� �����͸� ���� �ޱ� ������ ���� ȣ���� �����ؾ���
 *  	- private ���� ����
 *  3. public �޼ҵ�� ��ȿ�� ���� ���� �ݿ��ؼ� 1�̻��� �����͸� ����
 *  	- public �޼ҵ� �߰� ����
 */
package model.domain;

public class People {
	//�������
	private String name;
	private int age;
	
	//���� ������
	public People() {}
	public People(String name, int age) {
	this.name = name;
	this.age = age;
}

	//name ������ ����, ����
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age > 0) {
			this.age = age;
		}else {
			System.out.println("����� �ƴϹǴϴ�");
		}
	}
	
	public String toString(){
		return name + " " + age;
	}
}















