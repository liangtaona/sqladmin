-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('SQL执行与结果查询', '3', '1', 'sql', 'sql/sql/index', 1, 'C', '0', '0', 'sql:sql:list', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', 'SQL执行与结果查询菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('SQL执行与结果查询查询', @parentId, '1',  '#', '', 1,  'F', '0',  '0', 'sql:sql:query',        '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('SQL执行与结果查询新增', @parentId, '2',  '#', '', 1,  'F', '0',  '0', 'sql:sql:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('SQL执行与结果查询修改', @parentId, '3',  '#', '', 1,  'F', '0',  '0', 'sql:sql:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('SQL执行与结果查询删除', @parentId, '4',  '#', '', 1,  'F', '0',  '0', 'sql:sql:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('SQL执行与结果查询导出', @parentId, '5',  '#', '', 1,  'F', '0',  '0', 'sql:sql:export',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');