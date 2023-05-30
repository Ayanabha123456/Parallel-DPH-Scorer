[<img src="https://img.shields.io/badge/Apache Spark-Parallelism-important.svg?logo=apachespark">](<LINK>)

<h1 align="center" style="font-size:60px;">Parallel DPH Scorer</h1>

It is a parallel implementation of an Information Retrieval System that uses the DPH weighting model to score documents based on a given set of user queries.

# Technologies
<img src="https://upload.wikimedia.org/wikipedia/en/thumb/3/30/Java_programming_language_logo.svg/182px-Java_programming_language_logo.svg.png" width="50">
<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/f/f3/Apache_Spark_logo.svg/375px-Apache_Spark_logo.svg.png" width="50">

# Prerequisites
* Clone the repository in your system
* Download [Eclipse](https://eclipseide.org/) IDE for Java
* After opening Eclipse, when asked for working directory, select the parent directory of the repository folder

# How to run the project?
* Open the Windows Powershell terminal in administrator mode.
* Go to the [chocolatey](https://chocolatey.org/install) website and copy the following command.
![chocolatey](https://github.com/Ayanabha123456/Parallel-DPH-Scorer/assets/42903837/9be7c6eb-d324-4540-9e5b-a596fccb5659)
* Paste and run the command in the terminal.
* Install Java version 11 and Maven
```bash
choco install openjdk11
choco install maven
```
* In Eclipse, go to File -> Import -> General -> Existing Projects into Workspace . Then select root directory as the repository directory. Eclipse will take some time to build the project.
* Once build, right-click on the project and then go to Build Path -> Configure Build Path. Select the Libraries tab and click on Edit. Select Add and then Standard VM. Click on Directory and select the directory where chocolatey installed Java version 11. This would be the following directory and you can find it in the terminal after you install openjdk11.

![openjdk11](https://github.com/Ayanabha123456/Parallel-DPH-Scorer/assets/42903837/4452cb8b-5e3c-449a-a347-7dddd64e67c0)
* Select the new jdk and apply all changes. The project will recompile.
* Go to Project -> Properties. Select Java Compiler and enable project specific settings. Change compiler compliance level to 1.8. Apply all changes and close.
* In the project directory shown at the left-hand side, go to src -> uk.ac.gla.dcs.bigdata.apps
* Right-click on AssessedExercise.java and Run it as a Java Application.
* Once the project is done running, this will create a folder in the results directory, containing three files named after the user queries in the data folder. Inside each file, are the top 10 documents and their DPH scores for that query. The data folder also has the JSON file of the documents.
