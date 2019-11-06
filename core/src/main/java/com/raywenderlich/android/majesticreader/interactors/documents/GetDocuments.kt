package com.raywenderlich.android.majesticreader.interactors.documents

import com.raywenderlich.android.majesticreader.data.DocumentRepository

class GetDocuments(private val documentRepository: DocumentRepository) {

    suspend operator fun invoke() = documentRepository.getDocuments()
}