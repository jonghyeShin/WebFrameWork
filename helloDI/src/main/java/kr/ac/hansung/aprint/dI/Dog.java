package kr.ac.hansung.aprint.dI;

public class Dog implements AnimalType {

	private String myName;
	
	public void setMyName(String myName) { //DI를 사용함.
		this.myName = myName;
	}
	public void sound() {
		System.out.println("Dog name =" + myName + ":" + "Bow Wow");
	}
}
