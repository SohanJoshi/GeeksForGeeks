package com.thirtydayleetcoding.may2020.week2;

public class Trie {
    private class TrieNode {

        TrieNode[] children;
        boolean isWord;

        TrieNode() {
            children = new TrieNode[26];
        }

        public TrieNode[] getChildren() {
            return this.children;
        }

        public void setWord(boolean isWord) {
            this.isWord = isWord;
        }

        public boolean isWord() {
            return isWord;
        }
    }

    private final TrieNode head;

    /** Initialize your data structure here. */
    public Trie() {
        head = new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode node = head;
        for (char c : word.toCharArray()) {
            TrieNode[] map = node.getChildren();
            node = map[c - 'a'];
            if(node == null) {
                node = new TrieNode();
                map[c - 'a'] = node;
            }
        }
        node.setWord(true);
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node = head;
        for(char c : word.toCharArray()) {
            node = node.getChildren()[c - 'a'];
            if(node == null)
                return false;
        }
        return node.isWord();
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode node = head;
        for(char c : prefix.toCharArray()) {
            node = node.getChildren()[c - 'a'];
            if(node == null)
                return false;
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
