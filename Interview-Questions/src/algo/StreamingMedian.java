package algo;
import java.util.Collections;
import java.util.PriorityQueue;

public class StreamingMedian {

    private PriorityQueue<Double> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    private PriorityQueue<Double> minHeap = new PriorityQueue<>();
    
    public static void main(String[] args){
        double[] n = new double[] {7,5};
        StreamingMedian api = new StreamingMedian();
        for(double num : n){
            api.add(num);
        }
        
        System.out.println(api.findMedian());
    }
    
    public void add(double number){
        if(maxHeap.size() == 0 && minHeap.size() == 0){
            maxHeap.add(number);
            return;
        }else if(maxHeap.size() == 1 && minHeap.size() == 0){
            if(number < maxHeap.peek()){
                minHeap.add(maxHeap.poll());
                maxHeap.add(number);
                return;
            }
        }
        
        if(number < maxHeap.peek()){
            maxHeap.add(number);
        }else{
            minHeap.add(number);
        }
        
        if((maxHeap.size() - 2) >= minHeap.size() ){
            minHeap.add(maxHeap.poll());
        }else if((minHeap.size() - 2) >= maxHeap.size() ){
            maxHeap.add(minHeap.poll());
        }
        
    }
    
    public double findMedian(){
        System.out.println("max: " + maxHeap.size());
        System.out.println("min: " + minHeap.size());
        if(maxHeap.size() == minHeap.size()){
            return (maxHeap.peek() + minHeap.peek()) / 2;
        }else{
            if(maxHeap.size() > minHeap.size()){
                return maxHeap.peek();
            }else{
                return minHeap.peek();
            }
        }
    }
    
   
}
