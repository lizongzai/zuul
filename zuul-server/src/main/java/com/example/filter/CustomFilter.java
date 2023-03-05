package com.example.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 功能描述: 网关过滤器
 *
 * @author lizongzai
 * @date 2023/03/04 15:04
 * @since 1.0.0
 */
@Component
public class CustomFilter extends ZuulFilter {

  private static final Logger logger = LoggerFactory.getLogger(CustomFilter.class);

  /**
   * 过滤器类型 pre routing post error
   *
   * @return
   */
  @Override
  public String filterType() {
    return "pre";
  }

  /**
   * 执行顺序 数值越小，优先级越高
   *
   * @return
   */
  @Override
  public int filterOrder() {
    return 0;
  }

  /**
   * 执行条件 true 开启 false 关闭
   *
   * @return
   */
  @Override
  public boolean shouldFilter() {
    return true;
  }

  /**
   * 动作（具体操作） 具体逻辑
   *
   * @return
   * @throws ZuulException
   */
  @Override
  public Object run() throws ZuulException {
    // 获取请求上下文
    RequestContext currentContext = RequestContext.getCurrentContext();
    HttpServletRequest request = currentContext.getRequest();
    logger.info("CustomZuulFilter--> method={}, url={}", request.getMethod(),
        request.getRequestURL().toString());
    return null;
  }
}
