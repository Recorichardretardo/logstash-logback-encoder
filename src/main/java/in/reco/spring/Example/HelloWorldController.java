package in.reco.spring.Example;

import static net.logstash.logback.argument.StructuredArguments.keyValue;
import static net.logstash.logback.argument.StructuredArguments.kv;
import static net.logstash.logback.argument.StructuredArguments.v;
import static net.logstash.logback.argument.StructuredArguments.value;

import static net.logstash.logback.marker.Markers.append;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.slf4j.MDC.MDCCloseable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController  
public class HelloWorldController {
	
	private static final Logger log = LoggerFactory.getLogger(HelloWorldController.class);
	
	@RequestMapping("/")  
	public String hello()   
	{  
		 log.info("Order {} saved", 123);
	return "Hello StructuredLoggingTests";  
	} 
	
	@RequestMapping("/log1")  
	public String log1()   
	{  
	log.info("Order saved orderId", 123);
	return "Hello StructuredLoggingTests log1()";  
	} 
	
	@RequestMapping("/log2")  
	public String log2()   
	{  
	String orderId = "123";
	log.info("Order {} saved", value("orderId", orderId));
	return "Hello StructuredLoggingTests log2()";  
	}
	
	@RequestMapping("/log3")
	public String log3() {
		String orderId = "123";
		try (MDCCloseable ignored = MDC.putCloseable("orderId", orderId)) {
			log.info("Order saved");
		}
		return "Hello StructuredLoggingTests log3()";
	}

	@RequestMapping("/log4")
	public String log4() {
		 String orderId = "123";
		 log.info("Order saved {}", v("orderId", orderId));
		return "Hello StructuredLoggingTests log4()";
	}
	
	@RequestMapping("/log5")
	public String log5() {
		 String oldStatus = "NEW";
		 String newStatus = "READY";
		 log.info("Status changed {}->{}.", v("oldStatus", oldStatus), v("newStatus", newStatus));
		return "Hello StructuredLoggingTests log5()";
	}
	
	@RequestMapping("/log6")
	public String log6() {
		 String orderId = "123";
		 log.info("Order saved {}", keyValue("orderId", orderId));
		return "Hello StructuredLoggingTests log6()";
	}
	
	@RequestMapping("/log7")
	public String log7() {
		 String orderId = "123";
		 String status = "NEW";
		log.info("Order saved {} {}", kv("orderId", orderId), kv("status", status));
		return "Hello StructuredLoggingTests log7()";
	}
	
	@RequestMapping("/log8")
	public String log8() {
		 Order order = new Order("123", "NEW", null);
		 log.info("Order saved {}", kv("order", order));
		return "Hello StructuredLoggingTests log8()";
	}
	
	@RequestMapping("/log9")
	public String log9() {
		 String orderId = "123";
		 String status = "NEW";
		log.info("Order saved", kv("orderId", orderId), kv("status", status));
		return "Hello StructuredLoggingTests log9()";
	}
	
	@RequestMapping("/log10")
	public String log10() {
		 Order order = new Order("123", "NEW", null);
		 log.info("Order saved", kv("order", order));
		return "Hello StructuredLoggingTests log10()";
	}
	
	@RequestMapping("/log11")
	public String log11() {
		 String oldStatus = "NEW";
		 String newStatus = "READY";
		 log.info("Status changed", v("oldStatus", oldStatus), v("newStatus", newStatus));
		return "Hello StructuredLoggingTests log11()";
	}
	
	@RequestMapping("/log12")
	public String log12() {
		/*
		 * Add "name":"value" to the JSON output,
		 * but only add the value to the formatted message.
		 *
		 * The formatted message will be `log message value`
		 */
		log.info("log message {}", value("name", "value"));
		return "Hello StructuredLoggingTests log12()";
	}
	
	
	@RequestMapping("/log13")
	public String log13() {
		/*
		 * Add "name":"value" to the JSON output,
		 * and add name=value to the formatted message.
		 *
		 * The formatted message will be `log message name=value`
		 */
		log.info("log message {}", keyValue("name", "value"));
		return "Hello StructuredLoggingTests log13()";
	}
	
	@RequestMapping("/log14")
	public String log14() {
		/*
		 * Add "name":"value" to the JSON output,
		 * and add name=value to the formatted message.
		 *
		 * The formatted message will be `log message name=value`
		 */
		log.info("log message {}", keyValue("name", "value"));
		return "Hello StructuredLoggingTests log14()";
	}
	
	@RequestMapping("/log15")
	public String log15() {
		 Order order = new Order("123", "NEW", null);
		log.info(append("name", order), order.toString());
		return "Hello StructuredLoggingTests log15()";
	}
	
	@RequestMapping("/log16")
	public String log16() {
		/*
		 * Add multiple key value pairs to both JSON and formatted message
		 */
		log.info("log message {} {}", keyValue("name1", "value1"), keyValue("name2", "value2"));
		return "Hello StructuredLoggingTests log16()";
	}
	
	
	
	
	static class Order {
	    String orderId;
	    String status;
	    String canceled;

	    Order(String orderId, String status, String canceled) {
	      this.orderId = orderId;
	      this.status = status;
	      this.canceled = canceled;
	    }

	    public String getOrderId() {
	      return orderId;
	    }

	    public String getStatus() {
	      return status;
	    }

	    public String getCanceled() {
	      return canceled;
	    }
	  }
}
