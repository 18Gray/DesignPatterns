package com.eighteengray.designpatternslib.prototype.commonsolution;
/**
 * ��������ҵ�����
 */
public class OrderBusiness {
	/**
	 * ���������ķ���
	 * @param order �����Ľӿڶ���
	 */
	public void saveOrder(OrderApi order){
		//����ҵ��Ҫ�󣬵�������Ԥ���Ĳ�Ʒ��������1000��ʱ�򣬾���Ҫ�Ѷ���������ݶ���
		//��Ȼ���Ҫ���ã������1000Ӧ�����ɳ�������ô����Ϊ����ʾ��
		
		//1���жϵ�ǰ��Ԥ����Ʒ�����Ƿ����1000
		while(order.getOrderProductNum() > 1000){
			//2��������ڣ�����Ҫ�������
			//2.1���½�һ�ݶ�����������Ķ�������������һ���⣬��������ͬ
			OrderApi newOrder = null;
			
			if(order instanceof PersonalOrder){
				//������Ӧ���µĶ�������
				PersonalOrder p2 = new PersonalOrder();
				//Ȼ����и�ֵ�����ǲ�Ʒ����Ϊ1000
				PersonalOrder p1 = (PersonalOrder)order;
				p2.setCustomerName(p1.getCustomerName());
				p2.setProductId(p1.getProductId());			
				p2.setOrderProductNum(1000);
				//Ȼ�������ø�newOrder
				newOrder = p2;
			}else if(order instanceof EnterpriseOrder){
				//������Ӧ�Ķ�������
				EnterpriseOrder e2 = new EnterpriseOrder();
				//Ȼ����и�ֵ�����ǲ�Ʒ����Ϊ1000
				EnterpriseOrder e1 = (EnterpriseOrder)order;
				e2.setEnterpriseName(e1.getEnterpriseName());
				e2.setProductId(e1.getProductId());
				e2.setOrderProductNum(1000);
				//Ȼ�������ø�newOrder
				newOrder = e2;
			}
			
			//2.2ԭ���Ķ������������������óɼ���1000
			order.setOrderProductNum(order.getOrderProductNum()-1000);
			
			//Ȼ����ҵ���ܴ���ʡ���ˣ���ӡ�������һ��
			System.out.println("������ɶ���=="+newOrder);
		}
		
		//3�����������Ǿ�ֱ��ҵ���ܴ���ʡ���ˣ���ӡ�������һ��
		System.out.println("����=="+order);
		
	}
	
//	public void saveOrder2(OrderApi order){
//		int oldNum = order.getOrderProductNum();
//		while(oldNum > 1000){
//			//����һ����ʾ����ֳ������¶�������
//			OrderApi newOrder = null;
//			
//			if(order instanceof PersonalOrder){
//				//������Ӧ�Ķ�������
//				PersonalOrder p2 = new PersonalOrder();
//				//Ȼ����и�ֵ�ȣ�ʡ����
//				//Ȼ�������ø�newOrder
//				newOrder = p2;
//			}else if(order instanceof EnterpriseOrder){
//				//������Ӧ�Ķ�������
//				EnterpriseOrder e2 = new EnterpriseOrder();
//				//Ȼ����и�ֵ�ȣ�ʡ����
//				//Ȼ�������ø�newOrder
//				newOrder = e2;
//			}			
//			//Ȼ����в�ֺ�����ҵ���ܴ���ʡ����
//		}		
//	}
}
