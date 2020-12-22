package main.component.button;

public enum MenuBtnEnum {
	
	ORDER("주문", "order.view.OrderView"),
	ORDERLIST("대기주문확인", "orderlist.view.OrderListView"),
	STOCK("재고관리", "stock.view.Stockview"),
	EMPLOYEE("직원관리", "employee.view.EmployeeView"),
	STORE("매장정보관리", "store.view.StoreView"),
	NOW_STORE("현재매장정보", "main.frame.NowStoreInfoFrame");
	
	public String btnName;
	public String classpath;
	
	private MenuBtnEnum(String btnName, String classpath) {
		this.btnName = btnName;
		this.classpath = classpath;
	
	}
}
