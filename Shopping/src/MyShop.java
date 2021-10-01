import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class MyShop implements IShop {
	private String title;
	Scanner scanner = new Scanner(System.in);
	private String selUser;
	private Product[] carts = new Product[10];
	private User[] users = new User[2];
	private Product[] products = new Product[5];
	static int a = 0;

	@Override
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		this.title = title;
	}

	@Override
	public void genUser() {
		users[0] = new User("ȫ�浿", PayType.CARD);
		users[1] = new User("������", PayType.CASH);
	}

	@Override
	public void genProduct() {
		products[0] = new SmartTv("�Ｚ 3D", 2500000, "4K");
		products[1] = new SmartTv("LG ����Ʈ", 3520000, "4K");
		products[2] = new CellPhone("������14", 1520000, "KT");
		products[3] = new CellPhone("z�ø�", 1500000, "SKT");
		products[4] = new SmartTv("�Ｚ ��Ʈ��", 2800000, "Full HD");

	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println(title + " ��������");
		System.out.println("===========");
		for (int i = 0; i < 2; i++) {
			System.out.println("[" + i + "]" + ": " + users[i].getName() + " (" + users[i].getPayType() + ")");

		}
		System.out.println("[x]: ����");
		while (true) {
			System.out.print("����: ");
			String cho = scanner.next();
			if (cho.equals("1") || cho.equals("0")) {
				selUser = cho;
				produvctList();
				break;
			} else if (cho.equals("x")) {
				System.out.println("����.");
				break;
			} else {
				System.out.println("�ٽ��Է��ϼ���.");
			}
		}
	}

	void produvctList() {
		a = 0;
		carts = new Product[10];
		System.out.println(title + "��ǰ��� - ��ǰ����");
		System.out.println("======================");
		for (int i = 0; i < 5; i++) {
			System.out.print("[" + i + "]");
			products[i].printDetail();
		}
		System.out.println("[h] ���� ȭ��");
		System.out.println("[c] üũ �ƿ�");
		while (true) {
			System.out.print("����: ");
			String cho = scanner.next();
			if (cho.equals("h")) {
				start();
				break;
			} else if (cho.equals("c")) {
				checkout();
				break;
			} else if (cho.equals("0") || cho.equals("1") || cho.equals("2") || cho.equals("3") || cho.equals("4")) {
				if (a != 9) {
					if (cho.equals("0")) {
						carts[a] = products[0];
						a++;
					} else if (cho.equals("1")) {
						carts[a] = products[1];
						a++;
					} else if (cho.equals("2")) {
						carts[a] = products[2];
						a++;
					} else if (cho.equals("3")) {
						carts[a] = products[3];
						a++;
					} else if (cho.equals("4")) {
						carts[a] = products[4];
						a++;
					}
				} else {
					System.out.println("��ٱ��ϰ� ���� ��");
				}

			} else {
				System.out.println("�ٽ��Է��ϼ���.");
			}
		}
	}

	void checkout() {
		int sum = 0;
		System.out.println("## c���� ##");
		System.out.println(title + " : üũ�ƿ�");
		System.out.println("==================");
		for (int i = 0; i < carts.length; i++) {
			if (carts[i] != null) {
				System.out.println("[" + i + "]" + carts[i].getPname() + "(" + carts[i].getPrice() + ")");
				sum += carts[i].getPrice();
			}
		}
		System.out.println("==================");
		System.out.println("���� ���: "+ users[Integer.parseInt(selUser)].getPayType());
		System.out.println("�հ�: " + sum);
		System.out.println("[p]����, [q]���� �Ϸ�");
		while (true) {
			System.out.print("����: ");
			String cho = scanner.next();
			if (cho.equals("p")) {
				produvctList();
				break;
			} else if (cho.equals("q")) {
				System.out.println("�����Ϸ�.");
				break;
			} else {
				System.out.println("�ٽ��Է��ϼ���.");
			}
		}

	}
}
