package finger_guessing;

import java.util.Scanner;

public class Computer {
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
			//Computer computer = new Computer();
		//	���ѡ���ɫ
			int n = (int)(Math.random()*(3-1+1)+1);
			switch(n){
			case 1:
				//computer.setName("��Ѫ��");
				this.name = "��Ѫ��";
				System.out.println("��������ѡ��Ľ�ɫ�ǣ���Ѫ��");
				break;
			case 2:
				this.name = "����";
				System.out.println("��������ѡ��Ľ�ɫ�ǣ�����");
				break;
			case 3:
				this.name = "���ν��";
				System.out.println("��������ѡ��Ľ�ɫ�ǣ����ν��");
				break;
			}
		}
		
		//��ȭ
		public int punch(){
			//�����ȭ
			int n = (int)(Math.random()*(3-1+1)+1);
			switch(n){
			case 1:
				System.out.println("���Գ�ȭ������");
				break;
			case 2:
				System.out.println("���Գ�ȭ��ʯͷ");
				break;
			case 3:
				System.out.println("���Գ�ȭ����");
				break;
			}
			return n;
		}
	
}
