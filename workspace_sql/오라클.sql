select * from emp;
desc emp;

select * from dept;
desc dept;
select * from salgrade;

desc salgrade;

SELECT
    empno, ename, deptno
from
    emp;
    
select empno, ename, sal
from emp;

select deptno from emp;

select distinct deptno
from emp;

select distinct /* 이렇게 사이에 넣어도 돼 */ job
from emp;

/* 이 사이에는 아무거나 적어도 돼
여러줄도 적을 수 있어
범위 주석이라고 불러*/

-- 한줄 전체 주석이야 이 줄 전체가 주석이 돼 ctrl+/ 단축키

select distinct job, deptno
from emp;

select ename, sal, sal*12+comm, comm
from emp;

select ename, sal, sal*12+comm as "올해 연봉", comm
from emp;

select * from emp
order by sal desc;

select * from emp
order by ename desc;

select * from emp
order by comm;

select * from emp
order by job;

select * from emp
order by job, sal;

select * from emp
order by deptno desc, ename asc;

--92P Q3
select empno employee_no, ename employee_name, job, mgr manager, hiredate, sal salary, comm commission, deptno department_no
from emp
order by deptno desc, ename asc;

--92P Q2
select distinct job from emp;

select *
from emp
where deptno = 30;

select *
from emp
where deptno = 30
and job = 'SALESMAN';

select *
from emp
where deptno = 30
or job = 'CLERK';

select * from emp
where ename = 'WARD'
or job = 'CLERK'
or deptno = 20;

select * from emp
where (ename = 'WARD' or job = 'CLERK')
AND deptno = 20;

select * 
from emp
where sal * 12 = 36000;

select *
from emp
where sal > 3000;

select *
from emp
where sal <= 2000
order by sal;

select distinct job 직무, ename 에스파, sal 블랙핑크
from emp;
-- 여러 칼럼을 선택할 때는 distinct가 의미가 없나?
-- 83P에 나온다. 둘이 값이 다르다면 중복 데이터가 아니므로 모두 출력된다.

select * from emp
where
    sal >= 2000
    and sal < 3000;

select * from emp
where 2000 <= sal < 3000; /* 한 번에는 안 될까? (X) */
-- 한 번에 안 됨. 문법에 어긋남. 참과 거짓으로만 답할 수 있어야한다.

select * from emp
where sal != 3000;

-- 같다 =
-- 다르다 != 또는 <> 또는 ^=

select * from emp
where deptno != 20;

select * from emp
where deptno != 20
and deptno != 10;

select * from emp
where deptno = 30
and sal <= 2000; 

select * from emp
where not deptno = 30;

-- 2000미만 또는 3000 이상 출력
select * from emp
where sal < 2000
or sal >= 3000;

-- 2000 이상 그리고 3000 미만이 아닌 것
select * from emp
where
not (sal >= 2000 and sal < 3000);

select * from emp
where job = 'MANAGER' or job = 'SALESMAN' or job = 'CLERK';

select * from emp
where job  in ('MANAGER', 'SALESMAN', 'CLERK');

select * from emp
where job not in ('MANAGER', 'SALESMAN', 'CLERK');

select * from emp
where deptno in (10, 20);

select * from emp
where deptno not in (10, 20);

select * from emp
where sal between 2000 and 3000;
-- sal >= 2000 and sal <= 3000과 같다.

select * from emp
where ename like '%A%';
-- 시작, 끝, 중간에 관계 없이 A를 포함한 모든 것 (오빠랑 맛집ㅋㅋ 검색)

select * from emp
where ename like '_L%';
-- _는 어떤 글씨든 딱 한 글자를 뜻한다. 

select * from emp
where ename like '____';
-- 4가지 철자로 된 이름 검색

select * from emp
where ename not like '____';

select * from emp
where ename not like '%AM%';

select * from emp
where ename like 'A\_A' escape '\' ;

select * from emp
where comm <= 400;
-- 400 이하라고 했을 때, null은 조회가 안 된다.

select * from emp
where comm is null;

select * from emp
where comm is not null;

select comm, comm+10 from emp;
-- null은 연산도 안 된다.

select * from emp
where mgr is null;

select * from emp
where deptno = 10
union
select * from emp
where deptno = 20;

select empno, ename, sal, deptno
from emp
where deptno = 10
union
select empno, ename, sal
from emp
where deptno = 20;
-- 에러 ORA-01789 컬럼의 숫자가 다르다. 

select empno, ename, sal, deptno
from emp
where deptno = 10
union
select empno, ename, sal, deptno
from emp
where deptno = 20;
-- 순서와 갯수를 맞춰주니 잘 맞아요. 

select empno, ename, sal, deptno
from emp
where deptno = 10
union
select ename, empno, deptno, sal
from emp
where deptno = 20;
-- 에러 : ORA-01790 대응하는 식과 같은 데이터 유형이여야 한다. (숫자는 숫자, 영어는 영어)

select empno, ename, sal, deptno
from emp
where deptno = 10
union
select sal, ename, sal, deptno
from emp
where deptno = 20;
-- 타입이 같으면 OK. 컬럼의 의미는 신경쓰지 않는다.

select empno, ename, sal, deptno
from emp
where deptno = 10
union
select empno, ename, sal, deptno
from emp
where deptno = 10;
-- union : 한 줄의 모든 내용이 중복되는 경우가 있으면 중복을 제거하고 출력.

select empno, ename, sal, deptno
from emp
where deptno = 10
union all
select empno, ename, sal, deptno
from emp
where deptno = 10;
-- union all : 중복에 관계 없이 모든 줄을 표시

-- Q1
select * from emp
where ename like '%S';

-- Q2
select empno, ename, sal, deptno from emp
where deptno = 30 and job = 'SALESMAN';

--Q3 (1)
select empno, ename, job, sal, deptno from emp
where deptno in (20, 30)
and sal > 2000;

--Q3 (2)
select empno, ename, job, sal, deptno from emp
where deptno = 20
and sal > 2000
union /* 보통 all을 많이 쓴다. */
select empno, ename, job, sal, deptno from emp
where deptno = 30
and sal > 2000;

--Q4
select * from emp
where not (sal >= 2000
and sal <= 3000);

--Q5
select ename, empno, sal, deptno from emp
where sal not between 1000 and 2000
and deptno = 30
and ename like '%E%';

--Q6
select * from emp
where comm is null
and mgr is not null
and job in ('MANAGER', 'CLERK')
and ename not like '_L%';

select * from dual;

select upper('ABC') from dual;
select lower('ABC') from dual;
select initcap('ABC') from dual;
-- dual 테이블에 직접 데이터를 넣었음. 

select lower(ename) from emp;
select upper(ename) from emp;

select upper(lower(ename)) from emp;
--괄호 안에 지정된 데이터를 한 번 더 감싸도 된다. 어차피 대문자가 나오긴할 것임.

select * from emp
where ename like '%A%' or ename like '%a%';
--대소문자 구분 없이 검색
select * from emp
where ename like in('%A%','%a%');
-- like은 =으로 묶을 수 있는 애만 가능. or을 써야한다.

select * from emp
where lower(ename) like lower('%a%');
-- upper, lower은 대소문자 구분 없이 like 검색할 때 딱 좋다.

select * from emp
where lower(ename) like ('%a%');

select ename, length(ename)
from emp;

select length('abc') 알파벳,length('한글') 훈민정음 from dual;

select ename, length(ename) from emp
where length(ename) >= 5;

select length('한글'), lengthb('한글') from dual;

select * from emp
where ename like '%D%A%';

-- substr(글씨, 시작 위치, 몇 개)
-- substr(글씨, 시작 위치) : 시작 위치부터 끝까지

select '123456', substr('123456', 3, 2) from dual; /* 34만 출력 */
select '123456', substr('123456', 2, 3) from dual; /* 234만 출력 */

select job, substr(job, 1, 2) "앞에 거 두 글자" /* (job, 0, 2) 적어도 OK */
from emp;

select job, substr(job, 3, 3), substr(job, 4), substr(job, 4, 100),
substr(job, 44, 100) -- 실제 길이보다 시작 위치가 큰 경우 null
from emp;

select job, substr(job, -3) from emp; 
-- 맨 뒤 3글자에서부터 끝까지 = 맨 뒤 3글자만 출력

select substr(1234,2) from dual;

select '010-2437-3063', replace('010-2437-3063','-', ' '),
replace('010-2437-3063','-')   /* 안 적으면 없앰 */
from dual;

select '010-2437-3063', replace('010-2437-3063','-', '**')
from dual;

select ename, replace(ename, 'A', 'ㅋ')
from emp;

select ename, replace(ename,substr(ename, 0, 2),'**')
from emp;
--문제 2

select ename, length(ename)/2 from emp;
-- 문제 3-0

select ename, replace(ename,substr(ename,0,length(ename)/2),'*')
from emp;
--문제 3-1

select ename, replace(ename,substr(ename,-length(ename)/2),'*')
from emp;
--문제 3-2



-- 3-1
-- ename의 앞에 반절 모두 *로 처리 length > substr > replace
select replace(ename, substr(ename, 0, length(ename)/2), '*')
from emp;

-- 3-2
-- ename의 뒤의 반절 모두 *로 처리 length > substr > replace
select replace(ename, substr(ename, length(ename)/2+1), '*')
from emp;

select 'oracle',
lpad('oracle', 10, '#') as lpad_1,
rpad('oracle', 10, '*') as rpad_1,
lpad('oracle', 10) as lpad_2,
rpad('oracle', 10) as rpad_2
from dual;

select rpad('950321-', 14, '*') as 도희주민,
lpad('010-2437-', 13, '*') as 도희번호
from dual;

select ename,
rpad(ename, 6, '*')
from emp;
-- 이름을 6자리로 만들고, 빈 공간의 오른쪽을 *로 채운다.

select ename,
lpad(ename, length(ename)*2, '*') as 두우우우우배
from emp;


select '010-2437-3063', rpad(substr('010-2437-3063',0,length('010-2437-3063')-4),13, '*')
from dual;
-- 뒤 4자리를 *로 바꾸자
-- substr로 10자리 까지 만들고 . rpad 사용하면?


-- 문제2 사원의 이름을 앞에 두 글자만 보이게 하고, 나머지 *로 표시.
-- 섭스트링 > rpad
select rpad(substr(ename, 0, 2), length(ename), '*')
from emp;

-- 문제3 사원 이름의 앞글자 하나만 *로 표시.
-- 섭스트링 > lpad
select lpad(substr(ename, -length(ename)+1), length(ename), '*')
from emp;

-- 심화 : job을 대상으로 20자 크기 공간에서 가운데 정렬
-- substr(job, 0, 앞에 반) / substr (job, 0, 뒤에 반)

select substr(job, 0, length(job)/2),
substr(job, length(job)/2+1)
from emp;


select lpad (substr(job, 0, length(job)/2), 10, '*'),
rpad(substr(job, length(job)/2+1), 10, '*')
from emp;

select  
rpad(lpad (substr(job, 0, length(job)/2), 10, '*')
, 20,
rpad(substr(job, length(job)/2+1), 10, '*'))
from emp; 
--이게 왜 됨???
/* MARTIN
20-6=14/2 별을 7개
20-length(job)/2
*/

select rpad(
lpad(job, ((20-length(job))/2) + length(job), '*'),
20, '*')
from emp;

select lpad(job, (20-length(job))/2 + length(job), '*')
from emp;


select rpad(lpad(job, (length(job)+20)/2, '*'), 20, '*')
from emp;



select empno, ename, concat(empno, ename)
from emp;

select empno || ':' || ename from emp;
-- concat이랑 한 번 더 복습하긔
-- concat은 하나 밖에 연결 못하지만, 얜 여러개 쉽게 연결 가능.

select '           a     b  c           ' ,
trim(' a     b  c')
from dual;
--trim : 앞뒤 공백문자 제거. 단, 글씨 사이의 공백은 제거하지 않음.

-- 내볼까 했던 문제
-- ename의 두 번째 글자만 * 처리 (더하기 방식으로)

select round(1234.5678) as round,
round(1234.5678, 0),
round(1234.5678, 1),
from dual;
-- 두 번째 값이 없는 경우 소수점 첫째자리 반올림
-- 두 번째 값은 소수점 몇번째까지 '표시'할지
-- 두 번째 값이 음수인 경우 정수로 거슬러 올라감

select round(10.46),
round(10.46, 1),
round(10.46, -1),
round(10.46, -2)
from dual;

select trunc(10.46),
trunc(10.46, 1),
trunc(10.46, -1),
trunc(10.46, -2)
from dual;

select ceil(3.14)
from dual;

select floor(3.14)
from dual;

select ceil(-3.14) 둠따둠둠따,
floor(-3.14) 붐따붐붐따
from dual;
-- -4보다 -3이 더 크니까. 천장과 바닥으로 이해하자.

select mod(15, 6)
from dual;

select mod(1223498237, 6)
from dual;

select sysdate,
sysdate+1,
sysdate-1
from dual;
-- 지금 오라클이 설치된 pc의 시간이 나온다.
-- 하지만 설정에 따라서 기본 출력값이 날짜의 일부만 나올 수도 있다.
-- 강사 pc의 오라클은 9시간 차이 난다. (GMT Greenwich Mean Time 그리니치 천문대 평균시)

select add_months(sysdate, 3)
from dual;

select hiredate, 
add_months(hiredate, 120)
from emp;

select empno, 
ename, hiredate, sysdate
from emp
where add_months(hiredate, 384) > sysdate;

select empno + '500',
empno
from emp;
-- 컬럼에 +를 적으면 모두 숫자로 변경해서 적용한다.

select empno + '먐먐',
empno
from emp;
-- ORA-01722: invalid number 유효하지 않은 숫자. 숫자가 들어갈 자리에 문자가 들어갈 때.

select empno || '먐먐',
empno
from emp;
-- ||를 적으면 모두 문자로 변경해서 적용

select to_char(sysdate, 'YYYY/MM/DD HH24:MI:SS'),
to_char(sysdate, 'MM'),
to_char(sysdate,'MON')
from dual;

select to_char(sysdate, 'yyyy"년" mm"월" dd"일" hh24"시" mi"분" ss"초"')
from dual;

select to_date('2034/11/15', 'YYYY-MM-DD')
from dual;

select to_char(to_date('2034/11/15', 'YYYY-MM-DD'), 'yyyy-mm-dd hh24:mi:ss')
from dual;

select
    to_date('2024/11/16', 'yyyy/mm/dd') - to_date('2024/11/15 18', 'yyyy/mm/dd hh24')
from dual;

select to_date('1995/03/21', 'yyyy/mm/dd')- to_date(sysdate, 'yyyy/mm/dd')
from dual;

select * 
from emp
where hiredate > to_date('1981/06/01', 'YYYY/MM/DD');

select to_date('50/12/10', 'yy/mm/dd'),
to_date('50/12/10', 'rr/mm/dd')
from dual;

select to_date('2025/05/02', 'yyyy/mm/dd') - sysdate
from dual;
-- sysdate 안에는 시간까지 들어있기 때문에, 소수점까지 나온다.

select to_date(sysdate, 'yyyy/mm/dd')
from dual;

select
    comm, sal,
    comm+sal,
    nvl(comm, 0),  /* 컬럼 자체가 숫자라서 글자 못 들어감 */
    nvl(comm, 0) + sal
from emp;

select empno, ename, comm,
nvl2(comm, 3, 5)
from emp;

select
comm,
nvl2(comm, '널 아님', '널임')
from emp;


select job, sal,
decode(job,
    'MANAGER', sal * 1.1,
    'SALESMAN', sal * 1.05,
    'ANALYST', sal,
    'CLERK', sal * 1.2,
    sal * 1.03)
from emp;

select ename, sal, comm,
sal + decode(comm, 
        null, 0,
        comm)
    from emp;

select empno, ename, job, sal,
    case job
        when 'MANAGER' then sal*1.1
        when 'SALESMAN' then sal*1.05
        when 'ANALYST' then sal
        ELSE SAL*1.03
    end as upsal
from emp;

select empno, ename, comm,
    case
        when comm is null then '해당 사항 없음'
        when comm = 0 then '수당 없음'
        when comm > 0 then '수당 :' || comm
    end as comm_text
from emp;

select
    case
        when comm is null then 'N/A'
        -- 문자임.
        when comm is not null then '' || comm
        -- 얜 숫자임. 하지만 ||로 더하면 문자로 인식되는 것을 이용한다.
        else '' || comm
        -- 안 나오는 이유 : when으로 먼저 파악이 되기 때문에
    end
from emp;

-- Q2
select empno, ename, sal,
    trunc(sal/21.5, 2) day_pay,
    round(sal/21.5/8, 1) time_pay
from emp;

-- Q4
select empno, ename, mgr,
    case
        when mgr is null then '0000' 
        when to_char(mgr) like '75__' then '5555'
        when to_char(mgr) like '76__' then '6666'
        when to_char(mgr) like '77__' then '7777'
        when to_char(mgr) like '78__' then '8888'
        else to_char(mgr)
    end as chg_mgr
from emp;

select empno, ename, mgr,
    case
        when mgr is null then '0000' 
    else
        case
            when substr(mgr, 1, 2) = '75' then '5555'
            when substr(mgr, 1, 2) = '76' then '6666'
            when substr(mgr, 1, 2) = '77' then '7777'
            when substr(mgr, 1, 2) = '78' then '8888'
            else '' || mgr
        end
    end chg_mgr1
from emp;

select 
    case
        when mgr is null then '0000'     
        when substr(mgr, 2, 1) in ('5', '6', '7', '8')
        then trim(lpad(' ', 5, substr(mgr, 2, 1)))
        else '' || mgr
-- then (lpad('substr(mgr, 2, 1)', 5, substr(mgr, 2, 1)))
    end
from emp;
-- in을 사용해서 간단하게 코딩
-- 두 번째 mgr이 5,6,7,8 일때

select 
    case
        when mgr is null then '0000'     
        when substr(mgr, 2, 1) in ('5', '6', '7', '8')
        then trim(lpad(' ', 5, substr(mgr, 2, 1)))
        else nvl(to_char(mgr), '0000')
        end
from emp;

select sum(comm)
from emp;

select sum(sal + com)
from emp;

select sum(sal + nvl(comm, 0)) from emp; 

select count (*), count(sal), count(comm) from emp;
-- count도 sum처럼 null은 제외함. 그래서 count엔 *을 많이 씀.

select count (*), sum(sal), sal from emp;
-- 다중행 함수는 다중행 함수끼리, 혹은 한 줄만 있는 경우에만 쓰자. 

select count(*) from emp
where deptno = 30
and comm is not null;

select max(sal), max(ename), min(sal), min(hiredate), min(comm)
from emp;

select count(*) from emp
where ename like '%A%';


SELECT *
FROM emp
WHERE sal = (SELECT MAX(sal) FROM emp);

select avg(sal)
from emp;

select '10', sum(sal), avg(sal) from emp where deptno = 10
union all
select '20', sum(sal), avg(sal) from emp where deptno = 20
union all
select '30', sum(sal), avg(sal) from emp where deptno = 30;

select deptno, job, avg(sal), sum(sal), count(*)
from emp
group by deptno, job
order by deptno, job;

select max(sal)
from emp
where count (*) > 2
group by deptno;
-- count(*) 등은 where에서 사용할 수 없다.

select max(sal)
from emp
where sal > avg(sal);
-- 다중행 함수는 where에서 사용하지 못한다.

select deptno, job, avg(sal)
from emp
group by deptno, job
having avg(sal) >= 2000
order by deptno, job;
-- having : group by 에서만 사용
-- where에서 표현할 수 있는 건 가급적 where에서만 사용하는 게 좋다.
-- 보통은 집계함수를 조건으로 주고 싶을 때 사용한다.

/* 5 */ select job, count (*)
/* 1 */ from emp
/* 2 */ where sal > 1000
/* 3 */ group by job
/* 4 */ having count (*) >= 3
/* 6 */ order by job cnt desc;
-- 순서 

select deptno, trunc(avg(sal)), max(sal), min(sal), count(*)
from emp
group by deptno;


select job, count(*) 
from emp
group by job
having count(job) >= 3;

-- 추가문제 1
select min(sal)
from emp
where substr(to_char(hiredate),0, 2) = '81';
--where hiredate >= to_date('1981-01-01', 'yyyy-mm-dd')
-- and hiredate <= to_date('1981-12-31', 'yyyy-mm-dd')

--(select min(sal) from emp
--where to_char(hiredate, 'yyyy') = '1981');

select hiredate
from emp
where to_char(hiredate, 'yyyy') = '1981';

-- 추가 문제 2
-- 81년 ... 81년 평균 수입보다 높은 사람...?????
select count(*)
from emp
where substr(to_char(hiredate, 'YY'),0, 2) = '81'
and sal > 
(select avg(sal) from emp
where substr(to_char(hiredate),0, 2) = '81');

-- 추가 문제 3
-- deptno, max(sal)
select deptno, (max(sal) - min(sal)) 급여차이
from emp
group by deptno;

select *
from emp, dept
where emp.deptno = dept.deptno
order by empno;

select *
from emp E, dept D
where E.deptno = D.deptno
order by empno;

select ename, e.deptno
from emp e, dept d
where e.deptno = d.deptno
order by empno;

select ename, e.deptno, e.*
from emp e, dept d
where e.deptno = d.deptno
order by empno;

select * from salgrade;
select * from emp;

select  e.ename, e.sal, s.grade
from emp e, salgrade s
where
    e.sal >= s.losal
    and e.sal < s.hisal;
    
    select e1.ename, e1.mgr, e2.ename, e2. empno, e2.mgr, e3.ename, e3.empno 
    from emp e1, emp e2, emp e3
    where e1.mgr = e2.empno
    and e2.mgr = e3.empno;
    
    select e1.ename, e1.mgr, e2.ename, e2. empno, e2.mgr
    from emp e1, emp e2
    where e1.mgr = e2.empno(+);
    
    select e1.ename, e1.mgr, e2.ename, e2. empno, e2.mgr
    from emp e1, emp e2
    where e1.mgr(+) = e2.empno ;
    
select *
from emp join dept using(deptno);
-- using은 둘 다 같은 컬럼명을 사용하는 경우만 쓸 수 있다.

select *
from emp e join dept d on (e.deptno = d.deptno)
where sal <= 3000;
-- 테이블 join 조건을 on으로 분리시킨다. 

select *
from emp e1 join emp e2 on (e1.mgr = e2.empno);

select *
from emp e1 left outer join emp e2 on (e1.mgr = e2.empno);

-- Q1
select e.deptno, d.dname, e.empno, e.ename, e.sal
from emp e, dept d
where e.deptno = d.deptno
and e.sal > 2000
order by deptno;

-- Q2
select deptno, d.dname, floor(avg(e.sal)), max(e.sal), min(e.sal), count(e.ename)
from emp e join dept d using (deptno)
group by deptno, d.dname;

--Q3
select d.deptno, d.dname, e.empno, e.ename, e.job, e.sal
from emp e right outer join dept d on (e.deptno = d.deptno)
order by d.deptno;

-- 추가문제1
--사원번호, 이름, 부서명, 급여등급 출력 : 14줄
-- empno, enmae, dname, grade where e.sal < hisal / e.sal > losal
select e.empno, e.ename, d.dname, s.grade
from emp e left outer join dept d on (e.deptno = d.deptno), salgrade s
where e.sal >= s.losal
and e.sal <= s.hisal;

select *
from emp;

select *
from salgrade;

--추가문제2
--상사보다 월급이 높은 사원의 이름, 급여, 상사이름, 상사급여
-- ename, sal, mgr, sal as mgrsal
select e1.ename, e1.sal, e1.mgr, e2.sal
from emp e1 left outer join emp e2 on (e1.mgr = e2.empno)
where e1.sal > e2.sal;

select ename, sal
from emp 
where sal > (select sal
            from emp
            where ename= 'JONES');
        
-- blake 보다 높은 연봉을 받는 사람들
select ename
from emp 
where sal >= (select sal from emp where ename = 'BLAKE'); 

--jones 랑 같은 job을 가진 사람들
select ename
from emp
where job = (select job from emp where ename = 'JONES');

select * from emp
where deptno = 10;

select empno, deptno, ename from emp
where deptno = 10;

select *
from (select empno, deptno, ename from emp
        where deptno = 10);
        
select rownum, emp.* from emp;

-- Q1
select e.job, e.empno, e.ename, e.sal, e.deptno, d.dname
from emp e join dept d on (e.deptno = d.deptno)
where e.deptno = 30
and job = 'SALESMAN'
and dname = 'SALES'
order by e.sal desc;

--Q1 풀이
select job, empno, ename, sal, deptno, dname
from emp join dept using (deptno)
where job = (select job from emp
            where ename = 'ALLEN')
    order by sal desc;
-- select 에 서브쿼리가 있는 경우 한줄마다 조회하므로 비효율적일 수있다.

-- Q2
select e.empno, e.ename, d.dname, e.hiredate, d.loc, e.sal, s.grade
from emp e join dept d on (e.deptno = d.deptno)
join salgrade s on e.sal between s.losal and s.hisal
where e.sal > (select avg(sal) from emp);
-- 서브쿼리에선 별칭 지정하지 않는다.

-- Q2 풀이
select empno, ename, dname, hiredate, loc, sal, grade
from emp e, dept d, salgrade s
where e.deptno = d.deptno
and e.sal >= s.losal and e.sal <= s.hisal
and e.sal > (select avg(sal) from emp)
order by sal desc, empno;

-- Q3
select e.empno, e.ename, e.deptno, d.dname, d.loc
from emp e join dept d on (e.deptno = d.deptno)
where e.deptno = 10
and e.job not in (select job from emp where deptno = 30);


--Q4
select e.empno, e.ename, e.sal, s.grade
from emp e, salgrade s
where e.sal >= s.losal
and e.sal <= s.hisal
and e.sal > (select hisal from salgrade);

--Q4 풀이
-- Q4
select empno, ename, sal, grade
from emp e
left outer join salgrade s
on (e.sal >= s.losal and e.sal <= s.hisal)
where e.sal > (
    select max(sal) from emp where job = 'SALESMAN'
);

create table EMP_DDL (
    empno number(4), -- 숫자 4자리
    ename varchar2(10), -- 가변형 글씨 10 바이트로 제한 (효율적)
    job varchar2(9),    -- 제한보다 적은 글씨일 때, 공간이 줄어든다.
    mgr number(4),
    hiredate date,      -- 날짜
    sal number(7,2),    -- 소수점 둘째 자리까지 기록
    comm number(7,2),
    deptno number(2)
    );
    
desc emp_ddl;
select * from emp_ddl;

create table dept_ddl
    as select * from dept;
    
select * from dept_ddl;

create table emp_ddl_30
as select *
from emp
where deptno = 30;

select *
from emp_ddl_30;

create table empdept_ddl
    as select e.empno, e.ename, e.job, e.mgr, e.hiredate,
        e.sal, e.comm, d.deptno, d.dname, d.loc
        from emp e, dept d
        where 1 <> 1;
        
select * from empdept_ddl;

create table emp_alter
as select * from emp;

select * from emp_alter;

alter table emp_alter
    add HP varchar2(20);

select * from emp_alter;

alter table emp_alter
    rename column hp to tel;
    
alter table emp_alter
    modify empno number(3);
-- 수정할 때 타입의 크기가 커지는 것만 가능. 줄어드는 것은 불가능.
-- 타입을 변경할 때는 내용이 모두 null일 때만 가능하다.
    
desc emp_alter;

alter table emp_alter
drop column tel;

alter table emp_alter
modify mgr varchar2(4);

rename emp_alter to emp_rename ;
desc emp_rename ;

truncate table emp_rename;
select * from emp_rename;
drop table emp_rename;

-- 10장 INSERT
create table dept_temp
as select * from dept ;

select * from dept_temp;

insert into dept_temp (deptno, dname, loc)
    values (50, 'DATABASE', 'SEOUL');
    
insert into dept_temp (deptno, dname, loc)
    values (123, 'DATABASE', 'a50');
    -- 지정된 문자 형태 같아야함. 지정된 문자 길이에서 벗어나면 안됨, 열과 추가하는 데이터 갯수가 같아야함.

insert into dept_temp
    values (60, 'NETWORK', 'BUSAN');
    
insert into dept_temp (deptno, dname, loc)
    values (70, 'WEB', null);
    
select * from dept_temp;

insert into dept_temp (deptno, loc)
    values (90, 'INCHEON');
    
create table emp_temp
as select *
from emp
where 1 <> 1; 
    
select * from emp_temp;

insert into emp_temp (empno, ename, job, mgr, hiredate, sal, comm, deptno)
    values (2111, '이순신', 'MANAGER', 9999, to_date('07/01/2001', 'DD/MM/YYYY'),
    4000, null, 20);
    
select * from emp_temp;

insert into emp_temp (empno, ename, job, mgr, hiredate, sal, comm, deptno)
values (3111, '심청이', 'MANAGER', 9999, SYSDATE, 4000, null, 30);

insert into emp_temp
select * from emp where deptno = 10;

create table dept_temp2
as select * from dept; 

update dept_temp2
set loc = 'SEOUL';

select * from dept_temp2
where deptno = 40;


update dept_temp2
set dname = 'DATABASE',
    LOC = 'SEOUL'
where deptno = 40;

select * from emp_temp;

select * from emp_temp
where sal <= 2500;

update emp_temp
set sal = sal + 50;
where sal <= 2500;

create table emp_temp2
as select *
from emp;

select sal from emp_temp2;

update emp_temp2
set sal = sal * 1.03
where sal <= 1000;

delete from emp_temp2
where job = 'MANAGER';

select * from emp_temp2
where job = 'MANAGER';

commit;

select * from emp_temp2;
delete from emp_temp2;

rollback;

delete from emp_temp2
where deptno = 10;

create table emp_temp3
as select * from emp;

rollback;
select * from emp_temp2;

select * from user_tables;

select *
from user_indexes;

create index idx_emp_sal
on emp(sal) asc;

select * from user_ind_columns;

select * from emp
order by sal asc;

-- 강제힌트 / full에서 레인지 스캔으로 옵션이 바뀜
select /*+ index(e)*/
    *
from emp e
where sal = 3000
order by sal asc;

select * from emp_temp2;

select max(empno)+1 from emp_temp2;

insert into emp_temp2 (empno, ename) 
values ((select max(empno)+1 from emp_temp2), '신입이');

-- 시퀀스 
create sequence seq_empno --시퀀스 생성
start with 8000 -- 시작 숫자 지정 (기본값 : 1)
increment by 10; -- 증감숫자

select seq_empno.nextval from daul;
select seq_empno.nextval from dual;
select seq_empno.currval from dual;

insert into emp_temp2 (empno, ename)
values(seq_empno.nextval, '뉴비');

drop sequence seq_empno;

create table table_notnull(
    login_id varchar2(20) not null,
    login_pwd varchar2(20) not null,
    tel varchar2(20)
);

insert into table_notnull (login_id, login_pwd, tel)
values ('test_id_01', '1234', null);

select * from table_notnull;

alter table table_notnull
modify (tel not null);

select tel
from table_notnull
where tel = 0;
--tel에 not null 제약을 주려고 했는데 이미 null이 들어가 있어서 못한다.
-- 그래서 tel이 null인 값들을 일괄적으로 0으로 수정 후 제약 조건 변경

update table_notnull
    set tel = '0'
where tel is null;

select * from table_notnull;

alter table table_notnull
modify (tel not null);

alter table table_notnull
drop constraint table_notnull;
-- constraint를 통해서 삭제할 수도 있지만
-- modify를 통해서도 해결할 수 있다.

create table table_pk (
    login_id varchar2(20) primary key,
    login_pwd varchar2(20) not null,
    tel varchar2(20)
    );
    
select * from user_constraints;
select * from user_indexes;
-- primary key, PK, 중요키, 주요키, 기본키
-- not null + unique 조건
-- 생성과 동시에 index도 생성해줌
-- create table에서 컬럼을 정의하면 primary key를 지정하는 방식으로는 딱 하나만 지정 가능
-- 만약 두 개 이상을 pk로 지정 (복합키)하는 경우 alter나 primary 키 방식을 이용

insert into table_pk(login_id, login_pwd, tel)
values ('TEST_ID_01', 'PWD01', '010-2437-3063');

select * from table_pk;

insert into table_pk(login_id, login_pwd, tel)
values (null, null, null);

create table table_name (
    co11 varchar2(20),
    co12 varchar2(20),
    co13 varchar2(20),
primary key (co11, co12), -- 복합키 지정 방법 1
unique (co11)
);

insert into table_name
values ('id1', 'pw1', null);
insert into table_name
values ('id1', 'pw2', null);

create table dept_fk(
deptno number(2) constraint deptfk_deptno primary key,
dname varchar2(14),
loc varchar2(13)
);

desc dept_fk;

create table emp_fk(
    empno number(4) primary key,
    ename varchar2(10),
    deptno number(2) references dept_fk(deptno)
    );
    
desc emp_fk;

insert into emp_fk
values (1, 'a', 10);

insert into dept_fk
values (1, 'aaaa', 'AAAA');

insert into emp_fk (empno, ename, deptno)
values (100, '이름', 1);

select * from emp_fk;

update dept_fk
set deptno = 3
where deptno = 1;

insert into dept_fk (deptno, dname, loc)
values (4, 'a4', 'A4');

select * from dept_fk;

desc emp;
desc dept;