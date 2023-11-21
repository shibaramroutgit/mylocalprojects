package j21javamemory;

public class GarbageCollection {

	
	// Removing unwanted objects objects from the memory is called garbage collection
	// finalize() method of Object class use to do final operation on java before GC remove the object from memory
	// We need to override finalize() method to do those operation
	
	@Override
    protected void finalize()
    {
		System.out.println("Final Operation by finalize() ");
    }
	
	public static void main(String[] args) {
		

	}

}
