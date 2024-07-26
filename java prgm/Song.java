class Song{


public static void main(String[] args){

String song1 = "Ninu Eruvaga";
String song2 = "Yenendu Hesaridali";
String song3 = "Nee Nenedare";
String song4 = "Ondonde";
String song5 = "Ille Ile Ello";
String song6 = "Geleya Beku";
String song7 = "No Filter";
String song8 = "Laila Main Laila";
String song9 = "Dhava Dhava";
String song10 = "Mathu Nannolu";

String[] songs = {song1,song2,song3,song4,song5,song6,song7,song8,song9,song10};

for(int name=9;name>=0;name--)
{
	
String ref = songs[name];
System.out.println("The songs name are :"+ref);
}

}
}