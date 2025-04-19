package demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName="prototype")
public class Doctor implements Staff,BeanNameAware {
	private String qualification;
	
//	public Doctor(String qualification) {
//		super();
//		this.qualification = qualification;
//	}

	public void assist() {
		System.out.println("Doctor is assistng..... ");
	}
//Getters and Setters
	
	 public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	@Override
	public String toString() {
		return "Doctor [qualification=" + qualification + "]";
	}

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("set bean  name method called");
	}
	@PostConstruct
	public void postconstruct() {
		System.out.println("post constructed method is called");
	}

}
