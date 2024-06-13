function getParameter(paraName) {
    // 쿼리스트링에서 파라미터 값 반환
    let returnVal = null;
    let url = location.href;
  
    if (url.indexOf("?") !== -1) {
      // 쿼리 스트링이 있는 경우
      let queryString = url.split("?")[1];
      let queryStringArr = queryString.split("&");
  
      for (let item of queryStringArr) {
        if (item.split("=")[0] == paraName) {
          returnVal = item.split("=")[1];
          break; // 파라미터 값을 찾으면 해당 반복문블럭을 빠져감
        }
      }
    }
  
    return returnVal;
  }
  
  // 쿠키 관련 함수
  function readCookie(searchName) {
    // searchName 이름의 쿠키를 찾아서,
    // 있으면 쿠키 값을 반환하고
    // 없으면 null 반환한다.
  
    //   alert("쿠키 찾아보자");
    let returnVal = null;
    let cook = document.cookie;
    console.log(cook); // myCook=ksy; notice=Y
    console.log(cook === ""); // true : 쿠키가 없는 경우 : ""
    let cookArr = cook.split(";");
  
    for (let i = 0; i < cookArr.length; i++) {
      let cookName = cookArr[i].split("=")[0];
      if (cookName.trim() == searchName) {
        // 쿠키를 찾았다!
        returnVal = cookArr[i].split("=")[1];
      }
    }
  
    return returnVal;
  }
  
  function saveCookie(cookieName, cookieValue, expDate) {
    //   alert("쿠키 저장함수 호출");
    //   alert("쿠키인수" + cookieName + "; " + cookieValue + "; " + expDate);
    let now = new Date();
    now.setDate(now.getDate() + expDate);
  
    let tmpCookie = cookieName + "=" + cookieValue + ";expires=" + now.toUTCString();
  
    // 쿠키 저장
    document.cookie = tmpCookie;
  }
  