package org.superbiz;

import org.apache.batchee.test.JobLauncher;
import org.junit.Test;

import javax.batch.runtime.BatchStatus;
import javax.batch.runtime.JobExecution;

import java.util.Properties;

import static org.junit.Assert.assertEquals;

public class DemoTest {
    @Test
    public void runIt() {
        final JobExecution execution = new JobLauncher("demo").start(new Properties() {{
            setProperty("input", "JBatch!");
        }});

        assertEquals(BatchStatus.COMPLETED, execution.getBatchStatus());
        assertEquals("JBatch!", execution.getExitStatus());
    }
}
