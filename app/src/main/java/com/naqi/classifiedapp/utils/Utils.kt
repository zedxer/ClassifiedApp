package com.naqi.classifiedapp.utils

import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*

object Utils {
    fun formatDate(dateInString: String): String {
        try{
            val dateToParse = SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S", Locale.US)
            val datedToFormat = SimpleDateFormat("dd-MM-yyyy 'at' HH:mm:ss", Locale.US)
            val newDate = dateToParse.parse(dateInString)
            return datedToFormat.format(newDate)
        }catch (e:Exception){
            e.printStackTrace()
        }
        return ""
    }

}