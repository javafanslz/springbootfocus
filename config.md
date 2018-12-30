### SpringBoot配置文件详解
#### 自定义属性
  springboot在创建时默认在src/main/resources 下创建一个配置文件application.properties,
也支持.yml格式的文件。以yml为例讲解如何自定义属性，且在程序中获取自定义属性。
   - 在application.yml中添加一下配置
```java
my:
  name: lz
  age: 24

```
   - 如果想要读取配置文件，只需要在变量中添加 **@Value("${属性名}"")** 。

```java
@RestController
public class ConfigBeanController {
    @Value("${my.name}")
    private String name;
    @Value("${my.age}")
    private int age;

    @RequestMapping("/getValue")
    public String getValue(){
        return name+"@@"+age;
    }
}

```
### 将配置文件的属性赋值给实体类
   - 创建一个实体类用于接收，使用@ConfigurationProperties(prefix = "my")，用于接收配置文件my.*的值。
```java
@ConfigurationProperties(prefix = "my")
@Component
public class ConfigBean {
    private String name;
    private int age;
    private int number;
    private String uuid;
    private int max;
    private String value;
    private String greeting;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    @Override
    public String toString() {
        return "ConfigBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", number=" + number +
                ", uuid='" + uuid + '\'' +
                ", max=" + max +
                ", value='" + value + '\'' +
                ", greeting='" + greeting + '\'' +
                '}';
    }
}

```
   - 创建Controller
```java

@RestController
public class ConfigBeanController {
    @Value("${my.name}")
    private String name;
    @Value("${my.age}")
    private int age;

    @RequestMapping("/getValue")
    public String getValue(){
        return name+"@@"+age;
    }

    @Autowired
    private ConfigBean configBean;

    @RequestMapping("/getConfig")
    public String getConfig(){
       return configBean.toString();
    }
}
```
### 自定义配置文件

  如果我们想读取除了application.yml之外的配置文件，我们该如何实现。  
   
   - 自定义一个custom.properties
```properties

com.company.name=ccod
com.company.location=bj

```
   - 配置Bean
   **@PropertySource(value = "classpath:custom.properties")** 表示自定义配置的位置， **@ConfigurationProperties(prefix = "com.company")**
   表示读取的配置前缀。注意如果加载多个自定义文件value中使用数组
   
```java

@Configuration
@PropertySource(value = "classpath:custom.properties")
@ConfigurationProperties(prefix = "com.company")
public class CustomConfigBean {
    private String name;
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "CustomConfigBean{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}

```
   - Controller
```java
@RestController
public class CustomConfigBeanController {
    @Autowired
    private CustomConfigBean customConfigBean;

    @RequestMapping("/customConfig")
    public String customConfig(){
        return customConfigBean.toString();
    }
}
```

### 多环境下的配置文件
  往往在开发、测试、现网上使用的配置文件略有不同，springboot提供一种多环境下的配置，在resources创建一个配置，格式为
application-自定义.yml，在application.yml中配置spring.profiles.active=自定义即可。
```properties
spring:
  profiles:
    active: dev
```