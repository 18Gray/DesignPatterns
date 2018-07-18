package com.eighteengray.designpatternslib.chainOfResponsibility.example4;

public class DepManager extends Handler{

	
	public String handleFeeRequest(String user, double fee) {
		String str = "";
		//部门经理的权限只能在1000以内
		if(fee < 1000){
			//为了测试，简单点，只同意小李申请的
			if("小李".equals(user)){
				str = "部门经理同意"+user+"聚餐费用"+fee+"元的请求";
			}else{
				//其他人一律不同意
				str = "部门经理不同意"+user+"聚餐费用"+fee+"元的请求";
			}
			return str;
		}else{
			//超过1000，继续传递给级别更高的人处理
			if(this.successor!=null){
				return this.successor.handleFeeRequest(user, fee);
			}
		}
		return str;
	}
	
	public boolean handlePreFeeRequest(String user, double requestNum) {
		//部门经理的权限比较小，只能在20000以内
		if(requestNum < 20000){
			//工作需要嘛，统统同意
			System.out.println("部门经理同意"+user+"预支差旅费用"+requestNum+"元的请求");
			return true;
		}else{
			//超过20000，继续传递给级别更高的人处理
			if(this.successor!=null){
				return this.successor.handlePreFeeRequest(user, requestNum);
			}
		}
		return false;
	}
}
