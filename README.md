# netty-action

Netty 实战相关


## TODO LIST

* [x] [Netty(一) SpringBoot 整合长连接心跳机制](https://crossoverjie.top/2018/05/24/netty/Netty(1)TCP-Heartbeat/)


## 安装

```shell
cd netty-action

mvn -Dmaven.test.skip=true clean package
``` 

## 启动

```shell
-- 启动 SBA
java -jar springboot-admin-1.0.0-SNAPSHOT.jar

-- 启动 服务端
java -jar netty-action-hearbeat-1.0.0-SNAPSHOT.jar

-- 启动 客户端
java -jar netty-action-heartbeat-client-1.0.0-SNAPSHOT.jar

-- 启动 第二个客户端
java -jar netty-action-heartbeat-client-1.0.0-SNAPSHOT.jar --server.port=8083 --spring.application.name=netty-heartbeat-client2 --logging.level.root=info --channel.id=101
```

## 截图
![show](https://github.com/crossoverJie/netty-action/blob/master/pic/show.gif)
![](https://ws4.sinaimg.cn/large/006tKfTcgy1frqfwembi6j31kw0o0dot.jpg)


# Contact Author
- [crossoverJie@gmail.com](mailto:crossoverJie@gmail.com)
- 微信公众号

![weixinchat.jpg](https://crossoverjie.top/uploads/weixinchat.jpg)

