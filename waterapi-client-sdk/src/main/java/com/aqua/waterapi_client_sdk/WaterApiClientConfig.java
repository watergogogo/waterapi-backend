package com.aqua.waterapi_client_sdk;

import com.aqua.waterapi_client_sdk.client.WaterApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author water king
 * @time 2024/1/14
 */
@Configuration
@ConfigurationProperties("water.client")
@Data
@ComponentScan
public class WaterApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public WaterApiClient waterApiClient() {
        return new WaterApiClient(accessKey, secretKey);
    }
}
