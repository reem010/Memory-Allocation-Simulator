
public class Partition {
	private static int IdMaker=0;
	public String name;
	public int size;
	public boolean free=false;
	Process using=null;
	Partition(String _name,int sz){
		if(_name==null){
			name="Partition "+Integer.toString(IdMaker);
		}else name=_name;
		size=sz;
		IdMaker++;
	}
}
