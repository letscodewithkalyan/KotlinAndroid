package com.example.kotlinandroid.kotlin.interview

import android.util.LruCache

object LRUCache{
    private const val MAX_SIZE = 4 // Define the maximum size of the cache
    private val lruCache: LruCache<String, Any> = object : LruCache<String, Any>(MAX_SIZE) {}
    fun <T> get(key: String): T? {
        return lruCache.get(key) as? T
    }

    fun <T> put(key: String, value: T) {
        lruCache.put(key, value)
    }

    fun remove(key: String) {
        lruCache.remove(key)
    }

    fun size(): Int {
        return lruCache.size()
    }

    fun maxSize(): Int {
        return lruCache.maxSize()
    }
}

fun main(){
    LRUCache.put("A", "1")
    LRUCache.put("A", "1")
    LRUCache.put("A", "1")
    LRUCache.put("A", "1")

}