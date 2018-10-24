2018-10-24 15:36:12,960 [http-nio-8085-exec-9] ==>  Preparing: select * from sys_user t where t.username = ? 
2018-10-24 15:36:12,967 [http-nio-8085-exec-9] ==> Parameters: admin(String)
2018-10-24 15:36:12,979 [http-nio-8085-exec-9] <==      Total: 1
2018-10-24 15:36:15,125 [http-nio-8085-exec-10] ==>  Preparing: select * from sys_user t where t.username = ? 
2018-10-24 15:36:15,126 [http-nio-8085-exec-10] ==> Parameters: admin(String)
2018-10-24 15:36:15,128 [http-nio-8085-exec-10] <==      Total: 1
2018-10-24 15:36:15,130 [http-nio-8085-exec-10] ==>  Preparing: insert into sys_logs(userId, module, flag, remark, createTime) values(?, ?, ?, ?, now()) 
2018-10-24 15:36:15,136 [http-nio-8085-exec-10] ==> Parameters: 1(Long), web端登陆(String), true(Boolean), null
2018-10-24 15:36:15,217 [http-nio-8085-exec-10] <==    Updates: 1
2018-10-24 15:36:15,310 [http-nio-8085-exec-10] ==>  Preparing: select distinct p.* from sys_permission p inner join sys_role_permission rp on p.id = rp.permissionId inner join sys_role_user ru on ru.roleId = rp.roleId where ru.userId = ? order by p.sort 
2018-10-24 15:36:15,315 [http-nio-8085-exec-10] ==> Parameters: 1(Long)
2018-10-24 15:36:15,326 [http-nio-8085-exec-10] <==      Total: 39
2018-10-24 15:36:15,371 [http-nio-8085-exec-6] ==>  Preparing: select count(1) from t_notice t left join t_notice_read r on r.noticeId = t.id and r.userId = ? where t.status = 1 and r.userId is null 
2018-10-24 15:36:15,373 [http-nio-8085-exec-6] ==> Parameters: 1(Long)
2018-10-24 15:36:15,377 [http-nio-8085-exec-6] <==      Total: 1
2018-10-24 15:36:20,011 [http-nio-8085-exec-7] ==>  Preparing: select * from sys_role r inner join sys_role_user ru on r.id = ru.roleId where ru.userId = ? 
2018-10-24 15:36:20,012 [http-nio-8085-exec-7] ==> Parameters: 1(Long)
2018-10-24 15:36:20,015 [http-nio-8085-exec-7] <==      Total: 1
2018-10-24 15:36:20,017 [http-nio-8085-exec-7] ==>  Preparing: select distinct p.* from sys_permission p inner join sys_role_permission rp on p.id = rp.permissionId inner join sys_role_user ru on ru.roleId = rp.roleId where ru.userId = ? order by p.sort 
2018-10-24 15:36:20,018 [http-nio-8085-exec-7] ==> Parameters: 1(Long)
2018-10-24 15:36:20,023 [http-nio-8085-exec-7] <==      Total: 39
2018-10-24 15:36:20,050 [http-nio-8085-exec-7] ==>  Preparing: select count(1) from sys_role t 
2018-10-24 15:36:20,051 [http-nio-8085-exec-7] ==> Parameters: 
2018-10-24 15:36:20,052 [http-nio-8085-exec-7] <==      Total: 1
2018-10-24 15:36:20,054 [http-nio-8085-exec-7] ==>  Preparing: select * from sys_role t order by updateTime desc limit ?, ? 
2018-10-24 15:36:20,056 [http-nio-8085-exec-7] ==> Parameters: 0(Integer), 10(Integer)
2018-10-24 15:36:20,057 [http-nio-8085-exec-7] <==      Total: 2
2018-10-24 15:36:20,658 [http-nio-8085-exec-9] ==>  Preparing: select * from sys_permission t order by t.sort 
2018-10-24 15:36:20,658 [http-nio-8085-exec-9] ==> Parameters: 
2018-10-24 15:36:20,662 [http-nio-8085-exec-9] <==      Total: 39
2018-10-24 15:36:23,623 [http-nio-8085-exec-9] ==>  Preparing: select count(1) from t_dict t 
2018-10-24 15:36:23,623 [http-nio-8085-exec-9] ==> Parameters: 
2018-10-24 15:36:23,627 [http-nio-8085-exec-9] <==      Total: 1
2018-10-24 15:36:23,628 [http-nio-8085-exec-9] ==>  Preparing: select * from t_dict t order by id asc limit ?, ? 
2018-10-24 15:36:23,629 [http-nio-8085-exec-9] ==> Parameters: 0(Integer), 10(Integer)
2018-10-24 15:36:23,633 [http-nio-8085-exec-9] <==      Total: 9
2018-10-24 15:36:24,552 [http-nio-8085-exec-7] ==>  Preparing: select count(1) from t_job t 
2018-10-24 15:36:24,553 [http-nio-8085-exec-7] ==> Parameters: 
2018-10-24 15:36:24,555 [http-nio-8085-exec-7] <==      Total: 1
2018-10-24 15:36:25,257 [http-nio-8085-exec-1] ==>  Preparing: select count(1) from t_mail t 
2018-10-24 15:36:25,258 [http-nio-8085-exec-1] ==> Parameters: 
2018-10-24 15:36:25,262 [http-nio-8085-exec-1] <==      Total: 1
2018-10-24 17:25:07,352 [http-nio-80-exec-5] ==>  Preparing: select * from sys_user t where t.username = ? 
2018-10-24 17:25:07,427 [http-nio-80-exec-5] ==> Parameters: admin(String)
2018-10-24 17:25:07,449 [http-nio-80-exec-5] <==      Total: 1
2018-10-24 17:25:07,464 [http-nio-80-exec-5] ==>  Preparing: insert into sys_logs(userId, module, flag, remark, createTime) values(?, ?, ?, ?, now()) 
2018-10-24 17:25:07,472 [http-nio-80-exec-5] ==> Parameters: 1(Long), web端登陆(String), true(Boolean), null
2018-10-24 17:25:07,495 [http-nio-80-exec-5] <==    Updates: 1
2018-10-24 17:25:07,591 [http-nio-80-exec-4] ==>  Preparing: select distinct p.* from sys_permission p inner join sys_role_permission rp on p.id = rp.permissionId inner join sys_role_user ru on ru.roleId = rp.roleId where ru.userId = ? order by p.sort 
2018-10-24 17:25:07,594 [http-nio-80-exec-4] ==> Parameters: 1(Long)
2018-10-24 17:25:07,609 [http-nio-80-exec-4] <==      Total: 39
2018-10-24 17:25:07,672 [http-nio-80-exec-6] ==>  Preparing: select count(1) from t_notice t left join t_notice_read r on r.noticeId = t.id and r.userId = ? where t.status = 1 and r.userId is null 
2018-10-24 17:25:07,674 [http-nio-80-exec-6] ==> Parameters: 1(Long)
2018-10-24 17:25:07,687 [http-nio-80-exec-6] <==      Total: 1
2018-10-24 17:26:07,630 [http-nio-80-exec-3] ==>  Preparing: select * from sys_user t where t.username = ? 
2018-10-24 17:26:07,703 [http-nio-80-exec-3] ==> Parameters: admin(String)
2018-10-24 17:26:07,724 [http-nio-80-exec-3] <==      Total: 1
2018-10-24 17:26:07,740 [http-nio-80-exec-3] ==>  Preparing: insert into sys_logs(userId, module, flag, remark, createTime) values(?, ?, ?, ?, now()) 
2018-10-24 17:26:07,749 [http-nio-80-exec-3] ==> Parameters: 1(Long), web端登陆(String), true(Boolean), null
2018-10-24 17:26:07,774 [http-nio-80-exec-3] <==    Updates: 1
2018-10-24 17:26:07,819 [http-nio-80-exec-5] ==>  Preparing: select distinct p.* from sys_permission p inner join sys_role_permission rp on p.id = rp.permissionId inner join sys_role_user ru on ru.roleId = rp.roleId where ru.userId = ? order by p.sort 
2018-10-24 17:26:07,822 [http-nio-80-exec-5] ==> Parameters: 1(Long)
2018-10-24 17:26:07,840 [http-nio-80-exec-5] <==      Total: 39
2018-10-24 17:26:07,897 [http-nio-80-exec-6] ==>  Preparing: select count(1) from t_notice t left join t_notice_read r on r.noticeId = t.id and r.userId = ? where t.status = 1 and r.userId is null 
2018-10-24 17:26:07,900 [http-nio-80-exec-6] ==> Parameters: 1(Long)
2018-10-24 17:26:07,911 [http-nio-80-exec-6] <==      Total: 1
2018-10-24 17:26:12,811 [http-nio-80-exec-8] ==>  Preparing: select * from t_dict t where t.type = ? 
2018-10-24 17:26:12,812 [http-nio-80-exec-8] ==> Parameters: userStatus(String)
2018-10-24 17:26:12,833 [http-nio-80-exec-8] <==      Total: 3
2018-10-24 17:26:12,895 [http-nio-80-exec-2] ==>  Preparing: select * from sys_role r inner join sys_role_user ru on r.id = ru.roleId where ru.userId = ? 
2018-10-24 17:26:12,897 [http-nio-80-exec-2] ==> Parameters: 1(Long)
2018-10-24 17:26:12,908 [http-nio-80-exec-2] <==      Total: 1
2018-10-24 17:26:12,920 [http-nio-80-exec-2] ==>  Preparing: select distinct p.* from sys_permission p inner join sys_role_permission rp on p.id = rp.permissionId inner join sys_role_user ru on ru.roleId = rp.roleId where ru.userId = ? order by p.sort 
2018-10-24 17:26:12,922 [http-nio-80-exec-2] ==> Parameters: 1(Long)
2018-10-24 17:26:12,937 [http-nio-80-exec-2] <==      Total: 39
2018-10-24 17:26:12,966 [http-nio-80-exec-2] ==>  Preparing: select count(1) from sys_user t 
2018-10-24 17:26:12,967 [http-nio-80-exec-2] ==> Parameters: 
2018-10-24 17:26:12,977 [http-nio-80-exec-2] <==      Total: 1
2018-10-24 17:26:12,988 [http-nio-80-exec-2] ==>  Preparing: select * from sys_user t order by username desc, nickname asc limit ?, ? 
2018-10-24 17:26:12,990 [http-nio-80-exec-2] ==> Parameters: 0(Integer), 10(Integer)
2018-10-24 17:26:13,001 [http-nio-80-exec-2] <==      Total: 2
