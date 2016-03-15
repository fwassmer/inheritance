# inheritance
Sample project to show jpa issue when using inheritance and generics with multiple inheritance levels.

Dao set in reportPersistenceManager with jpa in blueprint (expected ReportDao):

*   enabled: $AbstractJpaDao1119604077
*   disabled: ReportDao

&nbsp;

 
Usage in karaf 4.0.x: 
```
feature:repo-add mvn:org.broken/features/1.0-SNAPSHOT/xml/features
feature:install buggy
break:me
```
