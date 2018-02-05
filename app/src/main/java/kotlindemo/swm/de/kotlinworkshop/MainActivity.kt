package kotlindemo.swm.de.kotlinworkshop

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlindemo.swm.de.kotlinworkshop.http.requests.ForecastRequest
import kotlindemo.swm.de.kotlinworkshop.ui.adapters.ForecastListAdapter
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.doAsync


class MainActivity : AppCompatActivity() {

    private val items = listOf(
            "Monday 22:00",
            "Tuesday 22:00",
            "Wednesday 22:00",
            "Thursday 22:00",
            "Friday 22:00")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        forecastList.layoutManager = LinearLayoutManager(this)
        forecastList.adapter = ForecastListAdapter(items)

        doAsync {
            val forecastRequest = ForecastRequest("80336")
            var result = forecastRequest.execute()
            result.toString()
        }
    }
}
