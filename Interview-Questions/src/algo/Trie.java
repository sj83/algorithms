package algo;

public class Trie {

    public static void main(String[] args){
        Trie trie = new Trie();
        trie.insert("Trie");
        trie.insert("search");
        System.out.println(trie.search("trie"));
    }
    
    private static class TrieNode{
        char ch;
        TrieNode[] children = new  TrieNode[26];
        boolean isWord;
        
        TrieNode(char ch){
            this.ch = ch;
        }
    }

    TrieNode root;
    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode(' ');
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        String input = word.toLowerCase();
        TrieNode parent = root;
        TrieNode child = null;
        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            int index = (int) ch - 97;
            if(parent.children[index] == null){
                parent.children[index] = new TrieNode(input.charAt(i));
               // parent.children[index] = child;
                System.out.println(index);
               // child = parent.children[index];
                parent = parent.children[index];
                
                
            }
            
        }
        
        parent.isWord = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode parent = root;
        TrieNode child = null;
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            int index = (int) ch - 97;
            System.out.println(index);
            child = parent.children[index];
            parent = parent.children[index];
            if(child == null){
                return false;
            }
        }
        
        return child.isWord;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        return true;
    }
}
