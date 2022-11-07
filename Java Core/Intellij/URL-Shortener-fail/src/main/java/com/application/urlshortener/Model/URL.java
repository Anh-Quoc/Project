package com.application.urlshortener.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class URL {
    @Id
    private String Id;
    private String longURL;
    private String shortURL;
//    private Date creationDate = new Date();

    public URL() {
    }


    public String getId() {
        return this.Id;
    }

    public String getLongURL() {
        return this.longURL;
    }

    public String getShortURL() {
        return this.shortURL;
    }

//    public Date getCreationDate() {
//        return this.creationDate;
//    }


    public URL setLongURL(String longURL) {
        this.longURL = longURL;
        return this;
    }

    public URL setShortURL(String shortURL) {
        this.shortURL = shortURL;
        return this;
    }

//    public URL setCreationDate(Date creationDate) {
//        this.creationDate = creationDate;
//        return this;
//    }

//    public boolean equals(final Object o) {
//        if (o == this) return true;
//        if (!(o instanceof URL)) return false;
//        final URL other = (URL) o;
//        if (!other.canEqual((Object) this)) return false;
//        final Object this$Id = this.getId();
//        final Object other$Id = other.getId();
//        if (this$Id == null ? other$Id != null : !this$Id.equals(other$Id)) return false;
//        final Object this$longURL = this.getLongURL();
//        final Object other$longURL = other.getLongURL();
//        if (this$longURL == null ? other$longURL != null : !this$longURL.equals(other$longURL)) return false;
//        final Object this$shortURL = this.getShortURL();
//        final Object other$shortURL = other.getShortURL();
//        if (this$shortURL == null ? other$shortURL != null : !this$shortURL.equals(other$shortURL)) return false;
//        final Object this$creationDate = this.getCreationDate();
//        final Object other$creationDate = other.getCreationDate();
//        if (this$creationDate == null ? other$creationDate != null : !this$creationDate.equals(other$creationDate))
//            return false;
//        return true;
//    }

    protected boolean canEqual(final Object other) {
        return other instanceof URL;
    }

//    public int hashCode() {
//        final int PRIME = 59;
//        int result = 1;
//        final Object $Id = this.getId();
//        result = result * PRIME + ($Id == null ? 43 : $Id.hashCode());
//        final Object $longURL = this.getLongURL();
//        result = result * PRIME + ($longURL == null ? 43 : $longURL.hashCode());
//        final Object $shortURL = this.getShortURL();
//        result = result * PRIME + ($shortURL == null ? 43 : $shortURL.hashCode());
//        final Object $creationDate = this.getCreationDate();
//        result = result * PRIME + ($creationDate == null ? 43 : $creationDate.hashCode());
//        return result;
//    }
//
//    public String toString() {
//        return "URL(Id=" + this.getId() + ", longURL=" + this.getLongURL() + ", shortURL=" + this.getShortURL() + ", creationDate=" + this.getCreationDate() + ")";
//    }
}
