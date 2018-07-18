package com.eighteengray.designpatternslib.command.patternsolution_parameter;
/**
 * 技嘉主板类，命令的真正实现者，在Command模式中充当Receiver
 */
public class GigaMainBoard implements MainBoardApi{
	/**
	 * 真正的开机命令的实现
	 */
	public void open(){
		System.out.println("技嘉主板现在正在开机，请等候");
		System.out.println("接通电源......");
		System.out.println("设备检查......");
		System.out.println("装载系统......");
		System.out.println("机器正常运转起来......");
		System.out.println("机器已经正常打开，请操作");
	}
	/**
	 * 真正的重新启动机器命令的实现
	 */
	public void reset(){
		System.out.println("技嘉主板现在正在重新启动机器，请等候");
		System.out.println("机器已经正常打开，请操作");
	}
}