https://github.com/logstash/logstash-logback-encoder

https://stackoverflow.com/questions/52426121/logstash-logback-event-specific-custom-fields-using-structuredarguments-are-no



log11:

{"@timestamp":"2020-05-12T08:07:29.319+05:30","@version":1,"message":"Status changed","logger_name":"in.reco.spring.Example.HelloWorldController","thread_name":"http-nio-8080-exec-3","level":"INFO","level_value":20000,"HOSTNAME":"DESKTOP-KK0ABHE"}
{"@timestamp":"2020-05-12T08:07:29.319+05:30","@version":1,"message":"Status changed","logger_name":"in.reco.spring.Example.HelloWorldController","thread_name":"http-nio-8080-exec-3","level":"INFO","level_value":20000,"HOSTNAME":"DESKTOP-KK0ABHE","oldStatus":"NEW","newStatus":"READY"}


log10:

08:09:08.412 [http-nio-8080-exec-4] INFO  i.r.s.Example.HelloWorldController - Order saved
{"@timestamp":"2020-05-12T08:09:08.412+05:30","@version":1,"message":"Order saved","logger_name":"in.reco.spring.Example.HelloWorldController","thread_name":"http-nio-8080-exec-4","level":"INFO","level_value":20000,"HOSTNAME":"DESKTOP-KK0ABHE"}
{"@timestamp":"2020-05-12T08:09:08.412+05:30","@version":1,"message":"Order saved","logger_name":"in.reco.spring.Example.HelloWorldController","thread_name":"http-nio-8080-exec-4","level":"INFO","level_value":20000,"HOSTNAME":"DESKTOP-KK0ABHE","order":{"orderId":"123","status":"NEW","canceled":null}}


log9:

08:10:43.440 [http-nio-8080-exec-5] INFO  i.r.s.Example.HelloWorldController - Order saved
{"@timestamp":"2020-05-12T08:10:43.440+05:30","@version":1,"message":"Order saved","logger_name":"in.reco.spring.Example.HelloWorldController","thread_name":"http-nio-8080-exec-5","level":"INFO","level_value":20000,"HOSTNAME":"DESKTOP-KK0ABHE"}
{"@timestamp":"2020-05-12T08:10:43.440+05:30","@version":1,"message":"Order saved","logger_name":"in.reco.spring.Example.HelloWorldController","thread_name":"http-nio-8080-exec-5","level":"INFO","level_value":20000,"HOSTNAME":"DESKTOP-KK0ABHE","orderId":"123","status":"NEW"}


log19:

08:12:32.604 [http-nio-8080-exec-1] INFO  i.r.s.Example.HelloWorldController - Order saved
{"@timestamp":"2020-05-12T08:12:32.604+05:30","@version":1,"message":"Order saved","logger_name":"in.reco.spring.Example.HelloWorldController","thread_name":"http-nio-8080-exec-1","level":"INFO","level_value":20000,"HOSTNAME":"DESKTOP-KK0ABHE"}
{"@timestamp":"2020-05-12T08:12:32.604+05:30","@version":1,"message":"Order saved","logger_name":"in.reco.spring.Example.HelloWorldController","thread_name":"http-nio-8080-exec-1","level":"INFO","level_value":20000,"HOSTNAME":"DESKTOP-KK0ABHE","order":{"orderId":"123","status":"NEW","canceled":null}}
