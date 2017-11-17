package cn.com.gree.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;

public class JDBCUtils {
    private static ComboPooledDataSource dataSource = new ComboPooledDataSource();

    public static QueryRunner getQueryRunner() {
        return new QueryRunner(dataSource);
    }
}
