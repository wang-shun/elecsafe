package com.holley.elecsafe.save.run;

/**
 * JOB基类
 * 
 * @author zhouli
 */
public abstract class BaseComsJob implements Runnable {

    protected boolean isRuning = false;
    protected String  moduleName;

    @Override
    public void run() {
        try {
            execute();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public abstract void execute() throws Exception;

}
