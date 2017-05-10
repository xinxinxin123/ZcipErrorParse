package xin.zcipparse.mine;

public class StringTest {
	public static void main(String[] args) {
		String ss = "/home/dev/ZCIPClient/workpath/4499/code/web/web/java/code/bss/product/src/com/ztesoft/zsmart/bss/price/bll/PriceManager.java";
		
		String resultString = ss.replaceAll("/home/dev/ZCIPClient/workpath/4499/code/web/web/java", "");
		
		int i = ss.indexOf("com1");
		System.out.println(i);
	}
}
