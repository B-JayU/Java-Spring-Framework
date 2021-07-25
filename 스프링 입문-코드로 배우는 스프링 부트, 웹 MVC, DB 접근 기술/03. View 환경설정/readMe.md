- 첫 시작은 정적페이지인 'index.html'을 통해서 시작
  - anchor 태그 href을 통해서 다른 페이지로 이동 가능 (href="/hello")
  - href="/hello"를 하면 controller로 연결된다.

- Controller.java
  - @GetMapping("hello");
  - MVC 모델에 의거해서 데이터 역할을 하는 Model을 사용.
  - 생성된 model에 addAttribute( attributeName, attributeValue)
  - return "hello"의 역할 : resources-templates-hello.html로 렌더링
  - 컨트롤러에서 리턴 값으로 문자를 반환하면 뷰 리졸버( viewResolver )가 화면을 찾아서 처리함.
    - resources:templates/ + {ViewName + .html

- Hello.html
  - <p th:text=" '안녕하세요. '+ ${data}" 안녕하세요. 손님</p>
    - data는 controller에서 설정한 모델의 어트리뷰트의 네임.
