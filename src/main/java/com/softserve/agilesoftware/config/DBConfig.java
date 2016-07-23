package com.softserve.agilesoftware.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.jdbc.datasource.init.DatabasePopulator;
import org.springframework.jdbc.datasource.init.DatabasePopulatorUtils;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

import javax.sql.DataSource;

/**
 * Created by ihorlt on 21.07.16.
 */

@Configuration
public class DBConfig {

//    configures a DataSource to be used with Hibernate’s SessionFactory
    @Bean(name = "dataSource")
    public DataSource getDataSource(){
        DataSource dataSource = createDataSource();
//        DatabasePopulatorUtils.execute(createDatabasePopulator(), dataSource);
        return dataSource;
    }

    /**
     *  Creates an object for data populating in the database
     * @return object for populating database with data
     */
    private DatabasePopulator createDatabasePopulator() {
        ResourceDatabasePopulator databasePopulator = new ResourceDatabasePopulator();
        databasePopulator.setContinueOnError(true);
        databasePopulator.addScript(new ClassPathResource("data.sql"));
        return databasePopulator;
    }

    /**
     *
     * @return DataSource object connected with database
     */
    private SimpleDriverDataSource createDataSource() {
        SimpleDriverDataSource simpleDriverDataSource = new SimpleDriverDataSource();
        simpleDriverDataSource.setDriverClass(com.mysql.cj.jdbc.Driver.class);
        simpleDriverDataSource.setUrl("jdbc:mysql://localhost:3306/agilesoftware?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
        simpleDriverDataSource.setUsername("root");
        simpleDriverDataSource.setPassword("root");
        return simpleDriverDataSource;
    }
}
