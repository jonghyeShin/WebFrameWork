package kr.ac.hansung.aprint.dI;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//1. 생성자를 이용해서 DI 수행
//2. annotation을 이용해서 DI 수행
//3. resource
public class PetOwner {
	
	//@Autowired	//wiring by type
	//@Qualifier(value = "qf_cat")
	@Resource(name="cat") 		//wiring by name
	
	private AnimalType animal;

//	public PetOwner(AnimalType animal) {
//		this.animal = animal;
//	}
	
	public void play(){
		animal.sound();
	}
}
