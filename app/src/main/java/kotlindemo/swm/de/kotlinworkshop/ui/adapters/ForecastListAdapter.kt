package kotlindemo.swm.de.kotlinworkshop.ui.adapters

import android.support.v7.widget.AppCompatAutoCompleteTextView
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView
import org.w3c.dom.Text

/**
 * Created by enriquelopezmanas on 01.02.18.
 */

class ForecastListAdapter(val items : List<String>) : RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {
    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = items[position]
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(TextView(parent.context))
    }


    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)
}