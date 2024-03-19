# BookManagement（作业）

涉及到的组件与服务
基于Spring Cloud，用到了部分Spring Cloud提供的组件。

nacos 端口8848 服务发现组件

gateway：端口10010 网关，提供路由转发等

部署记录：

服务器安装java runtime

服务器安装docker

服务器安装docker-compose

上传打好的jar包与Dockerfile文件, docker-compose.yml文件

![2](https://github.com/Buzzfease/BookManagement/assets/30476209/31069f46-e62e-4fac-b42f-217b2ffe7754)

运行docker-compose -f docker-compose.yml up -d
docker 容器启动成功
![3](https://github.com/Buzzfease/BookManagement/assets/30476209/40b4ddf0-2993-4a63-afc8-b4dae2cab833)

nacos注册中心已发现服务
![1](https://github.com/Buzzfease/BookManagement/assets/30476209/6a423b49-a75f-411a-8177-247b582a3029)

postman call通
![4](https://github.com/Buzzfease/BookManagement/assets/30476209/ee12ed4d-c10e-47e0-b91e-cb3cb5bd6ba3)

