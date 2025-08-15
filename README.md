## 프로젝트 소개

<img width="1338" height="583" alt="Image" src="https://github.com/user-attachments/assets/e8451c3e-02bf-4838-9c14-dd7a5c26efbd" />

FITinside는 LF몰, 무신사와 같은 온라인 쇼핑몰을 모티브로 한 웹사이트입니다.

사용자는 다양한 상품을 탐색하고, 원하는 상품을 장바구니에 담아 관리할 수 있습니다.

회원가입 및 로그인(구글 로그인 포함)을 통해 주문을 완료할 수 있으며 카테고리별 상품 분류 및 쿠폰 적용 기능 등을 추가해 사용자 경험을 향상시켰습니다.

<br>

## 팀원 구성

| **이름** |        **역할**        |
| :------: | :--------------------: |
|  박진영  | 팀장, 회원가입, 로그인 |
|  안창민  |     장바구니, 쿠폰     |
|  유연주  |     카테고리, 배너     |
|  이하현  |       상품 관리        |
|  허수빈  |      주문, 배송지      |

<br>

## 개발 기간

2024.09.30 ~ 2024.10.25 (1개월)

<br>

## 기술 스택

### Back-end

<img width="960" height="238" alt="Image" src="https://github.com/user-attachments/assets/f05f22d5-0090-417f-890d-4e5d387c2c62" />

| 기술                                                                                                                | 버전     | 설명                                                                                                                                             |
| ------------------------------------------------------------------------------------------------------------------- | -------- | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| ![Java](https://img.shields.io/badge/Java-17-007396?logo=java&logoColor=white)                                      | 17 (LTS) | 최신 LTS 버전으로 안정성과 성능 제공                                                                                                             |
| ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.3.4-6DB33F?logo=springboot&logoColor=white)             | 3.3.4    | 경량화된 자바 프레임워크, RESTful API 구축 및 서버 사이드 로직 처리                                                                              |
| ![Spring Security](https://img.shields.io/badge/Spring%20Security-3.3.4-6DB33F?logo=springsecurity&logoColor=white) | 3.3.4    | Spring Boot를 사용하여 개발하는 과정에 높은 연동성을 제공 <br> 인증, 권한 부여, 접근 제어 지원. JWT와 연동해 토큰 기반 인증 구현                 |
| ![JWT](https://img.shields.io/badge/JWT-0.12.1-000000?logo=jsonwebtokens&logoColor=white)                           | 0.12.1   | Stateless 인증 지원. Access/Refresh Token 전략으로 확장성 제공                                                                                   |
| ![JPA](https://img.shields.io/badge/JPA-Hibernate%20based-59666C?logo=hibernate&logoColor=white)                    | 3.3.4    | ORM 기술로 객체지향적 데이터 접근 제공 <br> MyBatis와 같은 SQL Mapping 기술보다 단순한 DB조작을 많이 하는 서비스를 구현하는 이번 프로젝트에 적합 |
| ![MySQL](https://img.shields.io/badge/MySQL-AWS%20RDS-4479A1?logo=mysql&logoColor=white)                            | AWS RDS  | 관계형 데이터베이스                                                                                                                              |
| ![JUnit](https://img.shields.io/badge/JUnit%20%2B%20Mockito-5.11.0-25A162?logo=junit5&logoColor=white)              | 5.11.0   | 단위 테스트를 위한 Mock 라이브러리                                                                                                               |
| ![Jakarta Mail](https://img.shields.io/badge/Jakarta%20Mail-2.0.3-FB7200?logo=maildotru&logoColor=white)            | 2.0.3    | 이메일 발송 지원                                                                                                                                 |
| ![AWS S3](https://img.shields.io/badge/AWS%20S3-2.2.6-569A31?logo=amazons3&logoColor=white)                         | 2.2.6    | 이미지/파일 업로드 및 관리                                                                                                                       |

### Front-end

- HTML, CSS : 웹 표준을 준수한 마크업 및 스타일링
- React : 컴포넌트 기반의 UI 라이브러리를 활용하여 효율적인 상태 관리 및 인터랙티브한 사용자 인터페이스 구현
- Axios: 백엔드와의 HTTP 통신을 위한 비동기 요청 처리 라이브러리

<br>

### 서비스 배포 환경

- 프론트엔드

  - <img src="https://img.shields.io/badge/netlify-00C7B7?style=for-the-badge&logo=netlify&logoColor=white">

- 백엔드

  - <img src="https://img.shields.io/badge/aws-F68F1E?style=for-the-badge&logo=aws&logoColor=white">

    - <img src="https://img.shields.io/badge/linux-FCC624?style=for-the-badge&logo=linux&logoColor=black">
    - <img src="https://img.shields.io/badge/ubuntu-E95420?style=for-the-badge&logo=ubuntu&logoColor=white">

<br>

### 버전 및 이슈관리

<img src="https://img.shields.io/badge/gitlab-FC6D26?style=for-the-badge&logo=gitlab&logoColor=white"> <img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white">

<br>

### 협업 툴

<img src="https://img.shields.io/badge/discord-5865F2?style=for-the-badge&logo=discord&logoColor=white"> <img src="https://img.shields.io/badge/notion-000000?style=for-the-badge&logo=notion&logoColor=white">

<br>

### 기타

<img src="https://img.shields.io/badge/mapstruct-EE8208?style=for-the-badge&logo=mapstruct&logoColor=white"> <img src="https://img.shields.io/badge/lombok-A42E2B?style=for-the-badge&logo=lombok&logoColor=white"> <img src="https://img.shields.io/badge/swagger-85EA2D?style=for-the-badge&logo=swagger&logoColor=black">

<br>

## 브랜치 전략

- Git-flow 전략을 기반으로 master, develop 브랜치와 featue 등의 기능 브랜치를 활용했습니다.
  - master : 배포 단계에서만 사용하는 브랜치입니다.
  - develop : 개발 단계에서의 master 역할을 하는 브랜치입니다.
  - review-develop : 기능 브랜치를 develop에 merge하기 전 코드 리뷰를 통해 정상적으로 동작을 하는지 확인하는 역할을 하는 브랜치입니다.
  - publish-develop : 배포 환경(배포된 서버 URL 반영, RDS 적용 등)을 적용해 놓은 브랜치입니다.
  - feature: 기능 단위로 독립적인 개발 환경을 위해 사용하고 merge 후 브랜치를 삭제해주었습니다.
  - refactor: 기존 코드를 개선하고 구조를 변경하는 브랜치입니다. review-develop으로 merge 후 브랜치를 삭제해 주었습니다.
  - test: 테스트 코드를 작성하거나 기존 테스트 코드를 리팩토링 하는 브랜치입니다. review-develop으로 merge 후 브랜치를 삭제해 주었습니다.

<br>

## 프로젝트 구조

```

# address : 배송지
# banner : 광고
# cart : 장바구니
# category : 상품 카테고리
# config : 설정 관리
# coupon : 상품 쿠폰
# global : 전역 예외 관리
# jwt : 토큰
# member : 회원
# oauth : 인증
# order : 주문
# product : 상품

src
├── main
│   └── java
│       └── com
│           └── team2
│               └── fitinside
│                   ├── address
│                   │   ├── controller
│                   │   ├── dto
│                   │   ├── entity
│                   │   ├── mapper
│                   │   ├── repository
│                   │   └── service
│                   ├── banner
│                   │   ├── controller
│                   │   ├── dto
│                   │   ├── entity
│                   │   ├── mapper
│                   │   ├── repository
│                   │   └── service
│                   ├── cart
│                   │   ├── controller
│                   │   ├── dto
│                   │   ├── entity
│                   │   ├── mapper
│                   │   ├── repository
│                   │   └── service
│                   ├── category
│                   │   ├── controller
│                   │   ├── dto
│                   │   ├── entity
│                   │   ├── mapper
│                   │   ├── repository
│                   │   └── service
│                   ├── config
│                   ├── coupon
│                   │   ├── controller
│                   │   ├── dto
│                   │   ├── entity
│                   │   ├── mapper
│                   │   ├── repository
│                   │   └── service
│                   ├── global
│                   │   └── exception
│                   ├── jwt
│                   ├── member
│                   │   ├── controller
│                   │   ├── dto
│                   │   ├── entity
│                   │   ├── mapper
│                   │   ├── repository
│                   │   └── service
│                   ├── oauth
│                   │   ├── controller
│                   │   ├── dto
│                   │   ├── entity
│                   │   ├── repository
│                   │   ├── service
│                   │   └── util
│                   ├── order
│                   │   ├── controller
│                   │   ├── dto
│                   │   ├── entity
│                   │   ├── mapper
│                   │   ├── repository
│                   │   └── service
│                   └── product
│                       ├── controller
│                       ├── dto
│                       ├── entity
│                       ├── image
│                       ├── mapper
│                       ├── repository
│                       └── service
└── test
    └── java
        └── com
            └── team2
                └── fitinside
                    ├── auth
                    ├── cart
                    │   ├── controller
                    │   └── service
                    ├── coupon
                    │   ├── controller
                    │   └── service
                    └── member
                        └── service



```

<br>

## ERD

<img width="2876" height="1158" alt="Image" src="https://github.com/user-attachments/assets/272a6405-cb97-439a-8bda-01690ad45b21" />

<br>
<br>
<br>

## 주요 기능

### 회원

- 이메일, 비밀번호 기반의 로그인 기능

  ![Image](https://github.com/user-attachments/assets/afe0d142-6935-481f-b40d-ef37edb61aeb)

- 이메일, 비밀번호 기반의 회원가입 기능

  ![Image](https://github.com/user-attachments/assets/dbb641ad-7b38-46f6-9618-4171dc26d542)

- Google API Cloud를 연동한 로그인 기능

  ![Image](https://github.com/user-attachments/assets/d3481a26-9ba0-49e2-9a60-f12b5dd4109e)

- 클라이언트에 저장된 AccessToken으로 로그인 유지 가능
- 토큰 탈취 대책으로 짧은 수명의 AccessToken 생성, 자동 재발급을 위한 RefreshToken 쿠키 저장

<br>

### 배너

- 메인 화면에서 광고 기능
- 배너의 조회, 생성, 수정, 삭제 가능
  - 제목, 정렬 순서, 광고 이미지, URL 등을 기입하여 새로운 광고 배너 생성 가능
- 배너를 통한 URL 연결 기능

  - 관리자가 광고에 URL을 설정해 놓았으면 회원은 광고 배너 클릭을 통해 해당 광고의 상세 페이지로 이동 가능

  ![Image](https://github.com/user-attachments/assets/f378895b-a8d9-4cfe-99d5-f3e97baff0f7)

<br>

### 카테고리

- 공통(회원, 관리자)

  - 헤더
    부모 카테고리의 드롭 다운을 통해 자식 카테고리 조회 가능
  - 이미지 포함 카테고리

  ![Image](https://github.com/user-attachments/assets/04bb6fa9-57a9-4b16-8b33-e2534546bbbe)

- 관리자

  - 카테고리 생성, 수정, 삭제 가능 (이미지와 정렬 순서 추가 가능)

  ![Image](https://github.com/user-attachments/assets/f8a7b222-d677-481d-85be-83ea17dab253)

<br>

### 상품

- 공통

  - 상품 조회(검색, 정렬 가능), 장바구니로 이동

  ![Image](https://github.com/user-attachments/assets/c055ed31-e7a4-4edb-9415-c76eb7ef39bb)

- 관리자

  - 상품 조회(검색, 정렬 가능), 상품 등록

  ![Image](https://github.com/user-attachments/assets/e442feb6-12cc-47a7-b77c-7b30b9d06600)

  - 상품 관련 데이터 수정
  - 상품 삭제

  ![Image](https://github.com/user-attachments/assets/d91a1877-925d-4c34-b80d-87a71905f379)

<br>

### 장바구니

- 비회원/회원 구분없이 장바구니 추가 가능
- 장바구니 정보가 비회원은 로컬스토리지, 회원은 db에 저장
  - 비회원인 경우 장바구니에서 상품 선택 후 주문하기 버튼 클릭 시 로그인 페이지로 리다이렉트
  - 로그인 시 db에 저장된 장바구니 정보를 가져와서 비회원으로 저장한 장바구니 정보와 병합
- 장바구니에 담긴 상품 수량 수정, 삭제(전체, 선택) 기능
- 배송비, 쿠폰 등이 적용된 결제 예정 금액 출력 기능

  ![Image](https://github.com/user-attachments/assets/59984b7c-348c-4592-836b-515cf988b1bb)

<br>

### 쿠폰

- 관리자

  - 쿠폰 생성, 비활성화 가능
  - 쿠폰 목록 (전체 / 활성화만) 조회 (만료일 기준 오름차순 정렬, 페이지네이션 적용) 가능
  - 쿠폰 보유 (페이지네이션 적용), 미보유 회원 조회 가능
  - 미보유 회원에게 쿠폰 이메일 전송 가능

  ![Image](https://github.com/user-attachments/assets/b0311a2e-cebf-44a6-becc-fce9e93045e2)

- 회원

  - 쿠폰 코드로 쿠폰 검색 및 다운로드 가능
  - 보유한 쿠폰 목록 (전체 / 사용가능) 조회(만료일 기준 오름차순 정렬, 페이지네이션 적용) 가능
  - 쿠폰 사용 내역 (주문서) 조회 가능
  - 장바구니 페이지에서 각 상품 별 적용 가능한 쿠폰 조회 가능
    - 한 상품에는 한 쿠폰만 적용 가능
    - 수량이 여러개라면 1개에만 적용

  ![Image](https://github.com/user-attachments/assets/060c66a2-5433-43a0-95f7-98904aca6af7)

<br>

### 주문

- 관리자

  - 회원의 주문 관리 → 주문 상태 변경, 주문 삭제 가능
  - 주문 번호 클릭 시 주문 상세 조회 가능
  - 주문 상태, 날짜별 검색 기능

  ![Image](https://github.com/user-attachments/assets/013b380b-a654-4fe8-9ac3-b98b8d092c10)

- 회원

  - 배송지 입력 후 주문 생성 가능
  - 주문 상세 조회
    - 배송 시작 전이면 배송지 수정 / 주문 취소 가능
    - 여기서 수정한 배송지는 주문에만 적용 (배송지 목록에 따로 반영 X)
  - 주문 목록 조회
    - 한 페이지에 총 5개씩 주문 확인 가능 (최신순 정렬)
    - 상품명 검색 기능

  ![Image](https://github.com/user-attachments/assets/9f0b446a-8e50-4c89-af78-1d0a88242373)

<br>

### 배송지

- 회원

  - 주문서 작성 시 입력하는 배송지 관리
    - 기본 배송지 자동 입력 및 배송지 선택, 새 배송지 입력 가능
  - 배송지는 회원당 최대 5개 저장 가능
    - 5개 제한 → 주문서 작성 페이지에서 배송지 선택 시 저장된 5개만 노출함으로써 사용자 편의성 향상
    - 수령인 이름, 우편번호, 주소, 전화번호 중 하나라도 다르면 다른 배송지로 간주
  - 수정, 삭제
    - 기본 배송지로 설정된 배송지는 삭제 불가능
  - 기본 배송지 설정 / 해제
    - 기본 배송지 설정 → 주문서 작성 시 자동으로 입력

  ![Image](https://github.com/user-attachments/assets/0c77ba14-5a8c-4122-aef2-5395379c5aba)

<br>

## Exception Handling & HTTP Status Code

```
### 1. **400 Bad Request**
클라이언트의 잘못된 요청으로 인해 발생하는 오류입니다.
- **POST_DELETED**: 삭제된 게시글입니다.
- **REVIEW_DELETED**: 삭제된 리뷰입니다.
- **COMMENT_DELETED**: 삭제된 댓글입니다.
- **EMPTY_FILE_EXCEPTION**: 빈 파일입니다.
- **NO_FILE_EXTENSION**: 파일 확장자가 없습니다.
- **INVALID_FILE_EXTENSION**: 허용되지 않는 파일 확장자입니다.
- **INVALID_FILE_FORMAT**: 허용되지 않는 파일 형식입니다.
- **AUTH_CODE_EXTENSION**: 로그인을 실패하였습니다(임시).
- **INVALID_PRODUCT_DATA**: 상품 정보가 유효하지 않습니다.
- **INVALID_PRODUCT_PRICE**: 가격은 0 이상이어야 합니다.
- **INVALID_PRODUCT_NAME_LENGTH**: 상품명은 100자 이하로 입력해야 합니다.
- **INVALID_PRODUCT_INFO_LENGTH**: 상품 설명은 500자 이하로 입력해야 합니다.
- **INVALID_MANUFACTURER_LENGTH**: 제조사는 100자 이하로 입력해야 합니다.
- **INVALID_COUPON_DATA**: 쿠폰 정보가 유효하지 않습니다.
- **INVALID_COUPON_CREATE_DATA**: 쿠폰 생성 정보가 유효하지 않습니다.
- **INVALID_EMAIL_DATA**: 이메일 정보가 유효하지 않습니다.
- **OUT_OF_STOCK**: 현재 주문 가능한 상품의 개수를 초과했습니다.
- **ORDER_MODIFICATION_NOT_ALLOWED**: 배송이 시작된 주문은 수정할 수 없습니다.
- **CART_OUT_OF_RANGE**: 상품 수량은 1개 이상 20개 이하여야 합니다.
- **INVALID_CATEGORY_DATA**: 카테고리 정보가 유효하지 않습니다.

### 2. **401 Unauthorized**
인증되지 않은 사용자가 접근을 시도할 때 발생하는 오류입니다.
- **INVALID_AUTH_TOKEN**: 권한 정보가 없는 토큰입니다.
- **USER_NOT_AUTHENTICATED**: 인증되지 않은 사용자입니다.

### 3. **403 Forbidden**
사용자가 권한이 없는 리소스에 접근하려 할 때 발생하는 오류입니다.
- **USER_NOT_AUTHORIZED**: 권한이 없는 사용자입니다.

### 4. **404 Not Found**
요청한 리소스가 존재하지 않을 때 발생하는 오류입니다.
- **USER_NOT_FOUND**: 해당하는 정보의 사용자를 찾을 수 없습니다.
- **OBJECT_NOT_FOUND**: 대상을 찾을 수 없습니다.
- **RESOURCE_NOT_FOUND**: 대상을 찾을 수 없습니다.
- **PRODUCT_NOT_FOUND**: 해당 상품을 찾을 수 없습니다.
- **CATEGORY_NOT_FOUND**: 해당 카테고리를 찾을 수 없습니다.
- **CART_NOT_FOUND**: 해당 장바구니를 찾을 수 없습니다.
- **COUPON_NOT_FOUND**: 해당 쿠폰을 찾을 수 없습니다.
- **ORDER_NOT_FOUND**: 주문을 찾을 수 없습니다.
- **CART_EMPTY**: 장바구니가 비어있습니다.
- **ORDER_PRODUCT_NOT_FOUND**: 해당 상품에 대한 주문을 찾을 수 없습니다.
- **ADDRESS_NOT_FOUND**: 해당 배송지를 찾을 수 없습니다.

### 5. **409 Conflict**
리소스의 현재 상태와 충돌할 때 발생하는 오류입니다.
- **DUPLICATE_RESOURCE**: 데이터가 이미 존재합니다.
- **DUPLICATE_COUPON**: 쿠폰 등록 이력이 존재합니다.
- **EXCEEDED_MAX_ADDRESS_LIMIT**: 배송지 최대 저장 개수를 초과했습니다.
- **DUPLICATE_ADDRESS**: 배송지가 이미 존재합니다.

### 6. **410 Gone**
리소스가 더 이상 유효하지 않을 때 발생하는 오류입니다.
- **USER_ALREADY_DELETED**: 탈퇴된 사용자입니다.
- **PLACE_DELETED**: 삭제된 장소입니다.
- **CATEGORY_ALREADY_DELETED**: 이미 삭제된 카테고리입니다.

### 7. **500 Internal Server Error**
서버 내부에서 예상치 못한 오류가 발생했을 때 반환하는 상태 코드입니다.
- **IO_EXCEPTION_ON_IMAGE_UPLOAD**: 이미지 업로드 중 입출력 오류가 발생했습니다.
- **PUT_OBJECT_EXCEPTION**: S3에 객체를 업로드하는 중 예외가 발생했습니다.
- **IO_EXCEPTION_ON_IMAGE_DELETE**: 이미지 삭제 중 입출력 오류가 발생했습니다.
- **PRODUCT_LIST_RETRIEVAL_ERROR**: 상품 목록 조회 중 서버 에러 발생.
- **PRODUCT_DETAIL_RETRIEVAL_ERROR**: 상품 상세 조회 중 서버 에러 발생.
- **PRODUCT_CREATION_ERROR**: 상품 등록 중 서버 에러 발생.
- **PRODUCT_UPDATE_ERROR**: 상품 수정 중 서버 에러 발생.
- **PRODUCT_DELETION_ERROR**: 상품 삭제 중 서버 에러 발생.
```
