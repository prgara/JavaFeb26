Map is a key value pair <K,V>
- HashMap - unordered, keys should be unique and value can be duplicate, one null key
- LinkedHashMap
- TreeMap

load factor 0.75


Internal structure of HashMap

- arraylist of linkedlist of nodes
- nodes divided into 4 parts - hashcode, key, value, address to next node

A, B, C --- ascii value

put operation - add entry to map
- K,V will be inputted
- Hashcode of the key will be calculated - 1234545
- modulo function will be used on hashcode to get a bucket/index - 3
- go to bucket 3 and see if there is any node
- if node is not there, it will create a node and update the key value along with hashcode.
- if node is there, compare the key using equals method. if true, replace the value, if false then add another node next to it

get operation
- Hashcode of the key will be calculated - 1234545
- modulo function will be used on hashcode to get a bucket/index - 3
- go to bucket 3 and see if there is any node
- if yes use equals to compare key, if true return value else go to next node and repeat the step
- if no matches then return null.
