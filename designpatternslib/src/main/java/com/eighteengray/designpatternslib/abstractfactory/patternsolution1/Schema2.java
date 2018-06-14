package com.eighteengray.designpatternslib.abstractfactory.patternsolution1;

/**
 * װ����������AMD��CPU + ΢�ǵ�����
 * ���ﴴ��CPU����������ʱ���Ƕ�Ӧ�ģ���ƥ���ϵ�
 */
public class Schema2 implements AbstractFactory{
	public CPUApi createCPUApi() {
		return new AMDCPU(939);
	}
	public MainboardApi createMainboardApi() {
		return new MSIMainboard(939);
	}	
}