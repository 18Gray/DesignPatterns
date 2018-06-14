package com.eighteengray.designpatternslib.mediator.patternsolution1;
/**
 * �����࣬ʵ���н��߽ӿ�
 */
public class MotherBoard implements Mediator{
	/**
	 * ��Ҫ֪��Ҫ������ͬ���ࡪ��������
	 */
	private CDDriver cdDriver = null;
	/**
	 * ��Ҫ֪��Ҫ������ͬ���ࡪ��CPU��
	 */
	private CPU cpu = null;
	/**
	 * ��Ҫ֪��Ҫ������ͬ���ࡪ���Կ���
	 */
	private VideoCard videoCard = null;
	/**
	 * ��Ҫ֪��Ҫ������ͬ���ࡪ��������
	 */
	private SoundCard soundCard = null;

	public void setCdDriver(CDDriver cdDriver) {
		this.cdDriver = cdDriver;
	}
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
	public void setVideoCard(VideoCard videoCard) {
		this.videoCard = videoCard;
	}
	public void setSoundCard(SoundCard soundCard) {
		this.soundCard = soundCard;
	}
	
	public void changed(Colleague colleague) {
		if(colleague == cdDriver){
			//��ʾ������ȡ������
			this.opeCDDriverReadData((CDDriver)colleague);
		}else if(colleague == cpu){
			//��ʾCPU��������
			this.opeCPU((CPU)colleague);
		}
	}
	/**
	 * ���������ȡ���ݹ�������������Ľ���
	 * @param cd ����ͬ�¶���
	 */
	private void opeCDDriverReadData(CDDriver cd){
		//1���Ȼ�ȡ������ȡ������
		String data = cd.getData();
		//2������Щ���ݴ��ݸ�CPU���д���
		this.cpu.executeData(data);
	}
	/**
	 * ����CPU���������ݺ�����������Ľ���
	 * @param cpu CPUͬ����
	 */
	private void opeCPU(CPU cpu){
		//1���Ȼ�ȡCPU������������
		String videoData = cpu.getVideoData();
		String soundData = cpu.getSoundData();
		//2������Щ���ݴ��ݸ��Կ�������չʾ����
		this.videoCard.showData(videoData);
		this.soundCard.soundData(soundData);
	}
	
}
