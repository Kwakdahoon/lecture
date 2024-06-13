function getParameter(paraName) {
    // 쿼리스트링에서 파라미터 값 반환
    let returnVal = null;
    let url = location.href
    
        if (url.indexOf("?") !== -1) {
            // 쿼리스트링 있는 경우
            let quertString = url.split("?")[1];
            let quertStringArr = quertString.split("&");

            for (let item of quertStringArr) {
                if (item.split("=")[0] == paraName) {
                    returnVal = item.split("=")[1];
                    break; // 파라미터 값을 찾으면 해당 반복문블럭을 빠져나감
                }
            }
        }
        return returnVal;
    }
    
    
    
    // 쿠키 관련 함수
function readCookie(searchName){
    // searchName 이름의 쿠키를 찾아서,
    // 있으면 값 반환하고
    // 없으면 null을 반환한다
    // alert("쿠키 찾아보자");
    let returnVal = null;
    let cook = document.cookie;
    console.log(cook); // myCook=kdh; notice=Y
    console.log(cook === ""); // ture : 쿠키가 없는 경우 (쿠키들어가서 삭제해야됨) : ""
    let cookArr = cook.split(";");

    for (let i = 0; i < cookArr.length; i++) {
        let cookName = cookArr[i].split("=")[0].trim();
        if (cookName == searchName) {
            // 쿠키를 찾았다
            returnVal = cookArr[i].split("=")[1].trim();
        }
    }   
    return returnVal;
}

function saveCookie(cookieName, cookieValue, expDate) {
    // alert("쿠키 저장 함수 호출")
    // alert("쿠키인수" + cookieName +";"+ cookieValue+";" + expDate)
    let now = new Date();
    now.setDate(now.getDate() + expDate);

    let tmpCookie = cookieName + "=" + cookieValue + ";expires=" + now.toUTCString();

    // 쿠키 저장
    document.cookie = tmpCookie;
}