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
	
	//选角色
		public void chooseActor(){
			//Computer computer = new Computer();
		//	随机选择角色
			int n = (int)(Math.random()*(3-1+1)+1);
			switch(n){
			case 1:
				//computer.setName("吸血鬼");
				this.name = "吸血鬼";
				System.out.println("计算机随机选择的角色是：吸血鬼");
				break;
			case 2:
				this.name = "狼人";
				System.out.println("计算机随机选择的角色是：狼人");
				break;
			case 3:
				this.name = "变形金刚";
				System.out.println("计算机随机选择的角色是：变形金刚");
				break;
			}
		}
		
		//出拳
		public int punch(){
			//随机出拳
			int n = (int)(Math.random()*(3-1+1)+1);
			switch(n){
			case 1:
				System.out.println("电脑出拳：剪刀");
				break;
			case 2:
				System.out.println("电脑出拳：石头");
				break;
			case 3:
				System.out.println("电脑出拳：布");
				break;
			}
			return n;
		}
	
}
