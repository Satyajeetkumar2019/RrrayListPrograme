import java.util.ArrayList;
class CollectionArrayList {

	public static void main(String[] args) {
	//create the array list in thie class below here 
	ArrayList ar =new ArrayList();
	System.out.println(ar.size());
	//Add element to the arrayList here 
	ar.add("satya");
	System.out.println(ar.size());
	ar.add("sum");
ar.add("many ");
ar.add("gum");
ar.add("manoj ");
ar.add("sbu");
System.out.println(ar.size());
//add the array list below 
System.out.println(ar);
//remove the 4 element of the 
ar.remove(4);
System.out.println("after the remove element: ");
System.out.println(ar);
//Remove manoj of the element of the this arraylist below 
ar.remove("manoj");
System.out.println("after the remove element here below :");
System.out.println(ar);
//retriving the first element below 
String element=(String)(ar.get(2));
System.out.println("retrive element 1");
System.out.println(element);
//insert at second element of the arraylist
ar.add(2,element+"rose");
System.out.println(ar);


		System.out.println("Hello World!");
	}//end of the main method 
}//end of the class
