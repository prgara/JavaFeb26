PR ? merge ? 

pull vs fetch ? 
fetch + merge 

revert -> create a new commit that undo the previous commit. It does not delete history. It adds a new commit on the top.
git revert abcd1234

Before revert :  A ---- B ---- C
After revert :   A ---- B ---- C ---- D

reset -> it will delete the history.
git reset --hard abcd1234


when to use revert and when to use reset ? 
- Use revert when code is pushed to remote branch and use reset when you have just made changes in the local.


what happens when we push the code to GitHub ? Deployment

github ------------------> server ------------------------> www.abc.com


Compiling & how to compile java code ?


Main.java ---->   javac(java compiler) ----> Main.class (Byte code) 

why java is platform independent ? How 

jar file (java archive)

Maven -> build automation tool 

Maven is used to convert source code to a jar file and this jar file will be deployed on a server and server should have java installed on it.

# CI/CD pipeline
It is an automated workflow that helps to build, test and deploy the code.

Continuous Integration -> When you write the code and push to github, it gets directly integrated to github. each merge will trigger an automated process
that will build the code and test it.

CHG req

Continuous Delivery/Deployment -> Once CI is done, code is ready to deploy to different environments. 

Environment -> Dev, QA, UAT, Prod, COB/DR (Continuity of business)

Intellij -> Source (Github,Bitbucket,Gitlab) ->  Build -> Test (Unit, Integration, security) -> QA -> Staging -> Production
Docker(Containerize), image push

Jenkins, Github actions

Jenkin -> It is an open source tool build in java to create CICD pipelines. 
Master-Agent architecture

# What jenkin can do
- pull code from git
- build project
- run tests
- Deploy application
- Send notification






