package com.eighteengray.designpatternslib.abstractfactory.patternsolution_expand;

/**
 * װ����������AMD��CPU + ΢�ǵ�����
 * ���ﴴ��CPU����������ʱ���Ƕ�Ӧ�ģ���ƥ���ϵ�
 */
public class Schema2 implements AbstractFactory{
	public Object createProduct(int type) {
		Object retObj = null;
		//typeΪ1��ʾ����CPU��typeΪ2��ʾ��������
		if(type==1){
			retObj = new AMDCPU(939);
		}else if(type==2){
			retObj = new MSIMainboard(939);
		}
		return retObj;
	}	
}