---------------
Building with SBT
---------------

Scala Simple Built Tool (sbt) 11.3 or higher is required for building.

SBT will automatically download all necessary dependencies (includeing scala)
upon the first invocation. The cache is stored in ~/.ivy2.

Execute sbt to start the interactive sbt prompt. Below are some of the commonly
used commands:

 project daffodil         Switch to the root project (this is the default project)
 project daffodil-lib	  Switch to the library sub-project
 project daffodil-core	  Switch to the core sub-project
 project daffodil-test	  Switch to the conformance test suite sbu-project

The following commands can be run from within any sub-project if you only want
to build/test/etc that subproject. Dependendent tasks in another project will
be performed if required. Running a command from withing the root 'daffodil'
project will run the command in all sub-projects.

 compile          Copmile all sources
 test:compile     Compile all test sources
 test             Run all tests
 test-only X      Only runs tests in the TestSuite specfied by 'X'
 debug:compile    Compile all debug sources
 debug            Run all the debug tests
 clean            Remove all temporary build files
 doc              Create Scala API documentation via scaladoc
 package          Generate jar files
 jacoco:cover     Build coverage reports
 eclipse          Generate Eclipse project files
 gen-idea         Generate IntelliJ project files


---------------
Version numbers
---------------

This project uses the versioning scheme specified by Semantic Versioning,
v2.0.0-rc1 at http://semver.org/.

Synopsis:  major.minor.patch[-pre-release]+build

Version numbers < 1.0 are for initial development.