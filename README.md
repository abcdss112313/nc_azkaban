#MyAzkaban
Azkaban是由Linkedin开源的一个批量工作流任务调度器,用于在一个工作流内以一个特定的顺序运行一组工作和流程。
Azkaban定义了一种KV文件格式来建立任务之间的依赖关系，并提供一个易于使用的web用户界面维护和跟踪你的工作流。

### 提出问题：

在研究3.0.0版本的过程中，发现有一些问题：

定时调度参数下拉框中秒选项默认不显示等问题、
代码层有一些bug(根据命令类型执行constructor实例化时)。

所以创建此项目来维护azkaban3.0.0版本，但是在无必要前提下不会进行源码修改。
### 分析问题：
花了一个礼拜把azkaban的源码过了一遍，大体掌握了azkaban的设计思想和工作流程，可以hold住azkaban了。

### 解决问题：
从azkaban-3.0.0开始，将发现过的问题一一修复，使得azkaban的使用更方便快捷，避免使用者踩坑。





### 官方QQ群：364084505
azkaban官方的使用文档:  http://azkaban.github.io/azkaban/docs/latest

相关图表：

![输入图片说明](http://git.oschina.net/uploads/images/2016/0415/094004_35beadfc_70679.png "在这里输入图片标题")

![输入图片说明](http://git.oschina.net/uploads/images/2016/0415/094038_07f0768e_70679.png "在这里输入图片标题")

用得爽的，还请多多支持我们！

<img src="http://git.oschina.net/uploads/images/2016/0504/100053_afaebf72_70679.png" width="200" height="200"/>