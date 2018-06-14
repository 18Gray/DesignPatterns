package com.eighteengray.designpatternslib.abstractfactory.commonsolution;

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
	 * װ������
	 * @param cpuType �ͻ�ѡ������CPU������
	 * @param mainboardType �ͻ�ѡ���������������
	 */
	public void makeComputer(int cpuType,int mainboardType){
		//1������׼����װ������Ҫ�����
		prepareHardwares(cpuType,mainboardType);
		//2����װ����
		
		//3�����Ի���
		
		//4�������ͻ�
	}
	/**
	 * ׼��װ������Ҫ�����
	 * @param cpuType �ͻ�ѡ������CPU������
	 * @param mainboardType �ͻ�ѡ���������������
	 */
	private void prepareHardwares(int cpuType,int mainboardType){
		//����Ҫȥ׼��CPU������ľ���ʵ�֣�Ϊ��ʾ���򵥣�����ֻ׼��������
		//���ǣ�װ������ʦ����֪�����ȥ��������ô���أ�
		
		//ֱ������Ӧ�Ĺ�����ȡ
		this.cpu = CPUFactory.createCPUApi(cpuType);
		this.mainboard = MainboardFactory.createMainboardApi(mainboardType);
		
		//����һ������Ƿ����
		this.cpu.calculate();
		this.mainboard.installCPU();
	}
}
