package sdk.transport;

import sdk.Invocation;

/**
 * @Author wangteng
 * @Date 2020-10-12 15:21
 * @Description
 **/
public interface Transport {

    void start(String hostname, Integer port);


    String send(Invocation invocation);


}
