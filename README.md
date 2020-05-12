<img src="./etc/bigraph-dsl-logo.png" style="zoom:16%;" />

# Bigraph DSL - Core Elements (CE)

This projects contains the following core elements of the bigraph DSL called **BDSL**:
- Grammar, Parser, ...
- IDE support (Language Server Protocol)
- Some tests

## Build configuration

To clone this repository, use:

```
$ git clone --recursive [url]
```

This will also clone the necessary [Ecore Bigraph Meta Model]() repository, which is needed for this Eclipse-based project. 

> **Note:** [Ecore Bigraph Meta Model]() is configured as a Git submodule.

### Generate Xtext Language Artifacts

```
$ ./gradlew clean generateXtext
```

### Generate Language Server

```
$ ./gradlew shadowJar
```
The language server protocol `*.jar` is located under `de.tudresden.inf.st.bigraphs.dsl.ide/build/libs/`.

## Working in Eclipse

This project is best worked with Eclipse. Import everything into a new Eclipse workspace:

- `de.tudresden.inf.st.bigraphs.dsl.parent`
- `BigraphBaseModel` (the clone Git submodule)
- Old project remnants that don't need to be considered: `de.tudresden.inf.st.bigraphs.dsl.ui`, `de.tudresden.inf.st.bigraphs.dsl.ui.tests` 

You may need to re-generate the model code of the `BigraphBaseModel` project as this process is not currently handled by the gradle script.

You may then be able to run the "MWE2 workflow" and to generate "Xtext artifacts" via the Eclipse IDE inside the `de.tudresden.inf.st.bigraphs.dsl` project.
