<img src="./etc/bigraph-dsl-logo.png" style="zoom:90%;" />

# Bigraph DSL Grammar: Core Elements (CE)

|             | Release | Development    |
|-------------|---------|----------------|
| **Version** | 1.0.0   | 1.0.0-SNAPSHOT |
| **Java**    | 17      | 17             |

 

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
	<groupId>de.tudresden.inf.st.bigraphs.dsl</groupId>
    <artifactId>bdsl-grammar</artifactId>
    <version>${version}</version>
    <exclusions>
    	<exclusion>
        	<groupId>de.tudresden.inf.st.bigraphs.dsl</groupId>
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

### Project Setup

First, clone this repository:

```shell
git clone --recursive [url]
```

This project includes [Ecore Bigraph Metamodel](https://github.com/bigraph-toolkit-suite/bigraphs.bigraph-ecore-metamodel) as git submodule.
The main branch of the repository [Ecore Bigraph Metamodel](https://github.com/bigraph-toolkit-suite/bigraphs.bigraph-ecore-metamodel) will also be pulled.
This dependency includes the Ecore metamodels of bigraphs that is used by the Xtext-based BDSL grammar to represent
bigraphical structures.

To update the submodule (i.e., the Bigraph Ecore Metamodel) later at any time to the latest version, run the following command:
```shell
git submodule update --recursive --remote
```

### Building from Source

```shell
gradle clean build
```

#### Generate Xtext Language Artifacts

```bash
gradle clean generateXtext
```

#### Generate Language Server Protocol

```bash
gradle shadowJar
```

[//]: # (TODO)

> **Note:** The language server protocol `*.jar` is located under `de.tudresden.inf.st.bigraphs.dsl.ide/build/libs/`.

#### Run Tests

The following commands show how to run various kinds of tests:

[//]: # (TODO)

```shell
# Run all test cases
gradle :de.tudresden.inf.st.bigraphs.dsl.tests:test -PwithTests
# All tests within a package
gradle test --tests de.tudresden.inf.st.bigraphs.dsl.tests.ide.validation* -PwithTests
# All tests within a class
gradle test --tests *BdslAffectionUnitTest -PwithTests
# Only a specific test method
gradle test --tests *testSignatureMatchOnAssignment_01 -PwithTests
```

#### Install Grammar to Local Maven Repository

If you want to use the BDSL grammar artifact in your Java projects for testing and development purposes, you can install the compiled JARs into your local Maven repository (usually located at `~/.m2/`).
Then it can be conveniently used by other Java projects.

Run the following command:
```shell
gradle publishToMavenLocal
```

### Deployment

[//]: # (TODO)

Execute the following goals to deploy artifacts to the [Central Repository]():
```shell
gradle artifactoryPublish -PartifactoryUser=username -PartifactoryPassword=password
```


## Working in Eclipse

This project is best worked with Eclipse. Import everything into a new Eclipse workspace:

[//]: # (TODO)

- `de.tudresden.inf.st.bigraphs.dsl.parent`
- `bigraphs.bigraph-ecore-metamodel` (the cloned Git submodule also contained after following the [Build configuration](#Build-configuration) instructions)
- Old project remnants that don't need to be considered for now: `de.tudresden.inf.st.bigraphs.dsl.ui`
  - Further, `de.tudresden.inf.st.bigraphs.dsl.web` will be discarded soon

You may need to re-generate the model code of the `bigraphs.bigraph-ecore-metamodel` project as this process is not currently handled by the gradle script.

You may then be able to run the "MWE2 workflow" and to generate "Xtext artifacts" via the Eclipse IDE inside the `de.tudresden.inf.st.bigraphs.dsl` project, or call the appropriate gradle command as shown above.

### Project Structure

[//]: # (TODO)

- gradle-based Project
- Language infrastructure for Bigraph DSL (BDSL) based on Xtext is located under `de.tudresden.inf.st.bigraphs.dsl` 
- Language Server Protocol Implementation is located under `de.tudresden.inf.st.bigraphs.dsl.ide`
- Test classes are located under `./de.tudresden.inf.st.bigraphs.dsl.tests/`
  - needs sub-projects `de.tudresden.inf.st.bigraphs.dsl` and `de.tudresden.inf.st.bigraphs.dsl.ide`
- **(!)** Note that the required CDO/EMF/Ecore dependencies are stored separately inside the `./etc/libs` folder. The reason is that there is currently no easy way on how to resolve Eclipse dependencies from P2 repositories in gradle. To clarify: Updating the versions means replacing the files.



