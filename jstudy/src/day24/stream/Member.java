package day24.stream;

import java.io.Serializable;

public class Member implements Serializable{ // 직렬화 가능한 클래스는 Serializable 인터페이스를 구현한 클래스
	private int age;
	private String name, mail, tel;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
