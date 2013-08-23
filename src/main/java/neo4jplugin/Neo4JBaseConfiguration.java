package neo4jplugin;


import org.springframework.context.annotation.Bean;
import org.springframework.data.auditing.IsNewAwareAuditingHandler;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.data.neo4j.lifecycle.AuditingEventListener;

public class Neo4JBaseConfiguration extends Neo4jConfiguration {

    @Bean
    public AuditingEventListener auditingEventListener() throws Exception {
        return new AuditingEventListener(new IsNewAwareAuditingHandler<Object>(isNewStrategyFactory()));
    }

}