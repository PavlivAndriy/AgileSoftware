# Installing the project

## Database

Before running the project.

Please, create a database with Maven command issued from project root dir

**mvn dbmaintain:updateDatabase**

In a Database will be user with admin rights, e-mail:  **admin@ss.com**, and password:  **admin**


# Developing

## Database

For dropping a database is a Maven command issued from project root dir

**mvn dbmaintain:clearDatabase**

For removing the data of all database tables

**mvn dbmaintain:cleanDatabase**


# Troubleshooting

In case a Tomcat will give you a warning like org.apache.catalina.webresources.Cache.getResource Unable to add the resource ... to the cache because there was insufficient free space

Please, In your $CATALINA_BASE/conf/context.xml add block before </Context>

&lt;Resources cachingAllowed="true" cacheMaxSize="100000" /&gt;