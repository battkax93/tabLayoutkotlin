package sunny.tablayout_kotlin


data class Answer(
        val items: List<Item>,
        val has_more: Boolean,
        val quota_max: Int,
        val quota_remaining: Int
) {

    data class Item(
            val owner: Owner,
            val is_accepted: Boolean,
            val score: Int,
            val last_activity_date: Int,
            val creation_date: Int,
            val answer_id: Int,
            val question_id: Int,
            val last_edit_date: Int
    ) {

        data class Owner(
                val reputation: Int,
                val user_id: Int,
                val user_type: String,
                val profile_image: String,
                val display_name: String,
                val link: String
        )
    }
}