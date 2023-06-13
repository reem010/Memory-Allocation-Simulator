# Memory Allocation Simulator
<!DOCTYPE html>
<html>
<body>
  <p>
    I have developed a memory allocation simulator that allows for the allocation of variable-sized partitions of memory to a given sequence of process requests. The simulator implements different allocation policies to cater to various scenarios.
  </p>

  <h2>Allocation Policies</h2>
  <ol>
    <li>
      <strong>First-Fit Policy:</strong> This policy searches for the first available memory partition that is large enough to accommodate the process request. It allocates the process to that partition, ensuring that the request is fulfilled promptly.
    </li>
    <li>
      <strong>Best-Fit Policy:</strong> In this policy, the simulator searches for the smallest available memory partition that can accommodate the process request. By allocating the process to the best-fitting partition, this policy aims to minimize fragmentation and optimize memory utilization.
    </li>
    <li>
      <strong>Worst-Fit Policy:</strong> The worst-fit policy takes the opposite approach of the best-fit policy. It searches for the largest available memory partition and allocates the process request to that partition. This policy can be useful in scenarios where larger partitions are preferred or when dealing with larger processes.
    </li>
  </ol>

  <p>
    Additionally, I have included an option for compaction in the simulator. Compaction involves rearranging the contents of memory to consolidate all free memory blocks into one large contiguous block. This helps to reduce fragmentation and maximize available memory for future allocations.
  </p>

  <p>
    By implementing these allocation policies and providing the option for compaction, the memory allocation simulator offers flexibility in managing memory resources efficiently for a variety of process requests.
  </p>
</body>
</html>

 <!--
Input will be as follows:  
- Number of partition  
- Partition name and its size.  
- Number of process requests.  
- Process name and its size.  
- Selected policy by the user.  
  
Sample input:  
Enter number of partition:  
6  
Enter number of partition:  
Partition0 90  
Enter number of partition:  
Partition1 20  
Enter number of partition:  
Partition2 5  
Enter number of partition:  
Partition3 30  
Enter number of partition:  
Partition4 120  
Enter number of partition:  
Partition5 80  
Enter number of processes:  
4  
Process name and its size:  
Process1 15  
Process name and its size:  
Process2 90  
Process name and its size:  
Process3 30  
Process name and its size:  
Process4 100  
Select the policy you want to apply:  
1. First fit  
2. Worst fit  
3. Best fit  

Select policy:  
1  
Partition 0 (15 KB) => Process 1  
Partition 6 (30 KB) => Process 3  
Partition 8 (45 KB) => External fragment  
Partition 1 (20 KB) => External fragment  
Partition 2 (5 KB) => External fragment  
Partition 3 (30 KB) => External fragment  
Partition 4 (90 KB) => Process 2  
Partition 7 (30 KB) => External fragment  
Partition 5 (80 KB) => External fragment  
Process 4 can not be allocated  
Do you want to compact? 1.yes 2.no  
1  
Partition 0 (15 KB) => Process 1  
Partition 6 (30 KB) => Process 3  
Partition 4 (90 KB) => Process 2  
Partition 9 (100 KB) => Process 4  
Partition 10 (110 KB) => External fragment  
Select policy:  
2  
Partition 0 (90 KB) => Process 2  
Partition 1 (15 KB) => Process 1  
Partition 6 (5 KB) => External fragment  
Partition 2 (5 KB) => External fragment  
Partition 3 (30 KB) => Process 3  
Partition 4 (100 KB) => Process 4  
Partition 7 (20 KB) => External fragment  
Partition 5 (80 KB) => External fragment  

Do you want to compact? 1.yes 2.no  
1  
Partition 0 (90 KB) => Process 2  
Partition 1 (15 KB) => Process 1  
Partition 3 (30 KB) => Process 3  
Partition 4 (100 KB) => Process 4  
Partition 8 (110 KB) => External fragment  
Select policy:  
3  
Partition 0 (30 KB) => Process 3  
Partition 8 (60 KB) => External fragment  
Partition 1 (20 KB) => External fragment  
Partition 2 (5 KB) => External fragment  
Partition 3 (30 KB) => External fragment  
Partition 4 (15 KB) => Process 1  
Partition 6 (90 KB) => Process 2  
Partition 7 (15 KB) => External fragment  
Partition 5 (80 KB) => External fragment  
Process 4 can not be allocated  
Do you want to compact? 1.yes 2.no  
2  
-->
