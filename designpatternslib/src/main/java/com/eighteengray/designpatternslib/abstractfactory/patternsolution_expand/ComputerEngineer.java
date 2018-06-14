package com.eighteengray.designpatternslib.abstractfactory.patternsolution_expand;

/**
 * װ������ʦ����
 */
public  class ComputerEngineer {
	/**
	 * ������װ������Ҫ��CPU
	 */
	private CPUApi cpu= null;
	/**
	 * ������װ������Ҫ������
	 */
	private MainboardApi mainboard = null;
	/**
	 * ������װ������Ҫ���ڴ�
	 */
	private MemoryApi memory = null;

	/**
	 * װ������
	 * @param schema �ͻ�ѡ���װ������
	 */
	public void makeComputer(AbstractFactory schema){
		//1������׼����װ������Ҫ�����
		prepareHardwares(schema);
		//2����װ����
		
		//3�����Ի���
		
		//4�������ͻ�
	}
	/**
	 * ׼��װ������Ҫ�����
	 * @param schema �ͻ�ѡ���װ������
	 */
	private void prepareHardwares(AbstractFactory schema){
		//����Ҫȥ׼��CPU������ľ���ʵ�֣�Ϊ��ʾ���򵥣�����ֻ׼��������
		//���ǣ�װ������ʦ����֪�����ȥ��������ô���أ�
		
		//ʹ�ó��󹤳�����ȡ��Ӧ�Ľӿڶ���
		this.cpu = (CPUApi)schema.createProduct(1);
		this.mainboard = (MainboardApi)schema.createProduct(2);
		this.memory = (MemoryApi)schema.createProduct(3);
		
		//����һ������Ƿ����
		this.cpu.calculate();
		this.mainboard.installCPU();
		if(memory!=null){
			this.memory.cacheData();
		}
	}
}
