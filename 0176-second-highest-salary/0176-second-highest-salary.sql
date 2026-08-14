# Write your MySQL query statement below
Select MAX(salary) As SecondHighestSalary
From Employee
Where salary <(Select Max(salary) From Employee)