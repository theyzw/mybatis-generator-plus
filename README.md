# mybatis-generator-plus

#### 项目介绍
mybatis-generator生成带注释的实体类
引用自：https://blog.csdn.net/u011781521/article/details/78161201

#### 使用说明

1. 只保留MyCommentGenerator.java和pom.xml两个文件
2. mvn clean package打包
3. 复制mybatis-generator-plus.jar文件到模块根目录
4. 新建generatorConfig.xml文件，配置表等
5. 新建generator.sh，执行

generator.sh内容：

#!/bin/sh
java -jar mybatis-generator-plus.jar -configfile generatorConfig.xml -overwrite
