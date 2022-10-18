
## 계시판을 생성하는 프로젝트 시작

[1강 ]
# 3 Layer (= 3 Tier) 구조

	1. Prasentation Layer 
	- View ( Controller > Model을 반환 )
		
	2. Business Layer (=Service)

	3. Data Access Layer [Persistance] - 마이바티스 & 하이버네이트

===================================================================

# My Batis 연동 및 사용
# 트랜젝션 & 파일 업로드 다운로드
# 스프링 JDBC # Restfull # Ajax

[ DB 오라클 사용 예정 ] [ My sql 유료라 패스 ]


[2강]
## 오라클 테이블 생성 명령문

DROP TABLE SCOTT.MVC_BBS CASCADE CONSTRAINTS;

CREATE TABLE SCOTT.MVC_BBS (
  BNO         NUMBER(3)         NOT NULL, 
  BNAME       VARCHAR2(20)          NULL, 
  BSUBJECT    VARCHAR2(80)          NULL, 
  BCONTENT    VARCHAR2(300)         NULL, 
  BDATE       DATE             DEFAULT SYSDATE                  NULL, 
  BHIT        NUMBER(3)        DEFAULT 0             NULL, 
  BGROUP      NUMBER(3)             NULL, 
  BSTEP        NUMBER(4)          NULL,
  BINDENT     NUMBER(4)             NULL 
)



CREATE SEQUENCE SEQ_BBS;

# 테스트용 값 넣어보기
INSERT INTO MVC_BBS(BNO, BNAME, BSUBJECT, BCONTENT, BHIT, BGROUP, BSTEP, BINDENT) 
VALUES(SEQ_BBS.NEXTVAL, '정다기', '안녕하세요', '내가 잘못하고 있는건가?', 0, SEQ_BBS.NEXTVAL,0, 0)



##  STS  [ 프로젝트 생성 : Spring Lagacy Project 생성 [ Spring MVC Project ] ]
( 프로젝트명 springBBS )

================================================================
## 인코딩 필터 처리 

[Web.xml 파일]

<filter>
	<filter-name>encodingFilter</filter-name>
	<filter-class>org.springframework.web.filter.CharacterEncordingFilter</filter-class>

	<init-param>
	<param-name>encoding</param-name>
	<param-value>UTF-8</param-value>
	</init-param>
</filter>

<filter-mapping>
	<filter-name>encodingFilter</filter-name>
	<url-pattern>/*</url-pattern>
</filter-mapping>


[3강~14강 게시물 조회/ 게시물 입력/ 상세 조회작성]

[ 스프링 게시판 개요 ]

게시판 프로젝트 구성

패키지 : bbsCommand, bbsController, bbsDAO, bbsVO

	• bbsCommand 패키지 구성 : 커맨드 객체의 구성
		○ Bcmd : 인터페이스 
		○ ListCmd : 게시판의 리스트를 DB로부터 가져오는 객체
		○ WriteCmd : 글 등록 처리
		○ ContentCmd : 내용보기 처리
		○ DeleteCmd : 삭제 처리
		○ ModifyCmd : 업데이드 처리
		○ ReplyCmd : 답글 처리
		○ ReplyViewCmd : 답글 내용보기
	• bbsController 패키지 구성
		○ bController.java 
	• bbsDAO 패키지 구성
		○ bDAO.java 
	• bbsVO 패키지 구성
		○ bVO.java 
## 뷰 
	list.jsp : 게시판  리스트
	writeForm.jsp : 글쓰기 폼 페이지
	contentView.jsp : 내용보기 페이지 / 수정 폼 페이지


