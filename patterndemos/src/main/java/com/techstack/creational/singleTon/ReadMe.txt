Order of the files 
Use SingleTonTest.java for testing SingleTon

0. SampleOracleUsage/SingleTonRealWorld.java : understand how SingleTon works in real time. 
1. SingleTonEagerLoad.java : create custom Single ton with Eager loading.
2. SingleTonLasyLoad.java : create custom Single ton with LazyLoading.
3. SingleTonThreadSafteJVM. java : Create custom Single ton with Thread Safe.
4. SingleTonReflection.java : this demo help in understanding how to break singleton if written wrong.  
5 .SingleTonSerializable.java : while usong serializable make sure singleton fails example you can see on SingleTonSerializableTest.java
6. DBSingleTon.java : this helps in using above single ton and see how we can improve performance with single thread. 

Pitfalls  : 
* Often overused and give performance hit if you make every object as single ton
* Difficult to unit test due to private contrutor 
* If not carefull , this might not be thread-safe
* Note : - if you pass paratemer this will consider as factory not single ton 

