package ru.alexeyrand.whoistobuygateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

import java.util.List;

public class CorsConfig extends CorsConfiguration {

        @Bean
        public CorsWebFilter corsFilter()
        {
            CorsConfiguration config = new CorsConfiguration();
            config.setAllowCredentials( true );
            config.setAllowedOrigins( List.of( "http://localhost:3000" ) );
            config.setAllowedMethods( List.of( "GET", "POST", "PUT", "DELETE", "OPTIONS", "HEAD" ) );
            config.setAllowedHeaders( List.of( "origin", "content-type", "accept", "authorization", "cookie" ) );

            UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
            source.registerCorsConfiguration( "/**", config );

            return new CorsWebFilter( source );
        }

}
