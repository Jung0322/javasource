package inheritance;

public class DmbCellPhoneEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DmbCellPhone phone = new DmbCellPhone();
		
		phone.color="black";
		phone.model="�ڹ���";
		phone.channel=7;
		
		phone.poewOn();
		phone.turnOnDmb();
		phone.changeChannelDmb(8);
		phone.turnOffDmb();
		phone.bell();
		phone.sendVoice("�ȳ��ϼ���");
		phone.receiveVoice("�ݰ�����");
		phone.hangUp();
	}

}
