<img src="./etc/bigraph-dsl-logo.png" style="zoom:90%;" />

# Bigraph DSL - Core Elements (CE)

This projects contains the following core elements of the bigraph DSL called **BDSL**:
- Grammar, Parser, ...
- IDE support (Language Server Protocol)
- Some tests

IDE support is provided for the following platforms to be more productive when experimenting with bigraphs:

- Eclipse, IntelliJ, Visual Code, ... by utilizing the Language Server Protocol

## Build configuration

To clone this repository, use:

```bash
$ git clone --recursive [url]
# To update the submodule
$ git submodule update --recursive --remote
```

This will also clone the necessary [Ecore Bigraph Meta Model]() repository, which is needed for this Eclipse-based project. 

> **Note:** [Ecore Bigraph Meta Model]() is configured as a Git submodule.

### ~~Changing the Ecore Bigraph Meta Model~~

~~If you want to use another version of the meta model:~~

```

```

### Generate Xtext Language Artifacts

```bash
$ ./gradlew clean generateXtext
```

### Generate Language Server

```bash
$ ./gradlew shadowJar
```
The language server protocol `*.jar` is located under `de.tudresden.inf.st.bigraphs.dsl.ide/build/libs/`.

## Working in Eclipse

This project is best worked with Eclipse. Import everything into a new Eclipse workspace:

- `de.tudresden.inf.st.bigraphs.dsl.parent`
- `BigraphBaseModel` (the cloned Git submodule)
- Old project remnants that don't need to be considered for now: `de.tudresden.inf.st.bigraphs.dsl.ui`, `de.tudresden.inf.st.bigraphs.dsl.ui.tests` 

You may need to re-generate the model code of the `BigraphBaseModel` project as this process is not currently handled by the gradle script.

You may then be able to run the "MWE2 workflow" and to generate "Xtext artifacts" via the Eclipse IDE inside the `de.tudresden.inf.st.bigraphs.dsl` project.
