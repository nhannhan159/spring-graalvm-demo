package com.nhannhan159.graalvm.integration.google;

import com.google.cloud.bigquery.BigQuery;
import com.google.cloud.bigquery.BigQueryException;
import com.google.cloud.bigquery.QueryJobConfiguration;
import com.google.cloud.bigquery.TableResult;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

/**
 * @author tien.tan
 */
@Slf4j
@RequiredArgsConstructor
//@Service
public class SimpleQueryService {
    private final BigQuery bigQuery;

    @Nullable
    public TableResult simpleQuery(String query) {
        try {
            QueryJobConfiguration queryConfig = QueryJobConfiguration.newBuilder(query).build();
            return bigQuery.query(queryConfig);
        } catch (BigQueryException | InterruptedException e) {
            log.error("Query did not run: {}", e.getMessage());
            return null;
        }
    }
}
