package kotlindemo.swm.de.kotlinworkshop.http.requests

import com.google.gson.Gson
import kotlindemo.swm.de.kotlinworkshop.domain.model.ForecastResult
import java.net.URL

class Request(private val url : String) {

    fun run() {
        val forecastJsonString = URL(url).readText()
        println(forecastJsonString)
    }
}

class ForecastRequest(private val zipCode: String) {
    companion object {
        private val APP_ID = "e331db1b1623dc8042f9a908e1d3bbbd"
        private val URL_API = "http://samples.openweathermap.org/data/2.5/forecast/daily?"
        private val COMPLETE_URL = "$URL_API&appid=$APP_ID&zip="
    }

    fun execute() : ForecastResult {
        val forecastStringJsonString = URL(COMPLETE_URL + zipCode).readText()
        return Gson().fromJson(forecastStringJsonString, ForecastResult::class.java)
    }

}