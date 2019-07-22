package overun.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName: SchedulerQuartzJob
 * @Description:
 * @author: 薏米滴答-西安-ZhangPY
 * @version: V1.0
 * @date: 2019/7/20 15:34
 * @Copyright: 2019 www.yimidida.com Inc. All rights reserved.
 */
public class SchedulerQuartzJob implements Job {

    /** 日志 */
    Logger logger = LoggerFactory.getLogger(SchedulerQuartzJob.class);

    private void beford() {
        logger.error("任务执行开始");
    }

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        beford();
        System.out.println(System.currentTimeMillis());
        /** 执行业务 */
        logger.error("执行业务逻辑");
        System.out.println(System.currentTimeMillis());

    }


    private void after() {
        logger.error("任务执行完毕");
    }
}
