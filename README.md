# flyticket
flyticket manager demo

方案: SpringBoot + MyBatis + SpringSecurity + JWT 

参考博客(登陆验证部分):https://blog.csdn.net/weixin_45654405/article/details/123954041

application.yml 和 generator.properties自行补充

# application.yml

```yml
server:
  port: 8080

spring:
  datasource:
    url: jdbc:mysql://xxxxxxxx.xxxxx.xxx:xxx/xxxx?useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai
    username: xxxxx
    password: xxxxx
  redis:
    host: x.x.x.x # Redis服务器地址
    database: 0 # Redis数据库索引（默认为0）
    port: 6379 # Redis服务器连接端口
    password: xxxxxxxxxx # Redis服务器连接密码（默认为空）
    jedis:
      pool:
        max-active: 8 # 连接池最大连接数（使用负值表示没有限制）
        max-wait: -1ms # 连接池最大阻塞等待时间（使用负值表示没有限制）
        max-idle: 8 # 连接池中的最大空闲连接
        min-idle: 0 # 连接池中的最小空闲连接
    timeout: 3000ms # 连接超时时间（毫秒）

mybatis:
  mapper-locations:
    - classpath:mapper/*.xml
    - classpath*:top/**/mapper/*.xml

# 自定义jwt key
jwt:
  tokenHeader: Authorization #JWT存储的请求头
  secret: xxxxxxxxxxxxxxx #JWT加解密使用的密钥
  expiration: 604800 #JWT的超期限时间(60*60*24)(1天)
  tokenHead: Bearer  #JWT负载中拿到开头

# 自定义redis key
redis:
  key:
    prefix:
      authCode: "portal:authCode:"
    expire:
      authCode: 120 # 验证码超期时间
```
# generator.properties
```properties
jdbc.driverClass=com.mysql.cj.jdbc.Driver
jdbc.connectionURL=jdbc:mysql://xxxxxxxx.xxxxx.xxx:xxx/xxxx?useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai
jdbc.userId=xxxxxxx
jdbc.password=xxxxxxxxx
```
