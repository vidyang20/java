class State{


public static void main(String[] args){
	
String state1 = "Andhra Pradesh";
String state2 = "Arunachal Pradesh";
String state3 = "Assam";
String state4 = "Bihar";
String state5 = "Chhattisgarh";
String state6 = "Goa";
String state7 = "Gujarat";
String state8 = "Haryana";
String state9 = "Himachal Pradesh";
String state10 = "Jharkhand";
String state11 = "Karnataka";
String state12 = "Kerala";
String state13 = "Madhya Pradesh";
String state14 = "Maharashtra";
String state15 = "Manipur";
String state16 = "Meghalaya";
String state17 = "Mizoram";
String state18 = "Nagaland";
String state19 = "Odisha";
String state20= "Punjab";
String state21 = "Rajasthan";
String state22 = "Sikkim";
String state23= "Tamil Nadu";
String state24 = "Telangana";
String state25 = "Tripura";
String state26 = "Uttar Pradesh";
String state27= "Uttarakhand";
String state28= "West Bengal";

String[] states = {state1,state2,state3,state4,state5,state6,state7,state8,state9,state10};

for(int name =states.length-1;name>=0;name--)
{
	String ref = states[name];
	System.out.println("The name of state is :"+ref);
}

}
}