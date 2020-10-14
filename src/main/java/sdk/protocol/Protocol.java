package sdk.protocol;

import sdk.Invocation;
import sdk.Invoker;
import sdk.URL;


/**
 * 通信协议接口-Protocol
 *
 * @author wangxin119
 * @date 2020-08-19 10:44
 */
public interface Protocol {

    String send(URL url, Invocation invocation);

    String testSpi();

    void export(Invoker invoker);

    <T> Invoker<T> refer(Class<T> type, URL url);

}
