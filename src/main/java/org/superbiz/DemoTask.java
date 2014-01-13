package org.superbiz;

import javax.batch.api.BatchProperty;
import javax.batch.api.Batchlet;
import javax.batch.runtime.context.JobContext;
import javax.inject.Inject;

public class DemoTask implements Batchlet {
    @Inject
    @BatchProperty
    private String config;

    @Inject
    private JobContext job;

    @Override
    public String process() throws Exception {
        job.setExitStatus(config);
        return config;
    }

    @Override
    public void stop() throws Exception {
        // no-op
    }
}
