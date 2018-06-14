package com.eighteengray.designpatternslib.abstractfactory.patternsolution_expand;

/**
 * װ������һ��Intel ��CPU + ���ε�����
 * ���ﴴ��CPU����������ʱ���Ƕ�Ӧ�ģ���ƥ���ϵ�
 */
public class Schema1 implements AbstractFactory{
	public Object createProduct(int type) {
		Object retObj = null;
		//typeΪ1��ʾ����CPU��typeΪ2��ʾ��������
		if(type==1){
			retObj = new IntelCPU(1156);
		}else if(type==2){
			retObj = new GAMainboard(1156);
		}
		return retObj;
	}	
}