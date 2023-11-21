package j17fileoperation.j01fileInfo;

public class j01IODetails {
/*

 We can do operation on file either by
    # byte format
    # String / String array / character

 # byte Data Read and Write Class
    # InputStream (Abstract Class)                        # OutPutStream (Abstract Class)
    # Reader (Abstract Class)                             # Writer (Abstract Class)
    Sub-Class Extends above class                         Sub-Class Extends above class
    * FileInputStream                                     * FileOutputStream
    * ObjetInputStream                                    * ObjectOutputStream
        # FileReader extends FileInputStream                    # FileWriter extends FileOutputStream



# String / String array / character read and write class
    # InputStream (Abstract Class)                        # OutPutStream (Abstract Class)
    # Reader (Abstract Class)                             # Writer (Abstract Class)
    Sub-Class Extends above class                         Sub-Class Extends above class
    * BufferReader                                        * BufferWriter

# FileReader Class
    # FileReader class ->FileInputStream -->Reader -->InputStream
    # FileReader class , constructor accept File Class object or String Path
# FileWriter Class
    # FileWriter class ->FileOutputStream -->Writer -->OutputStream
    # FileWriter class , constructor accept File Class object or String Path

@FileInputStream
    @Constructor
    @methods
    @Imp Points

@FileOutputStream
    @Constructor
    @methods
    @Imp Points

@ObjectInputStream
    @Constructor
    @methods
    @Imp Points

@ObjectOutputStream
    @Constructor
    @methods
    @Imp Points

@BufferReader
    @Constructor
        @ BufferReader bf = new BufferReader(FileReader r)
    @methods
    @Imp Points

@BufferWriter
    @Constructor
    @methods
    @Imp Points





5.	Class Level Understanding
6.	Input Stream Class
    a.	We can read Data from File, DB, Object, Array, String , String Buffer
    b.	For Different data source we have different type of Input Stream Class
    c.	Input stream class has a read() method and this is override by all sub-class type
d.	FileInoutStream – to read data from file
    e.	ObjectInputStream – to read data from object
    f.	So on….
    g.	After use the connection we need to close the connection close()
    h.	Methods
i.	Close() – close the connection
ii.	Available() – It return the number of byte data
iii.	Red() – it read byte data
iv.	Red(byte[]) – read multiple byte at a time
v.	Red(byte[], start index, end index till to continue)
    i.	All method throw IO exception
7.	Output Stream Class
    a.	We can store/write data on console , File, DB, Object, Array, String , String Buffer
    b.	For Different data destination we have different type of Output Stream Class
    c.	Output stream class has a write() method and this is override by all sub-class type
d.	FileOutputStream – to write data from file
    e.	ObjectOutputStream – to rite data from object
    f.	So on….
    g.	After use the connection we need to close the connection  flash()
    h.	When we do write(), it store in Output Stream memory to save we need to use flash()
    i.	Methods
i.	Close() – close the connection
ii.	Write() – it read byte data
iii.	Write(byte[]) – read multiple byte at a time
iv.	Write(byte[], start index, end index till to continue)
            v.	Flush()  to save data into file
    j.	All method throw IO exception
    k.	Constructor
    i.	FileOutputStream f1 = new FileOutputStream(“path”)
    ii.	FileOutputStream f1 = new FileOutputStream(File file)
    iii.	FileOutputStream f1 = new FileOutputStream(File file, Boolean true or false)
    iv.	FileOutputStream f1 = new FileOutputStream(String path, Boolean true or false)
    v.	When we do operation , Output stream it always override the old data by 1,2 constructor to overcome 3,4 constructor accept a parameter true (to addend) false (override)

    l.	File is a special class to represent the file

13.	Constructor
    a.	FileInputStream f1 = new FileInputStream (“path”)
    b.	FileInputStream f1 = new FileInputStream (File file)
14. Stream Operation are very slow because it works byte by byte


15. Faster File Operation
    a. BufferReader and BufferWriter Class use
    b. BufferReader
        b1. Constructor
            b1. BufferReader bf = new BufferReader(reader d)
            b2. BufferReader bf = new BufferReader(reader d, int size)
    c. BufferWriter

 */
}
