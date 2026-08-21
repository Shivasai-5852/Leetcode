# Write your MySQL query statement below
SELECT s.name
FROM salesperson s
WHERE s.sales_id NOT IN (
    SELECT s.sales_id
    FROM salesperson s
    JOIN orders o
        ON s.sales_id = o.sales_id
    JOIN company c
        ON c.com_id = o.com_id
    WHERE c.name = 'RED'
);