edit a file 

ls -a -> shows hidden files



file/dir   permissions   no. of links    owner        group owner  file size in bytes     Date/time     name
-           rw-r--r--.     1             ec2-user      ec2-user     123                  Feb 20 02:08   file1

d rwxr-xr-x. 2 ec2-user ec2-user   6 Feb 27 01:24 test

absolute path vs relative path ?

relative -> path relative to current working directory
absolute -> path from root directory - /Users/lovepreet/java_stuff/Lectures/Repos/Feb_2026/src/sideCourse/feb26/readMe.md



root directory -> cd/
home directory -> cd~



wc -> word count
lines   words     file size           name
11       18       123                 file1


grep -> 


sort filename -> sort the file 
sort -r filename -> sort in reverse order

owner           group        public    
rw-              r-x          rw-

r -> read
w -> write
x -> executable

d rwx r-x r-x  2 ec2-user ec2-user    6 Feb 27 01:24 test


0 - no permission
1 - execute
2 - write
3 - write(2) + execute(1)
4 - read
5 - read + execute
6 - read + write 
7 - all permission


chmod 444 filename -> change the permission of file to read only


create a file 614
- owner can read & write 
- group can execute only
- public can do read only

Write a shell script to take user input from user and check whether num is positive or negative.

echo "Enter a num"
read number
if [$ number -gt 0]; then
echo "positive"
else
echo "negative"
fi








