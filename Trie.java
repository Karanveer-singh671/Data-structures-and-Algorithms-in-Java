/* Trie comes from reTRIEval and the purpose of this D.S is to retreive stored information quickly
1. the root points to an empty trie node 
Application - auto complete words
Autocomplete feature is implemented by tries
or to Search contact in phone once you type a letter it will give suggestions from valid branches matching the letter
Also used in spell check to auto suggest correct spelling

TrieNode in a trie repesents a single alphabet character of the word e.g to insert a word 'dog' in a trie we need 3 trieNodes
TrieNode class has 2 data members
1. TrieNode[] children - an array which refers to other TrieNodes (children of TrieNode), the size of the array is usually taken as 26 if       storing English words
2. boolean isWord - a boolean value to indicate the end of a word. The value is set to true when a word is inserted completely
Each trieNode will point to another 26 trieNode (children) so they can store a particular word 

Root TrieNode is top with empty value having 26 links and the links are either null or point to another TrieNode
index mapping letter param - 'a' will get the specific index of the letter
*/

public class Trie {
  // Trie is implemented by a TrieNode class and has a root 

  private TrieNode root;

  public Trie() {
    root = new TrieNode(); // root is empty
  }

  private class TrieNode {
    private TrieNode[] children;
    private boolean isWord;

    public TrieNode() {
      this.children = new TrieNode[26]; // storing english words a --> z
      this.isWord = false;
    }
  }

  public void insert(String word) {

  }

  public boolean search(String word) {
    return false
  }

  public static void main(String[], args) {
  
  }

}