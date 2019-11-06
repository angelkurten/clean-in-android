package com.raywenderlich.android.majesticreader.framework

import com.raywenderlich.android.majesticreader.interactors.bookmarks.*
import com.raywenderlich.android.majesticreader.interactors.documents.*

data class Interactors(
        val addBookmark: AddBookmark,
        val getBookmarks: GetBookmarks,
        val deleteBookmarks: RemoveBookmark,
        val addDocument: AddDocument,
        val getDocuments: GetDocuments,
        val removeDocument: RemoveDocument,
        val getOpenDocument: GetOpenDocument,
        val setOpenDocument: SetOpenDocument
)