package spring01;
/** ������ �����޼��带 ���� */
public class NumberGuess {
	//����
	private int com_num = new java.util.Random().nextInt(100)+1;
	//�����޼���
	public String checkNumber(int num) {
		if(com_num == num) return "����";
		else if(com_num < num) return "�����ּ���";
		else if(com_num > num) return "�����ּ���";
		return null;
	}//end checkNum()
}
