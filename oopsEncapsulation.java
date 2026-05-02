package Jan_Batch_2026;
//class Meesho{
//	private String userName;
//	private int userId;
//	
//	void setData(String name,int id) {
//		userName = name;
//		userId = id;
//	}
//	String getName() {
//		return userName;
//	}
//	int getId() {
//		return userId;
//	}
//}
class College{
	public College(){
		System.out.println("hi from parent");
	}
	private String admNo;
	private int fees;
	String name;
	String dpmt;
	
	public College(String admNo,int fees,String name,String dpmt) {
		this();
		this.admNo = admNo;
		this.fees=fees;
		this.name = name;
		this.dpmt=dpmt;	
	}
	String getadmNo() {
		return admNo;
	}
	int getFees() {
		return fees;
	}
}
public class OopsEncapsulation {

	public static void main(String[] args) {
		College c = new College("21AI032", 55000, "Mounika", "AI&DS");
		System.out.println(c.getadmNo());
		
		
		
		
//		Meesho m = new Meesho();
//		m.setData("Mounika", 12);
//		System.out.println(m.getName());
//		System.out.println(m.getId());
	}
	

}
