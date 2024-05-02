# Write your MySQL query statement below
SELECT 
person_name
FROM (
    select person_name,turn,sum(weight)over(order by turn asc)  as total from queue 
 ) as q
where total<=1000 
order by total desc limit 1