# job-schedule
基于淘宝tbschedule的分布式任务调度引擎

根据自身业务场景做了部分修改，核心源码没有修改，tbschedule源码和使用方式见： http://code.taobao.org/p/tbschedule/wiki/index/

改动1：将项目改成原项目拆分成核心模块(schedule-core)和后台任务管理模块shcedule-console，方便使用maven打包。<br/>
改动2：新增任务执行失败时回调函数，这样可以在业务代码中处理异常<br/>
改动3：将gbk编码改成utf-8编码<br/>

# 项目结构：
job-schedule<br/>
  &nbsp;&nbsp;schedule-core 任务注册、调度和处理模块<br/>
  &nbsp;&nbsp;shcedule-console 后台管理模块，主要包含jsp页面，用于管理任务、zookeeper配置，执行状态查看<br/>
  
# Notes：
我非常崇拜阿里的技术大牛们，tbschedule是一个非常有效的分布式调度框架，但在我们的业务场景中使用tbschedule时发现有些不变，，故做了微小改动。<br/>
如涉及侵权，请及时联系,谢谢!<br/>
xiankuanfeng@163.com
