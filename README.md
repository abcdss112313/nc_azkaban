#Azkaban
Azkaban是由Linkedin开源的一个批量工作流任务调度器,该调度器有以下特点：
1.调度基于DAG原则，一个工作流内以一个特定的顺序运行一组工作和流程
2.调度器只支持linux内核的系统，如:redhat,ubantu,centos等
3.调度器支持任务类型:shell,java,hadoop相关任务（mapreduce）类型
4.azkaban支持分布式调度，类似与zookeeper的失败选举制度
#nc_Azkaban
1.azkaban只支持mysql数据，由于公司大部分客户采购oracle数据，故修改版本迁移到了oracle数据库
2.屏蔽掉了SSL加密协议，访问以http://访问而非https://
3.azkaban官方版本源码迁移maven管理
4.汉化处理

修改后操作方式与azkaban3.0一致，具体操作步骤请登录查看官方文档：
http://azkaban.github.io/azkaban/docs/latest/