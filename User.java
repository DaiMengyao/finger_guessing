package finger_guessing;

import java.util.Scanner;
public class User {
	private String name;
	private int score;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	//ѡ��ɫ
	public void chooseActor(){
		
	//	System.out.println("��Ϊ�Լ�ѡ���ɫ����1.��Ѫ��  2.����  3.���ν�գ�");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		switch(n){
		case 1:
			this.name="��Ѫ��";
			System.out.println("��ѡ��Ľ�ɫ�ǣ���Ѫ��");
			break;
		case 2:
			this.setName("����");
			System.out.println("��ѡ��Ľ�ɫ�ǣ�����");
			break;
		case 3:
			this.setName("���ν��");
			System.out.println("��ѡ��Ľ�ɫ�ǣ����ν��");
			break;
		}
	}
	
	//��ȭ
	public int punch(){
		//System.out.println("���ȭ�� 1.����  2.ʯͷ  3.��");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		switch(n){
		case 1:
			System.out.println("���ȭ������");
			break;
		case 2:
			System.out.println("���ȭ��ʯͷ");
			break;
		case 3:
			System.out.println("���ȭ����");
			break;
		}
		return n;
	}

}
