# Write your MySQL query statement below
Select d.name as Department, e.name as Employee, e.salary as Salary
from Employee e Join Department d On e.departmentId = d.id
where e.salary = (
    Select MAX(salary) from Employee where departmentId = e.departmentId
);