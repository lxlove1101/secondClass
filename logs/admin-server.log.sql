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
2018-10-24 17:31:55,958 [http-nio-80-exec-9] ==>  Preparing: select * from sys_user t where t.username = ? 
2018-10-24 17:31:56,030 [http-nio-80-exec-9] ==> Parameters: admin(String)
2018-10-24 17:31:56,051 [http-nio-80-exec-9] <==      Total: 1
2018-10-24 17:31:56,066 [http-nio-80-exec-9] ==>  Preparing: insert into sys_logs(userId, module, flag, remark, createTime) values(?, ?, ?, ?, now()) 
2018-10-24 17:31:56,075 [http-nio-80-exec-9] ==> Parameters: 1(Long), web端登陆(String), true(Boolean), null
2018-10-24 17:31:56,097 [http-nio-80-exec-9] <==    Updates: 1
2018-10-24 17:31:56,163 [http-nio-80-exec-7] ==>  Preparing: select distinct p.* from sys_permission p inner join sys_role_permission rp on p.id = rp.permissionId inner join sys_role_user ru on ru.roleId = rp.roleId where ru.userId = ? order by p.sort 
2018-10-24 17:31:56,170 [http-nio-80-exec-7] ==> Parameters: 1(Long)
2018-10-24 17:31:56,188 [http-nio-80-exec-7] <==      Total: 39
2018-10-24 17:31:56,250 [http-nio-80-exec-10] ==>  Preparing: select count(1) from t_notice t left join t_notice_read r on r.noticeId = t.id and r.userId = ? where t.status = 1 and r.userId is null 
2018-10-24 17:31:56,255 [http-nio-80-exec-10] ==> Parameters: 1(Long)
2018-10-24 17:31:56,265 [http-nio-80-exec-10] <==      Total: 1
2018-10-24 17:32:01,450 [http-nio-80-exec-2] ==>  Preparing: select count(1) from t_notice t left join t_notice_read r on r.noticeId = t.id and r.userId = ? where t.status = 1 and r.userId is null 
2018-10-24 17:32:01,451 [http-nio-80-exec-2] ==> Parameters: 1(Long)
2018-10-24 17:32:01,474 [http-nio-80-exec-2] <==      Total: 1
2018-10-24 17:32:02,378 [http-nio-80-exec-3] ==>  Preparing: select count(1) from t_notice t left join t_notice_read r on r.noticeId = t.id and r.userId = ? where t.status = 1 and r.userId is null 
2018-10-24 17:32:02,378 [http-nio-80-exec-3] ==> Parameters: 1(Long)
2018-10-24 17:32:02,389 [http-nio-80-exec-3] <==      Total: 1
2018-10-24 17:32:22,997 [http-nio-80-exec-1] ==>  Preparing: select * from t_dict t where t.type = ? 
2018-10-24 17:32:22,998 [http-nio-80-exec-1] ==> Parameters: userStatus(String)
2018-10-24 17:32:23,009 [http-nio-80-exec-1] <==      Total: 3
2018-10-24 17:32:23,087 [http-nio-80-exec-10] ==>  Preparing: select * from sys_role r inner join sys_role_user ru on r.id = ru.roleId where ru.userId = ? 
2018-10-24 17:32:23,089 [http-nio-80-exec-10] ==> Parameters: 1(Long)
2018-10-24 17:32:23,101 [http-nio-80-exec-10] <==      Total: 1
2018-10-24 17:32:23,114 [http-nio-80-exec-10] ==>  Preparing: select distinct p.* from sys_permission p inner join sys_role_permission rp on p.id = rp.permissionId inner join sys_role_user ru on ru.roleId = rp.roleId where ru.userId = ? order by p.sort 
2018-10-24 17:32:23,115 [http-nio-80-exec-10] ==> Parameters: 1(Long)
2018-10-24 17:32:23,130 [http-nio-80-exec-10] <==      Total: 39
2018-10-24 17:32:23,159 [http-nio-80-exec-10] ==>  Preparing: select count(1) from sys_user t 
2018-10-24 17:32:23,160 [http-nio-80-exec-10] ==> Parameters: 
2018-10-24 17:32:23,171 [http-nio-80-exec-10] <==      Total: 1
2018-10-24 17:32:23,183 [http-nio-80-exec-10] ==>  Preparing: select * from sys_user t order by username desc, nickname asc limit ?, ? 
2018-10-24 17:32:23,185 [http-nio-80-exec-10] ==> Parameters: 0(Integer), 10(Integer)
2018-10-24 17:32:23,198 [http-nio-80-exec-10] <==      Total: 2
2018-10-24 17:32:34,310 [http-nio-80-exec-6] ==>  Preparing: select count(1) from sys_user t 
2018-10-24 17:32:34,311 [http-nio-80-exec-6] ==> Parameters: 
2018-10-24 17:32:34,322 [http-nio-80-exec-6] <==      Total: 1
2018-10-24 17:32:34,334 [http-nio-80-exec-6] ==>  Preparing: select * from sys_user t order by username desc, nickname asc limit ?, ? 
2018-10-24 17:32:34,334 [http-nio-80-exec-6] ==> Parameters: 0(Integer), 10(Integer)
2018-10-24 17:32:34,346 [http-nio-80-exec-6] <==      Total: 2
2018-10-24 17:32:36,300 [http-nio-80-exec-1] ==>  Preparing: select count(1) from sys_user t 
2018-10-24 17:32:36,300 [http-nio-80-exec-1] ==> Parameters: 
2018-10-24 17:32:36,311 [http-nio-80-exec-1] <==      Total: 1
2018-10-24 17:32:36,321 [http-nio-80-exec-1] ==>  Preparing: select * from sys_user t order by username desc, nickname asc limit ?, ? 
2018-10-24 17:32:36,322 [http-nio-80-exec-1] ==> Parameters: 0(Integer), 10(Integer)
2018-10-24 17:32:36,334 [http-nio-80-exec-1] <==      Total: 2
2018-10-24 17:32:38,951 [http-nio-80-exec-4] ==>  Preparing: select count(1) from sys_user t 
2018-10-24 17:32:38,952 [http-nio-80-exec-4] ==> Parameters: 
2018-10-24 17:32:38,964 [http-nio-80-exec-4] <==      Total: 1
2018-10-24 17:32:38,976 [http-nio-80-exec-4] ==>  Preparing: select * from sys_user t order by username desc, nickname asc limit ?, ? 
2018-10-24 17:32:38,976 [http-nio-80-exec-4] ==> Parameters: 0(Integer), 10(Integer)
2018-10-24 17:32:38,989 [http-nio-80-exec-4] <==      Total: 2
2018-10-24 17:32:41,091 [http-nio-80-exec-9] ==>  Preparing: select count(1) from sys_user t 
2018-10-24 17:32:41,092 [http-nio-80-exec-9] ==> Parameters: 
2018-10-24 17:32:41,103 [http-nio-80-exec-9] <==      Total: 1
2018-10-24 17:32:41,115 [http-nio-80-exec-9] ==>  Preparing: select * from sys_user t order by username desc, nickname asc limit ?, ? 
2018-10-24 17:32:41,115 [http-nio-80-exec-9] ==> Parameters: 0(Integer), 10(Integer)
2018-10-24 17:32:41,127 [http-nio-80-exec-9] <==      Total: 2
2018-10-24 17:32:43,335 [http-nio-80-exec-7] ==>  Preparing: select count(1) from sys_user t 
2018-10-24 17:32:43,336 [http-nio-80-exec-7] ==> Parameters: 
2018-10-24 17:32:43,347 [http-nio-80-exec-7] <==      Total: 1
2018-10-24 17:32:43,358 [http-nio-80-exec-7] ==>  Preparing: select * from sys_user t order by username desc, nickname asc limit ?, ? 
2018-10-24 17:32:43,358 [http-nio-80-exec-7] ==> Parameters: 0(Integer), 10(Integer)
2018-10-24 17:32:43,371 [http-nio-80-exec-7] <==      Total: 2
2018-10-24 17:33:11,925 [http-nio-80-exec-8] ==>  Preparing: select count(1) from sys_user t 
2018-10-24 17:33:11,926 [http-nio-80-exec-8] ==> Parameters: 
2018-10-24 17:33:11,936 [http-nio-80-exec-8] <==      Total: 1
2018-10-24 17:33:11,946 [http-nio-80-exec-8] ==>  Preparing: select * from sys_user t order by username desc, nickname asc limit ?, ? 
2018-10-24 17:33:11,947 [http-nio-80-exec-8] ==> Parameters: 0(Integer), 10(Integer)
2018-10-24 17:33:11,957 [http-nio-80-exec-8] <==      Total: 2
2018-10-24 17:33:12,558 [http-nio-80-exec-2] ==>  Preparing: select count(1) from sys_user t 
2018-10-24 17:33:12,558 [http-nio-80-exec-2] ==> Parameters: 
2018-10-24 17:33:12,568 [http-nio-80-exec-2] <==      Total: 1
2018-10-24 17:33:12,580 [http-nio-80-exec-2] ==>  Preparing: select * from sys_user t order by username desc, nickname asc limit ?, ? 
2018-10-24 17:33:12,581 [http-nio-80-exec-2] ==> Parameters: 0(Integer), 10(Integer)
2018-10-24 17:33:12,594 [http-nio-80-exec-2] <==      Total: 2
2018-10-24 17:38:05,622 [http-nio-80-exec-9] ==>  Preparing: select * from sys_user t where t.username = ? 
2018-10-24 17:38:05,700 [http-nio-80-exec-9] ==> Parameters: admin(String)
2018-10-24 17:38:05,721 [http-nio-80-exec-9] <==      Total: 1
2018-10-24 17:38:05,736 [http-nio-80-exec-9] ==>  Preparing: insert into sys_logs(userId, module, flag, remark, createTime) values(?, ?, ?, ?, now()) 
2018-10-24 17:38:05,744 [http-nio-80-exec-9] ==> Parameters: 1(Long), web端登陆(String), true(Boolean), null
2018-10-24 17:38:05,768 [http-nio-80-exec-9] <==    Updates: 1
2018-10-24 17:38:05,835 [http-nio-80-exec-8] ==>  Preparing: select distinct p.* from sys_permission p inner join sys_role_permission rp on p.id = rp.permissionId inner join sys_role_user ru on ru.roleId = rp.roleId where ru.userId = ? order by p.sort 
2018-10-24 17:38:05,842 [http-nio-80-exec-8] ==> Parameters: 1(Long)
2018-10-24 17:38:05,859 [http-nio-80-exec-8] <==      Total: 39
2018-10-24 17:38:05,921 [http-nio-80-exec-1] ==>  Preparing: select count(1) from t_notice t left join t_notice_read r on r.noticeId = t.id and r.userId = ? where t.status = 1 and r.userId is null 
2018-10-24 17:38:05,924 [http-nio-80-exec-1] ==> Parameters: 1(Long)
2018-10-24 17:38:05,938 [http-nio-80-exec-1] <==      Total: 1
2018-10-24 17:38:10,743 [http-nio-80-exec-10] ==>  Preparing: select count(1) from t_notice t left join t_notice_read r on r.noticeId = t.id and r.userId = ? where t.status = 1 and r.userId is null 
2018-10-24 17:38:10,744 [http-nio-80-exec-10] ==> Parameters: 1(Long)
2018-10-24 17:38:10,772 [http-nio-80-exec-10] <==      Total: 1
2018-10-24 17:38:12,896 [http-nio-80-exec-6] ==>  Preparing: select count(1) from t_notice t left join t_notice_read r on r.noticeId = t.id and r.userId = ? where t.status = 1 and r.userId is null 
2018-10-24 17:38:12,897 [http-nio-80-exec-6] ==> Parameters: 1(Long)
2018-10-24 17:38:12,921 [http-nio-80-exec-6] <==      Total: 1
2018-10-24 17:42:18,937 [http-nio-80-exec-6] ==>  Preparing: select * from sys_user t where t.username = ? 
2018-10-24 17:42:18,938 [http-nio-80-exec-6] ==> Parameters: admin(String)
2018-10-24 17:42:18,949 [http-nio-80-exec-6] <==      Total: 1
2018-10-24 17:42:18,961 [http-nio-80-exec-6] ==>  Preparing: insert into sys_logs(userId, module, flag, remark, createTime) values(?, ?, ?, ?, now()) 
2018-10-24 17:42:18,962 [http-nio-80-exec-6] ==> Parameters: 1(Long), web端登陆(String), true(Boolean), null
2018-10-24 17:42:18,986 [http-nio-80-exec-6] <==    Updates: 1
2018-10-24 17:42:19,041 [http-nio-80-exec-8] ==>  Preparing: select distinct p.* from sys_permission p inner join sys_role_permission rp on p.id = rp.permissionId inner join sys_role_user ru on ru.roleId = rp.roleId where ru.userId = ? order by p.sort 
2018-10-24 17:42:19,042 [http-nio-80-exec-8] ==> Parameters: 1(Long)
2018-10-24 17:42:19,057 [http-nio-80-exec-8] <==      Total: 39
2018-10-24 17:42:19,088 [http-nio-80-exec-7] ==>  Preparing: select count(1) from t_notice t left join t_notice_read r on r.noticeId = t.id and r.userId = ? where t.status = 1 and r.userId is null 
2018-10-24 17:42:19,088 [http-nio-80-exec-7] ==> Parameters: 1(Long)
2018-10-24 17:42:19,100 [http-nio-80-exec-7] <==      Total: 1
2018-10-24 18:21:37,769 [http-nio-80-exec-9] ==>  Preparing: select * from sys_user t where t.username = ? 
2018-10-24 18:21:37,841 [http-nio-80-exec-9] ==> Parameters: admin(String)
2018-10-24 18:21:37,863 [http-nio-80-exec-9] <==      Total: 1
2018-10-24 18:21:37,879 [http-nio-80-exec-9] ==>  Preparing: insert into sys_logs(userId, module, flag, remark, createTime) values(?, ?, ?, ?, now()) 
2018-10-24 18:21:37,888 [http-nio-80-exec-9] ==> Parameters: 1(Long), web端登陆(String), true(Boolean), null
2018-10-24 18:21:37,913 [http-nio-80-exec-9] <==    Updates: 1
2018-10-24 18:21:38,006 [http-nio-80-exec-8] ==>  Preparing: select distinct p.* from sys_permission p inner join sys_role_permission rp on p.id = rp.permissionId inner join sys_role_user ru on ru.roleId = rp.roleId where ru.userId = ? order by p.sort 
2018-10-24 18:21:38,011 [http-nio-80-exec-8] ==> Parameters: 1(Long)
2018-10-24 18:21:38,030 [http-nio-80-exec-8] <==      Total: 39
2018-10-24 18:21:38,092 [http-nio-80-exec-1] ==>  Preparing: select count(1) from t_notice t left join t_notice_read r on r.noticeId = t.id and r.userId = ? where t.status = 1 and r.userId is null 
2018-10-24 18:21:38,096 [http-nio-80-exec-1] ==> Parameters: 1(Long)
2018-10-24 18:21:38,107 [http-nio-80-exec-1] <==      Total: 1
2018-10-24 18:21:40,922 [http-nio-80-exec-8] ==>  Preparing: select * from sys_role r inner join sys_role_user ru on r.id = ru.roleId where ru.userId = ? 
2018-10-24 18:21:40,925 [http-nio-80-exec-8] ==> Parameters: 1(Long)
2018-10-24 18:21:40,937 [http-nio-80-exec-8] <==      Total: 1
2018-10-24 18:21:40,953 [http-nio-80-exec-8] ==>  Preparing: select distinct p.* from sys_permission p inner join sys_role_permission rp on p.id = rp.permissionId inner join sys_role_user ru on ru.roleId = rp.roleId where ru.userId = ? order by p.sort 
2018-10-24 18:21:40,954 [http-nio-80-exec-8] ==> Parameters: 1(Long)
2018-10-24 18:21:40,969 [http-nio-80-exec-8] <==      Total: 39
2018-10-24 18:21:41,004 [http-nio-80-exec-8] ==>  Preparing: select count(1) from sys_role t 
2018-10-24 18:21:41,006 [http-nio-80-exec-8] ==> Parameters: 
2018-10-24 18:21:41,018 [http-nio-80-exec-8] <==      Total: 1
2018-10-24 18:21:41,031 [http-nio-80-exec-8] ==>  Preparing: select * from sys_role t order by updateTime desc limit ?, ? 
2018-10-24 18:21:41,033 [http-nio-80-exec-8] ==> Parameters: 0(Integer), 10(Integer)
2018-10-24 18:21:41,045 [http-nio-80-exec-8] <==      Total: 3
2018-10-24 18:21:43,676 [http-nio-80-exec-3] ==>  Preparing: select * from sys_permission t order by t.sort 
2018-10-24 18:21:43,677 [http-nio-80-exec-3] ==> Parameters: 
2018-10-24 18:21:43,701 [http-nio-80-exec-3] <==      Total: 39
