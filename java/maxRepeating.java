import java.util.HashMap;

class maxRepeating {
    int max(int k, int[] arr) {
        // code here
        HashMap<Integer, Integer> hn = new HashMap<Integer, Integer>();
        for(int i = 0; i < arr.length; i++){
            if(hn.containsKey(arr[i])){
                hn.put(arr[i], hn.get(arr[i]) + 1);
            }else{
              hn.put(arr[i], 1);
            }
        }
        System.out.println(hn);
        int max = Integer.MIN_VALUE;
        int element = 0;
        
        for(HashMap.Entry<Integer, Integer> entry: hn.entrySet()){
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if(max < value){
                element = key;
                max = value;
                System.out.println("max: " + max + " element: " + element);
            }else if(max == value && element > key){
                //if(element > key){
                    element = key;     
            }
        }
    
        return element;
    }

    public static void main(String[] args) {
        maxRepeating obj = new maxRepeating();
        int[] arr = {2, 2, 2, 3, 3, 4, 4, 4, 4};
        int k = 4;
        System.out.println(obj.max(k, arr));
    }
}