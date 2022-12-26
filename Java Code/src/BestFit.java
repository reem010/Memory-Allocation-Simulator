import java.util.*;
public class BestFit {
	ArrayList<String>errors=new ArrayList<String>();
	public void start( ArrayList<Process> plist, ArrayList<Partition> partitionList,ArrayList<Process> missed){
		
		for(Process process:plist){
			
			Partition tmp=null;
			int i=0,indx=0;
			for(Partition partition :partitionList){
				if(partition.using!=null){i++;continue;}
				
				if(partition.size>=process.size&&tmp==null){
					tmp=partition;
					indx=i+1;
				}
				else if(partition.size>=process.size&&tmp.size>partition.size){
					tmp=partition;
					indx=i+1;
				}
				i++;
			}
			
			if(tmp==null){
				errors.add(process.name+" can't be allocated");
				missed.add(process);
			}
			else{
				int extra=tmp.size-process.size;
				if(extra!=0){
					partitionList.add(indx,new Partition(null,extra));
				}
				tmp.using=process;
				tmp.size-=extra;
			}
		}
	}
	void print(){
	for(String er:errors){
		System.out.println(er);
	}
	}
}
