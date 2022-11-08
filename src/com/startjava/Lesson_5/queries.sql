select * from jaegers;
select * from jaegers where status != 'Destroyed';
select * from jaegers where mark = 'Mark-6' or mark = 'Mark-1';
select * from jaegers order by mark DESC;
select * from jaegers where launch = (select min(launch) from jaegers);
select * from jaegers where kaiju_kill = (select max(kaiju_kill) from jaegers);
select * from jaegers where kaiju_kill = (select min(kaiju_kill) from jaegers);
select avg(weight) as avg_weight from jaegers;
update jaegers set kaiju_kill = kaiju_kill + 1 where status != 'Destroyed';
delete from jaegers where status = 'Destroyed';
select * from jaegers;