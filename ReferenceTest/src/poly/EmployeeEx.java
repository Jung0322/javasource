package poly;

public class EmployeeEx {

	public static void main(String[] args) {
		
		Worker worker =new Worker();
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.setName("ȫ�浿");
		e1.setPosition("���");
		worker.work(e1);
		
		Ceo ceo = new Ceo();
		ceo.setName("�ں���");
		ceo.setPosition("����");
		worker.work(ceo);
		
		Manger manger = new Manger();
		manger.setName("�����");
		manger.setPosition("������");
		worker.work(manger);
		
		PartTime partTime =new PartTime();
		partTime.setName("������");
		partTime.setPosition("�Ƹ�����Ʈ");
		worker.work(partTime);
		
		
	}

}
