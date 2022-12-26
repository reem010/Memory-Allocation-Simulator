import java.util.*;
public class Main {
	
	static void Compaction( ArrayList<Partition> plist,ArrayList<Process> missed){
		ArrayList<Partition>remv=new ArrayList<Partition>();
		int total=0;
		int cnt=0;
		int i=0;
		for(Partition p:plist){
			if(p.using==null){
				cnt++;
				total+=p.size;
				remv.add(p);
			}
			
			i++;
		}
		
		if(cnt>1){
			for(Partition p:remv){
				plist.remove(p);
			}
		}
		for(Process p:missed ){
			if(total>=p.size){
				Partition newpartition=new Partition(null,p.size);
				newpartition.using=p;
				plist.add(newpartition);
				total-=p.size;
			}
		}
		if(total>0){
			plist.add(new Partition(null,total));
		}
	}
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 ArrayList<Process> plist = new ArrayList<Process>();
		 ArrayList<Partition> partitionList = new ArrayList<Partition>();
		 int psize;
		 
		 System.out.println("Enter no. of Partitions: ");
		 psize=sc.nextInt();
		 for(int i=0;i<psize;i++){
			 System.out.println("Enter Partition name and it's size: ");
			 String stmp;int tmp;
			 stmp=sc.next();
			 tmp=sc.nextInt();
			 partitionList.add(new Partition(stmp,tmp));
		 }
		 
		 System.out.println("Enter no. of Process: ");
		 psize=sc.nextInt();
		 for(int i=0;i<psize;i++){
			 System.out.println("Enter Process name and it's size: ");
			 String stmp;int tmp;
			 stmp=sc.next();
			 tmp=sc.nextInt();
			 plist.add(new Process(stmp,tmp));
					 
		 }
		 
		 
		 System.out.println("Select the policy you want to apply:"
			 +"1. First fit"
			 +"2. Worst fit"
			 +"3. Best fit");
		 ArrayList<Process>missed=new ArrayList<Process>();
		 int get=sc.nextInt();
		 if(get==1){
			 FirstFit obj=new FirstFit();
			 obj.start(plist, partitionList,missed);
			 for(Partition p: partitionList){
				 System.out.print(p.name+'('+p.size+')'+" => ");
				 if(p.using==null){
					 System.out.println("External fragment");
				 }else{
					 System.out.println(p.using.name);
				 }
			 }
			 obj.print();
		 }
		 else if(get==2){
			 WorstFit obj=new WorstFit();
			 obj.start(plist, partitionList,missed);
			 for(Partition p: partitionList){
				 System.out.print(p.name+'('+p.size+')'+" => ");
				 if(p.using==null){
					 System.out.println("External fragment");
				 }else{
					 System.out.println(p.using.name);
				 }
			 }
			 obj.print();
		 }else{
			 BestFit obj=new BestFit();
			 obj.start(plist, partitionList,missed);
			 // print
			 for(Partition p: partitionList){
				 System.out.print(p.name+'('+p.size+')'+" => ");
				 if(p.using==null){
					 System.out.println("External fragment");
				 }else{
					 System.out.println(p.using.name);
				 }
			 }
			 obj.print();
		 }
		 System.out.println("Do you want to compact? 1.yes 2.no :");
		 int k=sc.nextInt();
		 if(k==1){
			 Compaction(partitionList,missed);
			 // print
			 for(Partition p: partitionList){
				 System.out.print(p.name+'('+p.size+')'+" => ");
				 if(p.using==null){
					 System.out.println("External fragment");
				 }else{
					 System.out.println(p.using.name);
				 }
			 }
		 }
	}
}
