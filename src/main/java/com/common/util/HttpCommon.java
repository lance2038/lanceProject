package com.common.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.AbstractHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

import java.net.SocketTimeoutException;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/4/5.
 */
public class HttpCommon
{
    private static final int TIMEOUT_CONN = 3 * 1000;
    private static final int TIMEOUT_READ = 3 * 1000;

    private String sessionId;

    public void setSessionId(String sessionId)
    {
        this.sessionId = sessionId;
    }

    /**
     * http Get请求
     */
    public String doGet(String serverSuffix)
    {
        HttpClient client = new DefaultHttpClient();
        // 请求超时
        client.getParams().setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, TIMEOUT_CONN);
        // 读取超时
        client.getParams().setParameter(CoreConnectionPNames.SO_TIMEOUT, TIMEOUT_READ);
        HttpGet get = new HttpGet(serverSuffix);

        String retJson = null;
        try {
            HttpResponse resp = client.execute(get);
            int respCode = resp.getStatusLine().getStatusCode();
            if (respCode == 200) {
                retJson = EntityUtils.toString(resp.getEntity(), HTTP.UTF_8);
            }
            else {
            }
            if (retJson == null || retJson.equals("")) {
                retJson = "{:}";
            }
        }
        catch (SocketTimeoutException e) {

        }
        catch (Exception e) {
        }

        return retJson;
    }

    public String doPostJson(String serverSuffix, Map map)
    {
        String retJson = null;
        HttpClient client = new DefaultHttpClient();
        try {
            HttpPost post = new HttpPost(serverSuffix);
            post.setEntity(new StringEntity(new ObjectMapper().writeValueAsString(map).toString(), HTTP.UTF_8));
            post.setHeader("Content-Type", "application/json");
            // 请求超时
            client.getParams().setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, TIMEOUT_CONN);
            // 读取超时
            client.getParams().setParameter(CoreConnectionPNames.SO_TIMEOUT, TIMEOUT_READ);
            System.out.println(serverSuffix);

            HttpResponse resp = client.execute(post);
            int respCode = resp.getStatusLine().getStatusCode();
            if (respCode == 200) {
                retJson = EntityUtils.toString(resp.getEntity(), HTTP.UTF_8);
            }
            else if (respCode == 404) {
            }
            else {
            }

            if (retJson == null || retJson.equals("")) {
            }

        }
        catch (SocketTimeoutException e) {

        }
        catch (Exception e) {
        }

        return retJson;
    }

    /**
     * POST提交
     *
     * @param serverSuffix
     * @param params
     * @return
     */
    public String doPost(String serverSuffix, List<NameValuePair> params)
    {
        String retJson = null;
        HttpClient client = new DefaultHttpClient();
        try {
            HttpPost post = new HttpPost(serverSuffix);
            if (null != sessionId) {
                post.setHeader("Cookie", "JSESSIONID=" + sessionId);
            }
            post.setEntity(new UrlEncodedFormEntity(params, HTTP.UTF_8));
            post.setHeader("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");
            // 请求超时
            client.getParams().setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, TIMEOUT_CONN);
            // 读取超时
            client.getParams().setParameter(CoreConnectionPNames.SO_TIMEOUT, TIMEOUT_READ);

            HttpResponse resp = client.execute(post);
            int respCode = resp.getStatusLine().getStatusCode();
            if (respCode == 200) {
                if (null == sessionId) {
                    CookieStore cookieStore = ((AbstractHttpClient) client).getCookieStore();
                    List cookies = cookieStore.getCookies();
                    for (int i = 0; i < cookies.size(); i++) {
                        //这里是读取Cookie['JSPSESSID']的值存在静态变量中，保证每次都是同一个值
                        Cookie cookie = (Cookie) cookies.get(i);
                        if ("JSESSIONID".equals(cookie.getName())) {
                            sessionId = cookie.getValue();
                        }
                    }
                }
                retJson = EntityUtils.toString(resp.getEntity(), HTTP.UTF_8);
            }
            else if (respCode == 404) {
            }
            else {
            }
        }
        catch (SocketTimeoutException e) {

        }
        catch (Exception e) {

        }
        return retJson;
    }
}
