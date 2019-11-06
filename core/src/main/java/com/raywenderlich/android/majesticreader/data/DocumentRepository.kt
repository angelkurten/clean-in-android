package com.raywenderlich.android.majesticreader.data

import com.raywenderlich.android.majesticreader.domain.Document

class DocumentRepository(private val dataSource: DocumentDataSource, private val openDocumentDataSource: OpenDocumentDataSource) {

    suspend fun addDocument(document: Document) =  dataSource.add(document)

    suspend fun getDocuments() = dataSource.readAll()

    suspend fun removeDocument(document: Document) = dataSource.remove(document)

    fun getOpenDocument() = openDocumentDataSource.getOpenDocument()

    fun setOpenDocument(document: Document) = openDocumentDataSource.setOpenDocument(document)
}