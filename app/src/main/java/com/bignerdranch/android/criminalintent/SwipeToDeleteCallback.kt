package com.bignerdranch.android.criminalintent


import android.content.Context
import android.graphics.Canvas
import android.util.Log
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
//import it.xabaras.android.recyclerview.swipedecorator.RecyclerViewSwipeDecorator

private const val TAG = "SwipeToDeleteCallback"

abstract class SwipeToDeleteCallback(context: Context): ItemTouchHelper.SimpleCallback(
    0,
    ItemTouchHelper.LEFT)
{

    val backgroundColor = ContextCompat.getColor(context, R.color.purple_200)

    override fun onMove(
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder,
        target: RecyclerView.ViewHolder
    ): Boolean {
        TODO("Not yet implemented")

        Log.d(TAG, "onMove")
        return false

    }



    override fun onChildDraw(
        c: Canvas,
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder,
        dX: Float,
        dY: Float,
        actionState: Int,
        isCurrentlyActive: Boolean
    ) {
        Log.d(TAG, "onChildDraw")
//        RecyclerViewSwipeDecorator.Builder(
//            c,
//            recyclerView,
//            viewHolder,
//            dX,
//            dY,
//            actionState,
//            isCurrentlyActive
//        )
//            .addBackgroundColor(backgroundColor)
//            .addActionIcon(R.drawable.ic_delete)
//            .create()
//            .decorate()
        super.onChildDraw(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive)
    }
}