package com.piapps.flashcardpro.core.db.tables

import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id

/**
 * Created by abduaziz on 2019-09-27 at 21:37.
 */

@Entity
class SetDb(
    @Id(assignable = true)
    var id: Long,
    var parentId: Long = 0,
    var title: String = "",
    var count: Int = 0,
    var labels: String = "",
    var order: Long = 0,
    var lastStudyDuration: Long = 0,
    var color: String = "",
    var textColor: String? = "",
    var isTrash: Boolean = false,
    var isPinned: Boolean = false,
    var flags: Int = 0
) {
    constructor() : this(0)

    fun clone() = SetDb(id, parentId, title, count, labels, order, lastStudyDuration, color, textColor)

    fun setSomeFeature(set: SetDb) {
        set.flags = set.flags or 1
    }

    fun someFeature() = flags and 1 >= 1
    fun someOtherFeature() = flags and 2 >= 1
}