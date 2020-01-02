package org.apache.hudi.utilities;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;

public class TestHiveIncrementalPuller {

    @BeforeClass
    public static void initClass() {

    }

    @Test
    public void testHiveIncrementalPuller() throws IOException {
        HiveIncrementalPuller.Config config = new HiveIncrementalPuller.Config();
        config.hiveJDBCUrl = "jdbc:hive2://localhost:10000/default;";
        config.sourceDb = "default";
        config.sourceTable = "src";
        config.targetDb = "default";
        config.targetTable = "dst";
        HiveIncrementalPuller puller = new HiveIncrementalPuller(config);
        puller.saveDelta();
    }
}
