-- 샘플 확인용 테이블 만들기, 시퀀스 만들기.
create sequence member501_seq start with 1 increment by 1;

drop SEQUENCE member501_seq;

drop TABLE member501;


-- 샘플 확인용 테이블
CREATE TABLE member501 (
    id NUMBER PRIMARY KEY,
    name VARCHAR2(100),
    password VARCHAR2(100),
    email VARCHAR2(100),
    reg_date VARCHAR2(50)
);

-- 샘플 데이터 하나 넣기.
INSERT into MEMBER501 (id,name,password,EMAIL,REG_DATE) VALUES (
    MEMBER501_SEQ.nextval,
    '류성원',
    '1234',
    'ryu@naver.com',
    '2025년6월16일12시12분'
);
COMMIT;

SELECT * FROM MEMBER501;

-- 전체 조회 최신등록순

SELECT * FROM MEMBER501 ORDER BY ID DESC;