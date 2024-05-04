# Write your MySQL query statement below
/*
select d.name as Department, e.name as Employee,e.salary as Salary from Employee e inner join Department d on e.departmentId=d.id
group by departmentId
having e.salary < (select max(salary) from Employee) limit 3


 ORDER BY MAX(salary) DESC
limit 3 

*/
SELECT d.name AS Department, e.name AS Employee, e.salary AS Salary
FROM Employee e
INNER JOIN Department d ON e.departmentId = d.id
Where  3 > (select count(distinct (e2.Salary))
            from  Employee e2
            where e2.Salary > e.Salary
           and e.departmentId = e2.departmentId)
