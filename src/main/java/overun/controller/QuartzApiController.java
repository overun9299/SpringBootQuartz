package overun.controller;

import org.quartz.SchedulerException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import overun.quartz.QuartzScheduler;

/**
 * @ClassName: QuartzApiController
 * @Description:
 * @author: 薏米滴答-西安-ZhangPY
 * @version: V1.0
 * @date: 2019/7/22 11:19
 * @Copyright: 2019 www.yimidida.com Inc. All rights reserved.
 */

@RestController
public class QuartzApiController {

    @Autowired
    private QuartzScheduler quartzScheduler;

    /** 日志 */
    Logger logger = LoggerFactory.getLogger(QuartzApiController.class);


    /**
     * 启动
     */
    @RequestMapping("/start")
    public void startQuartzJob() {
        try {
            quartzScheduler.startJob();
        } catch (SchedulerException e) {
            logger.error(e.getMessage());
        }
    }
}
