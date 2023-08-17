<!-- @import "[TOC]" {cmd="toc" depthFrom=1 depthTo=6 orderedList=false} -->

# Maven 教程：基础篇——尚硅谷学习笔记 2022 年

<!-- code_chunk_output -->

- [Maven 教程：基础篇——尚硅谷学习笔记 2022 年](#maven-教程基础篇尚硅谷学习笔记-2022-年)
- [第一章 Maven 概述](#第一章-maven-概述)
  - [第一节 为什么要学习 Maven？](#第一节-为什么要学习-maven)
    - [1、Maven 作为依赖管理工具](#1-maven-作为依赖管理工具)
      - [① jar 包的规模](#1-jar-包的规模)
      - [② jar 包的来源](#2-jar-包的来源)
      - [③ jar 包之间的依赖关系](#3-jar-包之间的依赖关系)
    - [2、Maven 作为构建管理工具](#2-maven-作为构建管理工具)
      - [① 你没有注意过的构建](#1-你没有注意过的构建)
      - [② 脱离 IDE 环境仍需构建](#2-脱离-ide-环境仍需构建)
    - [3、结论](#3-结论)
  - [第二节 什么是 Maven？](#第二节-什么是-maven)
    - [1、构建](#1-构建)
    - [2、依赖](#2-依赖)
    - [3、Maven 的工作机制](#3-maven-的工作机制)
- [第二章 Maven 核心程序解压和配置](#第二章-maven-核心程序解压和配置)
  - [第一节 Maven 核心程序解压与配置](#第一节-maven-核心程序解压与配置)
    - [1、Maven 官网地址](#1-maven-官网地址)
    - [2、解压 Maven 核心程序](#2-解压-maven-核心程序)
    - [3、指定本地仓库](#3-指定本地仓库)
    - [4、配置阿里云提供的镜像仓库](#4-配置阿里云提供的镜像仓库)
      - [① 将原有的例子配置注释掉](#1-将原有的例子配置注释掉)
      - [② 加入我们的配置](#2-加入我们的配置)
    - [5、配置 Maven 工程的基础 JDK 版本](#5-配置-maven-工程的基础-jdk-版本)
  - [第二节 配置环境变量](#第二节-配置环境变量)
    - [1、检查 JAVAHOME 配置是否正确](#1-检查-javahome-配置是否正确)
    - [2、配置 MAVENHOME](#2-配置-mavenhome)
    - [3、配置 PATH](#3-配置-path)
    - [4、验证](#4-验证)
- [第三章 使用 Maven：命令行环境](#第三章-使用-maven命令行环境)
  - [第一节 实验一：根据坐标创建 Maven 工程](#第一节-实验一根据坐标创建-maven-工程)
    - [1、Maven 核心概念：坐标](#1-maven-核心概念坐标)
      - [① 数学中的坐标](#1-数学中的坐标)
      - [② Maven 中的坐标](#2-maven-中的坐标)
        - [[1] 向量说明](#1-向量说明)
        - [[2] 三个向量的取值方式](#2-三个向量的取值方式)
      - [③ 坐标和仓库中 jar 包的存储路径之间的对应关系](#3-坐标和仓库中-jar-包的存储路径之间的对应关系)
    - [2、实验操作](#2-实验操作)
      - [① 创建目录作为后面操作的工作空间](#1-创建目录作为后面操作的工作空间)
      - [② 在工作空间目录下打开命令行窗口](#2-在工作空间目录下打开命令行窗口)
      - [③ 使用命令生成 Maven 工程](#3-使用命令生成-maven-工程)
      - [④ 调整](#4-调整)
      - [⑤ 自动生成的 pom.xml 解读](#5-自动生成的-pomxml-解读)
    - [3、Maven 核心概念：POM](#3-maven-核心概念pom)
      - [① 含义](#1-含义)
      - [② 模型化思想](#2-模型化思想)
      - [③ 对应的配置文件](#3-对应的配置文件)
    - [4、Maven 核心概念：约定的目录结构](#4-maven-核心概念约定的目录结构)
      - [① 各个目录的作用](#1-各个目录的作用)
      - [② 约定目录结构的意义](#2-约定目录结构的意义)
      - [③ 约定大于配置](#3-约定大于配置)
  - [第二节 实验二：在 Maven 工程中编写代码](#第二节-实验二在-maven-工程中编写代码)
    - [1、主体程序](#1-主体程序)
    - [2、测试程序](#2-测试程序)
  - [第三节 实验三：执行 Maven 的构建命令](#第三节-实验三执行-maven-的构建命令)
    - [1、要求](#1-要求)
    - [2、清理操作](#2-清理操作)
    - [3、编译操作](#3-编译操作)
    - [4、测试操作](#4-测试操作)
    - [5、打包操作](#5-打包操作)
    - [6、安装操作](#6-安装操作)
  - [第四节 实验四：创建 Maven 版的 Web 工程](#第四节-实验四创建-maven-版的-web-工程)
    - [1、说明](#1-说明)
    - [2、操作](#2-操作)
    - [3、生成的 pom.xml](#3-生成的-pomxml)
    - [4、生成的 Web 工程的目录结构](#4-生成的-web-工程的目录结构)
    - [5、创建 Servlet](#5-创建-servlet)
      - [① 在 main 目录下创建 java 目录](#1-在-main-目录下创建-java-目录)
      - [② 在 java 目录下创建 Servlet 类所在的包的目录](#2-在-java-目录下创建-servlet-类所在的包的目录)
      - [③ 在包下创建 Servlet 类](#3-在包下创建-servlet-类)
      - [④ 在 web.xml 中注册 Servlet](#4-在-webxml-中注册-servlet)
    - [6、在 index.jsp 页面编写超链接](#6-在-indexjsp-页面编写超链接)
    - [7、编译](#7-编译)
    - [8、配置对 servlet-api.jar 包的依赖](#8-配置对-servlet-apijar-包的依赖)
    - [9、将 Web 工程打包为 war 包](#9-将-web-工程打包为-war-包)
    - [10、将 war 包部署到 Tomcat 上运行](#10-将-war-包部署到-tomcat-上运行)
  - [第五节 实验五：让 Web 工程依赖 Java 工程](#第五节-实验五让-web-工程依赖-java-工程)
    - [1、观念](#1-观念)
    - [2、操作](#2-操作-1)
    - [3、在 Web 工程中，编写测试代码](#3-在-web-工程中编写测试代码)
      - [① 补充创建目录](#1-补充创建目录)
      - [② 确认 Web 工程依赖了 junit](#2-确认-web-工程依赖了-junit)
      - [③ 创建测试类](#3-创建测试类)
    - [4、执行 Maven 命令](#4-执行-maven-命令)
      - [① 测试命令](#1-测试命令)
      - [② 打包命令](#2-打包命令)
      - [③ 查看当前 Web 工程所依赖的 jar 包的列表](#3-查看当前-web-工程所依赖的-jar-包的列表)
      - [④ 以树形结构查看当前 Web 工程的依赖信息](#4-以树形结构查看当前-web-工程的依赖信息)
  - [第六节 实验六：测试依赖的范围](#第六节-实验六测试依赖的范围)
    - [1、依赖范围](#1-依赖范围)
      - [① compile 和 test 对比](#1-compile-和-test-对比)
      - [② compile 和 provided 对比](#2-compile-和-provided-对比)
      - [③ 结论](#3-结论-1)
    - [2、测试](#2-测试)
      - [① 验证 compile 范围对 main 目录有效](#1-验证-compile-范围对-main-目录有效)
      - [② 验证 test 范围对 main 目录无效](#2-验证-test-范围对-main-目录无效)
      - [③ 验证 test 和 provided 范围不参与服务器部署](#3-验证-test-和-provided-范围不参与服务器部署)
      - [④ 验证 provided 范围对测试程序有效](#4-验证-provided-范围对测试程序有效)
  - [第七节 实验七：测试依赖的传递性](#第七节-实验七测试依赖的传递性)
    - [1、依赖的传递性](#1-依赖的传递性)
      - [① 概念](#1-概念)
      - [② 传递的原则](#2-传递的原则)
    - [2、使用 compile 范围依赖 spring-core](#2-使用-compile-范围依赖-spring-core)
    - [3、验证 test 和 provided 范围不能传递](#3-验证-test-和-provided-范围不能传递)
  - [第八节 实验八：测试依赖的排除](#第八节-实验八测试依赖的排除)
    - [1、概念](#1-概念-1)
    - [2、配置方式](#2-配置方式)
    - [3、测试](#3-测试)
  - [第九节 实验九：继承](#第九节-实验九继承)
    - [1、概念](#1-概念-2)
    - [2、作用](#2-作用)
    - [3、举例](#3-举例)
    - [4、操作](#4-操作)
      - [① 创建父工程](#1-创建父工程)
      - [② 创建模块工程](#2-创建模块工程)
      - [③ 查看被添加新内容的父工程 pom.xml](#3-查看被添加新内容的父工程-pomxml)
      - [④ 解读子工程的 pom.xml](#4-解读子工程的-pomxml)
      - [⑤ 在父工程中配置依赖的统一管理](#5-在父工程中配置依赖的统一管理)
      - [⑥ 子工程中引用那些被父工程管理的依赖](#6-子工程中引用那些被父工程管理的依赖)
      - [⑦ 在父工程中升级依赖信息的版本](#7-在父工程中升级依赖信息的版本)
      - [⑧ 在父工程中声明自定义属性](#8-在父工程中声明自定义属性)
    - [5、实际意义](#5-实际意义)
  - [第十节 实验十：聚合](#第十节-实验十聚合)
    - [1、聚合本身的含义](#1-聚合本身的含义)
    - [2、Maven 中的聚合](#2-maven-中的聚合)
    - [3、好处](#3-好处)
    - [4、聚合的配置](#4-聚合的配置)
    - [5、依赖的配置](#5-依赖的配置)
    - [6、依赖循环问题](#6-依赖循环问题)
- [第四章 使用 Maven：IDEA 环境](#第四章-使用-mavenidea-环境)
  - [第一节 创建父工程](#第一节-创建父工程)
    - [1、创建 Project](#1-创建-project)
    - [2、开启自动导入](#2-开启自动导入)
  - [第二节 配置 Maven 信息](#第二节-配置-maven-信息)
  - [第三节 创建 Java 模块工程](#第三节-创建-java-模块工程)
  - [第四节 创建 Web 模块工程](#第四节-创建-web-模块工程)
    - [1、创建模块](#1-创建模块)
    - [2、修改打包方式](#2-修改打包方式)
    - [3、Web 设定](#3-web-设定)
    - [4、借助 IDEA 生成 web.xml](#4-借助-idea-生成-webxml)
    - [5、设置 Web 资源的根目录](#5-设置-web-资源的根目录)
  - [第五节 其他操作](#第五节-其他操作)
    - [1、在 IDEA 中执行 Maven 命令](#1-在-idea-中执行-maven-命令)
      - [① 直接执行](#1-直接执行)
      - [② 手动输入](#2-手动输入)
    - [2、在 IDEA 中查看某个模块的依赖信息](#2-在-idea-中查看某个模块的依赖信息)
    - [3、工程导入](#3-工程导入)
      - [① 来自版本控制系统](#1-来自版本控制系统)
      - [② 来自工程目录](#2-来自工程目录)
        - [[1] 工程压缩包](#1-工程压缩包)
        - [[2] 解压](#2-解压)
        - [[3] 打开](#3-打开)
        - [[4] 设置 Maven 核心程序位置](#4-设置-maven-核心程序位置)
    - [4、模块导入](#4-模块导入)
      - [① 情景重现](#1-情景重现)
      - [② 导入 Java 类型模块](#2-导入-java-类型模块)
        - [[1] 找到老师发的工程目录](#1-找到老师发的工程目录)
        - [[2] 复制我们想要导入的模块目录](#2-复制我们想要导入的模块目录)
        - [[3] 粘贴到我们自己工程目录下](#3-粘贴到我们自己工程目录下)
        - [[4] 在 IDEA 中执行导入](#4-在-idea-中执行导入)
        - [[5] 修改 pom.xml](#5-修改-pomxml)
        - [[6] 最终效果](#6-最终效果)
      - [③ 导入 Web 类型模块](#3-导入-web-类型模块)
- [第五章 其他核心概念](#第五章-其他核心概念)
  - [1、生命周期](#1-生命周期)
    - [① 作用](#1-作用)
    - [② 三个生命周期](#2-三个生命周期)
    - [③ 特点](#3-特点)
  - [2、插件和目标](#2-插件和目标)
    - [① 插件](#1-插件)
    - [② 目标](#2-目标)
  - [3、仓库](#3-仓库)

<!-- /code_chunk_output -->

# 第一章 Maven 概述

## 第一节 为什么要学习 Maven？

### 1、Maven 作为依赖管理工具

#### ① jar 包的规模

随着我们使用越来越多的框架，或者框架封装程度越来越高，项目中使用的 jar 包也越来越多。项目中，一个模块里面用到上百个 jar 包是非常正常的。

比如下面的例子，我们只用到 SpringBoot、SpringCloud 框架中的三个功能：

- Nacos 服务注册发现

- Web 框架环境

- 图模板技术 Thymeleaf

最终却导入了 106 个 jar 包：

> org.springframework.security:spring-security-rsa:jar:1.0.9.RELEASE:compile
> com.netflix.ribbon: ribbon:jar:2.3.0:compile
> org.springframework.boot:spring-boot-starter-thymeleaf:jar:2.3.6.RELEASE:compile
> commons-configuration:commons-configuration:jar:1.8:compile
> org.apache.logging.log4j:log4j-api:jar:2.13.3:compile
> org.springframework:spring-beans:jar:5.2.11.RELEASE:compile
> org.springframework.cloud:spring-cloud-starter-netflix-ribbon:jar:2.2.6.RELEASE:compile
> org.apache.tomcat.embed:tomcat-embed-websocket:jar:9.0.39:compile
> com.alibaba.cloud:spring-cloud-alibaba-commons:jar:2.2.6.RELEASE:compile
> org.bouncycastle:bcprov-jdk15on:jar:1.64:compile
> org.springframework.security:spring-security-crypto:jar:5.3.5.RELEASE:compile
> org.apache.httpcomponents:httpasyncclient:jar:4.1.4:compile
> com.google.j2objc:j2objc-annotations:jar:1.3:compile
> com.fasterxml.jackson.core:jackson-databind:jar:2.11.3:compile
> io.reactivex:rxjava:jar:1.3.8:compile
> ch.qos.logback:logback-classic:jar:1.2.3:compile
> org.springframework:spring-web:jar:5.2.11.RELEASE:compile
> io.reactivex:rxnetty-servo:jar:0.4.9:runtime
> org.springframework:spring-core:jar:5.2.11.RELEASE:compile
> io.github.openfeign.form:feign-form-spring:jar:3.8.0:compile
> io.github.openfeign.form:feign-form:jar:3.8.0:compile
> com.netflix.ribbon:ribbon-loadbalancer:jar:2.3.0:compile
> org.apache.httpcomponents:httpcore:jar:4.4.13:compile
> org.thymeleaf.extras:thymeleaf-extras-java8time:jar:3.0.4.RELEASE:compile
> org.slf4j:jul-to-slf4j:jar:1.7.30:compile
> com.myxh.demo:demo09-base-entity:jar:1.0-SNAPSHOT:compile
> org.yaml:snakeyaml:jar:1.26:compile
> org.springframework.boot:spring-boot-starter-logging:jar:2.3.6.RELEASE:compile
> io.reactivex:rxnetty-contexts:jar:0.4.9:runtime
> org.apache.httpcomponents:httpclient:jar:4.5.13:compile
> io.github.openfeign:feign-core:jar:10.10.1:compile
> org.springframework.boot:spring-boot-starter-aop:jar:2.3.6.RELEASE:compile
> org.hdrhistogram:HdrHistogram:jar:2.1.9:compile
> org.springframework:spring-context:jar:5.2.11.RELEASE:compile
> commons-lang:commons-lang:jar:2.6:compile
> io.prometheus:simpleclient:jar:0.5.0:compile
> ch.qos.logback:logback-core:jar:1.2.3:compile
> org.springframework:spring-webmvc:jar:5.2.11.RELEASE:compile
> com.sun.jersey:jersey-core:jar:1.19.1:runtime
> javax.ws.rs:jsr311-api:jar:1.1.1:runtime
> javax.inject:javax.inject:jar:1:runtime
> org.springframework.cloud:spring-cloud-openfeign-core:jar:2.2.6.RELEASE:compile
> com.netflix.ribbon:ribbon-core:jar:2.3.0:compile
> com.netflix.hystrix:hystrix-core:jar:1.5.18:compile
> com.netflix.ribbon:ribbon-transport:jar:2.3.0:runtime
> org.springframework.boot:spring-boot-starter-json:jar:2.3.6.RELEASE:compile
> org.springframework.cloud:spring-cloud-starter-openfeign:jar:2.2.6.RELEASE:compile
> com.fasterxml.jackson.module:jackson-module-parameter-names:jar:2.11.3:compile
> com.sun.jersey.contribs:jersey-apache-client4:jar:1.19.1:runtime
> io.github.openfeign:feign-hystrix:jar:10.10.1:compile
> io.github.openfeign:feign-slf4j:jar:10.10.1:compile
> com.alibaba.nacos:nacos-client:jar:1.4.2:compile
> org.apache.httpcomponents:httpcore-nio:jar:4.4.13:compile
> com.sun.jersey:jersey-client:jar:1.19.1:runtime
> org.springframework.cloud:spring-cloud-context:jar:2.2.6.RELEASE:compile
> org.glassfish:jakarta.el:jar:3.0.3:compile
> org.apache.logging.log4j:log4j-to-slf4j:jar:2.13.3:compile
> com.fasterxml.jackson.datatype:jackson-datatype-jsr310:jar:2.11.3:compile
> org.springframework.cloud:spring-cloud-commons:jar:2.2.6.RELEASE:compile
> org.aspectj:aspectjweaver:jar:1.9.6:compile
> com.alibaba.cloud:spring-cloud-starter-alibaba-nacos-discovery:jar:2.2.6.RELEASE:compile
> com.google.guava:listenablefuture:jar:9999.0-empty-to-avoid-conflict-with-guava:compile
> com.alibaba.spring:spring-context-support:jar:1.0.10:compile
> jakarta.annotation:jakarta.annotation-api:jar:1.3.5:compile
> org.bouncycastle:bcpkix-jdk15on:jar:1.64:compile
> com.netflix.netflix-commons:netflix-commons-util:jar:0.3.0:runtime
> com.fasterxml.jackson.core:jackson-annotations:jar:2.11.3:compile
> com.google.guava:guava:jar:29.0-jre:compile
> com.google.guava:failureaccess:jar:1.0.1:compile
> org.springframework.boot:spring-boot:jar:2.3.6.RELEASE:compile
> com.fasterxml.jackson.datatype:jackson-datatype-jdk8:jar:2.11.3:compile
> com.myxh.demo:demo08-base-api:jar:1.0-SNAPSHOT:compile
> org.springframework.cloud:spring-cloud-starter-netflix-archaius:jar:2.2.6.RELEASE:compile
> org.springframework.boot:spring-boot-autoconfigure:jar:2.3.6.RELEASE:compile
> org.slf4j:slf4j-api:jar:1.7.30:compile
> commons-io:commons-io:jar:2.7:compile
> org.springframework.cloud:spring-cloud-starter:jar:2.2.6.RELEASE:compile
> org.apache.tomcat.embed:tomcat-embed-core:jar:9.0.39:compile
> io.reactivex:rxnetty:jar:0.4.9:runtime
> com.fasterxml.jackson.core:jackson-core:jar:2.11.3:compile
> com.google.code.findbugs:jsr305:jar:3.0.2:compile
> com.netflix.archaius:archaius-core:jar:0.7.6:compile
> org.springframework.boot:spring-boot-starter-web:jar:2.3.6.RELEASE:compile
> commons-codec:commons-codec:jar:1.14:compile
> com.netflix.servo:servo-core:jar:0.12.21:runtime
> com.google.errorprone:error_prone_annotations:jar:2.3.4:compile
> org.attoparser:attoparser:jar:2.0.5.RELEASE:compile
> com.myxh.demo:demo10-base-util:jar:1.0-SNAPSHOT:compile
> org.checkerframework:checker-qual:jar:2.11.1:compile
> org.thymeleaf:thymeleaf-spring5:jar:3.0.11.RELEASE:compile
> commons-fileupload:commons-fileupload:jar:1.4:compile
> com.netflix.ribbon:ribbon-httpclient:jar:2.3.0:compile
> com.netflix.netflix-commons:netflix-statistics:jar:0.1.1:runtime
> org.unbescape:unbescape:jar:1.1.6.RELEASE:compile
> org.springframework:spring-jcl:jar:5.2.11.RELEASE:compile
> com.alibaba.nacos:nacos-common:jar:1.4.2:compile
> commons-collections:commons-collections:jar:3.2.2:runtime
> javax.persistence:persistence-api:jar:1.0:compile
> com.alibaba.nacos:nacos-api:jar:1.4.2:compile
> org.thymeleaf:thymeleaf:jar:3.0.11.RELEASE:compile
> org.springframework:spring-aop:jar:5.2.11.RELEASE:compile
> org.springframework.boot:spring-boot-starter:jar:2.3.6.RELEASE:compile
> org.springframework.boot:spring-boot-starter-tomcat:jar:2.3.6.RELEASE:compile
> org.springframework.cloud:spring-cloud-netflix-ribbon:jar:2.2.6.RELEASE:compile
> org.springframework:spring-expression:jar:5.2.11.RELEASE:compile
> org.springframework.cloud:spring-cloud-netflix-archaius:jar:2.2.6.RELEASE:compile

而如果使用 Maven 来引入这些 jar 包只需要配置三个『依赖』：

```xml
<!-- Nacos 服务注册发现启动器 -->
<dependency>
    <groupId>com.alibaba.cloud</groupId>
    <artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
</dependency>

<!-- web启动器依赖 -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>

<!-- 视图模板技术 thymeleaf -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-thymeleaf</artifactId>
</dependency>
```

#### ② jar 包的来源

- 这个 jar 包所属技术的官网。官网通常是英文界面，网站的结构又不尽相同，甚至找到下载链接还发现需要通过特殊的工具下载。

- 第三方网站提供下载。问题是不规范，在使用过程中会出现各种问题。

  - jar 包的名称

  - jar 包的版本

  - jar 包内的具体细节

- 而使用 Maven 后，依赖对应的 jar 包能够自动下载，方便、快捷又规范。

#### ③ jar 包之间的依赖关系

框架中使用的 jar 包，不仅数量庞大，而且彼此之间存在错综复杂的依赖关系。依赖关系的复杂程度，已经上升到了完全不能靠人力手动解决的程度。另外，jar 包之间有可能产生冲突。进一步增加了我们在 jar 包使用过程中的难度。

下面是前面例子中 jar 包之间的依赖关系：

![jar 包之间的依赖关系](https://img-blog.csdnimg.cn/4fc5eb472add4eb39bbb040803549580.png)

而实际上 jar 包之间的依赖关系是普遍存在的，如果要由程序员手动梳理无疑会增加极高的学习成本，而这些工作又对实现业务功能毫无帮助。

而使用 Maven 则几乎不需要管理这些关系，极个别的地方调整一下即可，极大的减轻了我们的工作量。

### 2、Maven 作为构建管理工具

#### ① 你没有注意过的构建

你可以不使用 Maven，但是构建必须要做。当我们使用 IDEA 进行开发时，构建是 IDEA 替我们做的。

#### ② 脱离 IDE 环境仍需构建

![脱离 IDE 环境仍需构建](https://img-blog.csdnimg.cn/3f91083b331d4f308c7224c9f43390e6.png)

### 3、结论

- 管理规模庞大的 jar 包，需要专门工具。

- 脱离 IDE 环境执行构建操作，需要专门工具。

## 第二节 什么是 Maven？

Maven 是 Apache 软件基金会组织维护的一款专门为 Java 项目提供**构建**和**依赖**管理支持的工具。

### 1、构建

Java 项目开发过程中，构建指的是使用 **『原材料生产产品』** 的过程。

- 原材料

  - Java 源代码

  - 基于 HTML 的 Thymeleaf 文件

  - 图片

  - 配置文件

  - ###### ……

- 产品

  - 一个可以在服务器上运行的项目

构建过程包含的主要的环节：

- 清理：删除上一次构建的结果，为下一次构建做好准备

- 编译：Java 源程序编译成 .class 字节码文件

- 测试：运行提前准备好的测试程序

- 报告：针对刚才测试的结果生成一个全面的信息

- 打包

  - Java 工程：jar 包

  - Web 工程：war 包

- 安装：把一个 Maven 工程经过打包操作生成的 jar 包或 war 包存入 Maven 仓库

- 部署

  - 部署 jar 包：把一个 jar 包部署到 Nexus 私服服务器上

  - 部署 war 包：借助相关 Maven 插件（例如 cargo），将 war 包部署到 Tomcat 服务器上

### 2、依赖

如果 A 工程里面用到了 B 工程的类、接口、配置文件等等这样的资源，那么我们就可以说 A 依赖 B。例如：

- junit-4.13.1 依赖 hamcrest-core-1.3

- thymeleaf-3.0.12.RELEASE 依赖 ognl-3.1.26

  - ognl-3.1.26 依赖 javassist-3.20.0-GA

- thymeleaf-3.0.12.RELEASE 依赖 attoparser-2.0.5.RELEASE

- thymeleaf-3.0.12.RELEASE 依赖 unbescape-1.1.6.RELEASE

- thymeleaf-3.0.12.RELEASE 依赖 slf4j-api-1.7.26

依赖管理中要解决的具体问题：

- jar 包的下载：使用 Maven 之后，jar 包会从规范的远程仓库下载到本地

- jar 包之间的依赖：通过依赖的传递性自动完成

- jar 包之间的冲突：通过对依赖的配置进行调整，让某些 jar 包不会被导入

### 3、Maven 的工作机制

![Maven 的工作机制](https://img-blog.csdnimg.cn/5c0bba1ada7b43d196cbb057cccac065.png)

# 第二章 Maven 核心程序解压和配置

## 第一节 Maven 核心程序解压与配置

### 1、Maven 官网地址

首页：

[Maven – Welcome to Apache Maven (opens new window)](https://maven.apache.org/)

下载页面：

[Maven – Download Apache Maven (opens new window)](https://maven.apache.org/download.cgi)

下载链接：

![下载链接](https://img-blog.csdnimg.cn/e738b661a82d450d855ac8cea5a6addb.png)

具体下载地址：https://dlcdn.apache.org/maven/maven-3/3.9.4/binaries/apache-maven-3.9.4-bin.zip

### 2、解压 Maven 核心程序

核心程序压缩包：apache-maven-3.8.1-bin.zip，解压到非中文、没有空格的目录。例如：

![解压 Maven 核心程序](https://img-blog.csdnimg.cn/7b3fc5d49f2246be8b3e14ca087360fb.png)

在解压目录中，我们需要着重关注 Maven 的核心配置文件：conf/settings.xml

### 3、指定本地仓库

本地仓库默认值：用户家目录/.m2/repository。由于本地仓库的默认位置是在用户的家目录下，而家目录往往是在 C 盘，也就是系统盘。将来 Maven 仓库中 jar 包越来越多，仓库体积越来越大，可能会拖慢 C 盘运行速度，影响系统性能。所以建议将 Maven 的本地仓库放在其他盘符下。配置方式如下：

```xml
<!-- localRepository
  | The path to the local repository maven will use to store artifacts.
  |
  | Default: ${user.home}/.m2/repository
<localRepository>/path/to/local/repo</localRepository>
 -->
<!-- 配置 Maven 本地仓库 -->
<!-- 此目录可以等执行构建命令时由 Maven 创建 -->
<localRepository>D:/Program Files/CodePrograms/Maven/maven-repository</localRepository>
```

本地仓库这个目录，我们手动创建一个空的目录即可。

记住：一定要把 localRepository 标签从注释中拿出来。

注意：本地仓库本身也需要使用一个非中文、没有空格的目录。

### 4、配置阿里云提供的镜像仓库

Maven 下载 jar 包默认访问境外的中央仓库，而国外网站速度很慢。改成阿里云提供的镜像仓库，访问国内网站，可以让 Maven 下载 jar 包的时候速度更快。配置的方式是：

#### ① 将原有的例子配置注释掉

```xml
<!--
<mirror>
  <id>maven-default-http-blocker</id>
  <mirrorOf>external:http:*</mirrorOf>
  <name>Pseudo repository to mirror external repositories initially using HTTP.</name>
  <url>http://0.0.0.0/</url>
  <blocked>true</blocked>
</mirror>
 -->
```

#### ② 加入我们的配置

将下面 mirror 标签整体复制到 settings.xml 文件的 mirrors 标签的内部。

```xml
<mirror>
  <id>aliyunmaven</id>
  <mirrorOf>*</mirrorOf>
  <name>阿里云公共仓库</name>
  <url>https://maven.aliyun.com/repository/public</url>
</mirror>
```

### 5、配置 Maven 工程的基础 JDK 版本

如果按照默认配置运行，Java 工程使用的默认 JDK 版本是 1.4，而我们熟悉和常用的是 JDK 17 版本。修改配置的方式是：将 profile 标签整个复制到 settings.xml 文件的 profiles 标签内。

```xml
<profile>
  <id>jdk-17</id>
  <activation>
    <activeByDefault>true</activeByDefault>
    <jdk>17</jdk>
  </activation>
  <properties>
    <maven.compiler.source>17</maven.compiler.source>
    <maven.compiler.target>17</maven.compiler.target>
    <maven.compiler.compilerVersion>17</maven.compiler.compilerVersion>
  </properties>
</profile>
```

## 第二节 配置环境变量

### 1、检查 JAVAHOME 配置是否正确

Maven 是一个用 Java 语言开发的程序，它必须基于 JDK 来运行，需要通过 JAVA_HOME 来找到 JDK 的安装位置。

![检查 JAVAHOME 配置是否正确](https://img-blog.csdnimg.cn/41859594107647ea845c4376856e528b.png)

可以使用下面的命令验证：

```sh
C:\Users\17353>echo %JAVA_HOME%
D:\Program Files\CodePrograms\Java\jdk-17.0.6

C:\Users\17353>Java -version
java version "17.0.6" 2023-01-17 LTS
Java(TM) SE Runtime Environment (build 17.0.6+9-LTS-190)
Java HotSpot(TM) 64-Bit Server VM (build 17.0.6+9-LTS-190, mixed mode, sharing)
```

### 2、配置 MAVENHOME

![配置 MAVENHOME](https://img-blog.csdnimg.cn/51e1c870f6364dab9d4179add86a7378.png)

> 配置环境变量的规律：
>
> XXX_HOME 通常指向的是 bin 目录的上一级
>
> PATH 指向的是 bin 目录

### 3、配置 PATH

![配置 PATH](https://img-blog.csdnimg.cn/cb5b22958e7f4f71a05b790047ed8528.png)

### 4、验证

```sh
C:\Users\17353>mvn -v
Apache Maven 3.8.1 (05c21c65bdfed0f71a2f2ada8b84da59348c4c5d)
Maven home: D:\Program Files\CodePrograms\Maven\apache-maven-3.8.1\bin\..
Java version: 17.0.6, vendor: Oracle Corporation, runtime: D:\Program Files\CodePrograms\Java\jdk-17.0.6
Default locale: zh_CN, platform encoding: GBK
OS name: "windows 11", version: "10.0", arch: "amd64", family: "windows"
```

# 第三章 使用 Maven：命令行环境

## 第一节 实验一：根据坐标创建 Maven 工程

### 1、Maven 核心概念：坐标

#### ① 数学中的坐标

![数学中的坐标](https://img-blog.csdnimg.cn/1b88b5543f72409c80e47c92819b67f7.png)

使用 x、y、z 三个『向量』作为空间的坐标系，可以在『空间』中唯一的定位到一个『点』。

#### ② Maven 中的坐标

##### [1] 向量说明

使用三个『向量』在『Maven 的仓库』中唯一的定位到一个『jar』包。

- groupId：公司或组织的 id

- artifactId：一个项目或者是项目中的一个模块的 id

- version：版本号

##### [2] 三个向量的取值方式

- groupId：公司或组织域名的倒序，通常也会加上项目名称

  - 例如：com.myxh.maven

- artifactId：模块的名称，将来作为 Maven 工程的工程名

- version：模块的版本号，根据自己的需要设定

  - 例如：SNAPSHOT 表示快照版本，正在迭代过程中，不稳定的版本

  - 例如：RELEASE 表示正式版本

举例：

- groupId：com.myxh.maven

- artifactId：pro01-myxh-maven

- version：1.0-SNAPSHOT

#### ③ 坐标和仓库中 jar 包的存储路径之间的对应关系

坐标：

```xml
  <groupId>javax.servlet</groupId>
  <artifactId>servlet-api</artifactId>
  <version>4.0.1</version>
```

上面坐标对应的 jar 包在 Maven 本地仓库中的位置：

```xml
Maven本地仓库根目录\javax\servlet\servlet-api\4.0.1\servlet-api-4.0.1.jar
```

一定要学会根据坐标到本地仓库中找到对应的 jar 包。

### 2、实验操作

#### ① 创建目录作为后面操作的工作空间

例如：D:\CodeProjects\Java\Maven\Maven 教程课(尚硅谷)项目\maven-workspace\space

此时我们已经有了三个目录，分别是：

- Maven 核心程序：中军大帐

- Maven 本地仓库：兵营

- 本地工作空间：战场

#### ② 在工作空间目录下打开命令行窗口

![在工作空间目录下打开命令行窗口](https://img-blog.csdnimg.cn/6d4b5f041128450384ee8f184308d104.png)

#### ③ 使用命令生成 Maven 工程

![使用命令生成 Maven 工程](https://img-blog.csdnimg.cn/6f8577b57609444a820f28f17a0f51bd.png)

运行 mvn archetype:generate 命令

下面根据提示操作

> Choose a number or apply filter (format: [groupId:]artifactId, case sensitive contains): 7:【直接回车，使用默认值】
>
> Define value for property 'groupId': com.myxh.maven
>
> Define value for property 'artifactId': pro01-maven-java
>
> Define value for property 'version' 1.0-SNAPSHOT: :【直接回车，使用默认值】
>
> Define value for property 'package' com.myxh.maven: :【直接回车，使用默认值】
>
> Confirm properties configuration: groupId: com.myxh.maven artifactId: pro01-maven-java version: 1.0-SNAPSHOT package: com.myxh.maven Y: :【直接回车，表示确认。如果前面有输入错误，想要重新输入，则输入 N 再回车。】

#### ④ 调整

Maven 默认生成的工程，对 junit 依赖的是较低的 3.8.1 版本，我们可以改成较适合的 4.13.1 版本。

自动生成的 App.java 和 AppTest.java 可以删除。

```xml
<!-- dependencies 标签：配置具体依赖信息，可以包含多个 dependency 子标签 -->
<dependencies>
  <!-- dependency 标签：配置一个具体的依赖信息 -->
  <dependency>
    <!-- 坐标信息：导入哪个 jar 包，就配置它的坐标信息即可 -->
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13.1</version>

    <!-- scope 标签：配置当前依赖的范围 -->
    <scope>test</scope>
  </dependency>
</dependencies>
```

#### ⑤ 自动生成的 pom.xml 解读

```xml
<!-- project 标签：根标签，表示对当前工程进行配置、管理 -->
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <!-- modelVersion 标签:从 Maven 2 开始就固定是 4.0.0 -->
  <!-- 代表当前 pom.xml 所采用的标签结构 -->
  <modelVersion>4.0.0</modelVersion>

  <!-- 坐标信息 -->
  <!-- 在本地仓库中安装后对应的路径: -->
  <!-- com\myxh\maven\pro01-maven-java\1.0-SNAPSHOT\pro01-maven-java-1.0-SNAPSHOT.jar -->
  <!-- groupId 标签：坐标向量之一；表公司或组织开发的某一个项目 -->
  <groupId>com.myxh.maven</groupId>

  <!-- artifactId 标签：坐标向量之一；代表项目下的某一个模块 -->
  <artifactId>pro01-maven-java</artifactId>

  <!-- version 标签：坐标向量之一；代表当前模块的版木 -->
  <version>1.0-SNAPSHOT</version>

  <!-- packaging 标签：打包方式 -->
  <!-- 取值 jar：生成 jar 包，说明这是一个 Java 工程 -->
  <!-- 取值 war：生成 war 包，说明这是一个 Web 工程 -->
  <!-- 取值 pom：说明这个工程是用来管理其它工程的工程 -->
  <packaging>jar</packaging>

  <name>pro01-maven-java</name>
  <url>http://maven.apache.org</url>

  <!-- properties 标签：在 Maven 中定义属性值 -->
  <properties>
    <!-- 在构建过程中读取源码时使用的字符集 -->
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
  </properties>

  <!-- dependencies 标签：配置具体依赖信息，可以包含多个 dependency 子标签 -->
  <dependencies>
    <!-- dependency 标签：配置一个具体的依赖信息 -->
    <dependency>
      <!-- 坐标信息：导入哪个 jar 包，就配置它的坐标信息即可 -->
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.13.1</version>

      <!-- scope 标签：配置当前依赖的范围 -->
      <scope>test</scope>
    </dependency>
  </dependencies>
</project>
```

### 3、Maven 核心概念：POM

#### ① 含义

POM：Project Object Model，项目对象模型，和 POM 类似的是：DOM（Document Object Model），文档对象模型。它们都是模型化思想的具体体现。

#### ② 模型化思想

POM 表示将工程抽象为一个模型，再用程序中的对象来描述这个模型。这样我们就可以用程序来管理项目了。我们在开发过程中，最基本的做法就是将现实生活中的事物抽象为模型，然后封装模型相关的数据作为一个对象，这样就可以在程序中计算与现实事物相关的数据。

#### ③ 对应的配置文件

POM 理念集中体现在 Maven 工程根目录下 pom.xml 这个配置文件中。所以这个 pom.xml 配置文件就是 Maven 工程的核心配置文件。其实学习 Maven 就是学这个文件怎么配置，各个配置有什么用。

### 4、Maven 核心概念：约定的目录结构

#### ① 各个目录的作用

![各个目录的作用](https://img-blog.csdnimg.cn/c8bb064c6fb8453c9a714390508a116a.png)

另外还有一个 target 目录专门存放构建操作输出的结果。

#### ② 约定目录结构的意义

Maven 为了让构建过程能够尽可能自动化完成，所以必须约定目录结构的作用。例如：Maven 执行编译操作，必须先去 Java 源程序目录读取 Java 源代码，然后执行编译，最后把编译结果存放在 target 目录。

#### ③ 约定大于配置

Maven 对于目录结构这个问题，没有采用配置的方式，而是基于约定。这样会让我们在开发过程中非常方便。如果每次创建 Maven 工程后，还需要针对各个目录的位置进行详细的配置，那肯定非常麻烦。

目前开发领域的技术发展趋势就是：约定大于配置，配置大于编码。

## 第二节 实验二：在 Maven 工程中编写代码

### 1、主体程序

![主体程序](https://img-blog.csdnimg.cn/57ff7a834853405486c61db788582477.png)

主体程序指的是被测试的程序，同时也是将来在项目中真正要使用的程序。

```java
package com.myxh.maven;

/**
 * @author MYXH
 * @date 2023/8/6
 */
public class Calculator
{
    public int sum(int i, int j)
    {
        return i + j;
    }
}
```

### 2、测试程序

![测试程序](https://img-blog.csdnimg.cn/33308ea1e5f1418080f93552f73c76a2.png)

```java
package com.myxh.maven;

import org.junit.Test;
import com.myxh.maven.Calculator;

/*
静态导入的效果是将 Assert 类中的静态资源导入当前类，
这样一来，在当前类中就可以直接使用Assert类中的静态资源，不需要写类名
 */
import static org.junit.Assert.*;

/**
 * @author MYXH
 * @date 2023/8/6
 */
public class CalculatorTest
{
    @Test
    public void testSum()
    {
        // 1. 创建 Calculator 对象
        Calculator calculator = new Calculator();

        // 2. 调用 Calculator 对象的方法，获取到程序运行实际的结果
        int actualResult = calculator.sum(5, 3);

        // 3. 声明一个变量，表示程序运行期待的结果
        int expectedResult = 8;

        // 4. 使用断言来判断实际结果和期待结果是否一致
        /*
        如果一致：测试通过，不会抛出异常
        如果不一致：抛出异常，测试失败
         */
        assertEquals(expectedResult, actualResult);

        System.out.println("test method have been called.");
        System.out.println("已调用测试方法。");
    }
}
```

## 第三节 实验三：执行 Maven 的构建命令

### 1、要求

运行 Maven 中和构建操作相关的命令时，必须进入到 pom.xml 所在的目录。如果没有在 pom.xml 所在的目录运行 Maven 的构建命令，那么会看到下面的错误信息：

```sh
The goal you specified requires a project to execute but there is no POM in this directory
```

> mvn -v 命令和构建操作无关，只要正确配置了 PATH，在任何目录下执行都可以。而构建相关的命令要在 pom.xml 所在目录下运行——操作哪个工程，就进入这个工程的 pom.xml 目录。

### 2、清理操作

mvn clean

效果：删除 target 目录

### 3、编译操作

主程序编译：mvn compile

测试程序编译：mvn test-compile

主体程序编译结果存放的目录：target/classes

测试程序编译结果存放的目录：target/test-classes

### 4、测试操作

mvn test

测试的报告存放的目录：target/surefire-reports

### 5、打包操作

mvn package

打包的结果——jar 包，存放的目录：target

### 6、安装操作

mvn install

```sh
[INFO] Installing D:\CodeProjects\Java\Maven\Maven教程课(尚硅谷)项目\maven-workspace\space\pro01-maven-java\target\pro01-maven-java-1.0-SNAPSHOT.jar to D:\Program Files\CodePrograms\Maven\maven-repository\com\myxh\maven\pro01-maven-java\1.0-SNAPSHOT\pro01-maven-java-1.0-SNAPSHOT.jar
[INFO] Installing D:\CodeProjects\Java\Maven\Maven教程课(尚硅谷)项目\maven-workspace\space\pro01-maven-java\pom.xml to D:\Program Files\CodePrograms\Maven\maven-repository\com\myxh\maven\pro01-maven-java\1.0-SNAPSHOT\pro01-maven-java-1.0-SNAPSHOT.pom
```

安装的效果是将本地构建过程中生成的 jar 包存入 Maven 本地仓库。这个 jar 包在 Maven 仓库中的路径是根据它的坐标生成的。

坐标信息如下：

```xml
<groupId>com.myxh.maven</groupId>
<artifactId>pro01-maven-java</artifactId>
<version>1.0-SNAPSHOT</version>
```

在 Maven 仓库中生成的路径如下：

```sh
D:\Program Files\CodePrograms\Maven\maven-repository\com\myxh\maven\pro01-maven-java\1.0-SNAPSHOT\pro01-maven-java-1.0-SNAPSHOT.jar
```

另外，安装操作还会将 pom.xml 文件转换为 XXX.pom 文件一起存入本地仓库。所以我们在 Maven 的本地仓库中想看一个 jar 包原始的 pom.xml 文件时，查看对应 XXX.pom 文件即可，它们是名字发生了改变，本质上是同一个文件。

## 第四节 实验四：创建 Maven 版的 Web 工程

### 1、说明

使用 mvn archetype:generate 命令生成 Web 工程时，需要使用一个专门的 archetype。这个专门生成 Web 工程骨架的 archetype 可以参照官网看到它的用法：

![说明](https://img-blog.csdnimg.cn/79febe27b29143f4b69cbda639428cbf.png)

参数 archetypeGroupId、archetypeArtifactId、archetypeVersion 用来指定现在使用的 maven-archetype-webapp 的坐标。

### 2、操作

注意：如果在上一个工程的目录下执行 mvn archetype:generate 命令，那么 Maven 会报错：不能在一个非 pom 的工程下再创建其他工程。所以不要再刚才创建的工程里再创建新的工程，请回到工作空间根目录来操作。

然后运行生成工程的命令：

```sh
mvn archetype:generate -D archetypeGroupId=org.apache.maven.archetypes -D archetypeArtifactId=maven-archetype-webapp -D archetypeVersion=1.4
```

下面的操作按照提示执行：

> Define value for property 'groupId': com.myxh.maven Define value for property 'artifactId': pro02-maven-web Define value for property 'version' 1.0-SNAPSHOT: :【直接回车，使用默认值】
>
> Define value for property 'package' com.myxh.maven: :【直接回车，使用默认值】 Confirm properties configuration: groupId: com.myxh.maven artifactId: pro02-maven-web version: 1.0-SNAPSHOT package: com.myxh.maven Y: :【直接回车，表示确认】

### 3、生成的 pom.xml

确认打包的方式是 war 包形式

```xml
<packaging>war</packaging>
```

### 4、生成的 Web 工程的目录结构

![生成的 Web 工程的目录结构](https://img-blog.csdnimg.cn/0ff7921ea3b140a6ae3c0e6ff48966ac.png)

webapp 目录下有 index.jsp

WEB-INF 目录下有 web.xml

### 5、创建 Servlet

#### ① 在 main 目录下创建 java 目录

![在 main 目录下创建 java 目录](https://img-blog.csdnimg.cn/dc2dcdf973eb4052b092cf34b454de7c.png)

#### ② 在 java 目录下创建 Servlet 类所在的包的目录

![在 java 目录下创建 Servlet 类所在的包的目录](https://img-blog.csdnimg.cn/f7dcd970f95842c0983d4f7395f87226.png)

#### ③ 在包下创建 Servlet 类

```java
package com.myxh.maven;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;

/**
 * @author MYXH
 * @date 2023/8/6
 */
public class HelloServlet extends HttpServlet
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.getWriter().write("Hello Maven Web!");
    }
}
```

#### ④ 在 web.xml 中注册 Servlet

```xml
<servlet>
  <servlet-name>helloServlet</servlet-name>
  <servlet-class>com.myxh.maven.HelloServlet</servlet-class>
</servlet>

<servlet-mapping>
  <servlet-name>helloServlet</servlet-name>
  <url-pattern>/helloServlet</url-pattern>
</servlet-mapping>
```

### 6、在 index.jsp 页面编写超链接

```xml
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>

    <body>
        <h2>Hello World!</h2>
        <a href="helloServlet">Access Servlet（访问 Servlet）</a>
    </body>

</html>
```

> JSP 全称是 Java Server Page，和 Thymeleaf 一样，是服务器端页面渲染技术。这里我们不必关心 JSP 语法细节，编写一个超链接标签即可。

### 7、编译

此时直接执行 mvn compile 命令出错：

```sh
DANGER

程序包 javax.servlet.http 不存在

程序包 javax.servlet 不存在

找不到符号

符号: 类 HttpServlet

……
```

上面的错误信息说明：我们的 Web 工程用到了 HttpServlet 这个类，而 HttpServlet 这个类属于 servlet-api.jar 这个 jar 包。此时我们说，Web 工程需要依赖 servlet-api.jar 包。

![依赖](https://img-blog.csdnimg.cn/dc61a8c4896d4d25b7111093903ecb62.png)

### 8、配置对 servlet-api.jar 包的依赖

对于不知道详细信息的依赖可以到 https://mvnrepository.com/ 网站查询。使用关键词搜索，然后在搜索结果列表中选择适合的使用。

![配置对 servlet-api.jar 包的依赖](https://img-blog.csdnimg.cn/6c3698f0e1ed47d78906b23a8ee70321.png)

比如，我们找到的 servlet-api 的依赖信息：

```xml
<!-- https://mvnrepository.com/artifact/javax.servlet/javax.servlet-api -->
<dependency>
  <groupId>javax.servlet</groupId>
  <artifactId>javax.servlet-api</artifactId>
  <version>4.0.1</version>
  <scope>provided</scope>
</dependency>
```

这样就可以把上面的信息加入 pom.xml。重新执行 mvn compile 命令。

### 9、将 Web 工程打包为 war 包

运行 mvn package 命令，生成 war 包的位置如下图所示：

![将 Web 工程打包为 war 包](https://img-blog.csdnimg.cn/b06125d449894ad88897622b662a3592.png)

### 10、将 war 包部署到 Tomcat 上运行

将 war 包复制到 Tomcat/webapps 目录下

![将 war 包部署到 Tomcat 上运行](https://img-blog.csdnimg.cn/c0af6b14662e4c3aac0a249b3976e027.png)

启动 Tomcat：

![启动 Tomcat](https://img-blog.csdnimg.cn/2c80e5728639497eacfbf64cbb6eabd1.png)

![Tomcat 会自动解压 war 包](https://img-blog.csdnimg.cn/b1602a5d7c1d493db83eeb749fd34c4f.png)

通过浏览器尝试访问：http://localhost:8080/pro02-maven-web/index.jsp

## 第五节 实验五：让 Web 工程依赖 Java 工程

### 1、观念

明确一个意识：从来只有 Web 工程依赖 Java 工程，没有反过来 Java 工程依赖 Web 工程。本质上来说，Web 工程依赖的 Java 工程其实就是 Web 工程里导入的 jar 包。最终 Java 工程会变成 jar 包，放在 Web 工程的 WEB-INF/lib 目录下。

### 2、操作

在 pro02-maven-web 工程的 pom.xml 中，找到 dependencies 标签，在 dependencies 标签中做如下配置：

```xml
<!-- 配置对 Java 工程的依赖 -->
<dependency>
  <!-- 通过指定被依赖工程的坐标完成依赖 -->
  <groupId>com.myxh.maven</groupId>
  <artifactId>pro01-maven-java</artifactId>
  <version>1.0-SNAPSHOT</version>
  <scope>compile</scope>
</dependency>
```

### 3、在 Web 工程中，编写测试代码

#### ① 补充创建目录

pro02-maven-web\src\test\java\com\myxh\maven

#### ② 确认 Web 工程依赖了 junit

```xml
<dependency>
  <groupId>junit</groupId>
  <artifactId>junit</artifactId>
  <version>4.13.1</version>
  <scope>test</scope>
</dependency>
```

#### ③ 创建测试类

把 Java 工程的 CalculatorTest.java 类复制到 pro02-maven-web\src\test\java\com\myxh\maven 目录下

### 4、执行 Maven 命令

#### ① 测试命令

mvn test

说明：测试操作中会提前自动执行编译操作，测试成功就说明编译也是成功的。

#### ② 打包命令

mvn package

![打包命令](https://img-blog.csdnimg.cn/aad732da4cce48a1ba0285ed680d9430.png)

通过查看 war 包内的结构，我们看到被 Web 工程依赖的 Java 工程确实是会变成 Web 工程的 WEB-INF/lib 目录下的 jar 包。

![war 包内的结构](https://img-blog.csdnimg.cn/47d9c58cf5954f849915837397a140d2.png)

#### ③ 查看当前 Web 工程所依赖的 jar 包的列表

mvn dependency:list

```sh
[INFO] The following files have been resolved:
[INFO] org.hamcrest:hamcrest-core:jar:1.3:test
[INFO] javax.servlet:javax.servlet-api:jar:4.0.1:provided
[INFO] com.myxh.maven:pro01-maven-java:jar:1.0-SNAPSHOT:compile
[INFO] junit:junit:jar:4.13.1:test
```

说明：javax.servlet:javax.servlet-api:jar:4.0.1:provided 格式显示的是一个 jar 包的坐标信息。格式是：

> groupId:artifactId:打包方式:version:依赖的范围

这样的格式虽然和我们 XML 配置文件中坐标的格式不同，但是本质上还是坐标信息，大家需要能够认识这样的格式，将来从 Maven 命令的日志或错误信息中看到这样格式的信息，就能够识别出来这是坐标。进而根据坐标到 Maven 仓库找到对应的 jar 包，用这样的方式解决我们遇到的报错的情况。

#### ④ 以树形结构查看当前 Web 工程的依赖信息

mvn dependency:tree

```sh
[INFO] com.myxh.maven:pro02-maven-web:war:1.0-SNAPSHOT
[INFO] +- junit:junit:jar:4.13.1:test
[INFO] | \- org.hamcrest:hamcrest-core:jar:1.3:test
[INFO] +- javax.servlet:javax.servlet-api:jar:4.0.1:provided
[INFO] \- com.myxh.maven:pro01-maven-java:jar:1.0-SNAPSHOT:compile
```

我们在 pom.xml 中并没有依赖 hamcrest-core，但是它却被加入了我们依赖的列表。原因是：junit 依赖了 hamcrest-core，然后基于依赖的传递性，hamcrest-core 被传递到我们的工程了。

## 第六节 实验六：测试依赖的范围

### 1、依赖范围

标签的位置：dependencies/dependency/**scope**

标签的可选值：**compile**/**test**/**provided**/system/runtime/**import**

#### ① compile 和 test 对比

|         | main 目录（空间） | test 目录（空间） | 开发过程（时间） | 部署到服务器（时间） |
| ------- | ----------------- | ----------------- | ---------------- | -------------------- |
| compile | 有效              | 有效              | 有效             | 有效                 |
| test    | 无效              | 有效              | 有效             | 无效                 |

#### ② compile 和 provided 对比

|          | main 目录（空间） | test 目录（空间） | 开发过程（时间） | 部署到服务器（时间） |
| -------- | ----------------- | ----------------- | ---------------- | -------------------- |
| compile  | 有效              | 有效              | 有效             | 有效                 |
| provided | 有效              | 有效              | 有效             | 无效                 |

#### ③ 结论

compile：通常使用的第三方框架的 jar 包这样在项目实际运行时真正要用到的 jar 包都是以 compile 范围进行依赖的。比如 SSM 框架所需 jar 包。

test：测试过程中使用的 jar 包，以 test 范围依赖进来。比如 junit。

provided：在开发过程中需要用到的“服务器上的 jar 包”通常以 provided 范围依赖进来。比如 servlet-api、jsp-api。而这个范围的 jar 包之所以不参与部署、不放进 war 包，就是避免和服务器上已有的同类 jar 包产生冲突，同时减轻服务器的负担。说白了就是：“**服务器上已经有了，你就别带啦！**”

### 2、测试

#### ① 验证 compile 范围对 main 目录有效

> main 目录下的类：HelloServlet 使用 compile 范围导入的依赖：pro01-myxh-maven
>
> 验证：使用 compile 范围导入的依赖对 main 目录下的类来说是有效的
>
> 有效：HelloServlet 能够使用 pro01-myxh-maven 工程中的 Calculator 类
>
> 验证方式：在 HelloServlet 类中导入 Calculator 类，然后编译就说明有效。

#### ② 验证 test 范围对 main 目录无效

测试方式：在主体程序中导入 org.junit.Test 这个注解，然后执行编译。

具体操作：在 pro02-maven-java\src\main\java\com\myxh\maven 目录下修改 HelloServlet.java

```java
package com.myxh.maven;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;

/*
测试方式：
通过 import 语句将要测试的类引入当前类，引入后：
编译通过：可以使用，这个范围的依赖对当前类有效
编译失败：不能使用，这个范围的依赖对当前类无效
 */

// 具体测试代码如下：
// 有效
import com.myxh.maven.Calculator;

// 无效
import org.junit.Test;

/**
 * @author MYXH
 * @date 2023/8/6
 */
/*
main 目录下的 Java 类：HelloServlet
compile 范围引入的依赖：pro01-maven-java
pro01-maven-java 中的类：Calculator
test 范围引入的依赖：junit
junit 中可以使用的注解：@Test
 */
public class HelloServlet extends HttpServlet
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.getWriter().write("Hello Maven Web!");
    }
}
```

执行 Maven 编译命令：

```sh
[ERROR] /D:/maven-workspace/space/pro02-maven-java/src/main/java/com/myxh/maven/Calculator.java:[3,17] 程序包org.junit不存在
```

#### ③ 验证 test 和 provided 范围不参与服务器部署

其实就是验证：通过 compile 范围依赖的 jar 包会放入 war 包，通过 test 范围依赖的 jar 包不会放入 war 包。

![验证 test 和 provided 范围不参与服务器部署](https://img-blog.csdnimg.cn/8e387c79706a4210941c3ac56ac4c1a8.png)

#### ④ 验证 provided 范围对测试程序有效

测试方式是在 pro02-maven-web 的测试程序中加入 servlet-api.jar 包中的类。

修改：pro02-maven-web\src\test\java\com\myxh\maven\CalculatorTest.java

```java
package com.myxh.maven;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

import org.junit.Test;
import com.myxh.maven.Calculator;

// 静态导入的效果是将Assert类中的静态资源导入当前类
// 这样一来，在当前类中就可以直接使用Assert类中的静态资源，不需要写类名
import static org.junit.Assert.*;

public class CalculatorTest{

    @Test
    public void testSum(){

        // 1.创建Calculator对象
        Calculator calculator = new Calculator();

        // 2.调用Calculator对象的方法，获取到程序运行实际的结果
        int actualResult = calculator.sum(5, 3);

        // 3.声明一个变量，表示程序运行期待的结果
        int expectedResult = 8;

        // 4.使用断言来判断实际结果和期待结果是否一致
        // 如果一致：测试通过，不会抛出异常
        // 如果不一致：抛出异常，测试失败
        assertEquals(expectedResult, actualResult);
    }
}
```

然后运行 Maven 的编译命令：mvn compile

然后看到编译成功。

## 第七节 实验七：测试依赖的传递性

### 1、依赖的传递性

#### ① 概念

A 依赖 B，B 依赖 C，那么在 A 没有配置对 C 的依赖的情况下，A 里面能不能直接使用 C？

#### ② 传递的原则

在 A 依赖 B，B 依赖 C 的前提下，C 是否能够传递到 A，取决于 B 依赖 C 时使用的依赖范围。

- B 依赖 C 时使用 compile 范围：可以传递

- B 依赖 C 时使用 test 或 provided 范围：不能传递，所以需要这样的 jar 包时，就必须在需要的地方明确配置依赖才可以。

### 2、使用 compile 范围依赖 spring-core

测试方式：让 pro01-maven-java 工程依赖 spring-core

具体操作：编辑 pro01-maven-java 工程根目录下 pom.xml

```xml
<!-- 以 compile 范围导入 spring-core 依赖，测试依赖的传递性 -->
<!-- https://mvnrepository.com/artifact/org.springframework/spring-core -->
<dependency>
  <groupId>org.springframework</groupId>
  <artifactId>spring-core</artifactId>
  <version>4.0.0.RELEASE</version>
</dependency>
```

使用 mvn dependency:tree 命令查看效果：

```sh
[INFO] com.myxh.maven:pro01-maven-java:jar:1.0-SNAPSHOT
[INFO] +- junit:junit:jar:4.13.1:test
[INFO] | \- org.hamcrest:hamcrest-core:jar:1.3:test
[INFO] \- org.springframework:spring-core:jar:4.0.0.RELEASE:compile
[INFO] \- commons-logging:commons-logging:jar:1.1.1:compile
```

还可以在 Web 工程中，使用 mvn dependency:tree 命令查看效果（需要重新将 pro01-maven-java 安装到仓库）：

```sh
[INFO] com.myxh.maven:pro02-maven-web:war:1.0-SNAPSHOT
[INFO] +- junit:junit:jar:4.13.1:test
[INFO] | \- org.hamcrest:hamcrest-core:jar:1.3:test
[INFO] +- javax.servlet:javax.servlet-api:jar:4.0.1:provided
[INFO] \- com.myxh.maven:pro01-maven-java:jar:1.0-SNAPSHOT:compile
[INFO] \- org.springframework:spring-core:jar:4.0.0.RELEASE:compile
[INFO] \- commons-logging:commons-logging:jar:1.1.1:compile
```

### 3、验证 test 和 provided 范围不能传递

从上面的例子已经能够看到，pro01-maven-java 依赖了 junit，但是在 pro02-maven-web 工程中查看依赖树的时候并没有看到 junit。

要验证 provided 范围不能传递，可以在 pro01-maven-java 工程中加入 servlet-api 的依赖。

```xml
<dependency>
    <groupId>javax.servlet</groupId>
    <artifactId>javax.servlet-api</artifactId>
    <version>4.0.1</version>
    <scope>provided</scope>
</dependency>
```

效果还是和之前一样：

```sh
[INFO] com.myxh.maven:pro02-maven-web:war:1.0-SNAPSHOT
[INFO] +- junit:junit:jar:4.13.1:test
[INFO] | \- org.hamcrest:hamcrest-core:jar:1.3:test
[INFO] +- javax.servlet:javax.servlet-api:jar:4.0.1:provided
[INFO] \- com.myxh.maven:pro01-maven-java:jar:1.0-SNAPSHOT:compile
[INFO] \- org.springframework:spring-core:jar:4.0.0.RELEASE:compile
[INFO] \- commons-logging:commons-logging:jar:1.1.1:compile
```

## 第八节 实验八：测试依赖的排除

### 1、概念

当 A 依赖 B，B 依赖 C 而且 C 可以传递到 A 的时候，A 不想要 C，需要在 A 里面把 C 排除掉。而往往这种情况都是为了避免 jar 包之间的冲突。

<img src="http://heavy_code_industry.gitee.io/code_heavy_industry/assets/img/img027.2faff879.png" alt="images" style="zoom:67%;" />

所以配置依赖的排除其实就是阻止某些 jar 包的传递。因为这样的 jar 包传递过来会和其他 jar 包冲突。

### 2、配置方式

```xml
<!-- 配置对 Java 工程的依赖 -->
<dependency>
  <!-- 通过指定被依赖工程的坐标完成依赖 -->
  <groupId>com.myxh.maven</groupId>
  <artifactId>pro01-maven-java</artifactId>
  <version>1.0-SNAPSHOT</version>
  <scope>compile</scope>

  <!-- 配置依赖的排除 -->
  <exclusions>
    <!-- 配置具体排除信息，让 commons-logging 不要传递到当前工程（pro02-maven-web） -->
    <exclusion>
      <!-- 这里指定坐标时不需要指定 version -->
        <groupId>commons-logging</groupId>
        <artifactId>commons-logging</artifactId>
    </exclusion>
  </exclusions>
</dependency>
```

### 3、测试

测试的方式：在 pro02-maven-web 工程中配置对 commons-logging 的排除

```xml
<!-- 配置对 Java 工程的依赖 -->
<dependency>
  <!-- 通过指定被依赖工程的坐标完成依赖 -->
  <groupId>com.myxh.maven</groupId>
  <artifactId>pro01-maven-java</artifactId>
  <version>1.0-SNAPSHOT</version>
  <scope>compile</scope>

  <!-- 配置依赖的排除 -->
  <exclusions>
    <!-- 配置具体排除信息，让 commons-logging 不要传递到当前工程（pro02-maven-web） -->
    <exclusion>
      <!-- 这里指定坐标时不需要指定 version -->
        <groupId>commons-logging</groupId>
        <artifactId>commons-logging</artifactId>
    </exclusion>
  </exclusions>
</dependency>
```

运行 mvn dependency:tree 命令查看效果：

```sh
[INFO] com.myxh.maven:pro02-maven-web:war:1.0-SNAPSHOT
[INFO] +- junit:junit:jar:4.13.1:test
[INFO] | \- org.hamcrest:hamcrest-core:jar:1.3:test
[INFO] +- javax.servlet:javax.servlet-api:jar:4.0.1:provided
[INFO] \- com.myxh.maven:pro01-maven-java:jar:1.0-SNAPSHOT:compile
[INFO] \- org.springframework:spring-core:jar:4.0.0.RELEASE:compile
```

发现在 spring-core 下面就没有 commons-logging 了。

## 第九节 实验九：继承

### 1、概念

Maven 工程之间，A 工程继承 B 工程

- B 工程：父工程

- A 工程：子工程

本质上是 A 工程的 pom.xml 中的配置继承了 B 工程中 pom.xml 的配置。

### 2、作用

在父工程中统一管理项目中的依赖信息，具体来说是管理依赖信息的版本。

它的背景是：

- 对一个比较大型的项目进行了模块拆分。

- 一个 project 下面，创建了很多个 module。

- 每一个 module 都需要配置自己的依赖信息。

它背后的需求是：

- 在每一个 module 中各自维护各自的依赖信息很容易发生出入，不易统一管理。

- 使用同一个框架内的不同 jar 包，它们应该是同一个版本，所以整个项目中使用的框架版本需要统一。

- 使用框架时所需要的 jar 包组合（或者说依赖信息组合）需要经过长期摸索和反复调试，最终确定一个可用组合。这个耗费很大精力总结出来的方案不应该在新的项目中重新摸索。

通过在父工程中为整个项目维护依赖信息的组合既**保证了整个项目使用规范、准确的 jar 包**；又能够将**以往的经验沉淀**下来，节约时间和精力。

### 3、举例

在一个工程中依赖多个 Spring 的 jar 包

```sh
[INFO] +- org.springframework:spring-core:jar:4.0.0.RELEASE:compile
[INFO] | \- commons-logging:commons-logging:jar:1.1.1:compile
[INFO] +- org.springframework:spring-beans:jar:4.0.0.RELEASE:compile
[INFO] +- org.springframework:spring-context:jar:4.0.0.RELEASE:compile
[INFO] +- org.springframework:spring-expression:jar:4.0.0.RELEASE:compile
[INFO] +- org.springframework:spring-aop:jar:4.0.0.RELEASE:compile
[INFO] | \- aopalliance:aopalliance:jar:1.0:compile
```

使用 Spring 时要求所有 Spring 自己的 jar 包版本必须一致。为了能够对这些 jar 包的版本进行统一管理，我们使用继承这个机制，将所有版本信息统一在父工程中进行管理。

### 4、操作

#### ① 创建父工程

创建的过程和前面创建 pro01-maven-java 一样。

工程名称：pro03-maven-parent

工程创建好之后，要修改它的打包方式：

```xml
<groupId>com.myxh.maven</groupId>
<artifactId>pro03-maven-parent</artifactId>
<version>1.0-SNAPSHOT</version>

<!-- 当前工程作为父工程，要去管理其它工程，打包方式必须是 pom -->
<packaging>pom</packaging>
```

只有打包方式为 pom 的 Maven 工程能够管理其他 Maven 工程。打包方式为 pom 的 Maven 工程中不写业务代码，它是专门管理其他 Maven 工程的工程。

#### ② 创建模块工程

模块工程类似于 IDEA 中的 module，所以需要**进入 pro03-maven-parent 工程的根目录**，然后运行 mvn archetype:generate 命令来创建模块工程。

假设，我们创建三个模块工程：

![创建模块工程](https://img-blog.csdnimg.cn/18de97cb87854145bd82d11421faba9a.png)

#### ③ 查看被添加新内容的父工程 pom.xml

下面 modules 和 module 标签是聚合功能的配置

```xml
<!--聚合的配置 -->
<modules>
  <module>pro04-maven-module</module>
  <module>pro05-maven-module</module>
  <module>pro06-maven-module</module>
</modules>
```

#### ④ 解读子工程的 pom.xml

```xml
<!-- parent 标签给当前工程配置父工程 -->
<parent>
  <!-- 通过指定父工程的坐标找到父工程 -->
  <groupId>com.myxh.maven</groupId>
  <artifactId>pro03-maven-parent</artifactId>
  <version>1.0-SNAPSHOT</version>
</parent>

<!-- 子工程的 groupid 如果和父工程一样，则可以省略 -->
<!-- <groupId>com.myxh.maven</groupId> -->

<!-- 子工程的 version 如果和父工程一样，则可以省略 -->
<!-- <version>1.0-SNAPSHOT</version> -->

<!-- 省略 groupId 和 version 后，子工程自己的坐标可以只保留 artifactId -->
<artifactId>pro04-maven-module</artifactId>
```

#### ⑤ 在父工程中配置依赖的统一管理

```xml
<!-- 在父工程中统一管理依赖信息 -->
<!-- 注意：即使在父工程配置了对依赖的管理，子工程需要使用具体哪一个依赖还是要明确配置 -->
<dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-core</artifactId>
            <version>4.0.0.RELEASE</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-beans</artifactId>
            <version>4.0.0.RELEASE</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context</artifactId>
            <version>4.0.0.RELEASE</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-expression</artifactId>
            <version>4.0.0.RELEASE</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-aop</artifactId>
            <version>4.0.0.RELEASE</version>
        </dependency>
    </dependencies>
</dependencyManagement>
```

#### ⑥ 子工程中引用那些被父工程管理的依赖

关键点：省略版本号

```xml
<!-- 即使在父工程配置了对依赖的管理，子工程需要使用具体哪一个依赖还是要明确配置 -->
<dependency>
  <groupId>org.springframework</groupId>
  <artifactId>spring-core</artifactId>

  <!-- 对于已经在父工程进行了管理的依赖，子工程中引用时可以不写 version -->
  <!-- <version>4.0.0.RELEASE</version> -->
  <!-- 情况 1 确实省略了 version 标签：子工程采纳的就是父工程管理的版本 -->
  <!-- 情况 2 没有省略 version 标签：
          A：这里配置了 version 和父工程管理的版不一致，最终还是采纳这个版本
          B：这里配置了 version，但是和父工程管理的版本不一致，那么这里子工程配置的版本会覆盖父工程管理的版本并最终采纳，绝大部分情况下子工程还是遵从父工程统一管理的依赖
    -->
</dependency>
```

#### ⑦ 在父工程中升级依赖信息的版本

```xml
<!-- 在父工程中统一管理依赖信息 -->
<!-- 注意：即使在父工程配置了对依赖的管理，子工程需要使用具体哪一个依赖还是要明确配置 -->
<dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-core</artifactId>
            <version>4.2.0.RELEASE</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-beans</artifactId>
            <version>4.2.0.RELEASE</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context</artifactId>
            <version>4.2.0.RELEASE</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-expression</artifactId>
            <version>4.2.0.RELEASE</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-aop</artifactId>
            <version>4.2.0.RELEASE</version>
        </dependency>
    </dependencies>
</dependencyManagement>
```

然后在子工程中运行 mvn dependency:list，效果如下：

```sh
[INFO] org.springframework:spring-aop:jar:4.2.0.RELEASE:compile
[INFO] org.springframework:spring-core:jar:4.2.0.RELEASE:compile
[INFO] org.springframework:spring-context:jar:4.2.0.RELEASE:compile
[INFO] org.springframework:spring-beans:jar:4.2.0.RELEASE:compile
[INFO] org.springframework:spring-expression:jar:4.2.0.RELEASE:compile
```

#### ⑧ 在父工程中声明自定义属性

```xml
<properties>
  <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>

  <!-- 创建我们自定义的属性标签 -->
  <!-- 标签名：属性名 -->
  <!-- 标签值：属性值 -->
  <!-- 引用方式：${myxh.spring.version} -->
  <myxh.spring.version>4.2.0.RELEASE</myxh.spring.version>
</properties>
```

在需要的地方使用${}的形式来引用自定义的属性名：

```xml
<!-- 在父工程中统一管理依赖信息 -->
<!-- 注意：即使在父工程配置了对依赖的管理，子工程需要使用具体哪一个依赖还是要明确配置 -->
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-core</artifactId>

      <!-- 通过引用属性表达式设定版本号，这样版本号就成了一个动态值 -->
      <!-- 通过属性名解析后才知道具体是什么值 -->
      <version>${myxh.spring.version}</version>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-beans</artifactId>
      <version>${myxh.spring.version}</version>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-context</artifactId>
      <version>${myxh.spring.version}</version>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-expression</artifactId>
      <version>${myxh.spring.version}</version>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-aop</artifactId>
      <version>${myxh.spring.version}</version>
    </dependency>
  </dependencies>
</dependencyManagement>
```

真正实现“一处修改，处处生效”。

### 5、实际意义

![实际意义](https://img-blog.csdnimg.cn/f13d99470e2d4d348ccd73cc1bc9fe95.png)

编写一套符合要求、开发各种功能都能正常工作的依赖组合并不容易。如果公司里已经有人总结了成熟的组合方案，那么再开发新项目时，如果不使用原有的积累，而是重新摸索，会浪费大量的时间。为了提高效率，我们可以使用工程继承的机制，让成熟的依赖组合方案能够保留下来。

如上图所示，公司级的父工程中管理的就是成熟的依赖组合方案，各个新项目、子系统各取所需即可。

## 第十节 实验十：聚合

### 1、聚合本身的含义

部分组成整体

动画片《战神金刚》中的经典台词：“我来组成头部！我来组成手臂！”就是聚合关系最生动的体现。

### 2、Maven 中的聚合

使用一个“总工程”将各个“模块工程”汇集起来，作为一个整体对应完整的项目。

- 项目：整体

- 模块：部分

> 概念的对应关系：
>
> 从继承关系角度来看：
>
> - 父工程
>
> - 子工程
>
> 从聚合关系角度来看：
>
> - 总工程
>
> - 模块工程

### 3、好处

- 一键执行 Maven 命令：很多构建命令都可以在“总工程”中一键执行。

  以 mvn install 命令为例：Maven 要求有父工程时先安装父工程；有依赖的工程时，先安装被依赖的工程。我们自己考虑这些规则会很麻烦。但是工程聚合之后，在总工程执行 mvn install 可以一键完成安装，而且会自动按照正确的顺序执行。

- 配置聚合之后，各个模块工程会在总工程中展示一个列表，让项目中的各个模块一目了然。

### 4、聚合的配置

在总工程中配置 modules 即可：

```xml
<!--聚合的配置 -->
<modules>
  <module>pro04-maven-module</module>
  <module>pro05-maven-module</module>
  <module>pro06-maven-module</module>
</modules>
```

### 5、依赖的配置

在分工程中配置 dependency 即可：

```xml
<!-- 测试聚合之后可以一键安装：让 pro04-maven-module 依赖 pro05-maven-module -->
  <dependency>
    <groupId>com.myxh.maven</groupId>
    <artifactId>pro05-maven-module</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

```xml
<!-- 测试聚合之后可以一键安装：让 pro05-maven-module 依赖 pro06-maven-module -->
<dependency>
  <groupId>com.myxh.maven</groupId>
  <artifactId>pro06-maven-module</artifactId>
  <version>1.0-SNAPSHOT</version>
</dependency>
```

### 6、依赖循环问题

如果 A 工程依赖 B 工程，B 工程依赖 C 工程，C 工程又反过来依赖 A 工程，那么在执行构建操作时会报下面的错误：

```sh
DANGER

[ERROR] [ERROR] The projects in the reactor contain a cyclic reference:
```

这个错误的含义是：循环引用。

# 第四章 使用 Maven：IDEA 环境

## 第一节 创建父工程

### 1、创建 Project

![创建 Project](https://img-blog.csdnimg.cn/e142906136c04edf858d5e55749ca1d3.png)

![创建 Project](https://img-blog.csdnimg.cn/a4a7afe2d17446d1a3a1d85d2a5783bb.png)

### 2、开启自动导入

创建 Project 后，通过 IDEA 的 Settings 设置来开启自动导入，我们选择 **『任何变更』**。

![开启自动导入](https://img-blog.csdnimg.cn/269e02b204e0437baf63a23395e3a641.png)
这个自动导入**一定要开启**，因为 Project、Module 新创建或 pom.xml 每次修改时都应该让 IDEA 重新加载 Maven 信息。这对 Maven 目录结构认定、Java 源程序编译、依赖 jar 包的导入都有非常关键的影响。

## 第二节 配置 Maven 信息

每次创建 Project 后都需要设置 Maven 家目录位置，否则 IDEA 将使用内置的 Maven 核心程序（不稳定）并使用默认的本地仓库位置。这样一来，我们在命令行操作过程中已下载好的 jar 包就白下载了，默认的本地仓库通常在 C 盘，还影响系统运行。

配置之后，IDEA 会根据我们在这里指定的 Maven 家目录自动识别到我们在 settings.xml 配置文件中指定的本地仓库。

![配置 Maven 信息](https://img-blog.csdnimg.cn/b31de470b7694ed78b048d6bfec74333.png)

## 第三节 创建 Java 模块工程

![创建 Java 模块工程](https://img-blog.csdnimg.cn/0f4ed0baa144497ea0bf139fbbec22a7.png)

## 第四节 创建 Web 模块工程

### 1、创建模块

按照前面的同样操作创建模块，**此时**这个模块其实还是一个**Java 模块**。

### 2、修改打包方式

Web 模块将来打包当然应该是 **war** 包。

```xml
<packaging>war</packaging>
```

### 3、Web 设定

首先打开项目结构菜单：

![Web 设定](https://img-blog.csdnimg.cn/bf2e0da43e6c40d69406919e03c4505e.png)

然后到 Facets 下查看 IDEA 是否已经帮我们自动生成了 Web 设定。正常来说只要我们确实设置了打包方式为 war，那么 IDEA 2022 版就会自动生成 Web 设定。

![在这里插入图片描述](https://img-blog.csdnimg.cn/78f4a8eb273c45d9b29d423bb975afb1.png)

另外，对于 IDEA 2018 诸版本没有自动生成 Web 设定，那么请参照下面两图，我们自己创建：

![Web 设定](https://img-blog.csdnimg.cn/f0c2b8cb0192453db91d775d78d3470b.png)

![Web 设定](https://img-blog.csdnimg.cn/58ae0f4765014514a3236df911aacbf2.png)

### 4、借助 IDEA 生成 web.xml

![借助 IDEA 生成 web.xml](https://img-blog.csdnimg.cn/6e20e132f7974073b32b742944b27637.png)

### 5、设置 Web 资源的根目录

结合 Maven 的目录结构，Web 资源的根目录需要设置为 src/main/webapp 目录。

![设置 Web 资源的根目录](https://img-blog.csdnimg.cn/aa6a9e41be6645aeac9253335976dbe7.png)

## 第五节 其他操作

### 1、在 IDEA 中执行 Maven 命令

#### ① 直接执行

![直接执行](https://img-blog.csdnimg.cn/3cf348ae3f694e53bce2ad5c58ccdce8.png)

#### ② 手动输入

![手动输入](https://img-blog.csdnimg.cn/84729e73d6894d379f5743c3257ae643.png)

如果有需要，还可以给命令后面附加参数：

![在这里插入图片描述](https://img-blog.csdnimg.cn/74dac85bec104e50b8040f50baf75709.png)

```sh
# -D 表示后面要附加命令的参数
# skipTests=true 表示在执行命令的过程中跳过测试
mvn clean install -D skipTests=true
```

### 2、在 IDEA 中查看某个模块的依赖信息

![在 IDEA 中查看某个模块的依赖信息](https://img-blog.csdnimg.cn/479057fc4c6d4eb7b943855ab0276a28.png)

### 3、工程导入

Maven 工程除了自己创建的，还有很多情况是别人创建的。而为了参与开发或者是参考学习，我们都需要导入到 IDEA 中。下面我们分几种不同情况来说明：

#### ① 来自版本控制系统

目前我们通常使用的都是 Git（本地库） + 码云（远程库）的版本控制系统，结合 IDEA 的相关操作方式请点[**这里**](http://heavy_code_industry.gitee.io/code_heavy_industry/pro008-Git/lecture/chapter05/verse03.html)查看**克隆远程库**部分。

#### ② 来自工程目录

直接使用 IDEA 打开工程目录即可。下面咱们举个例子：

##### [1] 工程压缩包

假设别人发给我们一个 Maven 工程的 zip 压缩包：maven-rest-demo.zip。从码云或 GitHub 上也可以以 ZIP 压缩格式对项目代码打包下载。

##### [2] 解压

如果你的所有 IDEA 工程有一个专门的目录来存放，而不是散落各处，那么首先我们就把 ZIP 包解压到这个指定目录中。

![解压](https://img-blog.csdnimg.cn/3ece426c9ab24a5eaff894b0b549f9c8.png)

##### [3] 打开

只要我们确认在解压目录下可以直接看到 pom.xml，那就能证明这个解压目录就是我们的工程目录。那么接下来让 IDEA 打开这个目录就可以了。

![打开](https://img-blog.csdnimg.cn/d1e88d5e59974e088d047773c0ce1d01.png)

![打开](https://img-blog.csdnimg.cn/67f7f8868de74107ae88fc0a2b285d8b.png)

##### [4] 设置 Maven 核心程序位置

打开一个新的 Maven 工程，和新创建一个 Maven 工程是一样的，此时 IDEA 的 settings 配置中关于 Maven 仍然是默认值：

![设置 Maven 核心程序位置](https://img-blog.csdnimg.cn/03cd7660364b48b5a243bb97dd5f7d1d.png)

所以我们还是需要像新建 Maven 工程那样，指定一下 Maven 核心程序位置：

![设置 Maven 核心程序位置](https://img-blog.csdnimg.cn/7b065fb3ec284ae0859664cdbb21019f.png)

### 4、模块导入

#### ① 情景重现

在实际开发中，通常会忽略模块（也就是 module）所在的项目（也就是 project）仅仅导入某一个模块本身。这么做很可能是类似这样的情况：比如基于 Maven 学习 SSM 的时候，做练习需要导入老师发给我们的代码参考。

![情景重现](https://img-blog.csdnimg.cn/779361f99bca4888a24040c0ce94ed12.png)

#### ② 导入 Java 类型模块

##### [1] 找到老师发的工程目录

![找到老师发的工程目录](https://img-blog.csdnimg.cn/f378f189c6b44df4922a35b4a1dbbab3.png)

##### [2] 复制我们想要导入的模块目录

![复制我们想要导入的模块目录](https://img-blog.csdnimg.cn/7df68734faba48e28c7bd2b340dd75ce.png)

##### [3] 粘贴到我们自己工程目录下

这个工程（project）是我们事先在 IDEA 中创建好的。

![粘贴到我们自己工程目录下](https://img-blog.csdnimg.cn/6de93b745d4c46d1891e040fe44e0a87.png)

##### [4] 在 IDEA 中执行导入

![在 IDEA 中执行导入](https://img-blog.csdnimg.cn/afe11517c4204eda92cdf9b1c8f317a3.png)

![在 IDEA 中执行导入](https://img-blog.csdnimg.cn/8e9bc737c50c4cdea9c0fea2c267ea3b.png)

![在 IDEA 中执行导入](https://img-blog.csdnimg.cn/d5351b4ae7744cf79c4063884f45b12a.png)

![在 IDEA 中执行导入](https://img-blog.csdnimg.cn/b7f50c4178494d87af7f427e322249b8.png)

![在 IDEA 中执行导入](https://img-blog.csdnimg.cn/898c6e93855c441883020301f75b207a.png)

##### [5] 修改 pom.xml

刚刚导入的 module 的父工程坐标还是以前的，需要改成我们自己的 project。

![修改 pom.xml](https://img-blog.csdnimg.cn/384cb2c717dc4077ad7f1585c5d1aa54.png)

![修改 pom.xml](https://img-blog.csdnimg.cn/b4660dcc38544010bb0fe395de2f694e.png)

##### [6] 最终效果

![在这里插入图片描述](https://img-blog.csdnimg.cn/20be97e2a2324708a38468906748dae7.png)

#### ③ 导入 Web 类型模块

其它操作和上面演示的都一样，只是多一步：删除多余的、不正确的 web.xml 设置。如下图所示：

![导入 Web 类型模块](https://img-blog.csdnimg.cn/3748df9bc1864d32ab01745c6e43f55c.png)

# 第五章 其他核心概念

## 1、生命周期

### ① 作用

为了让构建过程自动化完成，Maven 设定了三个生命周期，生命周期中的每一个环节对应构建过程中的一个操作。

### ② 三个生命周期

| 生命周期名称 | 作用         | 各个环节                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
| ------------ | ------------ | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Clean        | 清理操作相关 | pre-clean<br/>clean<br/>post-clean                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
| Site         | 生成站点相关 | pre-site<br/>site<br/>post-site<br/>deploy-site                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |
| Default      | 主要构建过程 | validate<br/>generate-sources<br/>process-sources<br/>generate-resources<br/>process-resources 复制并处理资源文件，至目标目录，准备打包。<br/>compile 编译项目 main 目录下的源代码。<br/>process-classes<br/>generate-test-sources<br/>process-test-sources<br/>generate-test-resources<br/>process-test-resources 复制并处理资源文件，至目标测试目录。<br/>test-compile 编译测试源代码。<br/>process-test-classes<br/>test 使用合适的单元测试框架运行测试。这些测试代码不会被打包或部署。<br/>prepare-package package 接受编译好的代码，打包成可发布的格式，如 JAR。<br/>pre-integration-test<br/>integration-test<br/>post-integration-test<br/>verify<br/>install 将包安装至本地仓库，以让其它项目依赖。<br/>deploy 将最终的包复制到远程的仓库，以让其它开发人员共享；或者部署到服务器上运行（需借助插件，例如：cargo）。 |

### ③ 特点

- 前面三个生命周期彼此是独立的。

- 在任何一个生命周期内部，执行任何一个具体环节的操作，都是从本周期最初的位置开始执行，直到指定的地方。（本节记住这句话就行了，其他的都不需要记）

Maven 之所以这么设计其实就是为了提高构建过程的自动化程度：让使用者只关心最终要干的即可，过程中的各个环节是自动执行的。

## 2、插件和目标

### ① 插件

Maven 的核心程序仅仅负责宏观调度，不做具体工作。具体工作都是由 Maven 插件完成的。例如：编译就是由 maven-compiler-plugin-3.8.0.jar 插件来执行的。

### ② 目标

一个插件可以对应多个目标，而每一个目标都和生命周期中的某一个环节对应。

Default 生命周期中有 compile 和 test-compile 两个和编译相关的环节，这两个环节对应 compile 和 test-compile 两个目标，而这两个目标都是由 maven-compiler-plugin-3.8.0.jar 插件来执行的。

## 3、仓库

- 本地仓库：在当前电脑上，为电脑上所有 Maven 工程服务

- 远程仓库：需要联网

  - 局域网：我们自己搭建的 Maven 私服，例如使用 Nexus 技术。

  - Internet

    - 中央仓库

    - 镜像仓库：内容和中央仓库保持一致，但是能够分担中央仓库的负载，同时让用户能够就近访问提高下载速度，例如：Nexus aliyun

建议：不要中央仓库和阿里云镜像混用，否则 jar 包来源不纯，彼此冲突。

专门搜索 Maven 依赖信息的网站：https://mvnrepository.com/
