package com.eighteengray.designpatternslib.state.example8;

import java.util.Scanner;

/**
 * 处理部门经理的审核，处理后对应审核结束状态
 */
public class DepManagerState implements LeaveRequestState{
	public void doWork(StateMachine request) {
		//先把业务对象造型回来
		LeaveRequestModel lrm = (LeaveRequestModel)request.getBusinessVO();
		System.out.println("部门经理审核中，请稍候......");
		
		//模拟用户处理界面，通过控制台来读取数据
		System.out.println(lrm.getUser()+"申请从"+lrm.getBeginDate()+
		"开始请假"+lrm.getLeaveDays()+"天,请部门经理审核(1为同意，2为不同意)：");
		//读取从控制台输入的数据
		Scanner scanner = new Scanner(System.in);
		if(scanner.hasNext()){
			int a = scanner.nextInt();
			//设置回到上下文中
			String result = "不同意";
			if(a==1){
				result = "同意";
			}
			lrm.setResult("部门经理审核结果："+result);
			//部门经理审核过后，直接转向审核结束状态了
			request.setState(new AuditOverState());
			//继续执行下一步工作
			request.doWork();
		}		
	}
}
