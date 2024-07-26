class BusNo{

public static void main(String[] args){

String no1 = "KA38 F940";
String no2 = "KA39 f4606";
String no3 = "KA40 F899";
String no4 = "KA41 F663";
String no5 = "KA42 F1234";

String[] nos = {no5,no4,no3,no2,no1};

for(int name=nos.length-1; name>=0;name++)
{
	String ref = nos[name];
	System.out.println("The bus no is given as :"+ref);
}

}
}