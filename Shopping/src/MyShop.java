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
		users[0] = new User("홍길동", PayType.CARD);
		users[1] = new User("성춘향", PayType.CASH);
	}

	@Override
	public void genProduct() {
		products[0] = new SmartTv("삼성 3D", 2500000, "4K");
		products[1] = new SmartTv("LG 스마트", 3520000, "4K");
		products[2] = new CellPhone("아이폰14", 1520000, "KT");
		products[3] = new CellPhone("z플립", 1500000, "SKT");
		products[4] = new SmartTv("삼성 울트라", 2800000, "Full HD");

	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println(title + " 계정선택");
		System.out.println("===========");
		for (int i = 0; i < 2; i++) {
			System.out.println("[" + i + "]" + ": " + users[i].getName() + " (" + users[i].getPayType() + ")");

		}
		System.out.println("[x]: 종료");
		while (true) {
			System.out.print("선택: ");
			String cho = scanner.next();
			if (cho.equals("1") || cho.equals("0")) {
				selUser = cho;
				produvctList();
				break;
			} else if (cho.equals("x")) {
				System.out.println("종료.");
				break;
			} else {
				System.out.println("다시입력하세요.");
			}
		}
	}

	void produvctList() {
		a = 0;
		carts = new Product[10];
		System.out.println(title + "상품목록 - 상품선택");
		System.out.println("======================");
		for (int i = 0; i < 5; i++) {
			System.out.print("[" + i + "]");
			products[i].printDetail();
		}
		System.out.println("[h] 메인 화면");
		System.out.println("[c] 체크 아웃");
		while (true) {
			System.out.print("선택: ");
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
					System.out.println("장바구니가 가득 참");
				}

			} else {
				System.out.println("다시입력하세요.");
			}
		}
	}

	void checkout() {
		int sum = 0;
		System.out.println("## c선택 ##");
		System.out.println(title + " : 체크아웃");
		System.out.println("==================");
		for (int i = 0; i < carts.length; i++) {
			if (carts[i] != null) {
				System.out.println("[" + i + "]" + carts[i].getPname() + "(" + carts[i].getPrice() + ")");
				sum += carts[i].getPrice();
			}
		}
		System.out.println("==================");
		System.out.println("결제 방법: "+ users[Integer.parseInt(selUser)].getPayType());
		System.out.println("합계: " + sum);
		System.out.println("[p]이전, [q]결제 완료");
		while (true) {
			System.out.print("선택: ");
			String cho = scanner.next();
			if (cho.equals("p")) {
				produvctList();
				break;
			} else if (cho.equals("q")) {
				System.out.println("결제완료.");
				break;
			} else {
				System.out.println("다시입력하세요.");
			}
		}

	}
}
