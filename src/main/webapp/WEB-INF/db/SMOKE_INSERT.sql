INSERT INTO MEMBER 
    (ID, PASSWORD1, PASSWORD2, NAME, BIRTHDAY, AREA1, AREA2, AREA3, EMAIL, PHONE)
VALUES 
('ADMIN', 'a1a2a3', 'a1a2a3', 'ADMIN', 19900109, '서울특별시', '강서구', '화곡1동', 'realzidane05@naver.com', 01087621045);

SELECT
    *
FROM
    MEMBER
WHERE
    ROWNUM = 1;

COMMIT;
