package algo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class TopK {

    public static void topK(){
        //String[] input = {"p1", "p2", "p1", "p1", "p2", "p3", "p3", "p1", "p4", "p4", "p5", "p6", "p2", "p4", "p4", "p7", "p4"};
         String[] input = {"p1", "p2", "p1", "p1", "p2"};
         Map<String, Product> map = new HashMap<>();
         Set<Product> set = new HashSet<>();
         Queue<Product> queue = new PriorityQueue<>();
       
         for(String pid : input) {
             populateMap(map, pid);
             if(queue.size() == 3){
                 topK(pid, map, set, queue);
             } else if(map.size() == 3){
                 for (Map.Entry<String, Product> entry : map.entrySet()) {
                     queue.add(entry.getValue());
                     set.add(entry.getValue());
                 }         
             }
         }
         
         if(queue.isEmpty()){
             for (Map.Entry<String, Product> entry : map.entrySet()) {
                 queue.add(entry.getValue());
                 set.add(entry.getValue());
             }
         }
         
         System.out.println(queue);
     }
     
     public static void topK(String pid, Map<String, Product> map, Set<Product> set, Queue<Product> queue){
              Product qProduct = queue.peek();
             Product mProduct = map.get(pid);
             if(qProduct.equals(mProduct)){
                 queue.poll();
                 set.remove(qProduct);
                 queue.add(mProduct);
                 set.add(mProduct);
             } else if(mProduct.getCount() > qProduct.getCount()){
                 // if say P1 = 2 and P2= 2 and queue has P2 at the top and we get P1 
                 // then it will remove P2 and P1 again with the incremented value. But the 
                 // queue will have only P1. The if the set contains P1 then it will not remove P2
                 // and P1 count would have already been incremented when populating the map 
                 if(!set.contains(mProduct)){
                     queue.poll();
                     set.remove(qProduct);
                     queue.add(mProduct);
                     set.add(mProduct);
                 }
             }
             
             System.out.println(mProduct);
     }
     
     private static void populateMap(Map<String, Product> map, String pid){
         Product product = map.get(pid);
         if(product == null){
             product = new Product();
             product.setPid(pid);
             product.setCount(1);
         } else {
             product.setCount(product.getCount() + 1);
         }
         map.put(pid, product);
     }
     
     static class Product implements Comparable<Product> {
         private String pid;
         private Integer count;
         
         public String getPid()
         {
             return pid;
         }
         public void setPid(String pid)
         {
             this.pid = pid;
         }
         public int getCount()
         {
             return count;
         }
         public void setCount(int count)
         {
             this.count = count;
         }
         @Override
         public int hashCode()
         {
             final int prime = 31;
             int result = 1;
             result = prime * result + ((pid == null) ? 0 : pid.hashCode());
             return result;
         }
         @Override
         public boolean equals(Object obj)
         {
             if (this == obj)
                 return true;
             if (obj == null)
                 return false;
             if (getClass() != obj.getClass())
                 return false;
             Product other = (Product) obj;
             if (pid == null)
             {
                 if (other.pid != null)
                     return false;
             }
             else if (!pid.equals(other.pid))
                 return false;
             return true;
         }
         
         @Override
         public int compareTo(Product paramT)
         {
             // TODO Auto-generated method stub
             return this.count.compareTo(paramT.count);
         }
         @Override
         public String toString()
         {
             return "Product [pid=" + pid + ", count=" + count + "]";
         }
         
         
     }
}
