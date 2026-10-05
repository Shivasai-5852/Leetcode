# Write your MySQL query statement below
Select d.name as Department, e.name as Employee, e.salary as Salary
from Employee e Join Department d on e.departmentId = d.id
where 3 > (
    Select Count(Distinct e2.salary)
    From Employee e2
    Where e2.departmentId = e.departmentId
    And e2.salary > e.salary
);