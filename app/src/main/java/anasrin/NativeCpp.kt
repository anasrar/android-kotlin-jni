package anasrin.kotlinjni

class NativeCpp {
    init {
        System.loadLibrary("example-jni-cpp")
    }

    external fun getString(): String
}
