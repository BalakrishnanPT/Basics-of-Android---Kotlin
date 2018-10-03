package beginner.sample.kotlinbasic

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_name.view.*

class MainActivity : AppCompatActivity() {
    private val names: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addNames()
        rv_name.layoutManager = LinearLayoutManager(this)
        rv_name.adapter = NameAdapter(names)
    }

    fun addNames() {
        names.add("dog")
        names.add("cat")
        names.add("owl")
        names.add("cheetah")
        names.add("raccoon")
        names.add("bird")
        names.add("snake")
        names.add("lizard")
        names.add("hamster")
        names.add("bear")
        names.add("lion")
        names.add("tiger")
        names.add("horse")
        names.add("frog")
        names.add("fish")
        names.add("shark")
        names.add("turtle")
        names.add("elephant")
        names.add("cow")
        names.add("beaver")
        names.add("bison")
        names.add("porcupine")
        names.add("rat")
        names.add("mouse")
        names.add("goose")
        names.add("deer")
        names.add("fox")
        names.add("moose")
        names.add("buffalo")
        names.add("monkey")
        names.add("penguin")
        names.add("parrot")
    }
}

class NameAdapter(private val items: ArrayList<String>) : RecyclerView.Adapter<NameAdapter.NameViewHolder>() {
    class NameViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tv_item = view.item_tv_name
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): NameViewHolder {
        return NameViewHolder(LayoutInflater.from(p0.context).inflate(R.layout.item_name, p0, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(p0: NameViewHolder, p1: Int) {
        p0.tv_item.text = items[p1]
    }

}

