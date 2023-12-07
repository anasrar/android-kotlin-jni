package anasrin.kotlinjni

class Counter {
    init {
        System.loadLibrary("example-counter")
    }
    var value: Int = 0;

    external fun increment(): Int
    external fun decrement(): Int
}
