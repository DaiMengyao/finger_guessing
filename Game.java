package finger_guessing;

import java.util.Scanner;

public class Game {
	/**甲方玩家*/
	String palyer1;
	/**乙方玩家*/
	String player2;
	/**对战次数*/
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
	 * 开始游戏
	 * @param player1
	 * @param player2
	 */
	public void startGame(){
		System.out.println("----------欢迎进入游戏世界----------------");
		System.out.println("	-------	猜拳	开始	------	");
		System.out.println("-------------------------------------");
		System.out.println("请为自己选择角色：1.吸血鬼 2.狼人 3.变形金刚");

		user.chooseActor();
		computer.chooseActor();
		System.out.println("要开始吗(y/n)");
		Scanner input = new Scanner(System.in);
		String s = input.next();
		while(s.equals("y")){
			System.out.println("请出拳： 1.剪刀  2.石头  3.布(输入相应数字)");
			int n1 = user.punch();
			int n2 = computer.punch();
			if(n1 == n2){
				System.out.println("平局");
			}
			if(n1 == 1 && n2==2){
				System.out.println(computer.getName()+"(电脑)你赢了");
				computer.setScore(computer.getScore() + 1);
			}
			if(n1 == 1 && n2==3){
				System.out.println(user.getName()+"用户你赢了");
				user.setScore(user.getScore() + 1);
			}
			if(n1 == 2 && n2==1){
				System.out.println(user.getName()+"用户你赢了");
				user.setScore(user.getScore() + 1);
			}
			if(n1 == 2 && n2==3){
				System.out.println(computer.getName()+"电脑你赢了");
				computer.setScore(computer.getScore() + 1);
		
		}
		count ++;
		System.out.println("是否继续游戏(y/n)");
		s = input.next();
		}
		
		
	}
	
	/**
	 * 计算结果
	 */
	public void culScore(){
		int s1 = user.getScore();
		int s2 = computer.getScore();
		if(s1 > s2){
			System.out.println(user.getName()+"胜");
		}
		if(s1 < s2){
			System.out.println(computer.getName()+"用户胜");
		}
		else{
			System.out.println("平局");
		}
	}
	
	/**
	 * 显示结果
	 */
	public void display(){
		System.out.println("------------------------------------");
		System.out.println("机器     "+computer.getName() + "VS        人"+user.getName());
		System.out.println("对战次数："+ count);
		culScore();
		
	}

}
