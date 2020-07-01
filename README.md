<img src="./etc/bigraph-dsl-logo.png" style="zoom:90%;" />

# Bigraph DSL - Core Elements (CE)

This projects contains the following core elements of the bigraph DSL called **BDSL**:
- Grammar, Parser, ...
- IDE support (Language Server Protocol)
- Some tests

IDE support is provided for the following platforms to be more productive when experimenting with bigraphs:

- Eclipse, IntelliJ, Visual Code, ... by utilizing the *Language Server Protocol*

## Build configuration

To clone this repository, use:

```bash
$ git clone --recursive [url]
# To update the submodule
$ git submodule update --recursive --remote
```

This will also pull the necessary [Ecore Bigraph Meta Model]() project, which is needed for this Eclipse-based project.

> **Note:** [Ecore Bigraph Meta Model]() is configured as a Git submodule in this project.



### Generate Xtext Language Artifacts

```bash
$ ./gradlew clean generateXtext
```

### Generate Language Server Protocol

```bash
$ ./gradlew shadowJar
```
The language server protocol `*.jar` is located under `de.tudresden.inf.st.bigraphs.dsl.ide/build/libs/`.

### Running Tests

```bash
$ ./gradlew :de.tudresden.inf.st.bigraphs.dsl.tests:test
```



## Working in Eclipse

This project is best worked with Eclipse. Import everything into a new Eclipse workspace:

- `de.tudresden.inf.st.bigraphs.dsl.parent`
- `BigraphBaseModel` (the cloned Git submodule)
- Old project remnants that don't need to be considered for now: `de.tudresden.inf.st.bigraphs.dsl.ui`
- Further, `de.tudresden.inf.st.bigraphs.dsl.web` will be discarded soon

You may need to re-generate the model code of the `BigraphBaseModel` project as this process is not currently handled by the gradle script.

You may then be able to run the "MWE2 workflow" and to generate "Xtext artifacts" via the Eclipse IDE inside the `de.tudresden.inf.st.bigraphs.dsl` project, or call the appropriate gradle command as shown above.

### Project Structure

- gradle-based Project

Language infrastructure for Bigraph DSL (BDSL) based on Xtext is located under `de.tudresden.inf.st.bigraphs.dsl` 

Language Server Protocol Implementation is located under `de.tudresden.inf.st.bigraphs.dsl.ide`

Test classes are located under `./de.tudresden.inf.st.bigraphs.dsl.tests/`

- needs sub-projects `de.tudresden.inf.st.bigraphs.dsl` and `de.tudresden.inf.st.bigraphs.dsl.ide`



