function getParameter(paramName) {
    // 쿼리스트링에서 파라미터 값 반환
    let returnVal = null;
    let url = location.href;
  
    if (url.indexOf("?") !== -1) {
      // 쿼리 스트링이 있는 경우
      let queryString = url.split("?")[1];
      let queryStringArr = queryString.split("&");
  
      for (let item of queryStringArr) {
        if (item.split("=")[0] == paramName) {
          returnVal = item.split("=")[1];
          break; // 파라미터 값을 찾으면 해당 반복문블럭을 빠져감
        }
      }
    }
    return returnVal;
}