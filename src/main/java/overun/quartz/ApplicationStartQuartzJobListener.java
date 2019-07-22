package overun.quartz;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.impl.StdSchedulerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;



/**
 * @ClassName: ApplicationStartQuartzJobListener
 * @Description:
 * @author: 薏米滴答-西安-ZhangPY
 * @version: V1.0
 * @date: 2019/7/22 11:10
 * @Copyright: 2019 www.yimidida.com Inc. All rights reserved.
 */
@Configuration
public class ApplicationStartQuartzJobListener  implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private QuartzScheduler quartzScheduler;

    /** 日志 */
    Logger logger = LoggerFactory.getLogger(ApplicationStartQuartzJobListener.class);

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
//        try {
//            quartzScheduler.startJob();
            System.out.println("任务已经启动...");
//        } catch (SchedulerException e) {
//            logger.error(e.getMessage());
//        }
    }


    /**
     * 初始注入scheduler
     * @return
     * @throws SchedulerException
     */
    @Bean
    public Scheduler scheduler() throws SchedulerException{
        SchedulerFactory schedulerFactoryBean = new StdSchedulerFactory();
        return schedulerFactoryBean.getScheduler();
    }
}
