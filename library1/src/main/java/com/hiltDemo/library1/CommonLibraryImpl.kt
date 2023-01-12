package com.hiltDemo.library1

import javax.inject.Inject

class CommonLibraryImpl @Inject constructor() {

  fun getCommonLibraryImplValue() = println("!!!!!!!!!!!!!!!!CommonLibraryImpl!!!!!!!!!!!!!!")
}