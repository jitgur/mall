mall商城是一套电商管理系统，包括前台商城系统和后台管理系统， 基于
Springboot+Mybatis实现。 前台商城系统包括首页内容管理、商品搜索、 商品
推荐、购物车管理、订单管理、会员管理等模块。



mall
├── mall-admin -- 后台管理系统模块
├── mall-common -- 工具类及通用代码模块
├── mall-mbg -- MyBatisGenerator生成的数据层代码模块
├── mall-portal -- 前台商城系统模块
├── mall-search -- 基于ElasticSearch的商品搜索系统模块
└──mall-security -- 基于SpringSecurity的安全认证模块



mall技术选型
技术							            说明                                 版本
SpringBoot					            容器+MVC框架                          2.6.7
SpringSecurity						    认证授权框架                          2.6.7
MyBatis								    ORM框架	                            3.5.10
MyBatisGenerator		                数据层代码生成                        1.4.1
RabbitMQ								消息队列                              3.10.5     
Redis									分布式缓存                            5.0.14.1
MongoDB					                NoSQL数据库                           5.0  
ElasticSearch							搜索引擎                              7.17.3
LogStash								日志收集工具                          7.17.3    
Kibana									日志可视化查看工具                    7.17.3
Druid									数据库连接池                          1.2.14
Hutool									Java工具类库                          5.8.9
PageHelper								Mybatis分页插件                       5.3.2
Swagger								    文档生成工具                          3.0.0
logstash-logback-encoder			    Logstash日志收集插件                  7.2    
JWT                                     JWT登录支持                           0.9.1
Lombok                                  代码简化工具                          1.18.24  

<table class="MsoTableGrid" border="1" cellspacing="0" cellpadding="0" style="border-collapse:collapse;border:none;mso-border-top-alt:solid windowtext .5pt;
 mso-border-bottom-alt:solid windowtext .5pt;mso-yfti-tbllook:1184;mso-padding-alt:
 0cm 5.4pt 0cm 5.4pt;mso-border-insideh:none;mso-border-insidev:none">
 <tbody><tr style="mso-yfti-irow:0;mso-yfti-firstrow:yes">
  <td valign="top" style="border-top:solid windowtext 1.0pt;border-left:none;
  border-bottom:solid windowtext 1.0pt;border-right:none;mso-border-top-alt:
  solid windowtext .5pt;mso-border-bottom-alt:solid windowtext .5pt;padding:
  0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal">技术</p>
  </td>
  <td valign="top" style="border-top:solid windowtext 1.0pt;border-left:none;
  border-bottom:solid windowtext 1.0pt;border-right:none;mso-border-top-alt:
  solid windowtext .5pt;mso-border-bottom-alt:solid windowtext .5pt;padding:
  0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal">说明</p>
  </td>
  <td valign="top" style="border-top:solid windowtext 1.0pt;border-left:none;
  border-bottom:solid windowtext 1.0pt;border-right:none;mso-border-top-alt:
  solid windowtext .5pt;mso-border-bottom-alt:solid windowtext .5pt;padding:
  0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal">版本</p>
  </td>
 </tr>
 <tr style="mso-yfti-irow:1">
  <td valign="top" style="border:none;mso-border-top-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span class="SpellE"><span lang="EN-US">SpringBoot</span></span></p>
  </td>
  <td valign="top" style="border:none;mso-border-top-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal">容器<span lang="EN-US">+MVC</span>框架</p>
  </td>
  <td valign="top" style="border:none;mso-border-top-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span lang="EN-US">2.6.7</span></p>
  </td>
 </tr>
 <tr style="mso-yfti-irow:2">
  <td valign="top" style="border:none;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span class="SpellE"><span lang="EN-US">SpringSecurity</span></span></p>
  </td>
  <td valign="top" style="border:none;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal">认证授权框架</p>
  </td>
  <td valign="top" style="border:none;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span lang="EN-US">2.6.7</span></p>
  </td>
 </tr>
 <tr style="mso-yfti-irow:3">
  <td valign="top" style="border:none;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span class="SpellE"><span lang="EN-US">MyBatis</span></span></p>
  </td>
  <td valign="top" style="border:none;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span lang="EN-US">ORM</span>框架</p>
  </td>
  <td valign="top" style="border:none;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span lang="EN-US">3.5.10</span></p>
  </td>
 </tr>
 <tr style="mso-yfti-irow:4">
  <td valign="top" style="border:none;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span class="SpellE"><span lang="EN-US">MyBatisGenerator</span></span></p>
  </td>
  <td valign="top" style="border:none;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal">数据层代码生成</p>
  </td>
  <td valign="top" style="border:none;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span lang="EN-US">1.4.1</span></p>
  </td>
 </tr>
 <tr style="mso-yfti-irow:5">
  <td valign="top" style="border:none;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span lang="EN-US">RabbitMQ</span></p>
  </td>
  <td valign="top" style="border:none;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal">消息队列</p>
  </td>
  <td valign="top" style="border:none;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span lang="EN-US">3.10.5</span></p>
  </td>
 </tr>
 <tr style="mso-yfti-irow:6">
  <td valign="top" style="border:none;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span lang="EN-US">Redis</span></p>
  </td>
  <td valign="top" style="border:none;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal">分布式缓存</p>
  </td>
  <td valign="top" style="border:none;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span lang="EN-US">5.0.14.1</span></p>
  </td>
 </tr>
 <tr style="mso-yfti-irow:7">
  <td valign="top" style="border:none;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span lang="EN-US">MongoDB</span></p>
  </td>
  <td valign="top" style="border:none;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span lang="EN-US">NoSQL</span>数据库</p>
  </td>
  <td valign="top" style="border:none;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span lang="EN-US">5.0</span></p>
  </td>
 </tr>
 <tr style="mso-yfti-irow:8">
  <td valign="top" style="border:none;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span class="SpellE"><span lang="EN-US">ElasticSearch</span></span></p>
  </td>
  <td valign="top" style="border:none;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal">搜索引擎</p>
  </td>
  <td valign="top" style="border:none;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span lang="EN-US">7.17.3</span></p>
  </td>
 </tr>
 <tr style="mso-yfti-irow:9">
  <td valign="top" style="border:none;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span class="SpellE"><span lang="EN-US">LogStash</span></span><span lang="EN-US"><span style="mso-tab-count:1"> </span></span></p>
  </td>
  <td valign="top" style="border:none;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal">日志收集工具</p>
  </td>
  <td valign="top" style="border:none;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span lang="EN-US">7.17.3</span></p>
  </td>
 </tr>
 <tr style="mso-yfti-irow:10">
  <td valign="top" style="border:none;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span lang="EN-US">Kibana</span></p>
  </td>
  <td valign="top" style="border:none;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal">日志可视化查看工具</p>
  </td>
  <td valign="top" style="border:none;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span lang="EN-US">7.17.3</span></p>
  </td>
 </tr>
 <tr style="mso-yfti-irow:11">
  <td valign="top" style="border:none;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span lang="EN-US">Druid</span></p>
  </td>
  <td valign="top" style="border:none;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal">数据库连接池</p>
  </td>
  <td valign="top" style="border:none;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span lang="EN-US">1.2.14</span></p>
  </td>
 </tr>
 <tr style="mso-yfti-irow:12">
  <td valign="top" style="border:none;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span class="SpellE"><span lang="EN-US">Hutool</span></span></p>
  </td>
  <td valign="top" style="border:none;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span lang="EN-US">Java</span>工具类库</p>
  </td>
  <td valign="top" style="border:none;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span lang="EN-US">5.8.9</span></p>
  </td>
 </tr>
 <tr style="mso-yfti-irow:13">
  <td valign="top" style="border:none;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span class="SpellE"><span lang="EN-US">PageHelper</span></span></p>
  </td>
  <td valign="top" style="border:none;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span class="SpellE"><span lang="EN-US">Mybatis</span></span>分页插件</p>
  </td>
  <td valign="top" style="border:none;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span lang="EN-US">5.3.2</span></p>
  </td>
 </tr>
 <tr style="mso-yfti-irow:14">
  <td valign="top" style="border:none;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span lang="EN-US">Swagger</span></p>
  </td>
  <td valign="top" style="border:none;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal">文档生成工具</p>
  </td>
  <td valign="top" style="border:none;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span lang="EN-US">3.0.0</span></p>
  </td>
 </tr>
 <tr style="mso-yfti-irow:15">
  <td valign="top" style="border:none;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span lang="EN-US">Logstash-<span class="SpellE">logback</span>-encoder</span></p>
  </td>
  <td valign="top" style="border:none;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span lang="EN-US">Logstash</span>日志收集插件</p>
  </td>
  <td valign="top" style="border:none;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span lang="EN-US">7.2 </span></p>
  </td>
 </tr>
 <tr style="mso-yfti-irow:16">
  <td valign="top" style="border:none;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span lang="EN-US">JWT</span></p>
  </td>
  <td valign="top" style="border:none;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span lang="EN-US">JWT</span>登录支持</p>
  </td>
  <td valign="top" style="border:none;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span lang="EN-US">0.9.1</span></p>
  </td>
 </tr>
 <tr style="mso-yfti-irow:17;mso-yfti-lastrow:yes">
  <td valign="top" style="border:none;border-bottom:solid windowtext 1.0pt;
  mso-border-bottom-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span lang="EN-US">Lombok</span></p>
  </td>
  <td valign="top" style="border:none;border-bottom:solid windowtext 1.0pt;
  mso-border-bottom-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal">代码简化工具</p>
  </td>
  <td valign="top" style="border:none;border-bottom:solid windowtext 1.0pt;
  mso-border-bottom-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt">
  <p class="MsoNormal"><span lang="EN-US">1.18.24</span></p>
  </td>
 </tr>
</tbody></table>


数据库表前缀说明
pms_：商品模块相关
oms_：订单模块相关
sms_：营销模块相关
ums_：用户模块相关
cms_：内容模块相关



mall实现的功能概览
商品模块
    商品管理
    商品促销管理
    商品品牌管理
    商品分类管理
    商品属性管理
订单模块
    订单管理
    购物车管理
    退货管理
营销模块
    优惠券管理
    首页广告
    新品推荐
    热门商品推荐
    专题管理
    秒杀活动管理
用户模块
    后台用户管理
    后台资源管理
    会员管理
