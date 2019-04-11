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


insertion to empty Trie 
root points to empty node 
insertion with word with no common prefix add a new brance with the inserted character mark last letter as end of word.
if common prefix at point where character differs create a new branch 
insertion with word already present just mark last letter as end of word
*/
import java.lang.IllegalArgumentException;
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
    if (word == null || word.isEmpty()) {
      throw new IllegalArgumentException("invalid input")
    }
    // make all letters in word lower case for matching the index
    word = word.toLowerCase();

    TrieNode current = root;

    for(int i = 0; i < word.length; i++) {
      char c = word.charAt(i);
      // will letter - 'a' will return the index 
      int index = c - 'a'
      if(current.children[index] == null) {
        TrieNode node = new TrieNode()
        // now current.children[index] points to the newly created node
        current.children[index] = node
        // traverse to the new node created so can move to the next letter 
        current = node
      }
      else {
        // if node already there just traverse current to it's child node to get to next letter
        current = current.children[index]
      }
    }
    // once loop through and reach end of word set boolean flag to true to mark end of word
    current.isWord = true
  }

  public boolean search(String word) {
    return false
  }

  public static void main(String[], args) {
    Trie trie = new Trie();
    trie.insert("cat");
    trie.insert("cab");
    trie.insert("son");
    trie.insert("so");
    System.out.println("Values inserted successfully !!!");
      }
  }