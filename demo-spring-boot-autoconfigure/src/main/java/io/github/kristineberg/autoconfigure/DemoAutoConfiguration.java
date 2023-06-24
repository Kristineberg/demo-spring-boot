package io.github.kristineberg.autoconfigure;

import io.github.kristineberg.DemoClient;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 腾讯服务位置配置类
 *
 * @author william@StarImmortal
 * @date 2023/06/13
 */
@Configuration(proxyBeanMethods = false)
@EnableConfigurationProperties(DemoProperties.class)
public class DemoAutoConfiguration {

	private final DemoProperties demoProperties;

	public DemoAutoConfiguration(DemoProperties demoProperties) {
		this.demoProperties = demoProperties;
	}

	@Bean
	public DemoClient lbsClient() {
		return new DemoClient(demoProperties.getKey(), demoProperties.getSk());
	}

}
