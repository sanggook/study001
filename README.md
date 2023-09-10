# study001

## 점심 일기(가제)
- 하루 식사 기록 하여 달력으로 확인할수 있는 간단한 프로젝트 진행.

--------------------
### 지켜야 할것
> 무조건 테스트 코드 작성!!!

### 2023.09.01 이전(히스토리 까먹음)
- spring boot 3.0 이상 적용(JVM 17 필요)하여 프로젝트 구축
- mybatis 적용 (완료)
  - sqlSessionFactory가 아닌 @Mapper 어노테이션으로 적용
- ehcache 적용
  - 3.0과 2.0 차이 확인(아직 확인 못함. 테스트 방법론 체크 필요)
- ExceptionHandler 적용
  
### 2023.09.01
- JPA 적용 완료

### 2023.09.02
- 멀티모듈 프로젝트로 전환 완료
  - API : 메인 비지니스 모듈
  - COMMON : 공통 함수 및 상수 모음 모듈
  - MYBATIS : mybatis 관련 모듈
  - JPA : jpa 관련 모듈
- JPA 모듈 테스트 코드 작성 완료
  - 테스트용 SpringBootApplication 생성
  - h2 메모리 DB 활용
  - 테스트용 properties 생성

### 2023.09.09
- SWAGGER(springdoc) openApi 3.0 적용
  - 뷰 모델에 대한 재정의 필요
    - 엔티티 <-> DTO <-> view OR 엔티티 <-> DTO 고민..
