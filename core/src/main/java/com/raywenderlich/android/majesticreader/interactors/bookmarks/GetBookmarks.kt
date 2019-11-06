package com.raywenderlich.android.majesticreader.interactors.bookmarks

import com.raywenderlich.android.majesticreader.data.BookmarkRepository
import com.raywenderlich.android.majesticreader.domain.Document

class GetBookmarks(private val bookmarksRepository: BookmarkRepository) {

    suspend operator fun invoke(document: Document) = bookmarksRepository.getBookmark(document)
}