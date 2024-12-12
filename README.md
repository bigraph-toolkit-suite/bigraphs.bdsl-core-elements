<img src="./etc/bigraph-dsl-logo.png" style="zoom:90%;" />

# Bigraph DSL Grammar: Core Elements (CE)

|                      | Release | Development    |
|----------------------|---------|----------------|
| **Version**          | 2.0.1   | 3.0.0-SNAPSHOT |
| Gradle Compatability | 7.6.2   | 7.6.2          |

 

This projects contains the following major building blocks of **BDSL**, the Bigraphical Domain-specific Language:
- Grammar, Parser, Validation, ...
- Language Server Protocol for language support in any IDE
- Unit tests

The grammar is implemented using [Xtext](https://github.com/eclipse/xtext) and [Xtend](https://eclipse.dev/Xtext/xtend/).
Xtext is a language development framework, and Xtend is a language that compiles into idiomatic Java source code.

IDE support is provided for the following platforms to be more productive when experimenting with BDSL:
- Eclipse, IntelliJ, Visual Code, ... by utilizing the *Language Server Protocol*

This framework provides the core elements, which may be used in other Java frameworks, libraries and applications.
For instance, refer to [https://git-st.inf.tu-dresden.de/bigraphs/bigraph-algebraic-interpreter](https://git-st.inf.tu-dresden.de/bigraphs/bigraph-algebraic-interpreter), where an interpreter for BDSL is implemented.


## Getting Started

### Maven Configuration

Use the following dependency within a Maven-based project.
Replace `${version}` with the current version.

```xml
<!-- BDSL Grammar -->          
<dependency>
	<groupId>org.bigraphs.dsl</groupId>
    <artifactId>bdsl-grammar</artifactId>
    <version>${version}</version>
    <exclusions>
    	<exclusion>
        	<groupId>org.bigraphs.dsl</groupId>
            <artifactId>BigraphBaseModel</artifactId>
        </exclusion>
        <exclusion>
        	<groupId>org.eclipse.xtext</groupId>
        	<artifactId>xtext-dev-bom</artifactId>
        </exclusion>
    </exclusions>
</dependency>
```

### SNAPSHOT Releases

For SNAPSHOT releases also add the following repository to you project's `pom.xml`:

```xml
<!-- Additional Repository for SNAPSHOT Releases -->
<repositories>
	<repository>
        <snapshots>
        	<enabled>true</enabled>
        </snapshots>
        <id>ossrh</id>
    	<url>https://s01.oss.sonatype.org/content/repositories/snapshots</url>
	</repository>
</repositories>  
```

## Development

**Requirements**
- Java >= 17
- Gradle >= 7.4.2
- Check that the environment variable `JAVA_HOME` is pointing to the correct JDK
  - `update-java-alternatives --list`
  - `export JAVA_HOME=...`

### Project Setup

First, clone this repository:

```shell
git clone --recursive https://github.com/bigraph-toolkit-suite/bigraphs.bdsl-core-elements
```

This project includes [Ecore Bigraph Metamodel](https://github.com/bigraph-toolkit-suite/bigraphs.bigraph-ecore-metamodel) as git submodule.
The main branch of the repository [Ecore Bigraph Metamodel](https://github.com/bigraph-toolkit-suite/bigraphs.bigraph-ecore-metamodel) will also be pulled.
This dependency includes the Ecore metamodels of bigraphs that is used by the Xtext-based BDSL grammar to represent
bigraphical structures.

To update the submodule (i.e., the Bigraph Ecore Metamodel) later at any time to the latest tagged version, run the following command:
```shell
git submodule update --recursive --remote
# Force overwriting changes
git submodule update --recursive --remote --force
```

### Building from Source

This command builds everything:

```shell
# Except tests
./gradlew clean build -x test
# Specific module
# ./gradlew clean :org.bigraphs.dsl:build -x test
# ./gradlew clean :org.bigraphs.dsl.ide:build -x test
```

The builds can be found in:
- ./org.bigraphs.dsl/build/libs
- ./org.bigraphs.dsl.ide/build/libs

#### Generate Xtext Language Artifacts

You can just generate the code from the Xtext grammar by issuing the next command:

```bash
./gradlew clean generateXtextLanguage 
# Specific module
# ./gradlew clean :org.bigraphs.dsl:generateXtext
# ./gradlew clean :org.bigraphs.dsl:generateXtextLanguage
```

#### Generate Language Server Protocol

```bash
./gradlew shadowJar
# Specific module
./gradlew clean :org.bigraphs.dsl.ide:shadowJar
```

The build depends on shadowJar task.

> **Note:** The language server protocol `*.jar` is located under `org.bigraphs.dsl.ide/build/libs/`.

#### Run Tests

The following commands show how to run various kinds of tests:

```shell
# Run all test cases
./gradlew :org.bigraphs.dsl.tests:test -PwithTests
# All tests within a package
./gradlew test --tests org.bigraphs.dsl.tests.ide.validation* -PwithTests
# All tests within a class
./gradlew test --tests *BdslAffectionUnitTest -PwithTests
# Only a specific test method
./gradlew test --tests *testSignatureMatchOnAssignment_01 -PwithTests
```

Test report is written to `org.bigraphs.dsl.tests/build/reports/tests/test/index.html`.

#### Install Grammar to Local Maven Repository

If you want to use the BDSL grammar artifact in your Java projects for testing and development purposes, you can install the compiled JARs into your local Maven repository (usually located at `~/.m2/`).
Then it can be conveniently used by other Java projects.

Run the following command:
```shell
./gradlew publishToMavenLocal
./gradlew :org.bigraphs.dsl:publishToMavenLocal
./gradlew :org.bigraphs.dsl.ide:publishToMavenLocal
```

This publishes only the `bdsl-grammar` module containing the BDSL.

### Deployment

- see [The Central Repository Documentation](https://central.sonatype.org/publish/publish-guide/#deployment)
- see [gradle-nexus / publish-plugin](https://github.com/gradle-nexus/publish-plugin/) 

**Arguments**

Every of the following gradle commands accept some arguments:
- The arguments `sonatypeUsername` and `sonatypePassword` are the JIRA account details from [https://issues.sonatype.org/](https://issues.sonatype.org/)
- `signing.keyId`, `signing.password` and `signing.secretKeyRingFile` must also be configured in `gradle.properties` within the user's home directory.
  - secret key ring file usually at `~/.gnupg/secring.gpg`
  - Otherwise, generate it: `gpg --export-secret-keys > ~/.gnupg/secring.gpg`
  - For the passphrase, use the one when the keys were generated (cf. also ~/.m2/settings.xml)
- Arguments can be passed in several ways: https://docs.gradle.org/current/userguide/build_environment.html

The Gradle GPG signing plugin is used to sign the components for the deployment.
It relies on the gpg command being installed:
```shell
sudo apt install gnupg2
```
and the GPG credentials being available e.g. from `gradle.properties` within the user's home directory.
More information can be found [here](https://central.sonatype.org/publish/requirements/gpg/).


#### SNAPSHOT Deployment

Execute the following goal to deploy the `bdsl-grammar` module to the Central Repository:
```shell
gradle publishToSonatype -PsonatypeUsername=username -PsonatypePassword=password
```

- The `version` element in `build.gradle` of the parent project must contain the classifier `SNAPSHOT`.

#### Release Deployment

Execute the following command to manually release the artifacts placed in the closed staging repository in Nexus UI.
The staging repository might be dropped (if needed) or manually released from the Nexus UI.

```shell
gradle publishToSonatype closeSonatypeStagingRepository
gradle :org.bigraphs.dsl:publishToSonatype closeSonatypeStagingRepository
```

Call the following to publish all publications to Sonatype's OSSRH Nexus and subsequently close and release the corresponding staging repository:
```shell
gradle publishToSonatype closeAndReleaseSonatypeStagingRepository
```

> **Note:** This is not recommended!

## Working in Eclipse

This project is best worked with Eclipse. Import everything into a new Eclipse workspace:

- `org.bigraphs.dsl.parent`
- `bigraphs.bigraph-ecore-metamodel` (the cloned Git submodule is also contained after following the [Project Setup](#Development) instructions)

You may need to re-generate the model code of the `bigraphs.bigraph-ecore-metamodel` project as this process is not currently handled by the gradle script.

You may then be able to run the "MWE2 workflow" and to generate "Xtext artifacts" via the Eclipse IDE inside the `org.bigraphs.dsl` project, or call the appropriate gradle command as shown above.

### Project Structure

- gradle-based Project
- Language infrastructure for Bigraph DSL (BDSL) based on Xtext is located under `org.bigraphs.dsl` 
- Language Server Protocol Implementation is located under `org.bigraphs.dsl.ide`
- Test classes are located under `./org.bigraphs.dsl.tests/`
  - Requires modules `org.bigraphs.dsl` and `org.bigraphs.dsl.ide`
- **(!)** Note that the required CDO/EMF/Ecore dependencies are stored separately inside the `./etc/libs` folder. The reason is that there is currently no easy way on how to resolve Eclipse dependencies from P2 repositories in gradle. To clarify: Updating the versions means replacing the files. These dependencies are shadowed in the bdsl-grammar JAR



