-- 샘플 확인용 테이블 만들기, 시퀀스 만들기.
create sequence members501_seq start with 1 increment by 1;

drop SEQUENCE members501_seq;

drop TABLE member501;


-- 샘플 확인용 테이블
CREATE TABLE member501 (
    id NUMBER PRIMARY KEY,
    name VARCHAR2(100),
    password VARCHAR2(100),
    email VARCHAR2(100),
    reg_data VARCHAR2(50)
);

-- 샘플 데이터 하나 넣기.
INSERT into MEMBER501 (id,name,password,EMAIL,REG_DATA) VALUES (
    MEMBERS501_SEQ.nextval,
    '류성원',
    '1234',
    'ryu@naver.com',
    '2025년 6월 16일 12시 12분'
);
COMMIT;

SELECT * FROM MEMBER501;