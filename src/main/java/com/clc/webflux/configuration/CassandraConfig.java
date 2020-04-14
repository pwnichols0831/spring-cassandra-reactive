/**
 * 
 */
package com.clc.webflux.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractReactiveCassandraConfiguration;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.repository.config.EnableReactiveCassandraRepositories;

/**
 * <p>
 * <b> This is configuration file for Reactive Cassandra.
 * </p>
 * @author pnichols
 *
 */
@Configuration
@EnableReactiveCassandraRepositories
public class CassandraConfig extends AbstractReactiveCassandraConfiguration{
	@Value("${jsa.cassandra.keyspace-name}")
    String keySpace;

    @Value("${jsa.cassandra.contact-points}")
    String contactPoints;
    
    @Value("${jsa.cassandra.port}")
    int port;

    @Override
    protected String getKeyspaceName() {
        return keySpace;
    }

    @Override
    protected String getContactPoints() {
        return contactPoints;
    }
    
    @Override
    protected int getPort() {
        return port;
    }

    @Override
    public SchemaAction getSchemaAction() {
        return SchemaAction.CREATE;
    }

}
