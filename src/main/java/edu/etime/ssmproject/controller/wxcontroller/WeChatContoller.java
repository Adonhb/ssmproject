package edu.etime.ssmproject.controller.wxcontroller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;


/**
 * @author: lb
 * @datetime: 2019-10-21  10:09:16
 */

@Controller
@RequestMapping("WeChat")
public class WeChatContoller {


//   微信AppID： wxa28f62f9a86af88e

    /**
     * 获取客户openid的方法
     * 说明：@ResponseBody 注解：
     *     表示这个方法返回的内容就是需要响应到客户端的内容，而不需要进行视图解析
     * @param code
     * @return
     */
    @RequestMapping("/getUserInfo")
    @ResponseBody
    public String login(String code) {
        /**
         *AppID：wxa28f62f9a86af88e
         *秘钥：6c61300011ef10a7a9bffe9a0795b722
         * js_code:小程序传递过来的code属性
         */
        String WX_URL = "https://api.weixin.qq.com/sns/jscode2session?appid=wxa28f62f9a86af88e&secret=6c61300011ef10a7a9bffe9a0795b722&js_code="
                + code + "&grant_type=authorization_code";
        String returnvalue = GET(WX_URL);
        JSONObject json = JSONObject.parseObject(returnvalue);
        String openid = json.get("openid").toString();
        return openid;
    }

    // 发起get请求的方法。
    public static String GET(String url) {
        String result = "";
        BufferedReader in = null;
        InputStream is = null;
        InputStreamReader isr = null;
        try {
            URL realUrl = new URL(url);
            URLConnection conn = realUrl.openConnection();
            conn.connect();
            Map<String, List<String>> map = conn.getHeaderFields();
            is = conn.getInputStream();
            isr = new InputStreamReader(is);
            in = new BufferedReader(isr);
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            // 异常记录
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (is != null) {
                    is.close();
                }
                if (isr != null) {
                    isr.close();
                }
            } catch (Exception e2) {
                // 异常记录
            }
        }
        return result;
    }


}
