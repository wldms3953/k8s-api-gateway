package com.welab.k8s_api_gateway.gateway.filter;

import org.springframework.cloud.gateway.server.mvc.filter.SimpleFilterSupplier;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayFilterSupplier extends SimpleFilterSupplier {
    public GatewayFilterSupplier() {
        super(GatewayFilterFunctions.class);
    }
}