## Goal   
1. 자바 디자인 패턴 학습을 통하여 자바에 대해 한층 더 이해를 하자.
2. 꾸준한 업데이트를
### Servlet Background & Definition   
Servlet은 Web Programming을 java를 이용하여 구현하기 위해 탄생하였다. 그래서 어떤 사람은 Servlet을 CGI(Common Gateway Interface) Program이라고 부르기도 한다. Servlet은 HTTP Protocol을 지원하는 `javax.servlet.http.HttpServlet` 클래스를 상속하여 기능을 구현할 수 있다.   

### Servlet Process
![](https://user-images.githubusercontent.com/20740884/51011860-a0014f80-159d-11e9-81ec-24ff54f66018.JPG)   
1) Web Server는 클라이언트로부터 받은 HTTP 요청을 Web Container(Servlet Container)에게 위임한다.    
- Web Container는 먼저 `web.xml` 파일을 확인한다.   
