package lambda;

import java.util.ArrayList;
import java.util.List;

public class TravelEx1 {

	public static void main(String[] args) {
		List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();
		
		customerList.add(new TravelCustomer("�̼���",40,100000));
		customerList.add(new TravelCustomer("������",30,120000));
		customerList.add(new TravelCustomer("ȫ�浿",25,70000));
		customerList.add(new TravelCustomer("������",38,130000));
		customerList.add(new TravelCustomer("������",50,80000));
		
		//�� ��� ����ϱ�(�̸���)
		customerList.stream().map(TravelCustomer::getName).forEach(System.out::println);
		//������ �� ���� ��� ����ϱ�
		System.out.println("�� ������: "+customerList.stream().mapToInt(c->c.getPrice()).sum()); 
		
		//30�� �̻� ����� ����ϱ�
		System.out.println("30���̻�");
		customerList.stream().filter(s->s.getAge()>=30).forEach(s-> System.out.println(s.getName()));
	}

}
