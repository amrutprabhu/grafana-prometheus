package com.amrut.prabhu.Prometheusintegration;

import io.micrometer.core.instrument.MeterRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@RestController
@SpringBootApplication
public class PrometheusIntegrationApplication {

	final static Logger logger = LoggerFactory.getLogger(PrometheusIntegrationApplication.class);
//	@Bean
//	MeterRegistryCustomizer<MeterRegistry> metricsCommonTags() {
//		return registry -> registry.config().commonTags("application", "MYAPPNAME");
//	}
	public static void main(String[] args) {
		SpringApplication.run(PrometheusIntegrationApplication.class, args);
	}

	@GetMapping("/something")
	public ResponseEntity<String> createLogs(){
		logger.warn("Just checking");
		return ResponseEntity.ok().body("All Ok");
	}

}
