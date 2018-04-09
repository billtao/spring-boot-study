# spring-boot-study
学习spring boot 开发

1、@SpringBootApplication 快速运行 spring boot 项目
2、返回json 数据,并使用JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GTM+8"） 格式化时间
3、指定JDK版本
			<!--  指定jdk 版本 为 1.8-->
	        <plugin>
			   <artifactId>maven-compiler-plugin</artifactId>
			   <configuration>
			      <source>1.8</source>
			      <target>1.8</target>
			   </configuration>
			</plugin>
4、热部署
5、定时任务 ：@Scheduled(cron="* 0/30 * * * ?")//每30分执行一次
6、使用jpa 实现数据持久化，并使用了hibernate 自动建表的支持
7、使用druid 数据库连接池，支持Oracle，MySQL postgresql，h2等的支持，对数据库连接池进行监视
	https://www.cnblogs.com/iliuyuet/p/4602471.html
8、使用thymeleaf 模块支持；Spring 官网使用这个 https://www.cnblogs.com/ZSG-DoBestMe/p/5120653.html https://www.cnblogs.com/topwill/p/7434955.html
	使用freemaker 模板支持；https://www.cnblogs.com/ChenD/p/6908246.html
	thymeleaf和freemarker是可以共存的。
9、添加jsp 的支持 ，thymeleaf 或freemaker 与jsp不能同时配置，会出错 参参考https://blog.csdn.net/zwnzfylucej/article/details/76059683
	#spring-boot 不推荐JSP，想使用JSP需要配置application.properties。 
	#添加src/main/resources/application.properties内容：
	# 页面默认前缀目录
	spring.mvc.view.prefix=/WEB-INF/jsp/
	# 响应页面默认后缀
	spring.mvc.view.suffix=.jsp
	# 自定义属性，可以在Controller中读取
	特别说明：针对el表达式，类似${hello}这个对于servlet的版本是有限制的，2.4版本版本以下是不支持的，是无法进行识别的，请注意。
 
