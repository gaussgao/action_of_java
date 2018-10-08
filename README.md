# action_of_java
xdv in java realized


## 创建ssh key、配置git
1. 设置username和email（github每次commit都会记录他们）

git config --global user.name "wenbo"

git config --global user.email "1050794513@qq.com"

2. 通过终端命令创建ssh key

ssh-keygen -t rsa -C "1050794513@qq.com"

1050794513@qq.com是我的邮件名，回车会有以下输出

Last login: Sat Jan  6 14:12:16 on ttys000
WMBdeMacBook-Pro:~ WENBO$ ssh-keygen -t rsa -C "1050794513@qq.com"
Generating public/private rsa key pair.
Enter file in which to save the key (/Users/WENBO/.ssh/id_rsa): 
/Users/WENBO/.ssh/id_rsa already exists.
Overwrite (y/n)? n
WMBdeMacBook-Pro:~ WENBO$ 
由于这里我原来已经创建过，这里我选n，没有创建过的，会要求确认路径和输入密码，我们这使用默认的一路回车就行。成功的话会在~/下生成.ssh文件夹，进去，打开id_rsa.pub，复制里面的key。
终端查看.ssh/id_rsa.pub文件

open .ssh/id_rsa.pub 
回车后，就会新弹出一个终端，然后复制里面的key。
或者用cat命令查看

cat .ssh/id_rsa.pub

