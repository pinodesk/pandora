<a href="https://gitlab.com/mudia/pro/pandora/-/pipelines" target="_blank"><img alt="pipeline status" src="https://gitlab.com/mudia/pro/pandora/badges/develop/pipeline.svg" /></a> 
<a href="https://gitlab.com/mudia/pro/pandora/-/jobs" target="_blank"><img alt="coverage report" src="https://gitlab.com/mudia/pro/pandora/badges/develop/coverage.svg" /></a> 

# Pandora

Collection of utilities and controls to support JavaFX projects


#### How to Use
1. Add GitLab package registry as maven repository

```xml
<repositories>
    <repository>
        <id>mudia</id>
        <url>https://gitlab.com/api/v4/groups/64413151/-/packages/maven</url>
    </repository>
</repositories>
```

2. Add this project as maven dependency

```xml
<dependency>
    <groupId>com.gitlab.mudia.pro</groupId>
    <artifactId>pandora</artifactId>
    <version>0.2.0-SNAPSHOT</version>
</dependency>
```
