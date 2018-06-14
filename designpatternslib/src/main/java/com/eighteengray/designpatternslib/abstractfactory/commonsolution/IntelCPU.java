package com.eighteengray.designpatternslib.abstractfactory.commonsolution;
/**
 *Intel��CPUʵ��
 */
public class IntelCPU implements CPUApi{
	/**
	 * CPU�������Ŀ
	 */
	private int pins = 0;
	/**
	 * ���췽��������CPU�������Ŀ
	 * @param pins CPU�������Ŀ
	 */
	public IntelCPU(int pins){
		this.pins = pins;
	}
	
	public void calculate() {
		System.out.println("now in Intel CPU,pins="+pins);
	}
}
