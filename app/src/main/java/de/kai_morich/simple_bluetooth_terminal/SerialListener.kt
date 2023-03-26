package de.kai_morich.simple_bluetooth_terminal

import java.util.*

interface SerialListener {
    fun onSerialConnect()
    fun onSerialConnectError(e: Exception?)
    fun onSerialRead(data: ByteArray?) // socket -> service
    fun onSerialRead(datas: ArrayDeque<ByteArray?>?) // service -> UI thread
    fun onSerialIoError(e: Exception?)
}