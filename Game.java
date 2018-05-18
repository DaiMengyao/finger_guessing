package finger_guessing;

import java.util.Scanner;

public class Game {
	/**�׷����*/
	String palyer1;
	/**�ҷ����*/
	String player2;
	/**��ս����*/
	 int count;
	
	public String getPalyer1() {
		return palyer1;
	}

	public void setPalyer1(String palyer1) {
		this.palyer1 = palyer1;
	}

	public String getPlayer2() {
		return player2;
	}

	public void setPlayer2(String player2) {
		this.player2 = player2;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	User user = new User();
	Computer computer = new Computer();
	/**
	 * ��ʼ��Ϸ
	 * @param player1
	 * @param player2
	 */
	public void startGame(){
		System.out.println("----------��ӭ������Ϸ����----------------");
		System.out.println("	-------	��ȭ	��ʼ	------	");
		System.out.println("-------------------------------------");
		System.out.println("��Ϊ�Լ�ѡ���ɫ��1.��Ѫ�� 2.���� 3.���ν��");

		user.chooseActor();
		computer.chooseActor();
		System.out.println("Ҫ��ʼ��(y/n)");
		Scanner input = new Scanner(System.in);
		String s = input.next();
		while(s.equals("y")){
			System.out.println("���ȭ�� 1.����  2.ʯͷ  3.��(������Ӧ����)");
			int n1 = user.punch();
			int n2 = computer.punch();
			if(n1 == n2){
				System.out.println("ƽ��");
			}
			if(n1 == 1 && n2==2){
				System.out.println(computer.getName()+"(����)��Ӯ��");
				computer.setScore(computer.getScore() + 1);
			}
			if(n1 == 1 && n2==3){
				System.out.println(user.getName()+"�û���Ӯ��");
				user.setScore(user.getScore() + 1);
			}
			if(n1 == 2 && n2==1){
				System.out.println(user.getName()+"�û���Ӯ��");
				user.setScore(user.getScore() + 1);
			}
			if(n1 == 2 && n2==3){
				System.out.println(computer.getName()+"������Ӯ��");
				computer.setScore(computer.getScore() + 1);
		
		}
		count ++;
		System.out.println("�Ƿ������Ϸ(y/n)");
		s = input.next();
		}
		
		
	}
	
	/**
	 * ������
	 */
	public void culScore(){
		int s1 = user.getScore();
		int s2 = computer.getScore();
		if(s1 > s2){
			System.out.println(user.getName()+"ʤ");
		}
		if(s1 < s2){
			System.out.println(computer.getName()+"�û�ʤ");
		}
		else{
			System.out.println("ƽ��");
		}
	}
	
	/**
	 * ��ʾ���
	 */
	public void display(){
		System.out.println("------------------------------------");
		System.out.println("����     "+computer.getName() + "VS        ��"+user.getName());
		System.out.println("��ս������"+ count);
		culScore();
		
	}

}
