## 用来作为测试容器
FROM java:8
COPY . /var/app
WORKDIR /var/app/provider-service
