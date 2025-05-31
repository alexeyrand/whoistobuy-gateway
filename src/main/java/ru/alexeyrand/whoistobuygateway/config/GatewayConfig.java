//package ru.alexeyrand.whoistobuygateway.config;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.cloud.netflix.hystrix.EnableHystrix;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@EnableHystrix
//public class GatewayConfig {
//
//    @Autowired
//    private AuthenticationFilter filter;
//
//    public RouteLocator routes(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route(r -> r.path("/api/v1/auth/**")
////                        .filters(f -> f.filter(filter))
//                        .uri("lb://whoistobuy-auth"))
//                .route(r -> r.path("/test/**")
////                        .filters(f -> f.filter(filter))
//                        .uri("lb://whoistobuy-auth"))
//                .route(r -> r.path("/shop/**")
//                        .filters(f -> f.filter(filter))
//                        .uri("lb://whoistobuy-shop"))
//                .build();
//    }
//
//}
