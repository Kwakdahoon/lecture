document.addEventListener('DOMContentLoaded', () => {
    const numStudents = 5; // 학생 수
    const studentContainer = document.getElementById('students'); // 학생 입력 필드가 추가될 컨테이너

    // 학생 수 만큼 입력 필드 생성
    for (let i = 1; i <= numStudents; i++) {
        const studentDiv = document.createElement('div');
        studentDiv.className = 'student'; // 학생 입력 필드 그룹

        // 학생 입력 필드 HTML 생성
        studentDiv.innerHTML = `
            <h3>학생 ${i}</h3>
            <label>이름: <input type="text" id="name${i}" required></label>
            <label>국어: <input type="number" id="kor${i}" required></label>
            <label>영어: <input type="number" id="eng${i}" required></label>
            <label>수학: <input type="number" id="math${i}" required></label>
        `;

        // 컨테이너에 학생 입력 필드 추가
        studentContainer.appendChild(studentDiv);
    }
});

// 평균 점수를 기반으로 학점을 계산하는 함수
function getGrade(average) {
    if (average === 100) return 'S'; // 100점이면 S 학점
    if (average >= 90) return 'A'; // 90점 이상이면 A 학점
    if (average >= 80) return 'B'; // 80점 이상이면 B 학점
    if (average >= 70) return 'C'; // 70점 이상이면 C 학점
    if (average >= 60) return 'D'; // 60점 이상이면 D 학점
    return 'F'; // 나머지는 F 학점
}

// 성적을 처리하고 결과를 테이블에 출력하는 함수
function processScores() {
    const numStudents = 5; // 학생 수
    const resultTableBody = document.getElementById('resultTable').getElementsByTagName('tbody')[0];
    resultTableBody.innerHTML = ''; // 이전 결과 초기화

    // 각 학생의 점수를 처리
    for (let i = 1; i <= numStudents; i++) {
        const name = document.getElementById(`name${i}`).value; // 학생 이름
        const kor = parseInt(document.getElementById(`kor${i}`).value); // 국어 점수
        const eng = parseInt(document.getElementById(`eng${i}`).value); // 영어 점수
        const math = parseInt(document.getElementById(`math${i}`).value); // 수학 점수
        const total = kor + eng + math; // 총점
        const average = (total / 3).toFixed(2); // 평균 (소수점 둘째 자리까지)
        const grade = getGrade(average); // 학점 계산

        // 결과 테이블에 새로운 행 생성
        const row = document.createElement('tr');
        row.innerHTML = `
            <td>${name}</td>
            <td>${kor}</td>
            <td>${eng}</td>
            <td>${math}</td>
            <td>${total}</td>
            <td>${average}</td>
            <td>${grade}</td>
        `;

        // 결과 테이블에 행 추가
        resultTableBody.appendChild(row);
    }
}
function searchStudent() {
    const searchName = document.getElementById('searchName').value.toLowerCase(); // 검색할 학생 이름
    const rows = document.getElementById('resultTable').getElementsByTagName('tbody')[0].getElementsByTagName('tr'); // 결과 테이블의 행들

    // 13. 각 행을 순회하면서 검색어와 일치하는지 확인
    for (let row of rows) {
        const studentName = row.getElementsByTagName('td')[0].textContent.toLowerCase(); // 학생 이름 (소문자로 변환)

        // 14. 이름이 일치하면 해당 행을 표시, 그렇지 않으면 숨김
        if (studentName.includes(searchName)) {
            row.style.display = ''; // 일치하면 행 표시
        } else {
            row.style.display = 'none'; // 일치하지 않으면 행 숨김
        }
    }
}