-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('工厂配置', '3', '1', 'storedProcedure', 'storedProcedure/storedProcedure/index', 1, 'C', '0', '0', 'storedProcedure:storedProcedure:list', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '工厂配置菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('工厂配置查询', @parentId, '1',  '#', '', 1,  'F', '0',  '0', 'storedProcedure:storedProcedure:query',        '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('工厂配置新增', @parentId, '2',  '#', '', 1,  'F', '0',  '0', 'storedProcedure:storedProcedure:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('工厂配置修改', @parentId, '3',  '#', '', 1,  'F', '0',  '0', 'storedProcedure:storedProcedure:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('工厂配置删除', @parentId, '4',  '#', '', 1,  'F', '0',  '0', 'storedProcedure:storedProcedure:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('工厂配置导出', @parentId, '5',  '#', '', 1,  'F', '0',  '0', 'storedProcedure:storedProcedure:export',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');