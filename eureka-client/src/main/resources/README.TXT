简单的服务注册demo:
1.配置文件的两种形式
	properties
	yml
2.指定加载配置文件启动，例如：application.yml 中指定加载的是application-2002.yml	
3.也可以在启动服务时动态指定配置文件
java -jar eureka-client-0.0.1-SNAPSHOT.jar --spring.profiles.active=2001
java -jar eureka-client-0.0.1-SNAPSHOT.jar --spring.profiles.active=2002
java -jar eureka-client-0.0.1-SNAPSHOT.jar --spring.profiles.active=2003

测试url：
http://localhost:2002/dc

