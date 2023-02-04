package com.zpb.proto.grpc.interceptor;

import io.grpc.*;

/**
 * @author       pengbo.zhao
 * @description  请求-拦截器
 * @createDate   2022/7/15 10:58
 * @updateDate   2022/7/15 10:58
 * @version      1.0
 * <P>
 *     https://blog.csdn.net/u013360850/article/details/115278381
 *
 * </P>
 */

public class HelloRequestInterceptor implements ClientInterceptor {
    @Override
    public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(MethodDescriptor<ReqT, RespT> methodDescriptor, CallOptions callOptions, Channel channel) {

        return null;
    }
}
