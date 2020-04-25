package com.atguigu.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;

@Configuration
public class MySelfRule {
	@Bean
	public IRule getRule() {
		return new RoundRobinRule_ZY();//改为轮询，在主方法上指定的此IRule会覆盖主配置中的组件
	}
}
