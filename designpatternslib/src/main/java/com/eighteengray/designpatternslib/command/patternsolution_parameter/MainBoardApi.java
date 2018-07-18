package com.eighteengray.designpatternslib.command.patternsolution_parameter;
/**
 * 主板的接口
 */
public interface MainBoardApi {
	/**
	 * 主板具有能开机的功能
	 */
	public void open();
	/**
	 * 主板具有实现重启的功能
	 */
	public void reset();
}