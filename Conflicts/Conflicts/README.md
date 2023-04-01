# threads-conflicts

When multiple threads attempt to access or modify a shared resource (in this case, the Counter object) simultaneously without proper synchronization, it can lead to conflicts.
This is an example of concurrency, where two threads share the same object from the Counter class. They are running alternately by the processor, each at one moment, and share resources. However, the execution doesn't occur simultaneously, but in a rapid succession.