/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package proyecto01;

import java.util.Objects;

/**
 * 
 * @author Sandra Calatayud <scmct93 at gmail.com>
 */
public class Book {

    
    /* ATRIBUTOS */
    
    private String title_original;
    private String subtitle_original;
    private String author;
    private String country_original_publishing;
    private String date_original_publishing;
    private String original_languaje;
    private String series;
    private Integer num_series;
    private String sinopsis;
    private AUTHOR_GENRE genre;
    
    /* CONSTRUCTORES */

    public Book() {
    }

    public Book(String title_original, String subtitle, String author, String country_original_publishing, String date_original_publishing, String original_languaje, String series, Integer num_series, String sinopsis, AUTHOR_GENRE genre) {
        this.title_original = title_original;
        this.subtitle_original = subtitle;
        this.author = author;
        this.country_original_publishing = country_original_publishing;
        this.date_original_publishing = date_original_publishing;
        this.original_languaje = original_languaje;
        this.series = series;
        this.num_series = num_series;
        this.sinopsis = sinopsis;
        this.genre = genre;
    }

    
    
    /* GETTERS AND SETTERS */
    
    
    public String getTitle_original() {
        return this.title_original;
    }
    
    public void setTitle_original(String title_original) {
        this.title_original = title_original;
    }
    
    public String getSubtitle_original() {
        return this.subtitle_original;
    }
    
    public void setSubtitle_original(String subtitle_original) {
        this.subtitle_original = subtitle_original;
    }
    
    public String getAuthor() {
        return this.author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    

    public String getCountry_original_publishing() {
        return this.country_original_publishing;
    }
    
    
    public void setCountry_original_publishing(String country_original_publishing) {
        this.country_original_publishing = country_original_publishing;
    }
    
    
    public String getDate_original_publishing() {
        return this.date_original_publishing;
    }
    
   
    public void setDate_original_publishing(String date_original_publishing) {
        this.date_original_publishing = date_original_publishing;
    }
    
    public String getOriginal_languaje() {
        return this.original_languaje;
    }
    
    
    public void setOriginal_languaje(String original_languaje) {
        this.original_languaje = original_languaje;
    }
    
    
    public String getSeries() {
        return this.series;
    }
    
    
    public void setSeries(String series) {
        this.series = series;
    }
   
    public Integer getNum_series() {
        return this.num_series;
    }
    
    public void setNum_series(Integer num_series) {
        this.num_series = num_series;
    }
    
   
    public String getSinopsis() {
        return this.sinopsis;
    }
    
    
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public AUTHOR_GENRE getGenre() {
        return genre;
    }

    public void setGenre(AUTHOR_GENRE genre) {
        this.genre = genre;
    }
    
    
    
    /* HASHCODE Y EQUALS */

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.title_original);
        hash = 97 * hash + Objects.hashCode(this.subtitle_original);
        hash = 97 * hash + Objects.hashCode(this.author);
        hash = 97 * hash + Objects.hashCode(this.country_original_publishing);
        hash = 97 * hash + Objects.hashCode(this.date_original_publishing);
        hash = 97 * hash + Objects.hashCode(this.original_languaje);
        hash = 97 * hash + Objects.hashCode(this.series);
        hash = 97 * hash + Objects.hashCode(this.num_series);
        hash = 97 * hash + Objects.hashCode(this.sinopsis);
        hash = 97 * hash + Objects.hashCode(this.genre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (!Objects.equals(this.title_original, other.title_original)) {
            return false;
        }
        if (!Objects.equals(this.subtitle_original, other.subtitle_original)) {
            return false;
        }
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        if (!Objects.equals(this.country_original_publishing, other.country_original_publishing)) {
            return false;
        }
        if (!Objects.equals(this.date_original_publishing, other.date_original_publishing)) {
            return false;
        }
        if (!Objects.equals(this.original_languaje, other.original_languaje)) {
            return false;
        }
        if (!Objects.equals(this.series, other.series)) {
            return false;
        }
        if (!Objects.equals(this.sinopsis, other.sinopsis)) {
            return false;
        }
        if (!Objects.equals(this.num_series, other.num_series)) {
            return false;
        }
        if (this.genre != other.genre) {
            return false;
        }
        return true;
    }

    
    
    
    /* TO STRING */

    @Override
    public String toString() {
        return "Book{" + "title_original=" + title_original + ", subtitle=" + subtitle_original + ", author=" + author + ", country_original_publishing=" + country_original_publishing + ", date_original_publishing=" + date_original_publishing + ", original_languaje=" + original_languaje + ", series=" + series + ", num_series=" + num_series + ", sinopsis=" + sinopsis + ", genre=" + genre + '}';
    }

    
    
    
        
}
