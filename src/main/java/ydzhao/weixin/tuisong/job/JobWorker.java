package ydzhao.weixin.tuisong.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import ydzhao.weixin.tuisong.util.Pusher;

/**
 *@ClassName JobWorker
 *@Description TODO
 *@Author ydzhao
 *@Date 2022/8/2 16:00
 */
@Component
public class JobWorker {
    //要推送的用户openid
    private static String openId = "o3Z7p6cZ8dr8pDg3WNFR82UJjenI";

    @Scheduled(cron = "0 30 7 * * ?")
    public void goodMorning(){
        Pusher.push(openId);
    }

}
