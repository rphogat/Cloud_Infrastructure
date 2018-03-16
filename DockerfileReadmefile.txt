HW3_Solution:


*************************************************### METHOD 1 ##****************************************************************

Here the container has ubuntu operating system along with iozoneTest bench. 
In this, the container itself has the result data from the iozone test bench under the following directory in hw3 image:
/home/iozone3_365/src/current/output.wks

Commands to execute the Dockerfile:
$ docker build -t mycont .
After the execution is done , the result can be found in /home/iozone3_365/src/current/output.wks directory.

***************************************************### METHOD 2 ##**************************************************************

Alternative approach :to have a volume in the local filesystem:

create a directory for volume in local system, For example in my system, it's
cd /Users/rphogat/desktop
mkdir data
$ docker build -t mycont .
$ docker run -d -P --name volcontainer -v /Users/rphogat/desktop/demoDocker/data:/hw3/iozone3_365/src/current mycont
####--container id will be generated######
$ docker attach ID
