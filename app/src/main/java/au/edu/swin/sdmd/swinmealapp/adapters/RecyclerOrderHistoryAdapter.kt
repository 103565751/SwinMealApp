package au.edu.swin.sdmd.swinmealapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import au.edu.swin.sdmd.swinmealapp.R
import au.edu.swin.sdmd.swinmealapp.datamodels.OrderHistoryItem

class RecyclerOrderHistoryAdapter(var context: Context, private var orderHistoryList: ArrayList<OrderHistoryItem>) :
    RecyclerView.Adapter<RecyclerOrderHistoryAdapter.ItemListViewHolder>() {

    // View holder class for holding view references
    class ItemListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val dateTV = itemView.findViewById<TextView>(R.id.order_history_item_date_tv)
        val orderIDTV = itemView.findViewById<TextView>(R.id.order_history_item_order_id_tv)
        val orderStatusTV = itemView.findViewById<TextView>(R.id.order_history_item_order_status_tv)
        val orderPaymentTV = itemView.findViewById<TextView>(R.id.order_history_item_order_payment_tv)
        val priceTV = itemView.findViewById<TextView>(R.id.order_history_item_price_tv)
    }

    // Create view holder for recycler view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemListViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.order_record_item, parent, false)
        return ItemListViewHolder(itemView)
    }

    // Bind data to view holder
    override fun onBindViewHolder(holder: ItemListViewHolder, position: Int) {

        val currentItem = orderHistoryList[position]

        holder.dateTV.text = currentItem.date
        holder.orderIDTV.text = currentItem.orderId
        holder.orderStatusTV.text = currentItem.orderStatus
        holder.orderPaymentTV.text = currentItem.orderPayment
        holder.priceTV.text = currentItem.price

    }

    override fun getItemCount(): Int = orderHistoryList.size

}