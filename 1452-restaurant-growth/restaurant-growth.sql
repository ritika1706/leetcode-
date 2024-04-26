# Write your MySQL query statement below
select visited_on,
(
    select sum(amount) from customer
    where visited_on between  date_sub(c.visited_on,interval 6 day) and c.visited_on

) as amount ,
 ROUND(
        (
            SELECT SUM(amount) / 7
            FROM customer
            WHERE visited_on BETWEEN DATE_SUB(c.visited_on, interval 6 day ) AND c.visited_on
        ),
        2
    ) AS average_amount
from customer as c
where visited_on>=(
    select date_add(min(visited_on), interval 6  day)
    from customer
)
group by visited_on;