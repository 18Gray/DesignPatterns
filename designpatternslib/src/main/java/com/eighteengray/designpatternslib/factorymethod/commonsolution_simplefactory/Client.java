package com.eighteengray.designpatternslib.factorymethod.commonsolution_simplefactory;

public class Client {
	public static void main(String[] args) {
		ExportOperate operate = new ExportOperate();
		operate.export(1, "要导出的测试数据");
	}
}
