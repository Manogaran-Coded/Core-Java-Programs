/*
Marker Interface

If an interfaces which don't have abstract methods and by implementing that interface if our object 
will get some ability such type of interface  is called Marker Interface or Tag Interface or Ability Interface

example Serializable, Cloneable, SingleThreadModel

example 1

By Implementing Serializable interface we can send that object across the network and we can save state of an object into the file

example 2

By implementing SingleThreadModel interface servlet can process only one client request at a time so that we can get  "Thread Safety"


example 3

By implementingcolenable interface our object is in a position to provide exacelt duplicate clone object
---------------------------------------------------------------------------------------------------------------


Adapter Class(It is a design pattern allowed to solve the problem of direct implmenation of interface)

It is a simple java class that implements an interface only with empty implementation for every method. If we implement an interface compulsoriy we should give the body for all the methods whether it is required or not. This approach increases the length of the code and reduces readabality.
*/