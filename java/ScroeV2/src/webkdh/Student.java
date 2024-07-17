package webkdh;

public class Student { // 1
    // 멤버 변수
    // 학번 이름 국어, 영어, 수학 총점 학점
    private String stuNo;
    private String name;
    private int ko;
    private int eg;
    private int math;
    private int tot;
    private double avg;
    private char grade;

    private static int totalTot; // 전체 학생의 총점

    // 생성자
    public Student(String stuNo, String name, int ko, int eg, int math) { // 2
        this.stuNo = stuNo;
        this.name = name;
        this.ko = ko;
        this.eg = eg;
        this.math = math;
        setTot();  // 총점 계산
        setAvg();  // 평균 계산
        setGrade(); // 학점 계산
        totalTot += this.tot;
    }

    // getter, setter
    // 3
//	public int getTotalTot() {		
//	return totalTot;
//  }
    public static int getTotalTot() {		
        return totalTot;
    }

    public String getStuNo() {  
        return this.stuNo;
    }

    public String getName() {
        return this.name;
    }

    public int getKo() {
        return this.ko;
    }

    public int getEg() {
        return this.eg;
    }

    public int getMath() {
        return this.math;
    }

    public int getTot() {
        return this.tot;
    }

    public char getGrade() {
        return this.grade;
    }

    public void setKo(int ko) {
        totalTot -= this.tot; // 기존 총점을 빼고
        this.ko = ko;
        setTot(); // 총점 다시 계산
        setAvg(); // 평균 다시 계산
        setGrade(); // 학점 다시 계산
        totalTot += this.tot; // 새로운 총점을 더함
    }

    public void setEg(int eg) {
        totalTot -= this.tot; // 기존 총점을 빼고
        this.eg = eg;
        setTot(); // 총점 다시 계산
        setAvg(); // 평균 다시 계산
        setGrade(); // 학점 다시 계산
        totalTot += this.tot; // 새로운 총점을 더함
    }

    public void setMath(int math) {
        totalTot -= this.tot; // 기존 총점을 빼고
        this.math = math;
        setTot(); // 총점 다시 계산
        setAvg(); // 평균 다시 계산
        setGrade(); // 학점 다시 계산
        totalTot += this.tot; // 새로운 총점을 더함
    }

    public void setTot() {
        this.tot = this.ko + this.eg + this.math;
    }

    public void setAvg() {
        this.avg = (double) this.tot / 3;
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

    // 메서드 
    public void displayScore() {
        System.out.println("학번: " + this.stuNo 
                + ", 학생 이름: " + this.name 
                + ", 국어 점수: " + this.ko 
                + ", 영어 점수: " + this.eg 
                + ", 수학 점수: " + this.math 
                + ", 점수 총합: " + this.tot 
                + ", 평균: " + this.avg 
                + ", 학점: " + this.grade);
    }
}