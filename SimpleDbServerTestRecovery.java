import simpledb.buffer.Buffer;
import simpledb.buffer.BufferMgr;
import simpledb.file.Block;
import simpledb.server.SimpleDB;
import simpledb.tx.recovery.LogRecordIterator;
import simpledb.tx.recovery.RecoveryMgr;

public class SimpleDbServerTestRecovery {
	public static void main(String[] args) {
		SimpleDB.init("simpleDb");
//		SimpleDB.LOG_FILE
//		RecoveryMgr rm = new RecoveryMgr(123);
//		Block blk1 = new Block("filename",1);
//		Block blk2 = new Block("filename",2);
//		Block blk3 = new Block("filename",3);
//		Block blk4 = new Block("filename",4);
//		Block blk5 = new Block("filename",5);
//		Block blk6 = new Block("filename",6);
//		Block blk7 = new Block("filename",7);
//		Block blk8 = new Block("filename",8);
//		Block blk9 = new Block("filename",9);
//		Block blk10 = new Block("filename",10);
//		BufferMgr basicBufferMgr = new SimpleDB().bufferMgr();
//		basicBufferMgr.pin(blk1);
//		Buffer blk2buffer = basicBufferMgr.pin(blk2);
//		basicBufferMgr.pin(blk3);
//		basicBufferMgr.pin(blk4);
//		Buffer blk5buffer = basicBufferMgr.pin(blk5);
//		basicBufferMgr.pin(blk6);
//		basicBufferMgr.pin(blk7);
//		basicBufferMgr.pin(blk8);
//		int lsn = rm.setInt(blk2buffer, 4, 100);
//		blk2buffer.setInt(4, 100, 123, lsn);
//		
//		rm.commit();
//		
		LogRecordIterator it = new LogRecordIterator();
//		while(it.hasNext())
//		System.out.println(it.next());
		System.out.println(it.nextForward());
		System.out.println(it.nextForward());
		System.out.println(it.nextForward());
		System.out.println(it.nextForward());
		System.out.println(it.nextForward());
		System.out.println(it.nextForward());
		System.out.println(it.nextForward());
		System.out.println(it.nextForward());
		System.out.println(it.nextForward());
		System.out.println(it.nextForward());
		System.out.println(it.nextForward());
		System.out.println(it.nextForward());
//		Block blk1 = new Block("filename",1);
//		BufferMgr basicBufferMgr = new SimpleDB().bufferMgr();
		System.out.println("Done");
	}
}
