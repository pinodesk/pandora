<a href="https://gitlab.com/mudiasoft/pandora/-/pipelines" target="_blank"><img alt="pipeline status" src="https://gitlab.com/mudiasoft/pandora/badges/develop/pipeline.svg" /></a> 
<a href="https://gitlab.com/mudiasoft/pandora/-/jobs" target="_blank"><img alt="coverage report" src="https://gitlab.com/mudiasoft/pandora/badges/develop/coverage.svg" /></a> 

# Pandora

Collection of utilities and controls to support JavaFX projects


#### How to Use
1. Add GitLab package registry as maven repository

```xml
<repositories>
    <repository>
        <id>mudiasoft</id>
        <url>https://gitlab.com/api/v4/groups/64413151/-/packages/maven</url>
    </repository>
</repositories>
```

2. Add this project as maven dependency

```xml
<dependency>
    <groupId>com.gitlab.mudiasoft</groupId>
    <artifactId>pandora</artifactId>
    <version>0.1.0-SNAPSHOT</version>
</dependency>
```
