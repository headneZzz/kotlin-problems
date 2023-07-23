package codewars.kyu5

import kotlin.math.ceil

class PaginationHelper<T>(val collection: List<T>, val itemsPerPage: Int) {

    /**
     * returns the number of items within the entire collection
     */
    val itemCount: Int
        get() {
            return collection.size
        }

    /**
     * returns the number of pages
     */
    val pageCount: Int
        get() {
            return ceil(collection.size.toDouble() / itemsPerPage).toInt()
        }


    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    fun pageItemCount(pageIndex: Int): Int {
        if (pageIndex < 0) {
            return -1
        }
        return when {
            pageIndex == pageCount - 1 -> {
                val remainder = collection.size % itemsPerPage
                if (remainder == 0) {
                    itemsPerPage
                } else {
                    remainder
                }
            }
            pageIndex < pageCount - 1 -> {
                itemsPerPage
            }
            else -> {
                -1
            }
        }
    }


    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    fun pageIndex(itemIndex: Int): Int {
        return if (itemIndex < 0 || itemIndex >= collection.size) {
            -1
        } else (itemIndex.toDouble() / itemsPerPage).toInt()
    }
}
