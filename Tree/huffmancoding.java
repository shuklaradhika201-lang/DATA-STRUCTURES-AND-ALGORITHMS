// package Tree;

// import java.util.*;

// public class huffmancoding {

//     HashMap<Character, String> encoder;
//     HashMap<String, Character> decoder;

//     private class Node implements Comparable<Node> {

//         Character data;
//         int cost;

//         Node left;
//         Node right;

//         public Node(Character data, int cost) {
//             this.data = data;
//             this.cost = cost;
//             this.left = null;
//             this.right = null;
//         }

//         @Override
//         public int compareTo(Node other) {
//             return this.cost - other.cost;
//         }
//     }

//     public void huffmancoder(String feeder) throws Exception {

//         HashMap<Character, Integer> fmp = new HashMap<>();

//         // Calculate frequency
//         for (int i = 0; i < feeder.length(); i++) {

//             char cc = feeder.charAt(i);

//             if (fmp.containsKey(cc)) {

//                 int ov = fmp.get(cc);
//                 ov += 1;

//                 fmp.put(cc, ov);

//             } else {

//                 fmp.put(cc, 1);
//             }
//         }

//         Heap<Node> minHeap = new Heap<>();

//         Set<Map.Entry<Character, Integer>> entrySet = fmp.entrySet();

//         for (Map.Entry<Character, Integer> entry : entrySet) {

//             Node node = new Node(
//                     entry.getKey(),
//                     entry.getValue()
//             );

//             minHeap.insert(node);
//         }

//         // Build Huffman Tree
//         while (minHeap.size() != 1) {

//             Node first = minHeap.remove();
//             Node second = minHeap.remove();

//             Node newNode = new Node(
//                     '\0',
//                     first.cost + second.cost
//             );

//             newNode.left = first;
//             newNode.right = second;

//             minHeap.insert(newNode);
//         }

//         Node ft = minHeap.remove();

//         this.encoder = new HashMap<>();
//         this.decoder = new HashMap<>();

//         this.intitEncoderDecoder(ft, "");
//     }

//     private void intitEncoderDecoder(Node node, String osf) {

//         if (node == null) {
//             return;
//         }

//         // Leaf node
//         if (node.left == null && node.right == null) {

//             // Character -> Code
//             this.encoder.put(node.data, osf);

//             // Code -> Character
//             this.decoder.put(osf, node.data);

//             return;
//         }

//         intitEncoderDecoder(node.left, osf + "0");
//         intitEncoderDecoder(node.right, osf + "1");
//     }

//     public String encode(String source) {

//         String ans = "";

//         for (int i = 0; i < source.length(); i++) {

//             ans = ans + encoder.get(source.charAt(i));
//         }

//         return ans;
//     }

//     public String decode(String codedstring) {

//         String key = "";
//         String ans = "";

//         for (int i = 0; i < codedstring.length(); i++) {

//             key = key + codedstring.charAt(i);

//             if (decoder.containsKey(key)) {

//                 ans = ans + decoder.get(key);
//                 key = "";
//             }
//         }

//         return ans;
//     }
// }