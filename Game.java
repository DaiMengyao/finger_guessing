package finger_guessing;

import java.util.Scanner;

public class Game {
	/**�׷����*/
	//String palyer1;
	private User user;
	/**�ҷ����*/
	//String player2;'
	private Computer computer;
	
	/**��ս����*/
	 int count;
	
	 
	 Game(){
		 user = new User();
		 computer = new Computer();
	 }


	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Computer getComputer() {
		return computer;
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}


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
		//ѡ��ɫ
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
				System.out.println(computer.getName()+"(����)Ӯ��");
				computer.setScore(computer.getScore() + 1);
			}
			if(n1 == 1 && n2==3){
				System.out.println(user.getName()+"(�û�)Ӯ��");
				user.setScore(user.getScore() + 1);
			}
			if(n1 == 2 && n2==1){
				System.out.println(user.getName()+"(�û�)Ӯ��");
				user.setScore(user.getScore() + 1);
			}
			if(n1 == 2 && n2==3){
				System.out.println(computer.getName()+"(����)Ӯ��");
				computer.setScore(computer.getScore() + 1);
		
		}
		//��������
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
		if( s1 == s2){
			System.out.println("ƽ��");
		}
	}
	
	/**
	 * չʾ�ܽ��
	 */
	public void display(){
		System.out.println("------------------------------------");
		System.out.println("����     "+computer.getName() + "VS        ��"+user.getName());
		System.out.println("��ս������"+ count);
		culScore();
		
	}

}
