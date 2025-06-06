//package ru.alexeyrand.whoistobuygateway.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
//import org.springframework.cloud.context.config.annotation.RefreshScope;
//import org.springframework.cloud.gateway.filter.GatewayFilter;
//import org.springframework.cloud.gateway.filter.GatewayFilterChain;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.server.reactive.ServerHttpRequest;
//import org.springframework.http.server.reactive.ServerHttpResponse;
//import org.springframework.stereotype.Component;
//import org.springframework.web.server.ServerWebExchange;
//import reactor.core.publisher.Mono;
//
//import ru.alexeyrand.whoistobuygateway.services.JwtService;
//
//@Component
//@RefreshScope
//public class AuthenticationFilter implements GatewayFilter {
//
//    @Autowired
//    private RouterValidator validator;
//    @Autowired
//    private JwtService jwtService;
//    @Autowired
//    private DataSourceTransactionManagerAutoConfiguration dataSourceTransactionManagerAutoConfiguration;
//
//    @Override
//    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//        ServerHttpRequest request = exchange.getRequest();
//
//        if (validator.isSecured.test(request)) {
//            if (authMissing(request)) {
//                return onError(exchange, HttpStatus.UNAUTHORIZED);
//            }
//
//            final String token = request.getHeaders().getOrEmpty("Authorization").getFirst().substring(7);;
//
//            if (!jwtService.validateToken(token)) {
//                return onError(exchange, HttpStatus.UNAUTHORIZED);
//            }
//
//        }
//        return chain.filter(exchange);
//    }
//
//    private Mono<Void> onError(ServerWebExchange exchange, HttpStatus httpStatus) {
//        ServerHttpResponse response = exchange.getResponse();
//        response.setStatusCode(httpStatus);
//        return response.setComplete();
//    }
//
//    private boolean authMissing(ServerHttpRequest request) {
//        return !request.getHeaders().containsKey("Authorization");
//    }
//}
