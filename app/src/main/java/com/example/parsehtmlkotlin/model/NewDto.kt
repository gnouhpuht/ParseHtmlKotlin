package com.example.parsehtmlkotlin.model

class NewDto {
    private var title: String = ""
    private var content: String = ""
    private var linkImg: String = ""
    private var linkDetail: String = ""


    constructor(title: String, content: String, linkImage: String, linkDetail: String) {
        this.title = title
        this.content = content
        this.linkImg = linkImage
        this.linkDetail = linkDetail
    }

    fun getTitle(): String {
        return title
    }

    fun setTitle(title: String) {
        this.title = title
    }

    fun getContent(): String {
        return content
    }

    fun setContent(content: String) {
        this.content = content
    }

    fun getLinkImage(): String {
        return linkImg
    }

    fun setLinkImage(linkImage: String) {
        this.linkImg = linkImage
    }

    fun getLinkDetail(): String {
        return linkDetail
    }

    fun setLinkDetail(linkDetail: String) {
        this.linkDetail = linkDetail
    }

}