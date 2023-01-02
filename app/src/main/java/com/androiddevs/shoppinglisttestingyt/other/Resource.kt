package com.androiddevs.shoppinglisttestingyt.other

sealed class Resource<out T>(val status: Status, val data: T?, val message: String?) {
    class Success<out T>(data: T) : Resource<T>(Status.SUCCESS, data, null)
    class Error<out T>(message: String, data: T? = null) : Resource<T>(Status.ERROR, data, message)
    class Loading<out T>(data: T? = null) : Resource<T>(Status.LOADING, data, null)
}

enum class Status {
    SUCCESS,
    ERROR,
    LOADING
}
