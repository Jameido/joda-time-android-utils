/*
 * Copyright 2017.  Luca Rossi
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 *
 */

package jodatimeutils.spikes.com.demo

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import org.joda.time.DateTime
import android.R.attr.name
import android.widget.TextView
import android.view.LayoutInflater
import org.joda.time.format.DateTimeFormat


/**
 * Created by Jameido on 08/10/2017.
 */
class DateFormatsAdapter(context: Context, objects: Array<out String>) :
        ArrayAdapter<String>(context, android.R.layout.simple_list_item_1, objects) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val reView : TextView = super.getView(position, convertView, parent) as TextView
        reView.text = DateTimeFormat.forPattern(getItem(position)).print(System.currentTimeMillis())
        return reView
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val reView : TextView = super.getDropDownView(position, convertView, parent) as TextView
        reView.text = DateTimeFormat.forPattern(getItem(position)).print(System.currentTimeMillis())
        return reView
    }
}