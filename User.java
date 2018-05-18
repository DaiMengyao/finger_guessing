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
	//选角色
	public void chooseActor(){
		
	//	System.out.println("请为自己选择角色：（1.吸血鬼  2.狼人  3.变形金刚）");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		switch(n){
		case 1:
			this.name="吸血鬼";
			System.out.println("我选择的角色是：吸血鬼");
			break;
		case 2:
			this.setName("狼人");
			System.out.println("我选择的角色是：狼人");
			break;
		case 3:
			this.setName("变形金刚");
			System.out.println("我选择的角色是：变形金刚");
			break;
		}
	}
	
	//出拳
	public int punch(){
		//System.out.println("请出拳： 1.剪刀  2.石头  3.布");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		switch(n){
		case 1:
			System.out.println("你出拳：剪刀");
			break;
		case 2:
			System.out.println("你出拳：石头");
			break;
		case 3:
			System.out.println("你出拳：布");
			break;
		}
		return n;
	}

}
