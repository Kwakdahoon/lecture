package webkdh.regnoex;

import java.util.Objects;

public class Korean {
	private String regNo;
	private String name;
	
	Korean(String regNo, String name) {
		this.regNo = regNo;
		this.name = name;
	}
	
	// 주민번호 regNo은 수정 불가
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegNo() {
		return regNo;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		
		// java.lang.ClassCastException: webkdh.regnoex.Student cannot be cast to webkdh.regnoex.Korean
		if (obj instanceof Korean) {
		Korean tmp = (Korean)obj;
		if(this.regNo.equals(tmp.regNo) && this.name.equals(tmp.name)) {
		}
		result = true;
		}		
		return result;
	}
	
	// 2단계 : equals() 오버라이딩 하더라도, 두 객체의 주소값이 다르다. 
	// -> hashCode() 메서드를 오버라이딩 해서 두 객체가 같은 해쉬코드 값을 반환하도록 하였다.
	
	@Override
	public int hashCode() {
		return (this.regNo + this.name).hashCode();
	}
	
	
// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ자동생성 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Korean other = (Korean) obj;
//		return Objects.equals(name, other.name) && Objects.equals(regNo, other.regNo);
//	}
//	
//	@Override
//	public int hashCode() {
//		return Objects.hash(name, regNo);
//	}
	
	@Override
	public String toString() {
		return "Korean [regNo=" + regNo + ", name=" + name + "]";
	}
}
