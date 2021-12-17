package lambda;

import java.util.ArrayList;
import java.util.List;

public class TravelEx1 {

	public static void main(String[] args) {
		List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();
		
		customerList.add(new TravelCustomer("이순신",40,100000));
		customerList.add(new TravelCustomer("김유신",30,120000));
		customerList.add(new TravelCustomer("홍길동",25,70000));
		customerList.add(new TravelCustomer("성춘향",38,130000));
		customerList.add(new TravelCustomer("강감찬",50,80000));
		
		//고객 명단 출력하기(이름만)
		customerList.stream().map(TravelCustomer::getName).forEach(System.out::println);
		//고객들의 총 여행 비용 출력하기
		System.out.println("총 여행비용: "+customerList.stream().mapToInt(c->c.getPrice()).sum()); 
		
		//30세 이상 고객명단 출력하기
		System.out.println("30대이상");
		customerList.stream().filter(s->s.getAge()>=30).forEach(s-> System.out.println(s.getName()));
	}

}
