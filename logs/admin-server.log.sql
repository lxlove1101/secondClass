2018-10-25 11:25:33,322 [http-nio-80-exec-1] ==>  Preparing: select * from sys_user t where t.username = ? 
2018-10-25 11:25:33,329 [http-nio-80-exec-1] ==> Parameters: admin(String)
2018-10-25 11:25:33,348 [http-nio-80-exec-1] <==      Total: 1
2018-10-25 11:25:33,364 [http-nio-80-exec-1] ==>  Preparing: insert into sys_logs(userId, module, flag, remark, createTime) values(?, ?, ?, ?, now()) 
2018-10-25 11:25:33,369 [http-nio-80-exec-1] ==> Parameters: 1(Long), web端登陆(String), true(Boolean), null
2018-10-25 11:25:33,393 [http-nio-80-exec-1] <==    Updates: 1
2018-10-25 11:25:33,453 [http-nio-80-exec-9] ==>  Preparing: select distinct p.* from sys_permission p inner join sys_role_permission rp on p.id = rp.permissionId inner join sys_role_user ru on ru.roleId = rp.roleId where ru.userId = ? order by p.sort 
2018-10-25 11:25:33,455 [http-nio-80-exec-9] ==> Parameters: 1(Long)
2018-10-25 11:25:33,472 [http-nio-80-exec-9] <==      Total: 39
2018-10-25 11:25:33,525 [http-nio-80-exec-1] ==>  Preparing: select count(1) from t_notice t left join t_notice_read r on r.noticeId = t.id and r.userId = ? where t.status = 1 and r.userId is null 
2018-10-25 11:25:33,526 [http-nio-80-exec-1] ==> Parameters: 1(Long)
2018-10-25 11:25:33,538 [http-nio-80-exec-1] <==      Total: 1
2018-10-25 11:25:43,159 [http-nio-80-exec-3] ==>  Preparing: select * from sys_role r inner join sys_role_user ru on r.id = ru.roleId where ru.userId = ? 
2018-10-25 11:25:43,161 [http-nio-80-exec-3] ==> Parameters: 1(Long)
2018-10-25 11:25:43,184 [http-nio-80-exec-3] <==      Total: 1
2018-10-25 11:25:43,197 [http-nio-80-exec-3] ==>  Preparing: select distinct p.* from sys_permission p inner join sys_role_permission rp on p.id = rp.permissionId inner join sys_role_user ru on ru.roleId = rp.roleId where ru.userId = ? order by p.sort 
2018-10-25 11:25:43,198 [http-nio-80-exec-3] ==> Parameters: 1(Long)
2018-10-25 11:25:43,213 [http-nio-80-exec-3] <==      Total: 39
2018-10-25 11:25:43,247 [http-nio-80-exec-3] ==>  Preparing: select count(1) from t_dict t 
2018-10-25 11:25:43,248 [http-nio-80-exec-3] ==> Parameters: 
2018-10-25 11:25:43,259 [http-nio-80-exec-3] <==      Total: 1
2018-10-25 11:25:43,272 [http-nio-80-exec-3] ==>  Preparing: select * from t_dict t order by id asc limit ?, ? 
2018-10-25 11:25:43,273 [http-nio-80-exec-3] ==> Parameters: 0(Integer), 10(Integer)
2018-10-25 11:25:43,290 [http-nio-80-exec-3] <==      Total: 9
2018-10-25 11:25:43,716 [http-nio-80-exec-9] ==>  Preparing: select * from t_dict t where t.type = ? 
2018-10-25 11:25:43,717 [http-nio-80-exec-9] ==> Parameters: noticeStatus(String)
2018-10-25 11:25:43,729 [http-nio-80-exec-9] <==      Total: 2
2018-10-25 11:25:43,759 [http-nio-80-exec-10] ==>  Preparing: select count(1) from t_notice t 
2018-10-25 11:25:43,760 [http-nio-80-exec-10] ==> Parameters: 
2018-10-25 11:25:43,771 [http-nio-80-exec-10] <==      Total: 1
2018-10-25 11:25:44,951 [http-nio-80-exec-5] ==>  Preparing: select count(1) from file_info t 
2018-10-25 11:25:44,953 [http-nio-80-exec-5] ==> Parameters: 
2018-10-25 11:25:44,964 [http-nio-80-exec-5] <==      Total: 1
2018-10-25 11:31:21,978 [http-nio-80-exec-10] ==>  Preparing: select * from sys_user t where t.username = ? 
2018-10-25 11:31:21,984 [http-nio-80-exec-10] ==> Parameters: admin(String)
2018-10-25 11:31:22,002 [http-nio-80-exec-10] <==      Total: 1
2018-10-25 11:31:22,019 [http-nio-80-exec-10] ==>  Preparing: insert into sys_logs(userId, module, flag, remark, createTime) values(?, ?, ?, ?, now()) 
2018-10-25 11:31:22,024 [http-nio-80-exec-10] ==> Parameters: 1(Long), web端登陆(String), true(Boolean), null
2018-10-25 11:31:22,050 [http-nio-80-exec-10] <==    Updates: 1
2018-10-25 11:31:22,116 [http-nio-80-exec-8] ==>  Preparing: select distinct p.* from sys_permission p inner join sys_role_permission rp on p.id = rp.permissionId inner join sys_role_user ru on ru.roleId = rp.roleId where ru.userId = ? order by p.sort 
2018-10-25 11:31:22,117 [http-nio-80-exec-8] ==> Parameters: 1(Long)
2018-10-25 11:31:22,135 [http-nio-80-exec-8] <==      Total: 39
2018-10-25 11:31:22,187 [http-nio-80-exec-7] ==>  Preparing: select count(1) from t_notice t left join t_notice_read r on r.noticeId = t.id and r.userId = ? where t.status = 1 and r.userId is null 
2018-10-25 11:31:22,188 [http-nio-80-exec-7] ==> Parameters: 1(Long)
2018-10-25 11:31:22,201 [http-nio-80-exec-7] <==      Total: 1
2018-10-25 11:31:25,522 [http-nio-80-exec-6] ==>  Preparing: select * from sys_role r inner join sys_role_user ru on r.id = ru.roleId where ru.userId = ? 
2018-10-25 11:31:25,523 [http-nio-80-exec-6] ==> Parameters: 1(Long)
2018-10-25 11:31:25,536 [http-nio-80-exec-6] <==      Total: 1
2018-10-25 11:31:25,548 [http-nio-80-exec-6] ==>  Preparing: select distinct p.* from sys_permission p inner join sys_role_permission rp on p.id = rp.permissionId inner join sys_role_user ru on ru.roleId = rp.roleId where ru.userId = ? order by p.sort 
2018-10-25 11:31:25,549 [http-nio-80-exec-6] ==> Parameters: 1(Long)
2018-10-25 11:31:25,567 [http-nio-80-exec-6] <==      Total: 39
2018-10-25 11:31:25,599 [http-nio-80-exec-6] ==>  Preparing: select count(1) from t_dict t 
2018-10-25 11:31:25,600 [http-nio-80-exec-6] ==> Parameters: 
2018-10-25 11:31:25,612 [http-nio-80-exec-6] <==      Total: 1
2018-10-25 11:31:25,624 [http-nio-80-exec-6] ==>  Preparing: select * from t_dict t order by id asc limit ?, ? 
2018-10-25 11:31:25,626 [http-nio-80-exec-6] ==> Parameters: 0(Integer), 10(Integer)
2018-10-25 11:31:25,639 [http-nio-80-exec-6] <==      Total: 9
2018-10-25 11:31:25,883 [http-nio-80-exec-10] ==>  Preparing: select * from t_dict t where t.type = ? 
2018-10-25 11:31:25,884 [http-nio-80-exec-10] ==> Parameters: noticeStatus(String)
2018-10-25 11:31:25,896 [http-nio-80-exec-10] <==      Total: 2
2018-10-25 11:31:25,934 [http-nio-80-exec-4] ==>  Preparing: select count(1) from t_notice t 
2018-10-25 11:31:25,935 [http-nio-80-exec-4] ==> Parameters: 
2018-10-25 11:31:25,946 [http-nio-80-exec-4] <==      Total: 1
2018-10-25 11:33:55,076 [http-nio-80-exec-7] ==>  Preparing: select * from sys_user t where t.username = ? 
2018-10-25 11:33:55,082 [http-nio-80-exec-7] ==> Parameters: admin(String)
2018-10-25 11:33:55,125 [http-nio-80-exec-7] <==      Total: 1
2018-10-25 11:33:55,160 [http-nio-80-exec-7] ==>  Preparing: insert into sys_logs(userId, module, flag, remark, createTime) values(?, ?, ?, ?, now()) 
2018-10-25 11:33:55,165 [http-nio-80-exec-7] ==> Parameters: 1(Long), web端登陆(String), true(Boolean), null
2018-10-25 11:33:55,228 [http-nio-80-exec-7] <==    Updates: 1
2018-10-25 11:33:55,330 [http-nio-80-exec-6] ==>  Preparing: select distinct p.* from sys_permission p inner join sys_role_permission rp on p.id = rp.permissionId inner join sys_role_user ru on ru.roleId = rp.roleId where ru.userId = ? order by p.sort 
2018-10-25 11:33:55,332 [http-nio-80-exec-6] ==> Parameters: 1(Long)
2018-10-25 11:33:55,352 [http-nio-80-exec-6] <==      Total: 39
2018-10-25 11:33:55,403 [http-nio-80-exec-8] ==>  Preparing: select count(1) from t_notice t left join t_notice_read r on r.noticeId = t.id and r.userId = ? where t.status = 1 and r.userId is null 
2018-10-25 11:33:55,404 [http-nio-80-exec-8] ==> Parameters: 1(Long)
2018-10-25 11:33:55,416 [http-nio-80-exec-8] <==      Total: 1
