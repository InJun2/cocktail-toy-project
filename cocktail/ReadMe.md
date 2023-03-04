# 프로젝트 템플릿

## 변경해야 하는 사항

### 1. error.dto.ErrorMessage
- API 에서 RuntimeException 을 상속받은 BusinessException 을 상속받아 Exception 발생 시 해당 메시지를 변경/추가 해야함

<br>

### 2. error.exception.example
- 해당 도메인의 이름으로 example -> "Exception 을 발생시킬 도메인 명" 으로 수정하고 사용
- Exception Class 생성할 경우 BusinessException 을 상속받고 super 를 통하여 전달할 ErrorMessage 상수를 인자로 사용
- example 안의 Exception 을 위한 클래스들은 예시이므로 사용시 삭제

<br>

### 3. config.swagger.SwaggerConfig
- Swagger 3.0을 사용하여 문서화를 진행하는데 해당 문서화에 있어 제목과 설명을 변경해야함

<br>

### 4. Redis/Redisson 사용 X
- build.gradle 에서 해당 의존성 제거
  - implementation 'org.springframework.boot:spring-boot-starter-data-redis' 
  - implementation 'org.redisson:redisson-spring-boot-starter:3.19.3'
- application.yml 에서 해당 내용 제거
```
    redis:
        host: localhost
        port: 6379
```

<br>

### 5. application.yml datasource 변경
- 해당 템플릿 프로젝트는 MySql 을 사용하고 있으며 다른 데이터 베이스 사용시 변경 필요
- 사용할 데이터베이스 명과 사용자명 자신이 사용할 datasource 맞게 변경 필요

<br>

### 6. root file/package file 명 변경
- 해당 package 명을 자신이 만드는 API 로 이름 변경 
- root file/package file 변경은 번거로우므로 프로젝트를 직접 생성해서 com.my.project 안의 프로젝트와 resources/application.yml 을 복사하여 사용하는 것을 추천
- CocktailApplication 이름 변경
- 전부 사용 이후 해당 ReadMe 파일 변경
