package com.eighteengray.designpatternslib.command.patternsolution1;

public class Client {
	public static void main(String[] args) {
		//1：把命令和真正的实现组合起来，相当于在组装机器，
		//把机箱上按钮的连接线插接到主板上。
		MainBoardApi mainBoard = new MsiMainBoard();
		OpenCommand openCommand = new OpenCommand(mainBoard);
		
		
		//真正的客户端测试
		
		//2：为机箱上的按钮设置对应的命令，让按钮知道该干什么
		Box box = new Box();
		box.setOpenCommand(openCommand);
		
		//3：然后模拟按下机箱上的按钮
		box.openButtonPressed();
	}
}