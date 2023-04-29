# Enterprise-Java-Development-3.06

##  3. List 3 tasks that can be accomplished with native SQL that you cannot do with JPQ.

- Queries that require complex aggregation operations, such as sum or average of values in multiple tables: JPQL supports aggregation operations, but only on a single table at a time. If you need to perform an aggregation operation on multiple tables, you will need to use native SQL or a database API to perform a custom query.

- Queries that involve multiple databases: JPQL can only query persistent objects in a single database, so it cannot query objects that exist in different databases.
