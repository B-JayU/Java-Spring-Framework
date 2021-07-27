- 정적페이지 구현을 제외하고는 크게 2가지 방법의 기술이 존재한다.
  1. MVC 방식에 뷰를 찾아서 템플릿 엔진을 통하여 화면을 렌더링해서 html을 웹 브라우저에 넘겨주는 방식
  2. API 방식(데이터를 바로 내리기)
      - @ResponseBody 문자 반환
      - 별도의 뷰 페이지가 존재하지 않음.
      - 결과는 동일할 수 있으나, 소스 코드 보기 사용시, html 태그가 보이지 않는다
    
      - API 방식을 사용하는 이유는... param를 이용하여 model을 set하고 get하는데 활용할 수 있음.
      - json 방식의 데이터 구조로 출력하게 됨. -> json 방식으로 통일됨.
      - HTML 태그를 볼 수 없음.(소스코드 보기 시)
      - simple
      
## @ResponseBody 사용 원리
1. 웹 브라우저를 통해 "localhost:8080/hello-api"에 접근
2. 내장 톰캣 서버에서 controller에 접근
3. "hello-api" annotation이 존재하는 가 확인
4. 존재한다고 했을 때, hello-api에 추가 annotation이 붙어있음(@ResponseBody)
5. ResponseBody는 http 프로토콜의 body 부분의 내용을 의미한다. 
    - 절대로 html의 body 또는 태그 내 content(body)를 의미하는 것이 아니다. 
6. 문자열 또는 객체를 리턴할 수 있다.
7. 문자열의 경우, viewResolver를 별도로 두지 않고 문자열을 출력해서 웹 브라우저에서 보여줌
    - HttpMessageConvert내의 StringConverter에 의해 convert됨.
8. 객체가 리턴된 경우, (default : Json) { key : value } 형태로 출력해서 웹 브라우저에서 보여줌
    - MappingJackson2HttpMessageConvert내의 JsonConverter에 의해 convert됨.

      
* 단축키(IntelliJ)
  - cmd+n -> java에서 getter, setter 생성하기
