package com.eighteengray.designpatternslib.abstractfactory.patternsolution_expand;
/**
 * ΢�ǵ�����
 */
public class MSIMainboard implements MainboardApi{
	/**
	 * CPU��۵Ŀ���
	 */
	private int cpuHoles = 0;
	/**
	 * ���췽��������CPU��۵Ŀ���
	 * @param cpuHoles CPU��۵Ŀ���
	 */
	public MSIMainboard(int cpuHoles){
		this.cpuHoles = cpuHoles;
	}
	public void installCPU() {
		System.out.println("now in MSIMainboard,cpuHoles="+cpuHoles);
	}
}
