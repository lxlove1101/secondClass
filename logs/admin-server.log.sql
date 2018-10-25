2018-10-25 09:17:47,728 [http-nio-80-exec-10] ==>  Preparing: select * from sys_user t where t.username = ? 
2018-10-25 09:17:47,801 [http-nio-80-exec-10] ==> Parameters: admin(String)
2018-10-25 09:17:47,833 [http-nio-80-exec-10] <==      Total: 1
2018-10-25 09:17:47,859 [http-nio-80-exec-10] ==>  Preparing: insert into sys_logs(userId, module, flag, remark, createTime) values(?, ?, ?, ?, now()) 
2018-10-25 09:17:47,867 [http-nio-80-exec-10] ==> Parameters: 1(Long), web端登陆(String), true(Boolean), null
2018-10-25 09:17:47,915 [http-nio-80-exec-10] <==    Updates: 1
2018-10-25 09:17:48,015 [http-nio-80-exec-7] ==>  Preparing: select distinct p.* from sys_permission p inner join sys_role_permission rp on p.id = rp.permissionId inner join sys_role_user ru on ru.roleId = rp.roleId where ru.userId = ? order by p.sort 
2018-10-25 09:17:48,021 [http-nio-80-exec-7] ==> Parameters: 1(Long)
2018-10-25 09:17:48,053 [http-nio-80-exec-7] <==      Total: 39
2018-10-25 09:17:48,128 [http-nio-80-exec-2] ==>  Preparing: select count(1) from t_notice t left join t_notice_read r on r.noticeId = t.id and r.userId = ? where t.status = 1 and r.userId is null 
2018-10-25 09:17:48,130 [http-nio-80-exec-2] ==> Parameters: 1(Long)
2018-10-25 09:17:48,155 [http-nio-80-exec-2] <==      Total: 1
2018-10-25 09:17:49,465 [http-nio-80-exec-6] ==>  Preparing: select * from t_dict t where t.type = ? 
2018-10-25 09:17:49,466 [http-nio-80-exec-6] ==> Parameters: userStatus(String)
2018-10-25 09:17:49,524 [http-nio-80-exec-6] <==      Total: 3
2018-10-25 09:17:49,589 [http-nio-80-exec-1] ==>  Preparing: select * from sys_role r inner join sys_role_user ru on r.id = ru.roleId where ru.userId = ? 
2018-10-25 09:17:49,591 [http-nio-80-exec-1] ==> Parameters: 1(Long)
2018-10-25 09:17:49,616 [http-nio-80-exec-1] <==      Total: 1
2018-10-25 09:17:49,640 [http-nio-80-exec-1] ==>  Preparing: select distinct p.* from sys_permission p inner join sys_role_permission rp on p.id = rp.permissionId inner join sys_role_user ru on ru.roleId = rp.roleId where ru.userId = ? order by p.sort 
2018-10-25 09:17:49,640 [http-nio-80-exec-1] ==> Parameters: 1(Long)
2018-10-25 09:17:49,666 [http-nio-80-exec-1] <==      Total: 39
2018-10-25 09:17:49,708 [http-nio-80-exec-1] ==>  Preparing: select count(1) from sys_user t 
2018-10-25 09:17:49,709 [http-nio-80-exec-1] ==> Parameters: 
2018-10-25 09:17:49,732 [http-nio-80-exec-1] <==      Total: 1
2018-10-25 09:17:49,751 [http-nio-80-exec-1] ==>  Preparing: select * from sys_user t order by username desc, nickname asc limit ?, ? 
2018-10-25 09:17:49,753 [http-nio-80-exec-1] ==> Parameters: 0(Integer), 10(Integer)
2018-10-25 09:17:49,772 [http-nio-80-exec-1] <==      Total: 2
2018-10-25 09:19:48,437 [http-nio-80-exec-1] ==>  Preparing: select * from t_dict t where t.type = ? 
2018-10-25 09:19:48,437 [http-nio-80-exec-1] ==> Parameters: sex(String)
2018-10-25 09:19:48,450 [http-nio-80-exec-1] <==      Total: 2
2018-10-25 09:19:48,474 [http-nio-80-exec-3] ==>  Preparing: select * from sys_role t 
2018-10-25 09:19:48,475 [http-nio-80-exec-3] ==> Parameters: 
2018-10-25 09:19:48,487 [http-nio-80-exec-3] <==      Total: 3
2018-10-25 09:19:51,664 [http-nio-80-exec-4] ==>  Preparing: select * from sys_role r inner join sys_role_user ru on r.id = ru.roleId where ru.userId = ? 
2018-10-25 09:19:51,665 [http-nio-80-exec-4] ==> Parameters: 1(Long)
2018-10-25 09:19:51,677 [http-nio-80-exec-4] <==      Total: 1
2018-10-25 09:19:51,688 [http-nio-80-exec-4] ==>  Preparing: select distinct p.* from sys_permission p inner join sys_role_permission rp on p.id = rp.permissionId inner join sys_role_user ru on ru.roleId = rp.roleId where ru.userId = ? order by p.sort 
2018-10-25 09:19:51,689 [http-nio-80-exec-4] ==> Parameters: 1(Long)
2018-10-25 09:19:51,704 [http-nio-80-exec-4] <==      Total: 39
2018-10-25 09:19:51,716 [http-nio-80-exec-4] ==>  Preparing: select count(1) from sys_user t 
2018-10-25 09:19:51,717 [http-nio-80-exec-4] ==> Parameters: 
2018-10-25 09:19:51,728 [http-nio-80-exec-4] <==      Total: 1
2018-10-25 09:19:51,740 [http-nio-80-exec-4] ==>  Preparing: select * from sys_user t order by username desc, nickname asc limit ?, ? 
2018-10-25 09:19:51,741 [http-nio-80-exec-4] ==> Parameters: 0(Integer), 10(Integer)
2018-10-25 09:19:51,753 [http-nio-80-exec-4] <==      Total: 2
2018-10-25 09:19:52,603 [http-nio-80-exec-2] ==>  Preparing: select * from sys_role t 
2018-10-25 09:19:52,604 [http-nio-80-exec-2] ==> Parameters: 
2018-10-25 09:19:52,616 [http-nio-80-exec-2] <==      Total: 3
2018-10-25 09:19:54,935 [http-nio-80-exec-1] ==>  Preparing: select count(1) from sys_user t 
2018-10-25 09:19:54,935 [http-nio-80-exec-1] ==> Parameters: 
2018-10-25 09:19:54,947 [http-nio-80-exec-1] <==      Total: 1
2018-10-25 09:19:54,960 [http-nio-80-exec-1] ==>  Preparing: select * from sys_user t order by username desc, nickname asc limit ?, ? 
2018-10-25 09:19:54,960 [http-nio-80-exec-1] ==> Parameters: 0(Integer), 10(Integer)
2018-10-25 09:19:54,972 [http-nio-80-exec-1] <==      Total: 2
2018-10-25 09:19:56,477 [http-nio-80-exec-3] ==>  Preparing: select * from sys_role t 
2018-10-25 09:19:56,477 [http-nio-80-exec-3] ==> Parameters: 
2018-10-25 09:19:56,489 [http-nio-80-exec-3] <==      Total: 3
2018-10-25 09:19:57,582 [http-nio-80-exec-8] ==>  Preparing: select count(1) from sys_user t 
2018-10-25 09:19:57,582 [http-nio-80-exec-8] ==> Parameters: 
2018-10-25 09:19:57,593 [http-nio-80-exec-8] <==      Total: 1
2018-10-25 09:19:57,604 [http-nio-80-exec-8] ==>  Preparing: select * from sys_user t order by username desc, nickname asc limit ?, ? 
2018-10-25 09:19:57,605 [http-nio-80-exec-8] ==> Parameters: 0(Integer), 10(Integer)
2018-10-25 09:19:57,617 [http-nio-80-exec-8] <==      Total: 2
