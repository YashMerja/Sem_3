SELECT ACTNO,CNAME,AMOUNT FROM DEPOSIT

SELECT LOANNO,AMOUNT FROM BORROW

SELECT *FROM BORROW WHERE BNAME='ANDHERI'

SELECT ACTNO,AMOUNT FROM DEPOSIT WHERE ACTNO=106

SELECT *FROM BORROW WHERE AMOUNT>5000

SELECT CNAME FROM DEPOSIT WHERE 

SELECT CNAME FROM CUSTOMERS WHERE CITY IN ('NAGPUR','DELHI') 

SELECT CNAME FROM CUSTOMERS WHERE CITY='NAGPUR' OR CITY='DELHI'

SELECT CNAME FROM DEPOSIT WHERE AMOUNT>4000 AND ACTNO<105

SELECT AMOUNT FROM BORROW WHERE AMOUNT>=3000 AND AMOUNT<=8000

SELECT AMOUNT FROM BORROW WHERE AMOUNT BETWEEN 3000 AND 8000

SELECT CNAME,BNAME FROM DEPOSIT WHERE NOT BNAME='ANDHERI'

SELECT ACTNO,CNAME,AMOUNT FROM DEPOSIT WHERE BNAME IN ('AJNI','KAROLBAGH','M.G.ROAD') AND ACTNO<104

SELECT TOP 5*FROM DEPOSIT 

SELECT TOP 3*FROM DEPOSIT WHERE AMOUNT>1000

SELECT TOP 5 LOANNO,CNAME FROM BORROW WHERE NOT BNAME='ANDHERI'

SELECT DISTINCT CITY FROM CUSTOMERS

SELECT DISTINCT BNAME FROM CUSTOMERS

SELECT TOP 50 PERCENT*FROM BORROW
SELECT TOP 10 PERCENT*FROM DEPOSIT
SELECT TOP 25 PERCENT*FROM DEPOSIT WHERE AMOUNT>5000


 






