# Write your MySQL query statement below
select round(sum(relogin)/count( distinct player_id),2) as fraction
from
(
   SELECT
   player_id,
   if(DATEDIFF(event_date, MIN(event_date)  OVER(PARTITION BY player_id)) = 1,1,0)  AS relogin
  FROM Activity

) AS t