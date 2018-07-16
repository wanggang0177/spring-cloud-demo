访问规则：
/{application}/{profile}[/{label}]
/{application}-{profile}.yml
/{label}/{application}-{profile}.yml
/{application}-{profile}.properties
/{label}/{application}-{profile}.properties
其中{label}对应Git上不同的分支，默认为master
比如，要访问master分支，config-client应用的dev环境

http://localhost:8001/config-client/dev/master