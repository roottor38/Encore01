package view;

import java.util.Scanner;
import controller.StoreController;
import model.CustomerModel;


public class StartView {
	static String name;
	public static int req;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("1. �α���");
		System.out.println("2. ����");
		System.out.println("�Է� : ");
		req=sc.nextInt();
			if(req == 1) {
				System.out.print("�α��� : ");
				sc.nextLine();
				name=sc.nextLine();
				for(req = 1 ; req ==1;) {
					if(name.equals("admin")) {
						System.out.println("0.������");
						System.out.println("1.��ǰ ��ü list");
						System.out.println("2.��ǰ �˻�");
						System.out.println("3.��ǰ �߰�");
						System.out.println("4.��ǰ ����");
						System.out.println("5.�� list");
						System.out.printf("�Է� : ");
						req=sc.nextInt();
						StoreController.request(req);
						System.out.println("�����ðڽ��ϱ�?");
						System.out.println("YES : 0");
						System.out.println("No : 1");
						System.out.printf("�Է� : ");
						req=sc.nextInt();
					}
					else if(name.equals(CustomerModel.search(name).getName())) {
						System.out.println("0.������");
						System.out.println("1.��ǰ ��ü list");
						System.out.println("2.��ǰ �˻�");
						System.out.printf("�Է� : ");
						req=sc.nextInt();
						if(req == 0 || req == 1 || req == 2) {
							StoreController.request(req);
							System.out.println("�����ðڽ��ϱ�?");
							System.out.println("YES : 0");
							System.out.println("No : 1");
							System.out.printf("�Է� : ");
							req=sc.nextInt();
						}else {
							System.out.println("������ �����ϴ�.");
							System.out.println("�����ðڽ��ϱ�?");
							System.out.println("YES : 0");
							System.out.println("No : 1");
							System.out.printf("�Է� : ");
							req=sc.nextInt();
						}
					}
				}
			}
			else if(req ==2) {
				StoreController.request(6);
			}
	}
}

		





