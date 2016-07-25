# Installing the project

## Database

In a Database will be user with admin rights, e-mail:  **admin@ss.com**, and password:  **admin**


# Developing

## Database

For creating empty tables, please, issue command from project root dir

**mvn dbmaintain:updateDatabase@db-update-create**

For creating tables and populating them with some reference data, please, issue command from project root dir

**mvn dbmaintain:updateDatabase@db-update-refdata**

For dropping a database is a Maven command issued from project root dir

**mvn dbmaintain:clearDatabase**

For removing the data of all database tables

**mvn dbmaintain:cleanDatabase**


# Troubleshooting

In case a Tomcat will give you a warning like org.apache.catalina.webresources.Cache.getResource Unable to add the resource ... to the cache because there was insufficient free space

Please, In your $CATALINA_BASE/conf/context.xml add block before </Context>

&lt;Resources cachingAllowed="true" cacheMaxSize="100000" /&gt;