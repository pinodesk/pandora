![GitHub Release](https://img.shields.io/github/v/release/pinodesk/pandora)
![CI](https://github.com/pinodesk/pandora/actions/workflows/ci.yml/badge.svg)
![codecov](https://codecov.io/gh/pinodesk/pandora/branch/main/graph/badge.svg)
[![Quality gate status](https://sonarcloud.io/api/project_badges/measure?project=pinodesk_pandora&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=pinodesk_pandora)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=pinodesk_pandora&metric=reliability_rating)](https://sonarcloud.io/summary/new_code?id=pinodesk_pandora)
![License](https://img.shields.io/github/license/pinodesk/pandora)

# Pandora

Collection of utilities and controls to support JavaFX projects

## How to Use

### Using GitHub Packages

Add GitHub Packages as a Maven repository in your `pom.xml`:

```xml
<repositories>
    <repository>
        <id>github</id>
        <url>https://maven.pkg.github.com/pinodesk/pandora</url>
    </repository>
</repositories>
```

Add this project as a Maven dependency:

```xml
<dependency>
    <groupId>com.pinodesk</groupId>
    <artifactId>pandora</artifactId>
    <version>0.2.0-SNAPSHOT</version>
</dependency>
```

### Authentication Required

GitHub Packages requires authentication. Add the following to your `~/.m2/settings.xml`:

```xml
<settings>
  <servers>
    <server>
      <id>github</id>
      <username>YOUR_GITHUB_USERNAME</username>
      <password>YOUR_GITHUB_TOKEN</password>
    </server>
  </servers>
</settings>
```

To create a GitHub token:
1. Go to GitHub Settings > Developer settings > Personal access tokens > Tokens (classic)
2. Generate a new token with `read:packages` scope
3. Use the token as the password in settings.xml
