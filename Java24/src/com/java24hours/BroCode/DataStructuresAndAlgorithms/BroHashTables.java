package com.java24hours.BroCode.DataStructuresAndAlgorithms;

import java.util.*;

public class BroHashTables {
    public static void main(String[] args) {
//        Hash Tables = A collection of Key Value Pairs
//                      Each pair is known as an entry
//                      Two pieces of data, key and value
//                          They can be any data value type
//
//                      Hashcode method will take a key as input, plug into formula, and spit out an integer
//                          this integer is known as a "hash"
//                          Integer hash codes in java is the number itself (100 = 100)

//                          We then take each hash and divide them by capacity and use the remainder as an index
//                              using modulus
//
//                          What if two values have the same hash? That is known as a collision
//                              Each of these storage locations is also known as a bucket
//                              We commonly turn each buckets into a linked-list as a solution
//                                  Continuing if there are more collisions
//                              Ideally we want each one to be in their own bucket
//                              This process is known as chaining

//                          The fewer collisions you have the more efficient the hash table will be

//        Bro Definition: Hashtable = A data structure that stores unique keys to values ex: <Integer, String>
//                                    Each key/value pair is known as an Entry
//                                    FAST insertion, look up, deletion of key/value pairs
//                                    Not ideal for small data sets, great with large data sets

//                        Hashing = takes a key and computes an integer (formula will vary based on key & data type)
//                                  In a Hash table, we use the hash % capacity to calculate an index number

//                                  key.hashCode() % capacity = index

//                        Bucket = an indexed storage location for one or more Entries
//                                 can store multiple Entries in case of collision (linked similarly a LinkedList)
//
//                        Collision = hash function generates the same index for more than one key
//                                    less collisions = more efficiency

//                        Runtime Complexity: Best Case O(1)
//                                            Worst Case O(n) (one giant linked-list)

//        State the Data types we are storing
        Hashtable<String, String> table = new Hashtable<>(21);

        table.put("100", "Spongebob");
        table.put("123", "Patrick");
        table.put("321", "Sandy");
        table.put("555", "Squidward");
        table.put("777", "Gary");

//        table.remove(777);

        for(String key : table.keySet()){

        System.out.println( key.hashCode() % 21 + "\t"+ key+ "\t" + table.get(key));
        }

    }
}
