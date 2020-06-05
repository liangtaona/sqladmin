-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('程序配置', '3', '1', 'program', 'source/program/index', 1, 'C', '0', '0', 'source:program:list', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '程序配置菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('程序配置查询', @parentId, '1',  '#', '', 1,  'F', '0',  '0', 'source:program:query',        '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('程序配置新增', @parentId, '2',  '#', '', 1,  'F', '0',  '0', 'source:program:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('程序配置修改', @parentId, '3',  '#', '', 1,  'F', '0',  '0', 'source:program:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('程序配置删除', @parentId, '4',  '#', '', 1,  'F', '0',  '0', 'source:program:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('程序配置导出', @parentId, '5',  '#', '', 1,  'F', '0',  '0', 'source:program:export',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');