package com.eighteengray.designpatternslib.abstractfactory.patternsolution_expand;
/**
 * ���ε����� 
 */
public class GAMainboard implements MainboardApi {
	/**
	 * CPU��۵Ŀ���
	 */
	private int cpuHoles = 0;
	/**
	 * ���췽��������CPU��۵Ŀ���
	 * @param cpuHoles CPU��۵Ŀ���
	 */
	public GAMainboard(int cpuHoles){
		this.cpuHoles = cpuHoles;
	}
	public void installCPU() {
		System.out.println("now in GAMainboard,cpuHoles="+cpuHoles);
	}
}
