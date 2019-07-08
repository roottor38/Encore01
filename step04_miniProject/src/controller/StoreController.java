package controller;

import java.util.Scanner;
import model.CustomerModel;
import model.ProductModel;
import view.EndVIew;
import view.StartView;

public class StoreController {
	static String name;
	static int req;
	static Scanner sc = new Scanner(System.in);
	static EndVIew endView = EndVIew.getInstance();
	
	
	public static void request(String name) {
		CustomerModel.entrance(name);
	}
	
	public static void request(int reqNumber) {
		if(reqNumber == 1) {
			endView.productAll(ProductModel.getProduct());
		
		}else if(reqNumber == 2) {
			System.out.printf("��ǰ �Է� : ");
			name=sc.nextLine();
			endView.search(name);	
		
		}else if(reqNumber == 3) {
			System.out.printf("��ǰ �̸� : ");
			name=sc.nextLine();
			System.out.printf("��ǰ ���� : ");
			req=sc.nextInt();
			boolean r = ProductModel.insert(name, req);
				if(r) {
					endView.printSuccess("�߰� ����");
				}else {
					endView.printFail("�߰� ����");
				}
		
		}else if(reqNumber == 4) {
			System.out.printf("��ǰ �̸� : ");
			name=sc.nextLine();
			ProductModel.delete(name);
			endView.deleteSuccess(name);
		
		}else if(reqNumber == 5) {
			endView.customerAll(CustomerModel.getCustomer());
		
		}else if(reqNumber == 6) {//����
			System.out.printf("���̵� : ");
			name=sc.nextLine();
			boolean r = CustomerModel.insert(name);
				if(r) {
					endView.printSuccess("���� ����");
					System.out.println("�̸�  �湮Ƚ�� : " + CustomerModel.search(name));
				}else {
					endView.printFail("���� ����");
				}
		}
		
		else if(reqNumber == 0) {
			StartView.req = 0;
		}
	}
	
	
//	public static void main(String[] args) {
//		System.out.println(CustomerModel.entrance("������"));
//	}

}