select * from operations;
select * from operations order by op;
select * from operations order by op, op1;
select * from operations order by op, op1 offset 10 limit 10;
select * from operations where op='minus';
select distinct op from operations;
select count(*) from operations;
select op, count(op) from operations group by op;
select op, sum(r) from operations group by op;
select * from operations join users on (users.id = operations.user_id);
select * from operations o join users u on (u.id = o.user_id);
select o.id, o.user_id from operations o;
select * from operations o inner join users u on (u.id = o.user_id); -- only not null
select * from operations o join users u on (u.id = o.user_id); -- shortcut to 'inner join'
select * from operations o left outer join users u on (u.id = o.user_id); -- full syntax
select * from operations o left join users u on (u.id = o.user_id); -- shortcut to 'left outer join'
select * from users u right outer join operations o on (u.id = o.user_id); -- full syntax
select * from users u right join operations o on (u.id = o.user_id); -- shortcut to 'right outer join'

select u.id, u.name from (select distinct user_id from operations where op='minus') as oui
                             join users u on u.id=oui.user_id



