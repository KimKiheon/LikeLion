# LikeLion_BackEnd School 2nd


<details><summary>  Week3 (10.04 ~ 10.07) </summary>

## 10 / 04 (Oct 4)
- Git, Git Hub, Source Tree
- Array
- 화폐 매수를 구하는 프로그램
- CodeUp
  - 1156 : 짝수와 홀수
  - 1161 : 홀수와 짝수 그리고 더하기
  - 1001 ~ 1010

## 10 / 05 (Oct 5)
- Intellij github
    + branch
    + git remote swap(main, master)
- Class 사용 이유
    + Constructor
    + calculator 구현
        
- Collection
    - List
        - ArrayList

- Dependency
- SOLID 원칙
- CodeUp (1011 ~ 1020)

## 10 / 06 (Oct 6)
- Collection
    - List
        - ArrayList
    - map
        - HashMap
    - set
        - HashSet
            
- File
    - Read
        - N Byte Read
        - Line Read
    - FileReader
    - BufferReader
- CodeUp (1021 ~ 1030)


## 10 / 07 (Oct 7)

  - 인구 이동 데이터 분석 프로젝트
    - 대용량 파일 읽기
    - Data analysis
    - 파일 생성 및 내용 작성
  - JavaScript 차트 작성
  - CodeUp (1031 ~ 1040)

</details>

<details><summary>  Week4 (10.11 ~ 10.14) </summary>

## 10 / 11 (Oct 11)
- AWS EC2
  - Docker install
  - MySql Docker로 띄우기
  - 3306 Port 열기

- DataBase(MySQL)
  - TABLE create, alter
  - Data Insert, Delete, Modify
  - Foreign Key, Primary Key
  - Auto Increment
 
 - CodeUp (1041 ~ 1050)
  

## 10 / 12 (Oct 12)
- DataBase (MySQL)
  - Data Insert
  - .sql script file create and load, insert
- File
  - 대용량 .csv File -> .sql File
- CodeUp (1051 ~ 1060)

## 10 / 13 (Oct 13)
- Algorithm
  - Bubble Sort
- DataBase
  - 대용량 파일 데이터 가공(파싱)
  - 데이터 Insert
- TDD
  - TDD방식의 이해
  - Test 하는방법
  
## 10 / 14 (Oct 14)
- Algorithm
  - Insertion Sort
- DataBase
  - SQL Query in Java
  - CRUD
  - Query
    - Count
    - Group By
    - Having
    - Order By
</details>

<details><summary>  Week5 (10.17 ~ 10.21) </summary>

## 10 / 17 (Oct 17)
- Algorithm
  - loop
- Java & Database
  - Mysql in docker & Java connection
    - DO, VO, DAO (Select, Insert)
  - Imformation security
    - Environment variables
  
## 10 / 18 (Oct 18)
- Algorithm
  - loop
  - Recursion Function
- Java & Database
  - method refactoring
  - Test
  - SOLID -> SRP
    - Separation of Concern
      - Abstract Class  
      - Interface 
      
## 10 / 19 (Oct 19)
- Algorithm
  - Stack & Stack implementation (Push, Pop)
- Java & Database
  - Separation of Concern
    - Interface
  - Factory
  - Singleton pattern
  - Spring
    - @Configuration, @Bean
    - Test
      - @ExtendWith, @ContextConfiguration, @Autowired
      
## 10 / 20 (Oct 20)
- Algorithm
  - Stack implementation (isEmpty, peek)
- Java & Database & Spring
  - deleteAll(), getCount() from Database(MySQL)
  - Drop vs Delete vs Truncate in MySQL TABLE
  - Exception Handling
    - Result Set is empty
  - Test in JUnit5
    - @BeforeEach, @Test, @After
    
## 10 / 21 (Oct 21)
- Algorithm
  - Stack Application in programmers
- Java & Database & Spring
  - repeat an exercise
    - Exception Handling
    - Test
    - Interface
    - refactoring
  - Strategy pattern
  
  </details>
  
  <details><summary>  Week6 (10.24 ~ 10.28) </summary>
  
  ## 10 / 24 (Oct 24)
  - Algorithm
    - DataStructure
      - Queue
      - Priority Queue
    - Programmers
      - k번째 수
      - 가장 큰 수
        -code: https://github.com/KimKiheon/LikeLion/tree/main/JavaStudy/src/Programmers/sort
  - Java
    - Toby Spring3
      - Strategy pattern apply
      - jdbcContextWithStrategy & DataSource, DI
      - Annonymous Class
      - Separate jdbcContext, -> UserDao depend on jdbcContext
      - Template Callback
      - jdbcTemplate
      - remove duplicates
          
  ## 10 / 25 (Oct 25)
  - Algorithm
    - Hash, Hash Table
    - Programmers
      - 완주하지 못한 선수(https://school.programmers.co.kr/learn/courses/30/lessons/42576)
        -code: https://github.com/KimKiheon/LikeLion/blob/main/JavaStudy/src/Programmers/hash/playerNoHash.java
  - Java
    - Toby Spring repeat
      - Separation of Connection ~ JdbcTemplate & Test (https://github.com/KimKiheon/Toby_Spring)
      - AnnonymousClass + Lambda
      
   ## 10 / 26 (Oct 26)
   - Algorithm
    - Hash
    - Programmers
      - 폰켓몬 (https://school.programmers.co.kr/learn/courses/30/lessons/1845)
        - code: https://github.com/KimKiheon/LikeLion/blob/main/JavaStudy/src/Programmers/hash/PhoneketmonWithoutHash.java
        
   - Java & Spring(boot)
    - Spring's feature
      - IoC(Inversion of Control)
      - DI(Dependency Injection)
        - constructor
        - field
        - setter
      - AoP
    - SpringBoot build
      - Maven
      - Gradle
    - Persistence
    - Rest API 
    - Mapping
      - @RestController
      - @RequestMapping(method<Get, Post, Delete, Put>)
      - @GetMapping
      - @Pathvariable
    - Test
      - Talend API Tester
      
  ## 10 / 27 (Oct 27)
  - Spring(boot)
    - Mapping
      - @RequestParam -> GetMethod
      - Path parameter
      - Query parameter
    - DTO(Data Transfer Object), VO(Value Object)
    - Post API
      - @RequestBody
        - body - JSON
    - Get vs Post
    - Put API -> Update
      - ResponseEntity
    - Delete API -> Delete
    - Swagger 3.0 version (https://velog.io/@wotj7687/Spring-Boot-Swagger-3.0.0-%EC%A0%81%EC%9A%A9)
      - SwaggerConfiguration
      - dependency
      - url: {Address}:{port}/swagger-ui/
      
  ## 10 / 28 (Oct 28)
  - Algorithm
    - Hash
    - Programmers
      - 전화번호 목록 (https://school.programmers.co.kr/learn/courses/30/lessons/42577)
        - code : https://github.com/KimKiheon/LikeLion/blob/main/JavaStudy/src/Programmers/hash/PhoneNumberList.java
  - Spring(Boot)
    - API Request in Swagger
    - Logging - Logback
    - ORM(Object Relational Maapping)
    - CRUD board API
    - Environment Variable
    - REST API URI design rules
      </details>
    
      
      
