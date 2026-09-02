<a href="https://gitlab.com/mudiatech/pandora/-/pipelines" target="_blank"><img alt="pipeline status" src="https://gitlab.com/mudiatech/pandora/badges/develop/pipeline.svg" /></a> 
<a href="https://gitlab.com/mudiatech/pandora/-/jobs" target="_blank"><img alt="coverage report" src="https://gitlab.com/mudiatech/pandora/badges/develop/coverage.svg" /></a> 

# Pandora

Collection of utilities and controls to support JavaFX projects


#### How to Use
1. Add GitLab package registry as maven repository

```xml
<repositories>
    <repository>
        <id>mudiatech</id>
        <url>https://gitlab.com/api/v4/groups/64413151/-/packages/maven</url>
    </repository>
</repositories>
```

2. Add this project as maven dependency

```xml
<dependency>
    <groupId>com.pinodesk</groupId>
    <artifactId>pandora</artifactId>
    <version>0.2.0-SNAPSHOT</version>
</dependency>
```
