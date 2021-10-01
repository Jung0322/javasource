package collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("hong123", "hong123", "ȫ�浿"));
		set.add(new Member("hong124", "hong123", "ȫ�浿"));
		set.add(new Member("hong125", "hong123", "ȫ�浿"));
		set.add(new Member("hong126", "hong123", "ȫ�浿"));
		
		for(Member member:set) {
			System.out.println(member);
		}
		System.out.println(set);
	}

}
