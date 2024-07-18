package webkdh;

public class Student {
   // 멤버 변수
   private String stuNo;
   private String stuName;
   private int kor;
   private int eng;
   private int math;
   private int tot;
   private float avg;
   private char grade;
   
   
   // 생성자
   public Student(String stuNo, String stuName, int kor, int eng, int math) {
      this.stuNo = stuNo;
      this.stuName = stuName;
      this.kor = kor;
      this.eng = eng;
      this.math = math;
      calScores();
//      setTot();
//      setAvg();
//      setGrade();
      
   }

public void calScores() {
	this.tot = this.kor + this.eng + this.math;
      this.avg = (float)this.tot / 3;
      switch ((int)(Math.floor(this.avg / 10d))) {
      case 10:
      case 9:
         this.grade = 'A';
         break;
      case 8:
         this.grade = 'B';
         break;
      case 7:
         this.grade = 'C';
         break;
      case 6:
         this.grade = 'D';
         break;
      default:
         this.grade = 'F';
         break;
      }
}
   
   // getter, setter
   
   
   public void setKor(int kor) {
      this.kor = kor;
      setTot(); // 총점 다시 계산
      setAvg(); // 평균 다시 계산
      setGrade(); // 학점 다시 계산
      
   }
   public String getStuNo() {
	return stuNo;
}

public String getStuName() {
	return stuName;
}

public int getKor() {
	return kor;
}

public int getEng() {
	return eng;
}

public int getMath() {
	return math;
}

public int getTot() {
	return tot;
}

public float getAvg() {
	return avg;
}

public char getGrade() {
	return grade;
}

public void setEng(int eng) {
      this.eng = eng;
      setTot(); // 총점 다시 계산
      setAvg(); // 평균 다시 계산
      setGrade(); // 학점 다시 계산
      
   }
   public void setMath(int math) {
      this.math = math;
      setTot(); // 총점 다시 계산
      setAvg(); // 평균 다시 계산
      setGrade(); // 학점 다시 계산
   }
   
//   public void setTot(int tot) {
//      this.tot = tot;
//   }
   
   public void setTot() {
      this.tot = this.kor + this.eng + this.math;
   }
   
   public void setAvg() {
      this.avg = (float)this.tot / 3;
   }
   
   public void setGrade() {
      switch ((int)(Math.floor(this.avg / 10d))) {
      case 10:
      case 9:
         this.grade = 'A';
         break;
      case 8:
         this.grade = 'B';
         break;
      case 7:
         this.grade = 'C';
         break;
      case 6:
         this.grade = 'D';
         break;
      default:
         this.grade = 'F';
         break;
      }
   }
   @Override
public String toString() {
	return "Student [학번=" + stuNo + ", 이름=" + stuName + ", 국어=" + kor + ", 영어=" + eng + ", 수학=" + math
			+ ", 총점=" + tot + ", 평균=" + avg + ", 학점=" + grade + "]";
}

// 메서드
   public void displayScore() {
      System.out.println("학번 : " + this.stuNo + 
            ", 이름 : " + this.stuName +
            ", 국어 : " + this.kor +
            ", 영어 : " + this.eng + 
            ", 수학 : " + this.math +
            ", 총점 : " + this.tot +
            ", 평균 : " + this.avg + 
            ", 학점 : " + this.grade);
   }
   
}
